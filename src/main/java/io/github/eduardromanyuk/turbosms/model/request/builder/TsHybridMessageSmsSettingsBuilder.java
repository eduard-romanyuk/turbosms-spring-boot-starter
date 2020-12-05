package io.github.eduardromanyuk.turbosms.model.request.builder;

import io.github.eduardromanyuk.turbosms.model.request.impl.TsSmsMessageImpl;

public class TsHybridMessageSmsSettingsBuilder extends TsSmsMessageAbstractBuilder<TsHybridMessageSmsSettingsBuilder> {
    private final TsHybridMessageBuilder parentBuilder;

    TsHybridMessageSmsSettingsBuilder(TsSmsMessageImpl message, TsHybridMessageBuilder parentBuilder) {
        super(message);
        this.parentBuilder = parentBuilder;
    }

    public TsHybridMessageBuilder build() {
        parentBuilder.setSms(message);
        return parentBuilder;
    }

    @Override
    protected TsHybridMessageSmsSettingsBuilder getBuilder() {
        return this;
    }
}