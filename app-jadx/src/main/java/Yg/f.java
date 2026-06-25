package Yg;

import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes5.dex */
public class f implements Fg.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int[] f22970h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f22975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f22976n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f22989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f22990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f22991g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int[] f22971i = {10, 9, 6, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int[] f22972j = {7, 2, 1, 0};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f22973k = {8, 0};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int[] f22974l = {7, 2, 1, 0};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f22977o = new f("mceliece460896", 13, 4608, 96, f22971i, false, JfifUtil.MARKER_SOFn);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f22978p = new f("mceliece460896f", 13, 4608, 96, f22971i, true, JfifUtil.MARKER_SOFn);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f22979q = new f("mceliece6688128", 13, 6688, 128, f22972j, false, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f22980r = new f("mceliece6688128f", 13, 6688, 128, f22972j, true, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f22981s = new f("mceliece6960119", 13, 6960, 119, f22973k, false, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f22982t = new f("mceliece6960119f", 13, 6960, 119, f22973k, true, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f f22983u = new f("mceliece8192128", 13, 8192, 128, f22974l, false, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f22984v = new f("mceliece8192128f", 13, 8192, 128, f22974l, true, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    static {
        int[] iArr = {3, 1, 0};
        f22970h = iArr;
        f22975m = new f("mceliece348864", 12, 3488, 64, iArr, false, 128);
        f22976n = new f("mceliece348864f", 12, 3488, 64, f22970h, true, 128);
    }

    private f(String str, int i10, int i11, int i12, int[] iArr, boolean z10, int i13) {
        this.f22985a = str;
        this.f22986b = i10;
        this.f22987c = i11;
        this.f22988d = i12;
        this.f22989e = z10;
        this.f22990f = i13;
        this.f22991g = new d(i10, i11, i12, iArr, z10, i13);
    }

    d a() {
        return this.f22991g;
    }

    public String b() {
        return this.f22985a;
    }

    public int c() {
        return this.f22988d;
    }
}
