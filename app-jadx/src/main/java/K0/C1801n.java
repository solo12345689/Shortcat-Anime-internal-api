package K0;

import kotlin.jvm.internal.AbstractC5504s;
import t.C6545K;

/* JADX INFO: renamed from: K0.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1801n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f10789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C6545K f10790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D0 f10791c = new D0(AbstractC1802o.f10792a);

    public C1801n(boolean z10) {
        this.f10789a = z10;
    }

    private final C6545K f() {
        if (this.f10790b == null) {
            this.f10790b = t.U.b();
        }
        C6545K c6545k = this.f10790b;
        AbstractC5504s.e(c6545k);
        return c6545k;
    }

    public final void a(J j10) {
        if (!j10.b()) {
            H0.a.b("DepthSortedSet.add called on an unattached node");
        }
        if (this.f10789a) {
            C6545K c6545kF = f();
            int iE = c6545kF.e(j10, Integer.MAX_VALUE);
            if (iE == Integer.MAX_VALUE) {
                c6545kF.u(j10, j10.S());
            } else {
                if (!(iE == j10.S())) {
                    H0.a.b("invalid node depth");
                }
            }
        }
        this.f10791c.add(j10);
    }

    public final boolean b(J j10) {
        boolean zContains = this.f10791c.contains(j10);
        if (this.f10789a) {
            if (!(zContains == f().a(j10))) {
                H0.a.b("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean c() {
        return this.f10791c.isEmpty();
    }

    public final J d() {
        J j10 = (J) this.f10791c.first();
        e(j10);
        return j10;
    }

    public final boolean e(J j10) {
        if (!j10.b()) {
            H0.a.b("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.f10791c.remove(j10);
        if (this.f10789a) {
            C6545K c6545kF = f();
            if (c6545kF.a(j10)) {
                int iC = c6545kF.c(j10);
                c6545kF.r(j10);
                if (!(iC == (zRemove ? j10.S() : Integer.MAX_VALUE))) {
                    H0.a.b("invalid node depth");
                }
            }
        }
        return zRemove;
    }

    public String toString() {
        return this.f10791c.toString();
    }
}
