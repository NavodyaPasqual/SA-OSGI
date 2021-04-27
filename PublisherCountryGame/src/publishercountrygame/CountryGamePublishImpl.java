package publishercountrygame;

import java.util.Random;
import java.util.Scanner;

public class CountryGamePublishImpl implements CountryGamePublish {

	Scanner sc = new Scanner(System.in);
	int marks = 0;

	@Override
	public int randomNo() {
		Random r = new Random();
		int no = r.nextInt(5);
		return no;
	}

	@Override
	public void AmericaCountryQuestions() {

		System.out.println("your number is 0.\nyou have to answer questions about America\n");

		String[] quetionArray = { "What is the capital of USA\n 1) New York 2) Washiton DC",
				"What is the main language of USA\n 1) Spanish 2) English",
				"What is the current population of USA\n 1) 234.6 million 2) 328.2 million",
				"Who is the current president of USA\n 1) Joe Biden 2) Donald Trump",
				"What USA is famous for\n 1) Hollywood 2) Cricket" };
		int[] ansewerArray = { 2, 2, 2, 1, 1 };

		for (int i = 0; i < 5; i++) {

			System.out.println(quetionArray[i]);
			System.out.println("Input your answer..");

			int ans = sc.nextInt();
			if (ans == ansewerArray[i]) {
				System.out.println("Answer is correct");
				marks = marks + 5;
			} else {
				System.out.println("Answer is wrong");
			}
			System.out.println("");
		}
		System.out.println("Total marks : " + marks + "(out of 25)");
	}

	public void IndiaCountryQuestions() {

		System.out.println("your number is 1.\nyou have to answer questions about India\n");

		String[] quetionArray = { "What is the capital of India\n 1) New Delhi 2) Mumbai",
				"What is the main language of India\n 1) Hindi 2) Urdu",
				"What is the current population of India\n 1) 1.366 billion 2) 643.7 million",
				"Who is the current prime minister of India\n 1) Ram Nath Kovind 2) Narendra Modi",
				"What India is famous for\n 1) Pyramids 2) Taj Mahal" };
		int[] ansewerArray = { 1, 1, 1, 2, 2 };

		for (int i = 0; i < 5; i++) {

			System.out.println(quetionArray[i]);
			System.out.println("Input your answer..");

			int ans = sc.nextInt();
			if (ans == ansewerArray[i]) {
				System.out.println("Answer is correct");
				marks = marks + 5;
			} else {
				System.out.println("Answer is wrong");
			}
			System.out.println("");
		}
		System.out.println("Total marks : " + marks + "(out of 25)");
	}

	public void EnglandCountryQuestions() {

		System.out.println("your number is 2.\nyou have to answer questions about England\n");

		String[] quetionArray = { "What is the capital of England\n 1) London 2) Manchester",
				"What is the main language of England\n 1) Portuguese 2) English",
				"What is the current population of England\n 1) 55.98 million 2) 880.9 million",
				"Who is the current ruler of England\n 1) Queen Elizabeth II 2) Boris Johnson",
				"What England is famous for\n 1) Royal Family 2) Desserts" };
		int[] ansewerArray = { 1, 2, 1, 1, 1 };

		for (int i = 0; i < 5; i++) {

			System.out.println(quetionArray[i]);
			System.out.println("Input your answer..");

			int ans = sc.nextInt();
			if (ans == ansewerArray[i]) {
				System.out.println("Answer is correct");
				marks = marks + 5;
			} else {
				System.out.println("Answer is wrong");
			}
			System.out.println("");
		}
		System.out.println("Total marks : " + marks + "(out of 25)");
	}

	public void AustraliaCountryQuestions() {

		System.out.println("your number is 3.\nyou have to answer questions about Australia\n");

		String[] quetionArray = { "What is the capital of Australia\n 1) Melbourne 2) Sydney",
				"What is the main language of Australia\n 1) English 2) Mandarin",
				"What is the current population of Australia\n 1) 25.36 million 2) 2.7 billion",
				"Who is the current prime minister of Australia\n 1) Scott Morriso 2) Malcom Turnbul",
				"What Australia is famous for\n 1) Swimming 2)  Aboriginal Culture" };
		int[] ansewerArray = { 1, 1, 1, 1, 2 };

		for (int i = 0; i < 5; i++) {

			System.out.println(quetionArray[i]);
			System.out.println("Input your answer..");

			int ans = sc.nextInt();
			if (ans == ansewerArray[i]) {
				System.out.println("Answer is correct");
				marks = marks + 5;
			} else {
				System.out.println("Answer is wrong");
			}
			System.out.println("");
		}
		System.out.println("Total marks : " + marks + "(out of 25)");
	}

	public void SriLankaCountryQuestions() {

		System.out.println("your number is 4.\nyou have to answer questions about Sri Lanka\n");

		String[] quetionArray = { "What is the capital of Sri Lanka\n 1) Colombo 2) Sri Jayawardanapura",
				"What is the main language of Sri Lanka\n 1) Sinhala 2) Tamil",
				"What is the current population of Sri Lanka\n 1) 357.2 million 2) 21.8 million",
				"Who is the current president of Sri Lanka\n 1) Mahinda Rajapaksha 2) Gotabaya Rajapaksha",
				"What Sri Lanka is famous for\n 1) Tea 2) Volcanos" };
		int[] ansewerArray = { 2, 1, 2, 2, 1 };

		for (int i = 0; i < 5; i++) {

			System.out.println(quetionArray[i]);
			System.out.println("Input your answer..");

			int ans = sc.nextInt();
			if (ans == ansewerArray[i]) {
				System.out.println("Answer is correct");
				marks = marks + 5;
			} else {
				System.out.println("Answer is wrong");
			}
			System.out.println("");
		}
		System.out.println("Total marks : " + marks + "(out of 25)");
	}

	@Override
	public void getCountry(int no) {
		switch (no) {
		case 0:
			AmericaCountryQuestions();
			break;
		case 1:
			IndiaCountryQuestions();
			break;
		case 2:
			EnglandCountryQuestions();
			break;
		case 3:
			AustraliaCountryQuestions();
			break;
		case 4:
			SriLankaCountryQuestions();
			break;
		default:
			System.out.println("invalid");
		}

	}

	@Override
	public void rule() {
		System.out.println("*******************************************");
		System.out.println("* 1.You will be given 5 question          *");
		System.out.println("* 2.Acordingly, enter the the answers     *");
		System.out.println("* 3.Each wrong answer will reduce 5 marks *"); 
		System.out.println("*******************************************");	
		
	}

	@Override
	public void playCountryGame() {
		int answer;
		rule();
		System.out.println(
				"\n [0] => USA \n [1] => India \n [2] => England \n [3] => Australia \n [4] => Sri Lanka\n");
		int number = randomNo();
		getCountry(number);
		System.out.println("");
	}
}
