package se;

import Td.AbstractC2163n;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6020j;
import qe.C6171a;
import se.K0;

/* JADX INFO: renamed from: se.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6498k0 extends B0 implements InterfaceC6020j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Lazy f59521q;

    /* JADX INFO: renamed from: se.k0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends K0.d implements InterfaceC6020j.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final C6498k0 f59522j;

        public a(C6498k0 property) {
            AbstractC5504s.h(property, "property");
            this.f59522j = property;
        }

        @Override // pe.InterfaceC6023m.a
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public C6498k0 j() {
            return this.f59522j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws C6171a {
            j0(obj);
            return Td.L.f17438a;
        }

        public void j0(Object obj) throws C6171a {
            j().u0(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6498k0(AbstractC6484d0 container, ye.Z descriptor) {
        super(container, descriptor);
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(descriptor, "descriptor");
        this.f59521q = AbstractC2163n.a(Td.q.f17462b, new C6496j0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a r0(C6498k0 c6498k0) {
        return new a(c6498k0);
    }

    @Override // pe.InterfaceC6020j, pe.InterfaceC6019i
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public a g() {
        return (a) this.f59521q.getValue();
    }

    public void u0(Object obj) throws C6171a {
        g().call(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6498k0(AbstractC6484d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(signature, "signature");
        this.f59521q = AbstractC2163n.a(Td.q.f17462b, new C6496j0(this));
    }
}
