package instructions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MachineTest {

	@Test
	void test() {
		assertEquals(9, power(3, 2));
		assertEquals(256, power(2, 8));
		
		LoadConstant lc1 = new LoadConstant(2, 1);
		LoadConstant lc2 = new LoadConstant(2, 1);
		assertEquals(lc1, lc2);
		assertEquals("LoadConstant(2, 1)", ""+lc1);
	}
	
	int power(int x, int y) {
		Instruction[] myProgram = {
				new LoadConstant(2, 1),
				new JumpIfZero(1, 5),
				new Multiply(2, 0),
				new Decrement(1),
				new Jump(1),
				new Halt()
		};
		int[] registers = {x, y, 0};
		Machine.execute(registers, myProgram);
		return registers[2];
	}

}
