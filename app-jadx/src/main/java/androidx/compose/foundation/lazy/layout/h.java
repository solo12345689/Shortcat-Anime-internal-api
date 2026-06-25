package androidx.compose.foundation.lazy.layout;

import F.C1544o;
import F.K;
import F.L;
import F.M;
import F.N;
import F.q;
import K0.H0;
import K0.I0;
import Ud.AbstractC2279u;
import android.os.Trace;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.ui.layout.C;
import i1.C5009b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1544o f26309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f26310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N f26311c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a implements d.b, L {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f26313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final K f26314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C.a f26315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f26316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f26317f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f26318g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private C0454a f26319h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f26320i;

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private final class C0454a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f26322a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List[] f26323b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f26324c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f26325d;

            public C0454a(List list) {
                this.f26322a = list;
                this.f26323b = new List[list.size()];
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean a(M m10) {
                if (this.f26324c >= this.f26322a.size()) {
                    return false;
                }
                if (a.this.f26317f) {
                    throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.f26324c < this.f26322a.size()) {
                    try {
                        if (this.f26323b[this.f26324c] == null) {
                            if (m10.a() <= 0) {
                                Trace.endSection();
                                return true;
                            }
                            List[] listArr = this.f26323b;
                            int i10 = this.f26324c;
                            listArr[i10] = ((d) this.f26322a.get(i10)).b();
                        }
                        List list = this.f26323b[this.f26324c];
                        AbstractC5504s.e(list);
                        while (this.f26325d < list.size()) {
                            if (((L) list.get(this.f26325d)).b(m10)) {
                                Trace.endSection();
                                return true;
                            }
                            this.f26325d++;
                        }
                        this.f26325d = 0;
                        this.f26324c++;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                Td.L l10 = Td.L.f17438a;
                Trace.endSection();
                return false;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f26327a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(kotlin.jvm.internal.N n10) {
                super(1);
                this.f26327a = n10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final H0 invoke(I0 i02) {
                AbstractC5504s.f(i02, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                d dVarE1 = ((i) i02).E1();
                kotlin.jvm.internal.N n10 = this.f26327a;
                List listS = (List) n10.f52259a;
                if (listS != null) {
                    listS.add(dVarE1);
                } else {
                    listS = AbstractC2279u.s(dVarE1);
                }
                n10.f52259a = listS;
                return H0.f10421b;
            }
        }

        public /* synthetic */ a(h hVar, int i10, long j10, K k10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, j10, k10);
        }

        private final boolean d() {
            return this.f26315d != null;
        }

        private final boolean e() {
            if (this.f26317f) {
                return false;
            }
            int iA = ((q) h.this.f26309a.d().invoke()).a();
            int i10 = this.f26312a;
            return i10 >= 0 && i10 < iA;
        }

        private final void f() {
            if (!e()) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
            }
            if (this.f26315d != null) {
                throw new IllegalArgumentException("Request was already composed!");
            }
            q qVar = (q) h.this.f26309a.d().invoke();
            Object objD = qVar.d(this.f26312a);
            this.f26315d = h.this.f26310b.i(objD, h.this.f26309a.b(this.f26312a, objD, qVar.f(this.f26312a)));
        }

        private final void g(long j10) {
            if (this.f26317f) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.f26316e) {
                throw new IllegalArgumentException("Request was already measured!");
            }
            this.f26316e = true;
            C.a aVar = this.f26315d;
            if (aVar == null) {
                throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
            }
            int iG = aVar.g();
            for (int i10 = 0; i10 < iG; i10++) {
                aVar.b(i10, j10);
            }
        }

        private final C0454a h() {
            C.a aVar = this.f26315d;
            if (aVar == null) {
                throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
            }
            kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
            aVar.a("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new b(n10));
            List list = (List) n10.f52259a;
            if (list != null) {
                return new C0454a(list);
            }
            return null;
        }

        private final boolean i(M m10, long j10) {
            long jA = m10.a();
            return (this.f26320i && jA > 0) || j10 < jA;
        }

        @Override // androidx.compose.foundation.lazy.layout.d.b
        public void a() {
            this.f26320i = true;
        }

        @Override // F.L
        public boolean b(M m10) {
            if (!e()) {
                return false;
            }
            Object objF = ((q) h.this.f26309a.d().invoke()).f(this.f26312a);
            if (!d()) {
                if (!i(m10, (objF == null || !this.f26314c.f().a(objF)) ? this.f26314c.e() : this.f26314c.f().d(objF))) {
                    return true;
                }
                K k10 = this.f26314c;
                long jNanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    f();
                    Td.L l10 = Td.L.f17438a;
                    Trace.endSection();
                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                    if (objF != null) {
                        k10.f().q(objF, k10.d(jNanoTime2, k10.f().f(objF, 0L)));
                    }
                    k10.f6021c = k10.d(jNanoTime2, k10.e());
                } finally {
                }
            }
            if (!this.f26320i) {
                if (!this.f26318g) {
                    if (m10.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.f26319h = h();
                        this.f26318g = true;
                        Td.L l11 = Td.L.f17438a;
                    } finally {
                    }
                }
                C0454a c0454a = this.f26319h;
                if (c0454a != null ? c0454a.a(m10) : false) {
                    return true;
                }
            }
            if (!this.f26316e && !C5009b.p(this.f26313b)) {
                if (!i(m10, (objF == null || !this.f26314c.h().a(objF)) ? this.f26314c.g() : this.f26314c.h().d(objF))) {
                    return true;
                }
                K k11 = this.f26314c;
                long jNanoTime3 = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:measure");
                try {
                    g(this.f26313b);
                    Td.L l12 = Td.L.f17438a;
                    Trace.endSection();
                    long jNanoTime4 = System.nanoTime() - jNanoTime3;
                    if (objF != null) {
                        k11.h().q(objF, k11.d(jNanoTime4, k11.h().f(objF, 0L)));
                    }
                    k11.f6022d = k11.d(jNanoTime4, k11.g());
                } finally {
                }
            }
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.d.b
        public void cancel() {
            if (this.f26317f) {
                return;
            }
            this.f26317f = true;
            C.a aVar = this.f26315d;
            if (aVar != null) {
                aVar.dispose();
            }
            this.f26315d = null;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + this.f26312a + ", constraints = " + ((Object) C5009b.q(this.f26313b)) + ", isComposed = " + d() + ", isMeasured = " + this.f26316e + ", isCanceled = " + this.f26317f + " }";
        }

        private a(int i10, long j10, K k10) {
            this.f26312a = i10;
            this.f26313b = j10;
            this.f26314c = k10;
        }
    }

    public h(C1544o c1544o, C c10, N n10) {
        this.f26309a = c1544o;
        this.f26310b = c10;
        this.f26311c = n10;
    }

    public final L c(int i10, long j10, K k10) {
        return new a(this, i10, j10, k10, null);
    }

    public final d.b d(int i10, long j10, K k10) {
        a aVar = new a(this, i10, j10, k10, null);
        this.f26311c.a(aVar);
        return aVar;
    }
}
