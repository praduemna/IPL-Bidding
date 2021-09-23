import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { Player } from './player';
import { catchError } from 'rxjs/operators'
import { NewPlayer } from './new-player';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  baseUrl: string = "http://localhost:8081/addplayer"
  headers = {
    headers: new HttpHeaders({
      'Content-Type':'application/json'
    })
  }

  constructor(private http: HttpClient) { }

  registerPlayerService(player:NewPlayer): Observable<any>{
    const body =  JSON.stringify(player)
    return this.http.post(this.baseUrl , body, this.headers).pipe(catchError(this.handleError))
  }

  private handleError(error:HttpErrorResponse){
    if(error.status === 0){
      console.error('An error occured...')
    }
    else{
      console.error('Backend returned code ${error.status}, body was `', error.error)
    }
    return throwError('Error occured! Please try again')
  }
}
