
package TestaTudo;

import DAO.FuncionarioDAO;
import model.Funcionario;


public class TestaEditarFuncionario {
    
    public static void main(String[] args) {
         Funcionario fun = new Funcionario(1, "Dio", "12/02/2020", 2500, "12/02/2000");
         new FuncionarioDAO().editar(fun);
    }
    
}
