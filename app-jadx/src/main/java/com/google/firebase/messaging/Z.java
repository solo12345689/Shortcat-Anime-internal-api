package com.google.firebase.messaging;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import n9.InterfaceC5757a;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f43388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f43389b = new C6551a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        n9.i start();
    }

    Z(Executor executor) {
        this.f43388a = executor;
    }

    public static /* synthetic */ n9.i a(Z z10, String str, n9.i iVar) {
        synchronized (z10) {
            z10.f43389b.remove(str);
        }
        return iVar;
    }

    synchronized n9.i b(final String str, a aVar) {
        n9.i iVar = (n9.i) this.f43389b.get(str);
        if (iVar != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return iVar;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        n9.i iVarI = aVar.start().i(this.f43388a, new InterfaceC5757a() { // from class: com.google.firebase.messaging.Y
            @Override // n9.InterfaceC5757a
            public final Object a(n9.i iVar2) {
                return Z.a(this.f43386a, str, iVar2);
            }
        });
        this.f43389b.put(str, iVarI);
        return iVarI;
    }
}
