/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.VIEW;

/**
 *
 * @author LeKKi
 */
public class relatorioVendaMODEL {
   
    private String modelo;
    private String nomec;
    private String nomef;
    private int codVenda;
    
    public relatorioVendaMODEL(){}
    
    
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the nomec
     */
    public String getNomec() {
        return nomec;
    }

    /**
     * @param nomec the nomec to set
     */
    public void setNomec(String nomec) {
        this.nomec = nomec;
    }

    /**
     * @return the nomef
     */
    public String getNomef() {
        return nomef;
    }

    /**
     * @param nomef the nomef to set
     */
    public void setNomef(String nomef) {
        this.nomef = nomef;
    }

    /**
     * @return the codVenda
     */
    public int getCodVenda() {
        return codVenda;
    }

    /**
     * @param codVenda the codVenda to set
     */
    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    @Override
    public String toString() {
        return "relatorioVendaMODEL{" + "modelo=" + modelo + ", nomec=" + nomec + ", nomef=" + nomef + ", codVenda=" + codVenda + '}';
    }
  
}
