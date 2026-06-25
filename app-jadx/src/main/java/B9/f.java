package b9;

import P8.f;
import R8.AbstractC2106g;
import R8.C2103d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends AbstractC2106g {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final H8.g f33238I;

    public f(Context context, Looper looper, C2103d c2103d, H8.g gVar, f.a aVar, f.b bVar) {
        super(context, looper, 68, c2103d, aVar, bVar);
        H8.f fVar = new H8.f(gVar == null ? H8.g.f8184d : gVar);
        fVar.a(b.a());
        this.f33238I = new H8.g(fVar);
    }

    @Override // R8.AbstractC2102c
    protected final String D() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // R8.AbstractC2102c
    protected final String E() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // R8.AbstractC2102c, P8.a.f
    public final int k() {
        return 12800000;
    }

    @Override // R8.AbstractC2102c
    protected final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // R8.AbstractC2102c
    protected final Bundle y() {
        return this.f33238I.a();
    }
}
