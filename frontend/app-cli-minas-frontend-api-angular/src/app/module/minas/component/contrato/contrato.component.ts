/*
 * @fileoverview    {ContratoComponent}
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
import { Component } from '@angular/core';
import { GenericComponent } from '@app/module/essential/component/generic.component';
import { ContratoViewModel } from '../../model/contrato.model';

/**
 * TODO: Description of {@code ContratoComponent}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
@Component({
    selector: 'app-contrato',
    templateUrl: './contrato.component.html',
    standalone: false,
    styleUrls: ['./contrato.component.css']
})
export class ContratoComponent extends GenericComponent<ContratoViewModel> {

    /**
     * TODO: Description of method {@code constructor}.
     *
     */
    public constructor(
        entityInstance: ContratoViewModel) {
        super(entityInstance);
    }

}
