package instructions;

public class Multiply extends Instruction {

	int r1;
	int r2;
	
	public Multiply(int r1, int r2) {
		super();
		this.r1 = r1;
		this.r2 = r2;
	}
	
	void execute(Machine machine) {
		machine.registers[r1] *= machine.registers[r2];
		machine.pc++;
	}
	
	
}
