package com.seerbit.transactionstats.commons;

import com.seerbit.transactionstats.entities.Transaction;
import com.seerbit.transactionstats.models.CreateTransactionRequest;
import com.seerbit.transactionstats.models.StatisticsResponse;
import java.math.BigDecimal;

public class Mocker {

  public static CreateTransactionRequest getRequest(String type) {
    switch (type) {
      case "WITH_TIMESTAMP":
      default:
        return CreateTransactionRequest
          .builder()
          .amount("12.33")
          .timestamp("2018-07-17T09:59:51.312Z")
          .build();
    }
  }

  public static Transaction getTransaction() {
    return Transaction
      .builder()
      .amount(new BigDecimal("12.33"))
      .timestamp("2018-07-17T09:59:51.312Z")
      .build();
  }

  public static StatisticsResponse getStatistics() {
    return StatisticsResponse
      .builder()
      .avg("12.33")
      .sum("12.33")
      .max("12.33")
      .min("12.33")
      .count(1)
      .build();
  }
}
