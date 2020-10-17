package p5_proxy;

import java.io.IOException;

public class CommandRunnerProxy implements CommandRunner {

	boolean isAdmin;
	CommandRunnerImpl commandRunnerImpl;

	public CommandRunnerProxy(String user, String pwd) {
		if ("safdar".equals(user) && "password".equals(pwd)) {
			isAdmin = true;
			commandRunnerImpl = new CommandRunnerImpl();
		}
	}

	@Override
	public void runCommand(String cmd) throws IOException {
		if (isAdmin) {
			commandRunnerImpl.runCommand(cmd);
		} else {
			if ("notepad".equals(cmd)) {
				throw new IOException("This command " + cmd + " can only be run by Admin!");
			} else {
				commandRunnerImpl.runCommand(cmd);
			}
		}
	}
}
