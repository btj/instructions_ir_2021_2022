package instructions;

public class Decrement extends Instruction {

	int r;
	
	public Decrement(int r) { this.r = r; }
	
	void execute(Machine machine) { // overschrijvende methode
		machine.registers[r]--;
		machine.pc++;
	}
}
