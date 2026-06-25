package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2691d1 {
    private static final float a(float f10) {
        return (float) (f10 >= 0.0f ? Math.ceil(f10) : Math.floor(f10));
    }

    public static final int b(float f10) {
        return ((int) a(f10)) * (-1);
    }
}
