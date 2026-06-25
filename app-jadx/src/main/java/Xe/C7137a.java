package xe;

import Be.O;
import Ud.AbstractC2279u;
import java.util.List;
import jf.AbstractC5382f;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ye.AbstractC7241t;
import ye.E;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: xe.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7137a extends AbstractC5382f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0970a f64371e = new C0970a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Xe.f f64372f;

    /* JADX INFO: renamed from: xe.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0970a {
        public /* synthetic */ C0970a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Xe.f a() {
            return C7137a.f64372f;
        }

        private C0970a() {
        }
    }

    static {
        Xe.f fVarM = Xe.f.m("clone");
        AbstractC5504s.g(fVarM, "identifier(...)");
        f64372f = fVarM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7137a(pf.n storageManager, InterfaceC7227e containingClass) {
        super(storageManager, containingClass);
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(containingClass, "containingClass");
    }

    @Override // jf.AbstractC5382f
    protected List j() {
        O oL1 = O.l1(m(), InterfaceC7374h.f66223k0.b(), f64372f, InterfaceC7224b.a.DECLARATION, h0.f65112a);
        oL1.R0(null, m().J0(), AbstractC2279u.m(), AbstractC2279u.m(), AbstractC2279u.m(), ff.e.m(m()).i(), E.f65062d, AbstractC7241t.f65122c);
        return AbstractC2279u.e(oL1);
    }
}
