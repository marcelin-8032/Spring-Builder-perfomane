package com.springbuilder.performance;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PerformanceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PerformanceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        long startTime = System.nanoTime();
        int n = 3;
        System.out.println("---------------------String-------------------------------");
        for (int i = 1; i <= Math.pow(n, n); i++) {
            for (int j = 1; j <= Math.pow(n, n); j++) {
                System.out.println(i + j + " ");
            }
            System.out.println();
        }

     /*  System.out.println("---------------------StringBuilder-------------------------------");
       StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= Math.pow(n, n); i++) {
            for (int j = 1; j <= Math.pow(n, n); j++) {
                stringBuilder.append(i + j).append(" ");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);*/

        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}
