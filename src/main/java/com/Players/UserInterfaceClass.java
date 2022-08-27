package com.Players;

import java.util.*;

class ScoreComparator implements Comparator<Players>{
    public int compare(Players o1,Players o2){
        return ((o1.getTotal_runs()/o1.getMatches_played())-(o2.getTotal_runs()/o2.getMatches_played()));
    }
}


class NameComparator implements Comparator<Players>{
    public int compare(Players o1,Players o2){
        return o1.getName().compareTo(o2.getName());
    }
}
public class UserInterfaceClass {
    static List<Players> players=new ArrayList<Players>();
    static List<Players> pf=new ArrayList<>();
    Map<Integer,Float> comp_players=new HashMap<>();



    static UserInterfaceClass ui=new UserInterfaceClass();
    public static void main(String[] args) {

        Players p1=new Players(100,"akash",50,4000,0,8,"batsman");
        Players p2=new Players(101,"abhi",67,4020,50,8,"bowler");
        Players p3=new Players(102,"appu",45,5000,0,8,"batsman");
        Players p4=new Players(103,"asam",78,6000,0,8,"batsman");
        Players p5=new Players(104,"ram",89,4000,0,8,"batsman");
        Players p6=new Players(105,"ashish",34,2000,0,8,"wicketKeeper");
        Players p7=new Players(106,"ajay",80,5000,60,8,"bowler");
        Players p8=new Players(107,"jay",50,6000,0,8,"batsman");
        Players p9=new Players(108,"suprith",77,4500,0,8,"batsman");
        Players p10=new Players(109,"shankar",23,2000,0,8,"batsman");
        Players p11=new Players(110,"nisar",67,2080,0,8,"batsman");
        Players p12=new Players(111,"abhishek",89,3000,90,8,"bowler");
        Players p13=new Players(112,"bhuvan",60,4000,0,8,"WicketKeeper");
        Players p14=new Players(113,"chandan",40,1900,0,8,"batsman");
        Players p15=new Players(114,"dhanush",90,5000,0,8,"batsman");
        Players p16=new Players(115,"emran",70,4050,10,8,"bowler");
        Players p17=new Players(116,"fizan",20,4000,0,8,"batsman");
        Players p18=new Players(117,"ganguly",54,6000,30,8,"bowler");
        Players p19=new Players(118,"harish",56,7000,0,8,"batsman");
        Players p20=new Players(119,"karthik",58,3000,0,8,"batsman");

        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);
        players.add(p7);
        players.add(p8);
        players.add(p9);
        players.add(p10);
        players.add(p11);
        players.add(p12);
        players.add(p13);
        players.add(p14);
        players.add(p15);
        players.add(p16);
        players.add(p17);
        players.add(p18);
        players.add(p19);
        players.add(p20);



        ui.initial_condition();

