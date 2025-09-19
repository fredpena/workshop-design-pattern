package dev.fredpena.designpattern.structural.decorator;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 09:37
 */
public class SalaryManager {
    private final DataSource source;

    public SalaryManager(DataSource source) {
        this.source = source;
    }

    public String load() {
        return source.readData();
    }

    public void save(String salaryRecords) {
        source.writeData(salaryRecords);
    }
}