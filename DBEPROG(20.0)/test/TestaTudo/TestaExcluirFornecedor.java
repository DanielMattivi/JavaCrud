
package TestaTudo;
import model.Fornecedor;
import DAO.FornecedorDAO;


public class TestaExcluirFornecedor {
    
    public static void main(String[] args) {
        
        FornecedorDAO frdao = new FornecedorDAO();
        
        //Fornecedor fr = (Fornecedor) frdao.pesquisar("86.056.252/0001-58");
        //System.out.println("Achou = " + fr);
        
        
        frdao.excluir(1); //Excluir fornecedor utilizando o codFornecedor.
        
        
    }
    
}
