package Uf;

import Rf.j;
import Rf.k;
import Uf.d;
import Uf.f;
import Vf.W;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements f, d {
    @Override // Uf.f
    public void A() {
        f.a.b(this);
    }

    @Override // Uf.d
    public final void B(Tf.e descriptor, int i10, boolean z10) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            x(z10);
        }
    }

    @Override // Uf.d
    public final f C(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return G(descriptor, i10) ? D(descriptor.n(i10)) : W.f20172a;
    }

    @Override // Uf.f
    public f D(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        return this;
    }

    @Override // Uf.f
    public void E(int i10) {
        I(Integer.valueOf(i10));
    }

    @Override // Uf.f
    public void F(String value) {
        AbstractC5504s.h(value, "value");
        I(value);
    }

    public boolean G(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return true;
    }

    public void H(k kVar, Object obj) {
        f.a.c(this, kVar, obj);
    }

    public void I(Object value) {
        AbstractC5504s.h(value, "value");
        throw new j("Non-serializable " + O.b(value.getClass()) + " is not supported by " + O.b(getClass()) + " encoder");
    }

    @Override // Uf.f
    public d b(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        return this;
    }

    @Override // Uf.d
    public void c(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
    }

    @Override // Uf.f
    public void e(Tf.e enumDescriptor, int i10) {
        AbstractC5504s.h(enumDescriptor, "enumDescriptor");
        I(Integer.valueOf(i10));
    }

    @Override // Uf.d
    public void f(Tf.e descriptor, int i10, k serializer, Object obj) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(serializer, "serializer");
        if (G(descriptor, i10)) {
            H(serializer, obj);
        }
    }

    @Override // Uf.d
    public boolean g(Tf.e eVar, int i10) {
        return d.a.a(this, eVar, i10);
    }

    @Override // Uf.d
    public final void h(Tf.e descriptor, int i10, char c10) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            z(c10);
        }
    }

    @Override // Uf.f
    public void i(double d10) {
        I(Double.valueOf(d10));
    }

    @Override // Uf.f
    public void j(byte b10) {
        I(Byte.valueOf(b10));
    }

    @Override // Uf.d
    public final void k(Tf.e descriptor, int i10, String value) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(value, "value");
        if (G(descriptor, i10)) {
            F(value);
        }
    }

    @Override // Uf.d
    public final void l(Tf.e descriptor, int i10, float f10) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            y(f10);
        }
    }

    @Override // Uf.d
    public void m(Tf.e descriptor, int i10, k serializer, Object obj) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(serializer, "serializer");
        if (G(descriptor, i10)) {
            t(serializer, obj);
        }
    }

    @Override // Uf.d
    public final void n(Tf.e descriptor, int i10, byte b10) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            j(b10);
        }
    }

    @Override // Uf.d
    public final void o(Tf.e descriptor, int i10, long j10) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            s(j10);
        }
    }

    @Override // Uf.d
    public final void p(Tf.e descriptor, int i10, int i11) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            E(i11);
        }
    }

    @Override // Uf.d
    public final void q(Tf.e descriptor, int i10, short s10) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            w(s10);
        }
    }

    @Override // Uf.f
    public d r(Tf.e eVar, int i10) {
        return f.a.a(this, eVar, i10);
    }

    @Override // Uf.f
    public void s(long j10) {
        I(Long.valueOf(j10));
    }

    @Override // Uf.f
    public void t(k kVar, Object obj) {
        f.a.d(this, kVar, obj);
    }

    @Override // Uf.d
    public final void u(Tf.e descriptor, int i10, double d10) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            i(d10);
        }
    }

    @Override // Uf.f
    public void v() {
        throw new j("'null' is not supported by default");
    }

    @Override // Uf.f
    public void w(short s10) {
        I(Short.valueOf(s10));
    }

    @Override // Uf.f
    public void x(boolean z10) {
        I(Boolean.valueOf(z10));
    }

    @Override // Uf.f
    public void y(float f10) {
        I(Float.valueOf(f10));
    }

    @Override // Uf.f
    public void z(char c10) {
        I(Character.valueOf(c10));
    }
}
