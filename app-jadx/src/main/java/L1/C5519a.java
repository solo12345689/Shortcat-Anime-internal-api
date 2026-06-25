package l1;

import android.util.Log;

/* JADX INFO: renamed from: l1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5519a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5519a f52421a = new C5519a();

    private C5519a() {
    }

    public final String a(int i10) {
        if (i10 == 0) {
            return "top";
        }
        if (i10 == 1) {
            return "bottom";
        }
        Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
        return "top";
    }

    public final String b(int i10) {
        if (i10 == -2) {
            return "start";
        }
        if (i10 == -1) {
            return "end";
        }
        if (i10 == 0) {
            return "left";
        }
        if (i10 == 1) {
            return "right";
        }
        Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
        return "start";
    }
}
