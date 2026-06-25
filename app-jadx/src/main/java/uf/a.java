package Uf;

import Rf.j;
import Uf.c;
import Uf.e;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements e, c {
    @Override // Uf.e
    public String A() {
        Object objJ = J();
        AbstractC5504s.f(objJ, "null cannot be cast to non-null type kotlin.String");
        return (String) objJ;
    }

    @Override // Uf.c
    public final Object B(Tf.e descriptor, int i10, Rf.a deserializer, Object obj) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(deserializer, "deserializer");
        return (deserializer.getDescriptor().i() || D()) ? I(deserializer, obj) : j();
    }

    @Override // Uf.e
    public Object C(Rf.a aVar) {
        return e.a.a(this, aVar);
    }

    @Override // Uf.e
    public boolean D() {
        return true;
    }

    @Override // Uf.e
    public abstract byte E();

    @Override // Uf.c
    public final char F(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return v();
    }

    @Override // Uf.c
    public final double G(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return s();
    }

    @Override // Uf.c
    public final short H(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return q();
    }

    public Object I(Rf.a deserializer, Object obj) {
        AbstractC5504s.h(deserializer, "deserializer");
        return C(deserializer);
    }

    public Object J() {
        throw new j(O.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // Uf.e
    public c b(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        return this;
    }

    @Override // Uf.c
    public void c(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
    }

    @Override // Uf.c
    public Object e(Tf.e descriptor, int i10, Rf.a deserializer, Object obj) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(deserializer, "deserializer");
        return I(deserializer, obj);
    }

    @Override // Uf.c
    public int f(Tf.e eVar) {
        return c.a.a(this, eVar);
    }

    @Override // Uf.e
    public abstract int h();

    @Override // Uf.e
    public Void j() {
        return null;
    }

    @Override // Uf.e
    public int k(Tf.e enumDescriptor) {
        AbstractC5504s.h(enumDescriptor, "enumDescriptor");
        Object objJ = J();
        AbstractC5504s.f(objJ, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objJ).intValue();
    }

    @Override // Uf.c
    public final String l(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return A();
    }

    @Override // Uf.c
    public final int m(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return h();
    }

    @Override // Uf.e
    public abstract long n();

    @Override // Uf.c
    public final long o(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return n();
    }

    @Override // Uf.c
    public boolean p() {
        return c.a.b(this);
    }

    @Override // Uf.e
    public abstract short q();

    @Override // Uf.e
    public float r() {
        Object objJ = J();
        AbstractC5504s.f(objJ, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objJ).floatValue();
    }

    @Override // Uf.e
    public double s() {
        Object objJ = J();
        AbstractC5504s.f(objJ, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objJ).doubleValue();
    }

    @Override // Uf.c
    public final float t(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return r();
    }

    @Override // Uf.e
    public boolean u() {
        Object objJ = J();
        AbstractC5504s.f(objJ, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objJ).booleanValue();
    }

    @Override // Uf.e
    public char v() {
        Object objJ = J();
        AbstractC5504s.f(objJ, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objJ).charValue();
    }

    @Override // Uf.c
    public final boolean w(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return u();
    }

    @Override // Uf.c
    public final byte x(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return E();
    }

    @Override // Uf.c
    public e y(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return z(descriptor.n(i10));
    }

    @Override // Uf.e
    public e z(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        return this;
    }
}
