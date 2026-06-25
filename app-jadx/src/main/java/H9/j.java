package H9;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8254a;

    public j(float f10) {
        this.f8254a = f10;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // H9.d
    public float a(RectF rectF) {
        return this.f8254a * b(rectF);
    }

    public float c() {
        return this.f8254a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f8254a == ((j) obj).f8254a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8254a)});
    }

    public String toString() {
        return ((int) (c() * 100.0f)) + "%";
    }
}
