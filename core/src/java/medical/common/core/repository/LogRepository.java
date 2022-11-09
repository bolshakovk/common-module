package medical.common.core.repository;

import model.LogDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LogRepository extends JpaRepository<LogDto, Long> {
    void addLogsInDBDebug(LogDto logDTO);
    void addLogsInDBExeption(LogDto logDTO);
}
