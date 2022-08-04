import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateSavingBalanceComponent } from './update-saving-balance.component';

describe('UpdateSavingBalanceComponent', () => {
  let component: UpdateSavingBalanceComponent;
  let fixture: ComponentFixture<UpdateSavingBalanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateSavingBalanceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateSavingBalanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
