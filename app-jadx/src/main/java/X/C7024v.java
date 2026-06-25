package x;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: x.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7024v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C7024v f63377a = new C7024v();

    private C7024v() {
    }

    public final EdgeEffect a(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? C7005c.f63330a.a(context, null) : new C6985E(context);
    }

    public final float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C7005c.f63330a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void c(EdgeEffect edgeEffect, int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i10);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i10);
        }
    }

    public final float d(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C7005c.f63330a.c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }

    public final void e(EdgeEffect edgeEffect, float f10) {
        if (edgeEffect instanceof C6985E) {
            ((C6985E) edgeEffect).a(f10);
        } else {
            edgeEffect.onRelease();
        }
    }
}
