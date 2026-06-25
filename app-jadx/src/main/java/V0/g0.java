package V0;

import android.text.StaticLayout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f19637a = new g0();

    private g0() {
    }

    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i10, int i11) {
        builder.setLineBreakConfig(f0.a().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
