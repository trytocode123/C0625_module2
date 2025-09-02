package furama.service;

import furama.entity.Booking;
import furama.repository.PromotionRepository;

import java.util.Stack;
import java.util.TreeSet;

public class PromotionService implements IPromotionService {
    PromotionRepository promotionRepository = new PromotionRepository();

    @Override
    public TreeSet<Booking> findAllByYear(int year) {
        return promotionRepository.findAllByYear(year);
    }

    @Override
    public void addVoucher(int voucher10, int voucher20, int voucher50) {
         promotionRepository.addVoucher(voucher10, voucher20, voucher50);
    }

    public Stack<Booking> findAllVoucher() {
        return promotionRepository.findAllVoucher();
    }
}
