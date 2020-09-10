package LeetCode;

public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {-1,-2,-3,0,0,3,4,5,6,4,5,6};
		avgArray(a);
		//System.out.println();
	}
	public static void avgArray(int[] a){
		double c1=0,c2=0,c3=0;
		int h = 3/3;
		System.out.println(h);
		double n =0.0d, p =0.0d,z=0.0d;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0)
				c1++;
			
			if(a[i]>0)
				c2++;
			if(a[i]==0)
				c3++;
		}
		System.out.println(a.length);
		n= (c1/a.length);
		System.out.println(n);
		p = c2/12;
		z = c3/a.length;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(p);
		System.out.println(z);
	}

}
