package com.market.sweettime.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DirectoryListBean {


    /**
     * msg : success
     * status : 0
     * data : [{"Id":1,"directionName":"欢乐时光","dirFileCount":0,"createTime":1581852646,"userId":111,"IsDelete":0,"dirType":0},{"Id":2,"directionName":"啦啦啦","dirFileCount":0,"createTime":1581852698,"userId":111,"IsDelete":0,"dirType":0},{"Id":3,"directionName":"李经理付款记录的健康","dirFileCount":0,"createTime":1581853660,"userId":111,"IsDelete":0,"dirType":0}]
     */

    private String msg;
    private int status;
    private List<DataBean> data;

    public static DirectoryListBean objectFromData(String str) {

        return new Gson().fromJson(str, DirectoryListBean.class);
    }

    public static DirectoryListBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), DirectoryListBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<DirectoryListBean> arrayDirectoryListBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<DirectoryListBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<DirectoryListBean> arrayDirectoryListBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<DirectoryListBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * Id : 1
         * directionName : 欢乐时光
         * dirFileCount : 0
         * createTime : 1581852646
         * userId : 111
         * IsDelete : 0
         * dirType : 0
         */

        private int Id;
        private String directionName;
        private int dirFileCount;
        private int createTime;
        private int userId;
        private int IsDelete;
        private int dirType;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public static DataBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), DataBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<DataBean> arrayDataBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<DataBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<DataBean> arrayDataBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<DataBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public String getDirectionName() {
            return directionName;
        }

        public void setDirectionName(String directionName) {
            this.directionName = directionName;
        }

        public int getDirFileCount() {
            return dirFileCount;
        }

        public void setDirFileCount(int dirFileCount) {
            this.dirFileCount = dirFileCount;
        }

        public int getCreateTime() {
            return createTime;
        }

        public void setCreateTime(int createTime) {
            this.createTime = createTime;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getIsDelete() {
            return IsDelete;
        }

        public void setIsDelete(int IsDelete) {
            this.IsDelete = IsDelete;
        }

        public int getDirType() {
            return dirType;
        }

        public void setDirType(int dirType) {
            this.dirType = dirType;
        }
    }
}
