package lego.ast;

public class Domain implements ASTNode{
    public Num start;
    public Num end;
    public Domain(Num start, Num end){
        this.start = start;
        this.end = end;
    }
}
