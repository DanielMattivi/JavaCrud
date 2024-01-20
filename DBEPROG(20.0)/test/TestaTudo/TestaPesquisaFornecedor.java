package TestaTudo;



import DAO.FornecedorDAO;
import java.util.ArrayList;
import java.util.Iterator;
import model.Fornecedor;

public class TestaPesquisaFornecedor{
    
    public static void main(String[] args) {
        boolean achou = false;
        FornecedorDAO frdao = new FornecedorDAO();
        
        //INSERIR CODIGO DO FORNECEDOR PARA PESQUISAR AQUI ↓↓
        Fornecedor fr= (Fornecedor) frdao.pesquisar(1);
        
        //----------------------------------------------------
        if (fr != null) achou = true;
        System.out.println("Achou? "+ achou);
        System.out.println(fr);
        System.out.println("  ");
        
        
        System.out.println("--- RESULTADO DO PESQUISAR TUDO ----");
        ArrayList lista = (ArrayList) frdao.pesquisarTudo();
        //ou isso List lista = atdao.pesquisarTudo();
        
        Iterator it = lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
    
}
