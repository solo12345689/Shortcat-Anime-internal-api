package u2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import t2.AbstractC6614a;
import t2.C6608H;

/* JADX INFO: renamed from: u2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6727i {

    /* JADX INFO: renamed from: u2.i$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f61318a;

        private b(e eVar, d dVar) throws c {
            int i10 = dVar.f61319a;
            AbstractC6614a.a(i10 == 6 || i10 == 3);
            byte[] bArr = new byte[Math.min(4, dVar.f61320b.remaining())];
            dVar.f61320b.asReadOnlyBuffer().get(bArr);
            C6608H c6608h = new C6608H(bArr);
            AbstractC6727i.f(eVar.f61321a);
            if (c6608h.g()) {
                this.f61318a = false;
                return;
            }
            int iH = c6608h.h(2);
            boolean zG = c6608h.g();
            AbstractC6727i.f(eVar.f61322b);
            if (!zG) {
                this.f61318a = true;
                return;
            }
            boolean zG2 = (iH == 3 || iH == 0) ? true : c6608h.g();
            c6608h.q();
            AbstractC6727i.f(!eVar.f61324d);
            if (c6608h.g()) {
                AbstractC6727i.f(!eVar.f61325e);
                c6608h.q();
            }
            AbstractC6727i.f(eVar.f61323c);
            if (iH != 3) {
                c6608h.q();
            }
            c6608h.r(eVar.f61326f);
            if (iH != 2 && iH != 0 && !zG2) {
                c6608h.r(3);
            }
            this.f61318a = ((iH == 3 || iH == 0) ? 255 : c6608h.h(8)) != 0;
        }

        public static b b(e eVar, d dVar) {
            try {
                return new b(eVar, dVar);
            } catch (c unused) {
                return null;
            }
        }

        public boolean a() {
            return this.f61318a;
        }
    }

    /* JADX INFO: renamed from: u2.i$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends Exception {
        private c() {
        }
    }

    /* JADX INFO: renamed from: u2.i$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f61320b;

        private d(int i10, ByteBuffer byteBuffer) {
            this.f61319a = i10;
            this.f61320b = byteBuffer;
        }
    }

    /* JADX INFO: renamed from: u2.i$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f61321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f61322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f61323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f61324d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f61325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f61326f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f61327g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f61328h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f61329i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f61330j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f61331k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f61332l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f61333m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f61334n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f61335o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f61336p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f61337q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final byte f61338r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final byte f61339s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final byte f61340t;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        private e(d dVar) {
            int iH;
            int iH2;
            boolean zG;
            ?? r82;
            AbstractC6614a.a(dVar.f61319a == 1);
            byte[] bArr = new byte[dVar.f61320b.remaining()];
            dVar.f61320b.asReadOnlyBuffer().get(bArr);
            C6608H c6608h = new C6608H(bArr);
            this.f61327g = c6608h.h(3);
            c6608h.q();
            boolean zG2 = c6608h.g();
            this.f61321a = zG2;
            if (zG2) {
                iH2 = c6608h.h(5);
                this.f61322b = false;
                this.f61330j = false;
                r82 = 0;
                iH = 0;
            } else {
                if (c6608h.g()) {
                    b(c6608h);
                    boolean zG3 = c6608h.g();
                    this.f61322b = zG3;
                    if (zG3) {
                        c6608h.r(47);
                    }
                } else {
                    this.f61322b = false;
                }
                this.f61330j = c6608h.g();
                int iH3 = c6608h.h(5);
                int iH4 = 0;
                int i10 = 0;
                boolean z10 = false;
                iH = 0;
                while (i10 <= iH3) {
                    c6608h.r(12);
                    if (i10 == 0) {
                        iH4 = c6608h.h(5);
                        zG = z10;
                        if (iH4 > 7) {
                            zG = c6608h.g();
                        }
                    } else {
                        zG = z10;
                        if (c6608h.h(5) > 7) {
                            c6608h.q();
                            zG = z10;
                        }
                    }
                    if (this.f61322b) {
                        c6608h.q();
                    }
                    if (this.f61330j && c6608h.g()) {
                        if (i10 == 0) {
                            iH = c6608h.h(4);
                        } else {
                            c6608h.r(4);
                        }
                    }
                    i10++;
                    z10 = zG;
                }
                iH2 = iH4;
                r82 = z10;
            }
            int iH5 = c6608h.h(4);
            int iH6 = c6608h.h(4);
            c6608h.r(iH5 + 1);
            c6608h.r(iH6 + 1);
            if (this.f61321a) {
                this.f61323c = false;
            } else {
                this.f61323c = c6608h.g();
            }
            if (this.f61323c) {
                c6608h.r(4);
                c6608h.r(3);
            }
            c6608h.r(3);
            if (this.f61321a) {
                this.f61325e = true;
                this.f61324d = true;
                this.f61326f = 0;
            } else {
                c6608h.r(4);
                boolean zG4 = c6608h.g();
                if (zG4) {
                    c6608h.r(2);
                }
                if (c6608h.g()) {
                    this.f61324d = true;
                } else {
                    this.f61324d = c6608h.g();
                }
                if (!this.f61324d || c6608h.g()) {
                    this.f61325e = true;
                } else {
                    this.f61325e = c6608h.g();
                }
                if (zG4) {
                    this.f61326f = c6608h.h(3) + 1;
                } else {
                    this.f61326f = 0;
                }
            }
            this.f61328h = iH2;
            this.f61329i = r82;
            this.f61331k = iH;
            c6608h.r(3);
            boolean zG5 = c6608h.g();
            this.f61332l = zG5;
            if (this.f61327g == 2 && zG5) {
                this.f61333m = c6608h.g();
            } else {
                this.f61333m = false;
            }
            if (this.f61327g != 1) {
                this.f61334n = c6608h.g();
            } else {
                this.f61334n = false;
            }
            if (c6608h.g()) {
                this.f61338r = (byte) c6608h.h(8);
                this.f61339s = (byte) c6608h.h(8);
                this.f61340t = (byte) c6608h.h(8);
            } else {
                this.f61338r = (byte) 0;
                this.f61339s = (byte) 0;
                this.f61340t = (byte) 0;
            }
            if (this.f61334n) {
                c6608h.q();
                this.f61335o = false;
                this.f61336p = false;
                this.f61337q = 0;
            } else if (this.f61338r == 1 && this.f61339s == 13 && this.f61340t == 0) {
                this.f61335o = false;
                this.f61336p = false;
                this.f61337q = 0;
            } else {
                c6608h.q();
                int i11 = this.f61327g;
                if (i11 == 0) {
                    this.f61335o = true;
                    this.f61336p = true;
                } else if (i11 == 1) {
                    this.f61335o = false;
                    this.f61336p = false;
                } else if (this.f61333m) {
                    boolean zG6 = c6608h.g();
                    this.f61335o = zG6;
                    if (zG6) {
                        this.f61336p = c6608h.g();
                    } else {
                        this.f61336p = false;
                    }
                } else {
                    this.f61335o = true;
                    this.f61336p = false;
                }
                if (this.f61335o && this.f61336p) {
                    this.f61337q = c6608h.h(2);
                } else {
                    this.f61337q = 0;
                }
            }
            c6608h.q();
        }

        public static e a(d dVar) {
            try {
                return new e(dVar);
            } catch (c unused) {
                return null;
            }
        }

        private static void b(C6608H c6608h) {
            c6608h.r(64);
            if (c6608h.g()) {
                AbstractC6727i.d(c6608h);
            }
        }
    }

    private static int c(ByteBuffer byteBuffer) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            byte b10 = byteBuffer.get();
            i10 |= (b10 & 127) << (i11 * 7);
            if ((b10 & 128) == 0) {
                return i10;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(C6608H c6608h) {
        int i10 = 0;
        while (!c6608h.g()) {
            i10++;
        }
        if (i10 < 32) {
            c6608h.r(i10);
        }
    }

    public static List e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b10 = byteBufferAsReadOnlyBuffer.get();
            int i10 = (b10 >> 3) & 15;
            if (((b10 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            int iC = ((b10 >> 1) & 1) != 0 ? c(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iC);
            arrayList.add(new d(i10, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iC);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(boolean z10) throws c {
        if (z10) {
            throw new c();
        }
    }
}
