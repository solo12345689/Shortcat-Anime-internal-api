package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f28996a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f28997b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f28998c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28999d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29000e = 0;

    Y() {
    }

    private void b() {
        this.f28999d = 0;
        this.f28998c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j10;
        int i10 = this.f28999d;
        if (i10 < 2) {
            return 0.0f;
        }
        int i11 = this.f29000e;
        int i12 = ((i11 + 20) - (i10 - 1)) % 20;
        long j11 = this.f28997b[i11];
        while (true) {
            jArr = this.f28997b;
            j10 = jArr[i12];
            if (j11 - j10 <= 100) {
                break;
            }
            this.f28999d--;
            i12 = (i12 + 1) % 20;
        }
        int i13 = this.f28999d;
        if (i13 < 2) {
            return 0.0f;
        }
        if (i13 == 2) {
            int i14 = (i12 + 1) % 20;
            if (j10 == jArr[i14]) {
                return 0.0f;
            }
            return this.f28996a[i14] / (r2 - j10);
        }
        float fAbs = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f28999d - 1; i16++) {
            int i17 = i16 + i12;
            long[] jArr2 = this.f28997b;
            long j12 = jArr2[i17 % 20];
            int i18 = (i17 + 1) % 20;
            if (jArr2[i18] != j12) {
                i15++;
                float f10 = f(fAbs);
                float f11 = this.f28996a[i18] / (this.f28997b[i18] - j12);
                fAbs += (f11 - f10) * Math.abs(f11);
                if (i15 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }

    private static float f(float f10) {
        return (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f28999d != 0 && eventTime - this.f28997b[this.f29000e] > 40) {
            b();
        }
        int i10 = (this.f29000e + 1) % 20;
        this.f29000e = i10;
        int i11 = this.f28999d;
        if (i11 != 20) {
            this.f28999d = i11 + 1;
        }
        this.f28996a[i10] = motionEvent.getAxisValue(26);
        this.f28997b[this.f29000e] = eventTime;
    }

    void c(int i10, float f10) {
        float fE = e() * i10;
        this.f28998c = fE;
        if (fE < (-Math.abs(f10))) {
            this.f28998c = -Math.abs(f10);
        } else if (this.f28998c > Math.abs(f10)) {
            this.f28998c = Math.abs(f10);
        }
    }

    float d(int i10) {
        if (i10 != 26) {
            return 0.0f;
        }
        return this.f28998c;
    }
}
