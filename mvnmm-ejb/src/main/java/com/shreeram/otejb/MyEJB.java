package com.shreeram.otejb;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class MyEJB implements SessionBean{

	SessionContext ctx;
	public String welcome(String user) {
		return "welcome "+user+" to "+this.getClass().getCanonicalName();
	}

	@Override
	public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {
		
		this.ctx = ctx;
	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}
}
