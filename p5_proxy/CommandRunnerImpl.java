package p5_proxy;

import java.io.IOException;

public class CommandRunnerImpl implements CommandRunner{

	@Override
	public void runCommand(String cmd) throws IOException{
		Runtime.getRuntime().exec(cmd);
		System.out.println(cmd + " command executed!");
	}

}
