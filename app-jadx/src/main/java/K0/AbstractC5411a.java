package k0;

import Y.AbstractC2411h0;
import Y.C2392b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: k0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5411a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f51971a = new ArrayList();

    private final void a(AbstractC2411h0 abstractC2411h0, Object obj) {
        C5413c c5413cB = b(abstractC2411h0, obj);
        if (c5413cB != null) {
            this.f51971a.add(c5413cB);
        }
    }

    private final C5413c b(AbstractC2411h0 abstractC2411h0, Object obj) {
        String strG = abstractC2411h0.g();
        C5433w c5433wE = strG != null ? AbstractC5434x.e(strG) : null;
        if (c5433wE == null) {
            return null;
        }
        if (obj == null) {
            return new C5413c(c5433wE, null);
        }
        ArrayList arrayListE = abstractC2411h0.e();
        if (arrayListE != null) {
            int size = arrayListE.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = arrayListE.get(i10);
                if (AbstractC5504s.c(obj2, obj)) {
                    break;
                }
                h(obj2);
            }
        }
        return new C5413c(c5433wE, 0);
    }

    private final boolean c(AbstractC2411h0 abstractC2411h0, Object obj) {
        ArrayList arrayListE = abstractC2411h0.e();
        boolean z10 = false;
        if (arrayListE == null) {
            if (!abstractC2411h0.b()) {
                a(abstractC2411h0, null);
                return true;
            }
            int iD = abstractC2411h0.d();
            int iC = abstractC2411h0.c();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int iIntValue = number.intValue();
                if ((iD <= iIntValue && iIntValue < iC) || (iD == iC && iD == number.intValue())) {
                    z10 = true;
                }
                if (z10) {
                    a(abstractC2411h0, null);
                }
            }
            return z10;
        }
        int size = arrayListE.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayListE.get(i10);
            if (obj2 instanceof C2392b) {
                if (AbstractC5504s.c(obj2, obj)) {
                    a(abstractC2411h0, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof AbstractC2411h0)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (c((AbstractC2411h0) obj2, obj)) {
                    a(abstractC2411h0, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean e(AbstractC2411h0 abstractC2411h0) {
        String strG = abstractC2411h0.g();
        return strG != null && Df.r.Q(strG, "C", false, 2, null);
    }

    private final AbstractC2411h0 h(Object obj) {
        if (obj instanceof C2392b) {
            return g((C2392b) obj);
        }
        if (obj instanceof AbstractC2411h0) {
            return (AbstractC2411h0) obj;
        }
        throw new IllegalStateException(("Unexpected child source info " + obj).toString());
    }

    public abstract int d(C2392b c2392b);

    public abstract AbstractC2411h0 g(C2392b c2392b);

    public final List i() {
        return this.f51971a;
    }

    public final void f(AbstractC2411h0 abstractC2411h0, Object obj) {
    }
}
