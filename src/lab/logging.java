package lab;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;


public class logging {
	private static Logger logger = Logger.getLogger(logging.class);
	public static void main(String [] args){
		//DOMConfigurator.configure("log4j.xml");
		//PropertyConfigurator.configure("log4j.properties");
		BasicConfigurator.configure();
		logger.error("this is error message");
		logger.debug("this is debug message");
		logger.info("this is info message");
		logger.fatal("this is fatal message");
		logger.trace("this is trace message");
		logger.warn("this is warn message");
		
	}
}
