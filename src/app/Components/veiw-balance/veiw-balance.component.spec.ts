import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VeiwBalanceComponent } from './veiw-balance.component';

describe('VeiwBalanceComponent', () => {
  let component: VeiwBalanceComponent;
  let fixture: ComponentFixture<VeiwBalanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VeiwBalanceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VeiwBalanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
