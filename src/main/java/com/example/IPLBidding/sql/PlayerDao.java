package com.example.IPLBidding.sql;

import com.example.IPLBidding.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class PlayerDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public boolean registerPlayer(Player player){
        String insert="insert into players(name,age,player_type,ig_followers,fb_followers,base_price,strike_rate,no_of_wickets,economy,is_sold,bidding_round,team_id) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        int result = jdbcTemplate.update(insert, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement) throws SQLException {
                preparedStatement.setString(1,player.getName());
                preparedStatement.setInt(2,player.getAge());
                preparedStatement.setString(3,player.getPlayer_type());
                preparedStatement.setInt(4,player.getIg_followers());
                preparedStatement.setInt(5,player.getFb_followers());
                preparedStatement.setInt(6,player.getBase_price());
                preparedStatement.setFloat(7,player.getStrike_rate());
                preparedStatement.setInt(8,player.getNo_of_wickets());
                preparedStatement.setFloat(9,player.getEconomy());
                preparedStatement.setBoolean(10,player.getIs_sold());
                preparedStatement.setInt(11,player.getBidding_round());
                preparedStatement.setInt(12,player.getTeam_id());
            }
        });
        if(result>0){
            return true;
        }
        return false;
    }
}
