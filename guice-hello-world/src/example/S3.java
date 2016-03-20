//
// Trivial implementation of the S3 DFS
//

package example;

public class S3 implements DFS {

	public int open(String filename) {
		System.out.println("S3 open called with parameter: [" + filename + "]");
		return 1;
	}

	public int close(int filedescriptor) {
		System.out.println("S3 close called with parameter: [" + filedescriptor + "]");
		return 1;
	}

	public int write(int filedescriptor, String str) {
		System.out.println("S3 write called with parameters: [" + filedescriptor + "], [" + str + "]");
		return 1;
	}

	public String read(int filedescriptor) {
		System.out.println("S3 read called with parameter: [" + filedescriptor + "]");
		return "Text from S3";
	}

}
