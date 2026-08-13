package avaliacao1_trimeste2.exercicio5;

public class Livro extends Obra{

    private boolean disponivel;

    public Livro(String titulo){
        super(titulo);
        this.disponivel = true;
    }

    public boolean isDisponivel(){

        if(this.disponivel){
            System.out.print("disponível");
        }
        else{
            System.out.print("emprestado");
        }

        return this.disponivel;
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    public void emprestar(){
        if(!this.disponivel){
            System.out.println("Este livro não está disponível para empréstimo.");
            return;
        }
        else{
            System.out.println("Empréstimo realizado com sucesso.");
            this.disponivel = false;
            return;
        }
    }

    public void devolver(){
        if(this.disponivel){
            System.out.println("Este livro já está disponível.");
            return;
        }
        else{
            System.out.println("Devolução realizada com sucesso.");
            this.disponivel = true;
            return;
        }
    }
}