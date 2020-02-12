/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.funcionariocaixa.model.dao;

import br.com.ifba.mili.funcionariocaixa.model.bean.FuncionarioCaixa;
import br.com.ifba.mili.infrastructure.dao.IGenericDAO;
import java.util.List;

/**
 *
 * @author lucio
 */
public interface IFuncionarioCaixaDAO extends IGenericDAO<FuncionarioCaixa>{
    
    public abstract List <FuncionarioCaixa> findByCpfFuncionario(Long CPF);
    
    public abstract List <FuncionarioCaixa> login();
    
}
