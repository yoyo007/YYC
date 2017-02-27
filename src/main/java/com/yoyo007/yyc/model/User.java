package com.yoyo007.yyc.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author derrek
 */
@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable {

    private Long id;

    private String firstName;

    private String middleInitial;

    private String lastName;

}
