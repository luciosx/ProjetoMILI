/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.cliente.service;

import br.com.ifba.mili.cliente.model.bean.Cliente;

/**
 *
 * @author lucio
 */
public interface IServiceCliente {
    
    
    public abstract Cliente saveCliente(Cliente cliente);
}
