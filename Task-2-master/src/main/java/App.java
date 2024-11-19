import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat cat1 = (Cat) applicationContext.getBean("catBean");
        System.out.println(cat1.getName());

        Cat cat2 = (Cat) applicationContext.getBean("catBean");
        System.out.println(cat2.getName());

        System.out.println("Переменные ссылаются на один и тот же объект? " +
                (cat1==cat2));
        System.out.println("Переменные ссылаются на один и тот же объект? " +
                (bean==bean2));
    }
}