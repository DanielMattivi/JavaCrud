/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestaTudo;

import DAO.VendaDAO;

/**
 *
 * @author 08050438
 */
public class TestaExcluirVenda {
    public static void main(String[] args) {
        
        VendaDAO vndao = new VendaDAO();
        
        //Produto pro = (Produto) prodao.pesquisar(1);
        //System.out.println("Achou =" + pro);
        vndao.excluir(1);
    }
    
}
