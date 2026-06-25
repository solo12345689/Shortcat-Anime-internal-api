package Ud;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import oe.C5870f;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C extends B {
    public static List U(List list) {
        AbstractC5504s.h(list, "<this>");
        return new Z(list);
    }

    public static List V(List list) {
        AbstractC5504s.h(list, "<this>");
        return new Y(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int W(List list, int i10) {
        if (i10 >= 0 && i10 <= AbstractC2281w.o(list)) {
            return AbstractC2281w.o(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new C5870f(0, AbstractC2281w.o(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int X(List list, int i10) {
        return AbstractC2281w.o(list) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Y(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new C5870f(0, list.size()) + "].");
    }
}
