/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestaTudo;

import model.Funcionario;
import DAO.FuncionarioDAO;

/**
 *
 * @author Arthur
 */
public class TestaExcluirFuncionario {

    public static void main(String[] args) {
        
        FuncionarioDAO fndao = new FuncionarioDAO();
        
        //Funcionario fn = (Funcionario) fndao.pesquisar(5);
        //System.out.println("Achou = " + fn);
        
        //codFuncionario
        fndao.excluir(1);
    }
}
