package m0;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f52949a = new z();

    private z() {
    }

    public final void a(View view, AutofillManager autofillManager, int i10, boolean z10) {
        autofillManager.notifyViewVisibilityChanged(view, i10, z10);
    }
}
