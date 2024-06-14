package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
	
	
 public Order(int orderId, List<Product> productList) {
		super();
		this.orderId = orderId;
		this.productList = productList;
	}

private int orderId;
private List<Product>productList;
 
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public List<Product> getProductList() {
	return productList;
}
public void setProductList(List<Product> productList) {
	this.productList = productList;
}
 
 public static void main(String args[]) {
	
	 
       List<Product>products =new ArrayList<Product>();
       List<Product>products1 =new ArrayList<Product>();
       products.add(new Product(1, 5000));
	   products.add(new Product(2,2000)) ;
	   products.add(new Product(3, 6000));
	   products.add(new Product(4, 10000)) ;
	   products1.add(new Product(1, 1000)) ;
	   products1.add(new Product(2, 7000)) ;
	   products1.add(new Product(3, 80000)) ;
	   products1.add(new Product(4, 21000)); 
	 Order order =new Order(1, products);
	 Order order1 =new Order(2, products1);
	 //order.setProductList(productList);
	 List<Order>orderList=new ArrayList<Order>();
	 orderList.add(order);
	 orderList.add(order1);
	 
	 
	 orderList.stream()
     .flatMap(or -> or.getProductList().stream())
     .filter(cat -> cat.getProductPrice()>5000).collect(Collectors.toList())
     .forEach(System.out::println);
	 
	
	 
 }

}
