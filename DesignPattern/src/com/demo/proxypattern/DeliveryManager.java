package com.demo.proxypattern;

public class DeliveryManager {
	
	String deliveryManagerFactory(PackageInfo packageInfo) {
		
		if (packageInfo.getSize().equals("SMALL")) {
			
			return new DeliveryProxyForbicyle().deleveryWay(packageInfo);
		}
		
      if (packageInfo.getSize().equals("MEDIAM")) {
			
			return new DeliveryProxyForCar().deleveryWay(packageInfo);
		}
      if (packageInfo.getSize().equals("LARGE")) {
			
			return new DeliveryProxyForTruck().deleveryWay(packageInfo);
		}
      return "FAILED TO DELIVERY";
	}

}
