package s0;

import android.graphics.RenderEffect;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f59003a = new z1();

    private z1() {
    }

    public final RenderEffect a(u1 u1Var, float f10, float f11, int i10) {
        return (f10 == 0.0f && f11 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : u1Var == null ? RenderEffect.createBlurEffect(f10, f11, X.a(i10)) : RenderEffect.createBlurEffect(f10, f11, u1Var.a(), X.a(i10));
    }
}
