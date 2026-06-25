package R8;

import R8.AbstractC2102c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends W {

    /* JADX INFO: renamed from: g */
    public final IBinder f15327g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ AbstractC2102c f15328h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(AbstractC2102c abstractC2102c, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC2102c, i10, bundle);
        Objects.requireNonNull(abstractC2102c);
        this.f15328h = abstractC2102c;
        this.f15327g = iBinder;
    }

    @Override // R8.W
    protected final boolean e() {
        try {
            IBinder iBinder = this.f15327g;
            AbstractC2115p.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC2102c abstractC2102c = this.f15328h;
            if (!abstractC2102c.D().equals(interfaceDescriptor)) {
                String strD = abstractC2102c.D();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strD).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(strD);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface iInterfaceQ = abstractC2102c.q(this.f15327g);
            if (iInterfaceQ == null || !(abstractC2102c.W(2, 4, iInterfaceQ) || abstractC2102c.W(3, 4, iInterfaceQ))) {
                return false;
            }
            abstractC2102c.f0(null);
            AbstractC2102c.a aVarC0 = abstractC2102c.c0();
            Bundle bundleV = abstractC2102c.v();
            if (aVarC0 == null) {
                return true;
            }
            abstractC2102c.c0().c(bundleV);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // R8.W
    protected final void f(ConnectionResult connectionResult) {
        AbstractC2102c abstractC2102c = this.f15328h;
        if (abstractC2102c.d0() != null) {
            abstractC2102c.d0().h(connectionResult);
        }
        abstractC2102c.K(connectionResult);
    }
}
