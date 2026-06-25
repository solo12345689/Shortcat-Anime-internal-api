package Vf;

import Ud.AbstractC2279u;
import Uf.c;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class A0 implements Uf.e, Uf.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f20119a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20120b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(A0 a02, Rf.a aVar, Object obj) {
        return (aVar.getDescriptor().i() || a02.D()) ? a02.M(aVar, obj) : a02.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object L(A0 a02, Rf.a aVar, Object obj) {
        return a02.M(aVar, obj);
    }

    private final Object d0(Object obj, InterfaceC5082a interfaceC5082a) {
        c0(obj);
        Object objInvoke = interfaceC5082a.invoke();
        if (!this.f20120b) {
            b0();
        }
        this.f20120b = false;
        return objInvoke;
    }

    @Override // Uf.e
    public final String A() {
        return X(b0());
    }

    @Override // Uf.c
    public final Object B(Tf.e descriptor, int i10, final Rf.a deserializer, final Object obj) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(deserializer, "deserializer");
        return d0(Z(descriptor, i10), new InterfaceC5082a() { // from class: Vf.z0
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return A0.K(this.f20263a, deserializer, obj);
            }
        });
    }

    @Override // Uf.e
    public abstract Object C(Rf.a aVar);

    @Override // Uf.e
    public final byte E() {
        return O(b0());
    }

    @Override // Uf.c
    public final char F(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return P(Z(descriptor, i10));
    }

    @Override // Uf.c
    public final double G(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return Q(Z(descriptor, i10));
    }

    @Override // Uf.c
    public final short H(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return W(Z(descriptor, i10));
    }

    protected Object M(Rf.a deserializer, Object obj) {
        AbstractC5504s.h(deserializer, "deserializer");
        return C(deserializer);
    }

    protected abstract boolean N(Object obj);

    protected abstract byte O(Object obj);

    protected abstract char P(Object obj);

    protected abstract double Q(Object obj);

    protected abstract int R(Object obj, Tf.e eVar);

    protected abstract float S(Object obj);

    protected Uf.e T(Object obj, Tf.e inlineDescriptor) {
        AbstractC5504s.h(inlineDescriptor, "inlineDescriptor");
        c0(obj);
        return this;
    }

    protected abstract int U(Object obj);

    protected abstract long V(Object obj);

    protected abstract short W(Object obj);

    protected abstract String X(Object obj);

    protected final Object Y() {
        return AbstractC2279u.A0(this.f20119a);
    }

    protected abstract Object Z(Tf.e eVar, int i10);

    public final ArrayList a0() {
        return this.f20119a;
    }

    protected final Object b0() {
        ArrayList arrayList = this.f20119a;
        Object objRemove = arrayList.remove(AbstractC2279u.o(arrayList));
        this.f20120b = true;
        return objRemove;
    }

    protected final void c0(Object obj) {
        this.f20119a.add(obj);
    }

    @Override // Uf.c
    public final Object e(Tf.e descriptor, int i10, final Rf.a deserializer, final Object obj) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(deserializer, "deserializer");
        return d0(Z(descriptor, i10), new InterfaceC5082a() { // from class: Vf.y0
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return A0.L(this.f20257a, deserializer, obj);
            }
        });
    }

    @Override // Uf.c
    public int f(Tf.e eVar) {
        return c.a.a(this, eVar);
    }

    @Override // Uf.e
    public final int h() {
        return U(b0());
    }

    @Override // Uf.e
    public final Void j() {
        return null;
    }

    @Override // Uf.e
    public final int k(Tf.e enumDescriptor) {
        AbstractC5504s.h(enumDescriptor, "enumDescriptor");
        return R(b0(), enumDescriptor);
    }

    @Override // Uf.c
    public final String l(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return X(Z(descriptor, i10));
    }

    @Override // Uf.c
    public final int m(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return U(Z(descriptor, i10));
    }

    @Override // Uf.e
    public final long n() {
        return V(b0());
    }

    @Override // Uf.c
    public final long o(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return V(Z(descriptor, i10));
    }

    @Override // Uf.c
    public boolean p() {
        return c.a.b(this);
    }

    @Override // Uf.e
    public final short q() {
        return W(b0());
    }

    @Override // Uf.e
    public final float r() {
        return S(b0());
    }

    @Override // Uf.e
    public final double s() {
        return Q(b0());
    }

    @Override // Uf.c
    public final float t(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return S(Z(descriptor, i10));
    }

    @Override // Uf.e
    public final boolean u() {
        return N(b0());
    }

    @Override // Uf.e
    public final char v() {
        return P(b0());
    }

    @Override // Uf.c
    public final boolean w(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return N(Z(descriptor, i10));
    }

    @Override // Uf.c
    public final byte x(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return O(Z(descriptor, i10));
    }

    @Override // Uf.c
    public final Uf.e y(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return T(Z(descriptor, i10), descriptor.n(i10));
    }

    @Override // Uf.e
    public Uf.e z(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        return T(b0(), descriptor);
    }
}
