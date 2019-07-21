package de.espend.idea.php.generics.inspection;

import com.intellij.execution.ExecutionException;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import com.jetbrains.php.config.interpreters.PhpSdkFileTransfer;
import com.jetbrains.php.tools.quality.QualityToolAnnotator;
import com.jetbrains.php.tools.quality.QualityToolAnnotatorInfo;
import com.jetbrains.php.tools.quality.QualityToolMessageProcessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PhpStanAnnotatorProxy extends QualityToolAnnotator {
    public static final PhpStanAnnotatorProxy INSTANCE = new PhpStanAnnotatorProxy();

    @Override
    protected void runTool(@NotNull QualityToolMessageProcessor messageProcessor, @NotNull QualityToolAnnotatorInfo annotatorInfo, @NotNull PhpSdkFileTransfer transfer) throws ExecutionException {
        super.runTool(messageProcessor, annotatorInfo, transfer);
    }

    @NotNull
    @Override
    protected String getTemporaryFilesFolder() {
        return "phpstan_temp.tmp";
    }

    @NotNull
    @Override
    protected String getInspectionId() {
        return new PhpStanInspection().getID();
    }

    @Override
    protected QualityToolMessageProcessor createMessageProcessor(@NotNull QualityToolAnnotatorInfo collectedInfo) {
        return new PhpStanXmlMessageProcessor(collectedInfo, collectedInfo.getMaxMessagesPerFile());
    }
}
