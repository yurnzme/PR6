package com.loli.pr6y;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Pr6yApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(Pr6yApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Запускаємо всі задачі
        System.out.println("Програма запущена.");
        while (true) {
            Thread.sleep(1000); // Програма буде "спати" 1 секунду і чекати подальші завдання
        }
    }
}
