public class Cachorro extends Animal {
    public String porte;

    public Cachorro(String cor, String nome, String porte) {
        super(cor, 4, nome);
        this.porte = porte;
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanar rabo");
    }
}
