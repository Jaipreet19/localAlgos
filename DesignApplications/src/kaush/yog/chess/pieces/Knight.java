package kaush.yog.chess.pieces;

import java.util.Set;

import kaush.yog.chess.Slot;

public class Knight implements IPiece {

	Color color;
	
	public Knight(Color col) {
		color = col;
	}

	@Override
	public boolean isValidMove(Slot slot) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Pair> validMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

}
