import { Component, OnInit } from '@angular/core';
import { Player } from '../player';
import { NewPlayer } from '../new-player';
import { HttpService } from '../http.service';



@Component({
  selector: 'app-register-player',
  templateUrl: './register-player.component.html',
  styleUrls: ['./register-player.component.css']
})
export class RegisterPlayerComponent implements OnInit {

  player_name: String = ""
  player_age: number = 0


  player_type: Player[] = [
    {id: 1, type: "Batsman"},
    {id:2, type:"Bowler"},
    {id:3, type:"All Rounder"}
  ]
  selected_player_type: Player

  player_followers: number = 0
  player_base_price: number = 0
  player_wickets: number = 0;
  player_strike_rate: number = 0
  player_economy: number = 0
  new_player: NewPlayer = {
    name: "",
    age: 0,
    base_price: 0,
    bidding_round: 0,
    economy: 0,
    fb_followers: 0,
    ig_followers: 0,
    is_sold: false,
    no_of_wickets:0,
    player_type: "",
    strike_rate: 0,
    team_id:0
  }


  constructor(
    private httpService: HttpService
  ) {
    this.selected_player_type = this.player_type[0]
  }

  ngOnInit(): void {
  }

  registerPlayer():void{
    this.new_player = {
      name: this.player_name,
      age: this.player_age,
      base_price: this.player_base_price,
      bidding_round: 0,
      economy: this.player_economy,
      fb_followers: this.player_followers,
      ig_followers: this.player_followers,
      is_sold: false,
      no_of_wickets: this.player_wickets,
      strike_rate: this.player_strike_rate,
      player_type: this.selected_player_type.type,
      team_id: 0
    }
    this.httpService.registerPlayerService(this.new_player)
         .subscribe(error=>console.log(error));

  }

}
