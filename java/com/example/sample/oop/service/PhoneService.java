package com.example.sample.oop.service;

import com.example.sample.oop.domain.CelPhone;
import com.example.sample.oop.domain.GalPhone;
import com.example.sample.oop.domain.IPhone;
import com.example.sample.oop.domain.Phone;

/**
 * packageName: com.example.sample.oop.service
 * fileName   : PhoneService
 * author     : Jangwonjong
 * date       : 2022-02-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-09     Jangwonjong       최초 생성
 */
public interface PhoneService {
    void usePhone(Phone phone);
    void useCelPhone(CelPhone phone);
    void useIPhone(IPhone phone);
    void useGalPhone(GalPhone phone);
}
