//
// Trival Interface for a distributed filesystem
//
package example;

public interface DFS {
	public int open(String filename);
	public int close(int filedescriptor);
	public int write(int filedescriptor, String str);
	public String read(int filedescriptor);
}
