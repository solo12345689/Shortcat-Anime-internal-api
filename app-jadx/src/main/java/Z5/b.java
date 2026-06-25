package Z5;

import R5.c;
import V5.E;
import V5.F;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import y5.i;
import y5.k;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Y5.b f23180d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23177a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23178b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23179c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Y5.a f23181e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final R5.c f23182f = R5.c.a();

    public b(Y5.b bVar) {
        if (bVar != null) {
            p(bVar);
        }
    }

    private void a() {
        if (this.f23177a) {
            return;
        }
        this.f23182f.b(c.a.ON_ATTACH_CONTROLLER);
        this.f23177a = true;
        Y5.a aVar = this.f23181e;
        if (aVar == null || aVar.f() == null) {
            return;
        }
        this.f23181e.d();
    }

    private void b() {
        if (this.f23178b && this.f23179c) {
            a();
        } else {
            d();
        }
    }

    public static b c(Y5.b bVar, Context context) {
        b bVar2 = new b(bVar);
        bVar2.m(context);
        return bVar2;
    }

    private void d() {
        if (this.f23177a) {
            this.f23182f.b(c.a.ON_DETACH_CONTROLLER);
            this.f23177a = false;
            if (h()) {
                this.f23181e.e();
            }
        }
    }

    private void q(F f10) {
        Object objG = g();
        if (objG instanceof E) {
            ((E) objG).d(f10);
        }
    }

    public Y5.a e() {
        return this.f23181e;
    }

    public Y5.b f() {
        return (Y5.b) k.g(this.f23180d);
    }

    public Drawable g() {
        Y5.b bVar = this.f23180d;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public boolean h() {
        Y5.a aVar = this.f23181e;
        return aVar != null && aVar.f() == this.f23180d;
    }

    public void i() {
        this.f23182f.b(c.a.ON_HOLDER_ATTACH);
        this.f23178b = true;
        b();
    }

    public void j() {
        this.f23182f.b(c.a.ON_HOLDER_DETACH);
        this.f23178b = false;
        b();
    }

    public boolean k(MotionEvent motionEvent) {
        if (h()) {
            return this.f23181e.b(motionEvent);
        }
        return false;
    }

    @Override // V5.F
    public void l(boolean z10) {
        if (this.f23179c == z10) {
            return;
        }
        this.f23182f.b(z10 ? c.a.ON_DRAWABLE_SHOW : c.a.ON_DRAWABLE_HIDE);
        this.f23179c = z10;
        b();
    }

    public void n() {
        o(null);
    }

    public void o(Y5.a aVar) {
        boolean z10 = this.f23177a;
        if (z10) {
            d();
        }
        if (h()) {
            this.f23182f.b(c.a.ON_CLEAR_OLD_CONTROLLER);
            this.f23181e.g(null);
        }
        this.f23181e = aVar;
        if (aVar != null) {
            this.f23182f.b(c.a.ON_SET_CONTROLLER);
            this.f23181e.g(this.f23180d);
        } else {
            this.f23182f.b(c.a.ON_CLEAR_CONTROLLER);
        }
        if (z10) {
            a();
        }
    }

    @Override // V5.F
    public void onDraw() {
        if (this.f23177a) {
            return;
        }
        AbstractC7283a.G(R5.c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f23181e)), toString());
        this.f23178b = true;
        this.f23179c = true;
        b();
    }

    public void p(Y5.b bVar) {
        this.f23182f.b(c.a.ON_SET_HIERARCHY);
        boolean zH = h();
        q(null);
        Y5.b bVar2 = (Y5.b) k.g(bVar);
        this.f23180d = bVar2;
        Drawable drawableD = bVar2.d();
        l(drawableD == null || drawableD.isVisible());
        q(this);
        if (zH) {
            this.f23181e.g(bVar);
        }
    }

    public String toString() {
        return i.b(this).c("controllerAttached", this.f23177a).c("holderAttached", this.f23178b).c("drawableVisible", this.f23179c).b("events", this.f23182f.toString()).toString();
    }

    public void m(Context context) {
    }
}
