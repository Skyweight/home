import java.time.temporal.IsoFields;

class HelloWorld {
    public static void main(String args[]) {
        System.out.println("HELLO!!! :/)");
        HelloWorld.printSegment();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.flush();
        HelloWorld.printSegmentu();

        
        
    }
    
    private static void clearConsole() {
    }

    public static void printSegment() {
        final int MATRIX_SIZE = 8;
        for (int i = 0; i < MATRIX_SIZE; i++) {
            
            for (int j = 0; j < MATRIX_SIZE; j++) {
                int x = i*10+j;
                if (j != 2 && j != 6) {
                    System.out.print(" #");
                } else if (x == 99) {
                    System.out.print(" @");
                }
                
                else {
                    System.out.print(" @");
                }
           } 
           System.out.println("");
        }

        

    }
    public static void printSegmentu() {
        final int MATRIX_SIZE = 8;
        for (int i = 0; i < MATRIX_SIZE; i++) {
            
            for (int j = 0; j < MATRIX_SIZE; j++) {

                if (j != 2 && j != 6) {
                    System.out.print(" #");
                } else {
                    System.out.print(" @");
                }
           } 
           System.out.println("");
        }
    }
    public static void printSegmente() {
        final int MATRIX_SIZE = 8;
        for (int i = 0; i < MATRIX_SIZE; i++) {
            
            for (int j = 0; j < MATRIX_SIZE; j++) {
                int x = i*10+j;
                if (j != 2 && j != 6) {
                    System.out.print(" #");
                } else if (x == 99) {
                    System.out.print(" @");
                }
                
                else {
                    System.out.print(" @");
                }
           } 
           System.out.println("");
        }
    }
}