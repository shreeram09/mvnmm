package com.shreeram.otejb;

import javax.ejb.EJBLocalObject;

public interface MyEJBLocal extends EJBLocalObject{
	public String welcome(String user);
}
