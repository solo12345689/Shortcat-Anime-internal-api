package He;

import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import yf.AbstractC7248a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class N {
    public static final List a(Xe.f name) {
        AbstractC5504s.h(name, "name");
        String strB = name.b();
        AbstractC5504s.g(strB, "asString(...)");
        return H.c(strB) ? AbstractC2279u.q(b(name)) : H.d(strB) ? f(name) : C1663j.f8561a.b(name);
    }

    public static final Xe.f b(Xe.f methodName) {
        AbstractC5504s.h(methodName, "methodName");
        Xe.f fVarE = e(methodName, com.amazon.a.a.o.b.au, false, null, 12, null);
        return fVarE == null ? e(methodName, "is", false, null, 8, null) : fVarE;
    }

    public static final Xe.f c(Xe.f methodName, boolean z10) {
        AbstractC5504s.h(methodName, "methodName");
        return e(methodName, "set", false, z10 ? "is" : null, 4, null);
    }

    private static final Xe.f d(Xe.f fVar, String str, boolean z10, String str2) {
        if (fVar.n()) {
            return null;
        }
        String strH = fVar.h();
        AbstractC5504s.g(strH, "getIdentifier(...)");
        if (!Df.r.Q(strH, str, false, 2, null) || strH.length() == str.length()) {
            return null;
        }
        char cCharAt = strH.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return Xe.f.m(str2 + Df.r.C0(strH, str));
        }
        if (!z10) {
            return fVar;
        }
        String strC = AbstractC7248a.c(Df.r.C0(strH, str), true);
        if (Xe.f.p(strC)) {
            return Xe.f.m(strC);
        }
        return null;
    }

    static /* synthetic */ Xe.f e(Xe.f fVar, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z10, str2);
    }

    public static final List f(Xe.f methodName) {
        AbstractC5504s.h(methodName, "methodName");
        return AbstractC2279u.r(c(methodName, false), c(methodName, true));
    }
}
