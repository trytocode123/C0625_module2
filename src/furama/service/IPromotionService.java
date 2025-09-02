package furama.service;

import furama.entity.Booking;

import java.util.Stack;
import java.util.TreeSet;

public interface IPromotionService {
    TreeSet<Booking> findAllByYear(int year);

    void addVoucher(int voucher10, int voucher20, int voucher50);
}
