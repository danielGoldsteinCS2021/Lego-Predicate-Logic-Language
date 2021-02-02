package lego.ast;

public class Unary extends Formula{
    public Unary_conn unConn;
    public Formula formula;

    public Unary(Unary_conn unConn, Formula formula){
        this.unConn  = unConn;
        this.formula = formula;
    }
}
