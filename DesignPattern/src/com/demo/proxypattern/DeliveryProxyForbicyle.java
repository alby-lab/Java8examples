package com.demo.proxypattern;

public class DeliveryProxyForbicyle extends DeliveryByCycle{

	
	@Override
	public String deleveryWay(PackageInfo packageInfo) {
		if(packageInfo.getWeight()>5){
		
		return "package delivery by bicyle size is "+packageInfo.getSize() +"and weight is "+packageInfo.getWeight()
		+"not possible due to over weight";
	}
	return super.deleveryWay(packageInfo);
	
	}
}
