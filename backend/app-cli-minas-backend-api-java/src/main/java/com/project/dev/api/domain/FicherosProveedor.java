/*
 * @fileoverview    {FicherosProveedor}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Description of {@code FicherosProveedor}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Entity
@Table(name = "\"FicherosProveedor\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class FicherosProveedor implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String strCif;
    @Column(length = 200)
    private String strNombre;
    private Integer intTopeMensual;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechaHoraCarga;
    @Column(length = 20)
    private String strIdUsuario;

}
