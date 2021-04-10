package io.github.eduardromanyuk.turbosms.model.request.builder;

import io.github.eduardromanyuk.turbosms.model.request.impl.TsMessageSendViberMessageImpl;

public class TsMessageSendHybridViberSettingsBuilder
        extends TsMessageSendViberAbstractBuilder<TsMessageSendHybridViberSettingsBuilder> {
    private final TsMessageSendHybridBuilder parentBuilder;

    TsMessageSendHybridViberSettingsBuilder(TsMessageSendViberMessageImpl message, TsMessageSendHybridBuilder parentBuilder) {
        super(message);
        this.parentBuilder = parentBuilder;
    }

    public TsMessageSendHybridBuilder build() {
        parentBuilder.setViber(message);
        return parentBuilder;
    }

    @Override
    protected TsMessageSendHybridViberSettingsBuilder getBuilder() {
        return this;
    }
}