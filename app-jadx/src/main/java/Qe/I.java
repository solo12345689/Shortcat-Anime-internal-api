package Qe;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.N0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class I {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f14807k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final I f14808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final I f14809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I f14810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final I f14811o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final I f14812p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final I f14813q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final I f14814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final I f14815s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final I f14816t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f14817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f14818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f14819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f14821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final I f14822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f14823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final I f14824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final I f14825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f14826j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14827a;

        static {
            int[] iArr = new int[N0.values().length];
            try {
                iArr[N0.f58000f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N0.f57999e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14827a = iArr;
        }
    }

    static {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        I i10 = new I(z10, z11, z12, z13, z14, null, false, null, null, z15, 1023, null);
        f14808l = i10;
        I i11 = new I(false, false, z15, false, false, null, false, null, null, true, 511, null);
        f14809m = i11;
        f14810n = new I(false, true, false, false, false, null, false, null, null, false, 1021, null);
        f14811o = new I(z10, z11, z12, z13, z14, i10, false, null, null, z15, 988, null);
        f14812p = new I(false, false, z15, false, false, i11, false, null, null, true, 476, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z16 = false;
        I i12 = null;
        I i13 = null;
        f14813q = new I(z10, true, z12, z13, z14, i10, z16, i12, i13, z15, 988, defaultConstructorMarker);
        boolean z17 = false;
        boolean z18 = true;
        f14814r = new I(z10, z17, z12, z18, z14, i10, z16, i12, i13, z15, 983, defaultConstructorMarker);
        f14815s = new I(z10, z17, z12, z18, z14, i10, z16, i12, i13, z15, 919, defaultConstructorMarker);
        f14816t = new I(z10, z17, true, false, z14, i10, z16, i12, i13, z15, 984, defaultConstructorMarker);
    }

    public I(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, I i10, boolean z15, I i11, I i12, boolean z16) {
        this.f14817a = z10;
        this.f14818b = z11;
        this.f14819c = z12;
        this.f14820d = z13;
        this.f14821e = z14;
        this.f14822f = i10;
        this.f14823g = z15;
        this.f14824h = i11;
        this.f14825i = i12;
        this.f14826j = z16;
    }

    public final boolean a() {
        return this.f14823g;
    }

    public final boolean b() {
        return this.f14826j;
    }

    public final boolean c() {
        return this.f14818b;
    }

    public final boolean d() {
        return this.f14817a;
    }

    public final boolean e() {
        return this.f14819c;
    }

    public final I f(N0 effectiveVariance, boolean z10) {
        AbstractC5504s.h(effectiveVariance, "effectiveVariance");
        if (!z10 || !this.f14819c) {
            int i10 = b.f14827a[effectiveVariance.ordinal()];
            if (i10 == 1) {
                I i11 = this.f14824h;
                if (i11 != null) {
                    return i11;
                }
            } else if (i10 != 2) {
                I i12 = this.f14822f;
                if (i12 != null) {
                    return i12;
                }
            } else {
                I i13 = this.f14825i;
                if (i13 != null) {
                    return i13;
                }
            }
        }
        return this;
    }

    public final I g() {
        return new I(this.f14817a, true, this.f14819c, this.f14820d, this.f14821e, this.f14822f, this.f14823g, this.f14824h, this.f14825i, false, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ I(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, I i10, boolean z15, I i11, I i12, boolean z16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        z10 = (i13 & 1) != 0 ? true : z10;
        z11 = (i13 & 2) != 0 ? true : z11;
        z12 = (i13 & 4) != 0 ? false : z12;
        z13 = (i13 & 8) != 0 ? false : z13;
        z14 = (i13 & 16) != 0 ? false : z14;
        i10 = (i13 & 32) != 0 ? null : i10;
        this(z10, z11, z12, z13, z14, i10, (i13 & 64) != 0 ? true : z15, (i13 & 128) != 0 ? i10 : i11, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? i10 : i12, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? false : z16);
    }
}
