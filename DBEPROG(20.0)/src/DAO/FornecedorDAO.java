package DAO;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import model.Fornecedor;
import persist.*;

public class FornecedorDAO implements OperacoesDAO{
    
    private static final Connection con = Conexao.getConexao();

    @Override
    public boolean inserir(Object obj) {
        if (obj instanceof Fornecedor) {
            Fornecedor fn = (Fornecedor) obj;
            String nome = fn.getNome();
            String pais = fn.getPais();
            String cnpj = fn.getCnpj();
            
             String sql = "INSERT INTO Fornecedor (nome, pais, cnpj) VALUES (?, ?, ?)";
            try {
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, nome);
                pstmt.setString(2, pais);
                pstmt.setString(3, cnpj);
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
            int codFornecedor = (int) obj;
            String sql = "DELETE FROM fornecedor WHERE codFornecedor =" + codFornecedor;
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
        if (obj instanceof Fornecedor) {
            Fornecedor fr = (Fornecedor) obj;
            String nome = fr.getNome();
            String pais = fr.getPais();
            int codFornecedor = fr.getCodFornecedor();

            try {
                String sql = " UPDATE fornecedor SET nome=?, pais=? WHERE codFornecedor = ? ";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, nome);
                pstmt.setString(2, pais);
                pstmt.setInt(3, codFornecedor);
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
           
        int codFornecedor = (int) obj;
        try {
            String sql = "SELECT * FROM fornecedor WHERE codFornecedor = " + codFornecedor;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                String nome = rs.getString("nome");
                String pais = rs.getString("pais");
                String cnpj = rs.getString("cnpj");
                
                
                Fornecedor fn = new Fornecedor(nome, pais, cnpj, codFornecedor);
                return fn;
            }
        } catch (SQLException sqe) {
            System.out.println(sqe);
        }
        return null;
    }
     public List pesquisarTudo() {
        ArrayList lista = new ArrayList();
        String sql = "SELECT * FROM fornecedor";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String nome = rs.getString("nome");
                String pais = rs.getString("pais");
                String cnpj = rs.getString("cnpj");
                int codFornecedor = rs.getInt("codFornecedor");
                
                lista.add(new Fornecedor(nome, pais, cnpj, codFornecedor));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return lista;
    }
}