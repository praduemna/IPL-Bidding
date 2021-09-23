package com.example.IPLBidding.model;

import lombok.Data;

@Data
public class Player {
    Integer player_id;
    String name;
    Integer age;
    String player_type;
    Integer ig_followers;
    Integer fb_followers;
    Integer base_price;
    Float strike_rate;
    Integer no_of_wickets;
    Float economy;
    Boolean is_sold;
    Integer bidding_round;
    Integer team_id;

}
