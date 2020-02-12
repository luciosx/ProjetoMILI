/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.infrastructure.service;

import br.com.ifba.mili.cliente.model.bean.Cliente;
import br.com.ifba.mili.fornecedor.model.bean.Fornecedor;
import br.com.ifba.mili.funcionariocaixa.model.bean.FuncionarioCaixa;
import br.com.ifba.mili.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author lucio
 */
public interface IFacede {
    
    public abstract Produto saveProduto(Produto protudo);
    
    public abstract List <Produto> findByNomeProduto(String nomeProduto);
    
    public abstract List <Produto> findByCodBarras (Integer codigoBarras);
    
    public abstract void deleteByCodigoBarras(Produto produto);
    
    public abstract FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionarioCaixa);

    public abstract List <FuncionarioCaixa> findByCpfFuncionario(Long CPF);
    
    public abstract List <FuncionarioCaixa> login();

    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
    

    public abstract Cliente saveCliente(Cliente cliente);
}
