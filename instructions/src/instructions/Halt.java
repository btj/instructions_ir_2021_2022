package instructions;

public class Halt extends Instruction {

	void execute(Machine machine) {
		machine.pc = -1;
	}
}
