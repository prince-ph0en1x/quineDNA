class quine
{
	final static int gen = 1;
	final static int typeID = 0;	// 0 - Zygote, 1 - Brain, 2 - Body
	final static int size[] = {0,1,1};	// Cells generated per type
	public static void main(String args[])
	{
		int reproduce = typeID == 2 ? 1 : 0;
		
		String DNA = "class quine\n{\n\tfinal static int gen = "+(gen+1)+";\n\tpublic static void main(String args[])\n\t{\n\t\tString DNA = @;\n\t\tSystem.out.println(process(DNA));\n\t}\n\tpublic static String process(String a)\n\t{\n\t\tString bs = a.replaceAll(\"\\\\\\\\\", \"\\\\\\\\\\\\\\\\\");\n\t\tString bn = bs.replaceAll(\"\\n\", \"\\\\\\\\n\");\n\t\tString bt = bn.replaceAll(\"\\t\", \"\\\\\\\\t\");\n\t\tString dq = bt.replaceAll(\"\\\"\", \"\\\\\\\\\\\"\");\n\t\tString g = dq.replaceFirst(\"gen = \"+(gen+1), \"gen = \\\"+(gen+1)+\\\"\");\n\t\tString newDNA = \"\";\n\t\tfor (int i=0;i<a.length();i++)\n\t\t\tif (a.charAt(i) == 64)\n\t\t\t\tnewDNA = a.substring(0,i)+\"\\\"\"+g+\"\\\"\"+a.substring(i+1);\n\t\treturn newDNA;\n\t}\n}";
		
		for(int i=0;i<size.length;i++)
			System.out.println(process(DNA,i,size[i]));
	}
	public static String process(String baseDNA, int type, int nos)
	{
		String bs = "Type : "+type+"\n"+baseDNA.replaceAll("\\\\", "\\\\\\\\");
		String bn = bs.replaceAll("\n", "\\\\n");
		String bt = bn.replaceAll("\t", "\\\\t");
		String dq = bt.replaceAll("\"", "\\\\\"");
		String g = dq.replaceFirst("gen = "+(gen+1), "gen = \"+(gen+1)+\"");
		String newDNA = "";
		for (int i=0;i<baseDNA.length();i++)
			if (baseDNA.charAt(i) == 64)
				newDNA = baseDNA.substring(0,i)+"\""+g+"\""+baseDNA.substring(i+1);
		String organ = "";
		for (int i=0;i<nos;i++)
			organ += newDNA+"\n";	
		return organ;
	}
}
