import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { DataService } from '../data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashbord',
  templateUrl: './dashbord.component.html',
  styleUrls: ['./dashbord.component.css']
})
export class DashbordComponent {

  constructor(private dataService:DataService,private router:Router){}
  


  userForm !: FormGroup;

  ngOnInit(): void {
    this.userForm = new FormGroup({
      id:new FormControl('',Validators.required),
      firstName: new FormControl('', Validators.required),
      middleName: new FormControl(''),
      lastName: new FormControl('', Validators.required),
      UID: new FormControl('', Validators.required),
      gender: new FormControl('', Validators.required),
      country: new FormControl('', Validators.required),
      state: new FormControl('', Validators.required),
      dist: new FormControl('', Validators.required),
      pin: new FormControl('', Validators.required)
    });
  }

  onSubmit() {
    console.log(this.userForm.value);
  }
  

  onNext() {
    this.router.navigate(['/user-details']);
    
  }

  onSave() {
    this.dataService.sendData(this.userForm.value).subscribe(
      response => {
        console.log('Data sent successfully', response);
      },
      error => {
        console.log('Error sending data', error);
      }
    );
  }

}
