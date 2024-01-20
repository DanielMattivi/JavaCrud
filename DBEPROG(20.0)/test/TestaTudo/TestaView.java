
package TestaTudo;


import DAO.ClienteDAO;
import DAO.VIEW.relatorioVendaDAO;
import DAO.VIEW.relatorioVendaMODEL;
import java.util.ArrayList;
import java.util.Iterator;
import model.Cliente;

public class TestaView{
    
    public static void main(String[] args) {
        boolean achou = false;
        relatorioVendaDAO rvdao = new relatorioVendaDAO();
        relatorioVendaMODEL rvm;// = new relatorioVendaMODEL());// rvdao.emitirRelatorio();
       // if (rvm != null) achou = true;
       // System.out.println("Achou? "+achou);
        //System.out.println(rvm);
       // System.out.println("  ");
        System.out.println("--- RESULTADO DO PESQUISAR TUDO ----");
        ArrayList lista = (ArrayList) rvdao.emitirRelatorio();
        //ou isso List lista = atdao.pesquisarTudo();
        
        Iterator it = lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
