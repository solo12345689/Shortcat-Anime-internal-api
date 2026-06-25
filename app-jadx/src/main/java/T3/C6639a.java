package t3;

import P9.AbstractC2011u;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.List;
import r3.r;
import s2.C6403a;
import t2.AbstractC6635w;
import t2.C6608H;
import t2.C6609I;
import t2.InterfaceC6627n;
import t2.a0;

/* JADX INFO: renamed from: t3.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6639a implements r {

    /* JADX INFO: renamed from: h */
    private static final byte[] f60664h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i */
    private static final byte[] f60665i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j */
    private static final byte[] f60666j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a */
    private final Paint f60667a;

    /* JADX INFO: renamed from: b */
    private final Paint f60668b;

    /* JADX INFO: renamed from: c */
    private final Canvas f60669c;

    /* JADX INFO: renamed from: d */
    private final b f60670d;

    /* JADX INFO: renamed from: e */
    private final C0907a f60671e;

    /* JADX INFO: renamed from: f */
    private final h f60672f;

    /* JADX INFO: renamed from: g */
    private Bitmap f60673g;

    /* JADX INFO: renamed from: t3.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0907a {

        /* JADX INFO: renamed from: a */
        public final int f60674a;

        /* JADX INFO: renamed from: b */
        public final int[] f60675b;

        /* JADX INFO: renamed from: c */
        public final int[] f60676c;

        /* JADX INFO: renamed from: d */
        public final int[] f60677d;

        public C0907a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f60674a = i10;
            this.f60675b = iArr;
            this.f60676c = iArr2;
            this.f60677d = iArr3;
        }
    }

    /* JADX INFO: renamed from: t3.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a */
        public final int f60678a;

        /* JADX INFO: renamed from: b */
        public final int f60679b;

        /* JADX INFO: renamed from: c */
        public final int f60680c;

        /* JADX INFO: renamed from: d */
        public final int f60681d;

        /* JADX INFO: renamed from: e */
        public final int f60682e;

        /* JADX INFO: renamed from: f */
        public final int f60683f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f60678a = i10;
            this.f60679b = i11;
            this.f60680c = i12;
            this.f60681d = i13;
            this.f60682e = i14;
            this.f60683f = i15;
        }
    }

    /* JADX INFO: renamed from: t3.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: a */
        public final int f60684a;

        /* JADX INFO: renamed from: b */
        public final boolean f60685b;

        /* JADX INFO: renamed from: c */
        public final byte[] f60686c;

        /* JADX INFO: renamed from: d */
        public final byte[] f60687d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f60684a = i10;
            this.f60685b = z10;
            this.f60686c = bArr;
            this.f60687d = bArr2;
        }
    }

    /* JADX INFO: renamed from: t3.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d {

        /* JADX INFO: renamed from: a */
        public final int f60688a;

        /* JADX INFO: renamed from: b */
        public final int f60689b;

        /* JADX INFO: renamed from: c */
        public final int f60690c;

        /* JADX INFO: renamed from: d */
        public final SparseArray f60691d;

        public d(int i10, int i11, int i12, SparseArray sparseArray) {
            this.f60688a = i10;
            this.f60689b = i11;
            this.f60690c = i12;
            this.f60691d = sparseArray;
        }
    }

    /* JADX INFO: renamed from: t3.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e {

        /* JADX INFO: renamed from: a */
        public final int f60692a;

        /* JADX INFO: renamed from: b */
        public final int f60693b;

        public e(int i10, int i11) {
            this.f60692a = i10;
            this.f60693b = i11;
        }
    }

    /* JADX INFO: renamed from: t3.a$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class f {

        /* JADX INFO: renamed from: a */
        public final int f60694a;

        /* JADX INFO: renamed from: b */
        public final boolean f60695b;

        /* JADX INFO: renamed from: c */
        public final int f60696c;

        /* JADX INFO: renamed from: d */
        public final int f60697d;

        /* JADX INFO: renamed from: e */
        public final int f60698e;

        /* JADX INFO: renamed from: f */
        public final int f60699f;

        /* JADX INFO: renamed from: g */
        public final int f60700g;

        /* JADX INFO: renamed from: h */
        public final int f60701h;

        /* JADX INFO: renamed from: i */
        public final int f60702i;

        /* JADX INFO: renamed from: j */
        public final int f60703j;

        /* JADX INFO: renamed from: k */
        public final SparseArray f60704k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray sparseArray) {
            this.f60694a = i10;
            this.f60695b = z10;
            this.f60696c = i11;
            this.f60697d = i12;
            this.f60698e = i13;
            this.f60699f = i14;
            this.f60700g = i15;
            this.f60701h = i16;
            this.f60702i = i17;
            this.f60703j = i18;
            this.f60704k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f60704k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f60704k.put(sparseArray.keyAt(i10), (g) sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX INFO: renamed from: t3.a$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class g {

        /* JADX INFO: renamed from: a */
        public final int f60705a;

        /* JADX INFO: renamed from: b */
        public final int f60706b;

        /* JADX INFO: renamed from: c */
        public final int f60707c;

        /* JADX INFO: renamed from: d */
        public final int f60708d;

        /* JADX INFO: renamed from: e */
        public final int f60709e;

        /* JADX INFO: renamed from: f */
        public final int f60710f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f60705a = i10;
            this.f60706b = i11;
            this.f60707c = i12;
            this.f60708d = i13;
            this.f60709e = i14;
            this.f60710f = i15;
        }
    }

    /* JADX INFO: renamed from: t3.a$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class h {

        /* JADX INFO: renamed from: a */
        public final int f60711a;

        /* JADX INFO: renamed from: b */
        public final int f60712b;

        /* JADX INFO: renamed from: c */
        public final SparseArray f60713c = new SparseArray();

        /* JADX INFO: renamed from: d */
        public final SparseArray f60714d = new SparseArray();

        /* JADX INFO: renamed from: e */
        public final SparseArray f60715e = new SparseArray();

        /* JADX INFO: renamed from: f */
        public final SparseArray f60716f = new SparseArray();

        /* JADX INFO: renamed from: g */
        public final SparseArray f60717g = new SparseArray();

        /* JADX INFO: renamed from: h */
        public b f60718h;

        /* JADX INFO: renamed from: i */
        public d f60719i;

        public h(int i10, int i11) {
            this.f60711a = i10;
            this.f60712b = i11;
        }

        public void a() {
            this.f60713c.clear();
            this.f60714d.clear();
            this.f60715e.clear();
            this.f60716f.clear();
            this.f60717g.clear();
            this.f60718h = null;
            this.f60719i = null;
        }
    }

    public C6639a(List list) {
        C6609I c6609i = new C6609I((byte[]) list.get(0));
        int iU = c6609i.U();
        int iU2 = c6609i.U();
        Paint paint = new Paint();
        this.f60667a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f60668b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f60669c = new Canvas();
        this.f60670d = new b(719, 575, 0, 719, 0, 575);
        this.f60671e = new C0907a(0, e(), f(), g());
        this.f60672f = new h(iU, iU2);
    }

    private static byte[] d(int i10, int i11, C6608H c6608h) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c6608h.h(i11);
        }
        return bArr;
    }

    private static int[] e() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = h(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = h(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] g() {
        int[] iArr = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = h(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = h(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = h(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = h(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = h(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int h(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int i(C6608H c6608h, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int iH;
        int iH2;
        boolean z11 = false;
        while (true) {
            int iH3 = c6608h.h(2);
            if (iH3 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (c6608h.g()) {
                    iH = c6608h.h(3) + 3;
                    iH2 = c6608h.h(2);
                } else {
                    if (c6608h.g()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int iH4 = c6608h.h(2);
                        if (iH4 == 0) {
                            z10 = true;
                        } else if (iH4 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (iH4 == 2) {
                            iH = c6608h.h(4) + 12;
                            iH2 = c6608h.h(2);
                        } else if (iH4 != 3) {
                            z10 = z11;
                        } else {
                            iH = c6608h.h(8) + 29;
                            iH2 = c6608h.h(2);
                        }
                        iH3 = 0;
                        i12 = 0;
                    }
                    iH3 = 0;
                }
                z10 = z11;
                i12 = iH;
                iH3 = iH2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i10, i11, i10 + i12, 1 + i11, paint);
            }
            i10 += i12;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    private static int j(C6608H c6608h, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int iH;
        int iH2;
        boolean z11 = false;
        while (true) {
            int iH3 = c6608h.h(4);
            if (iH3 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (c6608h.g()) {
                if (c6608h.g()) {
                    int iH4 = c6608h.h(2);
                    if (iH4 == 0) {
                        z10 = z11;
                        i12 = 1;
                        iH3 = 0;
                    } else if (iH4 == 1) {
                        iH3 = 0;
                        i12 = 2;
                        z10 = z11;
                    } else if (iH4 == 2) {
                        iH = c6608h.h(4) + 9;
                        iH2 = c6608h.h(4);
                    } else if (iH4 != 3) {
                        z10 = z11;
                        iH3 = 0;
                        i12 = 0;
                    } else {
                        iH = c6608h.h(8) + 25;
                        iH2 = c6608h.h(4);
                    }
                } else {
                    iH = c6608h.h(2) + 4;
                    iH2 = c6608h.h(4);
                }
                z10 = z11;
                i12 = iH;
                iH3 = iH2;
            } else {
                int iH5 = c6608h.h(3);
                if (iH5 != 0) {
                    z10 = z11;
                    i12 = iH5 + 2;
                    iH3 = 0;
                } else {
                    z10 = true;
                    iH3 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i10, i11, i10 + i12, 1 + i11, paint);
            }
            i10 += i12;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    private static int k(C6608H c6608h, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int iH;
        boolean z11 = false;
        while (true) {
            int iH2 = c6608h.h(8);
            if (iH2 != 0) {
                z10 = z11;
                iH = 1;
            } else if (c6608h.g()) {
                z10 = z11;
                iH = c6608h.h(7);
                iH2 = c6608h.h(8);
            } else {
                int iH3 = c6608h.h(7);
                if (iH3 != 0) {
                    z10 = z11;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    z10 = true;
                    iH2 = 0;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i10, i11, i10 + iH, 1 + i11, paint);
            }
            i10 += iH;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    private static void l(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        C6608H c6608h = new C6608H(bArr);
        byte[] bArrD = null;
        byte[] bArrD2 = null;
        int i13 = i11;
        int i14 = i12;
        byte[] bArrD3 = null;
        while (c6608h.b() != 0) {
            int iH = c6608h.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        if (i10 == 3) {
                            bArr3 = bArrD3 == null ? f60665i : bArrD3;
                        } else if (i10 != 2) {
                            bArr2 = null;
                            paint2 = paint3;
                            i13 = i(c6608h, iArr2, bArr2, i13, i14, paint2, canvas2);
                            c6608h.c();
                        } else {
                            bArr3 = bArrD2 == null ? f60664h : bArrD2;
                        }
                        paint2 = paint3;
                        bArr2 = bArr3;
                        i13 = i(c6608h, iArr2, bArr2, i13, i14, paint2, canvas2);
                        c6608h.c();
                        break;
                    case 17:
                        iArr2 = iArr;
                        Paint paint4 = paint;
                        canvas2 = canvas;
                        paint2 = paint4;
                        i13 = j(c6608h, iArr2, i10 == 3 ? bArrD == null ? f60666j : bArrD : null, i13, i14, paint2, canvas2);
                        c6608h.c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        i13 = k(c6608h, iArr2, null, i13, i14, paint2, canvas2);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrD2 = d(4, 4, c6608h);
                                break;
                            case 33:
                                bArrD3 = d(4, 8, c6608h);
                                break;
                            case 34:
                                bArrD = d(16, 8, c6608h);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i14 += 2;
                i13 = i11;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static void m(c cVar, C0907a c0907a, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? c0907a.f60677d : i10 == 2 ? c0907a.f60676c : c0907a.f60675b;
        l(cVar.f60686c, iArr, i10, i11, i12, paint, canvas);
        l(cVar.f60687d, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    private r3.d n(C6608H c6608h) {
        SparseArray sparseArray;
        int i10;
        while (c6608h.b() >= 48 && c6608h.h(8) == 15) {
            t(c6608h, this.f60672f);
        }
        h hVar = this.f60672f;
        d dVar = hVar.f60719i;
        if (dVar == null) {
            return new r3.d(AbstractC2011u.A(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f60718h;
        if (bVar == null) {
            bVar = this.f60670d;
        }
        Bitmap bitmap = this.f60673g;
        if (bitmap == null || bVar.f60678a + 1 != bitmap.getWidth() || bVar.f60679b + 1 != this.f60673g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f60678a + 1, bVar.f60679b + 1, Bitmap.Config.ARGB_8888);
            this.f60673g = bitmapCreateBitmap;
            this.f60669c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.f60691d;
        int i11 = 0;
        while (i11 < sparseArray2.size()) {
            this.f60669c.save();
            e eVar = (e) sparseArray2.valueAt(i11);
            f fVar = (f) this.f60672f.f60713c.get(sparseArray2.keyAt(i11));
            int i12 = eVar.f60692a + bVar.f60680c;
            int i13 = eVar.f60693b + bVar.f60682e;
            this.f60669c.clipRect(i12, i13, Math.min(fVar.f60696c + i12, bVar.f60681d), Math.min(fVar.f60697d + i13, bVar.f60683f));
            C0907a c0907a = (C0907a) this.f60672f.f60714d.get(fVar.f60700g);
            if (c0907a == null && (c0907a = (C0907a) this.f60672f.f60716f.get(fVar.f60700g)) == null) {
                c0907a = this.f60671e;
            }
            C0907a c0907a2 = c0907a;
            SparseArray sparseArray3 = fVar.f60704k;
            int i14 = 0;
            while (i14 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i14);
                g gVar = (g) sparseArray3.valueAt(i14);
                c cVar = (c) this.f60672f.f60715e.get(iKeyAt);
                if (cVar == null) {
                    cVar = (c) this.f60672f.f60717g.get(iKeyAt);
                }
                if (cVar != null) {
                    sparseArray = sparseArray2;
                    i10 = i14;
                    m(cVar, c0907a2, fVar.f60699f, gVar.f60707c + i12, gVar.f60708d + i13, cVar.f60685b ? null : this.f60667a, this.f60669c);
                } else {
                    sparseArray = sparseArray2;
                    i10 = i14;
                }
                i14 = i10 + 1;
                sparseArray2 = sparseArray;
            }
            SparseArray sparseArray4 = sparseArray2;
            if (fVar.f60695b) {
                int i15 = fVar.f60699f;
                this.f60668b.setColor(i15 == 3 ? c0907a2.f60677d[fVar.f60701h] : i15 == 2 ? c0907a2.f60676c[fVar.f60702i] : c0907a2.f60675b[fVar.f60703j]);
                this.f60669c.drawRect(i12, i13, fVar.f60696c + i12, fVar.f60697d + i13, this.f60668b);
            }
            arrayList.add(new C6403a.b().f(Bitmap.createBitmap(this.f60673g, i12, i13, fVar.f60696c, fVar.f60697d)).k(i12 / bVar.f60678a).l(0).h(i13 / bVar.f60679b, 0).i(0).n(fVar.f60696c / bVar.f60678a).g(fVar.f60697d / bVar.f60679b).a());
            this.f60669c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f60669c.restore();
            i11++;
            sparseArray2 = sparseArray4;
        }
        return new r3.d(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static C0907a o(C6608H c6608h, int i10) {
        int iH;
        int i11;
        int iH2;
        int iH3;
        int iH4;
        int i12 = 8;
        int iH5 = c6608h.h(8);
        c6608h.r(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrE = e();
        int[] iArrF = f();
        int[] iArrG = g();
        while (i14 > 0) {
            int iH6 = c6608h.h(i12);
            int iH7 = c6608h.h(i12);
            int[] iArr = (iH7 & 128) != 0 ? iArrE : (iH7 & 64) != 0 ? iArrF : iArrG;
            if ((iH7 & 1) != 0) {
                iH3 = c6608h.h(i12);
                iH4 = c6608h.h(i12);
                iH = c6608h.h(i12);
                iH2 = c6608h.h(i12);
                i11 = i14 - 6;
            } else {
                int iH8 = c6608h.h(6) << i13;
                int iH9 = c6608h.h(4) << 4;
                iH = c6608h.h(4) << 4;
                i11 = i14 - 4;
                iH2 = c6608h.h(i13) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
                iH4 = 0;
                iH = 0;
            }
            double d10 = iH3;
            double d11 = iH4 - 128;
            double d12 = iH - 128;
            iArr[iH6] = h((byte) (255 - (iH2 & 255)), a0.r((int) (d10 + (1.402d * d11)), 0, 255), a0.r((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), a0.r((int) (d10 + (d12 * 1.772d)), 0, 255));
            i14 = i11;
            iH5 = iH5;
            i12 = 8;
            i13 = 2;
        }
        return new C0907a(iH5, iArrE, iArrF, iArrG);
    }

    private static b p(C6608H c6608h) {
        int i10;
        int i11;
        int i12;
        int iH;
        c6608h.r(4);
        boolean zG = c6608h.g();
        c6608h.r(3);
        int iH2 = c6608h.h(16);
        int iH3 = c6608h.h(16);
        if (zG) {
            int iH4 = c6608h.h(16);
            int iH5 = c6608h.h(16);
            int iH6 = c6608h.h(16);
            iH = c6608h.h(16);
            i12 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iH2;
            iH = iH3;
        }
        return new b(iH2, iH3, i10, i12, i11, iH);
    }

    private static c q(C6608H c6608h) {
        byte[] bArr;
        int iH = c6608h.h(16);
        c6608h.r(4);
        int iH2 = c6608h.h(2);
        boolean zG = c6608h.g();
        c6608h.r(1);
        byte[] bArr2 = a0.f60567f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = c6608h.h(16);
                int iH4 = c6608h.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    c6608h.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    c6608h.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        c6608h.r(c6608h.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    private static d r(C6608H c6608h, int i10) {
        int iH = c6608h.h(8);
        int iH2 = c6608h.h(4);
        int iH3 = c6608h.h(2);
        c6608h.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iH4 = c6608h.h(8);
            c6608h.r(8);
            i11 -= 6;
            sparseArray.put(iH4, new e(c6608h.h(16), c6608h.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    private static f s(C6608H c6608h, int i10) {
        int i11;
        int iH;
        int iH2;
        char c10;
        int iH3 = c6608h.h(8);
        int i12 = 4;
        c6608h.r(4);
        boolean zG = c6608h.g();
        c6608h.r(3);
        int i13 = 16;
        int iH4 = c6608h.h(16);
        int iH5 = c6608h.h(16);
        int iH6 = c6608h.h(3);
        int iH7 = c6608h.h(3);
        int i14 = 2;
        c6608h.r(2);
        int iH8 = c6608h.h(8);
        int iH9 = c6608h.h(8);
        int iH10 = c6608h.h(4);
        int iH11 = c6608h.h(2);
        c6608h.r(2);
        int i15 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int iH12 = c6608h.h(i13);
            int iH13 = c6608h.h(i14);
            int iH14 = c6608h.h(i14);
            int iH15 = c6608h.h(12);
            c6608h.r(i12);
            int iH16 = c6608h.h(12);
            int i16 = i15 - 6;
            if (iH13 != 1) {
                i11 = 2;
                if (iH13 != 2) {
                    iH2 = 0;
                    iH = 0;
                    i15 = i16;
                    c10 = '\b';
                }
                sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
                i13 = 16;
                i14 = i11;
                i12 = 4;
            } else {
                i11 = 2;
            }
            c10 = '\b';
            i15 -= 8;
            iH2 = c6608h.h(8);
            iH = c6608h.h(8);
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
            i13 = 16;
            i14 = i11;
            i12 = 4;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    private static void t(C6608H c6608h, h hVar) {
        f fVar;
        int iH = c6608h.h(8);
        int iH2 = c6608h.h(16);
        int iH3 = c6608h.h(16);
        int iD = c6608h.d() + iH3;
        if (iH3 * 8 > c6608h.b()) {
            AbstractC6635w.i("DvbParser", "Data field length exceeds limit");
            c6608h.r(c6608h.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f60711a) {
                    d dVar = hVar.f60719i;
                    d dVarR = r(c6608h, iH3);
                    if (dVarR.f60690c != 0) {
                        hVar.f60719i = dVarR;
                        hVar.f60713c.clear();
                        hVar.f60714d.clear();
                        hVar.f60715e.clear();
                    } else if (dVar != null && dVar.f60689b != dVarR.f60689b) {
                        hVar.f60719i = dVarR;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f60719i;
                if (iH2 == hVar.f60711a && dVar2 != null) {
                    f fVarS = s(c6608h, iH3);
                    if (dVar2.f60690c == 0 && (fVar = (f) hVar.f60713c.get(fVarS.f60694a)) != null) {
                        fVarS.a(fVar);
                    }
                    hVar.f60713c.put(fVarS.f60694a, fVarS);
                }
                break;
            case 18:
                if (iH2 == hVar.f60711a) {
                    C0907a c0907aO = o(c6608h, iH3);
                    hVar.f60714d.put(c0907aO.f60674a, c0907aO);
                } else if (iH2 == hVar.f60712b) {
                    C0907a c0907aO2 = o(c6608h, iH3);
                    hVar.f60716f.put(c0907aO2.f60674a, c0907aO2);
                }
                break;
            case 19:
                if (iH2 == hVar.f60711a) {
                    c cVarQ = q(c6608h);
                    hVar.f60715e.put(cVarQ.f60684a, cVarQ);
                } else if (iH2 == hVar.f60712b) {
                    c cVarQ2 = q(c6608h);
                    hVar.f60717g.put(cVarQ2.f60684a, cVarQ2);
                }
                break;
            case 20:
                if (iH2 == hVar.f60711a) {
                    hVar.f60718h = p(c6608h);
                }
                break;
        }
        c6608h.s(iD - c6608h.d());
    }

    @Override // r3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC6627n interfaceC6627n) {
        C6608H c6608h = new C6608H(bArr, i11 + i10);
        c6608h.p(i10);
        interfaceC6627n.accept(n(c6608h));
    }

    @Override // r3.r
    public int c() {
        return 2;
    }

    @Override // r3.r
    public void reset() {
        this.f60672f.a();
    }
}
