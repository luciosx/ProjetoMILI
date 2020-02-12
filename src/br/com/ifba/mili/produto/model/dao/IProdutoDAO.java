/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.produto.model.dao;

import br.com.ifba.mili.infrastructure.dao.IGenericDAO;
import br.com.ifba.mili.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author lucio
 */
public interface IProdutoDAO extends IGenericDAO<Produto>{
    
    public abstract List <Produto> findByNomeProduto(String nomeProduto);
    
    public abstract List <Produto> findByCodBarras(Integer codigoBarras);
    
    
}
