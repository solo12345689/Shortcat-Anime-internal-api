package se;

import Td.AbstractC2163n;
import ie.InterfaceC5096o;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6019i;
import pe.InterfaceC6026p;
import qe.C6171a;
import se.K0;

/* JADX INFO: renamed from: se.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6506o0 extends H0 implements InterfaceC6026p, InterfaceC6019i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Lazy f59540q;

    /* JADX INFO: renamed from: se.o0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends K0.d implements InterfaceC6019i.a, InterfaceC5096o {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final C6506o0 f59541j;

        public a(C6506o0 property) {
            AbstractC5504s.h(property, "property");
            this.f59541j = property;
        }

        @Override // pe.InterfaceC6023m.a
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public C6506o0 j() {
            return this.f59541j;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws C6171a {
            j0(obj, obj2, obj3);
            return Td.L.f17438a;
        }

        public void j0(Object obj, Object obj2, Object obj3) throws C6171a {
            j().u0(obj, obj2, obj3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6506o0(AbstractC6484d0 container, ye.Z descriptor) {
        super(container, descriptor);
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(descriptor, "descriptor");
        this.f59540q = AbstractC2163n.a(Td.q.f17462b, new C6504n0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a r0(C6506o0 c6506o0) {
        return new a(c6506o0);
    }

    @Override // pe.InterfaceC6019i
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public a g() {
        return (a) this.f59540q.getValue();
    }

    public void u0(Object obj, Object obj2, Object obj3) throws C6171a {
        g().call(obj, obj2, obj3);
    }
}
