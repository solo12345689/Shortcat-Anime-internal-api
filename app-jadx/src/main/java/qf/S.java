package qf;

import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf.AbstractC6317g;
import ze.InterfaceC7367a;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class S implements InterfaceC7367a, uf.i {

    /* JADX INFO: renamed from: a */
    private int f58014a;

    public /* synthetic */ S(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int K0() {
        return W.a(this) ? super.hashCode() : (((N0().hashCode() * 31) + L0().hashCode()) * 31) + (O0() ? 1 : 0);
    }

    public abstract List L0();

    public abstract r0 M0();

    public abstract v0 N0();

    public abstract boolean O0();

    /* JADX INFO: renamed from: P0 */
    public abstract S X0(AbstractC6317g abstractC6317g);

    public abstract M0 Q0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return O0() == s10.O0() && rf.t.f58801a.a(Q0(), s10.Q0());
    }

    @Override // ze.InterfaceC7367a
    public InterfaceC7374h getAnnotations() {
        return AbstractC6209t.a(M0());
    }

    public final int hashCode() {
        int i10 = this.f58014a;
        if (i10 != 0) {
            return i10;
        }
        int iK0 = K0();
        this.f58014a = iK0;
        return iK0;
    }

    public abstract InterfaceC5387k o();

    private S() {
    }
}
