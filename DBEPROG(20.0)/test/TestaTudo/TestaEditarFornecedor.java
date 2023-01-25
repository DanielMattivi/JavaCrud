/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestaTudo;


import DAO.FornecedorDAO;
import model.Fornecedor;
/**
 *
 * @author Arthur
 */
public class TestaEditarFornecedor {
    
    public static void main(String[] args) {
        Fornecedor frn = new Fornecedor(1, "EletronicaMania", "Japao");
        new FornecedorDAO().editar(frn);
    }
    
}
