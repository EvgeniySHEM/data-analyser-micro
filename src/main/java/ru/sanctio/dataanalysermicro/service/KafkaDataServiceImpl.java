package ru.sanctio.dataanalysermicro.service;

import org.springframework.stereotype.Service;
import ru.sanctio.dataanalysermicro.model.Data;

@Service
public class KafkaDataServiceImpl implements KafkaDataService{
    @Override
    public void handle(Data data) {
        System.out.println("Data object is received: " + data.toString());
    }
}
