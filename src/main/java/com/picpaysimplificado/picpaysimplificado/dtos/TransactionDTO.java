package com.picpaysimplificado.picpaysimplificado.dtos;

import java.math.BigDecimal;

public record TransactionsDTO(BigDecimal value , Long sanderId , Long receiverId) {
}
