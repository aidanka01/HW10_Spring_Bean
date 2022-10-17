package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("Hello world");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("Hello world");
        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());
        System.out.println(bean1.equals(bean2));
        System.out.println(bean1.hashCode());
        System.out.println(bean2.hashCode());


        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
    }
}
