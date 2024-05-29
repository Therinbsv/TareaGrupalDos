public class Katherin {

    /*
     * Serie: 0 1 1 2 3 5 8 13 21 34...
     * @param ksTam1: numero de numeros a mostrar
     */
    public void ksSN1(int ksTam1){
        int ksSum  = 0, 
            ksVal1 = 0, 
            ksVal2 = 1;
        System.out.println();
        System.out.println("*Ejercicio N°1: ");
        for (int i = 0; i < ksTam1; i++) {
            System.out.print(ksSum + " ");
            if(ksSum ==0)
                ksSum += 1;
            else{
                ksSum   = ksVal1 + ksVal2;
                ksVal1  = ksVal2;
                ksVal2  = ksSum;
            }
        }
        System.out.println();
    }

     /*
     * Serie: 0 1 0 3 0 5 0 7 0 9 ...
     * @param ksTam2 : cantidad de numeros a mostrar
     */
    public void ksSN2(int ksTam2) {
        System.out.println();
        System.out.println("*Ejercicio N°2: ");
        for (int i = 0; i < ksTam2; i++) {
            if( i % 2 != 0)
                System.out.print(i + " ");
            else
                System.out.print("0 ");
            
        }
        System.out.println();
    }

    /*
     * Serie: 0/1 1/3 1/5 2/7 3/9...
     * @param ksTam1 : cantidad de numeros a mostrar
     */
    public void ksSN3(int ksTam1) {
        int ksSum  = 0, 
            ksVal1 = 0, 
            ksVal2 = 1;
        System.out.println();
        System.out.println("*Ejercicio N°3: ");   
        ksTam1 *=2;     
        for (int i = 0; i < ksTam1; i++) {
            if( i % 2 != 0){
                System.out.print(ksSum + "/" + i + " ");
                if(ksSum ==0)
                    ksSum += 1;
                else{
                    ksSum   = ksVal1 + ksVal2;
                    ksVal1  = ksVal2;
                    ksVal2  = ksSum;
                }
            }
        }
        System.out.println();
        
    }

    /*
     * Serie: 0/0 1/2 1/4 2/6 3/8...
     * @param ksTam1 : cantidad de numeros a mostrar
     */
    public void ksSN4(int ksTam4){
        int ksSum  = 0, 
            ksVal1 = 0, 
            ksVal2 = 1;
        System.out.println();
        System.out.println("*Ejercicio N°4: ");  
        ksTam4 *=2;      
        for (int i = 0; i < ksTam4; i++) {
            if( i % 2 == 0){
                System.out.print(ksSum + "/" + i + " ");
                if(ksSum ==0)
                    ksSum += 1;
                else{
                    ksSum   = ksVal1 + ksVal2;
                    ksVal1  = ksVal2;
                    ksVal2  = ksSum;
                }
            }
        }
        System.out.println();
    }

    /*
     * Serie: 2 3 5 7 11 13...
     * @param ksTam5 : cantidad de numeros a mostrar
     */
    public void ksSN5(int ksTam5) {
        System.out.println();
        System.out.println("*Ejercicio N°5: ");
        int count = 0; 
        int num = 2;
        while (count < ksTam5) {
            boolean ksNumPrim = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ksNumPrim = false;
                    break;
                }
            }
            if (ksNumPrim) {
                System.out.print(num + " ");
                count++; 
            }
            num++; 
        }
        System.out.println();
    }

    /*
     * Serie: 1 4 9 16 25...
     * @param ksTam6 : cantidad de numeros a mostrar
     */
    public void ksSN6(int ksTam6) {
        int ksSum6 = 0;
        System.out.println();
        System.out.println("*Ejercicio N°6: ");
        ksTam6 *= 2;
        for (int i = 0; i < ksTam6; i++) {
            if(i % 2 != 0){
                ksSum6 +=i; 
                System.out.print(ksSum6 + " ");  
            }
        }
        System.out.println();
    }

    /*
     * Serie: 1 4 7 10 13 16 19 22 25 ...
     * @param ksTam7 : cantidad de numeros a mostrar
     */
    public void ksSN7(int ksTam7) {
        int ksSum7 = 1;
        System.out.println();
        System.out.println("*Ejercicio N°7: ");
        for (int i = 1; i <= ksTam7; i++) {
            System.out.print(ksSum7 + " ");
            ksSum7 +=3;
        }
        System.out.println();
        
    }

    /*
     * Serie: 3 8 13 18 23 28 33 38 43...
     * @param ksTam8 : cantidad de numeros a mostrar
     */
    public void ksSN8(int ksTam8) {
        int ksSum8 = 3;
        System.out.println();
        System.out.println("*Ejercicio N°8: ");
        for (int i = 1; i <= ksTam8; i++) {
            System.out.print(ksSum8 + " ");
            ksSum8 +=5;
        }
        System.out.println();
    }

    /*
     * Serie: 2 4 8 16 32 64 128 256 512 1024...
     * @param ksTam9 : cantidad de numeros a mostrar
     */
    public void ksSN9(int ksTam9) {
        int ksSum9 = 2;
        System.out.println();
        System.out.println("*Ejercicio N°9: ");
        for (int i = 0; i < ksTam9; i++) {
            System.out.print(ksSum9 + " ");
            ksSum9 *= 2;
        }
        System.out.println();
    }

    /*
     * Serie: 3 9 27 81 243 729 2187 6561 19683 59049...
     * @param ksTam10 : cantidad de numeros a mostrar
     */
    public void ksSN10(int ksTam10) {
        int ksSum10 = 3;
        System.out.println();
        System.out.println("*Ejercicio N°10: ");
        for (int i = 0; i < ksTam10; i++) {
            System.out.print(ksSum10 + " ");
            ksSum10 *= 3;
        }
        System.out.println();
    }

    /*
     * Serie: 2 6 12 20 30 42 56 72 90 110 132 156 182 210 240...
     * @param ksTam11 : cantidad de numeros a mostrar
     */
    public void ksSN11(int ksTam11) {
        int ksSum11    = 2,
            ksSumTot11 = 2;
        System.out.println();
        System.out.println("*Ejercicio N°11: ");
        for (int i = 0; i < ksTam11; i++) {
                System.out.print(ksSum11 + " ");
                ksSum11 += ksSumTot11*2;
                ksSumTot11++;
        }
    }

    /*
     * Serie: + - * / + - * / + - * / + - * ...
     * @param ksCantidad : numero de caracteres a mostrar
     */
    public void ksSC4(int ksCantidad) {
        String[] caracters = {"+" , "-" , "*" , "/"};
        
        System.out.println("*Ejercicio N°4: ");
        for (int i = 0; i < ksCantidad; i++) {
            System.out.print(( caracters[i%4] + " ") );
        }
    }
    
}
