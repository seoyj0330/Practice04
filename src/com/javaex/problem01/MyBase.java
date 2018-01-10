package com.javaex.problem01;

public class MyBase extends Base {

   public void service(String state) {
	   if(state.equals("오후")) {
		   afternoon();
	   } else {
		   super.service(state);
	   }
   }
   
   public void day() {
	   System.out.println("낮에는 열심히 일하자");
   }
   
   public void afternoon() {
	   System.out.println("오후도 낮과 마찬가지로 일해야 합니다");
   }
   
   
    
}
