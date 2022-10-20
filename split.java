public class multiarray {
    public static void main(String[] args) throws Exception {

        char[][] Letters3x3 = {
            {'A', 'B', 'C'},
            {'D', 'E', 'F'},
            {'G', 'H', 'I'},
            {'J', 'K', 'L'},
            {'M', 'N', 'O'},
        };

   
  // outer loop
  for (int row = 0; row < Letters3x3.length; row++) {
        if (row % 2 !=0){
            System.out.print("  " + Letters3x3[row][1]);
        }
        else{
            System.out.print(Letters3x3[row][0] + "   " );
            System.out.print(Letters3x3[row][2] + "   " );
        }
        System.out.println("  ");
    }
