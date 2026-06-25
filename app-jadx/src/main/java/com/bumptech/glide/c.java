package com.bumptech.glide;

import W4.a;
import W4.i;
import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import com.bumptech.glide.module.AppGlideModule;
import h5.InterfaceC4906c;
import h5.o;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c */
    private U4.k f35580c;

    /* JADX INFO: renamed from: d */
    private V4.d f35581d;

    /* JADX INFO: renamed from: e */
    private V4.b f35582e;

    /* JADX INFO: renamed from: f */
    private W4.h f35583f;

    /* JADX INFO: renamed from: g */
    private X4.a f35584g;

    /* JADX INFO: renamed from: h */
    private X4.a f35585h;

    /* JADX INFO: renamed from: i */
    private a.InterfaceC0363a f35586i;

    /* JADX INFO: renamed from: j */
    private W4.i f35587j;

    /* JADX INFO: renamed from: k */
    private InterfaceC4906c f35588k;

    /* JADX INFO: renamed from: n */
    private o.b f35591n;

    /* JADX INFO: renamed from: o */
    private X4.a f35592o;

    /* JADX INFO: renamed from: p */
    private boolean f35593p;

    /* JADX INFO: renamed from: q */
    private List f35594q;

    /* JADX INFO: renamed from: a */
    private final Map f35578a = new C6551a();

    /* JADX INFO: renamed from: b */
    private final e.a f35579b = new e.a();

    /* JADX INFO: renamed from: l */
    private int f35589l = 4;

    /* JADX INFO: renamed from: m */
    private b.a f35590m = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        public k5.f build() {
            return new k5.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.c$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0597c {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {
    }

    com.bumptech.glide.b a(Context context, List list, AppGlideModule appGlideModule) {
        if (this.f35584g == null) {
            this.f35584g = X4.a.q();
        }
        if (this.f35585h == null) {
            this.f35585h = X4.a.l();
        }
        if (this.f35592o == null) {
            this.f35592o = X4.a.j();
        }
        if (this.f35587j == null) {
            this.f35587j = new i.a(context).a();
        }
        if (this.f35588k == null) {
            this.f35588k = new h5.e();
        }
        if (this.f35581d == null) {
            int iB = this.f35587j.b();
            if (iB > 0) {
                this.f35581d = new V4.j(iB);
            } else {
                this.f35581d = new V4.e();
            }
        }
        if (this.f35582e == null) {
            this.f35582e = new V4.i(this.f35587j.a());
        }
        if (this.f35583f == null) {
            this.f35583f = new W4.g(this.f35587j.d());
        }
        if (this.f35586i == null) {
            this.f35586i = new W4.f(context);
        }
        if (this.f35580c == null) {
            this.f35580c = new U4.k(this.f35583f, this.f35586i, this.f35585h, this.f35584g, X4.a.w(), this.f35592o, this.f35593p);
        }
        List list2 = this.f35594q;
        if (list2 == null) {
            this.f35594q = Collections.EMPTY_LIST;
        } else {
            this.f35594q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.b(context, this.f35580c, this.f35583f, this.f35581d, this.f35582e, new o(this.f35591n), this.f35588k, this.f35589l, this.f35590m, this.f35578a, this.f35594q, list, appGlideModule, this.f35579b.b());
    }

    public c b(int i10) {
        if (i10 < 2 || i10 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f35589l = i10;
        return this;
    }

    void c(o.b bVar) {
        this.f35591n = bVar;
    }
}
