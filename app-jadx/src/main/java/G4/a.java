package G4;

import Gf.C0;
import androidx.lifecycle.AbstractC2857k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2857k f7228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0 f7229b;

    public a(AbstractC2857k abstractC2857k, C0 c02) {
        this.f7228a = abstractC2857k;
        this.f7229b = c02;
    }

    @Override // G4.o
    public void E() {
        this.f7228a.removeObserver(this);
    }

    public void a() {
        C0.a.a(this.f7229b, null, 1, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(androidx.lifecycle.r rVar) {
        a();
    }

    @Override // G4.o
    public void start() {
        this.f7228a.addObserver(this);
    }
}
