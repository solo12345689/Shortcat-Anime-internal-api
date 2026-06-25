package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.o0;
import java.util.concurrent.ExecutorService;
import n9.InterfaceC5760d;

/* JADX INFO: renamed from: com.google.firebase.messaging.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractServiceC3971i extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Binder f43459b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43461d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ExecutorService f43458a = AbstractC3977o.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f43460c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43462e = 0;

    /* JADX INFO: renamed from: com.google.firebase.messaging.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements o0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.o0.a
        public n9.i a(Intent intent) {
            return AbstractServiceC3971i.this.h(intent);
        }
    }

    public static /* synthetic */ void a(AbstractServiceC3971i abstractServiceC3971i, Intent intent, n9.j jVar) {
        abstractServiceC3971i.getClass();
        try {
            abstractServiceC3971i.f(intent);
        } finally {
            jVar.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        if (intent != null) {
            m0.c(intent);
        }
        synchronized (this.f43460c) {
            try {
                int i10 = this.f43462e - 1;
                this.f43462e = i10;
                if (i10 == 0) {
                    i(this.f43461d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n9.i h(final Intent intent) {
        if (g(intent)) {
            return n9.l.f(null);
        }
        final n9.j jVar = new n9.j();
        this.f43458a.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC3971i.a(this.f43451a, intent, jVar);
            }
        });
        return jVar.a();
    }

    protected abstract Intent e(Intent intent);

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean i(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f43459b == null) {
                this.f43459b = new o0(new a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f43459b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f43458a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.f43460c) {
            this.f43461d = i11;
            this.f43462e++;
        }
        Intent intentE = e(intent);
        if (intentE == null) {
            d(intent);
            return 2;
        }
        n9.i iVarH = h(intentE);
        if (iVarH.n()) {
            d(intent);
            return 2;
        }
        iVarH.b(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5760d() { // from class: com.google.firebase.messaging.g
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                this.f43445a.d(intent);
            }
        });
        return 3;
    }
}
