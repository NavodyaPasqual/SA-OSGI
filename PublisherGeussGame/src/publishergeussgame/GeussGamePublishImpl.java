package publishergeussgame;

import java.util.Random;
import java.util.Scanner;

public class GeussGamePublishImpl implements GeussGamePublish {

	Scanner sc = new Scanner(System.in);

	@Override
	public int generateRandonNoToGeuss() {
		Random rand = new Random();
		int noToGeuss = rand.nextInt(51);
		return noToGeuss;
	}

	@Override
	public void rule() {
		System.out.println("*****************************************");
		System.out.println("* 1.We will give 5 hints                *");
		System.out.println("* 2.Acordingly, enter the a number      *");
		System.out.println("* 3.You have 3 lifes                	*");
		System.out.println("* 4.Each life will reduce 5 marks   	*"); 
		System.out.println("*****************************************");
		
	}
	
	@Override
	public boolean checkEvenNo(int noToGeuss) {
		if (noToGeuss % 2 == 0) {
			return true; 
		} else {
			return false;
		}
	}

	@Override
	public boolean primaryNo(int noToGeuss) {
		int flag = 0;
		int m = noToGeuss / 2;
		if (noToGeuss == 0 || noToGeuss == 1) {
			return false;
		} else {
			for (int i = 2; i <= m; i++) {
				if (noToGeuss % i == 0) {
					flag = 1;
					return false;
				}
			}
			if (flag == 0) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean squareNo(int noToGeuss) {
		double sqrt = Math.sqrt(noToGeuss);
		return ((sqrt - Math.floor(sqrt)) == 0);
	}

	@Override
	public String rangeOfNo(int noToGeuse) {
		if (noToGeuse >= 40) {
			return "Number is between 40 and 50";
		} else if (noToGeuse >= 30) {
			return "Number is between 30 and 39";
		} else if (noToGeuse >= 20) {
			return "Number is between 20 and 29";
		} else if (noToGeuse >= 10) {
			return "Number is between 10 and 19";
		} else {
			return "Number is between 0 and 9";
		}

	}

	@Override
	public boolean triangularNo(int noToGeuss) {
		int sum = 0;
		for (int n = 1; sum <= noToGeuss; n++) {
			sum = sum + n;
			if (sum == noToGeuss)
				return true;
		}

		return false;
	}

	@Override
	public void giveFirst4Tips(int no) {
		System.out.println("	This number is between 0 and 50,");
		if (checkEvenNo(no) == true) {
			System.out.println("	And a even number,");
		} else if (checkEvenNo(no) == false) {
			System.out.println("	And a odd number,");
		}
		if (primaryNo(no) == true) {
			System.out.println("	And a prime number,");
		} else if (primaryNo(no) == false) {
			System.out.println("	And a non-prime number,");
		}
		if (squareNo(no) == true) {
			System.out.println("	And a perfect square.");
		} else if (squareNo(no) == false) {
			System.out.println("	And not a perfect square.");
		}

	}

	@Override
	public void playGeussGame() {
		int geuss;
		int marks = 15;
		int generatedNo = generateRandonNoToGeuss();
		System.out.println("");
		rule();
		System.out.println("\n4 Tips for the number :");
		giveFirst4Tips(generatedNo);
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 3; i++) {
			System.out.println();
			System.out.println("Enter your GEUSS...");
			geuss = sc.nextInt();
			if (geuss == generatedNo) {
				System.out.println("\nYour geuss is correct");
				break;
			} else {
				System.out.println("\nSorry your geuss is wrong.");
				if (i < 2) {
					System.out.println("We will give you another tip so you can try again. But " + 5 * (i + 1)
							+ " marks will reduced.");
					if (i == 0) {
						System.out.println("\n5th Tip: ");
						System.out.println("	" + rangeOfNo(generatedNo));
					} else if (i == 1) {
						System.out.println("\n6th Tip: ");
						if (triangularNo(generatedNo) == true) {
							System.out.println("	This number is a triangular number");
						} else {
							System.out.println("	This number is not a triangular number");
						}

					}
					marks = marks - 5;
				} else if (i == 2) {
					System.out.println("Your chance is over.");
					System.out.println("Number is " + generatedNo);
					marks = marks - 5;
				}
			}
		}
		long stopTime = System.currentTimeMillis();

		System.out.println("\nTotal marks : " + marks + "(out of 15)");
		System.out.println("You have taken " + (stopTime - startTime) / 1000 + "seconds to answer.");
		System.out.println();
	}


}
