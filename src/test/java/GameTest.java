import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class GameTest {
    Player player1 = new Player(1, "Vasya", 100);
    Player player2 = new Player(2, "Petya", 200);
    Player player3 = new Player(3, "Grisha", 300);
    Player player4 = new Player(4, "John", 300);



    @Test
    public void shouldFirstPlayerWin(){
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        int expected = 1;
        int actual = game.round("Petya", "Vasya");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondPlayerWin(){
        Game game = new Game();
        game.register(player2);
        game.register(player3);
        int expected = 2;
        int actual = game.round("Petya", "Grisha");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeADraw(){
        Game game = new Game();
        game.register(player3);
        game.register(player4);
        int expected = 0;
        int actual = game.round("John", "Grisha");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstPlayerNotFound(){
        Game game = new Game();
        game.register(player3);
        game.register(player4);


        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Vasya","Grisha"));
    }

    @Test
    public void secondPlayerNotFound(){
        Game game = new Game();
        game.register(player3);
        game.register(player4);


        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Grisha","Vasya"));
    }

    @Test
    public void twoPlayerNotFound(){
        Game game = new Game();
        game.register(player3);
        game.register(player4);


        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Sam","Vasya"));
    }
}
