package com.parameta.dao;

import java.io.Console;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.parameta.model.Empleado;
import com.parameta.persistence.HibernateUtil;

public class ServiceDAOImpl implements ServiceDAO{

	private Session hibernateSession;
    private Transaction tx; 
	
	@PostConstruct
	public void init() {
		this.hibernateSession = HibernateUtil.getSessionFactory().getCurrentSession();
	}
	
	@PreDestroy
	private void cerrarHibernateSession(){
		HibernateUtil.shutdown();
	}

	@Override
	public Empleado getEmpleado(int id) {
		
		this.hibernateSession = HibernateUtil.getSessionFactory().openSession(); 
        tx = this.hibernateSession.beginTransaction(); 

        Empleado empleado = null;  
        try 
        { 
            empleado = (Empleado) this.hibernateSession.get(Empleado.class, id); 
        }catch(Exception e){
        	System.out.println("error al obtener empleado");
        } finally 
        { 
        	this.hibernateSession.close(); 
        }  

        return empleado;
	}

	@Override
	public long agregarEmpleado(Empleado empleado) {
        long id = 0;  

        try 
        { 
    		this.hibernateSession = HibernateUtil.getSessionFactory().openSession(); 
            tx = this.hibernateSession.beginTransaction(); 
            this.hibernateSession.save(empleado); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
        	System.out.println("error al obtener empleado");
        } finally 
        { 
        	id = empleado.getIdEmpleado();
        	this.hibernateSession.close(); 
        }  

        return id;
	}

	
}
