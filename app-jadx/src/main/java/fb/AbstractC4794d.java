package fb;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.L0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: fb.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4794d {
    public static final A1.b a(View view, int i10, WindowInsets windowInsets, boolean z10) {
        AbstractC5504s.h(view, "<this>");
        if (windowInsets == null) {
            A1.b NONE = A1.b.f103e;
            AbstractC5504s.g(NONE, "NONE");
            return NONE;
        }
        L0 l0Z = L0.z(windowInsets);
        AbstractC5504s.g(l0Z, "toWindowInsetsCompat(...)");
        if (z10) {
            A1.b bVarG = l0Z.g(i10);
            AbstractC5504s.e(bVarG);
            return bVarG;
        }
        A1.b bVarF = l0Z.f(i10);
        AbstractC5504s.e(bVarF);
        return bVarF;
    }

    public static /* synthetic */ A1.b b(View view, int i10, WindowInsets windowInsets, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            windowInsets = view.getRootWindowInsets();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return a(view, i10, windowInsets, z10);
    }
}
