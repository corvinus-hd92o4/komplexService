package hu.cegnev.komplexservice.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
//dto: informaciot tarol es hordoz
public class ComplexNumberRecordDto {
    private double real;
    private double imag;
}
