package com.market.sweettime.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class NewsBean {


    /**
     * status : 0
     * msg : success
     * data : {"list":[{"fileList":[{"fileId":1001,"fileName":"啦啦","path":"/file/fjldkjfkdjkfjkdjfk","uploadTime":121212121,"view_count":122}],"new":{"newId":111,"content":"今天是个好日子","createTime":151515151,"address":"湖北省随州市"}}]}
     */

    private int status;
    private String msg;
    private DataBean data;

    public static NewsBean objectFromData(String str) {

        return new Gson().fromJson(str, NewsBean.class);
    }

    public static NewsBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), NewsBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<NewsBean> arrayNewsBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<NewsBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<NewsBean> arrayNewsBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<NewsBean>>() {
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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<ListBean> list;

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

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * fileList : [{"fileId":1001,"fileName":"啦啦","path":"/file/fjldkjfkdjkfjkdjfk","uploadTime":121212121,"view_count":122}]
             * new : {"newId":111,"content":"今天是个好日子","createTime":151515151,"address":"湖北省随州市"}
             */

            @SerializedName("new")
            private NewBean newX;
            private List<FileListBean> fileList;

            public static ListBean objectFromData(String str) {

                return new Gson().fromJson(str, ListBean.class);
            }

            public static ListBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ListBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ListBean> arrayListBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ListBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ListBean> arrayListBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ListBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public NewBean getNewX() {
                return newX;
            }

            public void setNewX(NewBean newX) {
                this.newX = newX;
            }

            public List<FileListBean> getFileList() {
                return fileList;
            }

            public void setFileList(List<FileListBean> fileList) {
                this.fileList = fileList;
            }

            public static class NewBean {
                /**
                 * newId : 111
                 * content : 今天是个好日子
                 * createTime : 151515151
                 * address : 湖北省随州市
                 */

                private int newId;
                private String content;
                private int createTime;
                private String address;

                public static NewBean objectFromData(String str) {

                    return new Gson().fromJson(str, NewBean.class);
                }

                public static NewBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), NewBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<NewBean> arrayNewBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<NewBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<NewBean> arrayNewBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<NewBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getNewId() {
                    return newId;
                }

                public void setNewId(int newId) {
                    this.newId = newId;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public int getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(int createTime) {
                    this.createTime = createTime;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }
            }

            public static class FileListBean {
                /**
                 * fileId : 1001
                 * fileName : 啦啦
                 * path : /file/fjldkjfkdjkfjkdjfk
                 * uploadTime : 121212121
                 * view_count : 122
                 */

                private int fileId;
                private String fileName;
                private String path;
                private int uploadTime;
                private int view_count;

                public static FileListBean objectFromData(String str) {

                    return new Gson().fromJson(str, FileListBean.class);
                }

                public static FileListBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), FileListBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<FileListBean> arrayFileListBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<FileListBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<FileListBean> arrayFileListBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<FileListBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getFileId() {
                    return fileId;
                }

                public void setFileId(int fileId) {
                    this.fileId = fileId;
                }

                public String getFileName() {
                    return fileName;
                }

                public void setFileName(String fileName) {
                    this.fileName = fileName;
                }

                public String getPath() {
                    return path;
                }

                public void setPath(String path) {
                    this.path = path;
                }

                public int getUploadTime() {
                    return uploadTime;
                }

                public void setUploadTime(int uploadTime) {
                    this.uploadTime = uploadTime;
                }

                public int getView_count() {
                    return view_count;
                }

                public void setView_count(int view_count) {
                    this.view_count = view_count;
                }
            }
        }
    }
}
