package com.ankur.websockets.domain;

public class InventoryUpdateItemResponse {

    private Status status;



    public InventoryUpdateItemResponse() {
    }

    public InventoryUpdateItemResponse(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
