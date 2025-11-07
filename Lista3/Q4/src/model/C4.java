package model;

public class C4 extends C2 {
    private String categoria;

    public C4(String nome, int valor, String categoria) {
        super(nome, valor);
        this.categoria = categoria;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("C4 -> Nome: " + nome + ", Valor: " + valor + ", Categoria: " + categoria);
    }
}
