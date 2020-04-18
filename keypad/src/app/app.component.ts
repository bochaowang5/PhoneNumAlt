import { Component, OnInit, OnChanges } from '@angular/core';
import { FetchService } from './app.component.service';
import { FormGroup, FormControl } from '@angular/forms';
// import { HttpClient } from '@angular/common/http';
// import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  nums;
  len;
  input;
  title = 'keypad';
  // config:any;
  p:number = 1;

  constructor(private fetchService : FetchService){
    // this.config = {
    //   itemsPerPage: 20,
    //   currentPage: 1,
    //   totalItems: 256
    // };
  }

  
    // this.theform = new FormGroup({
    //   phone: new FormControl()
    // });
  
    // this.nums = "";
    // this.arr = this.nums.split(" ");
    // this.len = this.arr.length;
 
  fetchData(parameter){
     this.nums = this.fetchService.fetchData(parameter);
  }
    
  // pageChanged(event){
  //   this.config.currentPage = event;
  // }
    // this.fetchService.fetchData().subscribe(res => {
    //   this.nums = res;
    // })

    // this.http.get('http://localhost:8080/test?phone=52', { responseType: 'text'}).subscribe(res => {
    //         this.nums = res;   this.arr =  this.nums.split(" ");
    //         this.len = this.arr.length;
    //     })
    

}

