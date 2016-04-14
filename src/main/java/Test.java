import javax.sip.message.Request;

//import org.apache.camel.CamelContext;
//import org.apache.camel.ProducerTemplate;
//import org.apache.camel.builder.RouteBuilder;
//import org.apache.camel.impl.DefaultCamelContext;
//import org.apache.camel.impl.DefaultProducerTemplate;


/**
 *  
 * @author kwang  测试未通过
 *
 */
public class Test {

	public static void main(String[] args) throws Exception {
//		Test t = new Test();
//		CamelContext context = new DefaultCamelContext();
//		ProducerTemplate producerTemplate = new DefaultProducerTemplate(context);
//
//		
//		context.addRoutes(t.createRouteBuilder());
//		System.out.println("start");
//		context.start();
//		producerTemplate.start();
//	    producerTemplate.sendBodyAndHeader(  
//        	    "sip://100@192.168.7.72:5060?stackName=client&eventHeaderName=evtHdrName&eventId=evtid&fromUser=102&fromHost=192.168.7.72&fromPort=5060",   
//        	    "EVENT_A",  
//        	    "REQUEST_METHOD",   
//        	    Request.PUBLISH); 
	    
//	    producerTemplate.sendBodyAndHeader(  
//	    	    "sip://agent@localhost:5060?stackName=client&eventHeaderName=evtHdrName&eventId=evtid&fromUser=100&fromHost=localhost&fromPort=45871",   
//	    	    "EVENT_A",  
//	    	    "REQUEST_METHOD",   
//	    	    Request.PUBLISH);  
//		System.out.println("end");
//		Thread.sleep(1000*60);
		
	}
	
	
	

//	protected RouteBuilder createRouteBuilder() throws Exception {
//	    return new RouteBuilder() {
//	        @Override 
//	        public void configure() throws Exception {
//	        	// Create PresenceAgent  
//	            from("sip://agent@localhost:5060?stackName=PresenceAgent&presenceAgent=true&eventHeaderName=evtHdrName&eventId=evtid")  
//	                .to("mock:neverland");  
//	                   
//	            // Create Sip Consumer(Event Subscriber)  
////	            from("sip://johndoe@localhost:5154?stackName=Subscriber&toUser=agent&toHost=localhost&toPort=5060&eventHeaderName=evtHdrName&eventId=evtid")  
////	                .to("log:ReceivedEvent?level=DEBUG")  
////	                .to("mock:notification");  
//	            
//	            
//	        
//	                   
//	        }  
//	    };  
//	}
	
	
}
