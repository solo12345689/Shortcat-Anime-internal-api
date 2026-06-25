package q2;

import android.os.Bundle;
import com.facebook.imageutils.JfifUtil;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0 f56919e = new l0(0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f56920f = t2.a0.H0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f56921g = t2.a0.H0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f56922h = t2.a0.H0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f56926d;

    public l0(int i10, int i11) {
        this(i10, i11, 1.0f);
    }

    public static l0 a(Bundle bundle) {
        return new l0(bundle.getInt(f56920f, 0), bundle.getInt(f56921g, 0), bundle.getFloat(f56922h, 1.0f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        int i10 = this.f56923a;
        if (i10 != 0) {
            bundle.putInt(f56920f, i10);
        }
        int i11 = this.f56924b;
        if (i11 != 0) {
            bundle.putInt(f56921g, i11);
        }
        float f10 = this.f56926d;
        if (f10 != 1.0f) {
            bundle.putFloat(f56922h, f10);
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            if (this.f56923a == l0Var.f56923a && this.f56924b == l0Var.f56924b && this.f56926d == l0Var.f56926d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((JfifUtil.MARKER_EOI + this.f56923a) * 31) + this.f56924b) * 31) + Float.floatToRawIntBits(this.f56926d);
    }

    public l0(int i10, int i11, float f10) {
        this.f56923a = i10;
        this.f56924b = i11;
        this.f56925c = 0;
        this.f56926d = f10;
    }
}
