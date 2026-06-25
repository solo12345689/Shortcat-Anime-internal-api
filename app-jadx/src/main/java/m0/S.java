package m0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class S implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AutofillManager f52928a;

    public S(AutofillManager autofillManager) {
        this.f52928a = autofillManager;
    }

    @Override // m0.M
    public void a(View view, int i10, AutofillValue autofillValue) {
        this.f52928a.notifyValueChanged(view, i10, autofillValue);
    }

    @Override // m0.M
    public void b(View view, int i10) {
        this.f52928a.notifyViewExited(view, i10);
    }

    @Override // m0.M
    public void c(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 27) {
            z.f52949a.a(view, this.f52928a, i10, z10);
        }
    }

    @Override // m0.M
    public void commit() {
        this.f52928a.commit();
    }

    @Override // m0.M
    public void d(View view, int i10, Rect rect) {
        this.f52928a.notifyViewEntered(view, i10, rect);
    }
}
