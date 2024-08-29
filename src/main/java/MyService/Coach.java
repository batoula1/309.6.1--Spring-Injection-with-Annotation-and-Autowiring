package com.example.demo.MyService;


public class Coach {

    import org.springframework.stereotype.Service;

    @Service
    public interface Coach {
        public String getDailyWorkout();

        public String getDailyFortune();

    }
}
