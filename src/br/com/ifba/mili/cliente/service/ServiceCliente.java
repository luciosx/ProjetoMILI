/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.cliente.service;

import br.com.ifba.mili.cliente.dao.ClienteDAO;
import br.com.ifba.mili.cliente.dao.IClienteDAO;
import br.com.ifba.mili.cliente.model.bean.Cliente;
import br.com.ifba.mili.infrastructure.exception.BusinessException;

/**
 *
 * @author lucio
 */
public class ServiceCliente implements IServiceCliente{
    
    public final static String CLIENTE_NULL = "Cliente null";
    
    private final IClienteDAO clienteDAO = new ClienteDAO();
    
    @Override
    public Cliente saveCliente(Cliente cliente){
        
        if(cliente == null){
            throw new BusinessException(CLIENTE_NULL);
        }
        
        return this.clienteDAO.save(cliente);
    }
    
}

