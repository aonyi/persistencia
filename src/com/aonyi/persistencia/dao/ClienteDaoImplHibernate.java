/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aonyi.persistencia.dao;

import com.aonyi.persistencia.controlador.HibernateSession;
import com.aonyi.persistencia.modelo.Cliente;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author faguirre
 */
public class ClienteDaoImplHibernate implements IClienteDao {    

    @Override
    public List<Cliente> getLista() {
        Session session = HibernateSession.getSession();
        Criteria criteria = session.createCriteria(Cliente.class);
        return criteria.list();
    }

    @Override
    public Cliente get(int id) {
        Session session = HibernateSession.getSession();
        return (Cliente) session.get(Cliente.class, id);        
    }

    @Override
    public void save(Cliente cliente) {
        Session session = HibernateSession.getSession();
        session.beginTransaction();
        session.merge(cliente);
        session.getTransaction().commit();        
    }

    @Override
    public void delete(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
