package Ud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import oe.C5870f;

/* JADX INFO: renamed from: Ud.w */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2281w extends AbstractC2280v {
    public static ArrayList g(Object... elements) {
        AbstractC5504s.h(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C2271l(elements, true));
    }

    public static final Collection h(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        return new C2271l(objArr, false);
    }

    public static final int i(List list, int i10, int i11, Function1 comparison) {
        AbstractC5504s.h(list, "<this>");
        AbstractC5504s.h(comparison, "comparison");
        u(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iIntValue = ((Number) comparison.invoke(list.get(i13))).intValue();
            if (iIntValue < 0) {
                i10 = i13 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int j(List list, Comparable comparable, int i10, int i11) {
        AbstractC5504s.h(list, "<this>");
        u(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iD = Xd.a.d((Comparable) list.get(i13), comparable);
            if (iD < 0) {
                i10 = i13 + 1;
            } else {
                if (iD <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int k(List list, int i10, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return i(list, i10, i11, function1);
    }

    public static /* synthetic */ int l(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return j(list, comparable, i10, i11);
    }

    public static List m() {
        return H.f19485a;
    }

    public static C5870f n(Collection collection) {
        AbstractC5504s.h(collection, "<this>");
        return new C5870f(0, collection.size() - 1);
    }

    public static int o(List list) {
        AbstractC5504s.h(list, "<this>");
        return list.size() - 1;
    }

    public static List p(Object... elements) {
        AbstractC5504s.h(elements, "elements");
        return elements.length > 0 ? AbstractC2276q.e(elements) : m();
    }

    public static List q(Object obj) {
        return obj != null ? AbstractC2280v.e(obj) : m();
    }

    public static List r(Object... elements) {
        AbstractC5504s.h(elements, "elements");
        return AbstractC2277s.U(elements);
    }

    public static List s(Object... elements) {
        AbstractC5504s.h(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C2271l(elements, true));
    }

    public static final List t(List list) {
        AbstractC5504s.h(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : AbstractC2280v.e(list.get(0)) : m();
    }

    private static final void u(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    public static void v() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void w() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
