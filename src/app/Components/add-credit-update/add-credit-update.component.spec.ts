import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddCreditUpdateComponent } from './add-credit-update.component';

describe('AddCreditUpdateComponent', () => {
  let component: AddCreditUpdateComponent;
  let fixture: ComponentFixture<AddCreditUpdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddCreditUpdateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddCreditUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
