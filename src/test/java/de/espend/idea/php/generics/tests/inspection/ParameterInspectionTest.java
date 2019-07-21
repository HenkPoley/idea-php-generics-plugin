package de.espend.idea.php.generics.tests.inspection;

import de.espend.idea.php.annotation.doctrine.inspection.RepositoryClassInspection;
import de.espend.idea.php.generics.indexer.TemplateAnnotationIndex;
import de.espend.idea.php.generics.tests.AnnotationLightCodeInsightFixtureTestCase;

public class ParameterInspectionTest extends AnnotationLightCodeInsightFixtureTestCase {
    public void setUp() throws Exception {
        super.setUp();
        myFixture.copyFileToProject("classes.php");
    }

    public String getTestDataPath() {
        return "src/test/java/de/espend/idea/php/generics/tests/indexer/fixtures";
    }

    public void testThatTemplateClassIsInIndex() {
        assertLocalInspectionContains("test.php", "<?php\n" +
                "\n" +
                "$foo = new \\Foo\\Foo();\n" +
                "$foo->get('')" +
                "\n" +
                "/**\n" +
                " * @ORM\\Entity(repositoryClass=\"Foo<caret>bar\")\n" +
                " */\n" +
                "class Foo\n" +
                "{\n" +
                "}",
            "foo"
        );
    }

}
