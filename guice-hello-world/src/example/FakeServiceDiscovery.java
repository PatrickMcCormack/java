//
// Trivial implementation of ServiceDiscovery in a disconnected
//  environment meaning the program does not have access to a
//  live environment or the developer wants to run not connected
//	to a live environment (laptop development)
//

package example;

public class FakeServiceDiscovery implements ServiceDiscovery {

	public String findService(String servicename, int version) {
		System.out.println("TestServiceDiscovery::findService parameters: [" + servicename + "] [" + version + "]");
		return "localhost";
	}

}

