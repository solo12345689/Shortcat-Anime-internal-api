package q2;

import android.os.Bundle;
import java.util.Objects;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: q2.M, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6081M extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f56587c = t2.a0.H0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f56588b;

    public C6081M() {
        this.f56588b = -1.0f;
    }

    public static C6081M d(Bundle bundle) {
        AbstractC6614a.a(bundle.getInt(S.f56627a, -1) == 1);
        float f10 = bundle.getFloat(f56587c, -1.0f);
        return f10 == -1.0f ? new C6081M() : new C6081M(f10);
    }

    @Override // q2.S
    public boolean b() {
        return this.f56588b != -1.0f;
    }

    @Override // q2.S
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(S.f56627a, 1);
        bundle.putFloat(f56587c, this.f56588b);
        return bundle;
    }

    public float e() {
        return this.f56588b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6081M) && this.f56588b == ((C6081M) obj).f56588b;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.f56588b));
    }

    public C6081M(float f10) {
        AbstractC6614a.b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f56588b = f10;
    }
}
