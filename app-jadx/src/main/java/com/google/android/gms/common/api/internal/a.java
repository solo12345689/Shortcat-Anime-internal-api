package com.google.android.gms.common.api.internal;

import P8.a;
import P8.f;
import P8.k;
import R8.AbstractC2115p;
import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends BasePendingResult {

    /* JADX INFO: renamed from: a */
    private final a.c f38944a;

    /* JADX INFO: renamed from: b */
    private final P8.a f38945b;

    protected a(P8.a aVar, f fVar) {
        super((f) AbstractC2115p.m(fVar, "GoogleApiClient must not be null"));
        AbstractC2115p.m(aVar, "Api must not be null");
        this.f38944a = aVar.b();
        this.f38945b = aVar;
    }

    private void g(RemoteException remoteException) {
        h(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void d(a.b bVar);

    public final void f(a.b bVar) throws DeadObjectException {
        try {
            d(bVar);
        } catch (DeadObjectException e10) {
            g(e10);
            throw e10;
        } catch (RemoteException e11) {
            g(e11);
        }
    }

    public final void h(Status status) {
        AbstractC2115p.b(!status.l(), "Failed result must not be success");
        k kVarA = a(status);
        setResult(kVarA);
        e(kVarA);
    }

    protected void e(k kVar) {
    }
}
