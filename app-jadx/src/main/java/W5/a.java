package W5;

import V5.C2315f;
import V5.InterfaceC2312c;
import V5.g;
import V5.o;
import V5.q;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements Y5.c {

    /* JADX INFO: renamed from: a */
    private final Drawable f20734a;

    /* JADX INFO: renamed from: b */
    private final Resources f20735b;

    /* JADX INFO: renamed from: c */
    private d f20736c;

    /* JADX INFO: renamed from: d */
    private final c f20737d;

    /* JADX INFO: renamed from: e */
    private final C2315f f20738e;

    /* JADX INFO: renamed from: f */
    private final g f20739f;

    a(b bVar) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f20734a = colorDrawable;
        if (L6.b.d()) {
            L6.b.a("GenericDraweeHierarchy()");
        }
        this.f20735b = bVar.o();
        this.f20736c = bVar.r();
        g gVar = new g(colorDrawable);
        this.f20739f = gVar;
        int i10 = 1;
        int size = bVar.i() != null ? bVar.i().size() : 1;
        int i11 = (size == 0 ? 1 : size) + (bVar.l() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i11 + 6];
        drawableArr[0] = h(bVar.e(), null);
        drawableArr[1] = h(bVar.j(), bVar.k());
        drawableArr[2] = g(gVar, bVar.d(), bVar.c(), bVar.b());
        drawableArr[3] = h(bVar.m(), bVar.n());
        drawableArr[4] = h(bVar.p(), bVar.q());
        drawableArr[5] = h(bVar.g(), bVar.h());
        if (i11 > 0) {
            if (bVar.i() != null) {
                Iterator it = bVar.i().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    drawableArr[i10 + 6] = h((Drawable) it.next(), null);
                    i10++;
                }
            }
            if (bVar.l() != null) {
                drawableArr[i10 + 6] = h(bVar.l(), null);
            }
        }
        C2315f c2315f = new C2315f(drawableArr, false, 2);
        this.f20738e = c2315f;
        c2315f.u(bVar.f());
        c cVar = new c(e.e(c2315f, this.f20736c));
        this.f20737d = cVar;
        cVar.mutate();
        s();
        if (L6.b.d()) {
            L6.b.b();
        }
    }

    private Drawable g(Drawable drawable, q qVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return e.g(drawable, qVar, pointF);
    }

    private Drawable h(Drawable drawable, q qVar) {
        return e.f(e.d(drawable, this.f20736c, this.f20735b), qVar);
    }

    private void i(int i10) {
        if (i10 >= 0) {
            this.f20738e.k(i10);
        }
    }

    private void j() {
        k(1);
        k(2);
        k(3);
        k(4);
        k(5);
    }

    private void k(int i10) {
        if (i10 >= 0) {
            this.f20738e.m(i10);
        }
    }

    private InterfaceC2312c n(int i10) {
        InterfaceC2312c interfaceC2312cC = this.f20738e.c(i10);
        interfaceC2312cC.b();
        return interfaceC2312cC.b() instanceof o ? (o) interfaceC2312cC.b() : interfaceC2312cC;
    }

    private o p(int i10) {
        InterfaceC2312c interfaceC2312cN = n(i10);
        return interfaceC2312cN instanceof o ? (o) interfaceC2312cN : e.k(interfaceC2312cN, q.f19901a);
    }

    private boolean q(int i10) {
        return n(i10) instanceof o;
    }

    private void r() {
        this.f20739f.i(this.f20734a);
    }

    private void s() {
        C2315f c2315f = this.f20738e;
        if (c2315f != null) {
            c2315f.g();
            this.f20738e.j();
            j();
            i(1);
            this.f20738e.n();
            this.f20738e.i();
        }
    }

    private void u(int i10, Drawable drawable) {
        if (drawable == null) {
            this.f20738e.e(i10, null);
        } else {
            n(i10).i(e.d(drawable, this.f20736c, this.f20735b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x(float f10) {
        Drawable drawableB = this.f20738e.b(3);
        if (drawableB == 0) {
            return;
        }
        if (f10 >= 0.999f) {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).stop();
            }
            k(3);
        } else {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).start();
            }
            i(3);
        }
        drawableB.setLevel(Math.round(f10 * 10000.0f));
    }

    @Override // Y5.c
    public void a(Throwable th2) {
        this.f20738e.g();
        j();
        if (this.f20738e.b(4) != null) {
            i(4);
        } else {
            i(1);
        }
        this.f20738e.i();
    }

    @Override // Y5.c
    public void b(Throwable th2) {
        this.f20738e.g();
        j();
        if (this.f20738e.b(5) != null) {
            i(5);
        } else {
            i(1);
        }
        this.f20738e.i();
    }

    @Override // Y5.c
    public void c(float f10, boolean z10) {
        if (this.f20738e.b(3) == null) {
            return;
        }
        this.f20738e.g();
        x(f10);
        if (z10) {
            this.f20738e.n();
        }
        this.f20738e.i();
    }

    @Override // Y5.b
    public Drawable d() {
        return this.f20737d;
    }

    @Override // Y5.c
    public void e(Drawable drawable, float f10, boolean z10) {
        Drawable drawableD = e.d(drawable, this.f20736c, this.f20735b);
        drawableD.mutate();
        this.f20739f.i(drawableD);
        this.f20738e.g();
        j();
        i(2);
        x(f10);
        if (z10) {
            this.f20738e.n();
        }
        this.f20738e.i();
    }

    @Override // Y5.c
    public void f(Drawable drawable) {
        this.f20737d.x(drawable);
    }

    @Override // Y5.b
    public Rect getBounds() {
        return this.f20737d.getBounds();
    }

    public PointF l() {
        if (q(2)) {
            return p(2).z();
        }
        return null;
    }

    public q m() {
        if (q(2)) {
            return p(2).A();
        }
        return null;
    }

    public d o() {
        return this.f20736c;
    }

    @Override // Y5.c
    public void reset() {
        r();
        s();
    }

    public void t(q qVar) {
        k.g(qVar);
        p(2).C(qVar);
    }

    public void v(int i10) {
        this.f20738e.u(i10);
    }

    public void w(Drawable drawable, q qVar) {
        u(1, drawable);
        p(1).C(qVar);
    }

    public void y(Drawable drawable) {
        u(3, drawable);
    }

    public void z(d dVar) {
        this.f20736c = dVar;
        e.j(this.f20737d, dVar);
        for (int i10 = 0; i10 < this.f20738e.d(); i10++) {
            e.i(n(i10), this.f20736c, this.f20735b);
        }
    }
}
