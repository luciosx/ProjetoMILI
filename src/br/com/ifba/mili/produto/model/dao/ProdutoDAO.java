/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.produto.model.dao;

//import br.com.ifba.vp.infrastructure.dao.ConnectionFactory;
import br.com.ifba.mili.infrastructure.dao.GenericDAO;
import br.com.ifba.mili.produto.model.bean.Produto;
import java.util.List;



/**
 *
 * @author lucio
 */
public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO{
    
    @Override
    public List <Produto> findByCodBarras(Integer codigoBarras){
        
        String query = "select p from Produto p where upper(p.codigoBarras) like upper('" + codigoBarras +"%')";
                
        return GenericDAO.em.createQuery(query).getResultList();
    }
    
    @Override
    public List <Produto> findByNomeProduto(String nomeProduto){

        
        String query = "select p from Produto p where upper(p.nomeProduto) like upper('" + nomeProduto +"%')";
        
        
        
        return GenericDAO.em.createQuery(query).getResultList();
    }
            
}
