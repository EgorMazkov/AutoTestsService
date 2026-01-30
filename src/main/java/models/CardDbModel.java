package models;

import lombok.Builder;

import java.time.LocalDate;
import java.util.UUID;

@Builder
public record CardDbModel(UUID cardId,
                          UUID productId,
                          String statusCard,
                          UUID userProfileId,
                          UUID accountId,
                          Boolean isMain,
                          String numberCard,
                          String pinBlock,
                          LocalDate dateValidFrom,
                          LocalDate dateExpire,
                          Integer limitPerMonth,
                          String paymentSystem) {

}
