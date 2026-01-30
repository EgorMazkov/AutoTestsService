package dao;

import models.CardDbModel;
import utils.CardRowMapper;
import utils.DataBaseUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;


public class CardDao {
    public CardRowMapper cardRowMapper = new CardRowMapper();
    public static final String SELECT_CARD_BY_ID = "SELECT * FROM cards WHERE card_id = ?";
    public void findById() {
        String uuidCard = "00a1ca59-84d0-4641-81a3-5d397541ef61";
        try {
            Connection connection = DataBaseUtils.connectToPostgres("/card_service_db");
            PreparedStatement statement = connection.prepareStatement(SELECT_CARD_BY_ID);
            statement.setObject(1, UUID.fromString(uuidCard));
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            CardDbModel cardDbModel = cardRowMapper.mapToCard(resultSet);
            System.out.println(cardDbModel.cardId());
        } catch (SQLException e) {
            throw new RuntimeException("Данной БД нет",e);
        }

    }

}
