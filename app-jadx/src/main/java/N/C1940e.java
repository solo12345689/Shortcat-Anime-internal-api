package N;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: N.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1940e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1940e f12491a = new C1940e();

    private C1940e() {
    }

    public final void a(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }
}
