package G4;

import Gf.C0;
import H4.c;
import L4.t;
import Ud.AbstractC2273n;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.AbstractC2857k;
import kotlin.jvm.internal.AbstractC5504s;
import v4.InterfaceC6845d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6845d f7373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f7374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L4.n f7375c;

    public p(InterfaceC6845d interfaceC6845d, t tVar, L4.r rVar) {
        this.f7373a = interfaceC6845d;
        this.f7374b = tVar;
        this.f7375c = L4.f.a(rVar);
    }

    private final boolean d(h hVar, H4.h hVar2) {
        if (L4.a.d(hVar.j())) {
            return c(hVar, hVar.j()) && this.f7375c.a(hVar2);
        }
        return true;
    }

    private final boolean e(h hVar) {
        return hVar.O().isEmpty() || AbstractC2273n.R(L4.j.n(), hVar.j());
    }

    public final boolean a(m mVar) {
        return !L4.a.d(mVar.f()) || this.f7375c.b();
    }

    public final f b(h hVar, Throwable th2) {
        Drawable drawableT;
        if (!(th2 instanceof k) || (drawableT = hVar.u()) == null) {
            drawableT = hVar.t();
        }
        return new f(drawableT, hVar, th2);
    }

    public final boolean c(h hVar, Bitmap.Config config) {
        if (!L4.a.d(config)) {
            return true;
        }
        if (!hVar.h()) {
            return false;
        }
        hVar.M();
        return true;
    }

    public final m f(h hVar, H4.h hVar2) {
        Bitmap.Config configJ = (e(hVar) && d(hVar, hVar2)) ? hVar.j() : Bitmap.Config.ARGB_8888;
        b bVarD = this.f7374b.b() ? hVar.D() : b.DISABLED;
        H4.c cVarB = hVar2.b();
        c.b bVar = c.b.f7910a;
        return new m(hVar.l(), configJ, hVar.k(), hVar2, (AbstractC5504s.c(cVarB, bVar) || AbstractC5504s.c(hVar2.a(), bVar)) ? H4.g.FIT : hVar.J(), L4.i.a(hVar), hVar.i() && hVar.O().isEmpty() && configJ != Bitmap.Config.ALPHA_8, hVar.I(), hVar.r(), hVar.x(), hVar.L(), hVar.E(), hVar.C(), hVar.s(), bVarD);
    }

    public final o g(h hVar, C0 c02) {
        AbstractC2857k abstractC2857kZ = hVar.z();
        hVar.M();
        return new a(abstractC2857kZ, c02);
    }
}
