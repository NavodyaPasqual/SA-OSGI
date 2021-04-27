package servicesubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import publishercountrygame.CountryGamePublish;
import publishergeussgame.GeussGamePublish;
import publishermissingletters.MissinglettersPublish;
import publisherquestionnaire.QuestionnairePublish;

public class Activator implements BundleActivator {

	Scanner sc = new Scanner(System.in);
	int gameNo = 0;
	String name;
	ServiceReference geussGameRef;
	ServiceReference countryGameRef;
	ServiceReference questionnaireRef;
	ServiceReference missingLettersRef;

	public void start(BundleContext context) throws Exception {
		System.out.println("Start Service Substriber");

		geussGameRef = context.getServiceReference(GeussGamePublish.class.getName());
		GeussGamePublish geussGamePublish = (GeussGamePublish) context.getService(geussGameRef);

		countryGameRef = context.getServiceReference(CountryGamePublish.class.getName());
		CountryGamePublish countryGamePublish = (CountryGamePublish) context.getService(countryGameRef);

		questionnaireRef = context.getServiceReference(QuestionnairePublish.class.getName());
		QuestionnairePublish questionnairePublish = (QuestionnairePublish) context.getService(questionnaireRef);

		missingLettersRef = context.getServiceReference(MissinglettersPublish.class.getName());
		MissinglettersPublish missingLettersPublish = (MissinglettersPublish) context.getService(missingLettersRef);

		System.out.println("\n----------------------------WELCOME TO GAMEZONE----------------------------");
		System.out.println("Enter your name: ");
		name = sc.nextLine(); 
		
		System.out.println("\nHi " + name);
		
		while (true) {

			System.out.println("\nSelect the game you want to play");
			System.out.println(" 1.  Geuss game");
			System.out.println(" 2.  Country game");
			System.out.println(" 3.  Questionnaire");
			System.out.println(" 4.  Missing Letters game");
			System.out.println(" 99. Exit");

			gameNo = sc.nextInt();
			

			if (gameNo == 1) {
				
				System.out.println("Welcome to Geuss Game!");
				geussGamePublish.playGeussGame();
				System.out.println("#########################################################################################");

			} else if (gameNo == 2) {
				
				System.out.println("Welcome to Country Game!");
				countryGamePublish.playCountryGame();
				System.out.println("#########################################################################################");

			} else if (gameNo == 3) {
				
				System.out.println("Welcome to Mathematic Questionnaire!");
				questionnairePublish.playQuestionnaireGame();
				System.out.println("#########################################################################################");
				
			} else if (gameNo == 4) {
				
				System.out.println("Welcome to Missing Letters Game!");
				missingLettersPublish.playMissingLettersGame();
				System.out.println("#########################################################################################");
				
			} else if (gameNo == 99) {

				System.out.println("--------------Thank you---------------");
				break;
			}
		}

	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Good Bye !");
		context.ungetService(geussGameRef);
		context.ungetService(countryGameRef);
		context.ungetService(questionnaireRef);
		context.ungetService(missingLettersRef);
		
	}

}
