
public class Exercise3 {
    public static void main(String[] args) {
        String[] arr = {"The", "quick", "brown", "fox", "jumped", "over", "the", null};
        for(int i = 0; i < arr.length; i++) {
<<<<<<< HEAD:src/utec/cs/cs2901/week1/Excercise3.java
            if (arr[i]!=null) System.out.println(arr[i].toLowerCase());
=======
            if(arr[i] != null) {
                System.out.println(arr[i].toLowerCase());
            }
>>>>>>> a663441bd604f0700eb1f2f53b8b36882090c9fd:HelloWorld/src/utec/cs/cs2901/week1/Exercise3.java
        }
    }
}
