package antlr4.com.cloudrain.derecho.parser;

import com.cloudrain.derecho.sql.parser.generated.DqlLexer;
import com.cloudrain.derecho.sql.parser.generated.DqlParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Created by lugan on 11/25/2015.
 */
public class DqlParserService {
    private boolean isTrace = false;

    private DqlParser getDqlParser(String sql) {
        ANTLRInputStream input = new ANTLRInputStream(sql);
        DqlLexer lexer = new DqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);


        DqlParser parser = new DqlParser(tokens);
        if (isTrace) {
            parser.setBuildParseTree(true);
            parser.setTrace(true);
        }
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new BaseErrorListener());
        parser.setErrorHandler(new BailErrorStrategy());
        return parser;
    }
}
