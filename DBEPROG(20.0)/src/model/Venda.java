package model;

public class Venda {
    private int quantidade;
    private Cliente cliente;
    private Produto produto;
    private String dataVenda;
    private Funcionario funcionario;
    private int codVenda;

    
    public Venda(int quantidade, Cliente cliente, Produto produto, String dataVenda, Funcionario funcionario, int codVenda) {
        this.quantidade = quantidade;
        this.cliente = cliente;
        this.produto = produto;
        this.dataVenda = dataVenda;
        this.funcionario = funcionario;        
        this.codVenda = codVenda;
    }
    
    public Venda(int quantidade, Cliente cliente, Produto produto, String dataVenda, Funcionario funcionario) {
        this.quantidade = quantidade;
        this.cliente = cliente;
        this.produto = produto;
        this.dataVenda = dataVenda;
        this.funcionario = funcionario;
    }    
    
    //
    public Venda(int quantidade, int codVenda) {
        this.quantidade = quantidade;
        this.codVenda = codVenda;

    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

 
    /**
     * @return the Quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the Quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the id
     */
    public int getCodVenda() {
        return codVenda;
    }

    /**
     * @param codVenda
     */
    public void setId(int codVenda) {
        this.codVenda = codVenda;
    }

    /**
    /**
     * @return the dataCompra
     */
    public String getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda
     */
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the produtos
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Venda{" + "quantidade=" + quantidade + ", código de venda=" + codVenda + ", cliente=" + cliente + ", produtos=" + produto + ", data da venda=" + dataVenda + ", funcionario=" + funcionario+'}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.codVenda;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venda other = (Venda) obj;
        if (this.codVenda != other.codVenda) {
           
        }
        return true;
    }

    
    
    
}
