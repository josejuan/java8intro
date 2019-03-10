package com.hiberus.messaging.java8db.public_.message.generated;

import com.hiberus.messaging.java8db.public_.message.Message;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.hiberus.messaging.java8db.public_.message.Message} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedMessageManager extends Manager<Message> {
    
    TableIdentifier<Message> IDENTIFIER = TableIdentifier.of("java8db", "public", "message");
    List<Field<Message>> FIELDS = unmodifiableList(asList(
        Message.ID,
        Message.VALUE
    ));
    
    @Override
    default Class<Message> getEntityClass() {
        return Message.class;
    }
}