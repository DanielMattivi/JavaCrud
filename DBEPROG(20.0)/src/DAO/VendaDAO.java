/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import model.Venda;
import persist.Conexao;
import java.sql.*;
import model.Cliente;
import model.Funcionario;
import model.Produto;

/**
 *
 * @author 08050440 */
 
public class VendaDAO implements OperacoesDAO{
    
    private static final Connection con = Conexao.getConexao();

    @Override
    public boolean inserir(Object obj) {
        if(obj instanceof Venda) {
            Venda ve = (Venda) obj;
            int quantidade = ve.getQuantidade();
            String dataVenda = ve.getDataVenda();
            Cliente cliente = ve.getCliente();
            Produto produto = ve.getProduto();
            Funcionario funcionario = ve.getFuncionario();
            
            
            String sql = "INSERT INTO venda (quantidade, codCliente, codProduto, dataVenda, codFuncionario) VALUES (?, ?, ?, ?, ?)";
            try {
                PreparedStatement pstmt = con.prepareStatement (sql);
                pstmt.setInt(1, quantidade);
                pstmt.setInt(2, cliente.getCodCliente());             
                pstmt.setInt(3, produto.getCodProduto());
                pstmt.setString(4, dataVenda);
                pstmt.setInt(5, funcionario.getCodFuncionario());               
                

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
            int codVenda = (int) obj;
            String sql = "DELETE FROM venda WHERE codVenda = " + codVenda;
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
        if (obj instanceof Venda) {
            Venda vd = (Venda) obj;
            int quantidade = vd.getQuantidade();
            int codVenda = vd.getCodVenda();
            

            try {
                String sql = "UPDATE venda SET quantidade = ? WHERE codVenda = ? ";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setInt(1, quantidade); 
                pstmt.setInt(2, codVenda);
                int res = pstmt.executeUpdate(); // retorna a quantidade de registros inseridos
                if (res == 1) {
                    return true;
                }
            } catch (SQLException sqe) {
                sqe.printStackTrace();
            }

        }
        return false;

    }

    @Override
    public Object pesquisar(Object obj) {
        
            int codVenda = (int) obj;
        
            if (obj instanceof Integer) {
            
            String sql = "SELECT quantidade, dataVenda, codVenda, codCliente, codFuncionario, codProduto FROM venda WHERE codVenda = '" + codVenda + "'";

            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()){ 
                    
                    
                    int quantidade = rs.getInt(1);
                    String dataVenda = rs.getString(2);
                                                                 
                    int codCliente = rs.getInt(4);
                    Cliente cliente = (Cliente) new ClienteDAO().pesquisar(codCliente);
                 
                    int codFuncionario = rs.getInt(5);
                    Funcionario funcionario = (Funcionario) new FuncionarioDAO().pesquisar(codFuncionario);
                    
                    int codProduto = rs.getInt(6);
                    Produto produto = (Produto) new ProdutoDAO().pesquisar(codProduto);                    
                    
                    Venda ve = new Venda(quantidade, cliente, produto, dataVenda, funcionario, codVenda); 
                    
                    return ve;                
                }


            } catch (SQLException ex) {
                System.out.println(ex);

            }
        }
        return null;
    }
    
}
