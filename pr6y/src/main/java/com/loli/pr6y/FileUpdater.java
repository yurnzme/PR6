package com.loli.pr6y;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@Component
public class FileUpdater {

    private int counter = 0;

    // Оновлення файлу кожні 10 секунд
    @Scheduled(fixedRate = 10000)
    public void updateFile() {
        counter += 5;
        try (FileWriter writer = new FileWriter("counter.txt", true)) {
            writer.write("Counter value: " + counter + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
