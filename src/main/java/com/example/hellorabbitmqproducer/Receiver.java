package com.example.hellorabbitmqproducer;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Getter
@Component
public class Receiver {
    private final CountDownLatch latch =  new CountDownLatch(1);
     public  void receiveMessage(Object message){
         System.out.println("Received <" + message + ">");
         latch.countDown();

     }
}
