package agh.student;

import agh.student.MyService.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {
    private List<Book> books = new ArrayList<>();

    public MyServiceImpl() {
        books.add(Book.newBuilder().setTitle("Harry Potter").setDescription("Good book wizards and so on").setReview(4.5F).build());
        books.add(Book.newBuilder().setTitle("Lord of the Rings").setDescription("Good book about hobbits").setReview(4.7F).build());
        books.add(Book.newBuilder().setTitle("The Witcher").setDescription("Good book about Geralt").setReview(4.8F).build());
        books.add(Book.newBuilder().setTitle("The Hobbit").setDescription("Good book about Bilbo").setReview(4.6F).build());
    }

    @Override
    public void getBooks(BookRequest request, StreamObserver<BookList> responseObserver) {
        BookList.Builder response = BookList.newBuilder();
        for (Book book : books) {
            if (book.getTitle().equals(request.getTitle())) {
                response.addBooks(book);
            }
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void addBook(Book request, StreamObserver<ServiceResponse> responseObserver) {
        books.add(request);
        responseObserver.onNext(ServiceResponse.newBuilder().setData("Book added").build());
        responseObserver.onCompleted();
    }

    @Override
    public void getAllBooks(Empty request, StreamObserver<BookList> responseObserver) {
        BookList.Builder response = BookList.newBuilder();
        for (Book book : books) {
            response.addBooks(book);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
