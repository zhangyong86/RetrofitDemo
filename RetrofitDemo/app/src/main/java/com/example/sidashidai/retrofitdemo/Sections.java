package com.example.sidashidai.retrofitdemo;

import java.util.List;

/**
 * Created by User on 2017/11/13.
 */

public class Sections {


    /**
     * id : 28
     * name : Feature Section-专题页
     * contentType : 4
     * targetType : Channel
     * target : com.star.mobile.video.activity.BrowserActivity?loadUrl=https://qa.upms.startimestv.com/wap/LiveChannel.php&isShare=4&temp={online}

     * layoutType : 0
     * areaIds : 2,3,15
     * titleColor : video_section_title_christmas
     * dataJson : []
     */

    private int id;
    private String name;
    private int contentType;
    private String targetType;
    private String target;
    private int layoutType;
    private String areaIds;
    private String titleColor;
    private String dataJson;
    private List<ChildsBean> childs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContentType() {
        return contentType;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getLayoutType() {
        return layoutType;
    }

    public void setLayoutType(int layoutType) {
        this.layoutType = layoutType;
    }

    public String getAreaIds() {
        return areaIds;
    }

    public void setAreaIds(String areaIds) {
        this.areaIds = areaIds;
    }

    public String getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(String titleColor) {
        this.titleColor = titleColor;
    }

    public String getDataJson() {
        return dataJson;
    }

    public void setDataJson(String dataJson) {
        this.dataJson = dataJson;
    }

    public List<ChildsBean> getChilds() {
        return childs;
    }

    public void setChilds(List<ChildsBean> childs) {
        this.childs = childs;
    }

    public static class ChildsBean {
        /**
         * id : 9
         * name : Chat Room
         * contentType : 1
         * targetType : Page
         * target : com.star.mobile.video.activity.ChatActivity?channelId=122
         * layoutType : 0
         * areaIds : 2,3
         * dataJson : []
         * poster : http://10.0.63.242:8281/portal/img/recommend/r_-2071619915.png
         */

        private int id;
        private String name;
        private int contentType;
        private String targetType;
        private String target;
        private int layoutType;
        private String areaIds;
        private String dataJson;
        private String poster;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getContentType() {
            return contentType;
        }

        public void setContentType(int contentType) {
            this.contentType = contentType;
        }

        public String getTargetType() {
            return targetType;
        }

        public void setTargetType(String targetType) {
            this.targetType = targetType;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public int getLayoutType() {
            return layoutType;
        }

        public void setLayoutType(int layoutType) {
            this.layoutType = layoutType;
        }

        public String getAreaIds() {
            return areaIds;
        }

        public void setAreaIds(String areaIds) {
            this.areaIds = areaIds;
        }

        public String getDataJson() {
            return dataJson;
        }

        public void setDataJson(String dataJson) {
            this.dataJson = dataJson;
        }

        public String getPoster() {
            return poster;
        }

        public void setPoster(String poster) {
            this.poster = poster;
        }
    }
}
