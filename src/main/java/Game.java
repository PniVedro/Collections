import java.util.ArrayList;

public class Game {
    Player player = new Player();
    ArrayList<String> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player.getName());
    }
    public int findByName (String name){
        for (int i = 0; i < players.size(); i++) {
            if (name.contains(players.get(i))) {
                players.get(i)
            }
    }

    public void round (String playerName1, String playerName2) {


//        for (int i = 0; i < players.size(); i++) {
//            if (playerName1.contains(players.get(i))) {
//                playerName1 = players.get(i);
//                int t = player.getStrength();
//                break;
//            }
//
//
//        }
//        for (int i = 0; i < players.size(); i++) {
//            if (playerName2.contains(players.get(i))) {
//                playerName2 = players.get(i);
//                int b = player.getStrength();
//                break;
//            }
//
//
//        }
//
//        System.out.println(a.compareTo(b));


    }

}


