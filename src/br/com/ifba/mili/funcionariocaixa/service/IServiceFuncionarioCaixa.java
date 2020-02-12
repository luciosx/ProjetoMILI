/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.funcionariocaixa.service;

import br.com.ifba.mili.funcionariocaixa.model.bean.FuncionarioCaixa;
import java.util.List;

/**
 *
 * @author lucio
 */
public interface IServiceFuncionarioCaixa {
    
    public abstract FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionarioCaixa);
    
    public abstract List <FuncionarioCaixa> findByCpfFuncionario(Long CPF);
 
    public abstract List <FuncionarioCaixa> login();
}
