package w;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final C6909m a(float f10) {
        return new C6909m(f10);
    }

    public static final C6910n b(float f10, float f11) {
        return new C6910n(f10, f11);
    }

    public static final C6911o c(float f10, float f11, float f12) {
        return new C6911o(f10, f11, f12);
    }

    public static final C6912p d(float f10, float f11, float f12, float f13) {
        return new C6912p(f10, f11, f12, f13);
    }

    public static final AbstractC6913q e(AbstractC6913q abstractC6913q) {
        AbstractC6913q abstractC6913qG = g(abstractC6913q);
        int iB = abstractC6913qG.b();
        for (int i10 = 0; i10 < iB; i10++) {
            abstractC6913qG.e(i10, abstractC6913q.a(i10));
        }
        return abstractC6913qG;
    }

    public static final void f(AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2) {
        int iB = abstractC6913q.b();
        for (int i10 = 0; i10 < iB; i10++) {
            abstractC6913q.e(i10, abstractC6913q2.a(i10));
        }
    }

    public static final AbstractC6913q g(AbstractC6913q abstractC6913q) {
        AbstractC6913q abstractC6913qC = abstractC6913q.c();
        AbstractC5504s.f(abstractC6913qC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return abstractC6913qC;
    }
}
