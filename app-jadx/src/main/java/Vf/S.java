package Vf;

import Tf.e;
import Tf.m;
import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class S implements Tf.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Tf.e f20167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Tf.e f20168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20169d;

    public /* synthetic */ S(String str, Tf.e eVar, Tf.e eVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eVar, eVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return AbstractC5504s.c(o(), s10.o()) && AbstractC5504s.c(this.f20167b, s10.f20167b) && AbstractC5504s.c(this.f20168c, s10.f20168c);
    }

    @Override // Tf.e
    public List getAnnotations() {
        return e.a.a(this);
    }

    @Override // Tf.e
    public Tf.l h() {
        return m.c.f17536a;
    }

    public int hashCode() {
        return (((o().hashCode() * 31) + this.f20167b.hashCode()) * 31) + this.f20168c.hashCode();
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // Tf.e
    public int k() {
        return this.f20169d;
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
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f20167b;
            }
            if (i11 == 1) {
                return this.f20168c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + o() + " expects only non-negative indices").toString());
    }

    @Override // Tf.e
    public String o() {
        return this.f20166a;
    }

    @Override // Tf.e
    public boolean p(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + o() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return o() + '(' + this.f20167b + ", " + this.f20168c + ')';
    }

    private S(String str, Tf.e eVar, Tf.e eVar2) {
        this.f20166a = str;
        this.f20167b = eVar;
        this.f20168c = eVar2;
        this.f20169d = 2;
    }
}
