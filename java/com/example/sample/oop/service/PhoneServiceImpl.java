package com.example.sample.oop.service;

import com.example.sample.oop.domain.CelPhone;
import com.example.sample.oop.domain.GalPhone;
import com.example.sample.oop.domain.IPhone;
import com.example.sample.oop.domain.Phone;

/**
 * packageName: com.example.sample.oop.service
 * fileName   : PhoneServiceImpl
 * author     : Jangwonjong
 * date       : 2022-02-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-09     Jangwonjong       최초 생성
 */
public class PhoneServiceImpl implements PhoneService {

    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCelPhone(CelPhone phone) {
        System.out.println(phone.toString());

    }

    @Override
    public void useIPhone(IPhone phone) {
        System.out.println(phone.toString());

    }

    @Override
    public void useGalPhone(GalPhone phone) {
        System.out.println(phone.toString());

    }
}
