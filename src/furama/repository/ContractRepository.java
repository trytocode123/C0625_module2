package furama.repository;

import furama.entity.Booking;
import furama.entity.Contract;


import java.util.ArrayList;
import java.util.List;

public class ContractRepository implements IContractRepository {
    List<Contract> contracts = new ArrayList<>();

    @Override
    public boolean add(Contract contract) {
        contracts.add(contract);
        return true;
    }

    @Override
    public boolean update(int i, Contract contract) {
        contracts.set(i, contract);
        return true;
    }

    public List<Contract> findAll() {
        return contracts;
    }

    public int isValid(String iD) {
        for (int i = 0; i < contracts.size(); i++) {
            if (contracts.get(i).getID().equals(iD)) {
                return i;
            }
        }
        return -1;
    }
}
