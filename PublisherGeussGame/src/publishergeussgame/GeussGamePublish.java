package publishergeussgame;

public interface GeussGamePublish {
	public int generateRandonNoToGeuss();
	
	public void rule();

	public boolean checkEvenNo(int noToGeuss);

	public boolean primaryNo(int noToGeuss);

	public boolean squareNo(int noToGeuss);

	public String rangeOfNo(int noToGeuse);

	public boolean triangularNo(int noToGeuss);

	public void giveFirst4Tips(int no);

	public void playGeussGame();
}
