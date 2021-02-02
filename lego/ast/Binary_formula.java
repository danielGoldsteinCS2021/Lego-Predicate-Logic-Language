package lego.ast;

public class Binary_formula extends Formula{
    public Binary_conn binary_conn;
    public Formula lhs;
    public Formula rhs;

    public Binary_formula(Binary_conn binary_conn, Formula lhs, Formula rhs){
        this.lhs = lhs;
        this.rhs = rhs;
        this.binary_conn = binary_conn;
    }
}
