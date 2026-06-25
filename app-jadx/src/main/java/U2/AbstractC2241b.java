package U2;

import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;
import q2.C6102q;
import q2.C6109x;
import t2.C6608H;
import t2.C6609I;
import t2.a0;

/* JADX INFO: renamed from: U2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2241b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f18971a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f18972b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f18973c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f18974d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f18975e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, JfifUtil.MARKER_SOFn, 224, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 320, 384, 448, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f18976f = {69, 87, 104, 121, 139, 174, JfifUtil.MARKER_RST0, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: U2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0321b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f18980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f18982f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f18983g;

        private C0321b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f18977a = str;
            this.f18978b = i10;
            this.f18980d = i11;
            this.f18979c = i12;
            this.f18981e = i13;
            this.f18982f = i14;
            this.f18983g = i15;
        }
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((a0.R(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    private static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f18972b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f18976f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f18975e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static C6109x d(C6609I c6609i, String str, String str2, C6102q c6102q) {
        C6608H c6608h = new C6608H();
        c6608h.m(c6609i);
        int i10 = f18972b[c6608h.h(2)];
        c6608h.r(8);
        int i11 = f18974d[c6608h.h(3)];
        if (c6608h.h(1) != 0) {
            i11++;
        }
        int i12 = f18975e[c6608h.h(5)] * 1000;
        c6608h.c();
        c6609i.b0(c6608h.d());
        return new C6109x.b().j0(str).y0("audio/ac3").T(i11).z0(i10).c0(c6102q).n0(str2).S(i12).t0(i12).P();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f18971a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        return 1536;
    }

    public static C0321b f(C6608H c6608h) {
        int iC;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iE = c6608h.e();
        c6608h.r(40);
        boolean z10 = c6608h.h(5) > 10;
        c6608h.p(iE);
        int i19 = -1;
        if (z10) {
            c6608h.r(16);
            int iH = c6608h.h(2);
            if (iH == 0) {
                i19 = 0;
            } else if (iH == 1) {
                i19 = 1;
            } else if (iH == 2) {
                i19 = 2;
            }
            c6608h.r(3);
            iC = (c6608h.h(11) + 1) * 2;
            int iH2 = c6608h.h(2);
            if (iH2 == 3) {
                i10 = f18973c[c6608h.h(2)];
                i14 = 3;
                i15 = 6;
            } else {
                int iH3 = c6608h.h(2);
                int i20 = f18971a[iH3];
                i14 = iH3;
                i10 = f18972b[iH2];
                i15 = i20;
            }
            i12 = i15 * IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            int iA = a(iC, i10, i15);
            int iH4 = c6608h.h(3);
            boolean zG = c6608h.g();
            i11 = f18974d[iH4] + (zG ? 1 : 0);
            c6608h.r(10);
            if (c6608h.g()) {
                c6608h.r(8);
            }
            if (iH4 == 0) {
                c6608h.r(5);
                if (c6608h.g()) {
                    c6608h.r(8);
                }
            }
            if (i19 == 1 && c6608h.g()) {
                c6608h.r(16);
            }
            if (c6608h.g()) {
                if (iH4 > 2) {
                    c6608h.r(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    c6608h.r(6);
                }
                if ((iH4 & 4) != 0) {
                    c6608h.r(i17);
                }
                if (zG && c6608h.g()) {
                    c6608h.r(5);
                }
                if (i19 == 0) {
                    if (c6608h.g()) {
                        i18 = 6;
                        c6608h.r(6);
                    } else {
                        i18 = 6;
                    }
                    if (iH4 == 0 && c6608h.g()) {
                        c6608h.r(i18);
                    }
                    if (c6608h.g()) {
                        c6608h.r(i18);
                    }
                    int iH5 = c6608h.h(2);
                    if (iH5 == 1) {
                        c6608h.r(5);
                    } else if (iH5 == 2) {
                        c6608h.r(12);
                    } else if (iH5 == 3) {
                        int iH6 = c6608h.h(5);
                        if (c6608h.g()) {
                            c6608h.r(5);
                            if (c6608h.g()) {
                                c6608h.r(4);
                            }
                            if (c6608h.g()) {
                                c6608h.r(4);
                            }
                            if (c6608h.g()) {
                                c6608h.r(4);
                            }
                            if (c6608h.g()) {
                                c6608h.r(4);
                            }
                            if (c6608h.g()) {
                                c6608h.r(4);
                            }
                            if (c6608h.g()) {
                                c6608h.r(4);
                            }
                            if (c6608h.g()) {
                                c6608h.r(4);
                            }
                            if (c6608h.g()) {
                                if (c6608h.g()) {
                                    c6608h.r(4);
                                }
                                if (c6608h.g()) {
                                    c6608h.r(4);
                                }
                            }
                        }
                        if (c6608h.g()) {
                            c6608h.r(5);
                            if (c6608h.g()) {
                                c6608h.r(7);
                                if (c6608h.g()) {
                                    c6608h.r(8);
                                }
                            }
                        }
                        c6608h.r((iH6 + 2) * 8);
                        c6608h.c();
                    }
                    if (iH4 < 2) {
                        if (c6608h.g()) {
                            c6608h.r(14);
                        }
                        if (iH4 == 0 && c6608h.g()) {
                            c6608h.r(14);
                        }
                    }
                    if (c6608h.g()) {
                        if (i14 == 0) {
                            c6608h.r(5);
                        } else {
                            for (int i21 = 0; i21 < i15; i21++) {
                                if (c6608h.g()) {
                                    c6608h.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c6608h.g()) {
                c6608h.r(5);
                if (iH4 == 2) {
                    c6608h.r(4);
                }
                if (iH4 >= 6) {
                    c6608h.r(2);
                }
                if (c6608h.g()) {
                    c6608h.r(8);
                }
                if (iH4 == 0 && c6608h.g()) {
                    c6608h.r(8);
                }
                if (iH2 < 3) {
                    c6608h.q();
                }
            }
            if (i19 == 0 && i14 != 3) {
                c6608h.q();
            }
            if (i19 == 2 && (i14 == 3 || c6608h.g())) {
                i16 = 6;
                c6608h.r(6);
            } else {
                i16 = 6;
            }
            str = (c6608h.g() && c6608h.h(i16) == 1 && c6608h.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = iA;
        } else {
            c6608h.r(32);
            int iH7 = c6608h.h(2);
            String str2 = iH7 == 3 ? null : "audio/ac3";
            int iH8 = c6608h.h(6);
            int i22 = f18975e[iH8 / 2] * 1000;
            iC = c(iH7, iH8);
            c6608h.r(8);
            int iH9 = c6608h.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                c6608h.r(2);
            }
            if ((iH9 & 4) != 0) {
                c6608h.r(2);
            }
            if (iH9 == 2) {
                c6608h.r(2);
            }
            int[] iArr = f18972b;
            i10 = iH7 < iArr.length ? iArr[iH7] : -1;
            i11 = f18974d[iH9] + (c6608h.g() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i22;
        }
        return new C0321b(str, i19, i11, i10, iC, i12, i13);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & 192) >> 6, b10 & 63);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static q2.C6109x h(t2.C6609I r7, java.lang.String r8, java.lang.String r9, q2.C6102q r10) {
        /*
            t2.H r0 = new t2.H
            r0.<init>()
            r0.m(r7)
            r1 = 13
            int r1 = r0.h(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.r(r2)
            r3 = 2
            int r3 = r0.h(r3)
            int[] r4 = U2.AbstractC2241b.f18972b
            r3 = r4[r3]
            r4 = 10
            r0.r(r4)
            int[] r4 = U2.AbstractC2241b.f18974d
            int r5 = r0.h(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.h(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.r(r2)
            r2 = 4
            int r2 = r0.h(r2)
            r0.r(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.r(r2)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.r(r5)
        L4f:
            int r2 = r0.b()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.r(r6)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.c()
            int r0 = r0.d()
            r7.b0(r0)
            q2.x$b r7 = new q2.x$b
            r7.<init>()
            q2.x$b r7 = r7.j0(r8)
            q2.x$b r7 = r7.y0(r2)
            q2.x$b r7 = r7.T(r4)
            q2.x$b r7 = r7.z0(r3)
            q2.x$b r7 = r7.c0(r10)
            q2.x$b r7 = r7.n0(r9)
            q2.x$b r7 = r7.t0(r1)
            q2.x r7 = r7.P()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.AbstractC2241b.h(t2.I, java.lang.String, java.lang.String, q2.q):q2.x");
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
