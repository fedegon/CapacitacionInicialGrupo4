import { TestBed, inject } from '@angular/core/testing';

import { NormalUserService } from './normal-user.service';

describe('NormalUserService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [NormalUserService]
    });
  });

  it('should be created', inject([NormalUserService], (service: NormalUserService) => {
    expect(service).toBeTruthy();
  }));
});
