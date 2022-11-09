package service;

import api.LS;
import lombok.RequiredArgsConstructor;
import api.LogRepository;
import model.LogDto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogService implements LS {
    private final LogRepository logRepository;


    @Override
    public void addLogsInDBDebug(LogDto logDTO) {
        logRepository.save(logDTO);
    }

    @Override
    public void addLogsInDBExeption(LogDto logDTO) {
        logRepository.save(logDTO);
    }
}
