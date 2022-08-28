package org.example.plsql_generator;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.example.plsql_parser.*;

public class ParserInvBoApi {

    public static void main(String[] args) throws Exception {
	
    	CharStream input = CharStreams.fromFileName( "inv_bo_api.pkb" );
    	PlSqlLexer lexer = new PlSqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlSqlParser parser = new PlSqlParser(tokens);
        ParseTree v_tree = parser.compilation_unit();

        MyPlSqlBaseListener v_listener = new MyPlSqlBaseListener();
        
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(v_listener, v_tree);

	}
}	