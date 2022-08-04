import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateCurrentBalanceComponent } from './update-current-balance.component';

describe('UpdateCurrentBalanceComponent', () => {
  let component: UpdateCurrentBalanceComponent;
  let fixture: ComponentFixture<UpdateCurrentBalanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateCurrentBalanceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateCurrentBalanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
