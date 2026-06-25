package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.AbstractServiceC2868w;
import androidx.work.impl.background.systemalarm.g;
import i4.i;
import o4.x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SystemAlarmService extends AbstractServiceC2868w implements g.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f32787d = i.i("SystemAlarmService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f32788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32789c;

    private void e() {
        g gVar = new g(this);
        this.f32788b = gVar;
        gVar.l(this);
    }

    @Override // androidx.work.impl.background.systemalarm.g.c
    public void b() {
        this.f32789c = true;
        i.e().a(f32787d, "All commands completed in dispatcher");
        x.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC2868w, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f32789c = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC2868w, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f32789c = true;
        this.f32788b.j();
    }

    @Override // androidx.lifecycle.AbstractServiceC2868w, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f32789c) {
            i.e().f(f32787d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f32788b.j();
            e();
            this.f32789c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f32788b.a(intent, i11);
        return 3;
    }
}
