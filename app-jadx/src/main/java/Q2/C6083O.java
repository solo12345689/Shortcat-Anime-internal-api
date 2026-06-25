package q2;

import android.os.Bundle;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: q2.O, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6083O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C6083O f56598d = new C6083O(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f56599e = t2.a0.H0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f56600f = t2.a0.H0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f56601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f56602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f56603c;

    public C6083O(float f10) {
        this(f10, 1.0f);
    }

    public static C6083O a(Bundle bundle) {
        return new C6083O(bundle.getFloat(f56599e, 1.0f), bundle.getFloat(f56600f, 1.0f));
    }

    public long b(long j10) {
        return j10 * ((long) this.f56603c);
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f56599e, this.f56601a);
        bundle.putFloat(f56600f, this.f56602b);
        return bundle;
    }

    public C6083O d(float f10) {
        return new C6083O(f10, this.f56602b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6083O.class == obj.getClass()) {
            C6083O c6083o = (C6083O) obj;
            if (this.f56601a == c6083o.f56601a && this.f56602b == c6083o.f56602b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f56601a)) * 31) + Float.floatToRawIntBits(this.f56602b);
    }

    public String toString() {
        return t2.a0.I("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f56601a), Float.valueOf(this.f56602b));
    }

    public C6083O(float f10, float f11) {
        AbstractC6614a.a(f10 > 0.0f);
        AbstractC6614a.a(f11 > 0.0f);
        this.f56601a = f10;
        this.f56602b = f11;
        this.f56603c = Math.round(f10 * 1000.0f);
    }
}
