package io.github.eduardromanyuk.turbosms.model.request.builder;

import io.github.eduardromanyuk.turbosms.model.request.TsFileAddDataRequest;
import io.github.eduardromanyuk.turbosms.model.request.TsFileAddUrlRequest;

public class TsFileAddRequestBuilder {
    public static TsFileAddUrlRequest url(String url) {
        return () -> url;
    }

    public static TsFileAddDataRequest data(String data) {
        return () -> data;
    }

    private TsFileAddRequestBuilder() {
    }
}
