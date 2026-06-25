package c9;

import Q8.InterfaceC2056d;
import Q8.InterfaceC2064l;
import R8.AbstractC2106g;
import R8.C2103d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends AbstractC2106g {
    public g(Context context, Looper looper, C2103d c2103d, InterfaceC2056d interfaceC2056d, InterfaceC2064l interfaceC2064l) {
        super(context, looper, 258, c2103d, interfaceC2056d, interfaceC2064l);
    }

    @Override // R8.AbstractC2102c
    protected final String D() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    @Override // R8.AbstractC2102c
    protected final String E() {
        return "com.google.android.gms.auth.blockstore.service.START";
    }

    @Override // R8.AbstractC2102c
    protected final boolean H() {
        return true;
    }

    @Override // R8.AbstractC2102c
    public final boolean R() {
        return true;
    }

    @Override // R8.AbstractC2102c, P8.a.f
    public final int k() {
        return 17895000;
    }

    @Override // R8.AbstractC2102c
    protected final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder);
    }

    @Override // R8.AbstractC2102c
    public final O8.c[] t() {
        return AbstractC3086c.f33561l;
    }
}
