/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestaTudo;

/**
 *
 * @author LeKKi
 */

import DAO.VendaDAO;
import java.sql.SQLException;
import model.Venda;

public class TestaPesquisaVenda{
    
    public static void main(String[] args) throws SQLException {
        boolean achou = false;
        VendaDAO vedao = new VendaDAO();
        
        
        //INSERIR CODIGO PARA PESQUISAR AQUI ↓↓
        Venda ve = (Venda) vedao.pesquisar(1);    
        
        //-----------------------------------------------------------
        if (ve != null) achou = true;
        System.out.println("Achou? "+achou);
        
        achou = false;
        ve= (Venda) vedao.pesquisar(4);
        if (ve != null) achou = true;
        System.out.println(ve);
      
        
        }
    }
    