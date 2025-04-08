public class Produto {
    private String nome;
    private double preco;
    private double descontoPercentual;

    public Produto(String nome, double preco, double descontoPercentual){
        this.nome = nome;
        this.preco = preco;
        this.descontoPercentual = descontoPercentual;
    }

    public double calcularPrecoFinal() {
        return preco - (preco * descontoPercentual);
    }

    public void exibirInformacoes(){
        System.out.println(nome + " - Preço final: R$" + calcularPrecoFinal());
    }
}
