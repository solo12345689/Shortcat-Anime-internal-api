package Rh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InputStream f15521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f15523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f15524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f15525h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f15518a = new byte[4160];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f15519b = new int[1040];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f15520c = new i();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f15526i = 0;

    a() {
    }

    static void a(a aVar, boolean z10) {
        if (aVar.f15522e) {
            int i10 = ((aVar.f15525h << 2) + ((aVar.f15524g + 7) >> 3)) - 8;
            int i11 = aVar.f15526i;
            if (i10 > i11) {
                throw new c("Read after end");
            }
            if (z10 && i10 != i11) {
                throw new c("Unused bytes after end");
            }
        }
    }

    static void b(a aVar) throws IOException {
        InputStream inputStream = aVar.f15521d;
        aVar.f15521d = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    static void c(a aVar, byte[] bArr, int i10, int i11) {
        if ((aVar.f15524g & 7) != 0) {
            throw new c("Unaligned copyBytes");
        }
        while (true) {
            int i12 = aVar.f15524g;
            if (i12 == 64 || i11 == 0) {
                break;
            }
            bArr[i10] = (byte) (aVar.f15523f >>> i12);
            aVar.f15524g = i12 + 8;
            i11--;
            i10++;
        }
        if (i11 == 0) {
            return;
        }
        int iMin = Math.min(f(aVar), i11 >> 2);
        if (iMin > 0) {
            int i13 = iMin << 2;
            System.arraycopy(aVar.f15518a, aVar.f15525h << 2, bArr, i10, i13);
            i10 += i13;
            i11 -= i13;
            aVar.f15525h += iMin;
        }
        if (i11 == 0) {
            return;
        }
        if (f(aVar) <= 0) {
            while (i11 > 0) {
                try {
                    int i14 = aVar.f15521d.read(bArr, i10, i11);
                    if (i14 == -1) {
                        throw new c("Unexpected end of input");
                    }
                    i10 += i14;
                    i11 -= i14;
                } catch (IOException e10) {
                    throw new c("Failed to read input", e10);
                }
            }
            return;
        }
        d(aVar);
        while (i11 != 0) {
            long j10 = aVar.f15523f;
            int i15 = aVar.f15524g;
            bArr[i10] = (byte) (j10 >>> i15);
            aVar.f15524g = i15 + 8;
            i11--;
            i10++;
        }
        a(aVar, false);
    }

    static void d(a aVar) {
        int i10 = aVar.f15524g;
        if (i10 >= 32) {
            int[] iArr = aVar.f15519b;
            int i11 = aVar.f15525h;
            aVar.f15525h = i11 + 1;
            aVar.f15523f = (((long) iArr[i11]) << 32) | (aVar.f15523f >>> 32);
            aVar.f15524g = i10 - 32;
        }
    }

    static void e(a aVar, InputStream inputStream) {
        if (aVar.f15521d != null) {
            throw new IllegalStateException("Bit reader already has associated input stream");
        }
        i.b(aVar.f15520c, aVar.f15518a, aVar.f15519b);
        aVar.f15521d = inputStream;
        aVar.f15523f = 0L;
        aVar.f15524g = 64;
        aVar.f15525h = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        aVar.f15522e = false;
        h(aVar);
    }

    static int f(a aVar) {
        return (aVar.f15522e ? (aVar.f15526i + 3) >> 2 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) - aVar.f15525h;
    }

    static void g(a aVar) {
        int i10 = (64 - aVar.f15524g) & 7;
        if (i10 != 0 && i(aVar, i10) != 0) {
            throw new c("Corrupted padding bits");
        }
    }

    private static void h(a aVar) {
        j(aVar);
        a(aVar, false);
        d(aVar);
        d(aVar);
    }

    static int i(a aVar, int i10) {
        d(aVar);
        long j10 = aVar.f15523f;
        int i11 = aVar.f15524g;
        int i12 = ((int) (j10 >>> i11)) & ((1 << i10) - 1);
        aVar.f15524g = i11 + i10;
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        r4.f15522e = true;
        r4.f15526i = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r1 = r1 + 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void j(Rh.a r4) {
        /*
            int r0 = r4.f15525h
            r1 = 1015(0x3f7, float:1.422E-42)
            if (r0 > r1) goto L7
            goto L12
        L7:
            boolean r1 = r4.f15522e
            if (r1 == 0) goto L1b
            int r4 = f(r4)
            r0 = -2
            if (r4 < r0) goto L13
        L12:
            return
        L13:
            Rh.c r4 = new Rh.c
            java.lang.String r0 = "No more input"
            r4.<init>(r0)
            throw r4
        L1b:
            int r0 = r0 << 2
            int r1 = 4096 - r0
            byte[] r2 = r4.f15518a
            r3 = 0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            r4.f15525h = r3
        L27:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r0) goto L4a
            java.io.InputStream r0 = r4.f15521d     // Catch: java.io.IOException -> L41
            byte[] r2 = r4.f15518a     // Catch: java.io.IOException -> L41
            int r3 = 4096 - r1
            int r0 = r0.read(r2, r1, r3)     // Catch: java.io.IOException -> L41
            if (r0 > 0) goto L3f
            r0 = 1
            r4.f15522e = r0     // Catch: java.io.IOException -> L41
            r4.f15526i = r1     // Catch: java.io.IOException -> L41
            int r1 = r1 + 3
            goto L4a
        L3f:
            int r1 = r1 + r0
            goto L27
        L41:
            r4 = move-exception
            Rh.c r0 = new Rh.c
            java.lang.String r1 = "Failed to read input"
            r0.<init>(r1, r4)
            throw r0
        L4a:
            Rh.i r4 = r4.f15520c
            int r0 = r1 >> 2
            Rh.i.a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Rh.a.j(Rh.a):void");
    }

    static void k(a aVar) {
        if (aVar.f15524g == 64) {
            h(aVar);
        }
    }
}
