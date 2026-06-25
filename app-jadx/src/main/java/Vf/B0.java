package Vf;

import Ud.AbstractC2279u;
import Uf.f;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class B0 implements Uf.f, Uf.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f20123a = new ArrayList();

    private final boolean G(Tf.e eVar, int i10) {
        Y(W(eVar, i10));
        return true;
    }

    @Override // Uf.d
    public final void B(Tf.e descriptor, int i10, boolean z10) {
        AbstractC5504s.h(descriptor, "descriptor");
        I(W(descriptor, i10), z10);
    }

    @Override // Uf.d
    public final Uf.f C(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return O(W(descriptor, i10), descriptor.n(i10));
    }

    @Override // Uf.f
    public Uf.f D(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        return O(X(), descriptor);
    }

    @Override // Uf.f
    public final void E(int i10) {
        P(X(), i10);
    }

    @Override // Uf.f
    public final void F(String value) {
        AbstractC5504s.h(value, "value");
        S(X(), value);
    }

    public void H(Rf.k kVar, Object obj) {
        f.a.c(this, kVar, obj);
    }

    protected abstract void I(Object obj, boolean z10);

    protected abstract void J(Object obj, byte b10);

    protected abstract void K(Object obj, char c10);

    protected abstract void L(Object obj, double d10);

    protected abstract void M(Object obj, Tf.e eVar, int i10);

    protected abstract void N(Object obj, float f10);

    protected Uf.f O(Object obj, Tf.e inlineDescriptor) {
        AbstractC5504s.h(inlineDescriptor, "inlineDescriptor");
        Y(obj);
        return this;
    }

    protected abstract void P(Object obj, int i10);

    protected abstract void Q(Object obj, long j10);

    protected abstract void R(Object obj, short s10);

    protected abstract void S(Object obj, String str);

    protected abstract void T(Tf.e eVar);

    protected final Object U() {
        return AbstractC2279u.y0(this.f20123a);
    }

    protected final Object V() {
        return AbstractC2279u.A0(this.f20123a);
    }

    protected abstract Object W(Tf.e eVar, int i10);

    protected final Object X() {
        if (this.f20123a.isEmpty()) {
            throw new Rf.j("No tag in stack for requested element");
        }
        ArrayList arrayList = this.f20123a;
        return arrayList.remove(AbstractC2279u.o(arrayList));
    }

    protected final void Y(Object obj) {
        this.f20123a.add(obj);
    }

    @Override // Uf.d
    public final void c(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (!this.f20123a.isEmpty()) {
            X();
        }
        T(descriptor);
    }

    @Override // Uf.f
    public final void e(Tf.e enumDescriptor, int i10) {
        AbstractC5504s.h(enumDescriptor, "enumDescriptor");
        M(X(), enumDescriptor, i10);
    }

    @Override // Uf.d
    public void f(Tf.e descriptor, int i10, Rf.k serializer, Object obj) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(serializer, "serializer");
        if (G(descriptor, i10)) {
            H(serializer, obj);
        }
    }

    @Override // Uf.d
    public final void h(Tf.e descriptor, int i10, char c10) {
        AbstractC5504s.h(descriptor, "descriptor");
        K(W(descriptor, i10), c10);
    }

    @Override // Uf.f
    public final void i(double d10) {
        L(X(), d10);
    }

    @Override // Uf.f
    public final void j(byte b10) {
        J(X(), b10);
    }

    @Override // Uf.d
    public final void k(Tf.e descriptor, int i10, String value) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(value, "value");
        S(W(descriptor, i10), value);
    }

    @Override // Uf.d
    public final void l(Tf.e descriptor, int i10, float f10) {
        AbstractC5504s.h(descriptor, "descriptor");
        N(W(descriptor, i10), f10);
    }

    @Override // Uf.d
    public void m(Tf.e descriptor, int i10, Rf.k serializer, Object obj) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(serializer, "serializer");
        if (G(descriptor, i10)) {
            t(serializer, obj);
        }
    }

    @Override // Uf.d
    public final void n(Tf.e descriptor, int i10, byte b10) {
        AbstractC5504s.h(descriptor, "descriptor");
        J(W(descriptor, i10), b10);
    }

    @Override // Uf.d
    public final void o(Tf.e descriptor, int i10, long j10) {
        AbstractC5504s.h(descriptor, "descriptor");
        Q(W(descriptor, i10), j10);
    }

    @Override // Uf.d
    public final void p(Tf.e descriptor, int i10, int i11) {
        AbstractC5504s.h(descriptor, "descriptor");
        P(W(descriptor, i10), i11);
    }

    @Override // Uf.d
    public final void q(Tf.e descriptor, int i10, short s10) {
        AbstractC5504s.h(descriptor, "descriptor");
        R(W(descriptor, i10), s10);
    }

    @Override // Uf.f
    public Uf.d r(Tf.e eVar, int i10) {
        return f.a.a(this, eVar, i10);
    }

    @Override // Uf.f
    public final void s(long j10) {
        Q(X(), j10);
    }

    @Override // Uf.f
    public abstract void t(Rf.k kVar, Object obj);

    @Override // Uf.d
    public final void u(Tf.e descriptor, int i10, double d10) {
        AbstractC5504s.h(descriptor, "descriptor");
        L(W(descriptor, i10), d10);
    }

    @Override // Uf.f
    public final void w(short s10) {
        R(X(), s10);
    }

    @Override // Uf.f
    public final void x(boolean z10) {
        I(X(), z10);
    }

    @Override // Uf.f
    public final void y(float f10) {
        N(X(), f10);
    }

    @Override // Uf.f
    public final void z(char c10) {
        K(X(), c10);
    }
}
