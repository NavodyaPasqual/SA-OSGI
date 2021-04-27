package publishermissingletters;

public interface MissinglettersPublish {

	public String getRandomeWord();

	public char[] getRandomPlace(String word);

	public int life();

	public int getFinalScore(int mark);

	public int chkAnswer(String word, char[] letterArray);

	public void rule();

	public char[] getInput(String word, char[] letterArray);

	public void output(int flag, String word, char[] letterArray);

	int getscore();

	public void playMissingLettersGame();
}
