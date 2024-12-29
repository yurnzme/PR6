package com.loli.pr6y;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    // Виведення повідомлення через 5 секунд після запуску
    @Scheduled(initialDelay = 5000, fixedRate = Long.MAX_VALUE)
    public void printMessage() {
        System.out.println("5 секунд від запуску програми");
    }
}