        boolean status=true;
        while(status){
            System.out.println("Welcome\nChoose one of the options\n1.Display all players\n2.Update Player Information\n3.Display Final Team\n4.Add player Information\n5.exit\n");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choice){
                case 1:  ui.display();
                            break;

                case 2 : try{
                    ui.update_by_name();
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
                            break;
                case 3: ui.displayFinal();
                            break;
                case 4 : ui.add_player_info();
                            break;
                case 5 : status=false;
                    System.exit(0);

            }
        }
    }

    public void update_by_name() throws  PlayerException{


        System.out.print("Enter the name : ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();

        int i=0;
        for(Players p:players){
            i++;
            if(p.getName().equals(name)){
                details( p);

            }

        }
        if(i==players.size()){
            PlayerException pe=new PlayerException("Player not found");
            throw(pe);
        }

    }

    public void details(Players pl){

        System.out.println("Enter id : ");
        Scanner sc=new Scanner(System.in);
        pl.setId(sc.nextInt());
        System.out.println("Enter number of matches played : ");
        pl.setMatches_played(sc.nextInt());
        System.out.println("Enter total number of runs scored : ");
        pl.setTotal_runs(sc.nextInt());
        System.out.println("Enter number of wickets taken");
        pl.setWickets_taken(sc.nextInt());
        System.out.println("Enter number of out at zero : ");
        pl.setOut_on_zero_score(sc.nextInt());
        System.out.println("Enter player type 1. Batsman 2.Bowler 3.WicketKeeper");
        pl.setPlayer_type(sc.next());


    }

    public void display(){

        Collections.sort(players,new NameComparator());
        System.out.println("Id : "+"\tname : "+"\tMatches played : "+"\ttotal_runs : "+"\twickets_taken"+"\tno of out on zero  : "+"\tPlayer_type : ");
        for(Players p:players){
            System.out.println(p.getId()+"\t\t"+p.getName()+"\t\t\t"+p.getMatches_played()+"\t\t\t\t"+p.getTotal_runs()+"\t\t\t\t"+p.getWickets_taken()+"\t\t\t\t\t"+p.getOut_on_zero_score()+"\t\t\t\t\t"+p.getPlayer_type());

        }
    }

    public void displayFinal(){
        player_selection();
        Collections.sort(pf,new NameComparator());
        System.out.println("Id : "+"\tname : "+"\tMatches played : "+"\ttotal_runs : "+"\twickets_taken"+"\tno of out on zero  : "+"\tPlayer_type : ");
        for(Players p:pf){
            System.out.println(p.getId()+"\t\t"+p.getName()+"\t\t\t"+p.getMatches_played()+"\t\t\t\t"+p.getTotal_runs()+"\t\t\t\t"+p.getWickets_taken()+"\t\t\t\t\t"+p.getOut_on_zero_score()+"\t\t\t\t\t"+p.getPlayer_type());

        }
    }

    public void add_player_info(){


        System.out.println("Enter the name : ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Enter id : ");
        int id=sc.nextInt();
        System.out.println("Enter number of matches played : ");
        int matches_played=sc.nextInt();
        System.out.println("Enter total number of runs scored : ");
        int runs_scored=sc.nextInt();
        System.out.println("Enter number of wickets taken");
        int wickets_taken=sc.nextInt();
        System.out.println("Enter number of out at zero : ");
        int out_on_zero=sc.nextInt();
        System.out.println("Enter player type 1. Batsman 2.Bowler 3.WicketKeeper");
        String type=sc.next();

        Players p=new Players(id,name,matches_played,runs_scored,wickets_taken,out_on_zero,type);
        players.add(p);


    }


    public void player_selection() {


        int i=0;
        Collections.sort(players,new ScoreComparator());
        Collections.reverse(players);
        boolean wicket=false;

            for(Players p:players){
                if(p.getPlayer_type().equalsIgnoreCase("Bowler")){
                    i++;
                    pf.add(p);
                    if(i==11)
                        break;

                }
            }

            if(i<11) {
                for (Players p : players) {
                    if (p.getPlayer_type().equalsIgnoreCase("Batsman") || (p.getPlayer_type().equalsIgnoreCase("WicketKeeper"))) {
                        if (p.getPlayer_type().equalsIgnoreCase("WicketKeeper")) {
                            if (wicket == false) {
                                wicket = true;
                                pf.add(p);
                                i++;
                            }
                        } else {
                            pf.add(p);
                            i++;
                        }
                        if (i == 11)
                            break;
                    }
                }
            }

    }

    public void initial_condition(){

        if(players.size()>=20){
            int bowler=ui.bowlerCondition();
            int wicketKeeper=ui.wicketCondition();
            if(bowler<3&&wicketKeeper<1){
                ui.add_player_info();
                ui.initial_condition();
            }
        }
        else{
            ui.add_player_info();
        }
    }

    public int bowlerCondition(){
        int bowler=0;
            for(Players p:players){
                if(p.getPlayer_type().equalsIgnoreCase("bowler")){
                    bowler++;
                }

            }
            return bowler;
    }
    public int  wicketCondition(){

       int wicketKeeper=0;
            for(Players p:players){

                if(p.getPlayer_type().equalsIgnoreCase("wicketKeeper")){
                    wicketKeeper++;
                }
            }
            return wicketKeeper;
    }
}
