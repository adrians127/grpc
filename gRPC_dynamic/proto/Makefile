PROTO_DIR := .
GEN_DIR := $(PROTO_DIR)/../dynamicServer/src/main/java
PROTOC := protoc
PROTOC_GEN_GRPC_JAVA := protoc-gen-grpc-java-1.62.2-osx-aarch_64.exe

.PHONY: all clean

all: java

java:
    $(PROTOC) -I$(PROTO_DIR) --java_out=$(GEN_DIR) \
        --plugin=protoc-gen-grpc-java=$(PROTOC_GEN_GRPC_JAVA) \
        --grpc-java_out=$(GEN_DIR) $(PROTO_DIR)/service.proto


clean:
    rm -rf $(GEN_DIR)

protoc -I. --java_out=../dynamicServer/src/main/java --plugin=protoc-gen-grpc-java=protoc-gen-grpc-java-1.62.2-osx-aarch_64.exe --grpc-java_out=../dynamicServer/src/main/java service.proto
protoc -I. --java_out=../dynamicServer/src/main/java --plugin=protoc-gen-grpc-java=protoc-gen-grpc-java-1.63.0-osx-aarch_64.exe --grpc-java_out=../dynamicServer/src/main/java service.proto