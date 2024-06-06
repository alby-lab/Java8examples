package com.demo.proxypattern;

public class DeliveryByTruck implements PackageDelivery {

	@Override
	public String deleveryWay(PackageInfo packageInfo) {
		// TODO Auto-generated method stub
		return "package delivery by Truck size is "+packageInfo.getSize() +"and weight is "+packageInfo.getWeight();
	}

}
