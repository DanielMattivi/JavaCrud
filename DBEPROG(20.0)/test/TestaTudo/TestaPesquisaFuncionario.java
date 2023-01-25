/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestaTudo;

/**
 *
 * @author LeKKi
 */

import DAO.FuncionarioDAO;
import java.util.ArrayList;
import java.util.Iterator;
import model.Funcionario;

public class TestaPesquisaFuncionario{
    
    public static void main(String[] args) {
        boolean achou = false;
        FuncionarioDAO fcdao = new FuncionarioDAO();
        
        //INSERIR CODIGO PARA PESQUISAR AQUI ↓↓
        Funcionario fc= (Funcionario) fcdao.pesquisar(1);
        
        //-----------------------------------------------------------------------
        if (fc != null) achou = true;
        System.out.println("Achou? "+achou);
        System.out.println(fc);
        System.out.println("  ");
        
        System.out.println("--- RESULTADO DO PESQUISAR TUDO ----");
        ArrayList lista = (ArrayList) fcdao.pesquisarTudo();
        //ou isso List lista = atdao.pesquisarTudo();
        
        Iterator it = lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
    
}