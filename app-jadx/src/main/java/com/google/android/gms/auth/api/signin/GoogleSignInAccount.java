package com.google.android.gms.auth.api.signin;

import R8.AbstractC2115p;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class GoogleSignInAccount extends S8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* JADX INFO: renamed from: n */
    public static final com.google.android.gms.common.util.d f38853n = com.google.android.gms.common.util.g.d();

    /* JADX INFO: renamed from: a */
    final int f38854a;

    /* JADX INFO: renamed from: b */
    private final String f38855b;

    /* JADX INFO: renamed from: c */
    private final String f38856c;

    /* JADX INFO: renamed from: d */
    private final String f38857d;

    /* JADX INFO: renamed from: e */
    private final String f38858e;

    /* JADX INFO: renamed from: f */
    private final Uri f38859f;

    /* JADX INFO: renamed from: g */
    private String f38860g;

    /* JADX INFO: renamed from: h */
    private final long f38861h;

    /* JADX INFO: renamed from: i */
    private final String f38862i;

    /* JADX INFO: renamed from: j */
    final List f38863j;

    /* JADX INFO: renamed from: k */
    private final String f38864k;

    /* JADX INFO: renamed from: l */
    private final String f38865l;

    /* JADX INFO: renamed from: m */
    private final Set f38866m = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f38854a = i10;
        this.f38855b = str;
        this.f38856c = str2;
        this.f38857d = str3;
        this.f38858e = str4;
        this.f38859f = uri;
        this.f38860g = str5;
        this.f38861h = j10;
        this.f38862i = str6;
        this.f38863j = list;
        this.f38864k = str7;
        this.f38865l = str8;
    }

    public static GoogleSignInAccount A(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount googleSignInAccountZ = z(jSONObject.optString(DiagnosticsEntry.ID_KEY), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountZ.f38860g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountZ;
    }

    public static GoogleSignInAccount z(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), AbstractC2115p.f(str7), new ArrayList((Collection) AbstractC2115p.l(set)), str5, str6);
    }

    public final String B() {
        return this.f38862i;
    }

    public final String W() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (l() != null) {
                jSONObject.put(DiagnosticsEntry.ID_KEY, l());
            }
            if (r() != null) {
                jSONObject.put("tokenId", r());
            }
            if (d() != null) {
                jSONObject.put("email", d());
            }
            if (c() != null) {
                jSONObject.put("displayName", c());
            }
            if (f() != null) {
                jSONObject.put("givenName", f());
            }
            if (e() != null) {
                jSONObject.put("familyName", e());
            }
            Uri uriS = s();
            if (uriS != null) {
                jSONObject.put("photoUrl", uriS.toString());
            }
            if (x() != null) {
                jSONObject.put("serverAuthCode", x());
            }
            jSONObject.put("expirationTime", this.f38861h);
            jSONObject.put("obfuscatedIdentifier", this.f38862i);
            JSONArray jSONArray = new JSONArray();
            List list = this.f38863j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: J8.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).c().compareTo(((Scope) obj2).c());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.c());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String c() {
        return this.f38858e;
    }

    public String d() {
        return this.f38857d;
    }

    public String e() {
        return this.f38865l;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f38862i.equals(this.f38862i) && googleSignInAccount.w().equals(w());
    }

    public String f() {
        return this.f38864k;
    }

    public int hashCode() {
        return ((this.f38862i.hashCode() + 527) * 31) + w().hashCode();
    }

    public Set i() {
        return new HashSet(this.f38863j);
    }

    public String l() {
        return this.f38855b;
    }

    public String r() {
        return this.f38856c;
    }

    public Uri s() {
        return this.f38859f;
    }

    public Set w() {
        HashSet hashSet = new HashSet(this.f38863j);
        hashSet.addAll(this.f38866m);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, this.f38854a);
        S8.c.q(parcel, 2, l(), false);
        S8.c.q(parcel, 3, r(), false);
        S8.c.q(parcel, 4, d(), false);
        S8.c.q(parcel, 5, c(), false);
        S8.c.p(parcel, 6, s(), i10, false);
        S8.c.q(parcel, 7, x(), false);
        S8.c.n(parcel, 8, this.f38861h);
        S8.c.q(parcel, 9, this.f38862i, false);
        S8.c.t(parcel, 10, this.f38863j, false);
        S8.c.q(parcel, 11, f(), false);
        S8.c.q(parcel, 12, e(), false);
        S8.c.b(parcel, iA);
    }

    public String x() {
        return this.f38860g;
    }

    public boolean y() {
        return f38853n.a() / 1000 >= this.f38861h + (-300);
    }
}
