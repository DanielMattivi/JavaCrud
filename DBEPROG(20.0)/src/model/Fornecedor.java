package model;

public class Fornecedor {
    private String nome;
    private String pais;
    private String cnpj;
    private int codFornecedor;

    //Construct com codFornecedor
    public Fornecedor(String nome, String pais, String cnpj, int codFornecedor) {
        this.nome = nome;
        this.pais = pais;
        this.cnpj = cnpj;
        this.codFornecedor = codFornecedor;
        
    }
    //Construct para CR, Inserir, Pesquisa
    public Fornecedor(String nome, String pais, String cnpj) {
        this.nome = nome;
        this.pais = pais;
        this.cnpj = cnpj;      
    }
    //Construct para EDITAR UPDATE
    public Fornecedor(int codFornecedor, String nome, String pais) {
        this.codFornecedor = codFornecedor;
        this.nome = nome;
        this.pais = pais;    
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "nome=" + nome + ", pais=" + pais + ", cnpj=" + cnpj + ", codFornecedor=" + codFornecedor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codFornecedor;
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
        final Fornecedor other = (Fornecedor) obj;
        return this.codFornecedor == other.codFornecedor;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }
    
    
}
