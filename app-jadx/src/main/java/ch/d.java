package ch;

import com.facebook.imageutils.JfifUtil;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;

/* JADX INFO: loaded from: classes5.dex */
public class d implements Fg.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f33684o = new d("hqc-128", 17669, 46, 384, 16, 31, 15, 66, 75, 75, 16767881, 4, new int[]{89, 69, 153, 116, 176, 117, 111, 75, 73, 233, 242, 233, 65, 210, 21, 139, 103, 173, 67, 118, 105, 210, 174, 110, 74, 69, 228, 82, 255, 181, 1});

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f33685p = new d("hqc-192", 35851, 56, 640, 24, 33, 16, 100, 114, 114, 16742417, 5, new int[]{45, JfifUtil.MARKER_SOI, 239, 24, 253, 104, 27, 40, 107, 50, 163, 210, 227, 134, 224, 158, 119, 13, 158, 1, 238, 164, 82, 43, 15, 232, 246, 142, 50, 189, 29, 232, 1});

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f33686q = new d("hqc-256", 57637, 90, 640, 32, 59, 29, 131, 149, 149, 16772367, 5, new int[]{49, 167, 49, 39, 200, 121, 124, 91, 240, 63, 148, 71, 150, 123, 87, 101, 32, JfifUtil.MARKER_RST7, 159, 71, RCHTTPStatusCodes.CREATED, 115, 97, 210, 186, 183, 141, JfifUtil.MARKER_EOI, 123, 12, 31, 243, SensibleDefaults.X_OFFSET, 219, 152, 239, 99, 141, 4, 246, 191, 144, 8, 232, 47, 27, 141, 178, 130, 64, 124, 47, 39, 188, JfifUtil.MARKER_SOI, 48, 199, 187, 1});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f33699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C3107b f33700n;

    private d(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int[] iArr) {
        this.f33687a = str;
        this.f33688b = i10;
        this.f33689c = i11;
        this.f33690d = i12;
        this.f33691e = i13;
        this.f33693g = i15;
        this.f33694h = i16;
        this.f33695i = i17;
        this.f33696j = i18;
        this.f33699m = iArr;
        this.f33692f = i14;
        this.f33697k = i19;
        this.f33698l = i20;
        this.f33700n = new C3107b(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, iArr);
    }

    public String a() {
        return this.f33687a;
    }
}
