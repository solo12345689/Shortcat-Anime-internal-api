package T8;

import Q8.InterfaceC2056d;
import Q8.InterfaceC2064l;
import R8.AbstractC2106g;
import R8.C2103d;
import R8.C2121w;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends AbstractC2106g {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final C2121w f17338I;

    public e(Context context, Looper looper, C2103d c2103d, C2121w c2121w, InterfaceC2056d interfaceC2056d, InterfaceC2064l interfaceC2064l) {
        super(context, looper, 270, c2103d, interfaceC2056d, interfaceC2064l);
        this.f17338I = c2121w;
    }

    @Override // R8.AbstractC2102c
    protected final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // R8.AbstractC2102c
    protected final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // R8.AbstractC2102c
    protected final boolean H() {
        return true;
    }

    @Override // R8.AbstractC2102c, P8.a.f
    public final int k() {
        return 203400000;
    }

    @Override // R8.AbstractC2102c
    protected final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // R8.AbstractC2102c
    public final O8.c[] t() {
        return d9.d.f45083b;
    }

    @Override // R8.AbstractC2102c
    protected final Bundle y() {
        return this.f17338I.b();
    }
}
