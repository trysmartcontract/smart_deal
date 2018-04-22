package ru.github.try_contract.service;

import ru.github.try_contract.model.BugPriority;
import ru.github.try_contract.model.Stage;

import java.io.IOException;

public interface Web3jSoftwareDevelopmentService {
    void initStages(Stage[] stages) throws IOException;

    void initBugPriority(BugPriority bugPriority) throws IOException;

    void initForfeit(int forfeit) throws IOException;

    void changeStageDateEnd(String stageName, long dateEnd);

    Stage getStageByName(String name) throws IOException;

    Stage getCurrentStage() throws IOException;

    BugPriority getBugPriority() throws IOException; //Для будущей проверки в системе  BugTracking

    void selfDestruct() throws IOException;

    void selfMultiDestruct() throws IOException;

    void finishContract(Stage[] stages) throws IOException;
}
