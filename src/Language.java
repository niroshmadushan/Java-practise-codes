public class Language {

    String Language;
    Language(String a){

        Language=a;
        System.out.println(Language + "is Programing Language");
    }

    public static void main(String[] args) {
        Language l =new Language("Sinhala");
        Language l2 =new Language("English");
        Language l3 =new Language("Tamil");

    }
}
