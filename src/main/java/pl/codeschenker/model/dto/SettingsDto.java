package pl.codeschenker.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class SettingsDto {



    private String field;

    private String minValue;

    private String maxValue;

    private String value;

    private String timestamp;

}
