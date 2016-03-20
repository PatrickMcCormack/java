//
// Trival Interface for Service Discovery
//
package example;

public interface ServiceDiscovery {
	// given a service name and a version numner of that service 
	// return then name of the host which the service is running on.
	//
	public String findService(String servicename, int version);
}
