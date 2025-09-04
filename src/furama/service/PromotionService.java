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

    public Stack<Booking> findAllVoucher() {
        return promotionRepository.findAllVoucher();
    }
}
