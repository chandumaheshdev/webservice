package org.chandu.javabrains.messanger.service;

import java.util.ArrayList;
import java.util.List;

import org.chandu.javabrains.messanger.model.Message;

public class MessageService {

	public List<Message> getAllMessages(){
		
		Message m1=new Message(1L,"Hello world","koushik");
		
		Message m2=new Message(2L,"Hello Jersey", "koushik");
		
		List<Message> list=new ArrayList<>();
		
		list.add(m1);
		
		list.add(m2);
		
		 return list;
	} 
}
