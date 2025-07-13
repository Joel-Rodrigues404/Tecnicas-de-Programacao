public class Cachorro extends Animal {
    private String porte;

    public Cachorro(String cor, String nome, String porte) {
        super(cor, 4, nome);
        this.porte = porte;
    }

    @Override
    public void fazerSom() {
        System.out.println(this.nome + " lati");
    }

    public String getPorte() {
        return porte;
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanar rabo");
    }
}
