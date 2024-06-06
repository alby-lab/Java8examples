package com.demo.proxypattern;

public class ProxyPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********Delivery manager process is started**********");
		DeliveryManager deliveryManager=new DeliveryManager();
		
		PackageInfo smallPackageInfo=new PackageInfo("SMALL", 5);
		System.out.println(deliveryManager.deliveryManagerFactory(smallPackageInfo));
		PackageInfo mediamPackageInfo=new PackageInfo("MEDIAM", 12);
		System.out.println(deliveryManager.deliveryManagerFactory(mediamPackageInfo));
		PackageInfo largePackageInfo=new PackageInfo("LARGE", 53);
		System.out.println(deliveryManager.deliveryManagerFactory(largePackageInfo));

	}

}
