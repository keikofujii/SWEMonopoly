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
	private int _dimension = 11; 
	private static Board _theBoard;
	private int currentPlayer; 
	
	// Default constructor
	public Board()
	{
	    // Create a vector of squares as a template that we can then copy
	    // into our _board attribute, effectively populating the board with
	    // copies of this row of squares
	    _spaces = new Space[_dimension][_dimension];
	    
	    // Create spaces here
	    // Will need to figure out what will go where
	    _spaces[0][0] = new Go();
	    _spaces[0][1] = new Property("Mediterranean Avenue", "Purple", 2, 60);
	    _spaces[0][2] = new CommunityChest();
	    _spaces[0][3] = new Property("Baltic Avenue", "Purple", 4, 60);
	    _spaces[0][4] = new Tax();
	    _spaces[0][5] = new Property("Reading Railroad", "Black", 50, 200);
	    _spaces[0][6] = new Property("Oriental Avenue", "Light Blue", 6, 100);
	    _spaces[0][7] = new Chance();
	    _spaces[0][8] = new Property("Vermont Avenue", "Light Blue", 6, 100);
	    _spaces[0][9] = new Property("Connecticut Avenue", "Light Blue", 8, 120);
	    _spaces[0][10] = new Jail();
	    _spaces[1][9] = new Property("Charles Place", "Pink", 10, 140);
	    _spaces[2][9] = new Property("Electric Company", "None", 50, 50);
	    _spaces[3][9] = new Property("States Avenue", "Pink", 10, 140);
	    _spaces[4][9] = new Property("Virginia Avenue", "Pink", 12, 160);
	    _spaces[5][9] = new Property("Pennsylvania Railroad", "Black", 50, 200);
	    _spaces[6][9] = new Property("St. James Place", "Orange", 14, 280);
	    _spaces[7][9] = new CommunityChest();
	    _spaces[8][9] = new Property("Tennessee Avenue", "Orange", 140, 180);
	    _spaces[9][9] = new Property("New York Avenue", "Orange", 16, 200);
	    _spaces[10][9] = new FreeParking();
	    _spaces[10][8] = new Property("Kentucky Avenue", "Red", 18, 220);
	    _spaces[10][7] = new Chance();
	    _spaces[10][6] = new Property("Indiana Avenue", "Red", 18, 220);
	    _spaces[10][5] = new Property("Illinois Avenue", "Red", 20, 240);
	    _spaces[10][4] = new Property("B&O Railroad", "Black", 50, 200);
	    _spaces[10][3] = new Property("Atlantic Avenue", "Yellow", 22, 260);
	    _spaces[10][2] = new Property("Ventnor Avenue", "Yellow", 22, 260);
	    _spaces[10][1] = new Property("Water Works", "None", 50, 150);
	    _spaces[10][0] = new Property("Marvin Gardens", "Yellow", 24, 280);
	    _spaces[9][0] = new Jail();
	    _spaces[8][0] = new Property("Pacific Avenue", "Green", 26, 300);
	    _spaces[7][0] = new Property("North Carolina Avenue", "Green", 26, 300);
	    _spaces[6][0] = new CommunityChest();
	    _spaces[5][0] = new Property("Pennyslvania Avenue", "Green", 28, 320);
	    _spaces[4][0] = new Property("Short Line", "Black", 50, 200);
	    _spaces[3][0] = new Chance();
	    _spaces[2][0] = new Property("Park Place", "Dark Blue", 35, 350);
	    _spaces[1][0] = new Property("Boardwalk", "Dark Blue", 50, 400);
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
	
	public static Board getBoard()
	{
		return _theBoard;
	}

	public Player getCurrentPlayer() 
	{
		Player currentPlayer; 
		switch(currentPlayer) {
		case 1: currentPlayer = _player1;
				break;
		case 2: currentPlayer = _player2;
				break;
		case 3: currentPlayer = _player3;
				break;
		case 4: currentPlayer = _player4;
				break;
		default: currentPlayer = _player1;
				break;
		}
		return currentPlayer;
		
	}
	
}
