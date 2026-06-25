package Q8;

import android.app.Dialog;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class e0 extends K {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Dialog f14483a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ f0 f14484b;

    e0(f0 f0Var, Dialog dialog) {
        this.f14484b = f0Var;
        this.f14483a = dialog;
    }

    @Override // Q8.K
    public final void a() {
        this.f14484b.f14486b.o();
        if (this.f14483a.isShowing()) {
            this.f14483a.dismiss();
        }
    }
}
