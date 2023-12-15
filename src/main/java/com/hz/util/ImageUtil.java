package com.hz.util;

import sun.misc.BASE64Decoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

/**
 * @DESC 图片工具
 * @author： Admin
 * @create： 2023/12/15 15:35
 */
public class ImageUtil {

    /**
     * 图片解码工具
     *
     * @param base64String
     */
    public static void base64StringToImage(String base64String) {
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            byte[] bytes1 = decoder.decodeBuffer(base64String);
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes1);
            BufferedImage bi1 = ImageIO.read(bais);
            File w2 = new File("C:\\Users\\Admin\\IdeaProjects\\picture_demo\\src\\main\\resources\\picture.png");// 可以是jpg,png,gif格式
            ImageIO.write(bi1, "png", w2);// 不管输出什么格式图片，此处不需改动
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
