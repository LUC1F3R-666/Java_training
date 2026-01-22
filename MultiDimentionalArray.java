public class MultiDimentionalArray {
    public static void main(String[] args) {
        int multiArray[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                multiArray[i][j] = Math.abs((int)(Math.random()*10)); 
                //we can use here *10 to get single digit numbers and *100 for double digit numbers  
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

//another methode by using single array
        for(int n[] : multiArray){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println();

        //jagged array
        int jaggedArray[][] = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[4];  
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = Math.abs((int)(Math.random()*10)); 
            }
        }
        for (int n[] : jaggedArray) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        

    }
    
}
