package io.flowing.retail.kafka.order.flow.payload;

public class PaymentReceivedEventPayload {
    private String refId;

    public String getRefId() {
        return refId;
    }

    public PaymentReceivedEventPayload setRefId(String refId) {
        this.refId = refId;
        return this;
    }
}
