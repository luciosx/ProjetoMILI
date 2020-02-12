/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.produto.service;

import br.com.ifba.mili.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author lucio
 */
public interface IServiceProduto {
    
    
    public abstract Produto saveProduto(Produto produto);
    
    public abstract List <Produto> findByNomeProduto(String nomeProduto); 
    
    public abstract List <Produto> findByCodBarras(Integer codigoBarras);
    
    public abstract void deleteByCodigoBarras(Produto produto);
}
