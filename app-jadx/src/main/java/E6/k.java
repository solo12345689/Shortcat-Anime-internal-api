package E6;

import android.graphics.ColorSpace;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.imageutils.HeifExifUtil;
import com.facebook.imageutils.ImageMetaData;
import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.WebpUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class k implements Closeable {

    /* JADX INFO: renamed from: n */
    private static boolean f5673n;

    /* JADX INFO: renamed from: a */
    private final C5.a f5674a;

    /* JADX INFO: renamed from: b */
    private final y5.n f5675b;

    /* JADX INFO: renamed from: c */
    private q6.c f5676c;

    /* JADX INFO: renamed from: d */
    private int f5677d;

    /* JADX INFO: renamed from: e */
    private int f5678e;

    /* JADX INFO: renamed from: f */
    private int f5679f;

    /* JADX INFO: renamed from: g */
    private int f5680g;

    /* JADX INFO: renamed from: h */
    private int f5681h;

    /* JADX INFO: renamed from: i */
    private int f5682i;

    /* JADX INFO: renamed from: j */
    private y6.b f5683j;

    /* JADX INFO: renamed from: k */
    private ColorSpace f5684k;

    /* JADX INFO: renamed from: l */
    private String f5685l;

    /* JADX INFO: renamed from: m */
    private boolean f5686m;

    public k(C5.a aVar) {
        this.f5676c = q6.c.f57672d;
        this.f5677d = -1;
        this.f5678e = 0;
        this.f5679f = -1;
        this.f5680g = -1;
        this.f5681h = 1;
        this.f5682i = -1;
        y5.k.b(Boolean.valueOf(C5.a.H(aVar)));
        this.f5674a = aVar.clone();
        this.f5675b = null;
    }

    private Pair B0() {
        InputStream inputStreamQ = q();
        if (inputStreamQ == null) {
            return null;
        }
        Pair<Integer, Integer> size = WebpUtil.getSize(inputStreamQ);
        if (size != null) {
            this.f5679f = ((Integer) size.getFirst()).intValue();
            this.f5680g = ((Integer) size.getSecond()).intValue();
        }
        return size;
    }

    private void H() {
        q6.c cVarD = q6.e.d(q());
        this.f5676c = cVarD;
        Pair<Integer, Integer> pairB0 = q6.b.b(cVarD) ? B0() : p0().getDimensions();
        if (cVarD == q6.b.f57656b && this.f5677d == -1) {
            if (pairB0 != null) {
                int orientation = JfifUtil.getOrientation(q());
                this.f5678e = orientation;
                this.f5677d = JfifUtil.getAutoRotateAngleFromOrientation(orientation);
                return;
            }
            return;
        }
        if (cVarD == q6.b.f57666l && this.f5677d == -1) {
            int orientation2 = HeifExifUtil.getOrientation(q());
            this.f5678e = orientation2;
            this.f5677d = JfifUtil.getAutoRotateAngleFromOrientation(orientation2);
        } else if (this.f5677d == -1) {
            this.f5677d = 0;
        }
    }

    public static boolean O(k kVar) {
        return kVar.f5677d >= 0 && kVar.f5679f >= 0 && kVar.f5680g >= 0;
    }

    public static boolean Y(k kVar) {
        return kVar != null && kVar.S();
    }

    public static k b(k kVar) {
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    public static void g(k kVar) {
        if (kVar != null) {
            kVar.close();
        }
    }

    private void k0() {
        if (this.f5679f < 0 || this.f5680g < 0) {
            h0();
        }
    }

    private ImageMetaData p0() throws Throwable {
        InputStream inputStreamQ;
        try {
            inputStreamQ = q();
            try {
                ImageMetaData imageMetaDataDecodeDimensionsAndColorSpace = BitmapUtil.decodeDimensionsAndColorSpace(inputStreamQ);
                this.f5684k = imageMetaDataDecodeDimensionsAndColorSpace.getColorSpace();
                Pair<Integer, Integer> dimensions = imageMetaDataDecodeDimensionsAndColorSpace.getDimensions();
                if (dimensions != null) {
                    this.f5679f = ((Integer) dimensions.getFirst()).intValue();
                    this.f5680g = ((Integer) dimensions.getSecond()).intValue();
                }
                if (inputStreamQ != null) {
                    try {
                        inputStreamQ.close();
                    } catch (IOException unused) {
                    }
                }
                return imageMetaDataDecodeDimensionsAndColorSpace;
            } catch (Throwable th2) {
                th = th2;
                if (inputStreamQ != null) {
                    try {
                        inputStreamQ.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamQ = null;
        }
    }

    public int C() {
        C5.a aVar = this.f5674a;
        return (aVar == null || aVar.C() == null) ? this.f5682i : ((B5.h) this.f5674a.C()).size();
    }

    public String D() {
        return this.f5685l;
    }

    protected boolean E() {
        return this.f5686m;
    }

    public void F0(y6.b bVar) {
        this.f5683j = bVar;
    }

    public void G0(int i10) {
        this.f5678e = i10;
    }

    public boolean J(int i10) {
        q6.c cVar = this.f5676c;
        if ((cVar != q6.b.f57656b && cVar != q6.b.f57667m) || this.f5675b != null) {
            return true;
        }
        y5.k.g(this.f5674a);
        B5.h hVar = (B5.h) this.f5674a.C();
        return i10 >= 2 && hVar.G(i10 + (-2)) == -1 && hVar.G(i10 - 1) == -39;
    }

    public void M0(int i10) {
        this.f5680g = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean S() {
        /*
            r1 = this;
            monitor-enter(r1)
            C5.a r0 = r1.f5674a     // Catch: java.lang.Throwable -> L10
            boolean r0 = C5.a.H(r0)     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            y5.n r0 = r1.f5675b     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E6.k.S():boolean");
    }

    public int U0() {
        k0();
        return this.f5678e;
    }

    public k a() {
        k kVar;
        y5.n nVar = this.f5675b;
        if (nVar != null) {
            kVar = new k(nVar, this.f5682i);
        } else {
            C5.a aVarJ = C5.a.j(this.f5674a);
            if (aVarJ == null) {
                kVar = null;
            } else {
                try {
                    kVar = new k(aVarJ);
                } finally {
                    C5.a.m(aVarJ);
                }
            }
        }
        if (kVar != null) {
            kVar.h(this);
        }
        return kVar;
    }

    public void a1(q6.c cVar) {
        this.f5676c = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C5.a.m(this.f5674a);
    }

    public int getHeight() {
        k0();
        return this.f5680g;
    }

    public int getWidth() {
        k0();
        return this.f5679f;
    }

    public void h(k kVar) {
        this.f5676c = kVar.o();
        this.f5679f = kVar.getWidth();
        this.f5680g = kVar.getHeight();
        this.f5677d = kVar.h1();
        this.f5678e = kVar.U0();
        this.f5681h = kVar.z();
        this.f5682i = kVar.C();
        this.f5683j = kVar.k();
        this.f5684k = kVar.l();
        this.f5686m = kVar.E();
    }

    public void h0() {
        if (!f5673n) {
            H();
        } else {
            if (this.f5686m) {
                return;
            }
            H();
            this.f5686m = true;
        }
    }

    public int h1() {
        k0();
        return this.f5677d;
    }

    public C5.a j() {
        return C5.a.j(this.f5674a);
    }

    public y6.b k() {
        return this.f5683j;
    }

    public ColorSpace l() {
        k0();
        return this.f5684k;
    }

    public String m(int i10) {
        C5.a aVarJ = j();
        if (aVarJ == null) {
            return "";
        }
        int iMin = Math.min(C(), i10);
        byte[] bArr = new byte[iMin];
        try {
            B5.h hVar = (B5.h) aVarJ.C();
            if (hVar == null) {
                return "";
            }
            hVar.u(0, bArr, 0, iMin);
            aVarJ.close();
            StringBuilder sb2 = new StringBuilder(iMin * 2);
            for (int i11 = 0; i11 < iMin; i11++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i11])));
            }
            return sb2.toString();
        } finally {
            aVarJ.close();
        }
    }

    public q6.c o() {
        k0();
        return this.f5676c;
    }

    public InputStream q() {
        y5.n nVar = this.f5675b;
        if (nVar != null) {
            return (InputStream) nVar.get();
        }
        C5.a aVarJ = C5.a.j(this.f5674a);
        if (aVarJ == null) {
            return null;
        }
        try {
            return new B5.j((B5.h) aVarJ.C());
        } finally {
            C5.a.m(aVarJ);
        }
    }

    public void q1(int i10) {
        this.f5677d = i10;
    }

    public void t1(int i10) {
        this.f5681h = i10;
    }

    public void u1(String str) {
        this.f5685l = str;
    }

    public InputStream w() {
        return (InputStream) y5.k.g(q());
    }

    public void y1(int i10) {
        this.f5679f = i10;
    }

    public int z() {
        return this.f5681h;
    }

    public k(y5.n nVar) {
        this.f5676c = q6.c.f57672d;
        this.f5677d = -1;
        this.f5678e = 0;
        this.f5679f = -1;
        this.f5680g = -1;
        this.f5681h = 1;
        this.f5682i = -1;
        y5.k.g(nVar);
        this.f5674a = null;
        this.f5675b = nVar;
    }

    public k(y5.n nVar, int i10) {
        this(nVar);
        this.f5682i = i10;
    }
}
