
package Beans;

public class ItensB {
    private int cod_produto;
    private String nome_produto;

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
    private int cod_venda;
    private int quanti;
    private double val_por_pro;

    public double getVal_por_pro() {
        return val_por_pro;
    }

    public void setVal_por_pro(double val_por_pro) {
        this.val_por_pro = val_por_pro;
    }

    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    public int getCod_venda() {
        return cod_venda;
    }

    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }

    public int getQuanti() {
        return quanti;
    }

    public void setQuanti(int quanti) {
        this.quanti = quanti;
    }
    
    
    
}
