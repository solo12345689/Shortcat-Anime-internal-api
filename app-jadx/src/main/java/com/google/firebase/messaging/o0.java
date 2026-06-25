package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.r0;
import n9.InterfaceC5760d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class o0 extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f43502a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        n9.i a(Intent intent);
    }

    o0(a aVar) {
        this.f43502a = aVar;
    }

    void b(final r0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f43502a.a(aVar.f43514a).b(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5760d() { // from class: com.google.firebase.messaging.n0
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                aVar.d();
            }
        });
    }
}
