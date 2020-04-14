import {environment} from '../../environments/environment';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Router} from '@angular/router';
import {Observable} from 'rxjs';
import {Injectable} from '@angular/core';


@Injectable()
export class GenericService {

    constructor(private http: HttpClient, private router: Router) {
    }

    post(url: string, parametro?) {
        let postUrl = environment.POST_URL + url;
        let opciones = <any> {};

        opciones.headers = new HttpHeaders().set('Content-Type', 'application/json');

        return new Observable(observable => {
            this.http.post(postUrl, parametro, opciones).subscribe(
                (res: any) => {
                    observable.next(res);
                    observable.complete();
                }, (error) => {
                    observable.error(error);
                    observable.complete();
                });
        });
    }

    get(url: string, parametro?) {
        let postUrl = environment.POST_URL + url;

        return new Observable(observable => {
            this.http.get(postUrl, parametro).subscribe(
                (res: any) => {
                    observable.next(res);
                    observable.complete();
                }, (error) => {
                    observable.error(error);
                    observable.complete();
                });
        });
    }

}
