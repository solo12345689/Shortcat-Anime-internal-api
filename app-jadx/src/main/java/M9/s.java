package M9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class s implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ t f12295a;

    /* synthetic */ s(t tVar, r rVar) {
        this.f12295a = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f12295a.f12298b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        t tVar = this.f12295a;
        tVar.c().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f12295a.f12298b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        t tVar = this.f12295a;
        tVar.c().post(new q(this));
    }
}
