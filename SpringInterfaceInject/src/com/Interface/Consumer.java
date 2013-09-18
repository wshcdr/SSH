package com.Interface;

public class Consumer implements Injectable {
	private IService service = null;
	public void doSomething(){
		service.go();
	}
	public void injectService(IService service){
		this.service = service;
	}
	public static void main(String args[]){
		IService service = new Service();//the example of the interface
		Consumer consumer = new Consumer();
		consumer.injectService(service);//inject the interface
		consumer.doSomething();
	}
	

}
