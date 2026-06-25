package V0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import b1.AbstractC2968a;

/* JADX INFO: renamed from: V0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2295k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2295k f19643a = new C2295k();

    private C2295k() {
    }

    public final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z10, boolean z11, TextUtils.TruncateAt truncateAt, int i11) {
        if (!(i10 >= 0)) {
            AbstractC2968a.a("negative width");
        }
        if (!(i11 >= 0)) {
            AbstractC2968a.a("negative ellipsized width");
        }
        return Build.VERSION.SDK_INT >= 33 ? C2294j.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, z11, truncateAt, i11) : C2296l.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i11);
    }

    public final boolean b(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C2294j.c(boringLayout);
        }
        return false;
    }

    public final BoringLayout.Metrics c(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? C2294j.b(charSequence, textPaint, textDirectionHeuristic) : C2296l.b(charSequence, textPaint, textDirectionHeuristic);
    }
}
