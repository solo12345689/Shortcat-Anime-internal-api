package com.swmansion.rnscreens.gamma.stack.host;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f44507a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f44508b = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d((Integer) ((Pair) obj).c(), (Integer) ((Pair) obj2).c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d((Integer) ((Pair) obj).c(), (Integer) ((Pair) obj2).c());
        }
    }

    private final boolean d() {
        return (this.f44507a.isEmpty() && this.f44508b.isEmpty()) ? false : true;
    }

    public final void a(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen) {
        AbstractC5504s.h(stackScreen, "stackScreen");
        this.f44508b.add(new e(stackScreen));
    }

    public final void b(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen) {
        AbstractC5504s.h(stackScreen, "stackScreen");
        this.f44507a.add(new f(stackScreen));
    }

    public final void c(h container, List renderedScreens) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(renderedScreens, "renderedScreens");
        if (d()) {
            List<e> list = this.f44508b;
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
            for (e eVar : list) {
                arrayList.add(new Pair(Integer.valueOf(renderedScreens.indexOf(eVar.a())), eVar));
            }
            Iterator it = AbstractC2279u.U(AbstractC2279u.R0(arrayList, new a())).iterator();
            while (it.hasNext()) {
                container.i0(((e) ((Pair) it.next()).getSecond()).a());
            }
            List<f> list2 = this.f44507a;
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(list2, 10));
            for (f fVar : list2) {
                arrayList2.add(new Pair(Integer.valueOf(renderedScreens.indexOf(fVar.a())), fVar));
            }
            Iterator it2 = AbstractC2279u.R0(arrayList2, new b()).iterator();
            while (it2.hasNext()) {
                container.j0(((f) ((Pair) it2.next()).getSecond()).a());
            }
            container.l0();
            this.f44508b.clear();
            this.f44507a.clear();
        }
    }
}
