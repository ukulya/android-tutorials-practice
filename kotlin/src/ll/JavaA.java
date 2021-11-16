package ll;

public class JavaA {
    public static int A = 1; // статичные не умирают
    //public static final int C = new JavaPerson(); // static считается дурным тоном - только где надо используем

    public int B;

    public static void main(String[] args ){
        JavaPerson p1 = new JavaPerson();
        p1.name = "Kolya";
        JavaPerson p2 = new JavaPerson();
        p1.name = "Nikita";
        JavaPerson p3 = new JavaPerson();
        p1.name = "Sasha";

        // A; // видит
        // B; // не видит

        System.out.println(p1.name); // Sasha
        System.out.println(p2.name); // Sasha
        System.out.println(p3.name); // Sasha
    }

    public static void xxx2(){

    }
    public static void xxx(){
        JavaPerson ja = new JavaPerson();
        ja.hashCode();
        // ----
    }
}
