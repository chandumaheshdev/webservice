package org.chandu.javabrains.messanger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.chandu.javabrains.messanger.model.Message;
import org.chandu.javabrains.messanger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService messageService=new MessageService();
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public List <Message> getMessages(){
	
	return messageService.getAllMessages();
}
}
