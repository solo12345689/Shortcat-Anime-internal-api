package androidx.transition;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f32318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f32319b = new float[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32320c = 0;

    A() {
        long[] jArr = new long[20];
        this.f32318a = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float c(float f10) {
        return (float) (((double) Math.signum(f10)) * Math.sqrt(Math.abs(f10) * 2.0f));
    }

    public void a(long j10, float f10) {
        int i10 = (this.f32320c + 1) % 20;
        this.f32320c = i10;
        this.f32318a[i10] = j10;
        this.f32319b[i10] = f10;
    }

    float b() {
        float fC;
        int i10 = this.f32320c;
        if (i10 == 0 && this.f32318a[i10] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j10 = this.f32318a[i10];
        int i11 = 0;
        long j11 = j10;
        while (true) {
            long j12 = this.f32318a[i10];
            if (j12 == Long.MIN_VALUE) {
                break;
            }
            float f10 = j10 - j12;
            float fAbs = Math.abs(j12 - j11);
            if (f10 > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            j11 = j12;
        }
        if (i11 < 2) {
            return 0.0f;
        }
        if (i11 == 2) {
            int i12 = this.f32320c;
            int i13 = i12 == 0 ? 19 : i12 - 1;
            long[] jArr = this.f32318a;
            float f11 = jArr[i12] - jArr[i13];
            if (f11 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f32319b;
            fC = (fArr[i12] - fArr[i13]) / f11;
        } else {
            int i14 = this.f32320c;
            int i15 = ((i14 - i11) + 21) % 20;
            int i16 = (i14 + 21) % 20;
            long j13 = this.f32318a[i15];
            float f12 = this.f32319b[i15];
            int i17 = i15 + 1;
            float fC2 = 0.0f;
            for (int i18 = i17 % 20; i18 != i16; i18 = (i18 + 1) % 20) {
                long j14 = this.f32318a[i18];
                float f13 = j14 - j13;
                if (f13 != 0.0f) {
                    float f14 = this.f32319b[i18];
                    float f15 = (f14 - f12) / f13;
                    fC2 += (f15 - c(fC2)) * Math.abs(f15);
                    if (i18 == i17) {
                        fC2 *= 0.5f;
                    }
                    f12 = f14;
                    j13 = j14;
                }
            }
            fC = c(fC2);
        }
        return fC * 1000.0f;
    }
}
