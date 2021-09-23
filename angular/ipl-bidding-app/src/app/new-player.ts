import { Player } from "./player";

export interface NewPlayer {
  name: String
  age: number
  base_price: number
  player_type: string,
  ig_followers: number
  fb_followers: number
  strike_rate: number
  economy: number
  no_of_wickets: number
  is_sold: boolean
  bidding_round: number
  team_id: number
}
