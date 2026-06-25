package Vf;

import Td.C2160k;
import Tf.e;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class q0 implements Tf.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Tf.d f20225b;

    public q0(String serialName, Tf.d kind) {
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(kind, "kind");
        this.f20224a = serialName;
        this.f20225b = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // Tf.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Tf.d h() {
        return this.f20225b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return AbstractC5504s.c(o(), q0Var.o()) && AbstractC5504s.c(h(), q0Var.h());
    }

    @Override // Tf.e
    public List getAnnotations() {
        return e.a.a(this);
    }

    public int hashCode() {
        return o().hashCode() + (h().hashCode() * 31);
    }

    @Override // Tf.e
    public boolean i() {
        return e.a.c(this);
    }

    @Override // Tf.e
    public boolean isInline() {
        return e.a.b(this);
    }

    @Override // Tf.e
    public int j(String name) {
        AbstractC5504s.h(name, "name");
        a();
        throw new C2160k();
    }

    @Override // Tf.e
    public int k() {
        return 0;
    }

    @Override // Tf.e
    public String l(int i10) {
        a();
        throw new C2160k();
    }

    @Override // Tf.e
    public List m(int i10) {
        a();
        throw new C2160k();
    }

    @Override // Tf.e
    public Tf.e n(int i10) {
        a();
        throw new C2160k();
    }

    @Override // Tf.e
    public String o() {
        return this.f20224a;
    }

    @Override // Tf.e
    public boolean p(int i10) {
        a();
        throw new C2160k();
    }

    public String toString() {
        return "PrimitiveDescriptor(" + o() + ')';
    }
}
