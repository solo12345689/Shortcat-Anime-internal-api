package com.adjust.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.revenuecat.purchases.google.history.BillingConstants;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class GooglePlayServicesClient {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class GooglePlayServicesInfo {
        private final String gpsAdid;
        private final Boolean trackingEnabled;

        public GooglePlayServicesInfo(String str, Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }

        public String getGpsAdid() {
            return this.gpsAdid;
        }

        public Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IBinder f34037a;

        public b(IBinder iBinder) {
            this.f34037a = iBinder;
        }

        public final Boolean G3() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.f34037a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                boolean z10 = parcelObtain2.readInt() != 0;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return Boolean.valueOf(!z10);
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }

        public final String a() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f34037a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f34037a;
        }
    }

    public static GooglePlayServicesInfo getGooglePlayServicesInfo(Context context, long j10) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
        }
        context.getPackageManager().getPackageInfo(BillingConstants.VENDING_PACKAGE, 0);
        a aVar = new a(j10);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aVar, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                b bVar = new b(aVar.a());
                return new GooglePlayServicesInfo(bVar.a(), bVar.G3());
            } catch (Exception e10) {
                throw e10;
            }
        } finally {
            context.unbindService(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f34034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f34035b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinkedBlockingQueue f34036c = new LinkedBlockingQueue(1);

        public a(long j10) {
            this.f34034a = j10;
        }

        public final IBinder a() {
            if (this.f34035b) {
                throw new IllegalStateException();
            }
            this.f34035b = true;
            return (IBinder) this.f34036c.poll(this.f34034a, TimeUnit.MILLISECONDS);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f34036c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
