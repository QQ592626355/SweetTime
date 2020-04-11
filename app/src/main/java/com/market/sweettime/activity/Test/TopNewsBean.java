//package com.market.sweettime.activity.Test;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TopNewsBean {
//
//
//    /**
//     * reason : 成功的返回
//     * result : {"stat":"1","data":[{"uniquekey":"6db0ec6dff2990dbe5c7a202e2f3335f","title":"广交会第二期在广州琶洲会展中心开幕","date":"2018-10-24 09:12","category":"头条","author_name":"南方网","url":"http://mini.eastday.com/mobile/181024091211566.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181024/20181024091211_2a0753f869b236df1c40fe7b9f137ae9_1_mwpm_03200403.jpg"},{"uniquekey":"515bacc3fd69c67749cb29110d5993dc","title":"火箭军某旅新兵营开展\u201c新老兵结对共成长\u201d活动","date":"2018-10-24 09:10","category":"头条","author_name":"中国军网","url":"http://mini.eastday.com/mobile/181024091051786.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181024/20181024091051_3534d8968e2f5bd39d3ab9a6c94993b0_1_mwpm_03200403.jpg"}]}
//     * error_code : 0
//     */
//
//    private String reason;
//    private ResultBean result;
//    private int error_code;
//
//    public static TopNewsBean objectFromData(String str) {
//
//        return new Gson().fromJson(str, TopNewsBean.class);
//    }
//
//    public static TopNewsBean objectFromData(String str, String key) {
//
//        try {
//            JSONObject jsonObject = new JSONObject(str);
//
//            return new Gson().fromJson(jsonObject.getString(str), TopNewsBean.class);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    public static List<TopNewsBean> arrayTopNewsBeanFromData(String str) {
//
//        Type listType = new TypeToken<ArrayList<TopNewsBean>>() {
//        }.getType();
//
//        return new Gson().fromJson(str, listType);
//    }
//
//    public static List<TopNewsBean> arrayTopNewsBeanFromData(String str, String key) {
//
//        try {
//            JSONObject jsonObject = new JSONObject(str);
//            Type listType = new TypeToken<ArrayList<TopNewsBean>>() {
//            }.getType();
//
//            return new Gson().fromJson(jsonObject.getString(str), listType);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        return new ArrayList();
//
//
//    }
//
//    public String getReason() {
//        return reason;
//    }
//
//    public void setReason(String reason) {
//        this.reason = reason;
//    }
//
//    public ResultBean getResult() {
//        return result;
//    }
//
//    public void setResult(ResultBean result) {
//        this.result = result;
//    }
//
//    public int getError_code() {
//        return error_code;
//    }
//
//    public void setError_code(int error_code) {
//        this.error_code = error_code;
//    }
//
//    public static class ResultBean {
//        /**
//         * stat : 1
//         * data : [{"uniquekey":"6db0ec6dff2990dbe5c7a202e2f3335f","title":"广交会第二期在广州琶洲会展中心开幕","date":"2018-10-24 09:12","category":"头条","author_name":"南方网","url":"http://mini.eastday.com/mobile/181024091211566.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181024/20181024091211_2a0753f869b236df1c40fe7b9f137ae9_1_mwpm_03200403.jpg"},{"uniquekey":"515bacc3fd69c67749cb29110d5993dc","title":"火箭军某旅新兵营开展\u201c新老兵结对共成长\u201d活动","date":"2018-10-24 09:10","category":"头条","author_name":"中国军网","url":"http://mini.eastday.com/mobile/181024091051786.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181024/20181024091051_3534d8968e2f5bd39d3ab9a6c94993b0_1_mwpm_03200403.jpg"}]
//         */
//
//        private String stat;
//        private List<DataBean> data;
//
//        public static ResultBean objectFromData(String str) {
//
//            return new Gson().fromJson(str, ResultBean.class);
//        }
//
//        public static ResultBean objectFromData(String str, String key) {
//
//            try {
//                JSONObject jsonObject = new JSONObject(str);
//
//                return new Gson().fromJson(jsonObject.getString(str), ResultBean.class);
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//
//            return null;
//        }
//
//        public static List<ResultBean> arrayResultBeanFromData(String str) {
//
//            Type listType = new TypeToken<ArrayList<ResultBean>>() {
//            }.getType();
//
//            return new Gson().fromJson(str, listType);
//        }
//
//        public static List<ResultBean> arrayResultBeanFromData(String str, String key) {
//
//            try {
//                JSONObject jsonObject = new JSONObject(str);
//                Type listType = new TypeToken<ArrayList<ResultBean>>() {
//                }.getType();
//
//                return new Gson().fromJson(jsonObject.getString(str), listType);
//
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//
//            return new ArrayList();
//
//
//        }
//
//        public String getStat() {
//            return stat;
//        }
//
//        public void setStat(String stat) {
//            this.stat = stat;
//        }
//
//        public List<DataBean> getData() {
//            return data;
//        }
//
//        public void setData(List<DataBean> data) {
//            this.data = data;
//        }
//
//        public static class DataBean {
//            /**
//             * uniquekey : 6db0ec6dff2990dbe5c7a202e2f3335f
//             * title : 广交会第二期在广州琶洲会展中心开幕
//             * date : 2018-10-24 09:12
//             * category : 头条
//             * author_name : 南方网
//             * url : http://mini.eastday.com/mobile/181024091211566.html
//             * thumbnail_pic_s : http://02imgmini.eastday.com/mobile/20181024/20181024091211_2a0753f869b236df1c40fe7b9f137ae9_1_mwpm_03200403.jpg
//             */
//
//            private String uniquekey;
//            private String title;
//            private String date;
//            private String category;
//            private String author_name;
//            private String url;
//            private String thumbnail_pic_s;
//
//            public static DataBean objectFromData(String str) {
//
//                return new Gson().fromJson(str, DataBean.class);
//            }
//
//            public static DataBean objectFromData(String str, String key) {
//
//                try {
//                    JSONObject jsonObject = new JSONObject(str);
//
//                    return new Gson().fromJson(jsonObject.getString(str), DataBean.class);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//
//                return null;
//            }
//
//            public static List<DataBean> arrayDataBeanFromData(String str) {
//
//                Type listType = new TypeToken<ArrayList<DataBean>>() {
//                }.getType();
//
//                return new Gson().fromJson(str, listType);
//            }
//
//            public static List<DataBean> arrayDataBeanFromData(String str, String key) {
//
//                try {
//                    JSONObject jsonObject = new JSONObject(str);
//                    Type listType = new TypeToken<ArrayList<DataBean>>() {
//                    }.getType();
//
//                    return new Gson().fromJson(jsonObject.getString(str), listType);
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//
//                return new ArrayList();
//
//
//            }
//
//            public String getUniquekey() {
//                return uniquekey;
//            }
//
//            public void setUniquekey(String uniquekey) {
//                this.uniquekey = uniquekey;
//            }
//
//            public String getTitle() {
//                return title;
//            }
//
//            public void setTitle(String title) {
//                this.title = title;
//            }
//
//            public String getDate() {
//                return date;
//            }
//
//            public void setDate(String date) {
//                this.date = date;
//            }
//
//            public String getCategory() {
//                return category;
//            }
//
//            public void setCategory(String category) {
//                this.category = category;
//            }
//
//            public String getAuthor_name() {
//                return author_name;
//            }
//
//            public void setAuthor_name(String author_name) {
//                this.author_name = author_name;
//            }
//
//            public String getUrl() {
//                return url;
//            }
//
//            public void setUrl(String url) {
//                this.url = url;
//            }
//
//            public String getThumbnail_pic_s() {
//                return thumbnail_pic_s;
//            }
//
//            public void setThumbnail_pic_s(String thumbnail_pic_s) {
//                this.thumbnail_pic_s = thumbnail_pic_s;
//            }
//        }
//    }
//}
