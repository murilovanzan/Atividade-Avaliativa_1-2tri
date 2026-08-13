package avaliacao1_trimeste2.exercicio5;

public class Main {

    public static void main(String[] args) {

        Livro sixseven = new Livro("A Empregada");

        boolean disponibilidade = sixseven.isDisponivel();
        System.out.printf("\n");
        if(disponibilidade){
            System.out.println("Return funciona");
        }
        sixseven.emprestar();
        disponibilidade = sixseven.isDisponivel();
        System.out.printf("\n");
        sixseven.emprestar();
        if(!disponibilidade){
            System.out.println("Return funciona");
        }
        sixseven.devolver();
        sixseven.isDisponivel();
        System.out.printf("\n");
        sixseven.devolver();
    }
}
