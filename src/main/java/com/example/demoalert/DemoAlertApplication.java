package com.example.demoalert;

import io.micrometer.core.instrument.Counter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class DemoAlertApplication implements CommandLineRunner {

    private final Counter counter;

    public static void main(String[] args) {
        SpringApplication.run(DemoAlertApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        int i = 0;
        while (true) {
            Thread.sleep(100);
            counter.increment();
            System.out.println("count: " + i++);
        }

    }
}
