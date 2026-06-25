package G2;

import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q2.C6080L;
import q2.C6109x;
import r3.r;
import r3.s;
import t2.AbstractC6614a;
import t2.C6609I;
import t2.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC2255p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f7014i = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f7015j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O f7017b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r.a f7019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private U2.r f7021f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7023h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6609I f7018c = new C6609I();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f7022g = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];

    public k(String str, O o10, r.a aVar, boolean z10) {
        this.f7016a = str;
        this.f7017b = o10;
        this.f7019d = aVar;
        this.f7020e = z10;
    }

    private U2.O d(long j10) {
        U2.O oE = this.f7021f.e(0, 3);
        oE.c(new C6109x.b().y0("text/vtt").n0(this.f7016a).C0(j10).P());
        this.f7021f.p();
        return oE;
    }

    private void e() throws C6080L {
        C6609I c6609i = new C6609I(this.f7022g);
        A3.h.e(c6609i);
        long jH = 0;
        long jD = 0;
        for (String strX = c6609i.x(); !TextUtils.isEmpty(strX); strX = c6609i.x()) {
            if (strX.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f7014i.matcher(strX);
                if (!matcher.find()) {
                    throw C6080L.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strX, null);
                }
                Matcher matcher2 = f7015j.matcher(strX);
                if (!matcher2.find()) {
                    throw C6080L.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strX, null);
                }
                jD = A3.h.d((String) AbstractC6614a.e(matcher.group(1)));
                jH = O.h(Long.parseLong((String) AbstractC6614a.e(matcher2.group(1))));
            }
        }
        Matcher matcherA = A3.h.a(c6609i);
        if (matcherA == null) {
            d(0L);
            return;
        }
        long jD2 = A3.h.d((String) AbstractC6614a.e(matcherA.group(1)));
        long jB = this.f7017b.b(O.l((jH + jD2) - jD));
        U2.O oD = d(jB - jD2);
        this.f7018c.Z(this.f7022g, this.f7023h);
        oD.f(this.f7018c, this.f7023h);
        oD.a(jB, 1, this.f7023h, 0, null);
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // U2.InterfaceC2255p
    public void c(U2.r rVar) {
        if (this.f7020e) {
            rVar = new s(rVar, this.f7019d);
        }
        this.f7021f = rVar;
        rVar.t(new J.b(-9223372036854775807L));
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        interfaceC2256q.e(this.f7022g, 0, 6, false);
        this.f7018c.Z(this.f7022g, 6);
        if (A3.h.b(this.f7018c)) {
            return true;
        }
        interfaceC2256q.e(this.f7022g, 6, 3, false);
        this.f7018c.Z(this.f7022g, 9);
        return A3.h.b(this.f7018c);
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) throws C6080L {
        AbstractC6614a.e(this.f7021f);
        int length = (int) interfaceC2256q.getLength();
        int i11 = this.f7023h;
        byte[] bArr = this.f7022g;
        if (i11 == bArr.length) {
            this.f7022g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f7022g;
        int i12 = this.f7023h;
        int i13 = interfaceC2256q.read(bArr2, i12, bArr2.length - i12);
        if (i13 != -1) {
            int i14 = this.f7023h + i13;
            this.f7023h = i14;
            if (length == -1 || i14 != length) {
                return 0;
            }
        }
        e();
        return -1;
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
