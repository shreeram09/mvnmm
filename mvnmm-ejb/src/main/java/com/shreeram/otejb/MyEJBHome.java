package com.shreeram.otejb;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
import javax.naming.NamingException;

public interface MyEJBHome extends EJBLocalHome {

	MyEJBLocal create() throws CreateException,NamingException;
}
