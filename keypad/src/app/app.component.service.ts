import { Injectable } from '@angular/core'
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Data {
    value: string;
}

@Injectable()
export class FetchService{
    constructor(private http: HttpClient){}

    fetchData(parameter) : Observable<Data>{
        const params = new HttpParams().set('phone', parameter);
        return this.http.get<Data>('http://localhost:8080/test', {params: params});
    
    }

}