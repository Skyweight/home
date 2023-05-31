import java.time.temporal.IsoFields;
import java.util.List;
import java.util.Scanner;

class HelloWorld {
    public static void main(String args[]) {
        
        int lista [][] = new int [9][9];

        HelloWorld.menuPrincipal(lista);

        HelloWorld.cuentaRegresiva(lista);
        
    }


    //Los valores lista 0 0 son los milisegundos que el programa tiene que esperar entre fotogramas
    //Los valores lista 1-8 (valor horizontal) 1-8 (valor vertical) en la impresion de la pantalla
    public static void menuPrincipal(int lista[][]){

        HelloWorld.borralistas(lista);

        lista [0][0] = 10000;
        lista [1][2] = 2;
        lista [3][3] = 1;
        lista [3][4] = 1;
        lista [3][5] = 1;
        lista [3][6] = 1;
        lista [4][2] = 1;
        lista [4][7] = 1;
        lista [5][2] = 1;
        lista [5][7] = 1;
        lista [6][2] = 1;
        lista [6][7] = 1;
        lista [7][3] = 1;
        lista [7][4] = 1;
        lista [7][5] = 1;
        lista [7][6] = 1;

        HelloWorld.calcSegmentu(lista);
    }
    
    
    public static void cuentaRegresiva(int lista [][]) {
    
        HelloWorld.borralistas(lista);

        lista [0][0] = 2000;
        lista [2][3] = 1;
        lista [2][4] = 1;
        lista [2][5] = 1;
        lista [2][6] = 1;
        lista [3][6] = 1;
        lista [4][5] = 1;
        lista [4][6] = 1;
        lista [5][5] = 1;
        lista [5][6] = 1;
        lista [6][6] = 1;
        lista [7][3] = 1;
        lista [7][4] = 1;
        lista [7][5] = 1;
        lista [7][6] = 1;

        HelloWorld.calcSegmentu(lista);

        HelloWorld.borralistas(lista);
       
        lista [0][0] = 2000;
        lista [2][3] = 1;
        lista [2][4] = 1;
        lista [2][5] = 1;
        lista [2][6] = 1;
        lista [3][6] = 1;
        lista [4][5] = 1;
        lista [5][4] = 1;
        lista [6][3] = 1;
        lista [7][3] = 1;
        lista [7][4] = 1;
        lista [7][5] = 1;
        lista [7][6] = 1;

        HelloWorld.calcSegmentu(lista);

        HelloWorld.borralistas(lista);

        lista [0][0] = 2000;
        lista [2][5] = 1;
        lista [3][4] = 1;
        lista [3][5] = 1;
        lista [4][3] = 1;
        lista [4][4] = 1;
        lista [4][5] = 1;
        lista [5][4] = 1;
        lista [5][5] = 1;
        lista [6][4] = 1;
        lista [6][5] = 1;
        lista [7][3] = 1;
        lista [7][4] = 1;
        lista [7][5] = 1;
        lista [7][6] = 1;

        HelloWorld.calcSegmentu(lista);
    }

    //Reestablece todos los valores de la lista 0-8 0-8
    public static void borralistas(int lista [][]) {
        for (int aba = 0; aba < 9; aba++) {
            for (int bab = 0; bab < 9; bab++) {
                lista [aba][bab] = 0;
            }
        }

    }

    //Suigue las instruciones que se le dio de esperar y manda una orden de impresion
    public static void calcSegmentu(int lista [][]) {
        HelloWorld.printSegment(lista);
        try {
            Thread.sleep(lista[0][0]); // Esperar el valor de lista 0 0 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
    }

    //Ejecuta la orden de impresion segun los valores que se le ha dado
    public static void printSegment(int lista [][]) {
        final int MATRIX_SIZE = 8;
        for (int i = 0; i < MATRIX_SIZE; i++) {
            
            for (int j = 0; j < MATRIX_SIZE; j++) {
                if (1 == lista [i+1][j+1]) {
                    System.out.print(" #");
                } 
                
                else if (2 == lista [i+1][j+1]){
                    System.out.print(" $");
                }
                
                else {
                    System.out.print(" @");
                }
           } 
           System.out.println("");
        }

        

    }
    
}