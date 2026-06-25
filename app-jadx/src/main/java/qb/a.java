package Qb;

import Td.B;
import android.graphics.Bitmap;
import android.graphics.Color;
import ce.AbstractC3098c;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14786a = new a();

    /* JADX INFO: renamed from: Qb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0246a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float[] f14787a;

        public C0246a(int i10, int i11) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                for (int i14 = i12 > 0 ? 0 : 1; i14 * i11 < (i11 - i12) * i10; i14++) {
                    i13++;
                }
                i12++;
            }
            this.f14787a = new float[i13];
        }

        public final int a(byte[] hash, int i10, int i11, float f10) {
            AbstractC5504s.h(hash, "hash");
            int length = this.f14787a.length;
            for (int i12 = 0; i12 < length; i12++) {
                this.f14787a[i12] = ((((hash[(i11 >> 1) + i10] >> ((i11 & 1) << 2)) & 15) / 7.5f) - 1.0f) * f10;
                i11++;
            }
            return i11;
        }

        public final float[] b() {
            return this.f14787a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f14790c;

        public b(int i10, int i11, byte[] rgba) {
            AbstractC5504s.h(rgba, "rgba");
            this.f14788a = i10;
            this.f14789b = i11;
            this.f14790c = rgba;
        }

        public final int a() {
            return this.f14789b;
        }

        public final byte[] b() {
            return this.f14790c;
        }

        public final int c() {
            return this.f14788a;
        }
    }

    private a() {
    }

    public final float a(byte[] hash) {
        AbstractC5504s.h(hash, "hash");
        byte b10 = hash[3];
        boolean z10 = (hash[2] & 128) != 0;
        boolean z11 = (hash[4] & 128) != 0;
        int i10 = 5;
        int i11 = z11 ? z10 ? 5 : 7 : b10 & 7;
        if (z11) {
            i10 = b10 & 7;
        } else if (!z10) {
            i10 = 7;
        }
        return i11 / i10;
    }

    public final Bitmap b(byte[] hash) {
        AbstractC5504s.h(hash, "hash");
        b bVarC = c(hash);
        int[] iArr = new int[bVarC.c() * bVarC.a()];
        byte[] bArrB = bVarC.b();
        ArrayList arrayList = new ArrayList(bArrB.length);
        int i10 = 0;
        for (byte b10 : bArrB) {
            arrayList.add(Integer.valueOf(B.b(b10) & 255));
        }
        int iC = AbstractC3098c.c(0, arrayList.size() - 1, 4);
        if (iC >= 0) {
            while (true) {
                iArr[i10 / 4] = Color.argb(((Number) arrayList.get(i10 + 3)).intValue(), ((Number) arrayList.get(i10)).intValue(), ((Number) arrayList.get(i10 + 1)).intValue(), ((Number) arrayList.get(i10 + 2)).intValue());
                if (i10 == iC) {
                    break;
                }
                i10 += 4;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, bVarC.c(), bVarC.a(), Bitmap.Config.ARGB_8888);
        AbstractC5504s.g(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public final b c(byte[] hash) {
        float f10;
        int i10;
        C0246a c0246a;
        int i11;
        int i12;
        int i13;
        AbstractC5504s.h(hash, "hash");
        int i14 = (hash[0] & 255) | ((hash[1] & 255) << 8) | ((hash[2] & 255) << 16);
        int i15 = (hash[3] & 255) | ((hash[4] & 255) << 8);
        float f11 = (i14 & 63) / 63.0f;
        float f12 = (((i14 >> 6) & 63) / 31.5f) - 1.0f;
        float f13 = (((i14 >> 12) & 63) / 31.5f) - 1.0f;
        float f14 = ((i14 >> 18) & 31) / 31.0f;
        boolean z10 = (i14 >> 23) != 0;
        float f15 = ((i15 >> 3) & 63) / 63.0f;
        float f16 = ((i15 >> 9) & 63) / 63.0f;
        boolean z11 = (i15 >> 15) != 0;
        int i16 = 7;
        int iMax = Math.max(3, z11 ? z10 ? 5 : 7 : i15 & 7);
        if (z11) {
            i16 = 7 & i15;
        } else if (z10) {
            i16 = 5;
        }
        int iMax2 = Math.max(3, i16);
        float f17 = z10 ? (hash[5] & 15) / 15.0f : 1.0f;
        float f18 = ((hash[5] >> 4) & 15) / 15.0f;
        if (z10) {
            f10 = 1.0f;
            i10 = 6;
        } else {
            f10 = 1.0f;
            i10 = 5;
        }
        C0246a c0246a2 = new C0246a(iMax, iMax2);
        C0246a c0246a3 = new C0246a(3, 3);
        boolean z12 = z10;
        C0246a c0246a4 = new C0246a(3, 3);
        int iA = c0246a4.a(hash, i10, c0246a3.a(hash, i10, c0246a2.a(hash, i10, 0, f14), f15 * 1.25f), f16 * 1.25f);
        float[] fArrB = null;
        if (z12) {
            c0246a = new C0246a(5, 5);
            c0246a.a(hash, i10, iA, f18);
        } else {
            c0246a = null;
        }
        float[] fArrB2 = c0246a2.b();
        float[] fArrB3 = c0246a3.b();
        float[] fArrB4 = c0246a4.b();
        if (z12) {
            AbstractC5504s.e(c0246a);
            fArrB = c0246a.b();
        }
        float fA = a(hash);
        int iRound = Math.round(fA > f10 ? 32.0f : fA * 32.0f);
        int iRound2 = Math.round(fA > f10 ? 32.0f / fA : 32.0f);
        byte[] bArr = new byte[iRound * iRound2 * 4];
        int iMax3 = Math.max(iMax, z12 ? 5 : 3);
        int iMax4 = Math.max(iMax2, z12 ? 5 : 3);
        float[] fArr = new float[iMax3];
        float[] fArr2 = new float[iMax4];
        int i17 = 0;
        int i18 = 0;
        while (i17 < iRound2) {
            float[] fArr3 = fArrB4;
            int i19 = 0;
            while (i19 < iRound) {
                float[] fArr4 = fArrB2;
                int i20 = 0;
                while (i20 < iMax3) {
                    fArr[i20] = (float) Math.cos((3.141592653589793d / ((double) iRound)) * ((double) (i19 + 0.5f)) * ((double) i20));
                    i20++;
                    f11 = f11;
                    iMax = iMax;
                }
                int i21 = iMax;
                float f19 = f11;
                int i22 = 0;
                while (i22 < iMax4) {
                    fArr2[i22] = (float) Math.cos((3.141592653589793d / ((double) iRound2)) * ((double) (i17 + 0.5f)) * ((double) i22));
                    i22++;
                    i19 = i19;
                    i17 = i17;
                }
                int i23 = i17;
                int i24 = i19;
                float f20 = f19;
                int i25 = 0;
                int i26 = 0;
                while (i25 < iMax2) {
                    float f21 = fArr2[i25] * 2.0f;
                    int i27 = i25 > 0 ? 0 : 1;
                    int i28 = i25;
                    while (true) {
                        i13 = i26;
                        if (i27 * iMax2 < i21 * (iMax2 - i28)) {
                            f20 += fArr4[i13] * fArr[i27] * f21;
                            i27++;
                            i26 = i13 + 1;
                        }
                    }
                    i25 = i28 + 1;
                    i26 = i13;
                }
                float f22 = f12;
                float f23 = f13;
                int i29 = 0;
                int i30 = 0;
                while (i29 < 3) {
                    float f24 = fArr2[i29] * 2.0f;
                    int i31 = i29 > 0 ? 0 : 1;
                    while (true) {
                        i12 = i29;
                        if (i31 < 3 - i12) {
                            float f25 = fArr[i31] * f24;
                            f22 += fArrB3[i30] * f25;
                            f23 += fArr3[i30] * f25;
                            i31++;
                            i30++;
                            i29 = i12;
                        }
                    }
                    i29 = i12 + 1;
                }
                float f26 = f17;
                if (z12) {
                    int i32 = 0;
                    int i33 = 0;
                    while (i32 < 5) {
                        float f27 = fArr2[i32] * 2.0f;
                        int i34 = i32 > 0 ? 0 : 1;
                        while (true) {
                            i11 = i32;
                            if (i34 < 5 - i11) {
                                AbstractC5504s.e(fArrB);
                                f26 += fArrB[i33] * fArr[i34] * f27;
                                i34++;
                                i33++;
                                i32 = i11;
                            }
                        }
                        i32 = i11 + 1;
                    }
                }
                float f28 = f20 - (f22 * 0.6666667f);
                float f29 = (((f20 * 3.0f) - f28) + f23) / 2.0f;
                bArr[i18] = (byte) Math.max(0, Math.round(Math.min(f10, f29) * 255.0f));
                bArr[i18 + 1] = (byte) Math.max(0, Math.round(Math.min(1.0f, f29 - f23) * 255.0f));
                bArr[i18 + 2] = (byte) Math.max(0, Math.round(Math.min(1.0f, f28) * 255.0f));
                bArr[i18 + 3] = (byte) Math.max(0, Math.round(Math.min(1.0f, f26) * 255.0f));
                i19 = i24 + 1;
                i18 += 4;
                f10 = 1.0f;
                fArrB2 = fArr4;
                f11 = f19;
                iMax = i21;
                i17 = i23;
            }
            i17++;
            fArrB4 = fArr3;
            fArrB2 = fArrB2;
            f11 = f11;
        }
        return new b(iRound, iRound2, bArr);
    }
}
