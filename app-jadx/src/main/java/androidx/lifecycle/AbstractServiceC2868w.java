package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC2868w extends Service implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S f30261a = new S(this);

    @Override // androidx.lifecycle.r
    public AbstractC2857k getLifecycle() {
        return this.f30261a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC5504s.h(intent, "intent");
        this.f30261a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f30261a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f30261a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f30261a.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
