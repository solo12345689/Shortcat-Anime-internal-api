package se;

import Td.AbstractC2163n;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6025o;
import se.K0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class E0 extends K0 implements InterfaceC6025o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Lazy f59370o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Lazy f59371p;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends K0.c implements InterfaceC6025o.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final E0 f59372j;

        public a(E0 property) {
            AbstractC5504s.h(property, "property");
            this.f59372j = property;
        }

        @Override // pe.InterfaceC6023m.a
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public E0 j() {
            return this.f59372j;
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            return c0().get(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(AbstractC6484d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(signature, "signature");
        Td.q qVar = Td.q.f17462b;
        this.f59370o = AbstractC2163n.a(qVar, new C0(this));
        this.f59371p = AbstractC2163n.a(qVar, new D0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a m0(E0 e02) {
        return new a(e02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member p0(E0 e02) {
        return e02.f0();
    }

    @Override // pe.InterfaceC6025o
    public Object get(Object obj) {
        return d().call(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // se.K0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a j0() {
        return (a) this.f59370o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(AbstractC6484d0 container, ye.Z descriptor) {
        super(container, descriptor);
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(descriptor, "descriptor");
        Td.q qVar = Td.q.f17462b;
        this.f59370o = AbstractC2163n.a(qVar, new C0(this));
        this.f59371p = AbstractC2163n.a(qVar, new D0(this));
    }
}
