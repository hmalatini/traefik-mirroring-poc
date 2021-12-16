package com.example.demo;

import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${time-sleep}")
    private int sleep;

    @GetMapping("test")
    public String health() {
        try {
            System.out.println("Sleeping " + sleep + " seconds.");
            TimeUnit.SECONDS.sleep(sleep);
            System.out.println("Finishing " + sleep + " seconds.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "healthy";
    }
}
