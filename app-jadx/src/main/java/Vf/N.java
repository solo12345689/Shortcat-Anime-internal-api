package Vf;

import Tf.e;
import Tf.m;
import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class N implements Tf.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tf.e f20153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20154b;

    public /* synthetic */ N(Tf.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return AbstractC5504s.c(this.f20153a, n10.f20153a) && AbstractC5504s.c(o(), n10.o());
    }

    @Override // Tf.e
    public List getAnnotations() {
        return e.a.a(this);
    }

    @Override // Tf.e
    public Tf.l h() {
        return m.b.f17535a;
    }

    public int hashCode() {
        return (this.f20153a.hashCode() * 31) + o().hashCode();
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
        Integer numR = Df.r.r(name);
        if (numR != null) {
            return numR.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // Tf.e
    public int k() {
        return this.f20154b;
    }

    @Override // Tf.e
    public String l(int i10) {
        return String.valueOf(i10);
    }

    @Override // Tf.e
    public List m(int i10) {
        if (i10 >= 0) {
            return AbstractC2279u.m();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + o() + " expects only non-negative indices").toString());
    }

    @Override // Tf.e
    public Tf.e n(int i10) {
        if (i10 >= 0) {
            return this.f20153a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + o() + " expects only non-negative indices").toString());
    }

    @Override // Tf.e
    public boolean p(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + o() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return o() + '(' + this.f20153a + ')';
    }

    private N(Tf.e eVar) {
        this.f20153a = eVar;
        this.f20154b = 1;
    }
}
