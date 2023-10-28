import { NgModule } from '@angular/core';
import { UserDetailsComponent } from '../user-details/user-details.component';
import { DashbordComponent } from '../dashbord/dashbord.component';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: 'dashboard', component: DashbordComponent },
  { path: 'user-details', component: UserDetailsComponent }
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
