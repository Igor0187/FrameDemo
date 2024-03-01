package api.pojo.requests;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserBuilder {

    @Builder.Default
    private String name = "Denis";
    @Builder.Default
    private String job = "default job";
}
