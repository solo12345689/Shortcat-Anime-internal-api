package com.android.installreferrer.api;

import D8.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.revenuecat.purchases.google.history.BillingConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class InstallReferrerClientImpl extends InstallReferrerClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35559a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f35560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private D8.a f35561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ServiceConnection f35562d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InstallReferrerStateListener f35563a;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
            InstallReferrerClientImpl.this.f35561c = a.AbstractBinderC0040a.c(iBinder);
            InstallReferrerClientImpl.this.f35559a = 2;
            this.f35563a.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.f35561c = null;
            InstallReferrerClientImpl.this.f35559a = 0;
            this.f35563a.onInstallReferrerServiceDisconnected();
        }

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f35563a = installReferrerStateListener;
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.f35560b = context.getApplicationContext();
    }

    private boolean c() {
        return this.f35560b.getPackageManager().getPackageInfo(BillingConstants.VENDING_PACKAGE, 128).versionCode >= 80837300;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.f35559a = 3;
        if (this.f35562d != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.f35560b.unbindService(this.f35562d);
            this.f35562d = null;
        }
        this.f35561c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f35560b.getPackageName());
        try {
            return new ReferrerDetails(this.f35561c.p0(bundle));
        } catch (RemoteException e10) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f35559a = 0;
            throw e10;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.f35559a != 2 || this.f35561c == null || this.f35562d == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i10 = this.f35559a;
        if (i10 == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i10 == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName(BillingConstants.VENDING_PACKAGE, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.f35560b.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f35559a = 0;
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!BillingConstants.VENDING_PACKAGE.equals(str) || str2 == null || !c()) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f35559a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        Intent intent2 = new Intent(intent);
        b bVar = new b(installReferrerStateListener);
        this.f35562d = bVar;
        try {
            if (this.f35560b.bindService(intent2, bVar, 1)) {
                InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
            this.f35559a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(1);
        } catch (SecurityException unused) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "No permission to connect to service.");
            this.f35559a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(4);
        }
    }
}
