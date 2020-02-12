/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.infrastructure.dao;



import br.com.ifba.mili.infrastructure.model.AbstractEntity;
import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lucio
 * @param <Entity>
 */

@SuppressWarnings("unchecked")
public class GenericDAO<Entity extends AbstractEntity> implements IGenericDAO<Entity>{
    
    protected static EntityManager em;
    
    static {
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("meuPU");
        em = fac.createEntityManager();
    }
    
    public Entity getById(Long id){
        return (Entity) em.find(getTypeClass(), id);
    }
    
    @Override
    public Entity save(Entity entity){
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        
        return entity;
    }
    
    public void update(Entity entity){
        try{
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }
    
    /**
     *
     * @param entity
     */
    
    public void delete(Entity entity){
        try{
            entity = getById(entity.getId());
            em.getTransaction().begin();
            em.remove(entity);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }
    
    private Class<?> getTypeClass(){
        
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        
        return clazz;
    }
    
}
