package Wf;

import Td.C2160k;
import Xf.C2387y;
import Xf.X;
import Xf.a0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: a */
    private static final Tf.e f20938a = Vf.G.a("kotlinx.serialization.json.JsonUnquotedLiteral", Sf.a.F(U.f52264a));

    public static final E a(Boolean bool) {
        return bool == null ? z.INSTANCE : new v(bool, false, null, 4, null);
    }

    public static final E b(Number number) {
        return number == null ? z.INSTANCE : new v(number, false, null, 4, null);
    }

    public static final E c(String str) {
        return str == null ? z.INSTANCE : new v(str, true, null, 4, null);
    }

    private static final Void d(i iVar, String str) {
        throw new IllegalArgumentException("Element " + O.b(iVar.getClass()) + " is not a " + str);
    }

    public static final Boolean e(E e10) {
        AbstractC5504s.h(e10, "<this>");
        return a0.d(e10.b());
    }

    public static final String f(E e10) {
        AbstractC5504s.h(e10, "<this>");
        if (e10 instanceof z) {
            return null;
        }
        return e10.b();
    }

    public static final double g(E e10) {
        AbstractC5504s.h(e10, "<this>");
        return Double.parseDouble(e10.b());
    }

    public static final Double h(E e10) {
        AbstractC5504s.h(e10, "<this>");
        return Df.r.o(e10.b());
    }

    public static final float i(E e10) {
        AbstractC5504s.h(e10, "<this>");
        return Float.parseFloat(e10.b());
    }

    public static final Float j(E e10) {
        AbstractC5504s.h(e10, "<this>");
        return Df.r.p(e10.b());
    }

    public static final int k(E e10) {
        AbstractC5504s.h(e10, "<this>");
        try {
            long jM = new X(e10.b()).m();
            if (-2147483648L <= jM && jM <= 2147483647L) {
                return (int) jM;
            }
            throw new NumberFormatException(e10.b() + " is not an Int");
        } catch (C2387y e11) {
            throw new NumberFormatException(e11.getMessage());
        }
    }

    public static final Integer l(E e10) {
        Long lValueOf;
        AbstractC5504s.h(e10, "<this>");
        try {
            lValueOf = Long.valueOf(new X(e10.b()).m());
        } catch (C2387y unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final C2359c m(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        C2359c c2359c = iVar instanceof C2359c ? (C2359c) iVar : null;
        if (c2359c != null) {
            return c2359c;
        }
        d(iVar, "JsonArray");
        throw new C2160k();
    }

    public static final C n(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        C c10 = iVar instanceof C ? (C) iVar : null;
        if (c10 != null) {
            return c10;
        }
        d(iVar, "JsonObject");
        throw new C2160k();
    }

    public static final E o(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        E e10 = iVar instanceof E ? (E) iVar : null;
        if (e10 != null) {
            return e10;
        }
        d(iVar, "JsonPrimitive");
        throw new C2160k();
    }

    public static final Tf.e p() {
        return f20938a;
    }

    public static final long q(E e10) {
        AbstractC5504s.h(e10, "<this>");
        try {
            return new X(e10.b()).m();
        } catch (C2387y e11) {
            throw new NumberFormatException(e11.getMessage());
        }
    }

    public static final Long r(E e10) {
        AbstractC5504s.h(e10, "<this>");
        try {
            return Long.valueOf(new X(e10.b()).m());
        } catch (C2387y unused) {
            return null;
        }
    }
}
