package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28947b;

    public H(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f28946a | this.f28947b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f28947b = i10;
        } else {
            this.f28946a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f28947b = 0;
        } else {
            this.f28946a = 0;
        }
    }
}
