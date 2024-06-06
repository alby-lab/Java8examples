package com.demo.proxypattern;

public class DeliveryProxyForTruck extends DeliveryByTruck{

	@Override
	public String deleveryWay(PackageInfo packageInfo) {
		if(packageInfo.getWeight()> 50) {
		return "package delivery by car size is "+packageInfo.getSize() +"and weight is "+packageInfo.getWeight()
		+"not possible due to over weight";
		}
		return super.deleveryWay(packageInfo);
	}
	
}
