package io.sentry;

import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class B3 {

    /* JADX INFO: renamed from: u */
    private static final List f49061u = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));

    /* JADX INFO: renamed from: a */
    private Double f49062a;

    /* JADX INFO: renamed from: b */
    private Double f49063b;

    /* JADX INFO: renamed from: m */
    private io.sentry.protocol.r f49074m;

    /* JADX INFO: renamed from: p */
    private List f49077p;

    /* JADX INFO: renamed from: q */
    private List f49078q;

    /* JADX INFO: renamed from: r */
    private boolean f49079r;

    /* JADX INFO: renamed from: s */
    private List f49080s;

    /* JADX INFO: renamed from: t */
    private List f49081t;

    /* JADX INFO: renamed from: c */
    private Set f49064c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d */
    private Set f49065d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: e */
    private String f49066e = null;

    /* JADX INFO: renamed from: f */
    private String f49067f = null;

    /* JADX INFO: renamed from: g */
    private a f49068g = a.MEDIUM;

    /* JADX INFO: renamed from: h */
    private int f49069h = 1;

    /* JADX INFO: renamed from: i */
    private long f49070i = HTTPTimeoutManager.DEFAULT_TIMEOUT_MS;

    /* JADX INFO: renamed from: j */
    private long f49071j = HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS;

    /* JADX INFO: renamed from: k */
    private long f49072k = 3600000;

    /* JADX INFO: renamed from: l */
    private boolean f49073l = true;

    /* JADX INFO: renamed from: n */
    private boolean f49075n = false;

    /* JADX INFO: renamed from: o */
    private S1 f49076o = S1.PIXEL_COPY;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        a(float f10, int i10, int i11) {
            this.sizeScale = f10;
            this.bitRate = i10;
            this.screenshotQuality = i11;
        }

        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public B3(boolean z10, io.sentry.protocol.r rVar) {
        List list = Collections.EMPTY_LIST;
        this.f49077p = list;
        this.f49078q = list;
        this.f49079r = true;
        List list2 = f49061u;
        this.f49080s = list2;
        this.f49081t = list2;
        if (z10) {
            return;
        }
        C(true);
        B(true);
        this.f49064c.add("android.webkit.WebView");
        this.f49064c.add("android.widget.VideoView");
        this.f49064c.add("androidx.media3.ui.PlayerView");
        this.f49064c.add("com.google.android.exoplayer2.ui.PlayerView");
        this.f49064c.add("com.google.android.exoplayer2.ui.StyledPlayerView");
        this.f49074m = rVar;
    }

    public static List i() {
        return f49061u;
    }

    private static List z(List list, List list2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        linkedHashSet.addAll(list2);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public void A(boolean z10) {
        this.f49075n = z10;
    }

    public void B(boolean z10) {
        if (z10) {
            a("android.widget.ImageView");
            this.f49065d.remove("android.widget.ImageView");
        } else {
            b("android.widget.ImageView");
            this.f49064c.remove("android.widget.ImageView");
        }
    }

    public void C(boolean z10) {
        if (z10) {
            a("android.widget.TextView");
            this.f49065d.remove("android.widget.TextView");
        } else {
            b("android.widget.TextView");
            this.f49064c.remove("android.widget.TextView");
        }
    }

    public void D(String str) {
        a(str);
        this.f49066e = str;
    }

    public void E(boolean z10) {
        this.f49079r = z10;
    }

    public void F(List list) {
        this.f49077p = Collections.unmodifiableList(new ArrayList(list));
    }

    public void G(List list) {
        this.f49078q = Collections.unmodifiableList(new ArrayList(list));
    }

    public void H(List list) {
        this.f49080s = z(f49061u, list);
    }

    public void I(List list) {
        this.f49081t = z(f49061u, list);
    }

    public void J(Double d10) {
        if (io.sentry.util.A.f(d10)) {
            this.f49063b = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void K(a aVar) {
        this.f49068g = aVar;
    }

    public void L(S1 s12) {
        this.f49076o = s12;
    }

    public void M(io.sentry.protocol.r rVar) {
        this.f49074m = rVar;
    }

    public void N(Double d10) {
        if (io.sentry.util.A.f(d10)) {
            this.f49062a = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void O(String str) {
        this.f49067f = str;
    }

    public void a(String str) {
        this.f49064c.add(str);
    }

    public void b(String str) {
        this.f49065d.add(str);
    }

    public long c() {
        return this.f49070i;
    }

    public int d() {
        return this.f49069h;
    }

    public Set e() {
        return this.f49064c;
    }

    public String f() {
        return this.f49066e;
    }

    public List g() {
        return this.f49077p;
    }

    public List h() {
        return this.f49078q;
    }

    public List j() {
        return this.f49080s;
    }

    public List k() {
        return this.f49081t;
    }

    public Double l() {
        return this.f49063b;
    }

    public a m() {
        return this.f49068g;
    }

    public S1 n() {
        return this.f49076o;
    }

    public io.sentry.protocol.r o() {
        return this.f49074m;
    }

    public long p() {
        return this.f49072k;
    }

    public Double q() {
        return this.f49062a;
    }

    public long r() {
        return this.f49071j;
    }

    public Set s() {
        return this.f49065d;
    }

    public String t() {
        return this.f49067f;
    }

    public boolean u() {
        return this.f49075n;
    }

    public boolean v() {
        return this.f49079r;
    }

    public boolean w() {
        return q() != null && q().doubleValue() > 0.0d;
    }

    public boolean x() {
        return l() != null && l().doubleValue() > 0.0d;
    }

    public boolean y() {
        return this.f49073l;
    }
}
