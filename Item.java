public class Item {
    private String nome;
    private int quantidade;
    private double precoUnitario;

    public Item(String nome, int quantidade, double precoUnitario) { // Dennys construções
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double getSubtotal() { //Não tem todos os getters e setters pq?
        return quantidade * precoUnitario;
    }
    //Adicionei os getters e setters que tava faltando
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    
}
