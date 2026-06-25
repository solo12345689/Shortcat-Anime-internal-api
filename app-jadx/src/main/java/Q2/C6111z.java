package q2;

import android.os.Bundle;
import java.util.Objects;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: q2.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6111z extends S {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f57078d = t2.a0.H0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f57079e = t2.a0.H0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f57080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f57081c;

    public C6111z() {
        this.f57080b = false;
        this.f57081c = false;
    }

    public static C6111z d(Bundle bundle) {
        AbstractC6614a.a(bundle.getInt(S.f56627a, -1) == 0);
        return bundle.getBoolean(f57078d, false) ? new C6111z(bundle.getBoolean(f57079e, false)) : new C6111z();
    }

    @Override // q2.S
    public boolean b() {
        return this.f57080b;
    }

    @Override // q2.S
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(S.f56627a, 0);
        bundle.putBoolean(f57078d, this.f57080b);
        bundle.putBoolean(f57079e, this.f57081c);
        return bundle;
    }

    public boolean e() {
        return this.f57081c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6111z)) {
            return false;
        }
        C6111z c6111z = (C6111z) obj;
        return this.f57081c == c6111z.f57081c && this.f57080b == c6111z.f57080b;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f57080b), Boolean.valueOf(this.f57081c));
    }

    public C6111z(boolean z10) {
        this.f57080b = true;
        this.f57081c = z10;
    }
}
