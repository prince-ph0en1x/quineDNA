/*

Description:

 This code emulates binary cell division
 The quine automata representation is : G[n]_ZY[p] --> G[n+1]_ZY[q]	p,q = 1,2

Other improvements:

 * Rule to run : Each java file should be run only once per simulation

Run results:

 > javac quine_v1.java
 > java quine
 > javac quine_v1_G1_ZY1.java
 > java quine
 > diff quine_v1_G1_ZY1.java quine_v1_G2_ZY1.java

	< 	final static int gen = 1;
	---
	> 	final static int gen = 2;
*/

import java.io.*;
class quine
{
	final static int gen = 0;
	final static int typeID = 0;		// 0 - Zygote, 1 - Brain, 2 - Body
	final static int cellID = 0;
	final static int size[] = {2,0,0};	// Cells generated per type
	public static void main(String args[])
	{
		BufferedWriter bw = null;
		for(int type=0;type<size.length;type++) {
			for (int nos=0;nos<size[type];nos++) {
				try {
		   			String DNA = "import java.io.*;\nclass quine\n{\n\tfinal static int gen = "+(gen+1)+";\n\tfinal static int typeID = "+(type)+";\n\tfinal static int cellID = "+(nos+1)+";\n\tfinal static int size[] = {2,0,0};\n\tpublic static void main(String args[])\n\t{\n\t\tBufferedWriter bw = null;\n\t\tfor(int type=0;type<size.length;type++) {\n\t\t\tfor (int nos=0;nos<size[type];nos++) {\n\t\t\t\ttry {\n\t\t\t\t\tString DNA = @;\n\n\t\t\t\t\tbw = new BufferedWriter(new FileWriter(\"quine_v2_G\"+(gen+1)+\"_T\"+type+\"C\"+(nos+1)+\".java\"));\n\t\t\t\t\tbw.write(process(DNA));\n\t\t\t\t\tbw.flush();\n\t\t\t\t\tbw.close();\n\t\t\t\t}\n\t\t\t\tcatch (Exception e) {\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t}\n\tpublic static String process(String a)\n\t{\n\t\tString bs = a.replaceAll(\"\\\\\\\\\", \"\\\\\\\\\\\\\\\\\");\n\t\tString bn = bs.replaceAll(\"\\n\", \"\\\\\\\\n\");\n\t\tString bt = bn.replaceAll(\"\\t\", \"\\\\\\\\t\");\n\t\tString dq = bt.replaceAll(\"\\\"\", \"\\\\\\\\\\\"\");\n\t\tString g = dq.replaceFirst(\"gen = \"+(gen+1), \"gen = \\\"+(gen+1)+\\\"\");\n\t\tString t = g.replaceFirst(\"typeID = \"+(type), \"typeID = \\\"+(type)+\\\"\");\n\t\tString c = t.replaceFirst(\"cellID = \"+(cell+1), \"cellID = \\\"+(nos+1)+\\\"\");\n\t\tString newDNA = \"\";\n\t\tfor (int i=0;i<a.length();i++)\n\t\t\tif (a.charAt(i) == 64)\n\t\t\t\tnewDNA = a.substring(0,i)+\"\\\"\"+c+\"\\\"\"+a.substring(i+1);\n\t\treturn newDNA;\n\t}\n}";

		   			bw = new BufferedWriter(new FileWriter("quine_v2_G"+(gen+1)+"_T"+type+"C"+(nos+1)+".java"));
		   			bw.write(process(DNA,type,nos));
		   			bw.flush();
					bw.close();
		   		}
		   		catch (Exception e) {
				}
			}
		}
	}
	public static String process(String baseDNA,int type,int cell)
	{
		String bs = baseDNA.replaceAll("\\\\", "\\\\\\\\");
		String bn = bs.replaceAll("\n", "\\\\n");
		String bt = bn.replaceAll("\t", "\\\\t");
		String dq = bt.replaceAll("\"", "\\\\\"");
		String g = dq.replaceFirst("gen = "+(gen+1), "gen = \"+(gen+1)+\"");
		String t = g.replaceFirst("typeID = "+(type), "typeID = \"+(type)+\"");
		String c = t.replaceFirst("cellID = "+(cell+1), "cellID = \"+(nos+1)+\"");
		String newDNA = "";
		for (int i=0;i<baseDNA.length();i++)
			if (baseDNA.charAt(i) == 64)
				newDNA = baseDNA.substring(0,i)+"\""+c+"\""+baseDNA.substring(i+1);
		return newDNA;
	}
}
