package com.demo.proxypattern;

public class DeliveryByCar implements PackageDelivery{

	@Override
	public String deleveryWay(PackageInfo packageInfo) {
		// TODO Auto-generated method stub
		return "package delivery by Car size is "+packageInfo.getSize() +"and weight is "+packageInfo.getWeight();
	}

}
