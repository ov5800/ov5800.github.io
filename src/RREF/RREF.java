package RREF;

import java.util.Scanner;


//[   1   2  -1   6   ]
//[   3   8   9  10   ]
//[   2  -1   2  -2   ]


//[   1   0   0   1   ]
//[   0   1   0   2   ]
//[   0   0   1  -1   ]


//rref

public class RREF {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to RREF in JAVA");
        init();
    }

    /**Initialize matrix
     * Ask for n x m size then loop asking for values at each position
     * No return
     * **/
    private static void init(){
        try (Scanner newScan = new Scanner( System.in )) {
            System.out.println();
            String newInput = newScan.nextLine();
            System.out.println( "Input = " + newInput );
        }

        //get input
        int x = getX();  //user value
        int y = getY();  //user value
        int[][] matrix = new int[x][y]; //placeholders, should be input n and input m
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Enter value for position " + x + ", " + y );
                matrix[i][j] = 0;    //user input
            }
        }

        int[][] multiplier = new int[0][0];
        multiply( multiplier );

    }

    private static int[][] multiply( int[][] current ){
        int[][] matrix = current;
    
        return matrix;
    }

    //Get x size
    private static int getX(){
        return 0;
    }

    //Get y size
    private static int getY(){
        return 0;
    }
}



