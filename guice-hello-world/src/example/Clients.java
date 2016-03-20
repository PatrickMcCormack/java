package example;

import com.google.inject.Inject;

import javax.xml.ws.Service;

//
// This class when instantiated allows you to interact with
// all the different external systems your project depends on.
//
// In this example all it does is instantiate a filesystem
// but it could also instantiate the noSQL store, the etc.
//
public class Clients {

	private final DFS dfs;
	private final ServiceDiscovery sd;

	//private final ES es;
	//private final noSQLStore nss;

	// The following @inject annotation tells Guice to look at it's bindings
	// and find the desired implementation for each interface and pass the
	// implementation into the constructor for the DFSClient.
	//
	// In a non-trival example the constructor would be injected with
	// multiple services beyond just the distributed filesystem.

	@Inject
	public Clients(DFS dfs, ServiceDiscovery sd) {
		this.dfs = dfs;
		this.sd = sd;
	}

	// Accessor method for the concrete DFS.
	public DFS dfs() {
		return dfs;
	}

	// Accessor method for the concrete ServiceDiscovery object
	public ServiceDiscovery serviceDiscovery() { return sd; }

}


