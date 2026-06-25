package com.amazon.device.simplesignin.a.d;

import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.Token;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f35256a = "b";

    private b() {
    }

    public static List<Link> a(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() == 0) {
                a.a(f35256a, "No links available, links object received is empty.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
                    Link link = new Link();
                    link.setAmazonUserId(str);
                    link.setIdentityProviderName(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f35192z));
                    link.setLinkId(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f35191y));
                    link.setPartnerUserId(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f35155A));
                    link.setLinkedTimestamp(jSONObject.getLong(com.amazon.device.simplesignin.a.a.a.f35156B));
                    Token token = new Token();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f35157C));
                    token.setToken(jSONObject2.getString("token"));
                    token.setSchema(jSONObject2.getString(com.amazon.device.simplesignin.a.a.a.f35159E));
                    link.setSsiToken(token);
                    arrayList.add(link);
                } catch (JSONException e10) {
                    a.b(f35256a, "Failure generating Link object from response." + e10);
                    return null;
                }
            }
            return arrayList;
        } catch (JSONException e11) {
            a.b(f35256a, "Failure generating Link object from Kiwi response." + e11);
            return null;
        }
    }

    public static String a(String str) {
        try {
            return new JSONObject(str).getString(com.amazon.device.simplesignin.a.a.a.f35191y);
        } catch (JSONException e10) {
            a.b(f35256a, "Failure extracting Link ID object from response." + e10);
            return null;
        }
    }
}
