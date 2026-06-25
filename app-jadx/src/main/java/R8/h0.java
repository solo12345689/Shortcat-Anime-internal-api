package R8;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends z0 {

    /* JADX INFO: renamed from: a */
    private AbstractC2102c f15321a;

    /* JADX INFO: renamed from: b */
    private final int f15322b;

    public h0(AbstractC2102c abstractC2102c, int i10) {
        this.f15321a = abstractC2102c;
        this.f15322b = i10;
    }

    @Override // R8.InterfaceC2110k
    public final void B0(int i10, IBinder iBinder, Bundle bundle) {
        AbstractC2115p.m(this.f15321a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f15321a.M(i10, iBinder, bundle, this.f15322b);
        this.f15321a = null;
    }

    @Override // R8.InterfaceC2110k
    public final void L1(int i10, IBinder iBinder, l0 l0Var) {
        AbstractC2102c abstractC2102c = this.f15321a;
        AbstractC2115p.m(abstractC2102c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC2115p.l(l0Var);
        abstractC2102c.U(l0Var);
        B0(i10, iBinder, l0Var.f15330a);
    }

    @Override // R8.InterfaceC2110k
    public final void i2(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
