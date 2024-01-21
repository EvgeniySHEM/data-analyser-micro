package ru.sanctio.dataanalysermicro.service;

import ru.sanctio.dataanalysermicro.model.Data;

public interface KafkaDataService {

    void handle(Data data);

}
