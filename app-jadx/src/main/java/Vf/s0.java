package Vf;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class s0 implements Tf.e, InterfaceC2338l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tf.e f20230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f20232c;

    public s0(Tf.e original) {
        AbstractC5504s.h(original, "original");
        this.f20230a = original;
        this.f20231b = original.o() + '?';
        this.f20232c = AbstractC2325e0.a(original);
    }

    @Override // Vf.InterfaceC2338l
    public Set a() {
        return this.f20232c;
    }

    public final Tf.e b() {
        return this.f20230a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && AbstractC5504s.c(this.f20230a, ((s0) obj).f20230a);
    }

    @Override // Tf.e
    public List getAnnotations() {
        return this.f20230a.getAnnotations();
    }

    @Override // Tf.e
    public Tf.l h() {
        return this.f20230a.h();
    }

    public int hashCode() {
        return this.f20230a.hashCode() * 31;
    }

    @Override // Tf.e
    public boolean i() {
        return true;
    }

    @Override // Tf.e
    public boolean isInline() {
        return this.f20230a.isInline();
    }

    @Override // Tf.e
    public int j(String name) {
        AbstractC5504s.h(name, "name");
        return this.f20230a.j(name);
    }

    @Override // Tf.e
    public int k() {
        return this.f20230a.k();
    }

    @Override // Tf.e
    public String l(int i10) {
        return this.f20230a.l(i10);
    }

    @Override // Tf.e
    public List m(int i10) {
        return this.f20230a.m(i10);
    }

    @Override // Tf.e
    public Tf.e n(int i10) {
        return this.f20230a.n(i10);
    }

    @Override // Tf.e
    public String o() {
        return this.f20231b;
    }

    @Override // Tf.e
    public boolean p(int i10) {
        return this.f20230a.p(i10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20230a);
        sb2.append('?');
        return sb2.toString();
    }
}
