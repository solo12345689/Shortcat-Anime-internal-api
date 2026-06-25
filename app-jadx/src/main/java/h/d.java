package H;

import I0.AbstractC1691q;
import I0.InterfaceC1690p;
import K0.AbstractC1798l;
import K0.InterfaceC1794j;
import Td.L;
import android.graphics.Rect;
import android.view.View;
import ie.InterfaceC5082a;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements H.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1794j f7628a;

        a(InterfaceC1794j interfaceC1794j) {
            this.f7628a = interfaceC1794j;
        }

        @Override // H.a
        public final Object o1(InterfaceC1690p interfaceC1690p, InterfaceC5082a interfaceC5082a, Zd.e eVar) {
            View viewA = AbstractC1798l.a(this.f7628a);
            long jE = AbstractC1691q.e(interfaceC1690p);
            C6226h c6226h = (C6226h) interfaceC5082a.invoke();
            C6226h c6226hT = c6226h != null ? c6226h.t(jE) : null;
            if (c6226hT != null) {
                viewA.requestRectangleOnScreen(d.c(c6226hT), false);
            }
            return L.f17438a;
        }
    }

    public static final H.a b(InterfaceC1794j interfaceC1794j) {
        return new a(interfaceC1794j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(C6226h c6226h) {
        return new Rect((int) c6226h.i(), (int) c6226h.l(), (int) c6226h.j(), (int) c6226h.e());
    }
}
