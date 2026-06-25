package R8;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C extends E {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Intent f15202a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Activity f15203b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f15204c;

    C(Intent intent, Activity activity, int i10) {
        this.f15202a = intent;
        this.f15203b = activity;
        this.f15204c = i10;
    }

    @Override // R8.E
    public final void a() {
        Intent intent = this.f15202a;
        if (intent != null) {
            this.f15203b.startActivityForResult(intent, this.f15204c);
        }
    }
}
