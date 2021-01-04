
public class BeatLastWinningMovePlayer implements Player {
	int lastWinningMove;
	

	@Override
	public int getMove() {
		if (lastWinningMove == RPS.ROCK)
			return RPS.PAPER;
		if (lastWinningMove == RPS.PAPER)
			return RPS.SCISSORS;
		else
			return RPS.ROCK;
	}

	@Override
	public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
		if (outcome == RPS.YOU)
			lastWinningMove = yourMove;
		else
			lastWinningMove = opponentMove;
		
	}

}
