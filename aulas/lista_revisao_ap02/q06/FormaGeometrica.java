// Em um sistema de figuras geométricas, queremos calcular a área de um círculo.
// Crie uma classe FormaGeometrica com um método calcularArea() que retorna
// 0.0 (ou lança uma exceção, indicando que deve ser sobrescrito). Crie uma
// subclasse Circulo que herde de FormaGeometrica e adicione um atributo raio
// (double). O Circulo deve sobrescrever o método calcularArea() para calcular a
// área de um círculo (π⋅raio2). Use Math.PI para o valor de Pi. No main, instancie
// um Circulo, defina o raio e chame calcularArea(), demonstrando a sobrescrita.

public class FormaGeometrica {
    public double calcularArea() {
        return 0.0;
    }
}
