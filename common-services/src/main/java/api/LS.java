package api;

import model.LogDto;

public interface LS {
    void addLogsInDBDebug(LogDto logDTO);
    void addLogsInDBExeption(LogDto logDTO);
}
