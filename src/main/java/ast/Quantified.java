package ast;

public class Quantified extends Formula{
    public Quantifier quantifier;
    public Var var;
    public Domain domain;
    public Formula formula;

    public Quantified(Quantifier quantifier, Var var, Domain domain, Formula formula){
        this.quantifier = quantifier;
        this.var = var;
        this.domain = domain;
        this.formula = formula;
    }
}
