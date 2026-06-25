package E3;

import android.os.Bundle;
import java.util.Objects;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class V6 {

    /* JADX INFO: renamed from: d */
    private static final String f5005d = t2.a0.H0(0);

    /* JADX INFO: renamed from: e */
    private static final String f5006e = t2.a0.H0(1);

    /* JADX INFO: renamed from: f */
    private static final String f5007f = t2.a0.H0(2);

    /* JADX INFO: renamed from: a */
    public int f5008a;

    /* JADX INFO: renamed from: b */
    public String f5009b;

    /* JADX INFO: renamed from: c */
    public Bundle f5010c;

    public V6(int i10, String str) {
        this(i10, str, Bundle.EMPTY);
    }

    public static V6 a(Bundle bundle) {
        int i10 = bundle.getInt(f5005d, 1000);
        String string = bundle.getString(f5006e, "");
        Bundle bundle2 = bundle.getBundle(f5007f);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new V6(i10, string, bundle2);
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f5005d, this.f5008a);
        bundle.putString(f5006e, this.f5009b);
        if (!this.f5010c.isEmpty()) {
            bundle.putBundle(f5007f, this.f5010c);
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6)) {
            return false;
        }
        V6 v62 = (V6) obj;
        return this.f5008a == v62.f5008a && Objects.equals(this.f5009b, v62.f5009b);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5008a), this.f5009b);
    }

    public V6(int i10, String str, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        AbstractC6614a.a(z10);
        this.f5008a = i10;
        this.f5009b = str;
        this.f5010c = bundle;
    }
}
