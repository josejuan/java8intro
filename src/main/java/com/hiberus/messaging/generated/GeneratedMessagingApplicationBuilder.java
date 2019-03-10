package com.hiberus.messaging.generated;

import com.hiberus.messaging.MessagingApplication;
import com.hiberus.messaging.MessagingApplicationBuilder;
import com.hiberus.messaging.MessagingApplicationImpl;
import com.hiberus.messaging.MessagingCacheReloader;
import com.hiberus.messaging.java8db.public_.message.MessageManagerImpl;
import com.hiberus.messaging.java8db.public_.message.MessageSqlAdapter;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.Injector;
import com.speedment.runtime.application.AbstractApplicationBuilder;

/**
 * A generated base {@link
 * com.speedment.runtime.application.AbstractApplicationBuilder} class for the
 * {@link com.speedment.runtime.config.Project} named public.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMessagingApplicationBuilder extends AbstractApplicationBuilder<MessagingApplication, MessagingApplicationBuilder> {
    
    protected GeneratedMessagingApplicationBuilder() {
        super(MessagingApplicationImpl.class, GeneratedMessagingMetadata.class);
        withManager(MessageManagerImpl.class);
        withComponent(MessageSqlAdapter.class);
        withComponent(MessagingCacheReloader.class);
    }
    
    @Override
    public MessagingApplication build(Injector injector) {
        return injector.getOrThrow(MessagingApplication.class);
    }
}