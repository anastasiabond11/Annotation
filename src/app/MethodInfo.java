package app;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MethodInfo {
    String name();
    String returnType();
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String firstName();
    String lastName();
}