package com.demo.proxypattern;

public class DeliveryByCycle implements PackageDelivery{

	@Override
	public String deleveryWay(PackageInfo packageInfo) {
		// TODO Auto-generated method stub
		return "package delivery by bicyle size is "+packageInfo.getSize() +"and weight is "+packageInfo.getWeight();
	}

}
