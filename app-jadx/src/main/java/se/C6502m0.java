package se;

import Td.AbstractC2163n;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6021k;
import qe.C6171a;
import se.K0;

/* JADX INFO: renamed from: se.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6502m0 extends E0 implements InterfaceC6021k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Lazy f59528q;

    /* JADX INFO: renamed from: se.m0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends K0.d implements InterfaceC6021k.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final C6502m0 f59529j;

        public a(C6502m0 property) {
            AbstractC5504s.h(property, "property");
            this.f59529j = property;
        }

        @Override // pe.InterfaceC6023m.a
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public C6502m0 j() {
            return this.f59529j;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws C6171a {
            j0(obj, obj2);
            return Td.L.f17438a;
        }

        public void j0(Object obj, Object obj2) throws C6171a {
            j().u0(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6502m0(AbstractC6484d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(signature, "signature");
        this.f59528q = AbstractC2163n.a(Td.q.f17462b, new C6500l0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a r0(C6502m0 c6502m0) {
        return new a(c6502m0);
    }

    @Override // pe.InterfaceC6021k, pe.InterfaceC6019i
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public a g() {
        return (a) this.f59528q.getValue();
    }

    public void u0(Object obj, Object obj2) throws C6171a {
        g().call(obj, obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6502m0(AbstractC6484d0 container, ye.Z descriptor) {
        super(container, descriptor);
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(descriptor, "descriptor");
        this.f59528q = AbstractC2163n.a(Td.q.f17462b, new C6500l0(this));
    }
}
