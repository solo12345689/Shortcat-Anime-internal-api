package Y0;

import Gf.C1627p;
import Gf.InterfaceC1623n;
import ae.AbstractC2605b;
import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC5504s;
import z1.k;

/* JADX INFO: renamed from: Y0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2471f {

    /* JADX INFO: renamed from: Y0.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends k.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1623n f22658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f22659b;

        a(InterfaceC1623n interfaceC1623n, f0 f0Var) {
            this.f22658a = interfaceC1623n;
            this.f22659b = f0Var;
        }

        @Override // z1.k.e
        public void f(int i10) {
            this.f22658a.L(new IllegalStateException("Unable to load font " + this.f22659b + " (reason=" + i10 + ')'));
        }

        @Override // z1.k.e
        public void g(Typeface typeface) {
            this.f22658a.resumeWith(Td.u.b(typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(f0 f0Var, Context context) {
        Typeface typefaceH = z1.k.h(context, f0Var.d());
        AbstractC5504s.e(typefaceH);
        return typefaceH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(f0 f0Var, Context context, Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        z1.k.j(context, f0Var.d(), new a(c1627p, f0Var), null);
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }
}
