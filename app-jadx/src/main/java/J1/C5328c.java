package j1;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5328c implements InterfaceC5326a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f51593c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f51594d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f51595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f51596b;

    /* JADX INFO: renamed from: j1.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(float f10, float[] fArr, float[] fArr2) {
            float f11;
            float f12;
            float f13;
            float fA;
            float fAbs = Math.abs(f10);
            float fSignum = Math.signum(f10);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fA = fArr2[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                int i11 = i10 - 1;
                float f14 = 0.0f;
                if (i11 >= fArr.length - 1) {
                    float f15 = fArr[fArr.length - 1];
                    float f16 = fArr2[fArr.length - 1];
                    if (f15 == 0.0f) {
                        return 0.0f;
                    }
                    return f10 * (f16 / f15);
                }
                if (i11 == -1) {
                    f11 = fArr[0];
                    f13 = fArr2[0];
                    f12 = 0.0f;
                } else {
                    f14 = fArr[i11];
                    f11 = fArr[i10];
                    f12 = fArr2[i11];
                    f13 = fArr2[i10];
                }
                fA = C5329d.f51597a.a(f12, f13, f14, f11, fAbs);
            }
            return fSignum * fA;
        }

        private a() {
        }
    }

    public C5328c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f51595a = fArr;
        this.f51596b = fArr2;
    }

    @Override // j1.InterfaceC5326a
    public float a(float f10) {
        return f51593c.b(f10, this.f51596b, this.f51595a);
    }

    @Override // j1.InterfaceC5326a
    public float b(float f10) {
        return f51593c.b(f10, this.f51595a, this.f51596b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5328c)) {
            return false;
        }
        C5328c c5328c = (C5328c) obj;
        return Arrays.equals(this.f51595a, c5328c.f51595a) && Arrays.equals(this.f51596b, c5328c.f51596b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f51595a) * 31) + Arrays.hashCode(this.f51596b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f51595a);
        AbstractC5504s.g(string, "toString(...)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f51596b);
        AbstractC5504s.g(string2, "toString(...)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
