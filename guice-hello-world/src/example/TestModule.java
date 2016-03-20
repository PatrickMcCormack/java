/*
	Modules are where the linkage between interfaces and a specific
	concrete implementation are made. In your code where you just
	refer to the interface and Guice will instantiate the implementation
	defined in the binding file.
*/

package example;

import com.google.inject.AbstractModule;

public class TestModule extends AbstractModule {

	// The following are examples of Linked Bindings.
	// Linked Bindings  map a type to it's implementation.

	protected void configure() {
		bind(DFS.class)
				.to(FakeS3.class);
		bind(ServiceDiscovery.class)
				.to(FakeServiceDiscovery.class);

		// You can imagine that this example would continue
		// to bind to additional test services beyond
		// just the two shown above.

	}
}
