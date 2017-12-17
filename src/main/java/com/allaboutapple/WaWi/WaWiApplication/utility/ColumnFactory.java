package com.allaboutapple.WaWi.WaWiApplication.utility;

import com.allaboutapple.WaWi.WaWiApplication.model.magento.TreeObject;
import com.jfoenix.controls.JFXTreeTableColumn;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeTableColumn;
import javafx.util.Callback;

public class ColumnFactory<T extends TreeObject> {

    private static final ColumnFactory OBJ = new ColumnFactory();

    public static ColumnFactory getInstance() {
        return OBJ;
    }

    public JFXTreeTableColumn<T, String> createColumn(String label, String property, int width ) {

        JFXTreeTableColumn<T, String> column = new JFXTreeTableColumn<>(label);
        column.setPrefWidth(width);
        column.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<T, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<T, String> orderTreeObjectStringCellDataFeatures) {
                return orderTreeObjectStringCellDataFeatures.getValue().getValue().getProperty(property);
            }
        });

        return column;
    }

    public JFXTreeTableColumn<T, String> createColumn(String label, String property) {
        return createColumn(label, property, 150);
    }
}