package i3;

import P9.AbstractC2011u;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import q2.AbstractC6079K;
import q2.C6078J;
import t2.AbstractC6635w;
import t2.C6608H;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48615b = new a() { // from class: i3.g
        @Override // i3.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return h.c(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f48616a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f48618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f48619c;

        public b(int i10, boolean z10, int i11) {
            this.f48617a = i10;
            this.f48618b = z10;
            this.f48619c = i11;
        }
    }

    public h() {
        this(null);
    }

    private static int A(C6609I c6609i, int i10) {
        byte[] bArrF = c6609i.f();
        int iG = c6609i.g();
        int i11 = iG;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iG + i10) {
                return i10;
            }
            if ((bArrF[i11] & 255) == 255 && bArrF[i12] == 0) {
                System.arraycopy(bArrF, i11 + 2, bArrF, i12, (i10 - (i11 - iG)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[PHI: r3
  0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean B(t2.C6609I r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.g()
        L8:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r1.v()     // Catch: java.lang.Throwable -> L22
            long r8 = r1.O()     // Catch: java.lang.Throwable -> L22
            int r10 = r1.U()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r1.P()     // Catch: java.lang.Throwable -> L22
            int r8 = r1.P()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.b0(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.b0(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7e
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L7c
            goto L8e
        L7c:
            r4 = r6
            goto L8e
        L7e:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L86
            r3 = r4
            goto L87
        L86:
            r3 = r6
        L87:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L7c
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.b0(r2)
            return r6
        L9b:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.b0(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.c0(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.b0(r2)
            return r4
        Lb2:
            r1.b0(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.h.B(t2.I, int, int, boolean):boolean");
    }

    public static /* synthetic */ boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? a0.f60567f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static C5033a f(C6609I c6609i, int i10, int i11) {
        int iZ;
        String str;
        int iM = c6609i.M();
        Charset charsetW = w(iM);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        c6609i.q(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + O9.c.e(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iZ = 2;
        } else {
            iZ = z(bArr, 0);
            String strE = O9.c.e(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
            if (strE.indexOf(47) == -1) {
                str = "image/" + strE;
            } else {
                str = strE;
            }
        }
        int i13 = bArr[iZ + 1] & 255;
        int i14 = iZ + 2;
        int iY = y(bArr, i14, iM);
        return new C5033a(str, new String(bArr, i14, iY - i14, charsetW), i13, d(bArr, iY + v(iM), i12));
    }

    private static C5034b g(C6609I c6609i, int i10, String str) {
        byte[] bArr = new byte[i10];
        c6609i.q(bArr, 0, i10);
        return new C5034b(str, bArr);
    }

    private static c h(C6609I c6609i, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int iG = c6609i.g();
        int iZ = z(c6609i.f(), iG);
        String str = new String(c6609i.f(), iG, iZ - iG, StandardCharsets.ISO_8859_1);
        c6609i.b0(iZ + 1);
        int iV = c6609i.v();
        int iV2 = c6609i.v();
        long jO = c6609i.O();
        if (jO == 4294967295L) {
            jO = -1;
        }
        long jO2 = c6609i.O();
        long j10 = jO2 == 4294967295L ? -1L : jO2;
        ArrayList arrayList = new ArrayList();
        int i13 = iG + i10;
        while (c6609i.g() < i13) {
            i iVarK = k(i11, c6609i, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iV, iV2, jO, j10, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(C6609I c6609i, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int iG = c6609i.g();
        int iZ = z(c6609i.f(), iG);
        String str = new String(c6609i.f(), iG, iZ - iG, StandardCharsets.ISO_8859_1);
        c6609i.b0(iZ + 1);
        int iM = c6609i.M();
        boolean z11 = (iM & 2) != 0;
        boolean z12 = (iM & 1) != 0;
        int iM2 = c6609i.M();
        String[] strArr = new String[iM2];
        for (int i13 = 0; i13 < iM2; i13++) {
            int iG2 = c6609i.g();
            int iZ2 = z(c6609i.f(), iG2);
            strArr[i13] = new String(c6609i.f(), iG2, iZ2 - iG2, StandardCharsets.ISO_8859_1);
            c6609i.b0(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iG + i10;
        while (c6609i.g() < i14) {
            i iVarK = k(i11, c6609i, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(C6609I c6609i, int i10) {
        if (i10 < 4) {
            return null;
        }
        int iM = c6609i.M();
        Charset charsetW = w(iM);
        byte[] bArr = new byte[3];
        c6609i.q(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        c6609i.q(bArr2, 0, i11);
        int iY = y(bArr2, 0, iM);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iM);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iM), charsetW));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0240  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [i3.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [t2.I] */
    /* JADX WARN: Type inference failed for: r1v11, types: [t2.I] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [t2.I] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static i3.i k(int r19, t2.C6609I r20, boolean r21, int r22, i3.h.a r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.h.k(int, t2.I, boolean, int, i3.h$a):i3.i");
    }

    private static f l(C6609I c6609i, int i10) {
        int iM = c6609i.M();
        Charset charsetW = w(iM);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c6609i.q(bArr, 0, i11);
        int iZ = z(bArr, 0);
        String strU = AbstractC6079K.u(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
        int i12 = iZ + 1;
        int iY = y(bArr, i12, iM);
        String strP = p(bArr, i12, iY, charsetW);
        int iV = iY + v(iM);
        int iY2 = y(bArr, iV, iM);
        return new f(strU, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iM), i11));
    }

    private static b m(C6609I c6609i) {
        if (c6609i.a() < 10) {
            AbstractC6635w.i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iP = c6609i.P();
        if (iP != 4801587) {
            AbstractC6635w.i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iP)));
            return null;
        }
        int iM = c6609i.M();
        c6609i.c0(1);
        int iM2 = c6609i.M();
        int iL = c6609i.L();
        if (iM == 2) {
            if ((iM2 & 64) != 0) {
                AbstractC6635w.i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iM == 3) {
            if ((iM2 & 64) != 0) {
                int iV = c6609i.v();
                c6609i.c0(iV);
                iL -= iV + 4;
            }
        } else {
            if (iM != 4) {
                AbstractC6635w.i("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iM);
                return null;
            }
            if ((iM2 & 64) != 0) {
                int iL2 = c6609i.L();
                c6609i.c0(iL2 - 4);
                iL -= iL2;
            }
            if ((iM2 & 16) != 0) {
                iL -= 10;
            }
        }
        return new b(iM, iM < 4 && (iM2 & 128) != 0, iL);
    }

    private static l n(C6609I c6609i, int i10) {
        int iU = c6609i.U();
        int iP = c6609i.P();
        int iP2 = c6609i.P();
        int iM = c6609i.M();
        int iM2 = c6609i.M();
        C6608H c6608h = new C6608H();
        c6608h.m(c6609i);
        int i11 = ((i10 - 10) * 8) / (iM + iM2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH = c6608h.h(iM);
            int iH2 = c6608h.h(iM2);
            iArr[i12] = iH;
            iArr2[i12] = iH2;
        }
        return new l(iU, iP, iP2, iArr, iArr2);
    }

    private static m o(C6609I c6609i, int i10) {
        byte[] bArr = new byte[i10];
        c6609i.q(bArr, 0, i10);
        int iZ = z(bArr, 0);
        return new m(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1), d(bArr, iZ + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static n q(C6609I c6609i, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int iM = c6609i.M();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c6609i.q(bArr, 0, i11);
        return new n(str, null, r(bArr, iM, 0));
    }

    private static AbstractC2011u r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return AbstractC2011u.B("");
        }
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        int iY = y(bArr, i11, i10);
        while (i11 < iY) {
            aVarT.a(new String(bArr, i11, iY - i11, w(i10)));
            i11 = v(i10) + iY;
            iY = y(bArr, i11, i10);
        }
        AbstractC2011u abstractC2011uK = aVarT.k();
        return abstractC2011uK.isEmpty() ? AbstractC2011u.B("") : abstractC2011uK;
    }

    private static n s(C6609I c6609i, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iM = c6609i.M();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c6609i.q(bArr, 0, i11);
        int iY = y(bArr, 0, iM);
        return new n("TXXX", new String(bArr, 0, iY, w(iM)), r(bArr, iM, iY + v(iM)));
    }

    private static o t(C6609I c6609i, int i10, String str) {
        byte[] bArr = new byte[i10];
        c6609i.q(bArr, 0, i10);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static o u(C6609I c6609i, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iM = c6609i.M();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c6609i.q(bArr, 0, i11);
        int iY = y(bArr, 0, iM);
        String str = new String(bArr, 0, iY, w(iM));
        int iV = iY + v(iM);
        return new o("WXXX", str, p(bArr, iV, z(bArr, iV), StandardCharsets.ISO_8859_1));
    }

    private static int v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static Charset w(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    private static String x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int y(byte[] bArr, int i10, int i11) {
        int iZ = z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iZ;
        }
        while (iZ < bArr.length - 1) {
            if ((iZ - i10) % 2 == 0 && bArr[iZ + 1] == 0) {
                return iZ;
            }
            iZ = z(bArr, iZ + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // d3.c
    protected C6078J b(d3.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public C6078J e(byte[] bArr, int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        C6609I c6609i = new C6609I(bArr, i10);
        b bVarM = m(c6609i);
        if (bVarM == null) {
            return null;
        }
        int iG = c6609i.g();
        int i11 = bVarM.f48617a == 2 ? 6 : 10;
        int iA = bVarM.f48619c;
        if (bVarM.f48618b) {
            iA = A(c6609i, bVarM.f48619c);
        }
        c6609i.a0(iG + iA);
        boolean z10 = false;
        if (!B(c6609i, bVarM.f48617a, i11, false)) {
            if (bVarM.f48617a != 4 || !B(c6609i, 4, i11, true)) {
                AbstractC6635w.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarM.f48617a);
                return null;
            }
            z10 = true;
        }
        while (c6609i.a() >= i11) {
            i iVarK = k(bVarM.f48617a, c6609i, z10, i11, this.f48616a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new C6078J(arrayList);
    }

    public h(a aVar) {
        this.f48616a = aVar;
    }
}
