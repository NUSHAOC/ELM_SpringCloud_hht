package com.shm.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MqReceiver {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),exchange = @Exchange("myExchange")
    ))
    public void process(Object message){
        log.info("myReceiver={}",message);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("computerOrder"),key = "computer",exchange = @Exchange("myOrder")
    ))
    public void processComputer(String message){
        log.info("computer MqReceiver={}",message);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("fruitOrder"),key = "fruit",exchange = @Exchange("myOrder")
    ))
    public void processFruit(String message){
        log.info("fruit MqReceiver={}",message);
    }
}
