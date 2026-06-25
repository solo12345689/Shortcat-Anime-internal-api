package l1;

import Td.L;
import android.util.Log;
import androidx.compose.ui.layout.AbstractC2679h;
import androidx.compose.ui.layout.s;
import i1.AbstractC5022o;
import i1.C5021n;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import s0.L1;
import t1.C6592e;

/* JADX INFO: renamed from: l1.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5528j {

    /* JADX INFO: renamed from: a */
    private static final boolean f52483a = false;

    /* JADX INFO: renamed from: l1.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        a() {
        }
    }

    /* JADX INFO: renamed from: l1.j$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ q1.h f52484a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q1.h hVar) {
            super(1);
            this.f52484a = hVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((androidx.compose.ui.graphics.g) obj);
            return L.f17438a;
        }

        public final void invoke(androidx.compose.ui.graphics.g gVar) {
            if (!Float.isNaN(this.f52484a.f56297f) || !Float.isNaN(this.f52484a.f56298g)) {
                gVar.t0(L1.a(Float.isNaN(this.f52484a.f56297f) ? 0.5f : this.f52484a.f56297f, Float.isNaN(this.f52484a.f56298g) ? 0.5f : this.f52484a.f56298g));
            }
            if (!Float.isNaN(this.f52484a.f56299h)) {
                gVar.s(this.f52484a.f56299h);
            }
            if (!Float.isNaN(this.f52484a.f56300i)) {
                gVar.t(this.f52484a.f56300i);
            }
            if (!Float.isNaN(this.f52484a.f56301j)) {
                gVar.w(this.f52484a.f56301j);
            }
            if (!Float.isNaN(this.f52484a.f56302k)) {
                gVar.F(this.f52484a.f56302k);
            }
            if (!Float.isNaN(this.f52484a.f56303l)) {
                gVar.g(this.f52484a.f56303l);
            }
            if (!Float.isNaN(this.f52484a.f56304m)) {
                gVar.v(this.f52484a.f56304m);
            }
            if (!Float.isNaN(this.f52484a.f56305n) || !Float.isNaN(this.f52484a.f56306o)) {
                gVar.l(Float.isNaN(this.f52484a.f56305n) ? 1.0f : this.f52484a.f56305n);
                gVar.y(Float.isNaN(this.f52484a.f56306o) ? 1.0f : this.f52484a.f56306o);
            }
            if (Float.isNaN(this.f52484a.f56307p)) {
                return;
            }
            gVar.e(this.f52484a.f56307p);
        }
    }

    public static final void c(C5515C c5515c, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            I0.A a10 = (I0.A) list.get(i10);
            Object objA = AbstractC2679h.a(a10);
            if (objA == null && (objA = AbstractC5531m.a(a10)) == null) {
                objA = d();
            }
            c5515c.s(objA.toString(), a10);
            Object objB = AbstractC5531m.b(a10);
            if (objB != null && (objB instanceof String) && (objA instanceof String)) {
                c5515c.y((String) objA, (String) objB);
            }
        }
    }

    public static final Object d() {
        return new a();
    }

    public static final void e(s.a aVar, androidx.compose.ui.layout.s sVar, q1.h hVar, long j10) {
        if (hVar.f56309r != 8) {
            if (hVar.d()) {
                s.a.U(aVar, sVar, AbstractC5022o.a(hVar.f56293b - C5021n.k(j10), hVar.f56294c - C5021n.l(j10)), 0.0f, 2, null);
                return;
            } else {
                aVar.q0(sVar, hVar.f56293b - C5021n.k(j10), hVar.f56294c - C5021n.l(j10), Float.isNaN(hVar.f56304m) ? 0.0f : hVar.f56304m, new b(hVar));
                return;
            }
        }
        if (f52483a) {
            Log.d("CCL", "Widget: " + hVar.c() + " is Gone. Skipping placement.");
        }
    }

    public static /* synthetic */ void f(s.a aVar, androidx.compose.ui.layout.s sVar, q1.h hVar, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = C5021n.f48560b.b();
        }
        e(aVar, sVar, hVar, j10);
    }

    public static final String g(C6592e c6592e) {
        return c6592e.t() + " width " + c6592e.V() + " minWidth " + c6592e.J() + " maxWidth " + c6592e.H() + " height " + c6592e.x() + " minHeight " + c6592e.I() + " maxHeight " + c6592e.G() + " HDB " + c6592e.A() + " VDB " + c6592e.S() + " MCW " + c6592e.f60397w + " MCH " + c6592e.f60399x + " percentW " + c6592e.f60319B + " percentH " + c6592e.f60325E;
    }
}
