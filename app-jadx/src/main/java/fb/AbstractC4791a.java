package fb;

import android.view.View;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.L0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: fb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4791a {
    public static final int a(View decorView) {
        AbstractC5504s.h(decorView, "decorView");
        L0 l0F = AbstractC2747a0.F(decorView);
        if (l0F == null) {
            return 0;
        }
        return b(l0F);
    }

    private static final int b(L0 l02) {
        return l02.f(L0.p.i() | L0.p.c()).f105b;
    }

    public static final Boolean c(View decorView) {
        AbstractC5504s.h(decorView, "decorView");
        L0 l0F = AbstractC2747a0.F(decorView);
        if (l0F == null) {
            return null;
        }
        return Boolean.valueOf(l0F.r(L0.p.d()));
    }
}
