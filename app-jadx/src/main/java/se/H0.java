package se;

import Td.AbstractC2163n;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5492f;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6026p;
import se.K0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class H0 extends K0 implements InterfaceC6026p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Lazy f59378o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Lazy f59379p;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends K0.c implements InterfaceC6026p.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final H0 f59380j;

        public a(H0 property) {
            AbstractC5504s.h(property, "property");
            this.f59380j = property;
        }

        @Override // pe.InterfaceC6023m.a
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public H0 j() {
            return this.f59380j;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(Object obj, Object obj2) {
            return j().w(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(AbstractC6484d0 container, String name, String signature) {
        super(container, name, signature, AbstractC5492f.NO_RECEIVER);
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(signature, "signature");
        Td.q qVar = Td.q.f17462b;
        this.f59378o = AbstractC2163n.a(qVar, new F0(this));
        this.f59379p = AbstractC2163n.a(qVar, new G0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a m0(H0 h02) {
        return new a(h02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member p0(H0 h02) {
        return h02.f0();
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return w(obj, obj2);
    }

    @Override // se.K0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public a j0() {
        return (a) this.f59378o.getValue();
    }

    @Override // pe.InterfaceC6026p
    public Object w(Object obj, Object obj2) {
        return j0().call(obj, obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(AbstractC6484d0 container, ye.Z descriptor) {
        super(container, descriptor);
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(descriptor, "descriptor");
        Td.q qVar = Td.q.f17462b;
        this.f59378o = AbstractC2163n.a(qVar, new F0(this));
        this.f59379p = AbstractC2163n.a(qVar, new G0(this));
    }
}
