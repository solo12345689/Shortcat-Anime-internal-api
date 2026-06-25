package j1;

import Td.L;
import i1.AbstractC5020m;
import t.j0;

/* JADX INFO: renamed from: j1.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5327b {

    /* JADX INFO: renamed from: a */
    public static final C5327b f51588a;

    /* JADX INFO: renamed from: b */
    private static final float[] f51589b;

    /* JADX INFO: renamed from: c */
    private static volatile j0 f51590c;

    /* JADX INFO: renamed from: d */
    private static final Object[] f51591d;

    /* JADX INFO: renamed from: e */
    public static final int f51592e;

    static {
        C5327b c5327b = new C5327b();
        f51588a = c5327b;
        f51589b = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        f51590c = new j0(0, 1, null);
        Object[] objArr = new Object[0];
        f51591d = objArr;
        synchronized (objArr) {
            c5327b.h(f51590c, 1.15f, new C5328c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            c5327b.h(f51590c, 1.3f, new C5328c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            c5327b.h(f51590c, 1.5f, new C5328c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            c5327b.h(f51590c, 1.8f, new C5328c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            c5327b.h(f51590c, 2.0f, new C5328c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            L l10 = L.f17438a;
        }
        if (!(c5327b.e(f51590c.i(0)) - 0.01f > 1.03f)) {
            AbstractC5020m.b("You should only apply non-linear scaling to font scales > 1");
        }
        f51592e = 8;
    }

    private C5327b() {
    }

    private final InterfaceC5326a a(InterfaceC5326a interfaceC5326a, InterfaceC5326a interfaceC5326a2, float f10) {
        float[] fArr = f51589b;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = f51589b[i10];
            fArr2[i10] = C5329d.f51597a.b(interfaceC5326a.b(f11), interfaceC5326a2.b(f11), f10);
        }
        return new C5328c(f51589b, fArr2);
    }

    private final InterfaceC5326a c(float f10) {
        return (InterfaceC5326a) f51590c.f(d(f10));
    }

    private final int d(float f10) {
        return (int) (f10 * 100.0f);
    }

    private final float e(int i10) {
        return i10 / 100.0f;
    }

    private final void g(float f10, InterfaceC5326a interfaceC5326a) {
        synchronized (f51591d) {
            j0 j0VarClone = f51590c.clone();
            f51588a.h(j0VarClone, f10, interfaceC5326a);
            f51590c = j0VarClone;
            L l10 = L.f17438a;
        }
    }

    private final void h(j0 j0Var, float f10, InterfaceC5326a interfaceC5326a) {
        j0Var.j(d(f10), interfaceC5326a);
    }

    public final InterfaceC5326a b(float f10) {
        InterfaceC5326a c5328c;
        if (!f(f10)) {
            return null;
        }
        InterfaceC5326a interfaceC5326aC = f51588a.c(f10);
        if (interfaceC5326aC != null) {
            return interfaceC5326aC;
        }
        int iG = f51590c.g(d(f10));
        if (iG >= 0) {
            return (InterfaceC5326a) f51590c.n(iG);
        }
        int i10 = -(iG + 1);
        int i11 = i10 - 1;
        float fE = 1.0f;
        if (i10 >= f51590c.m()) {
            C5328c c5328c2 = new C5328c(new float[]{1.0f}, new float[]{f10});
            g(f10, c5328c2);
            return c5328c2;
        }
        if (i11 < 0) {
            float[] fArr = f51589b;
            c5328c = new C5328c(fArr, fArr);
        } else {
            fE = e(f51590c.i(i11));
            c5328c = (InterfaceC5326a) f51590c.n(i11);
        }
        InterfaceC5326a interfaceC5326aA = a(c5328c, (InterfaceC5326a) f51590c.n(i10), C5329d.f51597a.a(0.0f, 1.0f, fE, e(f51590c.i(i10)), f10));
        g(f10, interfaceC5326aA);
        return interfaceC5326aA;
    }

    public final boolean f(float f10) {
        return f10 >= 1.03f;
    }
}
