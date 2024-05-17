#ifndef DEMO_ICE
#define DEMO_ICE

module Demo {
    enum DemoEnum {
        UNKNOWN,
        FOO,
        BAR
    }
    interface DemoService {
        void intMethod(optional(0) int arg1, optional(1) int arg2);
        void stringMethod(optional(0) string arg1, optional(1) string arg2);
        void enumMethod(optional(0) DemoEnum arg1, optional(1) DemoEnum arg2);
    }
}

#endif