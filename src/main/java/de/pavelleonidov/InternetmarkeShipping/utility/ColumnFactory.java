package de.pavelleonidov.InternetmarkeShipping.utility;

import de.pavelleonidov.InternetmarkeShipping.model.magento.TreeObject;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.cells.editors.base.JFXTreeTableCell;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeTableCell;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.text.Text;
import javafx.util.Callback;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.format.DateTimeFormatter;

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

    public JFXTreeTableColumn<T, String> createDateColumn(String label, String property) {
        JFXTreeTableColumn<T, String> column = createColumn(label, property, 150);
        column.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<T, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<T, String> orderTreeObjectStringCellDataFeatures) {

                StringProperty utcDateProperty = orderTreeObjectStringCellDataFeatures.getValue().getValue().getProperty(property);

                DateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                sourceFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

                Date dateTime = null;
                try {
                    dateTime = sourceFormat.parse(utcDateProperty.getValue());
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                targetFormat.setTimeZone(TimeZone.getDefault());

                return new SimpleStringProperty(targetFormat.format(dateTime));

            }

        });

        return column;
    }
}
