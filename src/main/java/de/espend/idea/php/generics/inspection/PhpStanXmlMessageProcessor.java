package de.espend.idea.php.generics.inspection;

import com.intellij.codeHighlighting.HighlightDisplayLevel;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.project.Project;
import com.jetbrains.php.tools.quality.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PhpStanXmlMessageProcessor extends QualityToolMessageProcessor {
    protected PhpStanXmlMessageProcessor(QualityToolAnnotatorInfo info, int maxMessages) {
        super(info, maxMessages);
    }

    @Override
    public void parseLine(String s) {

    }

    @Override
    public void done() throws QualityToolExecutionException {

    }

    @Nullable
    @Override
    protected HighlightDisplayLevel severityToDisplayLevel(@NotNull QualityToolMessage.Severity severity) {
        return null;
    }

    @NotNull
    @Override
    protected String getQuickFixFamilyName() {
        return null;
    }

    @Nullable
    @Override
    protected Configurable getToolConfigurable(@NotNull Project project) {
        return null;
    }
}
