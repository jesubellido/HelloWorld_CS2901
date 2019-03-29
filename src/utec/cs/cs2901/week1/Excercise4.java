package utec.cs.cs2901.week1;

public class Excercise4 {
    private static String[] texts = new String[]{"find","the","bug"};
    private static boolean contains(String text){
        for(String item : texts){
            if( item.equals(text.toLowerCase())){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(contains("the"));
        System.out.println(contains("THE"));
        System.out.println(contains("ThE"));
        System.out.println(contains("tHe"));
    }
}
