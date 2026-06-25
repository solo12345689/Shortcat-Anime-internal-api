package se;

import Td.AbstractC2163n;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6024n;
import se.K0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class B0 extends K0 implements InterfaceC6024n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Lazy f59362o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Lazy f59363p;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends K0.c implements InterfaceC6024n.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final B0 f59364j;

        public a(B0 property) {
            AbstractC5504s.h(property, "property");
            this.f59364j = property;
        }

        @Override // pe.InterfaceC6023m.a
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public B0 j() {
            return this.f59364j;
        }

        @Override // ie.InterfaceC5082a
        public Object invoke() {
            return j().get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(AbstractC6484d0 container, ye.Z descriptor) {
        super(container, descriptor);
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(descriptor, "descriptor");
        Td.q qVar = Td.q.f17462b;
        this.f59362o = AbstractC2163n.a(qVar, new C6528z0(this));
        this.f59363p = AbstractC2163n.a(qVar, new A0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a m0(B0 b02) {
        return new a(b02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p0(B0 b02) {
        return b02.h0(b02.f0(), null, null);
    }

    @Override // pe.InterfaceC6024n
    public Object get() {
        return j0().call(new Object[0]);
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return get();
    }

    @Override // se.K0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public a j0() {
        return (a) this.f59362o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(AbstractC6484d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(signature, "signature");
        Td.q qVar = Td.q.f17462b;
        this.f59362o = AbstractC2163n.a(qVar, new C6528z0(this));
        this.f59363p = AbstractC2163n.a(qVar, new A0(this));
    }
}
