package TestaTudo;

import model.Cliente;
import DAO.ClienteDAO;


public class TestaExcluirCliente {
    public static void main(String[] args) {
        
        ClienteDAO cldao = new ClienteDAO();
        
       // Cliente cl = (Cliente) cldao.pesquisar(2);
       // System.out.println("Achou = " + cl);
        cldao.excluir(2);
    }
}