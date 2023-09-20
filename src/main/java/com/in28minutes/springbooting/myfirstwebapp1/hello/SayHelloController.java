package com.in28minutes.springbooting.myfirstwebapp1.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController 
{
	//http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	//http://localhost:8080/say-hello
		@RequestMapping("say-hello-html")
		@ResponseBody
		public String sayHelloHtml() {
			StringBuffer sb = new StringBuffer();
			sb.append("<html>");
			sb.append("<head>");
			sb.append("<title> My first HTML Page</title>");
			sb.append("</head>");
			sb.append("<body>");
			sb.append("My first HTML Page with body");
			sb.append("</body>");
			sb.append("</html>");
			
			return sb.toString();
		}
		
		@RequestMapping("say-hello-jsp")
		public String sayHelloJsp() {
			return "sayHello";
		}
}
