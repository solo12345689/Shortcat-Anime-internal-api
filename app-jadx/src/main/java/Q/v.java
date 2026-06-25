package Q;

import g1.EnumC4829i;
import i1.C5015h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.AbstractC6225g;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f14197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f14198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final R0.B f14199c = new R0.B("SelectionHandleInfo", (Function2) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));

    static {
        float f10 = 25;
        f14197a = C5015h.n(f10);
        f14198b = C5015h.n(f10);
    }

    public static final long a(long j10) {
        return AbstractC6225g.a(C6224f.m(j10), C6224f.n(j10) - 1.0f);
    }

    public static final float b() {
        return f14198b;
    }

    public static final float c() {
        return f14197a;
    }

    public static final R0.B d() {
        return f14199c;
    }

    public static final boolean e(EnumC4829i enumC4829i, boolean z10) {
        if (enumC4829i != EnumC4829i.f47274a || z10) {
            return enumC4829i == EnumC4829i.f47275b && z10;
        }
        return true;
    }

    public static final boolean f(boolean z10, EnumC4829i enumC4829i, boolean z11) {
        return z10 ? e(enumC4829i, z11) : !e(enumC4829i, z11);
    }
}
