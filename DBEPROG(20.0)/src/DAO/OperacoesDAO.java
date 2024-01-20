
package DAO;


public interface OperacoesDAO {
    
    public boolean inserir (Object obj);
    
    public boolean excluir (Object obj);
    
    public boolean editar (Object obj);
    
    public Object pesquisar (Object obj);
}
