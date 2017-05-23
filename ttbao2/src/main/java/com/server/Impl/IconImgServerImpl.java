package com.server.Impl;

import com.domain.IconImg;
import com.server.IconImgServer;
import com.tim.BaseClass.BaseClassImpl.BaseServerImpl;
import org.springframework.stereotype.Service;

/**
 * Created by timhuo on 2017/5/22.
 */
@Service("iconImgServer")
public class IconImgServerImpl extends BaseServerImpl<IconImg> implements IconImgServer {
}
