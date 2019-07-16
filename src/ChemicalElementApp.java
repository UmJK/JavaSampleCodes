import java.util.Scanner;

public class ChemicalElementApp {
	public static void main(String[] args)
	{
		ChemicalElementApp p = new ChemicalElementApp(13,"Fe","Iron");
		int d = p.isAlkaliMetal(13);
		System.out.println(d);
		int e = p.isTransitionMetal(13);
		System.out.println(e);
		int f = p.isMetal(13);
		System.out.println(f);
		
	}
	int atomicNumber;
	private String symbolicName;
	private String name;
	int[] alkaliMetals= new int[90];
	alkaliMetal[3] =1;
	alkaliMetal[11] =1;
	alkaliMetal[19] = 1;
	alkaliMetal[37] = 1;
	alkaliMetal[55] =1;
	alkaliMetal[87] = 1;
	int metals[] = new int[117];
	metals[13] = 1;
	metals[49]=1;
	metals[50] =1;
	metals[81]=1;
	metals[82]=1;
	metals[83] =1;
	metals[113]=1;
	metals[114] =1;
	metals[115] =1;
	metals[116] = 1;
	int transitionElements[] = new int[120];
	transitionElements[21]=1;
	transitionElements[22]=1;
	transitionElements[23]=1;
	transitionElements[24]=1;
	transitionElements[25]=1;
	transitionElements[26]=1;
	transitionElements[27]=1;
	transitionElements[28]=1;transitionElements[29]=1;transitionElements[30]=1;transitionElements[31]=1;transitionElements[39]=1;
	
//	{21,22,23,24,25,26,27,28,29,30,31,39,40,41,42,43,44,45,46,47,48,72,73,74,75,76,77,78,79,80,104,105,106,107,108,109,110,111,112};
	
	@Override
	public boolean equals(Object o)
	{
		if(o==this)
			return true;
		if(!(o instanceof ChemicalElementApp))
			return false;
		
		ChemicalElementApp p;
		p = (ChemicalElementApp)o;
		if(p.atomicNumber==atomicNumber && p.symbolicName == symbolicName 
				&& p.alkaliMetals == alkaliMetals)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public ChemicalElementApp(int atomicNumber, String symbolicName, String name) {
	super();
	this.atomicNumber = atomicNumber;
	this.symbolicName = symbolicName;
	this.name = name;
	}


	public int isAlkaliMetal(int e)
	{
		int num = this.alkaliMetals[e];
		return num;
	}
	public int isTransitionMetal(int w)
	{
		int num = this.transitionElements[w];
		return num;
	}
	public int isMetal(int q)
	{
		int num = this.metals[q];
		return num;
	}
}
