public class Gato extends Animal{

    private String pelagem;

    public Gato(String nome, int idade, String pelagem){
        super(nome, idade);
        this.pelagem = pelagem;
    }

    @Override
    public String toString() {
        return "O seu gato se chama " + getNome() + " ele tem " + getIdade() + " e sua pelagem é: " + pelagem;
    }
}
