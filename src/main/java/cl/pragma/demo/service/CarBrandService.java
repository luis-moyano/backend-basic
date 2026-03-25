package cl.pragma.demo.service;

import cl.pragma.demo.dto.CarBrandDto;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CarBrandService {
    public List<CarBrandDto> getCarBrands() {
        return Arrays.asList(
            new CarBrandDto("Toyota"),
            new CarBrandDto("Ford"),
            new CarBrandDto("Chevrolet"),
            new CarBrandDto("Honda"),
            new CarBrandDto("Volkswagen")
        );
    }
}

