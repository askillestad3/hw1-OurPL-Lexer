package cpsc326;

abstract class Stmt {
    interface Visitor<R> {
        R visitPrintStmt(Print stmt);
        R visitExpressionStmt(Expression stmt);
    }
    static class Print extends Stmt {
        Expr expression;

        Print(Expr expr) {
            expression = expr;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitPrintStmt(this);
        }
    }
    static class Expression extends Stmt {
        Expr expression;

        Expression(Expr expr) {
            expression = expr;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitExpressionStmt(this);
        }
    }
    abstract <R> R accept(Visitor<R> visitor);
}
