/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestaTudo;

import DAO.FuncionarioDAO;
import model.Funcionario;

/**
 *
 * @author Arthur
 */

public class TestaInserirFuncionario {
    public static void main(String[] args) {
        Funcionario fun = new Funcionario("func", "321.534.120-64", "23/12/2000", 4200, "12/02/2005");
            new FuncionarioDAO().inserir(fun);
    }
    
}
