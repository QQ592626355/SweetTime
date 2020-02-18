package com.market.sweettime.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DeleteNewBean {


    /**
     * status : 0
     * msg : success
     * data :
     */

    private int status;
    private String msg;
    private String data;

    public static DeleteNewBean objectFromData(String str) {

        return new Gson().fromJson(str, DeleteNewBean.class);
    }

    public static DeleteNewBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), DeleteNewBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<DeleteNewBean> arrayDeleteNewBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<DeleteNewBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<DeleteNewBean> arrayDeleteNewBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<DeleteNewBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
