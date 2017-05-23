package com.dao;

import com.domain.Address;
import com.tim.BaseClass.BaseClassImpl.BaseDaoImpl;
import org.springframework.stereotype.Component;

/**
 * Created by timhuo on 2017/5/23.
 */
@Component("addressDao")
public class AddressDao extends BaseDaoImpl<Address> {
}
