package Be;

import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.E0;
import rf.AbstractC6317g;
import ye.InterfaceC7227e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class z implements InterfaceC7227e {

    /* JADX INFO: renamed from: a */
    public static final a f1900a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC5387k a(InterfaceC7227e interfaceC7227e, E0 typeSubstitution, AbstractC6317g kotlinTypeRefiner) {
            InterfaceC5387k interfaceC5387kT;
            AbstractC5504s.h(interfaceC7227e, "<this>");
            AbstractC5504s.h(typeSubstitution, "typeSubstitution");
            AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
            z zVar = interfaceC7227e instanceof z ? (z) interfaceC7227e : null;
            if (zVar != null && (interfaceC5387kT = zVar.T(typeSubstitution, kotlinTypeRefiner)) != null) {
                return interfaceC5387kT;
            }
            InterfaceC5387k interfaceC5387kL = interfaceC7227e.L(typeSubstitution);
            AbstractC5504s.g(interfaceC5387kL, "getMemberScope(...)");
            return interfaceC5387kL;
        }

        public final InterfaceC5387k b(InterfaceC7227e interfaceC7227e, AbstractC6317g kotlinTypeRefiner) {
            InterfaceC5387k interfaceC5387kJ0;
            AbstractC5504s.h(interfaceC7227e, "<this>");
            AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
            z zVar = interfaceC7227e instanceof z ? (z) interfaceC7227e : null;
            if (zVar != null && (interfaceC5387kJ0 = zVar.j0(kotlinTypeRefiner)) != null) {
                return interfaceC5387kJ0;
            }
            InterfaceC5387k interfaceC5387kX = interfaceC7227e.X();
            AbstractC5504s.g(interfaceC5387kX, "getUnsubstitutedMemberScope(...)");
            return interfaceC5387kX;
        }

        private a() {
        }
    }

    protected abstract InterfaceC5387k T(E0 e02, AbstractC6317g abstractC6317g);

    protected abstract InterfaceC5387k j0(AbstractC6317g abstractC6317g);
}
