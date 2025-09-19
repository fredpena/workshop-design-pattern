package dev.fredpena.designpattern.structural.decorator;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 09:36
 */
public class DataSourceDecorator implements DataSource {
    protected final DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
