
public class MarkovPlayer implements Player {
	int[][] rpsGrid = new int[3][3];
	int lastMove = -1;

	@Override
	public int getMove() {
		int total = rowSum(rpsGrid, lastMove);

		double play = Math.random() * total;

		if (play < rpsGrid[lastMove][RPS.ROCK]) {
			return RPS.ROCK;
		} else if (play > total - rpsGrid[lastMove][RPS.PAPER]) {
			return RPS.PAPER;
		} else {
			return RPS.SCISSORS;
		}

	}

	@Override
	public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
		if (lastMove == -1) {
			lastMove = opponentMove;
		} else {
			rpsGrid[lastMove][opponentMove]++;
			lastMove = opponentMove;
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
	public int getMove(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
