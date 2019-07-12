package slf4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
	private static Logger log=LoggerFactory.getLogger(CarService.class);
	public void process(String msg) {
		if(log.isDebugEnabled()) 
			log.debug("Processing car :"+msg);
		//log.debug("Processing car in smart way : {}",msg);
		log.info("Processing car in smart way : {}",msg);
		log.error("Processing car in smart way : {}"+msg);
		
		//System.out.println("Processed car");
		
	}
}
