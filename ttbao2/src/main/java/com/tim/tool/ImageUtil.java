package com.tim.tool;

import com.domain.IconImg;
import com.tim.BaseClass.BaseServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by timhuo on 2017/5/23.
 */
@Component
public class ImageUtil {

    @Autowired
    private BaseServer<IconImg> iconImgBaseServer;

    public IconImg saveIcon(MultipartFile iconimg, int iconid, HttpServletRequest request) throws IOException {

        String iconFileName = UID.getUUID();
        String filePath = "";
        String saveFilePath = "";

        Boolean result = false;

        IconImg imageIcon = new IconImg();

        iconFileName += "." + MFileNameUtil.getExtensionName(iconimg.getOriginalFilename());
        saveFilePath = "upload/images/" + iconFileName;
        filePath = request.getSession().getServletContext().getRealPath("/") + "upload/images/" + iconFileName;
        // 转存文件
        iconimg.transferTo(new File(filePath));
        // 保存到数据库
        imageIcon.setUrl(saveFilePath);

        if (iconid==0){
            result = iconImgBaseServer.save(imageIcon);
        }else {
            imageIcon.setIconid(iconid);
            result = iconImgBaseServer.upd(imageIcon);
        }

        if (result==true){
            return imageIcon;
        }else {
            return null;
        }


    }
}
