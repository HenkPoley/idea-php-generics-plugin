package de.espend.idea.php.generics.inspection;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.project.Project;
import com.jetbrains.php.tools.quality.QualityToolConfigurationManager;
import com.jetbrains.php.tools.quality.QualityToolProjectConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PhpStanProjectConfiguration extends QualityToolProjectConfiguration<PhpStanConfiguration> implements PersistentStateComponent<PhpStanConfiguration> {
    @Nullable
    @Override
    public PhpStanConfiguration getState() {
        return null;
    }

    @Override
    public void loadState(@NotNull PhpStanConfiguration phpStanConfiguration) {

    }

    @NotNull
    @Override
    protected String getQualityToolName() {
        return "PHPStan";
    }

    @NotNull
    @Override
    protected QualityToolConfigurationManager<PhpStanConfiguration> getConfigurationManager(@NotNull Project project) {
        return null;
    }
}
