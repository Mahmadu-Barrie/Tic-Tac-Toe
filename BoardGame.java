/* 
    Mahmadu Barrie
    Purpose :create, initialize and manipulate multidimensional arrays representing a well-known game.
     Virtual Studio Code
    */
    import java.util.Scanner;
    import java.util.Arrays;
    public class BoardGame{
    
    public static void main (String [] args){
        Scanner scnr = new Scanner(System.in);
        boolean valid2 = false;
        boolean GameDeciderX = false;
        boolean GameDeciderO = false;
        boolean Draw = false;
        int Player1Choice = 0; 
        int dummyChoice1 = 0; 
        int Player2Choice = 0; 
        int dummyChoice2 = 0; 
        String[][] boardArray = {{"1","2","3"}, {"4","5","6"}, {"7","8","9"}};
        print2D(boardArray);
        while(true){
            Player1Choice = choiceXValidation(dummyChoice1, boardArray, scnr);
            print2D(ChoiceXarray(Player1Choice, boardArray));
            Draw = drawDetermination(boardArray);
            GameDeciderX = winDrawX(boardArray);
            GameDeciderO = winDrawO(boardArray);
            if (GameDeciderX == true || GameDeciderO == true || Draw == true ){ // loop breaks only when a Player wins or game ends in a draw
                break;
            }
            Player2Choice = choiceOValidation(dummyChoice2, boardArray,  scnr);
            print2D(ChoiceOarray(Player2Choice, boardArray));
            Draw = drawDetermination(boardArray);
            GameDeciderX = winDrawX(boardArray);
            GameDeciderO = winDrawO(boardArray);
            if (GameDeciderX == true || GameDeciderO == true || Draw == true){
                break;
            }
            }
            if (GameDeciderX == true){
                System.out.println("Player 1 (X) wins the game!");
            }
            else if (GameDeciderO == true){
                System.out.println("Player 2 (O) wins the game!");
            }
            else if (Draw == true){
                System.out.println("Game has ended in a draw.");
            }
    }// end of main method
    
    
    // method prints the board
    public static void print2D(String[][] printArray){
        for(int i = 0; i < printArray.length; i++) {
            for (int j = 0; j < printArray[i].length; j++) {
            System.out.print(printArray[i][j] + "  ");
            }
            System.out.println();
        }
    }// print2D method ends
    
        
    // method places X's on parts of the board
    public static String [][] ChoiceXarray(int Choice, String[][] Array ){  
        if (Choice == 1 ){
            Array[0][0] = "X";
        }
        else if (Choice == 2 ){
            Array[0][1] = "X";
        }
        else if (Choice == 3){
            Array[0][2] = "X";
        }
        else if (Choice == 4 ){
            Array[1][0] = "X";
        }
        else if (Choice == 5){
            Array[1][1] = "X";
        }
        else if (Choice == 6 ){
            Array[1][2] = "X";
        }
        else if (Choice == 7 ){
            Array[2][0] = "X";
        }
        else if (Choice == 8 ){
            Array[2][1] = "X";
        }
        else if (Choice == 9 ){
            Array[2][2] = "X";
        }
        return Array;
    }// ChoiceXArray method end
    
    
    // method places O's on board
    public static String [][] ChoiceOarray(int Choice, String[][] Array ){  
        if (Choice == 1 ){
            Array[0][0] = "O";
        }
        else if (Choice == 2 ){
            Array[0][1] = "O";
        }
        else if (Choice == 3){
            Array[0][2] = "O";
        }
        else if (Choice == 4 ){
            Array[1][0] = "O";
        }
        else if (Choice == 5){
            Array[1][1] = "O";
        }
        else if (Choice == 6 ){
            Array[1][2] = "O";
        }
        else if (Choice == 7 ){
            Array[2][0] = "O";
        }
        else if (Choice == 8 ){
            Array[2][1] = "O";
        }
        else if (Choice == 9 ){
            Array[2][2] = "O";
        }
        return Array;
    }// ChoiceOArray method end
    
    
    //method determining if Player 1(X) won 
    public static boolean winDrawX( String[][] Array ){  
        boolean DeciderX= false;
        // decides X winning by rows
        if (Array[0][0]  == "X" && Array[0][1]  == "X" && Array[0][2]  == "X"  ){
            DeciderX = true;
        }
        else if (Array[1][0]  == "X" && Array[1][1]  == "X" && Array[1][2]  == "X"  ){
            DeciderX = true;
        }
        else if (Array[2][0]  == "X" && Array[2][1]  == "X" && Array[2][2]  == "X"  ){
            DeciderX = true;
        }
        // decides X winning by columns
        else if (Array[0][0]  == "X" && Array[1][0]  == "X" && Array[2][0]  == "X"  ){
            DeciderX = true;
        }
        else if (Array[0][1]  == "X" && Array[1][1]  == "X" && Array[2][1]  == "X"  ){
            DeciderX = true;
        }
        else if (Array[0][2]  == "X" && Array[1][2]  == "X" && Array[2][2]  == "X"  ){
            DeciderX = true;
        }
        // decides X winning by diagonals
        else if (Array[0][0]  == "X" && Array[1][1]  == "X" && Array[2][2]  == "X"  ){
            DeciderX = true;
        }
        else if (Array[0][2]  == "X" && Array[1][1]  == "X" && Array[2][0]  == "X"  ){
            DeciderX = true;
        }
        else{
            DeciderX = false;
        }
        return DeciderX;
    }// windDrawX method end
    
    
    // method determines if Player2 (O) won
    public static boolean winDrawO( String[][] Array ){  
        boolean DeciderO = false;
        // deciding 0 winning by rows
        if (Array[0][0]  == "O" && Array[0][1]  == "O" && Array[0][2]  == "O"  ){
            DeciderO= true;
        }
        else if (Array[1][0]  == "O" && Array[1][1]  == "O" && Array[1][2]  == "O"  ){
            DeciderO = true;
        }
        else if (Array[2][0]  == "O" && Array[2][1]  == "O" && Array[2][2]  == "O"  ){
            DeciderO = true;
        }
        // decides X winning by columns
        else if (Array[0][0]  == "O" && Array[1][0]  == "O" && Array[2][0]  == "O"  ){
            DeciderO = true;
        }
        else if (Array[0][1]  == "O" && Array[1][1]  == "O" && Array[2][1]  == "O"  ){
            DeciderO = true;
        }
        else if (Array[0][2]  == "O" && Array[1][2]  == "O" && Array[2][2]  == "O"  ){
            DeciderO = true;
        }
        // decides O winning by diagonals
        else if (Array[0][0]  == "O" && Array[1][1]  == "O" && Array[2][2]  == "O"  ){
            DeciderO = true;
        }
        else if (Array[0][2]  == "O" && Array[1][1]  == "O" && Array[2][0]  == "O"  ){
            DeciderO = true;
        }
        else{
            DeciderO = false;
        }
        return DeciderO;
    }// windDrawX method ends
    
        
    // method validates player 1's moves
    public static int choiceXValidation(int Choice, String[][] Array, Scanner scnr ){ 
        boolean valid3 = false;
        while (!valid3){
            System.out.println("Player 1's turn");
            System.out.println("Indicate where to place X (1-9)");
            Choice = scnr.nextInt();
            if ( Choice <= 0 || Choice > 9){
                System.out.println("Invalid input: Value out of range");
            }
            if (Choice == 1 && ( Array[0][0] == "X" | Array[0][0] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 2 && ( Array[0][1] == "X" || Array[0][1] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 3 && ( Array[0][2] == "X" || Array[0][2] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 4 && ( Array[1][0] == "X" || Array[1][0] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 5 && ( Array[1][1] == "X" || Array[1][1] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 6 && ( Array[1][2] == "X" || Array[1][2] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 7 && ( Array[2][0] == "X" || Array[2][0] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 8 && ( Array[2][1] == "X" || Array[2][1] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 9 && ( Array[2][2] == "X" || Array[2][2] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else
                valid3 = true;
        }
        return Choice;
    }// choiceValidation method end
    
    
    // method validates player 2's moves
    public static int choiceOValidation(int Choice, String[][] Array, Scanner scnr ){ 
        boolean valid4 = false;
        while (!valid4){
            System.out.println("Player 2's turn");
            System.out.println("Indicate where to place O (1-9)");
            Choice = scnr.nextInt();
            if ( Choice <= 0 || Choice > 9){
                System.out.println("Invalid input: Value out of range");
            }
            if (Choice == 1 && ( Array[0][0] == "X" | Array[0][0] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 2 && ( Array[0][1] == "X" || Array[0][1] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 3 && ( Array[0][2] == "X" || Array[0][2] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 4 && ( Array[1][0] == "X" || Array[1][0] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 5 && ( Array[1][1] == "X" || Array[1][1] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 6 && ( Array[1][2] == "X" || Array[1][2] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 7 && ( Array[2][0] == "X" || Array[2][0] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 8 && ( Array[2][1] == "X" || Array[2][1] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else if (Choice == 9 && ( Array[2][2] == "X" || Array[2][2] == "O") ){
                System.out.println("Invalid input: Position has already been filled");
            }
            else
                valid4 = true;
        }
        return Choice;
    }// choiceValidation method end
    
    
    // method determines if match was a draw
    public static boolean drawDetermination(String[][] Array){
        boolean decider = false;
        if ( Array[0][0] == "1" ){
            decider = false;
        }
        else if (Array[0][1] == "2" ){
            decider = false;
        }
        else if (Array[0][2] == "3" ){
            decider = false;
        }
        else if (Array[1][0] == "4"){
            decider = false;
        }
        else if (Array[1][1] == "5" ){
            decider = false;
        }
        else if ( Array[1][2] == "6" ){
            decider = false;
        }
        else if (Array[2][0] == "7" ){
            decider = false;
        }
        else if (Array[2][1] == "8"){
            decider = false;
        }
        else if (Array[2][2] == "9"  ){
            decider = false;
        }
        else 
            decider = true;
        return decider;
    }// drawDetermination method end
        
        
    }// class end
    
    