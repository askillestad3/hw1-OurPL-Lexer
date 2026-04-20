package cpsc326;

import java.util.List;

abstract class Stmt {
    interface Visitor<R> {
        R visitPrintStmt(Print stmt);

        R visitExpressionStmt(Expression stmt);

        R visitBlockStmt(Block stmt);

        R visitIfStmt(If stmt);

        R visitVarStmt(Var stmt);

        R visitWhileStmt(While stmt);
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

    static class Block extends Stmt {
        final List<Stmt> statements;

        Block(List<Stmt> statements) {
            this.statements = statements;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitBlockStmt(this);
        }
    }

    static class If extends Stmt {

    }

    static class Var extends Stmt {

    }

    static class While extends Stmt {

    }

    abstract <R> R accept(Visitor<R> visitor);
}
