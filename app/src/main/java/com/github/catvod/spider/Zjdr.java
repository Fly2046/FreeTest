//
// Decompiled by Jadx - 955ms
//
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Hq;
import com.github.catvod.spider.merge.JD;
import com.github.catvod.spider.merge.Vf;
import com.github.catvod.spider.merge.ex;
import com.github.catvod.spider.merge.vR;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Zjdr extends Spider {
    private JSONObject B;
    private JSONObject V;
    private Pattern sg = Pattern.compile("/Movietype/(\\d+).html");
    private Pattern v = Pattern.compile("/Moviedetail/(\\d+).html");
    private Pattern U6 = Pattern.compile("/okplay/(\\d+)-(\\d+)-(\\d+).html");
    private Pattern sj = Pattern.compile("/vodshow/id/(\\S+).html");

    protected HashMap<String, String> B(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("method", "GET");
        hashMap.put("Host", "vipmv.tv");
        hashMap.put("Upgrade-Insecure-Requests", "1");
        hashMap.put("DNT", "1");
        hashMap.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
        hashMap.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        hashMap.put("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: Exception -> 0x020a, TryCatch #0 {Exception -> 0x020a, blocks: (B:5:0x0008, B:7:0x000e, B:9:0x0014, B:11:0x0020, B:12:0x0036, B:14:0x0047, B:16:0x004d, B:17:0x0055, B:19:0x005b, B:21:0x006d, B:22:0x008a, B:25:0x00c4, B:27:0x00cd, B:29:0x00d3, B:32:0x00e2, B:34:0x00e8, B:36:0x00f0, B:38:0x0100, B:40:0x010a, B:42:0x0112, B:44:0x0122, B:45:0x012b, B:47:0x012f, B:49:0x013c, B:50:0x0158, B:52:0x015e, B:55:0x01bd, B:56:0x01dd, B:57:0x01e1, B:59:0x01f6, B:60:0x01fb, B:61:0x01fd), top: B:66:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4 A[Catch: Exception -> 0x020a, TRY_ENTER, TryCatch #0 {Exception -> 0x020a, blocks: (B:5:0x0008, B:7:0x000e, B:9:0x0014, B:11:0x0020, B:12:0x0036, B:14:0x0047, B:16:0x004d, B:17:0x0055, B:19:0x005b, B:21:0x006d, B:22:0x008a, B:25:0x00c4, B:27:0x00cd, B:29:0x00d3, B:32:0x00e2, B:34:0x00e8, B:36:0x00f0, B:38:0x0100, B:40:0x010a, B:42:0x0112, B:44:0x0122, B:45:0x012b, B:47:0x012f, B:49:0x013c, B:50:0x0158, B:52:0x015e, B:55:0x01bd, B:56:0x01dd, B:57:0x01e1, B:59:0x01f6, B:60:0x01fb, B:61:0x01fd), top: B:66:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c A[Catch: Exception -> 0x020a, TryCatch #0 {Exception -> 0x020a, blocks: (B:5:0x0008, B:7:0x000e, B:9:0x0014, B:11:0x0020, B:12:0x0036, B:14:0x0047, B:16:0x004d, B:17:0x0055, B:19:0x005b, B:21:0x006d, B:22:0x008a, B:25:0x00c4, B:27:0x00cd, B:29:0x00d3, B:32:0x00e2, B:34:0x00e8, B:36:0x00f0, B:38:0x0100, B:40:0x010a, B:42:0x0112, B:44:0x0122, B:45:0x012b, B:47:0x012f, B:49:0x013c, B:50:0x0158, B:52:0x015e, B:55:0x01bd, B:56:0x01dd, B:57:0x01e1, B:59:0x01f6, B:60:0x01fb, B:61:0x01fd), top: B:66:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f6 A[Catch: Exception -> 0x020a, TryCatch #0 {Exception -> 0x020a, blocks: (B:5:0x0008, B:7:0x000e, B:9:0x0014, B:11:0x0020, B:12:0x0036, B:14:0x0047, B:16:0x004d, B:17:0x0055, B:19:0x005b, B:21:0x006d, B:22:0x008a, B:25:0x00c4, B:27:0x00cd, B:29:0x00d3, B:32:0x00e2, B:34:0x00e8, B:36:0x00f0, B:38:0x0100, B:40:0x010a, B:42:0x0112, B:44:0x0122, B:45:0x012b, B:47:0x012f, B:49:0x013c, B:50:0x0158, B:52:0x015e, B:55:0x01bd, B:56:0x01dd, B:57:0x01e1, B:59:0x01f6, B:60:0x01fb, B:61:0x01fd), top: B:66:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fb A[Catch: Exception -> 0x020a, TryCatch #0 {Exception -> 0x020a, blocks: (B:5:0x0008, B:7:0x000e, B:9:0x0014, B:11:0x0020, B:12:0x0036, B:14:0x0047, B:16:0x004d, B:17:0x0055, B:19:0x005b, B:21:0x006d, B:22:0x008a, B:25:0x00c4, B:27:0x00cd, B:29:0x00d3, B:32:0x00e2, B:34:0x00e8, B:36:0x00f0, B:38:0x0100, B:40:0x010a, B:42:0x0112, B:44:0x0122, B:45:0x012b, B:47:0x012f, B:49:0x013c, B:50:0x0158, B:52:0x015e, B:55:0x01bd, B:56:0x01dd, B:57:0x01e1, B:59:0x01f6, B:60:0x01fb, B:61:0x01fd), top: B:66:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        String h;
        ex B1;
        int i;
        int i2;
        String str4;
        if (hashMap != null) {
            try {
                if (hashMap.size() > 0 && hashMap.containsKey("tid") && hashMap.get("tid").length() > 0) {
                    str3 = "https://vipmv.tv/vodshow/id/" + hashMap.get("tid");
                    if (hashMap != null && hashMap.size() > 0) {
                        for (String str5 : hashMap.keySet()) {
                            if (hashMap.get(str5).length() > 0) {
                                str3 = str3 + "/" + str5 + "/" + URLEncoder.encode(str4);
                            }
                        }
                    }
                    String str6 = str3 + "/page/" + str2 + ".html";
                    h = Vf.h(str6, B(str6));
                    vR ue = JD.ue(h);
                    JSONObject jSONObject = new JSONObject();
                    B1 = ue.B1("ul.page a");
                    if (B1.size() != 0) {
                        i = Integer.parseInt(str2);
                        i2 = i;
                    } else {
                        i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= B1.size()) {
                                break;
                            }
                            Hq hq = (Hq) B1.get(i3);
                            Hq O = hq.O("a");
                            if (O != null) {
                                String pE = O.pE();
                                if (i2 == -1 && hq.f("page-current")) {
                                    Matcher matcher = this.sj.matcher(O.Pd("href"));
                                    i2 = matcher.find() ? Integer.parseInt(matcher.group(1)) : 0;
                                }
                                if (pE.equals("尾页")) {
                                    Matcher matcher2 = this.sj.matcher(O.Pd("href"));
                                    if (matcher2.find()) {
                                        i = Integer.parseInt(matcher2.group(1));
                                    }
                                }
                            }
                            i3++;
                        }
                        i = 0;
                    }
                    JSONArray jSONArray = new JSONArray();
                    if (!h.contains("没有找到您想要的结果哦")) {
                        ex B12 = ue.B1("div.module > a");
                        System.out.print("list++f" + B12);
                        for (int i4 = 0; i4 < B12.size(); i4++) {
                            Hq hq2 = (Hq) B12.get(i4);
                            String Pd = hq2.Pd("title");
                            System.out.print("title++" + Pd);
                            String Pd2 = hq2.O("img.lazyload").Pd("data-original");
                            System.out.print("cover++" + Pd2);
                            String pE2 = hq2.O("div.module-item-note").pE();
                            Matcher matcher3 = this.v.matcher(hq2.Pd("href"));
                            if (matcher3.find()) {
                                String group = matcher3.group(1);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("vod_id", group);
                                jSONObject2.put("vod_name", Pd);
                                jSONObject2.put("vod_pic", Pd2);
                                jSONObject2.put("vod_remarks", pE2);
                                jSONArray.put(jSONObject2);
                            }
                        }
                    }
                    jSONObject.put("page", i2);
                    jSONObject.put("pagecount", i);
                    jSONObject.put("limit", 24);
                    jSONObject.put("total", i > 1 ? jSONArray.length() : i * 24);
                    jSONObject.put("list", jSONArray);
                    return jSONObject.toString();
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
                return "";
            }
        }
        str3 = "https://vipmv.tv/vodshow/id/" + str;
        if (hashMap != null) {
            while (r0.hasNext()) {
            }
        }
        String str62 = str3 + "/page/" + str2 + ".html";
        h = Vf.h(str62, B(str62));
        vR ue2 = JD.ue(h);
        JSONObject jSONObject3 = new JSONObject();
        B1 = ue2.B1("ul.page a");
        if (B1.size() != 0) {
        }
        JSONArray jSONArray2 = new JSONArray();
        if (!h.contains("没有找到您想要的结果哦")) {
        }
        jSONObject3.put("page", i2);
        jSONObject3.put("pagecount", i);
        jSONObject3.put("limit", 24);
        jSONObject3.put("total", i > 1 ? jSONArray2.length() : i * 24);
        jSONObject3.put("list", jSONArray2);
        return jSONObject3.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(5:60|7|8|(3:54|10|74)(2:12|(3:52|14|75)(1:73))|16)|58|5) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0216, code lost:
        r0 = e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String detailContent(List<String> list) {
        String str;
        Exception e;
        String str2 = "-";
        String str3 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("https://vipmv.tv/Moviedetail/");
            int i = 0;
            sb.append(list.get(0));
            sb.append(".html");
            String sb2 = sb.toString();
            vR ue = JD.ue(Vf.h(sb2, B(sb2)));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String Pd = ue.O("div.module-item-cover div.module-item-pic > img").Pd("data-original");
            String pE = ue.O("div.module-info-main div.module-info-heading > h1").pE();
            String trim = ue.O("div.module-info-item div.module-info-introduction-content > p").pE().trim();
            String pE2 = ((Hq) ue.B1("div.module-info-main div.module-info-heading div.module-info-tag-link").get(2)).pE();
            String pE3 = ((Hq) ue.B1("div.module-info-main div.module-info-heading div.module-info-tag-link").get(1)).pE();
            String pE4 = ((Hq) ue.B1("div.module-info-main div.module-info-heading div.module-info-tag-link").get(0)).pE();
            ArrayList B1 = ue.B1("div.module-info-content div.module-info-items div.module-info-item");
            str = str3;
            String str4 = str;
            while (i < B1.size()) {
                try {
                    Hq hq = (Hq) B1.get(i);
                    String jw = hq.B1("span").jw();
                    if (jw.contains("导演")) {
                        try {
                            str4 = hq.B1("div > a").jw();
                        } catch (Exception unused) {
                            str4 = str;
                        }
                    } else if (jw.contains("主演")) {
                        try {
                            str3 = hq.B1("div > a").jw();
                        } catch (Exception unused2) {
                            str3 = str;
                        }
                    }
                    i++;
                    B1 = B1;
                    str2 = str2;
                } catch (Exception e2) {
                    e = e2;
                    SpiderDebug.log(e);
                    return str;
                }
            }
            String str5 = str2;
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", pE);
            jSONObject2.put("vod_pic", Pd);
            jSONObject2.put("type_name", pE2);
            jSONObject2.put("vod_year", pE4);
            jSONObject2.put("vod_area", pE3);
            jSONObject2.put("vod_actor", str3);
            jSONObject2.put("vod_director", str4);
            jSONObject2.put("vod_content", trim);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ex B12 = ue.B1("div.module-tab-items-box>div>span");
            ex B13 = ue.B1("div.module-list>div.module-play-list");
            int i2 = 0;
            while (i2 < B12.size()) {
                String pE5 = ((Hq) B12.get(i2)).pE();
                ex B14 = ((Hq) B13.get(i2)).B1("div.module-play-list-content>a");
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < B14.size(); i3++) {
                    Hq hq2 = (Hq) B14.get(i3);
                    try {
                        Matcher matcher = this.U6.matcher(hq2.Pd("href"));
                        if (!matcher.find()) {
                            str5 = str5;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(matcher.group(1));
                            str5 = str5;
                            sb3.append(str5);
                            sb3.append(matcher.group(2));
                            sb3.append(str5);
                            sb3.append(matcher.group(3));
                            String sb4 = sb3.toString();
                            arrayList.add(hq2.pE() + "$" + sb4);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        SpiderDebug.log(e);
                        return str;
                    }
                }
                String join = arrayList.size() > 0 ? TextUtils.join("#", arrayList) : str;
                if (join.length() != 0) {
                    linkedHashMap.put(pE5, join);
                }
                i2++;
                str5 = str5;
            }
            if (linkedHashMap.size() > 0) {
                String join2 = TextUtils.join("$$$", linkedHashMap.keySet());
                String join3 = TextUtils.join("$$$", linkedHashMap.values());
                jSONObject2.put("vod_play_from", join2);
                jSONObject2.put("vod_play_url", join3);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e4) {
            e = e4;
            str = str3;
        }
    }

    public String homeContent(boolean z) {
        int i;
        try {
            vR ue = JD.ue(Vf.h("https://vipmv.tv", B("https://vipmv.tv")));
            ex B1 = ue.B1("ul.navbar-items>li.navbar-item>a");
            JSONArray jSONArray = new JSONArray();
            Iterator it = B1.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Hq hq = (Hq) it.next();
                String pE = hq.pE();
                if (pE.equals("电影") || pE.equals("连续剧") || pE.equals("综艺") || pE.equals("动漫")) {
                    i = 1;
                }
                if (i != 0) {
                    Matcher matcher = this.sg.matcher(hq.Pd("href"));
                    if (matcher.find()) {
                        String trim = matcher.group(1).trim();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type_id", trim);
                        jSONObject.put("type_name", pE);
                        jSONArray.put(jSONObject);
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            if (z) {
                jSONObject2.put("filters", this.V);
            }
            jSONObject2.put("class", jSONArray);
            try {
                ex B12 = ((Hq) ue.B1("div.module-main").get(0)).B1("div.module-items>a");
                JSONArray jSONArray2 = new JSONArray();
                while (i < B12.size()) {
                    Hq hq2 = (Hq) B12.get(i);
                    String Pd = hq2.Pd("title");
                    String Pd2 = hq2.O("img.lazyload").Pd("data-original");
                    String pE2 = hq2.O("div.module-item-note").pE();
                    Matcher matcher2 = this.v.matcher(hq2.Pd("href"));
                    if (matcher2.find()) {
                        String group = matcher2.group(1);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("vod_id", group);
                        jSONObject3.put("vod_name", Pd);
                        jSONObject3.put("vod_pic", Pd2);
                        jSONObject3.put("vod_remarks", pE2);
                        jSONArray2.put(jSONObject3);
                    }
                    i++;
                }
                jSONObject2.put("list", jSONArray2);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            return jSONObject2.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public void init(Context context) {
        Zjdr.super.init(context);
        try {
            this.B = new JSONObject("{\"XRJX\":{\"show\":\"追剧专享\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"xinluan\":{\"show\":\"备用专享\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/xl.playmv.vip%/?url=\"},\"XRLG\":{\"show\":\"备用蓝光\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"rx\":{\"show\":\"App专享\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"ftqp4\":{\"show\":\"蓝光极速\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"xkys\":{\"show\":\"超音速追剧\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"vip\":{\"show\":\"VIP专享线路\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"xg_app_player\":{\"show\":\"app全局播放器\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"xg_tv_player\":{\"show\":\"tv全局播放器\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"\"},\"qq\":{\"show\":\"腾讯\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"mgtv\":{\"show\":\"芒果\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"youku\":{\"show\":\"优酷\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"qiyi\":{\"show\":\"爱奇艺\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"sohu\":{\"show\":\"搜狐\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"tpm3u8\":{\"show\":\"卡就换源\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"bilibili\":{\"show\":\"哔哩哔哩\",\"des\":\"追剧推荐\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"fsm3u8\":{\"show\":\"备用线路二\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"hnm3u8\":{\"show\":\"备用线路一\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"tkm3u8\":{\"show\":\"备用线路四\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"ukm3u8\":{\"show\":\"备用线路三\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"kbm3u8\":{\"show\":\"备用线路（可换源）\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"dm\":{\"show\":\"动漫专线\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"if101\":{\"show\":\"海外华人专用（国内翻墙）\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"},\"haiwaikan\":{\"show\":\"海外华人专用（国内翻墙）\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:%/%/playmv.vip%/?url=\"}}");
            this.V = new JSONObject("{\"5\":[{\"key\":3,\"name\":\"剧情\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜劇\"},{\"n\":\"爱情\",\"v\":\"愛情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"動作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"劇情\"},{\"n\":\"战争\",\"v\":\"戰爭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"動畫\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"悬疑\",\"v\":\"懸疑\"},{\"n\":\"微电影\",\"v\":\"微電影\"}]},{\"key\":11,\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":4,\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"國語\"},{\"n\":\"英语\",\"v\":\"英語\"},{\"n\":\"粤语\",\"v\":\"粵語\"},{\"n\":\"闽南语\",\"v\":\"閩南語\"},{\"n\":\"韩语\",\"v\":\"韓語\"},{\"n\":\"日语\",\"v\":\"日語\"},{\"n\":\"法语\",\"v\":\"法語\"},{\"n\":\"德语\",\"v\":\"德語\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":5,\"name\":\"字母\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0-9\",\"v\":\"0-9\"}]},{\"key\":2,\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"2\":[{\"key\":0,\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"2\"},{\"n\":\"大陆剧\",\"v\":\"13\"},{\"n\":\"香港剧\",\"v\":\"14\"},{\"n\":\"韩国剧\",\"v\":\"15\"},{\"n\":\"欧美剧\",\"v\":\"16\"},{\"n\":\"日本剧\",\"v\":\"20\"},{\"n\":\"台湾剧\",\"v\":\"21\"},{\"n\":\"泰国剧\",\"v\":\"22\"}]},{\"key\":1,\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":11,\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"}]},{\"key\":4,\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":5,\"name\":\"字母\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0-9\",\"v\":\"0-9\"}]},{\"key\":2,\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"1\":[{\"key\":0,\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"1\"},{\"n\":\"动作片\",\"v\":\"6\"},{\"n\":\"喜剧片\",\"v\":\"7\"},{\"n\":\"爱情片\",\"v\":\"8\"},{\"n\":\"科幻片\",\"v\":\"9\"},{\"n\":\"恐怖片\",\"v\":\"10\"},{\"n\":\"剧情片\",\"v\":\"11\"},{\"n\":\"战争片\",\"v\":\"12\"},{\"n\":\"犯罪片\",\"v\":\"23\"},{\"n\":\"奇幻片\",\"v\":\"24\"},{\"n\":\"悬疑片\",\"v\":\"25\"},{\"n\":\"记录片\",\"v\":\"27\"}]},{\"key\":1,\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":11,\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":4,\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"法语\",\"v\":\"法语\"},{\"n\":\"德语\",\"v\":\"德语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":5,\"name\":\"字母\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0-9\",\"v\":\"0-9\"}]},{\"key\":2,\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"4\":[{\"key\":0,\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"4\"},{\"n\":\"动画电影\",\"v\":\"41\"}]},{\"key\":3,\"name\":\"剧情\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":1,\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":11,\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":4,\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":5,\"name\":\"字母\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0-9\",\"v\":\"0-9\"}]},{\"key\":2,\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"3\":[{\"key\":1,\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"韩国\",\"v\":\"韩国\"}]},{\"key\":11,\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"}]},{\"key\":4,\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":5,\"name\":\"字母\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0-9\",\"v\":\"0-9\"}]},{\"key\":2,\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}]}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("origin", " https://vipmv.tv");
            jSONObject.put("User-Agent", " Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
            jSONObject.put("Accept", " */*");
            jSONObject.put("Accept-Language", " zh-CN,zh;q=0.9,en-US;q=0.3,en;q=0.7");
            jSONObject.put("Accept-Encoding", " gzip, deflate");
            String str3 = "https://vipmv.tv/okplay/" + str2 + ".html";
            ex B1 = JD.ue(Vf.h(str3, B(str3))).B1("script");
            JSONObject jSONObject2 = new JSONObject();
            int i = 0;
            while (true) {
                if (i >= B1.size()) {
                    break;
                }
                String trim = ((Hq) B1.get(i)).Wt().trim();
                if (trim.startsWith("var player_")) {
                    JSONObject jSONObject3 = new JSONObject(trim.substring(trim.indexOf(123), trim.lastIndexOf(125) + 1));
                    if (this.B.has(jSONObject3.getString("from"))) {
                        JSONObject jSONObject4 = this.B.getJSONObject(jSONObject3.getString("from"));
                        String string = jSONObject3.getString("url");
                        jSONObject4.getString("parse");
                        if (string.contains(".m3u8")) {
                            jSONObject2.put("parse", 0);
                            jSONObject2.put("playUrl", "");
                            jSONObject2.put("url", string);
                            jSONObject2.put("header", jSONObject.toString());
                        } else {
                            if (!string.contains("mgtv") && !string.contains("qq") && !string.contains("youku") && !string.contains("qiyi")) {
                                jSONObject2.put("parse", 1);
                                jSONObject2.put("playUrl", "");
                                jSONObject2.put("url", str3);
                                jSONObject2.put("ua", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.62 Safari/537.36");
                            }
                            jSONObject2.put("parse", 1);
                            jSONObject2.put("jx", "1");
                            jSONObject2.put("url", string);
                        }
                    }
                } else {
                    i++;
                }
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            String str2 = "https://vipmv.tv/index.php/ajax/suggest?mid=1&wd=" + URLEncoder.encode(str) + "&limit=10&timestamp=" + System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject(Vf.h(str2, B(str2)));
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (jSONObject.getInt("total") > 0) {
                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("list"));
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                    String string = jSONObject3.getString("id");
                    String string2 = jSONObject3.getString("name");
                    String string3 = jSONObject3.getString("pic");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("vod_id", string);
                    jSONObject4.put("vod_name", string2);
                    jSONObject4.put("vod_pic", string3);
                    jSONObject4.put("vod_remarks", "");
                    jSONArray.put(jSONObject4);
                }
            }
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
