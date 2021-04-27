package publisherquestionnaire;

import java.util.Scanner;

public class QuestionnairePublishImpl implements QuestionnairePublish {
	Scanner input = new Scanner(System.in);
	public int Ans1, Ans2, Ans3, Ans4, Ans5, Ans6, Ans7, Ans8, Ans9, Ans10, num, num1, num3, A1, A2, A3, A4, A5, A6, A7,
			A8, A9, A10;
	float marks = 0;
	float percent = 0;
	double f;

	@Override
	public void startQuestionnaire() {

		int[] Answers = { 45, 46, 512, 604800, 15, 128, 86, 40 };

		System.out.println("");
		System.out.println("Question 1");
		System.out.println("What is the median of these numbers: 68 , 45, 32, 85, 3");

		Ans1 = input.nextInt();

		if (Ans1 == Answers[0]) {

			System.out.println("");
			System.out.println(" You are Correct!");
			marks += 5;

		} else {

			System.out.println("");
			System.out.println("Incorrect Answer!");
			System.out.println("");
			System.out.println(" See the answer. (1)");
			System.out.println(" See how to get the median.(2)");

			A1 = input.nextInt();

			if (A1 == 1) {

				System.out.println("");
				System.out.println("Answer is " + Answers[0]);
			} else {

				System.out.println("");
				System.out.println(" When numbers are written in numerical order, the middle number is the median.");
			}
		}

		System.out.println("");
		System.out.println("Question 2");
		System.out.println(" What is the mean of 56, 44, 21, 28 and 81 ?");

		Ans2 = input.nextInt();

		if (Ans2 == Answers[1]) {

			System.out.println("");
			System.out.println(" You are Correct!");
			marks += 5;
		} else {

			System.out.println("");
			System.out.println("Incorrect Answer!");
			System.out.println("");
			System.out.println(" See the answer. (1)");
			System.out.println(" See how to calculate mean.(2)");

			A2 = input.nextInt();

			if (A2 == 1) {

				System.out.println("");
				System.out.println("Answer is " + Answers[1]);
			} else {

				calculateMean();
			}
		}

		System.out.println("");
		System.out.println("Question 3");
		System.out.println("What is the volume of a cube that has edges of 8cm ?");

		Ans3 = input.nextInt();

		if (Ans3 == Answers[2]) {

			System.out.println("");
			System.out.println(" You are Correct!");
			marks += 5;

		} else {

			System.out.println("");
			System.out.println("Incorrect Answer!");
			System.out.println("");
			System.out.println(" See the answer. (1)");
			System.out.println(" See how to calculate the cube.(2)");

			A3 = input.nextInt();

			if (A3 == 1) {

				System.out.println("");
				System.out.println("Answer is " + Answers[2]);
			} else {

				System.out.println("");
				System.out.println(" Volume of a cube = edge * edge * edge ");
				calculateVolume();
			}

		}

		System.out.println("");
		System.out.println("Question 4");
		System.out.println("How many seconds are there in 7 days?");

		Ans4 = input.nextInt();

		if (Ans4 == Answers[3]) {

			System.out.println("");
			System.out.println(" You are Correct!");
			marks += 5;

		} else {

			System.out.println("");
			System.out.println("Incorrect Answer!");
			System.out.println("");
			System.out.println(" See the answer. (1)");
			System.out.println(" See how to calculate the seconds.(2)");

			A4 = input.nextInt();

			if (A4 == 1) {

				System.out.println("");
				System.out.println("Answer is " + Answers[3]);
			} else {

				System.out.println("");
				System.out.println(" Seconds in 7 days = 60 * 60 * 24 * 7 ");
				System.out.println(" 1st 60 - Seconds per minute");
				System.out.println(" 2nd 60 - minutes per hour");
				System.out.println(" 24 - hours per day");
				System.out.println(" 7- days per week");
			}

		}

		System.out.println("");
		System.out.println("Question 5");
		System.out.println("If it takes 6 men 5 hours to complete a task, how long will it theoretically take 2 man? ");

		Ans5 = input.nextInt();

		if (Ans5 == Answers[4]) {

			System.out.println("");
			System.out.println(" You are Correct!");
			marks += 5;

		} else {

			System.out.println("");
			System.out.println("Incorrect Answer!");
			System.out.println("");
			System.out.println(" See the answer. (1)");
			System.out.println(" See how to calculate.(2)");

			A5 = input.nextInt();

			if (A5 == 1) {

				System.out.println("");
				System.out.println("Answer is " + Answers[4]);
			} else {

				System.out.println("");
				System.out.println(" For 6 men 5 hours, ");
				System.out.println(
						" consider 3 men, probably the time should be doubled bracuse their workload is doubled, ");
				System.out.println(" therefore 3 men takes 10 hours. ");
				System.out.println("");
				System.out.println(
						" consider 2 men, probably the time should be tripled bracuse their workload is tripled, ");
				System.out.println(" therefore 2 men takes 15 hours. ");

			}

		}

		System.out.println("");
		System.out.println("Question 6");
		System.out.println(
				"A pair of shoes is on sale for $96. if the shoes are on sale for 25% off, what was its original price?");

		Ans6 = input.nextInt();

		if (Ans6 == Answers[5]) {

			System.out.println("");
			System.out.println(" You are Correct!");
			marks += 5;

		} else {

			System.out.println("");
			System.out.println("Incorrect Answer!");
			System.out.println("");
			System.out.println(" See the answer. (1)");
			System.out.println(" See how to calculate the price.(2)");

			A6 = input.nextInt();

			if (A6 == 1) {

				System.out.println("");
				System.out.println("Answer is " + Answers[5]);
			} else {

				System.out.println("");
				System.out.println(" 75% = 3/4 , 75% = $96");
				System.out.println(" therefore 96 * (4/3) = First price = 128$");
			}

		}

		System.out.println("");
		System.out.println("Question 7");
		System.out.println("What is the Farenhite scalr of 30 Celcius? ");

		Ans7 = input.nextInt();

		if (Ans7 == Answers[6]) {

			System.out.println("");
			System.out.println(" You are Correct!");
			marks += 5;

		} else {

			System.out.println("");
			System.out.println("Incorrect Answer!");
			System.out.println("");
			System.out.println(" See the answer. (1)");
			System.out.println(" See how to Convert Celcius to Farenhite.(2)");

			A7 = input.nextInt();

			if (A7 == 1) {

				System.out.println("");
				System.out.println("Answer is " + Answers[6]);
			} else {

				temperatureConverter();
			}

		}

		System.out.println("");
		System.out.println("Question 8");
		System.out.println(
				"There are boys and girls in a party in ratio 5:3. 10 boys left and ratio become 1:1.how many are there in the party?");
		Ans8 = input.nextInt();

		if (Ans8 == Answers[7]) {

			System.out.println("");
			System.out.println(" You are Correct!");
			marks += 5;

		} else {

			System.out.println("");
			System.out.println("Incorrect Answer!");
			System.out.println("");
			System.out.println(" See the answer. (1)");
			System.out.println(" See how to calculate.(2)");

			A8 = input.nextInt();

			if (A8 == 1) {

				System.out.println("Answer is " + Answers[7]);
			} else {

				System.out.println("");
				System.out.println(" Assume boys = 5x and girls = 3x");
				System.out.println(" After leave of 10 boys, as ratio 1:1,  5x - 10 = 3x");
				System.out.println(" So x = 5, All party members = 8x ");
				System.out.println(" Therefore number of members = 8 * 5 = 40");

			}

		}
	}

