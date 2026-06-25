package Gf;

import Lf.C1909p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class H0 extends C1909p implements InterfaceC1612h0, InterfaceC1643x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public I0 f7496d;

    @Override // Gf.InterfaceC1643x0
    public boolean b() {
        return true;
    }

    @Override // Gf.InterfaceC1643x0
    public N0 c() {
        return null;
    }

    @Override // Gf.InterfaceC1612h0
    public void dispose() {
        u().C0(this);
    }

    @Override // Lf.C1909p
    public String toString() {
        return T.a(this) + '@' + T.b(this) + "[job@" + T.b(u()) + ']';
    }

    public final I0 u() {
        I0 i02 = this.f7496d;
        if (i02 != null) {
            return i02;
        }
        AbstractC5504s.u("job");
        return null;
    }

    public abstract boolean v();

    public abstract void w(Throwable th2);

    public final void x(I0 i02) {
        this.f7496d = i02;
    }
}
