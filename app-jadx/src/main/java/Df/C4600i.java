package df;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.S;
import ye.H;

/* JADX INFO: renamed from: df.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4600i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4600i f45156a = new C4600i();

    private C4600i() {
    }

    private final C4593b c(List list, H h10, ve.l lVar) {
        List listB1 = AbstractC2279u.b1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            AbstractC4598g abstractC4598gF = f(this, it.next(), null, 2, null);
            if (abstractC4598gF != null) {
                arrayList.add(abstractC4598gF);
            }
        }
        if (h10 == null) {
            return new C4593b(arrayList, new C4599h(lVar));
        }
        AbstractC6183d0 abstractC6183d0P = h10.n().P(lVar);
        AbstractC5504s.g(abstractC6183d0P, "getPrimitiveArrayKotlinType(...)");
        return new C4617z(arrayList, abstractC6183d0P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S d(ve.l lVar, H it) {
        AbstractC5504s.h(it, "it");
        AbstractC6183d0 abstractC6183d0P = it.n().P(lVar);
        AbstractC5504s.g(abstractC6183d0P, "getPrimitiveArrayKotlinType(...)");
        return abstractC6183d0P;
    }

    public static /* synthetic */ AbstractC4598g f(C4600i c4600i, Object obj, H h10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            h10 = null;
        }
        return c4600i.e(obj, h10);
    }

    public final C4593b b(List value, S type) {
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(type, "type");
        return new C4617z(value, type);
    }

    public final AbstractC4598g e(Object obj, H h10) {
        if (obj instanceof Byte) {
            return new C4595d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C4614w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C4605n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C4611t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C4596e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C4604m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C4601j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C4594c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C4615x((String) obj);
        }
        if (obj instanceof byte[]) {
            return c(AbstractC2273n.P0((byte[]) obj), h10, ve.l.f62121i);
        }
        if (obj instanceof short[]) {
            return c(AbstractC2273n.W0((short[]) obj), h10, ve.l.f62122j);
        }
        if (obj instanceof int[]) {
            return c(AbstractC2273n.T0((int[]) obj), h10, ve.l.f62123k);
        }
        if (obj instanceof long[]) {
            return c(AbstractC2273n.U0((long[]) obj), h10, ve.l.f62125m);
        }
        if (obj instanceof char[]) {
            return c(AbstractC2273n.Q0((char[]) obj), h10, ve.l.f62120h);
        }
        if (obj instanceof float[]) {
            return c(AbstractC2273n.S0((float[]) obj), h10, ve.l.f62124l);
        }
        if (obj instanceof double[]) {
            return c(AbstractC2273n.R0((double[]) obj), h10, ve.l.f62126n);
        }
        if (obj instanceof boolean[]) {
            return c(AbstractC2273n.X0((boolean[]) obj), h10, ve.l.f62119g);
        }
        if (obj == null) {
            return new C4612u();
        }
        return null;
    }
}
