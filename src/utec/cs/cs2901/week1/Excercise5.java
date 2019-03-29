package utec.cs.cs2901.week1;

public class Excercise5 {

    public static int countLetterS(String input) {
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
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
