package utec.cs.cs2901.week1;

public class Excercise3 {
    public static void main(String[] args) {
        String[] arr = {"The", "quick", "brown", "fox", "jumped", "over", "the", null};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toLowerCase());
        }
    }
}
