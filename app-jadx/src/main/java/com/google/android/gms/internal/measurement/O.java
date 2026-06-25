package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class O implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f39521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39522b;

    protected O(IBinder iBinder, String str) {
        this.f39521a = iBinder;
        this.f39522b = str;
    }

    protected final Parcel G3() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f39522b);
        return parcelObtain;
    }

    protected final void H3(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f39521a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void I3(int i10, Parcel parcel) {
        try {
            this.f39521a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f39521a;
    }

    protected final Parcel c(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f39521a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}
