package Pe;

import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import xe.C7140d;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ze.C7381o;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC7374h f13934a;

    /* JADX INFO: renamed from: b */
    private static final C2021f f13935b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13936a;

        static {
            int[] iArr = new int[EnumC2026k.values().length];
            try {
                iArr[EnumC2026k.f13899b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2026k.f13900c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13936a = iArr;
        }
    }

    static {
        Xe.c ENHANCED_NULLABILITY_ANNOTATION = He.I.f8465v;
        AbstractC5504s.g(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f13934a = new C2021f(ENHANCED_NULLABILITY_ANNOTATION);
        Xe.c ENHANCED_MUTABILITY_ANNOTATION = He.I.f8466w;
        AbstractC5504s.g(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f13935b = new C2021f(ENHANCED_MUTABILITY_ANNOTATION);
    }

    public static final InterfaceC7374h e(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new C7381o(AbstractC2279u.b1(list)) : (InterfaceC7374h) AbstractC2279u.M0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    public static final InterfaceC7230h f(InterfaceC7230h interfaceC7230h, C2023h c2023h, p0 p0Var) {
        C7140d c7140d = C7140d.f64395a;
        if (!q0.a(p0Var) || !(interfaceC7230h instanceof InterfaceC7227e)) {
            return null;
        }
        if (c2023h.e() == EnumC2024i.f13891a && p0Var == p0.f13925a) {
            InterfaceC7227e interfaceC7227e = (InterfaceC7227e) interfaceC7230h;
            if (c7140d.c(interfaceC7227e)) {
                return c7140d.a(interfaceC7227e);
            }
        }
        if (c2023h.e() == EnumC2024i.f13892b && p0Var == p0.f13926b) {
            InterfaceC7227e interfaceC7227e2 = (InterfaceC7227e) interfaceC7230h;
            if (c7140d.d(interfaceC7227e2)) {
                return c7140d.b(interfaceC7227e2);
            }
        }
        return null;
    }

    public static final InterfaceC7374h g() {
        return f13934a;
    }

    public static final Boolean h(C2023h c2023h, p0 p0Var) {
        if (!q0.a(p0Var)) {
            return null;
        }
        EnumC2026k enumC2026kF = c2023h.f();
        int i10 = enumC2026kF == null ? -1 : a.f13936a[enumC2026kF.ordinal()];
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(qf.S s10) {
        AbstractC5504s.h(s10, "<this>");
        return t0.c(rf.s.f58800a, s10);
    }
}
