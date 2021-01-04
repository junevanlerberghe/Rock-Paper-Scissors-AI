
public class PlayToBeatInfrequentPlaysPlayer implements Player{
	double rockFreq, paperFreq, scissorsFreq, totalMoves;
	int totalRock, totalPaper, totalScissors; 
	
	public PlayToBeatInfrequentPlaysPlayer(int n) {
		totalMoves = n;
	}
	
	@Override
	public int getMove() {
		if (rockFreq < paperFreq && rockFreq < scissorsFreq)
			return RPS.ROCK;
		if (paperFreq < rockFreq && paperFreq < scissorsFreq) 
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
