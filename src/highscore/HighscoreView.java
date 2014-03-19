package highscore;

import java.util.Scanner;

public class HighscoreView implements ListListener {

	private HighscoreList highscoreList;

	public HighscoreView(HighscoreList highscoreList) {
		this.highscoreList = highscoreList;
		highscoreList.addListListener(this);
	}

	public void listChanged(ObservableList list, int start, int end) {
		refreshList();
	}

	private void refreshList() {
		int i = 0;
		for (Comparable result: highscoreList) {
			System.out.println(result);
			i++;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HighscoreList highscoreList = new HighscoreList(5);
		HighscoreView highscoreView = new HighscoreView(highscoreList);
		
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int moves = scanner.nextInt();
			highscoreList.addResult(new SokobanResult("Hallvard", moves));
		}
	}
}
