package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

import java.util.List;

public class PriceFormulaType {
    protected String expression;
    protected String agenda;
    protected List<FormulaExpressionType> formulaExpression;

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public List<FormulaExpressionType> getFormulaExpression() {
        return formulaExpression;
    }

    public void setFormulaExpression(List<FormulaExpressionType> formulaExpression) {
        this.formulaExpression = formulaExpression;
    }
}
