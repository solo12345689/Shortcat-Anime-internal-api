package E3;

import P9.AbstractC2011u;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class T6 {

    /* JADX INFO: renamed from: d */
    static final AbstractC2011u f4969d = AbstractC2011u.B(40010);

    /* JADX INFO: renamed from: e */
    static final AbstractC2011u f4970e = AbstractC2011u.I(50000, 50001, 50002, 50003, 50004, 50005, 50006);

    /* JADX INFO: renamed from: f */
    private static final String f4971f = t2.a0.H0(0);

    /* JADX INFO: renamed from: g */
    private static final String f4972g = t2.a0.H0(1);

    /* JADX INFO: renamed from: h */
    private static final String f4973h = t2.a0.H0(2);

    /* JADX INFO: renamed from: a */
    public final int f4974a;

    /* JADX INFO: renamed from: b */
    public final String f4975b;

    /* JADX INFO: renamed from: c */
    public final Bundle f4976c;

    public T6(int i10) {
        AbstractC6614a.b(i10 != 0, "commandCode shouldn't be COMMAND_CODE_CUSTOM");
        this.f4974a = i10;
        this.f4975b = "";
        this.f4976c = Bundle.EMPTY;
    }

    public static T6 a(Bundle bundle) {
        int i10 = bundle.getInt(f4971f, 0);
        if (i10 != 0) {
            return new T6(i10);
        }
        String str = (String) AbstractC6614a.e(bundle.getString(f4972g));
        Bundle bundle2 = bundle.getBundle(f4973h);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new T6(str, bundle2);
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f4971f, this.f4974a);
        bundle.putString(f4972g, this.f4975b);
        bundle.putBundle(f4973h, this.f4976c);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof T6)) {
            return false;
        }
        T6 t62 = (T6) obj;
        return this.f4974a == t62.f4974a && TextUtils.equals(this.f4975b, t62.f4975b);
    }

    public int hashCode() {
        return Objects.hash(this.f4975b, Integer.valueOf(this.f4974a));
    }

    public T6(String str, Bundle bundle) {
        this.f4974a = 0;
        this.f4975b = (String) AbstractC6614a.e(str);
        this.f4976c = new Bundle((Bundle) AbstractC6614a.e(bundle));
    }
}
