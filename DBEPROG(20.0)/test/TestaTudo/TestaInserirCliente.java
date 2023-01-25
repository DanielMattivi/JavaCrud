package TestaTudo;
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template




import DAO.ClienteDAO;
import model.Cliente;



/**
 *
 * @author LeKKi
 */
public class TestaInserirCliente {
     public static void main(String[] args) {
     Cliente cli = new Cliente("paula", "622.262.590-82", "dsadasd@gmail.com");
        new ClienteDAO().inserir(cli);
    }

}
