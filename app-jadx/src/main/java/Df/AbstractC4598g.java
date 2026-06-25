package df;

import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import ye.H;

/* JADX INFO: renamed from: df.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4598g {

    /* JADX INFO: renamed from: a */
    private final Object f45154a;

    public AbstractC4598g(Object obj) {
        this.f45154a = obj;
    }

    public abstract S a(H h10);

    public Object b() {
        return this.f45154a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        AbstractC4598g abstractC4598g = obj instanceof AbstractC4598g ? (AbstractC4598g) obj : null;
        return AbstractC5504s.c(objB, abstractC4598g != null ? abstractC4598g.b() : null);
    }

    public int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
