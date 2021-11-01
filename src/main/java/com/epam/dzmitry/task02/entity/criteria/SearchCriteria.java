package com.epam.dzmitry.task02.entity.criteria;

public final class SearchCriteria {

    public enum General {
        NAME
    }

    public enum Oven {
        PRICE, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    public enum Laptop {
        PRICE, OS, BATTERY_CAPACITY, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_SIZE
    }

    public enum Refrigerator {
        PRICE, POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }

    public enum VacuumCleaner {
        PRICE, POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
    }

    public enum TabletPC {
        PRICE, COLOR, BATTERY_CAPACITY, MEMORY_ROM, FLASH_MEMORY_CAPACITY, DISPLAY_SIZE
    }

    public enum Speakers {
        PRICE, POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, CORD_LENGTH
    }
}
