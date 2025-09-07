package furama.repository;

import furama.entity.Booking;
import furama.entity.Contract;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ContractRepository implements IContractRepository {
    List<Contract> contracts = new ArrayList<>();
    TreeSet<Booking> bookings = new TreeSet<>(new BookingComparator());

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

    @Override
    public boolean delete(int i) {
        return false;
    }

    public List<Contract> findAll() {
        return contracts;
    }

    public int isValid(int iD) {
        for (int i = 0; i < contracts.size(); i++) {
            if (contracts.get(i).getID() == (iD)) {
                return i;
            }
        }
        return -1;
    }
}
