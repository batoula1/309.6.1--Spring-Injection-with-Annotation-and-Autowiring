package MyService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"myServices"})

// Note: in above line, "myServices" is a package name
public class DemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(DemoApplication.class, args);

        // get the bean from spring container
        Coach theCoach = context.getBean(Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}