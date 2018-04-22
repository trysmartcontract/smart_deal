package ru.github.try_contract.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import ru.github.try_contract.model.BugPriority;
import ru.github.try_contract.model.Stage;
import ru.github.try_contract.service.Web3jSoftwareDevelopmentService;

import java.io.IOException;

@Service
public class Web3jSoftwareDevelopmentServiceImpl implements Web3jSoftwareDevelopmentService {
    private Web3j web3j;

    @Autowired
    public void setWeb3j(Web3j web3j) {
        this.web3j = web3j;
    }

    @Override
    public void initContractCost(double value) throws IOException {

    }

    @Override
    public void initStages(Stage[] stages) throws IOException {

    }

    @Override
    public void initBugPriority(BugPriority bugPriority) throws IOException {

    }

    @Override
    public void initForfeit(int forfeit) throws IOException {

    }

    @Override
    public void changeStageDateEnd(String stageName, long dateEnd) {

    }

    @Override
    public Stage getStageByName(String name) throws IOException {
        return null;
    }

    @Override
    public Stage getCurrentStage() throws IOException {
        return null;
    }

    @Override
    public BugPriority getPriorityByStageName(String stageName) throws IOException {
        return null;
    }

    @Override
    public void selfDestruct() throws IOException {

    }

    @Override
    public void selfDestruct(String owner, String worker) {

    }

    @Override
    public void finishContract(Stage[] stages) throws IOException {

    }
}
