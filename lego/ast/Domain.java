package lego.ast;

public class Domain implements ASTNode{
    public int start;
    public int end;
    public Domain(int start, int end){
        this.start = start;
        this.end = end;
    }
}
