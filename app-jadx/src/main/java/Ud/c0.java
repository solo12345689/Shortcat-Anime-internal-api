package Ud;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c0 extends b0 {
    public static Set d() {
        return J.f19487a;
    }

    public static LinkedHashSet e(Object... elements) {
        AbstractC5504s.h(elements, "elements");
        return (LinkedHashSet) AbstractC2277s.O0(elements, new LinkedHashSet(U.e(elements.length)));
    }

    public static Set f(Object... elements) {
        AbstractC5504s.h(elements, "elements");
        return (Set) AbstractC2277s.O0(elements, new LinkedHashSet(U.e(elements.length)));
    }

    public static final Set g(Set set) {
        AbstractC5504s.h(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : b0.c(set.iterator().next()) : d();
    }

    public static Set h(Object... elements) {
        AbstractC5504s.h(elements, "elements");
        return AbstractC2277s.i1(elements);
    }

    public static Set i(Object... elements) {
        AbstractC5504s.h(elements, "elements");
        return (Set) AbstractC2277s.V(elements, new LinkedHashSet());
    }
}
