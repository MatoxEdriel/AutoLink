package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.event.EventListenerList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public abstract class GenericDomainTableModel<T> implements TableModel {

    private final EventListenerList listenerList;
    private final List<Object> columnIdentifiers; // Usar Object en lugar de List
    private final List<T> data;

    public GenericDomainTableModel() {
        data = new ArrayList<>();
        columnIdentifiers = new ArrayList<>();
        listenerList = new EventListenerList();
    }

    public GenericDomainTableModel(List<Object> columnIdentifiers) {
        this();
        if (columnIdentifiers != null) {
            this.columnIdentifiers.addAll(columnIdentifiers);
        }
    }

    public GenericDomainTableModel(Object[] columnIdentifiers) {
        this();
        if (columnIdentifiers != null) {
            this.columnIdentifiers.addAll(Arrays.asList(columnIdentifiers));
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        listenerList.add(TableModelListener.class, l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        listenerList.remove(TableModelListener.class, l);
    }

    public TableModelListener[] getTableModelListeners() {
        return listenerList.getListeners(TableModelListener.class);
    }

    protected void notifyTableChanged(TableModelEvent e) {
        TableModelListener[] listeners = getTableModelListeners();
        for (int i = listeners.length - 1; i >= 0; i--) {
            listeners[i].tableChanged(e);
        }
    }

    protected void notifyTableHeaderChanged() {
        TableModelEvent e = new TableModelEvent(this, TableModelEvent.HEADER_ROW);
        notifyTableChanged(e);
    }

    protected void notifyTableRowsInserted(int firstRow, int lastRow) {
        TableModelEvent e = new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);
        notifyTableChanged(e);
    }

    protected void notifyTableRowsUpdated(int firstRow, int lastRow) {
        TableModelEvent e = new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE);
        notifyTableChanged(e);
    }

    protected void notifyTableRowsDeleted(int firstRow, int lastRow) {
        TableModelEvent e = new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE);
        notifyTableChanged(e);
    }

    protected void notifyTableCellUpdated(int row, int column) {
        TableModelEvent e = new TableModelEvent(this, row, row, column);
        notifyTableChanged(e);
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnIdentifiers.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex >= 0 && columnIndex < getColumnCount()) {
            return columnIdentifiers.get(columnIndex).toString();
        } else {
            throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public void addRow(T domainObject) {
        int rowIndex = data.size();
        data.add(domainObject);
        notifyTableRowsInserted(rowIndex, rowIndex);
    }

    public void addRows(List<T> domainObjects) {
        if (!domainObjects.isEmpty()) {
            int firstRow = data.size();
            data.addAll(domainObjects);
            int lastRow = data.size() - 1;
            notifyTableRowsInserted(firstRow, lastRow);
        }
    }

    public void insertRow(T domainObject, int rowIndex) {
        data.add(rowIndex, domainObject);
        notifyTableRowsInserted(rowIndex, rowIndex);
    }

    public void notifyDomainObjectUpdated(T domainObject) {
        int rowIndex = data.indexOf(domainObject);
        if (rowIndex > -1) {
            notifyTableRowsUpdated(rowIndex, rowIndex);
        }
    }

    public void deleteRow(T domainObject) {
        int rowIndex;
        while ((rowIndex = data.indexOf(domainObject)) > -1) {
            data.remove(domainObject);
            notifyTableRowsDeleted(rowIndex, rowIndex);
        }
    }

    public void updateRow(T domainObject) {
        int rowIndex = data.indexOf(domainObject);
        if (rowIndex > -1) {
            data.remove(domainObject);
            data.add(rowIndex, domainObject);
            notifyTableRowsUpdated(rowIndex, rowIndex);
        }
    }

    public void deleteRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < data.size()) {
            data.remove(rowIndex);
            notifyTableRowsDeleted(rowIndex, rowIndex);
        }
    }

    public void deleteRows(int firstRow, int lastRow) {
        if (firstRow >= 0 && lastRow >= firstRow && lastRow < data.size()) {
            for (int i = lastRow; i >= firstRow; i--) {
                data.remove(i);
            }
            notifyTableRowsDeleted(firstRow, lastRow);
        } else {
            throw new IllegalArgumentException("Los parámetros firstRow y lastRow deben ser positivos y firstRow <= lastRow.");
        }
    }

    public void clearTableModelData() {
        if (!data.isEmpty()) {
            int lastRow = data.size() - 1;
            data.clear();
            notifyTableRowsDeleted(0, lastRow);
        }
    }

    public T getDomainObject(int rowIndex) {
        return data.get(rowIndex);
    }

    public List<T> getDomainObjects(int firstRow, int lastRow) {
        return Collections.unmodifiableList(data.subList(firstRow, lastRow + 1));
    }

    public List<T> getDomainObjects() {
        return Collections.unmodifiableList(data);
    }

    public void setColumnIdentifiers(List<?> columnIdentifiers) {
        this.columnIdentifiers.clear();
        if (columnIdentifiers != null) {
            this.columnIdentifiers.addAll(columnIdentifiers);
        }
        notifyTableHeaderChanged();
    }
}
