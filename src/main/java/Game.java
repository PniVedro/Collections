import java.util.ArrayList;

public class Game {

    ArrayList<Player> players = new ArrayList<>();


    public void register(Player player) {
        players.add(player);
    }

    public int findByName(String name) {
        int index = -1;
        for (int i = 0; i < players.size(); i++) {
            if (name.equals(players.get(i).getName())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int round(String playerName1, String playerName2) {
        if (findByName(playerName1) == -1) {
            throw new NotRegisteredException("Player with name" + playerName1 + " not register");
        }
        if (findByName(playerName2) == -1) {
            throw new NotRegisteredException("Player with name" + playerName2 + " not register");
        }
        int indexPlayerOne = findByName(playerName1);
        int indexPlayerTwo = findByName(playerName2);
        Player a = players.get(indexPlayerOne);
        Player b = players.get(indexPlayerTwo);
        return a.compareTo(b);

    }

}





