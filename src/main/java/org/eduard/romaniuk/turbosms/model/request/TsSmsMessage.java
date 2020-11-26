package org.eduard.romaniuk.turbosms.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public interface TsSmsMessage extends TsMessage {
    @JsonProperty("is_flash")
    boolean isFlash();
}