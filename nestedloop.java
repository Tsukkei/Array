public class multiarray {
    public static void main(String[] args) throws Exception {
   
  // outer loop
  for (int hours = 0; hours < 12; hours++) {

      // inner loop
      for (int minutes = 0; minutes < 60; minutes++) {

        for (int seconds = 0; seconds < 60; seconds++) {

          System.out.println(hours + " : " + minutes + ":" + seconds);
            }
            }
        }
    }
}