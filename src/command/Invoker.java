package command;

public class Invoker {

	Command command;
	
	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void performCommand(){
		command.execute();
	}
}
