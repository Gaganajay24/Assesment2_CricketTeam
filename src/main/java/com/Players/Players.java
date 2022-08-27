package com.Players;

public class Players {

    private int id;
    private String name;
    private int matches_played;
    private int total_runs;
    private int wickets_taken;
    private int out_on_zero_score;
    private String player_type;

    public Players(int id, String name, int matches_played, int total_runs, int wickets_taken, int out_on_zero_score, String player_type) {
        this.id = id;
        this.name = name;
        this.matches_played = matches_played;
        this.total_runs = total_runs;
        this.wickets_taken = wickets_taken;
        this.out_on_zero_score = out_on_zero_score;
        this.player_type = player_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatches_played() {
        return matches_played;
    }

    public void setMatches_played(int matches_played) {
        this.matches_played = matches_played;
    }

    public int getTotal_runs() {
        return total_runs;
    }

    public void setTotal_runs(int total_runs) {
        this.total_runs = total_runs;
    }

    public int getWickets_taken() {
        return wickets_taken;
    }

    public void setWickets_taken(int wickets_taken) {
        this.wickets_taken = wickets_taken;
    }

    public int getOut_on_zero_score() {
        return out_on_zero_score;
    }

    public void setOut_on_zero_score(int out_on_zero_score) {
        this.out_on_zero_score = out_on_zero_score;
    }

    public String getPlayer_type() {
        return player_type;
    }

    public void setPlayer_type(String player_type) {
        this.player_type = player_type;
    }
}
