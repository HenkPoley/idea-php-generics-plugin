package de.espend.idea.php.generics.inspection;

import com.intellij.codeInspection.CleanupLocalInspectionTool;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import com.jetbrains.php.tools.quality.QualityToolAnnotator;
import com.jetbrains.php.tools.quality.QualityToolAnnotatorInfo;
import com.jetbrains.php.tools.quality.QualityToolValidationInspection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PhpStanInspection extends QualityToolValidationInspection implements CleanupLocalInspectionTool {
    @NotNull
    @Override
    protected QualityToolAnnotator getAnnotator() {
        return PhpStanAnnotatorProxy.INSTANCE;
    }

    public String getDisplayName() {
        return "PHPStan Validation";
    }

    @Override
    public String getToolName() {
        return "PHPStan";
    }

}
