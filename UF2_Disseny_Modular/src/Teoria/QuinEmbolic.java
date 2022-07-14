package Teoria;

public class QuinEmbolic {
    int I,J,K;
    
    int petitEmbolic(int I) {
        I=J+K;
        return I;
    }
    void migEmbolic(int J) {
        J=petitEmbolic(J);
        I=J+K;
    }

    int granEmbolic(int K) {
        K=petitEmbolic(K);
        migEmbolic(J);
        I=J+K;
        return K;
    }
    
    public static void main(String[] args) {
        QuinEmbolic programa=new QuinEmbolic();
        
        programa.I=10;
        programa.J=10;
        programa.K=10;
        
        programa.K=programa.petitEmbolic(programa.K);
        programa.migEmbolic(programa.K);
        programa.K=programa.granEmbolic(programa.K);
        
        System.out.printf("I=%d J=%d K=%d\n", programa.I, programa.J, programa.K);
    }
}