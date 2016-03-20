//
// Trivial implementation of ServiceDiscovery in a connected
//  environment (meaning the program has access to 
//	live environments.
//

package example;

public class ConnectedServiceDiscovery implements ServiceDiscovery {

	public String findService(String servicename, int version) {
		System.out.println("ConnectedServiceDiscovery::findService parameters: [" + servicename + "] [" + version + "]");
		return "sd.quixey.com";
	}

}

