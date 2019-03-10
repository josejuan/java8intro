package com.hiberus.tutorials.java8.streams;

import com.hiberus.messaging.MessagingApplicationBuilder;
import com.hiberus.messaging.java8db.public_.message.Message;
import com.hiberus.messaging.java8db.public_.message.MessageManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.Stream;

@RestController
public class Controller {

    private static final MessageManager mm = new MessagingApplicationBuilder().build().getOrThrow(MessageManager.class);

    @RequestMapping("/messages")
    public Stream<Message> messages() {
        return mm.stream().peek(mkProgress()).peek(m -> m.setValue(m.getValue().toLowerCase()));
    }

    private static <A> Consumer<A> mkProgress() {
        final AtomicInteger c = new AtomicInteger(0);
        return ignore -> System.out.printf("\rrow %d", c.incrementAndGet());
    }

}
