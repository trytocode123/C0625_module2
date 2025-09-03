package furama.controllers;

import furama.entity.Facility;
import furama.service.FacilityService;
import furama.util.CheckOption;
import furama.view.FacilityView;
import furama.view.HouseView;
import furama.view.RoomView;
import furama.view.VillaView;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityManagementController {
    public void displayMenu() {
        final int DISPLAY_1 = 1;
        final int ADD = 2;
        final int DISPLAY_2 = 3;
        final int RETURN = 4;
        boolean flag = true;
        FacilityService facilityService = new FacilityService();
        while (flag) {
            System.out.println("1 Display list facility\n2 Add new facility\n3 Display list facility maintenance\n4 Return main menu");
            Scanner sc = new Scanner(System.in);
            int option = 0;
            do {
                System.out.println("Enter option");
                option = CheckOption.checkOption(option, sc);
            } while (option == -1);
            switch (option) {
                case DISPLAY_1:
                    System.out.println("This is list facilities");
                    LinkedHashMap<Facility, Integer> linkedHashMap = facilityService.findAll();
                    FacilityView.display(linkedHashMap);
                    break;

                case ADD:
                    System.out.println("Add new facility");
                    boolean flagAdd = true;
                    final int ADD_VILLA = 1;
                    final int ADD_HOUSE = 2;
                    final int ADD_ROOM = 3;
                    final int RETURN_FACILITY = 4;
                    while (flagAdd) {
                        System.out.println("1. Add New Villa\n2. Add New House\n3. Add New Room\n4. Back to menu");
                        int optionAdd = Integer.parseInt(sc.nextLine());
                        switch (optionAdd) {
                            case ADD_VILLA:
                                System.out.println("----Add New Villa----");
                                facilityService.add(VillaView.inputForVilla(), 0);
                                System.out.println("Add succeed");
                                break;
                            case ADD_HOUSE:
                                System.out.println("----Add New House----");
                                facilityService.add(HouseView.inputForHouse(), 0);
                                System.out.println("Add succeed");
                                break;
                            case ADD_ROOM:
                                System.out.println("----Add New Room----");
                                facilityService.add(RoomView.inputForRoom(), 0);
                                System.out.println("Add succeed");
                                break;
                            case RETURN_FACILITY:
                                flagAdd = false;
                        }
                    }
                    break;

                case DISPLAY_2:
                    System.out.println("This is list facilities maintenance");
                    LinkedHashMap<Facility, Integer> facilityMaintenance = new LinkedHashMap<>();
                    LinkedHashMap<Facility, Integer> facilityList = facilityService.findAll();
                    for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
                        if (entry.getValue() == 5) {
                            facilityMaintenance.put(entry.getKey(), entry.getValue());
                        }
                    }

                    for (Map.Entry<Facility, Integer> entry : facilityMaintenance.entrySet()) {
                        System.out.println(entry.getKey() + "Time of using: " + entry.getValue() + (entry.getValue() <= 1 ? " time" : " times"));
                    }
                    break;
                case RETURN:
                    flag = false;
            }
        }
    }
}
