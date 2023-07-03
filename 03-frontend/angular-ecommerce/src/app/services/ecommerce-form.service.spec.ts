import { TestBed } from '@angular/core/testing';

import { ECommerceFormService } from './ecommerce-form.service';

describe('ECommerceFormService', () => {
  let service: ECommerceFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ECommerceFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
