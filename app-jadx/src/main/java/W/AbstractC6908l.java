package w;

import kotlin.jvm.internal.C5498l;

/* JADX INFO: renamed from: w.l */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6908l {
    public static final C6907k a(float f10, float f11, long j10, long j11, boolean z10) {
        return new C6907k(u0.f(C5498l.f52289a), Float.valueOf(f10), r.a(f11), j10, j11, z10);
    }

    public static final C6907k b(s0 s0Var, Object obj, Object obj2, long j10, long j11, boolean z10) {
        return new C6907k(s0Var, obj, (AbstractC6913q) s0Var.a().invoke(obj2), j10, j11, z10);
    }

    public static /* synthetic */ C6907k c(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 8) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return a(f10, f11, j10, j11, z10);
    }

    public static /* synthetic */ C6907k d(s0 s0Var, Object obj, Object obj2, long j10, long j11, boolean z10, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return b(s0Var, obj, obj2, j10, j11, z10);
    }

    public static final C6907k e(C6907k c6907k, float f10, float f11, long j10, long j11, boolean z10) {
        return new C6907k(c6907k.n(), Float.valueOf(f10), r.a(f11), j10, j11, z10);
    }

    public static final C6907k f(C6907k c6907k, Object obj, AbstractC6913q abstractC6913q, long j10, long j11, boolean z10) {
        return new C6907k(c6907k.n(), obj, abstractC6913q, j10, j11, z10);
    }

    public static /* synthetic */ C6907k g(C6907k c6907k, float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) c6907k.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((C6909m) c6907k.q()).f();
        }
        if ((i10 & 4) != 0) {
            j10 = c6907k.l();
        }
        if ((i10 & 8) != 0) {
            j11 = c6907k.i();
        }
        if ((i10 & 16) != 0) {
            z10 = c6907k.r();
        }
        boolean z11 = z10;
        long j12 = j11;
        return e(c6907k, f10, f11, j10, j12, z11);
    }

    public static /* synthetic */ C6907k h(C6907k c6907k, Object obj, AbstractC6913q abstractC6913q, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = c6907k.getValue();
        }
        if ((i10 & 2) != 0) {
            abstractC6913q = r.e(c6907k.q());
        }
        if ((i10 & 4) != 0) {
            j10 = c6907k.l();
        }
        if ((i10 & 8) != 0) {
            j11 = c6907k.i();
        }
        if ((i10 & 16) != 0) {
            z10 = c6907k.r();
        }
        boolean z11 = z10;
        long j12 = j11;
        return f(c6907k, obj, abstractC6913q, j10, j12, z11);
    }

    public static final AbstractC6913q i(s0 s0Var, Object obj) {
        AbstractC6913q abstractC6913q = (AbstractC6913q) s0Var.a().invoke(obj);
        abstractC6913q.d();
        return abstractC6913q;
    }
}
