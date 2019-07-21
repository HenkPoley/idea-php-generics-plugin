package de.espend.idea.php.generics.inspection;

import com.intellij.codeInspection.LocalInspectionTool;
import com.intellij.codeInspection.ProblemsHolder;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.jetbrains.php.lang.psi.elements.FunctionReference;
import com.jetbrains.php.lang.psi.elements.ParameterList;
import org.jetbrains.annotations.NotNull;

public class ParameterInspection extends LocalInspectionTool {
    public static final String MESSAGE = "Annotation is deprecated";

    @NotNull
    @Override
    public PsiElementVisitor buildVisitor(final @NotNull ProblemsHolder holder, boolean isOnTheFly) {
        return new PsiElementVisitor() {
            @Override
            public void visitElement(PsiElement element) {
                if (element instanceof ParameterList) {
                    visitParameterList((ParameterList) element, holder);
                }

                super.visitElement(element);
            }
        };
    }

    private void visitParameterList(ParameterList parameterList, @NotNull ProblemsHolder holder) {
        PsiElement method = parameterList.getParent();
        if (!(method instanceof FunctionReference)) {
            return;
        }

        PsiElement resolve = ((FunctionReference) method).resolve();

        System.out.println(resolve);


    }

    @Override
    public boolean runForWholeFile() {
        return true;
    }
}
