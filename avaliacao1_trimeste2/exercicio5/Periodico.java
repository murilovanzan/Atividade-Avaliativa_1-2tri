package avaliacao1_trimeste2.exercicio5;

public class Periodico extends Obra{

    private int volume;

    public Periodico(int volume, String titulo){
        super(titulo);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }
}

