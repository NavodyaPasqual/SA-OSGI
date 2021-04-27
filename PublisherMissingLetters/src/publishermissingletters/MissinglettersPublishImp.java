package publishermissingletters;

import java.util.Random;
import java.util.Scanner;

public class MissinglettersPublishImp implements MissinglettersPublish {

	static final String[] words = { "grate", "desire", "gaudy", "telephone", "plants", "moon", "scrawny", "mix", "pass",
			"claim", "symptomatic", "handsome", "calendar", "decisive" };
	static int selectedWordIndex = 0;
	static int life = 5;
	static int flag = 0;
	static int score = 0;

	@Override
	public String getRandomeWord() {
		int wordCount = words.length;

		Random ran = new Random();
		int randomeInt = ran.nextInt(wordCount);

		selectedWordIndex = randomeInt;

		return words[randomeInt];
	}

	@Override
	public char[] getRandomPlace(String word) {

		int letterCount = word.length();
		Random ran = new Random();
		char[] letterArray = new char[word.length()];

		for (int i = 0; i < word.length(); i++) {
			letterArray[i] = word.charAt(i);
		}

		for (int i = 0; i < 3; i++) {

			int randCount = ran.nextInt(letterCount - 1) + 1;

			if (letterArray[randCount] != '_') {
				letterArray[randCount] = '_';
			} else {
				break;
			}
		}

		return letterArray;
	}

	@Override
	public int life() {
		return life;
	}

	@Override
	public int getscore() {
		return score;
	}

	@Override
	public int getFinalScore(int mark) {
		score = score + mark;
		return score;
	}

	@Override
	public int chkAnswer(String word, char[] letterArray) {
		flag = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != letterArray[i]) {
				System.out.println("Wrong letter " + letterArray[i]);
				flag++;

			} else {
				flag = flag;
			}
		}
		return flag;
	}

	@Override
	public void rule() {
		System.out.println("" + "\n*****************************************" + "\n* 1.Enter missing letters 	  	*"
				+ "\n* 2.you have 5 lifes 		  	*" + "\n* 3.Input all letters and press Enter 	*"
				+ "\n* 4.Separate each letter using ','	*" + "\n*****************************************");

	}

	@Override
	public char[] getInput(String word, char[] letterArray) {

		Scanner scn = new Scanner(System.in);
		String userinput = scn.nextLine().trim().replace(" ", "");
		String input = userinput.replace(",", "");
		char[] inputArray = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ',') {
				inputArray[i] = input.charAt(i);
			}

		}

		int x = 0;
		for (int i = 0; i < letterArray.length; i++) {
			if (letterArray[i] == '_') {
				letterArray[i] = inputArray[x];
				x++;
			}
		}
		return letterArray;
	}

	@Override
	public void output(int flag, String word, char[] letterArray) {
		//System.out.println("\n*********************************************************\n");

		if (flag != 0) {
			System.out.print("You entered : ");
			for (int i = 0; i < letterArray.length; i++) {
				System.out.print(letterArray[i]);
			}
			System.out.println("\nCorrect answer is : " + word);
			life = life - 1;
			System.out.println("\n" + life() + " life left");
			if (life == 0) {
				System.out.println("No more life left ");
				System.out.println("\n Your score is :" + getscore());
			}
		} else {
			System.out.println("\nAnswer is Correct ");
			for (int i = 0; i < letterArray.length; i++) {
				System.out.print(letterArray[i]);

			}
			int score = getFinalScore(100);
			System.out.println("\n Your score is :" + getscore());
		}
		System.out.println("\n*********************************************************");
	}

	@Override
	public void playMissingLettersGame() {
		int blank = 0;

		rule();

		String word = getRandomeWord();
		char[] letterArray = getRandomPlace(word);

		for (int count = 1; count <= 10; count++) {

			System.out.println("\nYour " + count + " word is : ");
			System.out.print(" ");
			for (int i = 0; i < letterArray.length; i++) {
				System.out.print(letterArray[i]);
				if (letterArray[i] == '_') {
					blank++;
				}
			}

			System.out.println("\nEnter the missing " + blank + " letters : ");
			char[] userInput = getInput(word, letterArray);
			int flag = chkAnswer(word, userInput);

			output(flag, word, userInput);

			if (life() == 0) {
				count = 10;
			}

			word = getRandomeWord();
			letterArray = getRandomPlace(word);
			blank = 0;
		}

		System.out.println("\n Total score : " + getscore());
		System.out.println();
	}

}
