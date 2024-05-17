package agh.optional;

import Demo.DemoEnum;
import Demo.DemoService;
import com.zeroc.Ice.Current;

import java.util.Optional;
import java.util.OptionalInt;

public class DemoServiceImpl implements DemoService {

    @Override
    public void intMethod(OptionalInt arg1, OptionalInt arg2, Current current) {
        System.out.println("Int method: " );
        arg1.ifPresentOrElse(
                demoEnum -> System.out.println("arg1: " + demoEnum),
                () -> System.out.println("arg1 is empty")
        );
        arg2.ifPresentOrElse(
                demoEnum -> System.out.println("arg2: " + demoEnum),
                () -> System.out.println("arg2 is empty")
        );
    }

    @Override
    public void stringMethod(Optional<String> arg1, Optional<String> arg2, Current current) {
        System.out.println("Enum method: " );
        arg1.ifPresentOrElse(
                demoEnum -> System.out.println("arg1: " + demoEnum),
                () -> System.out.println("arg1 is empty")
        );
        arg2.ifPresentOrElse(
                demoEnum -> System.out.println("arg2: " + demoEnum),
                () -> System.out.println("arg2 is empty")
        );
    }

    @Override
    public void enumMethod(Optional<DemoEnum> arg1, Optional<DemoEnum> arg2, Current current) {
        System.out.println("Enum method: " );
        arg1.ifPresentOrElse(
                demoEnum -> System.out.println("arg1: " + demoEnum),
                () -> System.out.println("arg1 is empty")
        );
        arg2.ifPresentOrElse(
                demoEnum -> System.out.println("arg2: " + demoEnum),
                () -> System.out.println("arg2 is empty")
        );
    }
}
