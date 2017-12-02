package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

import java.util.List;

public class FormulaExpressionType {
    protected byte[] condition;
    protected byte[] formula;
    protected List<FormulaComponentType> formulaComponent;

    public byte[] getCondition() {
        return condition;
    }

    public void setCondition(byte[] condition) {
        this.condition = condition;
    }

    public byte[] getFormula() {
        return formula;
    }

    public void setFormula(byte[] formula) {
        this.formula = formula;
    }

    public List<FormulaComponentType> getFormulaComponent() {
        return formulaComponent;
    }

    public void setFormulaComponent(List<FormulaComponentType> formulaComponent) {
        this.formulaComponent = formulaComponent;
    }
}
