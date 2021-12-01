package dentaku3;

public class keisan {
	public static float gpkeisan(String[] S){
		//String[] gp = {"1","3","5","7","/","*","6","-","+"};
		String[] gp = S;
		String[] ps1 = new String[100];
		int gpnum = 0;
		int gpnums = gp.length;
		int ps1num = 0;
		
		while(true) {
				if(!(gp[gpnum].equals("+")||gp[gpnum].equals("-")||gp[gpnum].equals("*")||gp[gpnum].equals("/"))) {
					ps1[ps1num]=gp[gpnum];
					gpnum++;
					ps1num++;
				}
				else {
					if(gp[gpnum].equals("+")) {
					float fnum1	= Float.parseFloat(ps1[ps1num-2]);
					float fnum2	= Float.parseFloat(ps1[ps1num-1]);
					System.out.println(String.valueOf(fnum1+fnum2)+"="+ String.valueOf(fnum1)+"+"+ String.valueOf(fnum2));
					ps1[ps1num-2] = String.valueOf(fnum1+fnum2);
					ps1num = ps1num -1;
					}
					else if (gp[gpnum].equals("-")) {
						float fnum1	= Float.parseFloat(ps1[ps1num-2]);
						float fnum2	= Float.parseFloat(ps1[ps1num-1]);
						System.out.println(String.valueOf(fnum1-fnum2)+"="+ String.valueOf(fnum1)+"-"+ String.valueOf(fnum2));
						ps1[ps1num-2] = String.valueOf(fnum1-fnum2);
						ps1num = ps1num -1;
					}
					else if (gp[gpnum].equals("/")) {
						float fnum1	= Float.parseFloat(ps1[ps1num-2]);
						float fnum2	= Float.parseFloat(ps1[ps1num-1]);
						System.out.println(String.valueOf(fnum1/fnum2)+"="+ String.valueOf(fnum1)+"/"+ String.valueOf(fnum2));
						ps1[ps1num-2] = String.valueOf(fnum1/fnum2);
						ps1num = ps1num -1;
					}
					else {
						float fnum1	= Float.parseFloat(ps1[ps1num-2]);
						float fnum2	= Float.parseFloat(ps1[ps1num-1]);
						System.out.println(String.valueOf(fnum1*fnum2)+"="+ String.valueOf(fnum1)+"*"+ String.valueOf(fnum2));
						ps1[ps1num-2] = String.valueOf(fnum1*fnum2);
						ps1num = ps1num -1;
					}
					gpnum++;
				}
				if (gpnums==gpnum) {
					break;
				}
					
			}
		return  Float.parseFloat(ps1[0]);
	}
}
