package com.server.Impl;

import com.domain.Address;
import com.server.AddressServer;
import com.tim.BaseClass.BaseClassImpl.BaseServerImpl;
import org.springframework.stereotype.Service;

/**
 * Created by timhuo on 2017/5/23.
 */
@Service("addressServer")
public class AddressServerImpl extends BaseServerImpl<Address> implements AddressServer {
}
