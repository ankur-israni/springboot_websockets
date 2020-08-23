package com.ankur.websockets.domain;

public class InventoryFindByIdResponse {

    private Item item;

    public InventoryFindByIdResponse(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }
}
