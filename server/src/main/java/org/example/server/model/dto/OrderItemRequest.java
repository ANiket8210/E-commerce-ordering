package org.example.server.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {
}
