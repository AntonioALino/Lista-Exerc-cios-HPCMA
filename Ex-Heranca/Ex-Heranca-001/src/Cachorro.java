public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "O seu cachorro se chama " + getNome() + " ele tem " + getIdade() + " e sua raça é: " + raca;
    }
}
