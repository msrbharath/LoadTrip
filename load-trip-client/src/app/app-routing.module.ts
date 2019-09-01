import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { TripDetailsComponent } from './trip-details/trip-details.component';
import { ExpenseDetailsComponent } from './expense-details/expense-details.component';
import { TripReportComponent } from './trip-report/trip-report.component';
import { TripListComponent } from './trip-list/trip-list.component';
import { ExpenseListComponent } from './expense-list/expense-list.component';

const routes: Routes = [
  { path: '', redirectTo: 'employee', pathMatch: 'full' },
  { path: 'employees', component: EmployeeListComponent },
  { path: 'add', component: CreateEmployeeComponent },
  { path: 'details/:id', component: EmployeeDetailsComponent },
  { path: 'trip', component: TripDetailsComponent },
  { path: 'tripList', component: TripListComponent},
  { path: 'expense', component: ExpenseDetailsComponent },
  { path: 'expenseList', component: ExpenseListComponent },
  { path: 'report', component: TripReportComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
