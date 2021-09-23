package com.example.IPLBidding.sql;

import com.example.IPLBidding.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class TeamDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public boolean registerTeam(Team team){
        String insert="insert into teams(team_owner,team_name) values(?,?)";
        int result=jdbcTemplate.update(insert, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement) throws SQLException {
                preparedStatement.setString(1,team.getTeam_owner());
                preparedStatement.setString(2,team.getTeam_name());
            }
        });
        if(result>0){
            return true;
        }
        return false;
    }
}
