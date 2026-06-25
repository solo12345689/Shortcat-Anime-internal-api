package H9;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8191a;

    public c(float f10) {
        this.f8191a = f10;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // H9.d
    public float a(RectF rectF) {
        return E1.a.a(this.f8191a, 0.0f, b(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f8191a == ((c) obj).f8191a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8191a)});
    }
}
