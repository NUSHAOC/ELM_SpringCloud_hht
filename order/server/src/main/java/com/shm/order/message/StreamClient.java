package com.shm.order.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;


public interface StreamClient {

    String Input = "myInput";
    String Output = "myOutput";
    @Input(StreamClient.Input)
    SubscribableChannel input();

    @Output(StreamClient.Output)
    MessageChannel output();

}
