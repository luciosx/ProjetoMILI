/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.fornecedor.service;

import br.com.ifba.mili.fornecedor.model.bean.Fornecedor;

/**
 *
 * @author lucio
 */
public interface IServiceFornecedor {
    
    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
    
}
