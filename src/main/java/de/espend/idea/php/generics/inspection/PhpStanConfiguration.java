package de.espend.idea.php.generics.inspection;

import com.intellij.openapi.project.Project;
import com.jetbrains.php.tools.quality.QualityToolConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PhpStanConfiguration implements QualityToolConfiguration {
    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getPresentableName(@Nullable Project project) {
        return null;
    }

    @Override
    public String getInterpreterId() {
        return null;
    }

    @Override
    public int getTimeout() {
        return 15;
    }

    @Override
    public void setTimeout(int i) {

    }

    @Override
    public String getToolPath() {
        return null;
    }

    @Override
    public void setToolPath(String s) {

    }

    @Override
    public int getMaxMessagesPerFile() {
        return 100;
    }

    @Override
    public void setMaxMessagesPerFile(int i) {

    }

    @Override
    public int compareTo(@NotNull QualityToolConfiguration qualityToolConfiguration) {
        return 0;
    }
}
