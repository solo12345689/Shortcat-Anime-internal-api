package q2;

import android.os.Bundle;
import java.util.Objects;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: q2.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6070B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f56316c = t2.a0.H0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f56317d = t2.a0.H0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56319b;

    public C6070B(String str, String str2) {
        this.f56318a = t2.a0.Y0(str);
        this.f56319b = str2;
    }

    public static C6070B a(Bundle bundle) {
        return new C6070B(bundle.getString(f56316c), (String) AbstractC6614a.e(bundle.getString(f56317d)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f56318a;
        if (str != null) {
            bundle.putString(f56316c, str);
        }
        bundle.putString(f56317d, this.f56319b);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6070B c6070b = (C6070B) obj;
            if (Objects.equals(this.f56318a, c6070b.f56318a) && Objects.equals(this.f56319b, c6070b.f56319b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f56319b.hashCode() * 31;
        String str = this.f56318a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
