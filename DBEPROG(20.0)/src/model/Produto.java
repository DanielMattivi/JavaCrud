package model;

import java.util.Objects;
import model.Fornecedor;

public class Produto {
    private String modelo;
    private String marca;
    private String tipo;
    private int codProduto;
    private Fornecedor fornecedor;

    public Produto(String modelo, String marca, String tipo, int codProduto, Fornecedor fornecedor) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.codProduto = codProduto;
        this.fornecedor = fornecedor;
        // arruma o fornecedor
    }
    
    public Produto(String modelo, String marca, String tipo, Fornecedor fornecedor) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.fornecedor = fornecedor;
    }
     //CONSTRUCT PESQUISAR TUDO
    public Produto(String modelo, String marca, String tipo, int codProduto) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.codProduto = codProduto;
    }    
    
    
    public Produto() {}; 

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codProduto);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.codProduto, other.codProduto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{" + "modelo=" + modelo + ", marca=" + marca + ", tipo=" + tipo + ", codProduto=" + codProduto + ", fornecedor=" + fornecedor + '}';
    }
}
