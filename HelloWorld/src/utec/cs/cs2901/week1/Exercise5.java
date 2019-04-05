public class Exercise5 {

    public static int countLetterS(String input) {
        int count = 0;
<<<<<<< HEAD:src/utec/cs/cs2901/week1/Excercise5.java
        for(int i = 0; i < input.length(); i++) {
=======
        for(int i = 0; i <= input.length() -1; i++) {
            
>>>>>>> a663441bd604f0700eb1f2f53b8b36882090c9fd:HelloWorld/src/utec/cs/cs2901/week1/Exercise5.java
            if(input.substring(i,i+1).equals("s")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int letters = countLetterS("sFind tshe bugs :)");
        System.out.println(letters);
    }
}
