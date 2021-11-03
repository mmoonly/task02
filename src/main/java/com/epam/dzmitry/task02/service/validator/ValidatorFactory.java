package com.epam.dzmitry.task02.service.validator;

import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.exception.CustomException;
import com.epam.dzmitry.task02.service.validator.impl.*;

import java.util.HashMap;
import java.util.Map;

public class ValidatorFactory {

    private static final ValidatorFactory instance = new ValidatorFactory();

    private final Map<String, Validator> validators = new HashMap<>();

    {
        validators.put(SearchCriteria.Oven.PRICE.name(), new PriceValidator());
        validators.put(SearchCriteria.Oven.POWER_CONSUMPTION.name(), new PowerConsumptionValidator());
        validators.put(SearchCriteria.Oven.WEIGHT.name(), new WeightValidator());
        validators.put(SearchCriteria.Oven.CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.Oven.DEPTH.name(), new DepthValidator());
        validators.put(SearchCriteria.Oven.HEIGHT.name(), new HeightValidator());
        validators.put(SearchCriteria.Oven.WIDTH.name(), new WidthValidator());

        validators.put(SearchCriteria.Laptop.PRICE.name(), new PriceValidator());
        validators.put(SearchCriteria.Laptop.OS.name(), new OSValidator());
        validators.put(SearchCriteria.Laptop.BATTERY_CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.Laptop.MEMORY_ROM.name(), new MemoryRomValidator());
        validators.put(SearchCriteria.Laptop.SYSTEM_MEMORY.name(), new SystemMemoryValidator());
        validators.put(SearchCriteria.Laptop.CPU.name(), new CPUValidator());
        validators.put(SearchCriteria.Laptop.DISPLAY_SIZE.name(), new DisplaySizeValidator());

        validators.put(SearchCriteria.Speakers.PRICE.name(), new PriceValidator());
        validators.put(SearchCriteria.Speakers.POWER_CONSUMPTION.name(), new PowerConsumptionValidator());
        validators.put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name(), new NumberOfSpeakersValidator());
        validators.put(SearchCriteria.Speakers.CORD_LENGTH.name(), new CordLengthValidator());

        validators.put(SearchCriteria.Refrigerator.PRICE.name(), new PriceValidator());
        validators.put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.name(), new PowerConsumptionValidator());
        validators.put(SearchCriteria.Refrigerator.WEIGHT.name(), new WeightValidator());
        validators.put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.Refrigerator.HEIGHT.name(), new HeightValidator());
        validators.put(SearchCriteria.Refrigerator.WIDTH.name(), new WidthValidator());

        validators.put(SearchCriteria.TabletPC.PRICE.name(), new PriceValidator());
        validators.put(SearchCriteria.TabletPC.BATTERY_CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.TabletPC.COLOR.name(), new ColorValidator());
        validators.put(SearchCriteria.TabletPC.MEMORY_ROM.name(), new MemoryRomValidator());
        validators.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.TabletPC.DISPLAY_SIZE.name(), new DisplaySizeValidator());

        validators.put(SearchCriteria.VacuumCleaner.PRICE.name(), new PriceValidator());
        validators.put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.name(), new PowerConsumptionValidator());
        validators.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.name(), new FilterTypeValidator());
        validators.put(SearchCriteria.VacuumCleaner.WAND_TYPE.name(), new WandTypeValidator());
        validators.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.name(), new MotorSpeedRegulationValidator());
        validators.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.name(), new CleaningWidthValidator());

    }

    private ValidatorFactory() {
    }

    public static ValidatorFactory getInstance() {
        return instance;
    }

    public Validator getValidator(String criteriaName) {
        if (validators.containsKey(criteriaName)) {
            return validators.get(criteriaName);
        }
        throw new CustomException("No such criteria");
    }
}
