import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        char[][] elements = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

//        System.out.print("Enter cells: ");
//        String s = scan.nextLine();

//        int ch = 0;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                elements[i][j] = s.charAt(ch);
//
//                ch++;
//            }
//        }

        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
        for (int v = 0; v < 9; v++) {

            char symbol;

            int cX;
            int cY;

            int i;
            int j;

            if (v % 2 == 0) {
                symbol = 'X';
            } else {
                symbol = 'O';
            }

            while (true) {
                try {
                    System.out.print("Enter the coordinates: ");

                    cX = scan.nextInt();
                    cY = scan.nextInt();

                    if (cX == 1 && cY == 3) {
                        i = 0;
                        j = 0;

                        if (elements[i][j] == ' ') {
                            elements[i][j] = symbol;
                            break;
                        } else {
                            handleOccupiedCells();
                        }

                    } else if (cX == 2 && cY == 3) {
                        i = 0;
                        j = 1;

                        if (elements[i][j] == ' ') {
                            elements[i][j] = symbol;
                            break;
                        } else {
                            handleOccupiedCells();
                        }

                    } else if (cX == 3 && cY == 3) {
                        i = 0;
                        j = 2;

                        if (elements[i][j] == ' ') {
                            elements[i][j] = symbol;
                            break;
                        } else {
                            handleOccupiedCells();
                        }

                    } else if (cX == 1 && cY == 2) {
                        i = 1;
                        j = 0;

                        if (elements[i][j] == ' ') {
                            elements[i][j] = symbol;
                            break;
                        } else {
                            handleOccupiedCells();
                        }

                    } else if (cX == 2 && cY == 2) {
                        i = 1;
                        j = 1;

                        if (elements[i][j] == ' ') {
                            elements[i][j] = symbol;
                            break;
                        } else {
                            handleOccupiedCells();
                        }

                    } else if (cX == 3 && cY == 2) {
                        i = 1;
                        j = 2;

                        if (elements[i][j] == ' ') {
                            elements[i][j] = symbol;
                            break;
                        } else {
                            handleOccupiedCells();
                        }

                    } else if (cX == 1 && cY == 1) {
                        i = 2;
                        j = 0;

                        if (elements[i][j] == ' ') {
                            elements[i][j] = symbol;
                            break;
                        } else {
                            handleOccupiedCells();
                        }

                    } else if (cX == 2 && cY == 1) {
                        i = 2;
                        j = 1;

                        if (elements[i][j] == ' ') {
                            elements[i][j] = symbol;
                            break;
                        } else {
                            handleOccupiedCells();
                        }

                    } else if (cX == 3 && cY == 1) {
                        i = 2;
                        j = 2;

                        if (elements[i][j] == ' ') {
                            elements[i][j] = symbol;
                            break;
                        } else {
                            handleOccupiedCells();
                        }

                    } else {
                        System.out.println("Coordinates should be from 1 to 3!");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("You should enter numbers!");
                    scan.nextLine();
                }
            }

            System.out.println("---------");
            for (int z = 0; z < 3; z++) {
                System.out.print("| ");
                for (int x = 0; x < 3; x++) {
                    System.out.print(elements[z][x] + " ");
                }
                System.out.println("|");
            }
            System.out.println("---------");

            if(!whoWins(elements).equals("draw")) {
                System.out.println(whoWins(elements));
            }

            if(whoWins(elements).equals("X wins") || whoWins(elements).equals("O wins")) {
                break;
            }

            if(v == 8) {
                System.out.println(whoWins(elements));
                break;
            }

        }

    }

    public static void handleOccupiedCells() {
        System.out.println("This cell is occupied! Choose another one!");
    }

    public static String whoWins(char[][] array) {
        boolean xWins = false;
        boolean oWins = false;
        boolean emptyCell = false;

//        int xCount = 0;
//        int oCount = 0;

        if (array[0][0] == array[0][1] && array[0][1] == array[0][2] && array[0][2] == 'X') {
            xWins = true;
        } else if (array[1][0] == array[1][1] && array[1][1] == array[1][2] && array[1][2] == 'X') {
            xWins = true;
        } else if (array[2][0] == array[2][1] && array[2][1] == array[2][2] && array[2][2] == 'X') {
            xWins = true;
        } else if (array[0][0] == array[1][0] && array[1][0] == array[2][0] && array[2][0] == 'X') {
            xWins = true;
        } else if (array[0][1] == array[1][1] && array[1][1] == array[2][1] && array[2][1] == 'X') {
            xWins = true;
        } else if (array[0][2] == array[1][2] && array[1][2] == array[2][2] && array[2][2] == 'X') {
            xWins = true;
        } else if (array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[2][2] == 'X') {
            xWins = true;
        } else if (array[0][2] == array[1][1] && array[1][1] == array[2][0] && array[2][0] == 'X') {
            xWins = true;
        }

        if (array[0][0] == array[0][1] && array[0][1] == array[0][2] && array[0][2] == 'O') {
            oWins = true;
        } else if (array[1][0] == array[1][1] && array[1][1] == array[1][2] && array[1][2] == 'O') {
            oWins = true;
        } else if (array[2][0] == array[2][1] && array[2][1] == array[2][2] && array[2][2] == 'O') {
            oWins = true;
        } else if (array[0][0] == array[1][0] && array[1][0] == array[2][0] && array[2][0] == 'O') {
            oWins = true;
        } else if (array[0][1] == array[1][1] && array[1][1] == array[2][1] && array[2][1] == 'O') {
            oWins = true;
        } else if (array[0][2] == array[1][2] && array[1][2] == array[2][2] && array[2][2] == 'O') {
            oWins = true;
        } else if (array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[2][2] == 'O') {
            oWins = true;
        } else if (array[0][2] == array[1][1] && array[1][1] == array[2][0] && array[2][0] == 'O') {
            oWins = true;
        }

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (array[i][j] == 'O') {
//                    oCount++;
//                } else if (array[i][j] == 'X') {
//                    xCount++;
//                }
//            }
//        }
//
//        if (oCount - xCount >= 2 || xCount - oCount >= 2) {
//            return "Impossible";
//        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == '_' || array[i][j] == ' ') {
                    emptyCell = true;
                    break;
                }
            }
        }

        if (!oWins && !xWins && !emptyCell) {
            return "Draw";
        } else if (oWins && !xWins) {
            return "O wins";
        } else if (xWins && !oWins) {
            return "X wins";
        }
        return "draw";
    }
}
