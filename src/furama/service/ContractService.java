package furama.service;

import furama.entity.Contract;
import furama.repository.ContractRepository;

import java.util.List;

public class ContractService implements IContractService {
    ContractRepository contractRepository = new ContractRepository();

    @Override
    public boolean add(Contract contract) {
        return contractRepository.add(contract);
    }

    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    public int isValid(int iD) {
        return contractRepository.isValid(iD);
    }

    public boolean update(int index, Contract contract) {
        return contractRepository.update(index, contract);
    }

    @Override
    public boolean delete(String iDCus) {
        return false;
    }

    @Override
    public int isValid(String IdCus) {
        return 0;
    }
}
