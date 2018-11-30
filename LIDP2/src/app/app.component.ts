
import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'LIDP_UI_Challenge';
  description = 'Angular-SpringBoot Demo';

  names = '';

 constructor(private http: HttpClient) {}

 ngOnInit(): void {

    this.http.get('localhost:8080/hello-world').subscribe(data => {
      console.log(data);
    });
  }
}
