package instructions;

public class LoadConstant extends Instruction {
	
	int r;
	int c;
	
	LoadConstant(int r, int c) { this.r = r; this.c = c; }
	
	void execute(Machine machine) {
		machine.registers[r] = c;
		machine.pc++;
	}
	
	@Override
	public String toString() {
		return "LoadConstant("+r+", "+c+")";
	}
	
	@Override
	public boolean equals(Object other) {
		return other instanceof LoadConstant lc &&
				r == lc.r && c == lc.c;
	}
	
	public int hashCode() {
		return r * 31 + c;
	}

}
