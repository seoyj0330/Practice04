package com.javaex.problem03;

import org.omg.PortableServer.POAManagerPackage.State;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        if(str.equals("앱")) {
        	startApp();
        } else {
        	super.execute(str);
        }
    }
 
    //메소드작성
    protected void startApp() {
    	System.out.println("앱실행");
    }
    //메소드작성
    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    
    
}
