public class Main {

    public static void main(String[] args) {
        Carro carro1 = new Carro("hilux", 10);

        carro1.exibirVelocidade();
        carro1.acelerar();
        carro1.exibirVelocidade();
        carro1.frear();
        carro1.exibirVelocidade();
    }
}
