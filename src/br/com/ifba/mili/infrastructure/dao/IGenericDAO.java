/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.infrastructure.dao;

import br.com.ifba.mili.infrastructure.model.AbstractEntity;

/**
 *
 * @author lucio
 * @param <Entity>
 */
public interface IGenericDAO <Entity extends AbstractEntity> {
    
    
    /**
     * @param obj 
     * @return 
     */
    Entity save(Entity obj);
    
    /**
     *
     * @param obj
     */
    void delete(Entity obj);
    
}
