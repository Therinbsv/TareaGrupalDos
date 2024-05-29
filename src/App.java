import java.util.Scanner;
public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int KsNroTermino = 0; 
        Katherin ks = new Katherin();
        System.out.println("~~~~~~~~~~~SERIES NUMERICAS~~~~~~~~~~~");
        do {
            try {
                System.out.print("Ingrese cantidad de terminos que desea ver: ");
                KsNroTermino = sc.nextInt();
            } 
            catch (Exception e) { 
                System.out.println("***Asegurese que el valor ingresado sea correcto***");
                sc.next();
            }
        } while (KsNroTermino<=0);

        ks.ksSN1(KsNroTermino);
        ks.ksSN2(KsNroTermino);
        ks.ksSN3(KsNroTermino);
        ks.ksSN4(KsNroTermino);
        ks.ksSN5(KsNroTermino);
        ks.ksSN6(KsNroTermino);
        ks.ksSN7(KsNroTermino);
        ks.ksSN8(KsNroTermino);
        ks.ksSN9(KsNroTermino);
        ks.ksSN10(KsNroTermino);
        ks.ksSN11(KsNroTermino);
        
    }
}
