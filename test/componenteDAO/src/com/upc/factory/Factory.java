package com.upc.factory;

import com.upc.dao.IAfpdao;
import com.upc.dao.ISimulaciondao;
import com.upc.dao.ITipoComisiondao;
import com.upc.dao.ITipoFondodao;
import com.upc.dao.IUsuariodao;
import com.upc.dao.impl.Afpdao;
import com.upc.dao.impl.Simulaciondao;
import com.upc.dao.impl.TipoComisiondao;
import com.upc.dao.impl.TipoFondodao;
import com.upc.dao.impl.Usuariodao;

public class Factory {

private static Factory fac;
	
	private Factory(){
		
	}
	
	
	public static Factory getInstance(){
		if(fac==null)
			fac=new Factory();
		return fac;
	}
	
	
	public IAfpdao getAfpdao(){
		return new Afpdao();
	}
	
	public ISimulaciondao getSimulaciondao(){
		return new Simulaciondao();
	}
	
	public ITipoComisiondao getTipoComisiondao(){
		return new TipoComisiondao();
	}
	
	public ITipoFondodao getTipoFondodao(){
		return new TipoFondodao();
	}
	
	public IUsuariodao getUsuariodao(){
		return new Usuariodao();
	}
}
