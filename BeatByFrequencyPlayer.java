
public class BeatByFrequencyPlayer implements Player{
	double rockFreq, paperFreq, scissorsFreq, totalMoves;
	int totalRock, totalPaper, totalScissors;
	
	
	@Override
	public int getMove() {
		double rand = Math.random();
		if (rand < rockFreq)
			return RPS.ROCK;
		if (rand < paperFreq && rand > rockFreq)
			return RPS.PAPER;
		else
			return RPS.SCISSORS;
		
	}
	
	public void updateFrequencies() {
		rockFreq = totalRock / totalMoves;
		paperFreq = totalPaper / totalMoves;
		scissorsFreq = totalScissors / totalMoves;
	}

	@Override
	public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
		totalMoves++;
		if (opponentMove == RPS.PAPER)
			totalPaper++;
		if (opponentMove == RPS.ROCK)
			totalRock++;
		if (opponentMove == RPS.SCISSORS)
			totalScissors++;
		
		updateFrequencies();
		
	}

	@Override
	public int getMove(int n) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
