//
// Trivial Implementation of a FakeS3 object that allows the users
// code to interact with S3 while not actually connected to S3,
// i.e. when offline.
//

package example;

public class FakeS3 implements DFS {

	public int open(String filename) {
		System.out.println("FakeS3 open called with parameter: [" + filename + "]");
		return 2;
	}

	public int close(int filedescriptor) {
		System.out.println("FakeS3 close called with parameter: [" + filedescriptor + "]");
		return 2;
	}

	public int write(int filedescriptor, String str) {
		System.out.println("FakeS3 write called with parameters: [" + filedescriptor + "], [" + str + "]");
		return 2;
	}

	public String read(int filedescriptor) {
		System.out.println("FakeS3 read called with parameter: [" + filedescriptor + "]");
		return "Text from S3";
	}

}
