package dentaku3;

public class henkan {
	public static int hantei(String moji) {
		int k=0;
			
			if(moji.equals("(") || moji.equals("(") ) {
				k = 3;
			}
			else if (moji.equals("+") || moji.equals("-") ) {
				k = 2;
			}
			else if (moji.equals("*") || moji.equals("/") ) {
				k = 1;
			}
			else {
				k = 0;
			}
		return k;
	}
	
	public static String[] gyakup(String S){
		String siki = S;
		
		String[] data = siki.split(" ");
		String[] p = new String[100];
		String[] s = new String[100];
		
		int pnum=0;
		int snum=0;
		int num = data.length;
		
		int ikey=0;
		int skey = 0;
		
		for(int i=0;i<num;i++) {
			
			if(data[i].equals("(") || data[i].equals(")") ) {
				ikey = 3;
			}
			else if (data[i].equals("+") || data[i].equals("-") ) {
				ikey = 2;
			}
			else if (data[i].equals("*") || data[i].equals("/") ) {
				ikey = 1;
			}
			else {
				ikey = 0;
			}
			
			
			
			if (ikey==0) {
				p[pnum] = data[i];
				pnum +=1;
			}
			
			if (ikey==1) {
				if (snum == 0) {
					s[snum] = data[i];
					skey = 1;
					snum +=1;
				}
				else {
					
					if(skey<=1) {
						while(snum-1>=0 &&hantei(s[snum-1])<=1) {
							p[pnum]=s[snum-1];
							pnum +=1;
							snum -= 1;
						}
						skey=1;
						s[snum]=data[i];
						snum +=1;
					}
					else {
						s[snum] = data[i];
						skey = 1;
						snum +=1;
					}
				}
			}
			
			if (ikey==2) {
				if (snum == 0) {
					s[snum] = data[i];
					skey = 2;
					snum +=1;
				}
				else {
					if(skey<=2) {
						while(snum-1>=0 && hantei(s[snum-1])<=2) {
							
							p[pnum]=s[snum-1];
							pnum +=1;
							snum -= 1;
						}
						skey=2;
						s[snum]=data[i];
						snum +=1;
					}
					else {
						s[snum]=data[i];
						snum +=1;
						skey=2;
					}
				}
			}
			if(ikey==3) {
				if(data[i].equals("(")) {
					s[snum]=data[i];
					snum +=1;
					skey=3;
				}
				else if(data[i].equals(")")) {
					while(true) {

						if (s[snum-1].equals("(")) {
							snum -= 1;
							break;
						}
						else {
							p[pnum]=s[snum-1];
							pnum +=1;
							snum -= 1;
						}
					}
				}
			}
			
			System.out.print("s=");
			for(int q=0;q<snum;q++) {
				System.out.print(s[q]);
			}
			System.out.println("");
			System.out.print("p=");
			for(int q=0;q<pnum;q++) {
				System.out.print(p[q]);
			}
			System.out.println("");
			System.out.println("");
			
		}
		
		
		
		String[] ans = new String[pnum+snum];
		System.arraycopy(p,0, ans, 0,pnum);
		while(snum!=0) {
			ans[pnum]=s[snum-1];
			pnum +=1;
			snum -= 1;
		}
		
		//for(int q=0;q<ans.length;q++) {
		//	System.out.print(ans[q]+" ");
		//}
		//System.out.println("");
		return ans;
}
	}
