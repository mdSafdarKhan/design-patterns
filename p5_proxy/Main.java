package p5_proxy;

/**
 * Proxy is a structural design pattern that lets you provide a substitute or placeholder
 * for another object. A proxy controls access to the original object, allowing you to 
 * perform something either before or after the request gets through to the original object.
 * 
 * Problem: Why would you want to control access to an object? Here is an example: you have 
 * a massive object that consumes a vast amount of system resources. You need it from time 
 * to time, but not always.
 * 
 * Solution: The Proxy pattern suggests that you create a new proxy class with the same 
 * interface as an original service object. Then you update your app so that it passes 
 * the proxy object to all of the original object’s clients. Upon receiving a request from 
 * a client, the proxy creates a real service object and delegates all the work to it.
 * 
 * But what’s the benefit? If you need to execute something either before or after the 
 * primary logic of the class, the proxy lets you do this without changing that class. 
 * Since the proxy implements the same interface as the original class, it can be 
 * passed to any client that expects a real service object.
 * 
 * Proxy design pattern is used when we want to provide controlled access of a functionality.
 * Let’s say we have a class that can run some command on the system. Now if we are using 
 * it, its fine but if we want to give this program to a client application, it can have 
 * severe issues because client program can issue command to delete some system files or 
 * change some settings that you don’t want. Here a proxy class can be created to provide 
 * controlled access of the program.
 * 
 * @author Safdar.Khan
 *
 */
public class Main {

	public static void main(String[] args) {
		CommandRunner commandRunner = new CommandRunnerProxy("safdar", "password");
		try {
			commandRunner.runCommand("notepad");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		CommandRunner commandRunner2 = new CommandRunnerProxy("safdar_bad", "password_wrong");
		try {
			commandRunner2.runCommand("notepad");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
