package hg;

import Df.r;
import dg.C;
import dg.C4623d;
import dg.E;
import dg.t;
import fg.AbstractC4807e;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kg.AbstractC5480c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hg.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4951c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47861c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f47862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E f47863b;

    /* JADX INFO: renamed from: hg.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(dg.E r5, dg.C r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.AbstractC5504s.h(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.AbstractC5504s.h(r6, r0)
                int r0 = r5.o()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                java.lang.String r0 = "Expires"
                r1 = 2
                r3 = 0
                java.lang.String r0 = dg.E.D(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                dg.d r0 = r5.k()
                int r0 = r0.c()
                r1 = -1
                if (r0 != r1) goto L65
                dg.d r0 = r5.k()
                boolean r0 = r0.b()
                if (r0 != 0) goto L65
                dg.d r0 = r5.k()
                boolean r0 = r0.a()
                if (r0 != 0) goto L65
                return r2
            L65:
                dg.d r5 = r5.k()
                boolean r5 = r5.h()
                if (r5 != 0) goto L7b
                dg.d r5 = r6.f()
                boolean r5 = r5.h()
                if (r5 != 0) goto L7b
                r5 = 1
                return r5
            L7b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.C4951c.a.a(dg.E, dg.C):boolean");
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: hg.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f47864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C f47865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final E f47866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Date f47867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f47868e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Date f47869f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f47870g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Date f47871h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f47872i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f47873j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f47874k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f47875l;

        public b(long j10, C request, E e10) {
            AbstractC5504s.h(request, "request");
            this.f47864a = j10;
            this.f47865b = request;
            this.f47866c = e10;
            this.f47875l = -1;
            if (e10 != null) {
                this.f47872i = e10.G0();
                this.f47873j = e10.B0();
                t tVarE = e10.E();
                int size = tVarE.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strF = tVarE.f(i10);
                    String strP = tVarE.p(i10);
                    if (r.B(strF, "Date", true)) {
                        this.f47867d = AbstractC5480c.a(strP);
                        this.f47868e = strP;
                    } else if (r.B(strF, "Expires", true)) {
                        this.f47871h = AbstractC5480c.a(strP);
                    } else if (r.B(strF, "Last-Modified", true)) {
                        this.f47869f = AbstractC5480c.a(strP);
                        this.f47870g = strP;
                    } else if (r.B(strF, "ETag", true)) {
                        this.f47874k = strP;
                    } else if (r.B(strF, "Age", true)) {
                        this.f47875l = AbstractC4807e.Y(strP, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f47867d;
            long jMax = date != null ? Math.max(0L, this.f47873j - date.getTime()) : 0L;
            int i10 = this.f47875l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f47873j;
            return jMax + (j10 - this.f47872i) + (this.f47864a - j10);
        }

        private final C4951c c() {
            String str;
            if (this.f47866c == null) {
                return new C4951c(this.f47865b, null);
            }
            if (this.f47865b.k() && this.f47866c.w() == null) {
                return new C4951c(this.f47865b, null);
            }
            if (!C4951c.f47861c.a(this.f47866c, this.f47865b)) {
                return new C4951c(this.f47865b, null);
            }
            C4623d c4623dF = this.f47865b.f();
            if (c4623dF.g() || e(this.f47865b)) {
                return new C4951c(this.f47865b, null);
            }
            C4623d c4623dK = this.f47866c.k();
            long jA = a();
            long jD = d();
            if (c4623dF.c() != -1) {
                jD = Math.min(jD, TimeUnit.SECONDS.toMillis(c4623dF.c()));
            }
            long millis = 0;
            long millis2 = c4623dF.e() != -1 ? TimeUnit.SECONDS.toMillis(c4623dF.e()) : 0L;
            if (!c4623dK.f() && c4623dF.d() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c4623dF.d());
            }
            if (!c4623dK.g()) {
                long j10 = millis2 + jA;
                if (j10 < millis + jD) {
                    E.a aVarY = this.f47866c.Y();
                    if (j10 >= jD) {
                        aVarY.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > 86400000 && f()) {
                        aVarY.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C4951c(null, aVarY.c());
                }
            }
            String str2 = this.f47874k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f47869f != null) {
                    str2 = this.f47870g;
                } else {
                    if (this.f47867d == null) {
                        return new C4951c(this.f47865b, null);
                    }
                    str2 = this.f47868e;
                }
                str = "If-Modified-Since";
            }
            t.a aVarL = this.f47865b.i().l();
            AbstractC5504s.e(str2);
            aVarL.c(str, str2);
            return new C4951c(this.f47865b.m().f(aVarL.e()).b(), this.f47866c);
        }

        private final long d() {
            E e10 = this.f47866c;
            AbstractC5504s.e(e10);
            if (e10.k().c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.c());
            }
            Date date = this.f47871h;
            if (date != null) {
                Date date2 = this.f47867d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f47873j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f47869f != null && this.f47866c.F0().p().n() == null) {
                Date date3 = this.f47867d;
                long time2 = date3 != null ? date3.getTime() : this.f47872i;
                Date date4 = this.f47869f;
                AbstractC5504s.e(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        private final boolean e(C c10) {
            return (c10.h("If-Modified-Since") == null && c10.h("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            E e10 = this.f47866c;
            AbstractC5504s.e(e10);
            return e10.k().c() == -1 && this.f47871h == null;
        }

        public final C4951c b() {
            C4951c c4951cC = c();
            return (c4951cC.b() == null || !this.f47865b.f().i()) ? c4951cC : new C4951c(null, null);
        }
    }

    public C4951c(C c10, E e10) {
        this.f47862a = c10;
        this.f47863b = e10;
    }

    public final E a() {
        return this.f47863b;
    }

    public final C b() {
        return this.f47862a;
    }
}
