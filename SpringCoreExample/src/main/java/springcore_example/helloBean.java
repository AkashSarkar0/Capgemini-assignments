package springcore_example;

public class helloBean {
	
private String name;



public helloBean(String name) {
	super();
	this.name = name;                           //constructor
}


public String getName() {
	return name;
}


  //public void setName(String name) { 
	//  this.name = name;                                                        //setter and getter 
 // }
 
  
public void sayHello() {
	System.out.println("Hello " +this.name);
}

}
