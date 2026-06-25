package E3;

import E3.C1375h3;
import E3.U6;
import F3.q;
import P9.AbstractC2011u;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import q2.C6071C;
import q2.C6077I;
import q2.C6082N;
import q2.C6083O;
import q2.C6088c;
import q2.C6101p;
import q2.InterfaceC6084P;
import t2.AbstractC6614a;
import t2.InterfaceC6621h;

/* JADX INFO: renamed from: E3.h3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C1375h3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f5299b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap f5300c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I3 f5301a;

    /* JADX INFO: renamed from: E3.h3$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends c {

        /* JADX INFO: renamed from: E3.h3$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements d {
            a() {
            }
        }

        public b(Context context, InterfaceC6084P interfaceC6084P) {
            super(context, interfaceC6084P, new a());
        }

        public C1375h3 d() {
            if (this.f5309h == null) {
                this.f5309h = new C1315a(new w2.k(this.f5302a));
            }
            return new C1375h3(this.f5302a, this.f5304c, this.f5303b, this.f5306e, this.f5311j, this.f5312k, this.f5313l, this.f5305d, this.f5307f, this.f5308g, (InterfaceC6621h) AbstractC6614a.e(this.f5309h), this.f5310i, this.f5314m, 0);
        }

        public b e(d dVar) {
            return (b) super.a(dVar);
        }

        public b f(List list) {
            return (b) super.b(list);
        }

        public b g(String str) {
            return (b) super.c(str);
        }
    }

    /* JADX INFO: renamed from: E3.h3$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f5302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final InterfaceC6084P f5303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f5304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        d f5305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        PendingIntent f5306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bundle f5307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Bundle f5308g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        InterfaceC6621h f5309h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f5310i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        AbstractC2011u f5311j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        AbstractC2011u f5312k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        AbstractC2011u f5313l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f5314m;

        public c(Context context, InterfaceC6084P interfaceC6084P, d dVar) {
            this.f5302a = (Context) AbstractC6614a.e(context);
            this.f5303b = (InterfaceC6084P) AbstractC6614a.e(interfaceC6084P);
            AbstractC6614a.a(interfaceC6084P.g());
            this.f5304c = "";
            this.f5305d = dVar;
            this.f5307f = new Bundle();
            this.f5308g = new Bundle();
            this.f5311j = AbstractC2011u.A();
            this.f5312k = AbstractC2011u.A();
            this.f5310i = true;
            this.f5314m = true;
            this.f5313l = AbstractC2011u.A();
        }

        c a(d dVar) {
            this.f5305d = (d) AbstractC6614a.e(dVar);
            return this;
        }

        public c b(List list) {
            this.f5311j = AbstractC2011u.w(list);
            return this;
        }

        public c c(String str) {
            this.f5304c = (String) AbstractC6614a.e(str);
            return this;
        }
    }

    /* JADX INFO: renamed from: E3.h3$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final U6 f5315h = new U6.b().c().e();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final U6 f5316i = new U6.b().b().c().e();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final InterfaceC6084P.b f5317j = new InterfaceC6084P.b.a().d().f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final U6 f5319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC6084P.b f5320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AbstractC2011u f5321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AbstractC2011u f5322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Bundle f5323f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PendingIntent f5324g;

        /* JADX INFO: renamed from: E3.h3$e$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static class a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private AbstractC2011u f5327c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private AbstractC2011u f5328d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Bundle f5329e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private PendingIntent f5330f;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private InterfaceC6084P.b f5326b = e.f5317j;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private U6 f5325a = e.f5315h;

            public a(C1375h3 c1375h3) {
            }

            public e a() {
                return new e(true, this.f5325a, this.f5326b, this.f5327c, this.f5328d, this.f5329e, this.f5330f);
            }

            public a b(InterfaceC6084P.b bVar) {
                this.f5326b = (InterfaceC6084P.b) AbstractC6614a.e(bVar);
                return this;
            }

            public a c(U6 u62) {
                this.f5325a = (U6) AbstractC6614a.e(u62);
                return this;
            }

            public a d(List list) {
                this.f5327c = list == null ? null : AbstractC2011u.w(list);
                return this;
            }

            public a e(List list) {
                this.f5328d = list == null ? null : AbstractC2011u.w(list);
                return this;
            }
        }

        public static e a(U6 u62, InterfaceC6084P.b bVar) {
            return new e(true, u62, bVar, null, null, null, null);
        }

        public static e b() {
            return new e(false, U6.f4986b, InterfaceC6084P.b.f56604b, AbstractC2011u.A(), AbstractC2011u.A(), Bundle.EMPTY, null);
        }

        private e(boolean z10, U6 u62, InterfaceC6084P.b bVar, AbstractC2011u abstractC2011u, AbstractC2011u abstractC2011u2, Bundle bundle, PendingIntent pendingIntent) {
            this.f5318a = z10;
            this.f5319b = u62;
            this.f5320c = bVar;
            this.f5321d = abstractC2011u;
            this.f5322e = abstractC2011u2;
            this.f5323f = bundle;
            this.f5324g = pendingIntent;
        }
    }

    /* JADX INFO: renamed from: E3.h3$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q.b f5331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f5332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f5333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f5334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final f f5335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Bundle f5336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f5337g;

        g(q.b bVar, int i10, int i11, boolean z10, f fVar, Bundle bundle, int i12) {
            this.f5331a = bVar;
            this.f5332b = i10;
            this.f5333c = i11;
            this.f5334d = z10;
            this.f5335e = fVar;
            this.f5336f = bundle;
            this.f5337g = i12;
        }

        static g a() {
            return new g(new q.b("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY, 0);
        }

        public Bundle b() {
            return new Bundle(this.f5336f);
        }

        f c() {
            return this.f5335e;
        }

        public int d() {
            return this.f5332b;
        }

        public int e() {
            return this.f5333c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            g gVar = (g) obj;
            f fVar = this.f5335e;
            return (fVar == null && gVar.f5335e == null) ? this.f5331a.equals(gVar.f5331a) : Objects.equals(fVar, gVar.f5335e);
        }

        public String f() {
            return this.f5331a.a();
        }

        q.b g() {
            return this.f5331a;
        }

        public boolean h() {
            return this.f5334d;
        }

        public int hashCode() {
            return Objects.hash(this.f5335e, this.f5331a);
        }

        public String toString() {
            return "ControllerInfo {pkg=" + this.f5331a.a() + ", uid=" + this.f5331a.c() + "}";
        }
    }

    /* JADX INFO: renamed from: E3.h3$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface h {
        void a(C1375h3 c1375h3);

        boolean b(C1375h3 c1375h3);
    }

    /* JADX INFO: renamed from: E3.h3$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2011u f5338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5340c;

        public i(List list, int i10, long j10) {
            this.f5338a = AbstractC2011u.w(list);
            this.f5339b = i10;
            this.f5340c = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f5338a.equals(iVar.f5338a) && this.f5339b == iVar.f5339b && this.f5340c == iVar.f5340c;
        }

        public int hashCode() {
            return (((this.f5338a.hashCode() * 31) + this.f5339b) * 31) + S9.h.c(this.f5340c);
        }
    }

    C1375h3(Context context, String str, InterfaceC6084P interfaceC6084P, PendingIntent pendingIntent, AbstractC2011u abstractC2011u, AbstractC2011u abstractC2011u2, AbstractC2011u abstractC2011u3, d dVar, Bundle bundle, Bundle bundle2, InterfaceC6621h interfaceC6621h, boolean z10, boolean z11, int i10) {
        synchronized (f5299b) {
            HashMap map = f5300c;
            if (map.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            map.put(str, this);
        }
        this.f5301a = b(context, str, interfaceC6084P, pendingIntent, abstractC2011u, abstractC2011u2, abstractC2011u3, dVar, bundle, bundle2, interfaceC6621h, z10, z11, i10);
    }

    static C1375h3 k(Uri uri) {
        synchronized (f5299b) {
            try {
                for (C1375h3 c1375h3 : f5300c.values()) {
                    if (Objects.equals(c1375h3.n(), uri)) {
                        return c1375h3;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void a() {
        this.f5301a.M();
    }

    I3 b(Context context, String str, InterfaceC6084P interfaceC6084P, PendingIntent pendingIntent, AbstractC2011u abstractC2011u, AbstractC2011u abstractC2011u2, AbstractC2011u abstractC2011u3, d dVar, Bundle bundle, Bundle bundle2, InterfaceC6621h interfaceC6621h, boolean z10, boolean z11, int i10) {
        return new I3(this, context, str, interfaceC6084P, pendingIntent, abstractC2011u, abstractC2011u2, abstractC2011u3, dVar, bundle, bundle2, interfaceC6621h, z10, z11);
    }

    public AbstractC2011u c() {
        return this.f5301a.b0();
    }

    public final String d() {
        return this.f5301a.c0();
    }

    I3 e() {
        return this.f5301a;
    }

    final IBinder f() {
        return this.f5301a.d0();
    }

    public AbstractC2011u g() {
        return this.f5301a.e0();
    }

    public g h() {
        return this.f5301a.f0();
    }

    public final MediaSession.Token i() {
        return this.f5301a.g0();
    }

    public final InterfaceC6084P j() {
        return this.f5301a.j0().Z0();
    }

    public Bundle l() {
        return this.f5301a.l0();
    }

    public final Y6 m() {
        return this.f5301a.m0();
    }

    final Uri n() {
        return this.f5301a.n0();
    }

    final void o(InterfaceC1443q interfaceC1443q, g gVar) {
        this.f5301a.N(interfaceC1443q, gVar);
    }

    final boolean p() {
        return this.f5301a.t0();
    }

    public final void q() {
        try {
            synchronized (f5299b) {
                f5300c.remove(this.f5301a.c0());
            }
            this.f5301a.L0();
        } catch (Exception unused) {
        }
    }

    final void r(h hVar) {
        this.f5301a.P0(hVar);
    }

    public final void s(Bundle bundle) {
        this.f5301a.R0(new Bundle(bundle));
    }

    /* JADX INFO: renamed from: E3.h3$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface f {
        default void b(int i10) {
        }

        default void d(int i10) {
        }

        default void A(int i10, int i11) {
        }

        default void B(int i10, q2.h0 h0Var) {
        }

        default void C(int i10, q2.l0 l0Var) {
        }

        default void E(int i10, C6088c c6088c) {
        }

        default void G(int i10, boolean z10) {
        }

        default void c(int i10, C6077I c6077i) {
        }

        default void e(int i10, long j10) {
        }

        default void h(int i10, int i11) {
        }

        default void i(int i10, C6082N c6082n) {
        }

        default void j(int i10, C6083O c6083o) {
        }

        default void l(int i10, X6 x62) {
        }

        default void o(int i10, Bundle bundle) {
        }

        default void p(int i10, boolean z10) {
        }

        default void q(int i10, boolean z10) {
        }

        default void s(int i10, InterfaceC6084P.b bVar) {
        }

        default void t(int i10, long j10) {
        }

        default void u(int i10, C6101p c6101p) {
        }

        default void v(int i10, C1490w c1490w) {
        }

        default void w(int i10, C6077I c6077i) {
        }

        default void x(int i10, q2.d0 d0Var) {
        }

        default void y(int i10, float f10) {
        }

        default void D(int i10, N6 n62, N6 n63) {
        }

        default void F(int i10, T6 t62, Bundle bundle) {
        }

        default void g(int i10, int i11, C6082N c6082n) {
        }

        default void k(int i10, C6071C c6071c, int i11) {
        }

        default void m(int i10, boolean z10, int i11) {
        }

        default void n(int i10, int i11, boolean z10) {
        }

        default void r(int i10, q2.Y y10, int i11) {
        }

        default void f(int i10, InterfaceC6084P.e eVar, InterfaceC6084P.e eVar2, int i11) {
        }

        default void a(int i10, W6 w62, boolean z10, boolean z11, int i11) {
        }

        default void z(int i10, M6 m62, InterfaceC6084P.b bVar, boolean z10, boolean z11) {
        }
    }

    /* JADX INFO: renamed from: E3.h3$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        default boolean a(C1375h3 c1375h3, g gVar, Intent intent) {
            return false;
        }

        default com.google.common.util.concurrent.p d(C1375h3 c1375h3, g gVar, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C6071C) it.next()).f56328b == null) {
                    return com.google.common.util.concurrent.j.c(new UnsupportedOperationException());
                }
            }
            return com.google.common.util.concurrent.j.d(list);
        }

        default int e(C1375h3 c1375h3, g gVar, int i10) {
            return 0;
        }

        default com.google.common.util.concurrent.p f(C1375h3 c1375h3, g gVar, T6 t62, Bundle bundle) {
            return com.google.common.util.concurrent.j.d(new X6(-6));
        }

        default com.google.common.util.concurrent.p g(C1375h3 c1375h3, g gVar) {
            return com.google.common.util.concurrent.j.c(new UnsupportedOperationException());
        }

        default com.google.common.util.concurrent.p h(C1375h3 c1375h3, g gVar, q2.S s10) {
            return com.google.common.util.concurrent.j.d(new X6(-6));
        }

        default e j(C1375h3 c1375h3, g gVar) {
            return new e.a(c1375h3).a();
        }

        default com.google.common.util.concurrent.p k(C1375h3 c1375h3, g gVar, String str, q2.S s10) {
            return com.google.common.util.concurrent.j.d(new X6(-6));
        }

        default com.google.common.util.concurrent.p m(C1375h3 c1375h3, g gVar, List list, final int i10, final long j10) {
            return t2.a0.D1(d(c1375h3, gVar, list), new com.google.common.util.concurrent.d() { // from class: E3.i3
                @Override // com.google.common.util.concurrent.d
                public final com.google.common.util.concurrent.p apply(Object obj) {
                    return com.google.common.util.concurrent.j.d(new C1375h3.i((List) obj, i10, j10));
                }
            });
        }

        default void c(C1375h3 c1375h3, g gVar) {
        }

        default void l(C1375h3 c1375h3, g gVar) {
        }

        default void b(C1375h3 c1375h3, g gVar, InterfaceC6084P.b bVar) {
        }
    }
}
