package org.eduard.romaniuk.turbosms.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TurboSmsResponse {
    private int response_code;
    private String response_status;
    private List<TurboSmsResponseResult> response_result;
}