package pl.codeschenker.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Data
@NoArgsConstructor
@ToString
public class FilterSearchCriteriaDto {

    private String searchType;
    private List<String> searchParams;
    private String sortBy;
}
