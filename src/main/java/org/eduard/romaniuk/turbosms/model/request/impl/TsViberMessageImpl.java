package org.eduard.romaniuk.turbosms.model.request.impl;

import lombok.Getter;
import lombok.ToString;
import org.eduard.romaniuk.turbosms.model.request.TsViberMessage;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@ToString
class TsViberMessageImpl implements TsViberMessage {
    private List<String> recipients;
    private String sender;
    private String text;
    private LocalDateTime startTime;
    private Integer ttl;
    private String imageUrl;
    private String caption;
    private String action;
    private Boolean countClicks;
    private Boolean transactional;

    public TsViberMessageImpl(String sender) {
        this.sender = sender;
    }

    public TsViberMessageImpl() {}

    void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    void setText(String text) {
        this.text = text;
    }

    void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    void setTtl(int ttl) {
        this.ttl = ttl;
    }

    void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    void setCaption(String caption) {
        this.caption = caption;
    }

    void setAction(String action) {
        this.action = action;
    }

    void setCountClicks(boolean countClicks) {
        this.countClicks = countClicks;
    }

    void setTransactional(boolean transactional) {
        this.transactional = transactional;
    }

}
