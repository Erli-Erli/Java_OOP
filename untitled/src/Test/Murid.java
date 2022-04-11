package Test;

public class Murid extends Sekolah{
    Murid(String NamesMurid,int JumlahMurid){
        super(null,0,NamesMurid,JumlahMurid);
    }
    String userNemes(){
        return "Lia";
    }
    String result(){
        return super.userNemes();
    }
}
