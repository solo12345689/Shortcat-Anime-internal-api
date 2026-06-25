package H9;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f8189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f8190b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f8189a;
            f10 += ((b) dVar).f8190b;
        }
        this.f8189a = dVar;
        this.f8190b = f10;
    }

    @Override // H9.d
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f8189a.a(rectF) + this.f8190b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8189a.equals(bVar.f8189a) && this.f8190b == bVar.f8190b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8189a, Float.valueOf(this.f8190b)});
    }
}
