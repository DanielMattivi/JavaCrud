
package TestaTudo;

import DAO.ClienteDAO;
import model.Cliente;


public class TestaEditarCliente {
    
    public static void main(String[] args) {
        //codCliente - Nome - Email
         Cliente cli = new Cliente(2, "Anderson", "andersonsilva@hotmail.com");
         new ClienteDAO().editar(cli);
    } 
}
