package cpsc326;

enum TokenType {
    // groups
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    // operations and punctuation
    COMMA, DOT, PLUS, MINUS, STAR, SLASH, SEMICOLON,
    // assignment and comparators
    EQUAL, EQUAL_EQUAL, BANG, BANG_EQUAL,
    GREATER, GREATER_EQUAL, LESS, LESS_EQUAL,
    // literals
    IDENTIFIER, STRING, NUMBER,
    // reserved keywords
    AND, ELSE, FALSE, FOR, FUN, IF, NIL, OR, PRINT,  RETURN,
    STRUCT, THIS, TRUE, VAR, WHILE,
    // end of file
    EOF
}
