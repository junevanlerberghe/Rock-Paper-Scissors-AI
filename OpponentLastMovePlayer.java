
public class OpponentLastMovePlayer implements Player{
	int opponentLastMove;
	
	public OpponentLastMovePlayer () {
		
	}
	
	@Override
	public int getMove() {
		return opponentLastMove;
	}

	@Override
	public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
		opponentLastMove = opponentMove;
	}

}
