package dialogicallogic.dsl.generator;

import dialogicallogic.dsl.model.Statement;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import static dialogicallogic.dsl.DialogicalLogic.*;
import static dialogicallogic.dsl.DialogicalLogic.s;

public final class DslToFormalLogic {

    public static void main(String[] args) {
        String formalTemplate = DslToFormalLogic.class.getResource("/FormalLogic.stg").getPath();
        String programmerTemplate = DslToFormalLogic.class.getResource("/JavaLogic.stg").getPath();
        Statement statement = createStatementAST();
        applyTemplate(formalTemplate, statement);
       // applyTemplate(programmerTemplate, statement);
    }

    private static void applyTemplate(String templatePath, Statement statement) {
        ST templ = new STGroupFile(templatePath).getInstanceOf("main");
        templ.add("root", statement);
        System.out.println(templ.render());
    }

    private static Statement createStatementAST() {
        return when(is(s("Sommer")).andNot(s("Badestrand vorhanden")).e()).then(is(s("Freiband nutzen")).or(s("schwitzen")).e()).e();
    }

}
