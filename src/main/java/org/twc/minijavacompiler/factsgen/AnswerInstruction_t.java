package org.twc.minijavacompiler.factsgen;
import java.io.*;

public class AnswerInstruction_t extends Fact_t {

	public int ic;
	public String instr;

	public AnswerInstruction_t(String meth_name, int ic, String instr) {
		super(meth_name);
		this.ic = ic;
		this.instr = "\"" + instr + "\"";
	}

	public void writeRecord(PrintWriter writer, boolean print) {
		String ret = "answerInstruction(" + this.meth_name + ", " + this.ic + ", " + this.instr + ").";
		if (print) System.out.println(ret);
		writer.println(ret);
	}

}
