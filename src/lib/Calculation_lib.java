package lib;

public class Calculation_lib {
	
	private int m,n;
    //�E�N���b�N����Source->Generate...using fields..
	public Calculation_lib(int m, int n) {
		//this.�̓t�B�[���h�̕ϐ��̒l���Q�Ƃ���B���Ȃ���΃��[�J��
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
