package o4;

import androidx.work.impl.E;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class v implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f54513d = i4.i.i("StopWorkRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f54514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.v f54515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f54516c;

    public v(E e10, androidx.work.impl.v vVar, boolean z10) {
        this.f54514a = e10;
        this.f54515b = vVar;
        this.f54516c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zR = this.f54516c ? this.f54514a.s().r(this.f54515b) : this.f54514a.s().s(this.f54515b);
        i4.i.e().a(f54513d, "StopWorkRunnable for " + this.f54515b.a().b() + "; Processor.stopWork = " + zR);
    }
}
