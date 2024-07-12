public class Interfaces {
    public static void main(String args[]){
        Queen q =new Queen();
        q.moves();
        King k=new King();
        k.moves();
        Rook r=new Rook();
        r.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,digonally");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,digonal - by 1 step");
    }
}