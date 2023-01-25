/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestaTudo;

import DAO.FornecedorDAO;
import DAO.ProdutoDAO;
import model.Fornecedor;
import model.Produto;
/**
 *
 * @author 08050438
 */
public class TestaInserirProduto {
    public static void main(String[] args) {
        Fornecedor fr = (Fornecedor) new FornecedorDAO().pesquisar(1);
           
        Produto pro = new Produto("Boeng", "gol", "aviao", fr);
        new ProdutoDAO().inserir(pro);
    }
}
