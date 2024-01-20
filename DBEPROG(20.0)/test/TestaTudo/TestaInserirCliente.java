package TestaTudo;

import DAO.ClienteDAO;
import model.Cliente;



public class TestaInserirCliente {
     public static void main(String[] args) {
     Cliente cli = new Cliente("paula", "622.262.590-82", "dsadasd@gmail.com");
        new ClienteDAO().inserir(cli);
    }

}
