package instructions;

public class JumpIfZero extends Instruction {

	int r;
	int a;
	
	public JumpIfZero(int r, int a) { this.r = r; this.a = a; }
	
	void execute(Machine machine) {
		if (machine.registers[r] == 0)
			machine.pc = a;
		else
			machine.pc++;
	}
}
