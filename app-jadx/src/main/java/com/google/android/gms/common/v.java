package com.google.android.gms.common;

import R8.x0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends S8.a {
    public static final Parcelable.Creator<v> CREATOR = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f39013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f39014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f39015d;

    v(String str, n nVar, boolean z10, boolean z11) {
        this.f39012a = str;
        this.f39013b = nVar;
        this.f39014c = z10;
        this.f39015d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f39012a;
        int iA = S8.c.a(parcel);
        S8.c.q(parcel, 1, str, false);
        n nVar = this.f39013b;
        if (nVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            nVar = null;
        }
        S8.c.i(parcel, 2, nVar, false);
        S8.c.c(parcel, 3, this.f39014c);
        S8.c.c(parcel, 4, this.f39015d);
        S8.c.b(parcel, iA);
    }

    v(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f39012a = str;
        o oVar = null;
        if (iBinder != null) {
            try {
                Y8.a aVarL = x0.e(iBinder).l();
                byte[] bArr = aVarL == null ? null : (byte[]) Y8.b.h(aVarL);
                if (bArr != null) {
                    oVar = new o(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f39013b = oVar;
        this.f39014c = z10;
        this.f39015d = z11;
    }
}
