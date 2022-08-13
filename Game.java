import java.util.Scanner;
import java.util.Random;

class GameMain {
	int id;
	int skillValue;
	int placeValue;
	double score;
	String name;

	GameMain(String name, int id, int skillValue, int placeValue) {
		this.id = id;
		this.name = name;
		this.skillValue = skillValue;
		this.placeValue = placeValue;
	}

	public void calScore(GameMain player, int input) {
		Random rand = new Random();
		int random = rand.nextInt(10);
		if (input == random) {
			this.score = this.skillValue * 0.5 + this.placeValue * 0.6 + input;
			System.out.println("matched with random number " + random);
		} else {
			this.score = this.skillValue * 0.5 + this.placeValue * 0.6;
			System.out.println("not matched with random number " + random);
		}
	}

}

public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int id;
		int number;

		// player 1
		System.out.println("name of Player 1: ");
		name = input.nextLine();
		System.out.println("id of Player 1: ");
		id = input.nextInt();
		GameMain player1 = new GameMain(name, id, 5, 8);

		// player 2
		System.out.println("name of Player 2: ");
		name = input.nextLine();
		System.out.println("id of Player 2: ");
		id = input.nextInt();
		GameMain player2 = new GameMain(name, id, 9, 4);
		for (int i = 0; i < 4; i++) {
			System.out.println("number between 1-10 for player1");
			number = input.nextInt();
			player2.calScore(player2, number);
			System.out.println("number between 1-10 for player2");
			number = input.nextInt();
			player1.calScore(player1, number);

		}
		System.out.println("Player1 one score : " + player1.score);
		System.out.println("Player2 one score : " + player2.score);
		input.close();
	}
}
