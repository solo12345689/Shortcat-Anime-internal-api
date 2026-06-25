package q2;

import android.os.Bundle;
import java.util.Objects;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class V extends S {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f56638d = t2.a0.H0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f56639e = t2.a0.H0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f56640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f56641c;

    public V() {
        this.f56640b = false;
        this.f56641c = false;
    }

    public static V d(Bundle bundle) {
        AbstractC6614a.a(bundle.getInt(S.f56627a, -1) == 3);
        return bundle.getBoolean(f56638d, false) ? new V(bundle.getBoolean(f56639e, false)) : new V();
    }

    @Override // q2.S
    public boolean b() {
        return this.f56640b;
    }

    @Override // q2.S
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(S.f56627a, 3);
        bundle.putBoolean(f56638d, this.f56640b);
        bundle.putBoolean(f56639e, this.f56641c);
        return bundle;
    }

    public boolean e() {
        return this.f56641c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return this.f56641c == v10.f56641c && this.f56640b == v10.f56640b;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f56640b), Boolean.valueOf(this.f56641c));
    }

    public V(boolean z10) {
        this.f56640b = true;
        this.f56641c = z10;
    }
}
