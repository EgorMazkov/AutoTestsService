package utils;

import models.CardDbModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class CardRowMapper {

    public CardDbModel mapToCard(ResultSet rs) throws SQLException {
        return CardDbModel.builder()
                .cardId(rs.getObject("card_id", UUID.class))
                .productId(rs.getObject("product_id", UUID.class))
                .statusCard(rs.getString("status_card"))
                .userProfileId(rs.getObject("user_profile_id", UUID.class))
                .accountId(rs.getObject("account_id", UUID.class))
                .isMain(rs.getBoolean("is_main"))
                .numberCard(rs.getString("number_card"))
                .pinBlock(rs.getString("pin_block"))
                .dateValidFrom(
                        rs.getDate("date_valid_from") != null ? rs.getDate("date_valid_from").toLocalDate() : null)
                .dateExpire(rs.getDate("date_expire") != null ? rs.getDate("date_expire").toLocalDate() : null)
                .limitPerMonth(rs.getObject("limit_per_month") != null ? rs.getInt("limit_per_month") : null)
                .paymentSystem(rs.getString("payment_system"))
                .build();
    }
}