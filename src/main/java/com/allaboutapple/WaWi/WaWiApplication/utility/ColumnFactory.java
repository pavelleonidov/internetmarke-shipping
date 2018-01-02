package com.allaboutapple.WaWi.WaWiApplication.utility;

import com.allaboutapple.WaWi.WaWiApplication.model.magento.TreeObject;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.cells.editors.base.JFXTreeTableCell;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeTableCell;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.text.Text;
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

        column.setCellFactory(new Callback<TreeTableColumn<T, String>, TreeTableCell<T, String>>() {
            @Override
            public TreeTableCell<T, String> call(TreeTableColumn<T, String> param) {
                return new JFXTreeTableCell<T, String>() {
                    private Text text;

                    @Override
                    public void updateItem(String item, boolean empty) {
                        super.updateItem(item, empty);
                        if(!isEmpty()) {
                            text = new Text(item);
                            text.setWrappingWidth(column.getWidth());
                            this.setWrapText(true);
                            setGraphic(text);
                        }
                    }
                };
            }
        });

        return column;
    }

    public JFXTreeTableColumn<T, String> createColumn(String label, String property) {
        return createColumn(label, property, 150);
    }
}