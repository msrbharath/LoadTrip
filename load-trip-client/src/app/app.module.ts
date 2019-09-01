import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { HttpClientModule } from '@angular/common/http';
import { TripDetailsComponent } from './trip-details/trip-details.component';
import { ExpenseDetailsComponent } from './expense-details/expense-details.component';
import { TripReportComponent } from './trip-report/trip-report.component';
import { CreateTripComponent } from './create-trip/create-trip.component';
import { CreateExpenseComponent } from './create-expense/create-expense.component';
import { TripListComponent } from './trip-list/trip-list.component';
import { ExpenseListComponent } from './expense-list/expense-list.component';
import { BsDatepickerModule } from 'ngx-bootstrap/datepicker';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
@NgModule({
  declarations: [
    AppComponent,
    CreateEmployeeComponent,
    EmployeeDetailsComponent,
    EmployeeListComponent,
    TripDetailsComponent,
    ExpenseDetailsComponent,
    TripReportComponent,
    CreateTripComponent,
    CreateExpenseComponent,
    TripListComponent,
    ExpenseListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BsDatepickerModule.forRoot(),
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
