import cn.hutool.core.util.ArrayUtil;
import constant.Constant;
import entity.PlatformCategoryDO;
import org.junit.Test;
import org.junit.platform.commons.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package PACKAGE_NAME
 * @date 2022/1/8
 */
public class SplitTest {

    @Test
    public void test(){
        List<PlatformCategoryDO> list = new ArrayList<>();
        list.add(PlatformCategoryDO.builder().fullName("aaa").name("aaa").level(1).build());
        list.add(PlatformCategoryDO.builder().fullName("/").name("/").level(1).build());
        list.add(PlatformCategoryDO.builder().fullName("").name("").level(1).build());
        list.add(PlatformCategoryDO.builder().fullName("//").name("//").level(1).build());
        list.add(PlatformCategoryDO.builder().fullName("aaa/bbb").name("bbb").level(2).build());
        list.add(PlatformCategoryDO.builder().fullName("aaa/bb//b").name("bb//b").level(2).build());
        list.add(PlatformCategoryDO.builder().fullName("aaa/bbb/ccc").name("ccc").level(3).build());
        list.add(PlatformCategoryDO.builder().fullName("aaa/bbb/cc//c").name("cc//c").level(3).build());

        list.forEach(a -> System.out.println("旧全路径：" + a.getFullName() + "，新全路径：" + replace(a,"new Name")));

        System.out.println(Arrays.toString("".split(",")));
    }

    private String replace(PlatformCategoryDO categoryDO, String newName){
        // 如果是一级，直接返回
        if (categoryDO.getLevel() == Constant.ONE) {
            return newName;
        }
        // 二级/三级，在字符中截取去掉旧名称的长度
        return categoryDO.getFullName().substring(0, categoryDO.getFullName().length() - categoryDO.getName().length()) + newName;
    }

    @Test
    public void findPicture() {
        List<String> list = new ArrayList<>();
        list.add("<img src=\"/album/2020/4/17/edb4ff82-2fd7-4b0e-9666-c196e2a3b77a.jpg\" alt=\"\" /><img src=\"/album/2020/4/17/ad7d948a-cc3d-431d-9def-06e1e6557b30.jpg\" alt=\"\" /><img src=\"/album/2020/4/17/1fe2c132-7f84-4da2-91a7-c12687496f01.jpg\" alt=\"\" /><img src=\"/album/2020/4/17/73e213bd-7a65-4822-a0c3-601a669996d9.jpg\" alt=\"\" /><img src=\"/album/2020/4/17/70bb8889-04d5-45ea-bcff-589504af1a44.jpg\" alt=\"\" /><img src=\"/album/2020/4/17/d854591c-5bca-4e3a-b054-df18b801553e.jpg\" alt=\"\" /><img src=\"/album/2020/4/17/c60d2bd3-f2c2-42f4-9525-2b47e9347b58.jpg\" alt=\"\" /><img src=\"/album/2020/4/17/426c3c53-b946-4ba8-a330-1197c97530b8.jpg\" alt=\"\" /><img src=\"/album/2020/4/17/3f0646ec-b772-4acb-b1ca-eeddabf611ab.jpg\" alt=\"\" /><img src=\"/album/2020/4/17/d79ae2bb-4186-4c9e-9f7e-7bf1341e89ba.jpg\" alt=\"\" />");
        list.add("\\<img src = \"/album/2020/1/19/40abdfc6-ab5b-4a12-ab06-0ceced91a470.jpg\" alt=\"\" /><img src=\"/album/2020/1/19/d7b04eb4-2f20-4c97-bfc5-55b1a75d56c6.jpg\" alt=\"\" /><img src=\"/album/2020/1/19/610c5fdb-03e7-4058-a2e7-103227d76b18.jpg\" alt=\"\" /><img src=\"/album/2020/1/19/e1b2a803-3be4-4da0-a0cb-04352b091cc7.jpg\" alt=\"\" /><img src=\"/album/2020/1/19/9001e8e2-c069-4ccb-89d8-92a146ca35f0.jpg\" alt=\"\" /><img src=\"/album/2020/1/19/4054a457-64d8-475f-95bb-dba1e1a88f2d.jpg\" alt=\"\" /><img src=\"/album/2020/1/19/1a0cbdb5-0d3e-45a8-95f9-97017897c48f.jpg\" alt=\"\" /><img src=\"/album/2020/1/19/44b061fe-888c-4c45-ad5d-1042cf914116.jpg\" alt=\"\" /><img src=\"/album/2020/1/19/675498c6-be4b-4537-bbca-f5317f8e92c5.jpg\" alt=\"\" /><img src=\"/album/2020/1/19/0d245182-f8b5-4956-8b84-608662ca82d3.jpg\" alt=\"\" /><img src=\"/album/2020/1/19/64e07848-7599-45ea-a820-3d83c0ce68e0.jpg\" alt=\"\" />");
        list.add("<img src= \"/album/2019/4/2/6b4c332b-2227-4a56-8894-c35d384811aa.jpg\" alt=\"\" /><img src=\"/album/2019/4/2/c2ee1378-837e-423c-bcf2-1631270b137b.jpg\" alt=\"\" /><img src=\"/album/2019/4/2/9f657812-ebda-45d1-a844-0d7790d2fa4f.jpg\" alt=\"\" /><img src=\"/album/2019/4/2/da71fd88-341d-4fb9-ba39-4261defdf7ce.jpg\" alt=\"\" /><img src=\"/album/2019/4/2/5891dc26-9b97-4ce5-98fd-dc123fdfb535.jpg\" alt=\"\" /><img src=\"/album/2019/4/2/7bf5dd3e-277e-4128-bd69-4785aa5f0f60.jpg\" alt=\"\" /><img src=\"/album/2019/4/2/72c5bea7-cfe3-42c6-950c-ad86cc8ffc90.jpg\" alt=\"\" /><img src=\"/album/2019/4/2/4de86f8f-a033-4d28-8c53-6fcea6eefa5e.jpg\" alt=\"\" /><img src=\"/album/2019/4/2/19681dcf-1613-4ca7-a81e-42cb18839f7c.jpg\" alt=\"\" />");

        for (String s : list) {
            System.out.println(ArrayUtil.toString(getPictureUrl(s)));
        }
    }

    private List<String> getPictureUrl(String str) {
        List<String> list = new ArrayList<>();
        String[] imgs = str.split("img");
        for (String img : imgs) {
            int startIndex = img.indexOf("\"");
            int endIndex = img.indexOf("\"", startIndex + 1);
            if (startIndex > -1 && endIndex > -1) {
                list.add(img.substring(startIndex + 1, endIndex));
            }
        }
        return list;
    }



}
