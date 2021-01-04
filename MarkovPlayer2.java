
public class MarkovPlayer2 implements Player{

	int[][] rpsGrid = new int[3][3];
	int lastWinningMove = -1;

	@Override
	public int getMove() {
		int total = rowSum(rpsGrid, lastWinningMove);

		double play = Math.random() * total;

		if (lastWinningMove == -1) {
			return RPS.ROCK;
		}

		if (play < rpsGrid[lastWinningMove][RPS.ROCK]) {
			return RPS.ROCK;
		} else if (play > total - rpsGrid[lastWinningMove][RPS.PAPER]) {
			return RPS.PAPER;
		} else {
			return RPS.SCISSORS;
		}

	}

	public static int rowSum(int[][] arr, int row) {
		int sum = 0;
		for (int i = 0; i < arr[0].length; i++) {
			sum += arr[row][i];
		}
		return sum;
	}

	@Override
	public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
		if (outcome == 1) {
			rpsGrid[lastWinningMove][yourMove]++;
			lastWinningMove = yourMove;
		} else if (outcome == 2) {
			rpsGrid[lastWinningMove][opponentMove]++;
			lastWinningMove = opponentMove;
		}
	}

	@Override
	public int getMove(int n) {
		// TODO Auto-generated method stub
		return 0;
	}


}
