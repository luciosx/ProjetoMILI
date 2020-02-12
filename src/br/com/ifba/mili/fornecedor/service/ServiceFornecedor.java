/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.fornecedor.service;

import br.com.ifba.mili.fornecedor.dao.FornecedorDAO;
import br.com.ifba.mili.fornecedor.dao.IFornecedorDAO;
import br.com.ifba.mili.fornecedor.model.bean.Fornecedor;
import br.com.ifba.mili.infrastructure.exception.BusinessException;

/**
 *
 * @author lucio
 */
public class ServiceFornecedor implements IServiceFornecedor{
    
    public final static String FORNECEDOR_NULL = "Fornecedor null";
    
    private final IFornecedorDAO fornecedorDAO = new FornecedorDAO();
    
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor){
        
        if(fornecedor == null){
            throw new BusinessException(FORNECEDOR_NULL);
        }
        
        return this.fornecedorDAO.save(fornecedor);
    }
}
