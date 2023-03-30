import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanOne = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(beanOne.getMessage());
        System.out.println(bean.equals(beanOne));


        ApplicationContext applicationContextOne = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat = (Cat) applicationContextOne.getBean("cat");
        Cat beanCatOne = (Cat) applicationContextOne.getBean("cat");
        System.out.println(beanCat.getString());
        System.out.println(beanCatOne.getString());
        System.out.println(beanCat.equals(beanCatOne));
    }

}