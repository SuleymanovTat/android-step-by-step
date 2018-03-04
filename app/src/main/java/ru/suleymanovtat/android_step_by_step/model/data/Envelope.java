package ru.suleymanovtat.android_step_by_step.model.data;

/**
 * Created by suleymanovtat on 04.03.2018.
 */

public class Envelope<T> {
    Meta meta = new Meta();
    T response;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }
}
