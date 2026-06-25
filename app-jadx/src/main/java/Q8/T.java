package Q8;

import l9.C5581l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class T implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5581l f14436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ V f14437b;

    T(V v10, C5581l c5581l) {
        this.f14437b = v10;
        this.f14436a = c5581l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V.I3(this.f14437b, this.f14436a);
    }
}
