package M9;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class p extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f12292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ s f12293c;

    p(s sVar, IBinder iBinder) {
        this.f12293c = sVar;
        this.f12292b = iBinder;
    }

    @Override // M9.j
    public final void a() {
        this.f12293c.f12295a.f12309m = e.e(this.f12292b);
        t.n(this.f12293c.f12295a);
        this.f12293c.f12295a.f12303g = false;
        Iterator it = this.f12293c.f12295a.f12300d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f12293c.f12295a.f12300d.clear();
    }
}
