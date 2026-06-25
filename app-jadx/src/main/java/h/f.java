package H;

import I0.InterfaceC1690p;
import K0.AbstractC1796k;
import K0.InterfaceC1794j;
import Td.L;
import ae.AbstractC2605b;
import i1.AbstractC5026s;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;
import r0.AbstractC6231m;
import r0.C6226h;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6226h f7629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1690p f7630b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C6226h c6226h, InterfaceC1690p interfaceC1690p) {
            super(0);
            this.f7629a = c6226h;
            this.f7630b = interfaceC1690p;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6226h invoke() {
            C6226h c6226h = this.f7629a;
            if (c6226h != null) {
                return c6226h;
            }
            InterfaceC1690p interfaceC1690p = this.f7630b;
            if (!interfaceC1690p.b()) {
                interfaceC1690p = null;
            }
            if (interfaceC1690p != null) {
                return AbstractC6231m.c(AbstractC5026s.d(interfaceC1690p.a()));
            }
            return null;
        }
    }

    public static final Object a(InterfaceC1794j interfaceC1794j, C6226h c6226h, Zd.e eVar) {
        if (!interfaceC1794j.getNode().isAttached()) {
            return L.f17438a;
        }
        InterfaceC1690p interfaceC1690pL = AbstractC1796k.l(interfaceC1794j);
        H.a aVarC = androidx.compose.foundation.relocation.b.c(interfaceC1794j);
        if (aVarC == null) {
            return L.f17438a;
        }
        Object objO1 = aVarC.o1(interfaceC1690pL, new a(c6226h, interfaceC1690pL), eVar);
        return objO1 == AbstractC2605b.f() ? objO1 : L.f17438a;
    }

    public static /* synthetic */ Object b(InterfaceC1794j interfaceC1794j, C6226h c6226h, Zd.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c6226h = null;
        }
        return e.a(interfaceC1794j, c6226h, eVar);
    }
}
