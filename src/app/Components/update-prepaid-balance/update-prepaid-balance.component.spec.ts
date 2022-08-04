import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatePrepaidBalanceComponent } from './update-prepaid-balance.component';

describe('UpdatePrepaidBalanceComponent', () => {
  let component: UpdatePrepaidBalanceComponent;
  let fixture: ComponentFixture<UpdatePrepaidBalanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdatePrepaidBalanceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdatePrepaidBalanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
