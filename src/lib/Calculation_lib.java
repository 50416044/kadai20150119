package lib;

public class Calculation_lib {
	
	private int m,n;
    //右クリックからSource->Generate...using fields..
	public Calculation_lib(int m, int n) {
		//this.はフィールドの変数の値を参照する。つけなければローカル
		this.m = m;
		this.n = n;
	}
	
	public int getPlus(){
		return m+n;
	}
    
    public int getMinus(){
    	return m-n;
    }
}
