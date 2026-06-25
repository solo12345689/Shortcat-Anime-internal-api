package X9;

import R8.AbstractC2113n;
import R8.AbstractC2115p;
import R8.C2117s;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f21716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21717g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f21718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f21719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f21720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f21721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f21722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f21723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f21724g;

        public k a() {
            return new k(this.f21719b, this.f21718a, this.f21720c, this.f21721d, this.f21722e, this.f21723f, this.f21724g);
        }

        public b b(String str) {
            this.f21718a = AbstractC2115p.g(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f21719b = AbstractC2115p.g(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f21720c = str;
            return this;
        }

        public b e(String str) {
            this.f21721d = str;
            return this;
        }

        public b f(String str) {
            this.f21722e = str;
            return this;
        }

        public b g(String str) {
            this.f21724g = str;
            return this;
        }

        public b h(String str) {
            this.f21723f = str;
            return this;
        }
    }

    public static k a(Context context) {
        C2117s c2117s = new C2117s(context);
        String strA = c2117s.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new k(strA, c2117s.a("google_api_key"), c2117s.a("firebase_database_url"), c2117s.a("ga_trackingId"), c2117s.a("gcm_defaultSenderId"), c2117s.a("google_storage_bucket"), c2117s.a("project_id"));
    }

    public String b() {
        return this.f21711a;
    }

    public String c() {
        return this.f21712b;
    }

    public String d() {
        return this.f21713c;
    }

    public String e() {
        return this.f21714d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return AbstractC2113n.a(this.f21712b, kVar.f21712b) && AbstractC2113n.a(this.f21711a, kVar.f21711a) && AbstractC2113n.a(this.f21713c, kVar.f21713c) && AbstractC2113n.a(this.f21714d, kVar.f21714d) && AbstractC2113n.a(this.f21715e, kVar.f21715e) && AbstractC2113n.a(this.f21716f, kVar.f21716f) && AbstractC2113n.a(this.f21717g, kVar.f21717g);
    }

    public String f() {
        return this.f21715e;
    }

    public String g() {
        return this.f21717g;
    }

    public String h() {
        return this.f21716f;
    }

    public int hashCode() {
        return AbstractC2113n.b(this.f21712b, this.f21711a, this.f21713c, this.f21714d, this.f21715e, this.f21716f, this.f21717g);
    }

    public String toString() {
        return AbstractC2113n.c(this).a("applicationId", this.f21712b).a("apiKey", this.f21711a).a("databaseUrl", this.f21713c).a("gcmSenderId", this.f21715e).a("storageBucket", this.f21716f).a("projectId", this.f21717g).toString();
    }

    private k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC2115p.p(!p.a(str), "ApplicationId must be set.");
        this.f21712b = str;
        this.f21711a = str2;
        this.f21713c = str3;
        this.f21714d = str4;
        this.f21715e = str5;
        this.f21716f = str6;
        this.f21717g = str7;
    }
}
