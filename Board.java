import java.util.ArrayList;


public class Board {
	/*
	 * Attributes: 
	 * Players
	 * Spaces
	 * Default dimension
	 */
	private Player _player1;
	private Player _player2;
	private Player _player3;
	private Player _player4;
	private Space[][] _spaces;
	private int _dimension = 12; 
	
	// Default constructor
	public Board()
	{
	    // Create a vector of squares as a template that we can then copy
	    // into our _board attribute, effectively populating the board with
	    // copies of this row of squares
	    _spaces = new Space[_dimension][_dimension];
	    
	    // Create spaces here
	    // Will need to figure out what will go where
	}
	
	public Space getPlayerPosition(Player p)
	{
		return p.getPosition();
	}
	
	public Space getSpace(int row, int column)
	{
		return _spaces[row][column];
	}
	
	public int getDimension()
	{
		return _dimension; 
	}
	
}
