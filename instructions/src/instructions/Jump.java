package instructions;

public class Jump extends Instruction {
	
	int a;
	
	public Jump(int a) { this.a = a; }
	
	void execute(Machine machine) {
		machine.pc = a;
	}

}
