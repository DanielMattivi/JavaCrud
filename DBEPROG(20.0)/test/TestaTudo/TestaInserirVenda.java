/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestaTudo;

import DAO.ClienteDAO;
import DAO.FuncionarioDAO;
import DAO.ProdutoDAO;
import DAO.VendaDAO;
import model.Cliente;
import model.Funcionario;
import model.Produto;
import model.Venda;
/**
 *
 * @author 08050438
 */
public class TestaInserirVenda {
    public static void main(String[] args) {
       Cliente cl = (Cliente) new ClienteDAO().pesquisar(1);
        //System.out.println(cl.getCodCliente());  
       Produto pr = (Produto) new ProdutoDAO().pesquisar(1);
        //System.out.println(pr.getMarca());
        Funcionario fc = (Funcionario) new FuncionarioDAO().pesquisar(1);
        //System.out.println(fc.getNome()); 
        //Venda ven = new Venda(5, cl, pr, "21/12/1945", fc, 1);

        Venda ven = new Venda(5, cl, pr, "24/11/2022", fc);
        new VendaDAO().inserir(ven);
    }
}