
package TestaTudo;


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
    
