package app;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<ArrayUtils> clazz = ArrayUtils.class;

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodInfo.class) && method.isAnnotationPresent(Author.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                Author author = method.getAnnotation(Author.class);

                System.out.println("=====================================");
                System.out.println("Method: " + methodInfo.name());
                System.out.println("Return Type: " + methodInfo.returnType());
                System.out.println("Description: " + methodInfo.description());
                System.out.println("Author: " + author.firstName() + " " + author.lastName());
                System.out.println("=====================================");
            }
        }
    }
}
