/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestaTudo;

/**
 *
 * @author LeKKi
 */

import DAO.ClienteDAO;
import java.util.ArrayList;
import java.util.Iterator;
import model.Cliente;

public class TestaPesquisaCliente{
    
    public static void main(String[] args) {
        boolean achou = false;
        ClienteDAO cldao = new ClienteDAO();
        //CODIGO PARA PESQUISAR AQUI ↓↓↓↓↓↓↓↓↓
        Cliente cl= (Cliente) cldao.pesquisar(1);
        
        
        if (cl != null) achou = true;
        System.out.println("Achou? "+achou);
        System.out.println(cl);
        System.out.println("  ");
        System.out.println("--- RESULTADO DO PESQUISAR TUDO ----");
        ArrayList lista = (ArrayList) cldao.pesquisarTudo();
        //ou isso List lista = atdao.pesquisarTudo();
        
        Iterator it = lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
    
}