package Vf;

import Td.C2160k;
import Tf.e;
import Tf.m;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class X implements Tf.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X f20174a = new X();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.l f20175b = m.d.f17537a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f20176c = "kotlin.Nothing";

    private X() {
    }

    private final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // Tf.e
    public List getAnnotations() {
        return e.a.a(this);
    }

    @Override // Tf.e
    public Tf.l h() {
        return f20175b;
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
        return f20176c;
    }

    @Override // Tf.e
    public boolean p(int i10) {
        a();
        throw new C2160k();
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
