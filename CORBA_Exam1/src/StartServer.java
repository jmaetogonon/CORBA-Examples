import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import Exam1App.Exam1;
import Exam1App.Exam1Helper;

public class StartServer {
	
	public static void main(String args[]) {
		try {
			// create and initialize the ORB
	        ORB orb = ORB.init(args, null);

	        // get the root naming context
	        POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
	        rootpoa.the_POAManager().activate();
	 
	        // create servant and reg it with the orb
	        ExamObj examObj = new ExamObj();
	        examObj.setORB(orb);

	        //get obj ref from the servant
	        org.omg.CORBA.Object ref = rootpoa.servant_to_reference(examObj);
	        Exam1 href = Exam1Helper.narrow(ref);
	        
	        org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
	        NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
	        
	        NameComponent path[] = ncRef.to_name("EXAM");
	        ncRef.rebind(path, href);		
	        
	        System.out.println("Simple Program Server ready and waiting ...");
	        
	        for (;;) {
	        	orb.run();
	        }
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR : " + e) ;
	          e.printStackTrace(System.out);
		}
        System.out.println("Calculator Server Exiting ...");

	}

}
