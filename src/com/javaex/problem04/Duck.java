package com.javaex.problem04;

public class Duck extends Bird {

	//따로 생성자 만들지 않아도 디폴트 생성자로 하여도됨
//  	public Duck() {}
//      public Duck(String name) {
//		super(name);
//	}

	public void sing() {
		System.out.println("오리 (" + getName()+ ")가 소리내어 웁니다.");
	
    }

    public void fly() {
    	System.out.println("오리 (" + getName()+ ")가 날지 않습니다.");
    }
    
    public void showName() {
    	System.out.println("오리의 이름은 " + getName()+ "입니다.");
    
    }

}
