package d1;

import Y.h2;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import g1.C4831k;
import kotlin.jvm.internal.AbstractC5504s;
import r0.C6230l;
import s0.A1;
import s0.AbstractC6358h0;
import s0.AbstractC6371l1;
import s0.AbstractC6387s0;
import s0.C1;
import s0.C6385r0;
import s0.InterfaceC6368k1;
import s0.Q;
import u0.AbstractC6712g;
import u0.C6715j;
import u0.C6716k;
import u0.InterfaceC6711f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC6368k1 f44955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4831k f44956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1 f44958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C6385r0 f44959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AbstractC6358h0 f44960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h2 f44961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C6230l f44962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbstractC6712g f44963i;

    public i(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.f44956b = C4831k.f47287b.c();
        this.f44957c = InterfaceC6711f.f61110j0.a();
        this.f44958d = C1.f58867d.a();
    }

    private final void b() {
        this.f44961g = null;
        this.f44960f = null;
        this.f44962h = null;
        setShader(null);
    }

    private final InterfaceC6368k1 d() {
        InterfaceC6368k1 interfaceC6368k1 = this.f44955a;
        if (interfaceC6368k1 != null) {
            return interfaceC6368k1;
        }
        InterfaceC6368k1 interfaceC6368k1B = Q.b(this);
        this.f44955a = interfaceC6368k1B;
        return interfaceC6368k1B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader g(AbstractC6358h0 abstractC6358h0, long j10) {
        return ((A1) abstractC6358h0).mo483createShaderuvyYCjk(j10);
    }

    public final int c() {
        return this.f44957c;
    }

    public final void e(int i10) {
        if (androidx.compose.ui.graphics.c.G(i10, this.f44957c)) {
            return;
        }
        d().c(i10);
        this.f44957c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(final s0.AbstractC6358h0 r5, final long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L6
            r4.b()
            return
        L6:
            boolean r0 = r5 instanceof s0.F1
            if (r0 == 0) goto L18
            s0.F1 r5 = (s0.F1) r5
            long r5 = r5.a()
            long r5 = g1.AbstractC4833m.c(r5, r8)
            r4.h(r5)
            return
        L18:
            boolean r0 = r5 instanceof s0.A1
            if (r0 == 0) goto L6e
            s0.h0 r0 = r4.f44960f
            boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r0, r5)
            r1 = 0
            if (r0 == 0) goto L35
            r0.l r0 = r4.f44962h
            if (r0 != 0) goto L2b
            r0 = r1
            goto L33
        L2b:
            long r2 = r0.m()
            boolean r0 = r0.C6230l.f(r2, r6)
        L33:
            if (r0 != 0) goto L54
        L35:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L3f
            r1 = 1
        L3f:
            if (r1 == 0) goto L54
            r4.f44960f = r5
            r0.l r0 = r0.C6230l.c(r6)
            r4.f44962h = r0
            d1.h r0 = new d1.h
            r0.<init>()
            Y.h2 r5 = Y.U1.d(r0)
            r4.f44961g = r5
        L54:
            s0.k1 r5 = r4.d()
            Y.h2 r6 = r4.f44961g
            r7 = 0
            if (r6 == 0) goto L64
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L65
        L64:
            r6 = r7
        L65:
            r5.v(r6)
            r4.f44959e = r7
            d1.j.a(r4, r8)
            return
        L6e:
            Td.r r5 = new Td.r
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.i.f(s0.h0, long, float):void");
    }

    public final void h(long j10) {
        C6385r0 c6385r0 = this.f44959e;
        if (c6385r0 == null ? false : C6385r0.s(c6385r0.A(), j10)) {
            return;
        }
        if (j10 != 16) {
            this.f44959e = C6385r0.m(j10);
            setColor(AbstractC6387s0.k(j10));
            b();
        }
    }

    public final void i(AbstractC6712g abstractC6712g) {
        if (abstractC6712g == null || AbstractC5504s.c(this.f44963i, abstractC6712g)) {
            return;
        }
        this.f44963i = abstractC6712g;
        if (AbstractC5504s.c(abstractC6712g, C6715j.f61115a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(abstractC6712g instanceof C6716k)) {
            throw new Td.r();
        }
        d().z(AbstractC6371l1.f58959a.b());
        C6716k c6716k = (C6716k) abstractC6712g;
        d().A(c6716k.f());
        d().x(c6716k.d());
        d().o(c6716k.c());
        d().l(c6716k.b());
        InterfaceC6368k1 interfaceC6368k1D = d();
        c6716k.e();
        interfaceC6368k1D.t(null);
    }

    public final void j(C1 c12) {
        if (c12 == null || AbstractC5504s.c(this.f44958d, c12)) {
            return;
        }
        this.f44958d = c12;
        if (AbstractC5504s.c(c12, C1.f58867d.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(e1.e.b(this.f44958d.b()), Float.intBitsToFloat((int) (this.f44958d.d() >> 32)), Float.intBitsToFloat((int) (this.f44958d.d() & 4294967295L)), AbstractC6387s0.k(this.f44958d.c()));
        }
    }

    public final void k(C4831k c4831k) {
        if (c4831k == null || AbstractC5504s.c(this.f44956b, c4831k)) {
            return;
        }
        this.f44956b = c4831k;
        C4831k.a aVar = C4831k.f47287b;
        setUnderlineText(c4831k.d(aVar.d()));
        setStrikeThruText(this.f44956b.d(aVar.b()));
    }
}
