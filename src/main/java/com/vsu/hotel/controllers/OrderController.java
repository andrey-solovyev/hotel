package com.vsu.hotel.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class OrderController implements CommandLineRunner {
    private static Logger LOG = LoggerFactory
            .getLogger(OrderController.class);
    @Override
    public void run(String... args) throws Exception {
        System.out.println("RUUUUUUUUN");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        while (true){
            while (in.hasNext()){
                System.out.println(in.nextLine());
            }
        }
    }
}
