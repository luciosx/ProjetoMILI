/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.funcionariocaixa.service;

import br.com.ifba.mili.funcionariocaixa.model.dao.FuncionarioCaixaDAO;
import br.com.ifba.mili.funcionariocaixa.model.dao.IFuncionarioCaixaDAO;
import br.com.ifba.mili.funcionariocaixa.model.bean.FuncionarioCaixa;
import br.com.ifba.mili.infrastructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author lucio
 */
public class ServiceFuncionarioCaixa implements IServiceFuncionarioCaixa{
    
    public final static String FUNCIONARIOCAIXA_NULL = "Funcionario null";
    
    private final IFuncionarioCaixaDAO funcionarioCaixaDAO = new FuncionarioCaixaDAO();
   
    @Override
    public FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionarioCaixa) {
        
        if(funcionarioCaixa == null){
            throw new BusinessException(FUNCIONARIOCAIXA_NULL);
        }
        
        return this.funcionarioCaixaDAO.save(funcionarioCaixa);
    }
    
    @Override
    public List <FuncionarioCaixa> findByCpfFuncionario(Long CPF){
        return this.funcionarioCaixaDAO.findByCpfFuncionario(CPF);
    }
    
    @Override
    public List <FuncionarioCaixa> login(){
        return this.funcionarioCaixaDAO.login();
    }
    
}
