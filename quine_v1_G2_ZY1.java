import java.io.*;
class quine
{
	final static int gen = 2;
	public static void main(String args[])
	{
		String DNA = "import java.io.*;\nclass quine\n{\n\tfinal static int gen = "+(gen+1)+";\n\tpublic static void main(String args[])\n\t{\n\t\tString DNA = @;\n\n\t\tBufferedWriter bw = null;\n\t\ttry {\n\t\t\tbw = new BufferedWriter(new FileWriter(\"quine_v1_G\"+(gen+1)+\"_ZY1.java\"));\n\t\t\tbw.write(process(DNA));\n\t\t\tbw.flush();\n\t\t\tbw.close();\n\t\t}\n\t\tcatch (Exception e) {\n\t\t}\n\t}\n\tpublic static String process(String a)\n\t{\n\t\tString bs = a.replaceAll(\"\\\\\\\\\", \"\\\\\\\\\\\\\\\\\");\n\t\tString bn = bs.replaceAll(\"\\n\", \"\\\\\\\\n\");\n\t\tString bt = bn.replaceAll(\"\\t\", \"\\\\\\\\t\");\n\t\tString dq = bt.replaceAll(\"\\\"\", \"\\\\\\\\\\\"\");\n\t\tString g = dq.replaceFirst(\"gen = \"+(gen+1), \"gen = \\\"+(gen+1)+\\\"\");\n\t\tString newDNA = \"\";\n\t\tfor (int i=0;i<a.length();i++)\n\t\t\tif (a.charAt(i) == 64)\n\t\t\t\tnewDNA = a.substring(0,i)+\"\\\"\"+g+\"\\\"\"+a.substring(i+1);\n\t\treturn newDNA;\n\t}\n}";

		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("quine_v1_G"+(gen+1)+"_ZY1.java"));
			bw.write(process(DNA));
			bw.flush();
			bw.close();
		}
		catch (Exception e) {
		}
	}
	public static String process(String a)
	{
		String bs = a.replaceAll("\\\\", "\\\\\\\\");
		String bn = bs.replaceAll("\n", "\\\\n");
		String bt = bn.replaceAll("\t", "\\\\t");
		String dq = bt.replaceAll("\"", "\\\\\"");
		String g = dq.replaceFirst("gen = "+(gen+1), "gen = \"+(gen+1)+\"");
		String newDNA = "";
		for (int i=0;i<a.length();i++)
			if (a.charAt(i) == 64)
				newDNA = a.substring(0,i)+"\""+g+"\""+a.substring(i+1);
		return newDNA;
	}
}