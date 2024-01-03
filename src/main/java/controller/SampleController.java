package controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleController {
	
	@GetMapping("/hello")
	public String hello() 
	{
		return "index";
	}
	
	@PostMapping("/hello1/{no}")
	public String hello1(@PathVariable int no)
	{
		System.out.println("no is (pathvaiable) :"+no);
		return "success";
    }
	
	@PostMapping("/hello2")
	public String hello2(@RequestParam int no)
	{
		System.out.println("no is (requestParam) :"+no);
		return "success";
    }
	
	@PostMapping("/hello3")
	public Body hello3(@RequestBody Body body)
	{
		System.out.println("Json in console  :"+body.toString());
		return body;
	}
	
//	@PostMapping("/hello4")
//	public Body hello4(@RequestHeader Body body)
//	{
//		System.out.println("Json in console  :"+body.toString());
//		return body;
//	}
	
	

	 @PostMapping("/header")
	    public String usingHeader(@RequestHeader("id") int id,@RequestHeader("name") String name) {
	        System.out.println("Header id: " + id);
	        System.out.println("Header name: " + name);
	        return " ur id : "+id+
	        	   " ur name : "+name;       
	    }
	}