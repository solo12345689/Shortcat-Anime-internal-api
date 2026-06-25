package R8;

import Q8.InterfaceC2061i;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class D extends E {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Intent f15205a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ InterfaceC2061i f15206b;

    D(Intent intent, InterfaceC2061i interfaceC2061i, int i10) {
        this.f15205a = intent;
        this.f15206b = interfaceC2061i;
    }

    @Override // R8.E
    public final void a() {
        Intent intent = this.f15205a;
        if (intent != null) {
            this.f15206b.startActivityForResult(intent, 2);
        }
    }
}
