package DAO;


import model.Funcionario;
import java.sql.*;
import persist.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO implements OperacoesDAO {
    
    private static final Connection con = Conexao.getConexao();

    @Override
    public boolean inserir(Object obj) {
        if(obj instanceof Funcionario) {
            Funcionario fc = (Funcionario) obj;
            String nome = fc.getNome();
            String cpf = fc.getCpf();
            String dataAdmissao = fc.getDataAdmissao();
            Double salario = fc.getSalario();
            String dataNascimento = fc.getDataNascimento();
            
            String sql = "INSERT INTO funcionario (nome, cpf, dataAdmissao, salario, dataNascimento) VALUES (?, ?, ?, ?, ?)";
            try {
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, nome);
                pstmt.setString(2, cpf);
                pstmt.setString(3, dataAdmissao);
                pstmt.setDouble(4, salario);
                pstmt.setString(5, dataNascimento);
                int res = pstmt.executeUpdate(); // retorna a quantidade de registros inseridos
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
            int codFuncionario = (int) obj;
            String sql = "DELETE FROM Funcionario WHERE codFuncionario =" + codFuncionario;
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
        if (obj instanceof Funcionario) {
            Funcionario fc = (Funcionario) obj;
            Double salario = fc.getSalario();
            String nome = fc.getNome();
            int codFuncionario = fc.getCodFuncionario();
            String dataAdmissao = fc.getDataAdmissao();
            String dataNascimento = fc.getDataNascimento();

            try {
                String sql = " UPDATE funcionario SET nome=?, salario=?, dataNascimento=?, dataAdmissao=? WHERE codFuncionario = ? ";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, nome);
                pstmt.setInt(5, codFuncionario);
                pstmt.setString(4, dataAdmissao);
                pstmt.setDouble(2, salario);
                pstmt.setString(3, dataNascimento);

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

        int codFuncionario = (int) obj;
        
        if (obj instanceof Integer) {
            Funcionario fc = new Funcionario(); 
            
            
            String sql = "SELECT nome, CPF, dataAdmissao, salario, dataNascimento, codFuncionario FROM funcionario WHERE codFuncionario = " + codFuncionario;
        
            try {
                 Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery(sql);
                 while(rs.next()) { 
            
                    fc.setNome(rs.getString(1));
                    fc.setCpf(rs.getString(2));
                    fc.setDataAdmissao(rs.getString(3));
                    fc.setSalario(rs.getDouble(4));
                    fc.setDataNascimento(rs.getString(5));
                    fc.setCodFuncionario(rs.getInt(6));
                    
               }
            return fc;   
        } catch (SQLException ex) {
            System.out.println(ex);
        }
      }
        return null;
    }
 
    public List pesquisarTudo() {
        ArrayList lista = new ArrayList();
        String sql = "SELECT * FROM funcionario";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String dataAdmissao = rs.getString("dataAdmissao");                
                Double salario = rs.getDouble("salario");
                String dataNascimento = rs.getString("dataNascimento");
                int codFuncionario = rs.getInt("codFuncionario");
                
                lista.add(new Funcionario(nome, cpf, dataAdmissao, salario, dataNascimento, codFuncionario));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return lista;
    }
}
