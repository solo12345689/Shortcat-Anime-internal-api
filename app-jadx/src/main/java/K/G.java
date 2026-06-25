package K;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.R;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public enum G {
    Cut(R.string.cut),
    Copy(R.string.copy),
    Paste(R.string.paste),
    SelectAll(R.string.selectAll);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9757a;

    G(int i10) {
        this.f9757a = i10;
    }

    public final String b(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-309609081, i10, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:89)");
        }
        String strA = P0.f.a(this.f9757a, interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return strA;
    }
}
