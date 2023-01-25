package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;
import model.Produto;
import persist.Conexao;



public class ProdutoDAO implements OperacoesDAO{
    
    private static final Connection con = Conexao.getConexao();

    @Override
     public boolean inserir(Object obj) {
        if(obj instanceof Produto) {
            Produto pt = (Produto) obj;
            
            String modelo = pt.getModelo();
            String marca = pt.getMarca();
            String tipo = pt.getTipo();
            Fornecedor fornecedor = pt.getFornecedor();
            
             String sql = "INSERT INTO Produto (modelo, marca, tipo, codFornecedor) VALUES (?, ?, ?, ?)";
            try {
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, modelo);
                pstmt.setString(2, marca);
                pstmt.setString(3, tipo);
                pstmt.setInt(4, fornecedor.getCodFornecedor());
                int res = pstmt.executeUpdate(); 
                if (res == 1) {
                    return true;
            }
        } catch (SQLException ex) {
         System.out.println(ex);
        }
    }
        return false;
    }

                    
                    
    @Override
    public boolean excluir(Object obj) {
        if (obj instanceof Integer) {
            int codProduto = (int) obj;
            String sql = "DELETE FROM Produto WHERE codProduto = " + codProduto;
            System.out.println("sql = " + sql);
            try {
                Statement stmt = con.createStatement();
                stmt.executeUpdate(sql);
                return true;
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return false;
    }

    @Override
    public boolean editar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
@Override 
 public Object pesquisar(Object obj) {
           
        int codProduto = (int) obj;          
            try {
                String sql = "SELECT * FROM Produto WHERE codProduto = " + codProduto;

                
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()){
                                        
                    int codFornecedor = rs.getInt("codFornecedor");

                    Fornecedor fr = (Fornecedor) new FornecedorDAO().pesquisar(codFornecedor);
                     
                    
                    String marca = rs.getString("marca");
                    String modelo = rs.getString("modelo");
                    String tipo = rs.getString("tipo");
                    
                    Produto pt = new Produto(modelo, marca, tipo, codProduto, fr);
                    return pt;
                    

                }
            }
                catch (SQLException ex) {
                System.out.println(ex);

            }
        
        return null;
 }
        
 
 public List pesquisarTudo() {
            ArrayList lista = new ArrayList();
            String sql = "SELECT * FROM produto";
 
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                
                
                int codFornecedor = rs.getInt("codFornecedor");
                Fornecedor fornecedor = (Fornecedor) new FornecedorDAO().pesquisar(codFornecedor);                 
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String tipo = rs.getString("tipo");
                             
                int codProduto = rs.getInt("codProduto");
                

                
                lista.add(new Produto(modelo, marca, tipo, codProduto, fornecedor));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return lista;
    
}

}