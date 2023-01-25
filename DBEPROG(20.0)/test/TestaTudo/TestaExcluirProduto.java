/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestaTudo;

import DAO.ProdutoDAO;
import model.Produto;

/**
 *
 * @author 08050438
 */
public class TestaExcluirProduto {
    public static void main(String[] args) {
        
        ProdutoDAO prodao = new ProdutoDAO();
        
        //Produto pro = (Produto) prodao.pesquisar(1);
        //System.out.println("Achou =" + pro);
        prodao.excluir(2);
    }
    
}
