package E3;

import E3.Y6;
import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Objects;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class Z6 implements Y6.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f5096k = t2.a0.H0(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f5097l = t2.a0.H0(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f5098m = t2.a0.H0(2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f5099n = t2.a0.H0(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f5100o = t2.a0.H0(4);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f5101p = t2.a0.H0(5);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f5102q = t2.a0.H0(6);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f5103r = t2.a0.H0(7);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f5104s = t2.a0.H0(8);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f5105t = t2.a0.H0(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ComponentName f5112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final IBinder f5113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Bundle f5114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final MediaSession.Token f5115j;

    public Z6(int i10, int i11, int i12, int i13, String str, r rVar, Bundle bundle, MediaSession.Token token) {
        this(i10, i11, i12, i13, (String) AbstractC6614a.e(str), "", null, rVar.asBinder(), (Bundle) AbstractC6614a.e(bundle), token);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Z6)) {
            return false;
        }
        Z6 z62 = (Z6) obj;
        return this.f5106a == z62.f5106a && this.f5107b == z62.f5107b && this.f5108c == z62.f5108c && this.f5109d == z62.f5109d && TextUtils.equals(this.f5110e, z62.f5110e) && TextUtils.equals(this.f5111f, z62.f5111f) && Objects.equals(this.f5112g, z62.f5112g) && Objects.equals(this.f5113h, z62.f5113h) && Objects.equals(this.f5115j, z62.f5115j);
    }

    @Override // E3.Y6.a
    public Bundle getExtras() {
        return new Bundle(this.f5114i);
    }

    @Override // E3.Y6.a
    public int getType() {
        return this.f5107b;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5106a), Integer.valueOf(this.f5107b), Integer.valueOf(this.f5108c), Integer.valueOf(this.f5109d), this.f5110e, this.f5111f, this.f5112g, this.f5113h, this.f5115j);
    }

    @Override // E3.Y6.a
    public String r() {
        return this.f5110e;
    }

    @Override // E3.Y6.a
    public int s() {
        return this.f5106a;
    }

    @Override // E3.Y6.a
    public String t() {
        return this.f5111f;
    }

    public String toString() {
        return "SessionToken {pkg=" + this.f5110e + " type=" + this.f5107b + " libraryVersion=" + this.f5108c + " interfaceVersion=" + this.f5109d + " service=" + this.f5111f + " IMediaSession=" + this.f5113h + " extras=" + this.f5114i + "}";
    }

    @Override // E3.Y6.a
    public Bundle u() {
        Bundle bundle = new Bundle();
        bundle.putInt(f5096k, this.f5106a);
        bundle.putInt(f5097l, this.f5107b);
        bundle.putInt(f5098m, this.f5108c);
        bundle.putString(f5099n, this.f5110e);
        bundle.putString(f5100o, this.f5111f);
        androidx.core.app.h.b(bundle, f5102q, this.f5113h);
        bundle.putParcelable(f5101p, this.f5112g);
        bundle.putBundle(f5103r, this.f5114i);
        bundle.putInt(f5104s, this.f5109d);
        MediaSession.Token token = this.f5115j;
        if (token != null) {
            bundle.putParcelable(f5105t, token);
        }
        return bundle;
    }

    @Override // E3.Y6.a
    public Object v() {
        return this.f5113h;
    }

    @Override // E3.Y6.a
    public int w() {
        return this.f5109d;
    }

    @Override // E3.Y6.a
    public ComponentName x() {
        return this.f5112g;
    }

    @Override // E3.Y6.a
    public boolean y() {
        return false;
    }

    @Override // E3.Y6.a
    public MediaSession.Token z() {
        return this.f5115j;
    }

    private Z6(int i10, int i11, int i12, int i13, String str, String str2, ComponentName componentName, IBinder iBinder, Bundle bundle, MediaSession.Token token) {
        this.f5106a = i10;
        this.f5107b = i11;
        this.f5108c = i12;
        this.f5109d = i13;
        this.f5110e = str;
        this.f5111f = str2;
        this.f5112g = componentName;
        this.f5113h = iBinder;
        this.f5114i = bundle;
        this.f5115j = token;
    }
}
