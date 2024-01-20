
package TestaTudo;

import model.Funcionario;
import DAO.FuncionarioDAO;


public class TestaExcluirFuncionario {

    public static void main(String[] args) {
        
        FuncionarioDAO fndao = new FuncionarioDAO();
        
        //Funcionario fn = (Funcionario) fndao.pesquisar(5);
        //System.out.println("Achou = " + fn);
        
        //codFuncionario
        fndao.excluir(1);
    }
}
