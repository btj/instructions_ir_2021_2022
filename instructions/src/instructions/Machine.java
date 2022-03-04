package instructions;

public class Machine {
	
	int[] registers;
	Instruction[] instructions;
	int pc;
	
	Machine(int[] registers, Instruction[] instructions) {
		this.registers = registers;
		this.instructions = instructions;
	}
	
	void run() {
		while (0 <= pc) {
			Instruction i = instructions[pc];
			i.execute(this); // dynamic binding
		}
	}
	
	public static void execute(int[] registers, Instruction[] instructions) {
		new Machine(registers, instructions).run();
	}

}
