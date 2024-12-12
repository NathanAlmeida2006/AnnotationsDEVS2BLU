package exer01.app;

import exer01.annotations.Info;
import exer01.model.MyClass;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<?> clazz = MyClass.class;
        Annotation[] annotations = clazz.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof Info) {
                Info info = (Info) annotation;
                System.out.println("Autor: " + info.autor());
                System.out.println("Data: " + info.data());
            }
        }
    }
}
