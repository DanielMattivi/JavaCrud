
package TestaTudo;

import model.Venda;
import DAO.VendaDAO;


public class TestaEditarVenda {
    
    public static void main(String[] args) {
        Venda vnd = new Venda(10, 2);
        new VendaDAO().editar(vnd);
    }
    
}
