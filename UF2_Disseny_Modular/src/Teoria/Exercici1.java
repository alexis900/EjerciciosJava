package Teoria;

class Num {
    int valor;
}

class Exercici1 {

    int metode1 (int n) {
        return n+2;
    }
    int metode2 (int n) {
        n=7;
        return n+2;
    }
    int metode3 (Integer n) {
        n=18;
        return n+2;
    }
    int metode4 (Num n) {
        n.valor=5;
        return n.valor+2;
    }
    public static void main(String[] args) {
            int n1=10;
            Integer n2=10;
            Num n3=new Num();
            n3.valor=10;
            Exercici1 programa=new Exercici1();
            n1=programa.metode4(n3);
            n1=programa.metode1(n1);
            n1=programa.metode2(n1);
            n2=programa.metode3(n2);
            System.out.printf("n1=%d n2=%d n3=%d\n", n1, n2, n3.valor);
    }
}
