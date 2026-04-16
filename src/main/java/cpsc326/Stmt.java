package cpsc326;

abstract class Stmt {
    interface Visitor<R> {
        R visitPrintStmt(Print stmt);
        R visitExpressionStmt(Expr stmt);
    }
    static class Print extends Stmt {
        Expr expression;

        Print(Expr expr) {
            expression = expr;
        }
    }
    static class Expression extends Stmt {
        Expr expression;

        Expression(Expr expr) {
            expression = expr;
        }
    }
}