	private void temperatureConverter() {

		System.out.println(" Enter the Celcius amount ");
		num3 = input.nextInt();

		f = ((1.8 * num3) + 32);

		System.out.println(" Farenhite = (((9/5) * num3) + 32) = " + f);
	}

	private void calculateVolume() {

		int volume = 0;
		System.out.println("Enter the size of edges.");
		for (int i = 0; i < 3; i++) {
			num1 = input.nextInt();
			volume *= num1;
		}
		System.out.println("Volume = " + volume);
	}

	private void calculateMean() {

		float total = 0;
		System.out.println("Enter the numbers in question.");
		for (int i = 0; i < 5; i++) {
			num = input.nextInt();
			total += num;
		}
		float mean = total / 5;

		System.out.println("Mean = (12 + 14 + 19 + 27 + 53)/5 =  " + mean);
		System.out.println("");

	}

	@Override
	public void displayTotal() {

		percent = ((marks / 40) * 100);
		System.out.println("\nTotal Percentage =  " + percent + "%");

	}

	@Override
	public void rule() {
		System.out.println("***************************************************");
		System.out.println("* 1.You will be given 8 Mathematical questions    *");
		System.out.println("* 2.Acordingly, enter the index of the answer     *");
		System.out.println("* 3.Each correct answer will add 5 marks to total *");
		System.out.println("***************************************************");
	}

	@Override
	public void playQuestionnaireGame() {
		System.out.println("");
		rule();
		startQuestionnaire();
		displayTotal();
		System.out.println("");
	}

}
