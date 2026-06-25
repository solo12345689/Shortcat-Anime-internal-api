package com.google.android.gms.measurement.internal;

import R8.AbstractC2102c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import j9.InterfaceC5347d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.k2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3845k2 extends AbstractC2102c {
    public C3845k2(Context context, Looper looper, AbstractC2102c.a aVar, AbstractC2102c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // R8.AbstractC2102c
    protected final String D() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // R8.AbstractC2102c
    protected final String E() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // R8.AbstractC2102c, P8.a.f
    public final int k() {
        return 12451000;
    }

    @Override // R8.AbstractC2102c
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5347d ? (InterfaceC5347d) iInterfaceQueryLocalInterface : new C3797e2(iBinder);
    }
}
