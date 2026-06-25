package V0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: V0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2293i {
    public static /* synthetic */ BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f10, float f11, BoringLayout.Metrics metrics, boolean z10, TextUtils.TruncateAt truncateAt, int i11, boolean z11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, f10, f11, metrics, z10, truncateAt, i11, z11);
    }
}
