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
    private Space[] _spaces;
    private int _dimension = 40;
    private static Board _theBoard;
    private int currentPlayer;
    
    // Default constructor
    public Board()
    {
        Player _player1 = new Player("Player 1", "red", 1);
        Player _player2 = new Player("Player 2", "blue", 2);
        Player _player3 = new Player("Player 3", "green", 3);
        Player _player4 = new Player("Player 4", "yellow", 4);
        
        // Create a vector of squares as a template that we can then copy
        // into our _board attribute, effectively populating the board with
        // copies of this row of squares
        _spaces = new Space[40];
        
        // Create spaces here
        // Will need to figure out what will go where
        _spaces[0] = new Go();
        _spaces[1] = new Property("Mediterranean Avenue", "Purple", 2, 60);
        _spaces[2] = new CommunityChest();
        _spaces[3] = new Property("Baltic Avenue", "Purple", 4, 60);
        _spaces[4] = new Tax();
        _spaces[5] = new Property("Reading Railroad", "Black", 50, 200);
        _spaces[6] = new Property("Oriental Avenue", "Light Blue", 6, 100);
        _spaces[7] = new Chance();
        _spaces[8] = new Property("Vermont Avenue", "Light Blue", 6, 100);
        _spaces[9] = new Property("Connecticut Avenue", "Light Blue", 8, 120);
        _spaces[10] = new Jail();
        _spaces[11] = new Property("Charles Place", "Pink", 10, 140);
        _spaces[12] = new Property("Electric Company", "None", 50, 50);
        _spaces[13] = new Property("States Avenue", "Pink", 10, 140);
        _spaces[14] = new Property("Virginia Avenue", "Pink", 12, 160);
        _spaces[15] = new Property("Pennsylvania Railroad", "Black", 50, 200);
        _spaces[61] = new Property("St. James Place", "Orange", 14, 280);
        _spaces[17] = new CommunityChest();
        _spaces[18] = new Property("Tennessee Avenue", "Orange", 140, 180);
        _spaces[19] = new Property("New York Avenue", "Orange", 16, 200);
        _spaces[20] = new FreeParking();
        _spaces[21] = new Property("Kentucky Avenue", "Red", 18, 220);
        _spaces[22] = new Chance();
        _spaces[23] = new Property("Indiana Avenue", "Red", 18, 220);
        _spaces[24] = new Property("Illinois Avenue", "Red", 20, 240);
        _spaces[25] = new Property("B&O Railroad", "Black", 50, 200);
        _spaces[26] = new Property("Atlantic Avenue", "Yellow", 22, 260);
        _spaces[27] = new Property("Ventnor Avenue", "Yellow", 22, 260);
        _spaces[28] = new Property("Water Works", "None", 50, 150);
        _spaces[29] = new Property("Marvin Gardens", "Yellow", 24, 280);
        _spaces[30] = new Jail();
        _spaces[31] = new Property("Pacific Avenue", "Green", 26, 300);
        _spaces[32] = new Property("North Carolina Avenue", "Green", 26, 300);
        _spaces[33] = new CommunityChest();
        _spaces[34] = new Property("Pennyslvania Avenue", "Green", 28, 320);
        _spaces[35] = new Property("Short Line", "Black", 50, 200);
        _spaces[36] = new Chance();
        _spaces[37] = new Property("Park Place", "Dark Blue", 35, 350);
        _spaces[38] = new Tax();
        _spaces[39] = new Property("Boardwalk", "Dark Blue", 50, 400);
    }
    
    /**
     * A method to get the position of a player
     *
     * @param The player to get the position of
     */
    public Space getPlayerPosition(Player p)
    {
        return p.getPosition();
    }
    
    /**
     * A method to get a space from the board
     *
     * @param row The row of the space
     * @param column The column of the space
     * @return The space to get
     */
    public Space getSpace(int row, int column)
    {
        return _spaces[column * row];
    }
    
    /**
     * A method to get the dimension of the board
     *
     * @return The dimension of the board
     */
    public int getDimension()
    {
        return _dimension;
    }
    
    /**
     * This is written in the singleton pattern, so this will return an instance of the Board
     *
     * @return The only instance of the Board
     */
    public static Board getBoard()
    {
        return _theBoard;
    }
    
    /**
     * A method to get the current player
     *
     * @return The current player
     */
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
