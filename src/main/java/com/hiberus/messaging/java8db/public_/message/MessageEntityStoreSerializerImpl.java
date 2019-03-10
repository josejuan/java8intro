package com.hiberus.messaging.java8db.public_.message;

import com.hiberus.messaging.java8db.public_.message.generated.GeneratedMessageEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named message.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author Hiberus
 */
public final class MessageEntityStoreSerializerImpl extends GeneratedMessageEntityStoreSerializerImpl {
    
    public MessageEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}