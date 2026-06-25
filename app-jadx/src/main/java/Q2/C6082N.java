package q2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import t2.InterfaceC6623j;

/* JADX INFO: renamed from: q2.N, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6082N extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f56589d = t2.a0.H0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f56590e = t2.a0.H0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f56591f = t2.a0.H0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f56592g = t2.a0.H0(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f56593h = t2.a0.H0(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f56594i = t2.a0.H0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f56596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f56597c;

    public C6082N(String str, Throwable th2, int i10, Bundle bundle) {
        this(str, th2, i10, bundle, InterfaceC6623j.f60596a.c());
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    private static Throwable b(Class cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    public static C6082N d(Bundle bundle) {
        return new C6082N(bundle);
    }

    private static Throwable e(Bundle bundle) {
        String string = bundle.getString(f56592g);
        String string2 = bundle.getString(f56593h);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, C6082N.class.getClassLoader());
            Throwable thB = Throwable.class.isAssignableFrom(cls) ? b(cls, string2) : null;
            return thB == null ? a(string2) : thB;
        } catch (Throwable unused) {
            return a(string2);
        }
    }

    private static Bundle f(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f56594i);
        return bundle2 != null ? bundle2 : Bundle.EMPTY;
    }

    public boolean c(C6082N c6082n) {
        if (this == c6082n) {
            return true;
        }
        if (c6082n != null && getClass() == c6082n.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = c6082n.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!Objects.equals(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (this.f56595a == c6082n.f56595a && Objects.equals(getMessage(), c6082n.getMessage()) && this.f56596b == c6082n.f56596b) {
                return true;
            }
        }
        return false;
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putInt(f56589d, this.f56595a);
        bundle.putLong(f56590e, this.f56596b);
        bundle.putString(f56591f, getMessage());
        bundle.putBundle(f56594i, this.f56597c);
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f56592g, cause.getClass().getName());
            bundle.putString(f56593h, cause.getMessage());
        }
        return bundle;
    }

    protected C6082N(Bundle bundle) {
        this(bundle.getString(f56591f), e(bundle), bundle.getInt(f56589d, 1000), f(bundle), bundle.getLong(f56590e, SystemClock.elapsedRealtime()));
    }

    protected C6082N(String str, Throwable th2, int i10, Bundle bundle, long j10) {
        super(str, th2);
        this.f56595a = i10;
        this.f56597c = bundle;
        this.f56596b = j10;
    }
}
