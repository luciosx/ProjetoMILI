/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.funcionariocaixa.model.dao;

import br.com.ifba.mili.funcionariocaixa.model.bean.FuncionarioCaixa;
import br.com.ifba.mili.infrastructure.dao.GenericDAO;
import java.util.List;

/**
 *
 * @author Icaro
 */
public class FuncionarioCaixaDAO extends GenericDAO<FuncionarioCaixa> implements IFuncionarioCaixaDAO{
    
    @Override
    public List <FuncionarioCaixa> findByCpfFuncionario(Long CPF){
        
        
        
        String query = "select f from Pessoa f where upper(f.CPF) like upper('" + CPF +"%')";
        
        
        
        return GenericDAO.em.createQuery(query).getResultList();
    }
    
    @Override
    public List <FuncionarioCaixa> login(){
        
        String query = "select f from Funcionario f";
        
        return GenericDAO.em.createQuery(query).getResultList();
    }
    
    /*
    Codigo antigo
    public void create(FuncionarioCaixa FC){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        
        try {
            
            stm = con.prepareStatement("INSERT INTO funcionario(nomeFunc, senha, sexoFunc, ruaFunc, rgFunc,\n" +
"    bairroFunc, numero, cidadeFunc, estadoFunc, cepFunc, emailFunc, cpfFunc, especializacao,\n" +
"    telefoneFunc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stm.setString(1, FC.getNome());
            stm.setInt(2, FC.getSenha());          
            stm.setString(3, FC.getSexo());
            stm.setString(4, FC.getRua());
            stm.setInt(5, FC.getRG());
            stm.setString(6, FC.getBairro());
            stm.setInt(7, FC.getNumero());
            stm.setString(8, FC.getCidade());
            stm.setString(9, FC.getEstado());
            stm.setInt(10, FC.getCEP());
            stm.setString(11,FC.getEmail());
            stm.setLong(12, FC.getCPF());
            stm.setString(13, FC.getEspecialização());
            stm.setLong(14, FC.getTelefone());
            
            stm.executeUpdate();
                             
            } catch (SQLException ex) {
                System.out.println("Erro ao salvar!" + ex);
        }finally{
            ConnectionFactory.fechaConexao(con, stm);
        }
        
    }
    
    public FuncionarioCaixa read(long chave){
        
        String sql = "SELECT * FROM funcionario where cpfFunc = ?";
        FuncionarioCaixa fc = new FuncionarioCaixa();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            
            stm = con.prepareStatement(sql);
            stm.setLong(1, chave);
            rs = stm.executeQuery();
            
            while(rs.next()){
     
                fc.setNome(rs.getString("nomeFunc"));
                fc.setRG(rs.getInt("rgFunc"));
                
            }  
            
        } catch (SQLException ex) {
            System.out.println("Erro ao ler!" + ex);
        }
        finally{
            ConnectionFactory.fechaConexao(con, stm, rs);
        }
        
        return fc;
        
    }
    
    public List <FuncionarioCaixa> Login(){
        
        String sql = "SELECT * FROM funcionario";
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        List<FuncionarioCaixa> funcionario = new ArrayList();
        
        try {
            
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            
            while(rs.next()){
                
                FuncionarioCaixa FC = new FuncionarioCaixa();
                
                FC.setNome(rs.getString("nomeFunc"));
                FC.setRG(rs.getInt("rgFunc"));
                FC.setCPF(rs.getLong("cpfFunc"));
                FC.setSenha(rs.getInt("senha"));
                
                funcionario.add(FC);
                
            }  
            
        } catch (SQLException ex) {
            System.out.println("Erro ao realizar login!" + ex);
        }
        finally{
            ConnectionFactory.fechaConexao(con, stm, rs);
        }
        
        return funcionario;
        
    }*/
          
}
