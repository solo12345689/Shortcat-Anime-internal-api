package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.firebase.messaging.AbstractC3967e;
import java.util.Map;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class W extends S8.a {
    public static final Parcelable.Creator<W> CREATOR = new X();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bundle f43355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f43356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f43357c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f43358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f43359b;

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f43358a = bundle;
            this.f43359b = new C6551a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public b a(String str, String str2) {
            this.f43359b.put(str, str2);
            return this;
        }

        public W b() {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.f43359b.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putAll(this.f43358a);
            this.f43358a.remove("from");
            return new W(bundle);
        }

        public b c(String str) {
            this.f43358a.putString("collapse_key", str);
            return this;
        }

        public b d(String str) {
            this.f43358a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.f43358a.putString("message_type", str);
            return this;
        }

        public b f(int i10) {
            this.f43358a.putString("google.ttl", String.valueOf(i10));
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f43360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f43361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f43362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f43363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f43364e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String[] f43365f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f43366g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f43367h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f43368i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f43369j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f43370k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f43371l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f43372m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f43373n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final String f43374o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final Integer f43375p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Integer f43376q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Integer f43377r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int[] f43378s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Long f43379t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f43380u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f43381v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final boolean f43382w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final boolean f43383x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final boolean f43384y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final long[] f43385z;

        private static String[] p(N n10, String str) {
            Object[] objArrG = n10.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i10 = 0; i10 < objArrG.length; i10++) {
                strArr[i10] = String.valueOf(objArrG[i10]);
            }
            return strArr;
        }

        public Integer A() {
            return this.f43376q;
        }

        public String a() {
            return this.f43363d;
        }

        public String[] b() {
            return this.f43365f;
        }

        public String c() {
            return this.f43364e;
        }

        public String d() {
            return this.f43372m;
        }

        public String e() {
            return this.f43371l;
        }

        public String f() {
            return this.f43370k;
        }

        public boolean g() {
            return this.f43384y;
        }

        public boolean h() {
            return this.f43382w;
        }

        public boolean i() {
            return this.f43383x;
        }

        public Long j() {
            return this.f43379t;
        }

        public String k() {
            return this.f43366g;
        }

        public Uri l() {
            String str = this.f43367h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public int[] m() {
            return this.f43378s;
        }

        public Uri n() {
            return this.f43373n;
        }

        public boolean o() {
            return this.f43381v;
        }

        public Integer q() {
            return this.f43377r;
        }

        public Integer r() {
            return this.f43375p;
        }

        public String s() {
            return this.f43368i;
        }

        public boolean t() {
            return this.f43380u;
        }

        public String u() {
            return this.f43369j;
        }

        public String v() {
            return this.f43374o;
        }

        public String w() {
            return this.f43360a;
        }

        public String[] x() {
            return this.f43362c;
        }

        public String y() {
            return this.f43361b;
        }

        public long[] z() {
            return this.f43385z;
        }

        private c(N n10) {
            this.f43360a = n10.p("gcm.n.title");
            this.f43361b = n10.h("gcm.n.title");
            this.f43362c = p(n10, "gcm.n.title");
            this.f43363d = n10.p("gcm.n.body");
            this.f43364e = n10.h("gcm.n.body");
            this.f43365f = p(n10, "gcm.n.body");
            this.f43366g = n10.p("gcm.n.icon");
            this.f43368i = n10.o();
            this.f43369j = n10.p("gcm.n.tag");
            this.f43370k = n10.p("gcm.n.color");
            this.f43371l = n10.p("gcm.n.click_action");
            this.f43372m = n10.p("gcm.n.android_channel_id");
            this.f43373n = n10.f();
            this.f43367h = n10.p("gcm.n.image");
            this.f43374o = n10.p("gcm.n.ticker");
            this.f43375p = n10.b("gcm.n.notification_priority");
            this.f43376q = n10.b("gcm.n.visibility");
            this.f43377r = n10.b("gcm.n.notification_count");
            this.f43380u = n10.a("gcm.n.sticky");
            this.f43381v = n10.a("gcm.n.local_only");
            this.f43382w = n10.a("gcm.n.default_sound");
            this.f43383x = n10.a("gcm.n.default_vibrate_timings");
            this.f43384y = n10.a("gcm.n.default_light_settings");
            this.f43379t = n10.j("gcm.n.event_time");
            this.f43378s = n10.e();
            this.f43385z = n10.q();
        }
    }

    public W(Bundle bundle) {
        this.f43355a = bundle;
    }

    private int i(String str) {
        if (Constants.HIGH.equals(str)) {
            return 1;
        }
        return Constants.NORMAL.equals(str) ? 2 : 0;
    }

    void A(Intent intent) {
        intent.putExtras(this.f43355a);
    }

    public String c() {
        return this.f43355a.getString("collapse_key");
    }

    public Map d() {
        if (this.f43356b == null) {
            this.f43356b = AbstractC3967e.a.a(this.f43355a);
        }
        return this.f43356b;
    }

    public String e() {
        return this.f43355a.getString("from");
    }

    public String f() {
        String string = this.f43355a.getString("google.message_id");
        return string == null ? this.f43355a.getString("message_id") : string;
    }

    public String l() {
        return this.f43355a.getString("message_type");
    }

    public c r() {
        if (this.f43357c == null && N.t(this.f43355a)) {
            this.f43357c = new c(new N(this.f43355a));
        }
        return this.f43357c;
    }

    public int s() {
        String string = this.f43355a.getString("google.original_priority");
        if (string == null) {
            string = this.f43355a.getString("google.priority");
        }
        return i(string);
    }

    public int w() {
        String string = this.f43355a.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.f43355a.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.f43355a.getString("google.priority");
        }
        return i(string);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        X.c(this, parcel, i10);
    }

    public long x() {
        Object obj = this.f43355a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    public String y() {
        return this.f43355a.getString("google.to");
    }

    public int z() {
        Object obj = this.f43355a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }
}
