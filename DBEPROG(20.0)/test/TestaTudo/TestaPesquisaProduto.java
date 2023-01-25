/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestaTudo;

/**
 *
 * @author LeKKi
 */

import DAO.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import model.Produto;

public class TestaPesquisaProduto{
    
    public static void main(String[] args) throws SQLException {
        boolean achou = false;
        ProdutoDAO prdao = new ProdutoDAO();
        
        //INSERIR CODIGO PARA PESQUISAR AQUI ↓↓
        Produto pr = (Produto) prdao.pesquisar(1);
        
        
        //-------------------------------------------
        if (pr != null) achou = true;
        System.out.println("Achou? "+achou);
        System.out.println(pr);
        System.out.println("  ");
        
        
        System.out.println("--- RESULTADO DO PESQUISAR TUDO ----");
        ArrayList lista = (ArrayList) prdao.pesquisarTudo();
        //ou isso List lista = atdao.pesquisarTudo();
        
        Iterator it = lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }}
    