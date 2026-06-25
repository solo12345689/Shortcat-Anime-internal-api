package H9;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8188a;

    public a(float f10) {
        this.f8188a = f10;
    }

    @Override // H9.d
    public float a(RectF rectF) {
        return this.f8188a;
    }

    public float b() {
        return this.f8188a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f8188a == ((a) obj).f8188a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8188a)});
    }

    public String toString() {
        return b() + "px";
    }
}
