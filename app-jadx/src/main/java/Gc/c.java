package gc;

import Td.AbstractC2163n;
import Ub.h;
import android.os.Bundle;
import bc.InterfaceC3043b;
import ic.InterfaceC5067a;
import ie.InterfaceC5082a;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import lc.C5588a;
import pc.X;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements InterfaceC5067a {

    /* JADX INFO: renamed from: a */
    private WeakReference f47415a = new WeakReference(null);

    /* JADX INFO: renamed from: b */
    private final Lazy f47416b = AbstractC2163n.b(new InterfaceC5082a() { // from class: gc.b
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return c.q(this.f47414a);
        }
    });

    /* JADX INFO: renamed from: c */
    public Lazy f47417c;

    private final InterfaceC3043b o() {
        return (InterfaceC3043b) this.f47416b.getValue();
    }

    public static final InterfaceC3043b q(c cVar) {
        return cVar.i().i(cVar);
    }

    public static /* synthetic */ void u(c cVar, String str, Bundle bundle, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
        }
        if ((i10 & 2) != 0) {
            bundle = Bundle.EMPTY;
        }
        cVar.s(str, bundle);
    }

    @Override // ic.InterfaceC5067a
    public Ub.d i() {
        Object obj = this.f47415a.get();
        if (obj != null) {
            return (Ub.d) obj;
        }
        throw new IllegalArgumentException("You attempted to access the app context before the module was created. Defer accessing the context until after the module initializes.");
    }

    public X m() {
        return null;
    }

    public abstract e n();

    public final lc.b p() {
        Ub.d dVar = (Ub.d) this.f47415a.get();
        C5588a c5588aD = dVar != null ? dVar.D() : null;
        if (c5588aD != null) {
            return c5588aD;
        }
        throw new IllegalArgumentException("The module wasn't created! You can't access the hosting runtime.");
    }

    public final void r(Enum r22, Bundle bundle) {
        AbstractC5504s.h(r22, "enum");
        InterfaceC3043b interfaceC3043bO = o();
        if (interfaceC3043bO != null) {
            interfaceC3043bO.a(h.a(r22), bundle);
        }
    }

    public final void s(String name, Bundle bundle) {
        AbstractC5504s.h(name, "name");
        InterfaceC3043b interfaceC3043bO = o();
        if (interfaceC3043bO != null) {
            interfaceC3043bO.a(name, bundle);
        }
    }

    public final void t(String name, Map body) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(body, "body");
        InterfaceC3043b interfaceC3043bO = o();
        if (interfaceC3043bO != null) {
            interfaceC3043bO.b(name, body);
        }
    }

    public final void v(Lazy lazy) {
        AbstractC5504s.h(lazy, "<set-?>");
        this.f47417c = lazy;
    }

    public final void w(WeakReference weakReference) {
        AbstractC5504s.h(weakReference, "<set-?>");
        this.f47415a = weakReference;
    }
}
