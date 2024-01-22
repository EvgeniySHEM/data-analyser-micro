package ru.sanctio.dataanalysermicro.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sanctio.dataanalysermicro.model.Data;
import ru.sanctio.dataanalysermicro.repository.DataRepository;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService{

    private final DataRepository dataRepository;

    @Override
    @Transactional
    public void handle(Data data) {
        log.info("Data object {} was saved", data);
        dataRepository.save(data);
    }
}
