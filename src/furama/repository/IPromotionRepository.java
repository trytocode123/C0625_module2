package furama.repository;

import furama.entity.Booking;

import java.util.TreeSet;

public interface IPromotionRepository {
    TreeSet<Booking> findAllByYear(int year);
}
