package com.vivek.genericspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vivek.genericspring.models.ChatRoom;
import com.vivek.genericspring.models.HelloWorld;
import com.vivek.genericspring.models.TextEditor;

/**
 * A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. 
 *
 * Constructor-based and Setter-based DI but it is a good rule of thumb to use constructor arguments for 
 * mandatory dependencies and setters for optional dependencies.
 */
public class App 
{
	private static Logger log = LoggerFactory.getLogger(App.class);
    public static void main(String args[]){
        log.info( "Hello World!" );
        
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        
        HelloWorld objA = (HelloWorld) ctx.getBean("helloWorld");
        objA.setMessage("Object A");
        log.info(objA.getMessage());
        log.info(objA.getDefaultTitle());
        
        HelloWorld objB = (HelloWorld) ctx.getBean("helloWorld");
//        objB.setMessage("Object B");
        log.info(objB.getMessage());
        log.info(objB.getDefaultTitle());
        
        ChatRoom objC = (ChatRoom) ctx.getBean("chatroom");
        objC.setMessage("Object C");
        log.info(objC.getMessage());
        log.info(objC.getDefaultTitle());
        
        ChatRoom objD = (ChatRoom) ctx.getBean("chatroom");
        log.info(objD.getMessage());
        log.info(objD.getDefaultTitle());
        
        log.info("------------------------------------------------");
        TextEditor objE = (TextEditor) ctx.getBean("texteditor");
        //objE.doSpellCheck();
        
        ctx.registerShutdownHook();
    }
}
