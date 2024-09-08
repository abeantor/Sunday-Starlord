package com.upskill.java_5;

public class InterfaceImplementation implements InterfaceClass{
	

	@Override
	public void iDoor() {
		System.out.println("My car is Tesla");
		
	}
	
@Override
public void iDoor(int door) {
	System.out.println("My car has 4 doors" + door);
	
}


@Override
public void iDoor(String glass) {
	System.out.println("My car has glass window" + glass);
	
}



@Override
public String iEngine() {
	return "10 Hp";
}

@Override
public int iWheel() {
	return 4;
}

@Override
public void ireviewClass() {
	// TODO Auto-generated method stub
	
}

}
