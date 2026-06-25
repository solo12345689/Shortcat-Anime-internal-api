package N;

import android.view.inputmethod.CursorAnchorInfo;
import r0.C6226h;
import s0.s1;

/* JADX INFO: renamed from: N.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1947l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1947l f12497a = new C1947l();

    private C1947l() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, C6226h c6226h) {
        return builder.setEditorBoundsInfo(AbstractC1946k.a().setEditorBounds(s1.c(c6226h)).setHandwritingBounds(s1.c(c6226h)).build());
    }
}
