package q2;

import P9.AbstractC2011u;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: c */
    private static final String f56741c = t2.a0.H0(0);

    /* JADX INFO: renamed from: d */
    private static final String f56742d = t2.a0.H0(1);

    /* JADX INFO: renamed from: a */
    public final a0 f56743a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2011u f56744b;

    public b0(a0 a0Var, int i10) {
        this(a0Var, AbstractC2011u.B(Integer.valueOf(i10)));
    }

    public static b0 a(Bundle bundle) {
        return new b0(a0.b((Bundle) AbstractC6614a.e(bundle.getBundle(f56741c))), S9.f.c((int[]) AbstractC6614a.e(bundle.getIntArray(f56742d))));
    }

    public int b() {
        return this.f56743a.f56704c;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f56741c, this.f56743a.h());
        bundle.putIntArray(f56742d, S9.f.o(this.f56744b));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (this.f56743a.equals(b0Var.f56743a) && this.f56744b.equals(b0Var.f56744b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f56743a.hashCode() + (this.f56744b.hashCode() * 31);
    }

    public b0(a0 a0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= a0Var.f56702a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f56743a = a0Var;
        this.f56744b = AbstractC2011u.w(list);
    }
}
