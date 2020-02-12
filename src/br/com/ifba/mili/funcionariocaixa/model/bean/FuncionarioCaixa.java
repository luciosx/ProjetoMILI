/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.funcionariocaixa.model.bean;

import br.com.ifba.mili.infrastructure.model.Funcionario;
import java.io.Serializable;
import javax.persistence.Entity;




/**
 *
 * @author Icaro
 */
@Entity
public class FuncionarioCaixa extends Funcionario implements Serializable{
    
    private String especialização;

    public String getEspecialização() {
        return especialização;
    }

    public void setEspecialização(String especialização) {
        this.especialização = especialização;
    }

    
    
}
