package avaliacao1_trimeste2.exercicio4;

public class Main {

    public static void main(String[] args) {
        int qtdNotas = 5;
        double media;

        Estudante e = new Estudante("m",qtdNotas);

        e.insereNotas();
        int[] pesos = {1,2,2,3,2};
        System.out.println(e.calculaMedia(pesos));
    }

}
