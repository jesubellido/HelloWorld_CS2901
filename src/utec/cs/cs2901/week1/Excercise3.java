package utec.cs.cs2901.week1;

public class Excercise3 {
    public static void main(String[] args) {
        String[] arr = {"The", "quick", "brown", "fox", "jumped", "over", "the", null}; //En java null es un objeto por eso puede entrar en un array de strings
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]!=null)
            System.out.println(arr[i].toLowerCase());
        }
    }
}
