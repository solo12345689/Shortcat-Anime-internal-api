package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1 f27495a = new t1();

    private t1() {
    }

    public final ActionMode a(View view, ActionMode.Callback callback, int i10) {
        return view.startActionMode(callback, i10);
    }
}
