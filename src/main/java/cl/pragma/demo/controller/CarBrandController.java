package cl.pragma.demo.controller;

import cl.pragma.demo.dto.CarBrandDto;
import cl.pragma.demo.service.CarBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/car-brands")
public class CarBrandController {
    @Autowired
    private CarBrandService carBrandService;

    @GetMapping
    public List<CarBrandDto> getCarBrands() {
        return carBrandService.getCarBrands();
    }
}

