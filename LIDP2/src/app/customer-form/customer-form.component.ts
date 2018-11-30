import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer.interface';
import { CustomerService } from '../customer.service';
@Component({
  selector: 'app-customer-form',
  templateUrl: './customer-form.component.html',
  styleUrls: ['./customer-form.component.css']
})
export class CustomerFormComponent implements OnInit {

  customers: Customer = { name: '', age: 0 };

  constructor(private customerService: CustomerService) { }
  ngOnInit() {
  }
// Sends Post to Sprintboot server
  onSubmit() {
    this.customerService.createCustomer(this.customers).subscribe(
      value => {
        console.log('[POST] create Customer successfully', value);
      }, error => {
        console.log('FAIL to create Customer!');
      },
      () => {
        console.log('POST Customer - now completed.');
      });
  }
 }
