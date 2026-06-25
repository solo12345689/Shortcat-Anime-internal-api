package q2;

import android.os.Bundle;
import java.util.Objects;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class T extends S {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f56628d = t2.a0.H0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f56629e = t2.a0.H0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f56631c;

    public T(int i10) {
        AbstractC6614a.b(i10 > 0, "maxStars must be a positive integer");
        this.f56630b = i10;
        this.f56631c = -1.0f;
    }

    public static T d(Bundle bundle) {
        AbstractC6614a.a(bundle.getInt(S.f56627a, -1) == 2);
        int i10 = bundle.getInt(f56628d, 5);
        float f10 = bundle.getFloat(f56629e, -1.0f);
        return f10 == -1.0f ? new T(i10) : new T(i10, f10);
    }

    @Override // q2.S
    public boolean b() {
        return this.f56631c != -1.0f;
    }

    @Override // q2.S
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(S.f56627a, 2);
        bundle.putInt(f56628d, this.f56630b);
        bundle.putFloat(f56629e, this.f56631c);
        return bundle;
    }

    public int e() {
        return this.f56630b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        return this.f56630b == t10.f56630b && this.f56631c == t10.f56631c;
    }

    public float f() {
        return this.f56631c;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f56630b), Float.valueOf(this.f56631c));
    }

    public T(int i10, float f10) {
        boolean z10 = false;
        AbstractC6614a.b(i10 > 0, "maxStars must be a positive integer");
        if (f10 >= 0.0f && f10 <= i10) {
            z10 = true;
        }
        AbstractC6614a.b(z10, "starRating is out of range [0, maxStars]");
        this.f56630b = i10;
        this.f56631c = f10;
    }
}
