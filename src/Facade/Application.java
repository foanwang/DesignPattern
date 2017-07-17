package Facade;

public class Application {
	private Service service;
	Application(Service service){
		this.service =service;
	}
	void doAction(){
		this.service.doAction();
	}
}
