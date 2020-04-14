import {Component} from '@angular/core';
import {GenericService} from './services/generic.service';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {

    personas;


    constructor(genericService: GenericService) {

        genericService.post('persona/getLista').subscribe((response) => {
            this.personas = response;
        });

    }


}
