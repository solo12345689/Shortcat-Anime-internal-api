package com.google.android.gms.auth.api.signin;

import P8.a;
import R8.AbstractC2115p;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class GoogleSignInOptions extends S8.a implements a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: l */
    public static final GoogleSignInOptions f38867l;

    /* JADX INFO: renamed from: m */
    public static final GoogleSignInOptions f38868m;

    /* JADX INFO: renamed from: n */
    public static final Scope f38869n = new Scope("profile");

    /* JADX INFO: renamed from: o */
    public static final Scope f38870o = new Scope("email");

    /* JADX INFO: renamed from: p */
    public static final Scope f38871p = new Scope("openid");

    /* JADX INFO: renamed from: q */
    public static final Scope f38872q;

    /* JADX INFO: renamed from: r */
    public static final Scope f38873r;

    /* JADX INFO: renamed from: s */
    private static final Comparator f38874s;

    /* JADX INFO: renamed from: a */
    final int f38875a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f38876b;

    /* JADX INFO: renamed from: c */
    private Account f38877c;

    /* JADX INFO: renamed from: d */
    private boolean f38878d;

    /* JADX INFO: renamed from: e */
    private final boolean f38879e;

    /* JADX INFO: renamed from: f */
    private final boolean f38880f;

    /* JADX INFO: renamed from: g */
    private String f38881g;

    /* JADX INFO: renamed from: h */
    private String f38882h;

    /* JADX INFO: renamed from: i */
    private ArrayList f38883i;

    /* JADX INFO: renamed from: j */
    private String f38884j;

    /* JADX INFO: renamed from: k */
    private Map f38885k;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f38872q = scope;
        f38873r = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.d();
        f38867l = aVar.a();
        a aVar2 = new a();
        aVar2.e(scope, new Scope[0]);
        f38868m = aVar2.a();
        CREATOR = new e();
        f38874s = new d();
    }

    /* synthetic */ GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3, J8.e eVar) {
        this(3, arrayList, account, z10, z11, z12, str, str2, map, str3);
    }

    public static Map d0(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                K8.a aVar = (K8.a) it.next();
                map.put(Integer.valueOf(aVar.c()), aVar);
            }
        }
        return map;
    }

    public static GoogleSignInOptions x(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    public final String B() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f38876b, f38874s);
            Iterator it = this.f38876b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).c());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f38877c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f38878d);
            jSONObject.put("forceCodeForRefreshToken", this.f38880f);
            jSONObject.put("serverAuthRequested", this.f38879e);
            if (!TextUtils.isEmpty(this.f38881g)) {
                jSONObject.put("serverClientId", this.f38881g);
            }
            if (!TextUtils.isEmpty(this.f38882h)) {
                jSONObject.put("hostedDomain", this.f38882h);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Account c() {
        return this.f38877c;
    }

    public ArrayList d() {
        return this.f38883i;
    }

    public String e() {
        return this.f38884j;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:49:0x0004, B:51:0x000e, B:54:0x0018, B:56:0x0028, B:59:0x0035, B:61:0x0039, B:66:0x004a, B:68:0x0052, B:74:0x006a, B:76:0x0072, B:78:0x007a, B:80:0x0082, B:71:0x005d, B:64:0x0040), top: B:86:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:49:0x0004, B:51:0x000e, B:54:0x0018, B:56:0x0028, B:59:0x0035, B:61:0x0039, B:66:0x004a, B:68:0x0052, B:74:0x006a, B:76:0x0072, B:78:0x007a, B:80:0x0082, B:71:0x005d, B:64:0x0040), top: B:86:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.f38883i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.util.ArrayList r1 = r4.f38883i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.f38876b     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.f()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.f38876b     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.f()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f38877c     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.c()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.c()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f38881g     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.i()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f38881g     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.i()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f38880f     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.l()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f38878d     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.r()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f38879e     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.s()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f38884j     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.e()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public ArrayList f() {
        return new ArrayList(this.f38876b);
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f38876b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).c());
        }
        Collections.sort(arrayList);
        K8.b bVar = new K8.b();
        bVar.a(arrayList);
        bVar.a(this.f38877c);
        bVar.a(this.f38881g);
        bVar.c(this.f38880f);
        bVar.c(this.f38878d);
        bVar.c(this.f38879e);
        bVar.a(this.f38884j);
        return bVar.b();
    }

    public String i() {
        return this.f38881g;
    }

    public boolean l() {
        return this.f38880f;
    }

    public boolean r() {
        return this.f38878d;
    }

    public boolean s() {
        return this.f38879e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f38875a;
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, i11);
        S8.c.t(parcel, 2, f(), false);
        S8.c.p(parcel, 3, c(), i10, false);
        S8.c.c(parcel, 4, r());
        S8.c.c(parcel, 5, s());
        S8.c.c(parcel, 6, l());
        S8.c.q(parcel, 7, i(), false);
        S8.c.q(parcel, 8, this.f38882h, false);
        S8.c.t(parcel, 9, d(), false);
        S8.c.q(parcel, 10, e(), false);
        S8.c.b(parcel, iA);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private Set f38886a;

        /* JADX INFO: renamed from: b */
        private boolean f38887b;

        /* JADX INFO: renamed from: c */
        private boolean f38888c;

        /* JADX INFO: renamed from: d */
        private boolean f38889d;

        /* JADX INFO: renamed from: e */
        private String f38890e;

        /* JADX INFO: renamed from: f */
        private Account f38891f;

        /* JADX INFO: renamed from: g */
        private String f38892g;

        /* JADX INFO: renamed from: h */
        private Map f38893h;

        /* JADX INFO: renamed from: i */
        private String f38894i;

        public a() {
            this.f38886a = new HashSet();
            this.f38893h = new HashMap();
        }

        private final String j(String str) {
            AbstractC2115p.f(str);
            String str2 = this.f38890e;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            AbstractC2115p.b(z10, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f38886a.contains(GoogleSignInOptions.f38873r)) {
                Set set = this.f38886a;
                Scope scope = GoogleSignInOptions.f38872q;
                if (set.contains(scope)) {
                    this.f38886a.remove(scope);
                }
            }
            if (this.f38889d && (this.f38891f == null || !this.f38886a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f38886a), this.f38891f, this.f38889d, this.f38887b, this.f38888c, this.f38890e, this.f38892g, this.f38893h, this.f38894i);
        }

        public a b() {
            this.f38886a.add(GoogleSignInOptions.f38871p);
            return this;
        }

        public a c(String str) {
            this.f38889d = true;
            j(str);
            this.f38890e = str;
            return this;
        }

        public a d() {
            this.f38886a.add(GoogleSignInOptions.f38869n);
            return this;
        }

        public a e(Scope scope, Scope... scopeArr) {
            this.f38886a.add(scope);
            this.f38886a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a f(String str, boolean z10) {
            this.f38887b = true;
            j(str);
            this.f38890e = str;
            this.f38888c = z10;
            return this;
        }

        public a g(String str) {
            this.f38891f = new Account(AbstractC2115p.f(str), "com.google");
            return this;
        }

        public a h(String str) {
            this.f38892g = AbstractC2115p.f(str);
            return this;
        }

        public a i(String str) {
            this.f38894i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f38886a = new HashSet();
            this.f38893h = new HashMap();
            AbstractC2115p.l(googleSignInOptions);
            this.f38886a = new HashSet(googleSignInOptions.f38876b);
            this.f38887b = googleSignInOptions.f38879e;
            this.f38888c = googleSignInOptions.f38880f;
            this.f38889d = googleSignInOptions.f38878d;
            this.f38890e = googleSignInOptions.f38881g;
            this.f38891f = googleSignInOptions.f38877c;
            this.f38892g = googleSignInOptions.f38882h;
            this.f38893h = GoogleSignInOptions.d0(googleSignInOptions.f38883i);
            this.f38894i = googleSignInOptions.f38884j;
        }
    }

    GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, d0(arrayList2), str3);
    }

    private GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f38875a = i10;
        this.f38876b = arrayList;
        this.f38877c = account;
        this.f38878d = z10;
        this.f38879e = z11;
        this.f38880f = z12;
        this.f38881g = str;
        this.f38882h = str2;
        this.f38883i = new ArrayList(map.values());
        this.f38885k = map;
        this.f38884j = str3;
    }
}
