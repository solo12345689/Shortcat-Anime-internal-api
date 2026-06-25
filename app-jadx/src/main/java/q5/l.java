package q5;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import q5.C6116b;
import q5.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g.N element, int i10, boolean z10) {
        AbstractC5504s.h(element, "element");
        if (element instanceof g.C6134s) {
            return;
        }
        if (element instanceof g.L) {
            z10 = z10 || d((g.L) element);
            g.L l10 = (g.L) element;
            f(l10.f57312e, i10);
            f(l10.f57313f, i10);
            c(l10, i10, z10);
        }
        if (element instanceof g.J) {
            for (g.N n10 : ((g.J) element).g()) {
                AbstractC5504s.e(n10);
                a(n10, i10, z10);
            }
        }
    }

    public static final void b(g svg, int i10) {
        AbstractC5504s.h(svg, "svg");
        g.F fM = svg.m();
        List listD = svg.d();
        if (listD != null) {
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                f(((C6116b.p) it.next()).f57156b, i10);
            }
        }
        f(fM.f57312e, i10);
        f(fM.f57313f, i10);
        AbstractC5504s.e(fM);
        boolean zD = d(fM);
        for (g.N n10 : fM.f57298i) {
            AbstractC5504s.e(n10);
            a(n10, i10, zD);
        }
    }

    public static final void c(g.L element, int i10, boolean z10) {
        AbstractC5504s.h(element, "element");
        if (z10) {
            return;
        }
        g.E e10 = element.f57313f;
        if (e10 == null) {
            e10 = new g.E();
            element.f57313f = e10;
        }
        g.C6122f c6122f = new g.C6122f(i10);
        if ((element instanceof g.C6137v) || (element instanceof g.C6120d) || (element instanceof g.C6124i) || (element instanceof g.B) || (element instanceof g.C) || (element instanceof g.C6132q) || (element instanceof g.A) || (element instanceof g.C6141z)) {
            e10.f57232b = c6122f;
            e10.f57231a = 1L;
        } else if (element instanceof g.Z) {
            e10.f57245n = c6122f;
            e10.f57231a = 4096L;
        }
    }

    public static final boolean d(g.L element) {
        g.O o10;
        AbstractC5504s.h(element, "element");
        g.E e10 = element.f57313f;
        if (e10 == null && element.f57312e == null) {
            return false;
        }
        if (e10 != null && (e10.f57245n != null || e10.f57232b != null || (o10 = e10.f57235e) != null || o10 != null || e10.f57221C != null || e10.f57226H != null)) {
            return true;
        }
        g.E e11 = element.f57312e;
        if (e11 == null) {
            return false;
        }
        return (e11.f57245n == null && e11.f57232b == null && e11.f57235e == null && e11.f57228X == null && e11.f57221C == null && e11.f57226H == null) ? false : true;
    }

    public static final void e(g.O o10, int i10) {
        if (!(o10 instanceof g.C6122f) || o10 == g.C6122f.f57370c) {
            return;
        }
        ((g.C6122f) o10).f57371a = i10;
    }

    public static final void f(g.E e10, int i10) {
        if (e10 == null) {
            return;
        }
        e(e10.f57245n, i10);
        e(e10.f57232b, i10);
        e(e10.f57235e, i10);
        e(e10.f57221C, i10);
        e(e10.f57226H, i10);
        e(e10.f57228X, i10);
    }
}
