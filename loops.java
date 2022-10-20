public class loop {
    public static void main(String[] args) throws Exception {

        String[] myfavefastfood = { "Mcdonalds", "Mang inasal", "Andoks", "Jollibee",  };

        // Loop through an array of strings
        for (int i = 0; i < myfavefastfood.length; i++) {
            System.out.println(myfavefastfood[i]);
        }

        int[] primeNumbers = { 2, 3, 5, 7 };

        // Loop through an array of integers
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.println(primeNumbers[i]);
        }

        char[] myName = { 'E', 'A', 'R', 'L', };

        // Loop through an array of characters
        for (int i = 0; i < myName.length; i++) {
            // System.out.print(myName[i]);
            
            if(!(myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U'))
                System.out.print(myName[i]);
        }
        
        System.out.println("");
        // Print name in reverse
        for (int i = myName.length - 1; i >= 0; i--) {
            System.out.print(myName[i]);
        }
        
        // Using foreach
        for (char i : myName) {
            System.out.print(i);
        }
    }
}
