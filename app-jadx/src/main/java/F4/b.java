package F4;

import Df.r;
import L4.j;
import L4.u;
import dg.C;
import dg.C4623d;
import dg.E;
import dg.t;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6542c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f6543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F4.a f6544b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean d(String str) {
            return r.B("Content-Length", str, true) || r.B("Content-Encoding", str, true) || r.B("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return (r.B("Connection", str, true) || r.B("Keep-Alive", str, true) || r.B("Proxy-Authenticate", str, true) || r.B("Proxy-Authorization", str, true) || r.B("TE", str, true) || r.B("Trailers", str, true) || r.B("Transfer-Encoding", str, true) || r.B("Upgrade", str, true)) ? false : true;
        }

        public final t a(t tVar, t tVar2) {
            t.a aVar = new t.a();
            int size = tVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strF = tVar.f(i10);
                String strP = tVar.p(i10);
                if ((!r.B("Warning", strF, true) || !r.Q(strP, "1", false, 2, null)) && (d(strF) || !e(strF) || tVar2.d(strF) == null)) {
                    aVar.a(strF, strP);
                }
            }
            int size2 = tVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strF2 = tVar2.f(i11);
                if (!d(strF2) && e(strF2)) {
                    aVar.a(strF2, tVar2.p(i11));
                }
            }
            return aVar.e();
        }

        public final boolean b(C c10, F4.a aVar) {
            return (c10.f().h() || aVar.a().h() || AbstractC5504s.c(aVar.d().d("Vary"), "*")) ? false : true;
        }

        public final boolean c(C c10, E e10) {
            return (c10.f().h() || e10.k().h() || AbstractC5504s.c(e10.E().d("Vary"), "*")) ? false : true;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: F4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0086b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C f6545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final F4.a f6546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Date f6547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f6548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Date f6549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f6550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Date f6551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f6552h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f6553i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f6554j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f6555k;

        public C0086b(C c10, F4.a aVar) {
            this.f6545a = c10;
            this.f6546b = aVar;
            this.f6555k = -1;
            if (aVar != null) {
                this.f6552h = aVar.e();
                this.f6553i = aVar.c();
                t tVarD = aVar.d();
                int size = tVarD.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strF = tVarD.f(i10);
                    if (r.B(strF, "Date", true)) {
                        this.f6547c = tVarD.e("Date");
                        this.f6548d = tVarD.p(i10);
                    } else if (r.B(strF, "Expires", true)) {
                        this.f6551g = tVarD.e("Expires");
                    } else if (r.B(strF, "Last-Modified", true)) {
                        this.f6549e = tVarD.e("Last-Modified");
                        this.f6550f = tVarD.p(i10);
                    } else if (r.B(strF, "ETag", true)) {
                        this.f6554j = tVarD.p(i10);
                    } else if (r.B(strF, "Age", true)) {
                        this.f6555k = j.y(tVarD.p(i10), -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f6547c;
            long jMax = date != null ? Math.max(0L, this.f6553i - date.getTime()) : 0L;
            int i10 = this.f6555k;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            return jMax + (this.f6553i - this.f6552h) + (u.f11303a.a() - this.f6553i);
        }

        private final long c() {
            F4.a aVar = this.f6546b;
            AbstractC5504s.e(aVar);
            if (aVar.a().c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.c());
            }
            Date date = this.f6551g;
            if (date != null) {
                Date date2 = this.f6547c;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f6553i);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f6549e != null && this.f6545a.p().n() == null) {
                Date date3 = this.f6547c;
                long time2 = date3 != null ? date3.getTime() : this.f6552h;
                Date date4 = this.f6549e;
                AbstractC5504s.e(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        private final boolean d(C c10) {
            return (c10.h("If-Modified-Since") == null && c10.h("If-None-Match") == null) ? false : true;
        }

        public final b b() {
            String str;
            F4.a aVar = null;
            byte b10 = 0;
            byte b11 = 0;
            byte b12 = 0;
            byte b13 = 0;
            byte b14 = 0;
            byte b15 = 0;
            byte b16 = 0;
            byte b17 = 0;
            byte b18 = 0;
            byte b19 = 0;
            byte b20 = 0;
            byte b21 = 0;
            if (this.f6546b == null) {
                return new b(this.f6545a, aVar, b21 == true ? 1 : 0);
            }
            if (this.f6545a.k() && !this.f6546b.f()) {
                return new b(this.f6545a, b20 == true ? 1 : 0, b19 == true ? 1 : 0);
            }
            C4623d c4623dA = this.f6546b.a();
            if (!b.f6542c.b(this.f6545a, this.f6546b)) {
                return new b(this.f6545a, b18 == true ? 1 : 0, b17 == true ? 1 : 0);
            }
            C4623d c4623dF = this.f6545a.f();
            if (c4623dF.g() || d(this.f6545a)) {
                return new b(this.f6545a, b11 == true ? 1 : 0, b10 == true ? 1 : 0);
            }
            long jA = a();
            long jC = c();
            if (c4623dF.c() != -1) {
                jC = Math.min(jC, TimeUnit.SECONDS.toMillis(c4623dF.c()));
            }
            long millis = 0;
            long millis2 = c4623dF.e() != -1 ? TimeUnit.SECONDS.toMillis(c4623dF.e()) : 0L;
            if (!c4623dA.f() && c4623dF.d() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c4623dF.d());
            }
            if (!c4623dA.g() && jA + millis2 < jC + millis) {
                return new b(b16 == true ? 1 : 0, this.f6546b, b15 == true ? 1 : 0);
            }
            String str2 = this.f6554j;
            if (str2 != null) {
                AbstractC5504s.e(str2);
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.f6549e != null) {
                    str2 = this.f6550f;
                    AbstractC5504s.e(str2);
                } else {
                    if (this.f6547c == null) {
                        return new b(this.f6545a, b13 == true ? 1 : 0, b12 == true ? 1 : 0);
                    }
                    str2 = this.f6548d;
                    AbstractC5504s.e(str2);
                }
            }
            return new b(this.f6545a.m().a(str, str2).b(), this.f6546b, b14 == true ? 1 : 0);
        }
    }

    public /* synthetic */ b(C c10, F4.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(c10, aVar);
    }

    public final F4.a a() {
        return this.f6544b;
    }

    public final C b() {
        return this.f6543a;
    }

    private b(C c10, F4.a aVar) {
        this.f6543a = c10;
        this.f6544b = aVar;
    }
}
