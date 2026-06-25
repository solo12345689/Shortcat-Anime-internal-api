package F0;

import Td.r;
import Ud.AbstractC2273n;
import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f6123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F0.a[] f6125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f6127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f6128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f6129h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6130a = new a("Lsq2", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6131b = new a("Impulse", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f6132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f6133d;

        static {
            a[] aVarArrA = a();
            f6132c = aVarArrA;
            f6133d = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f6130a, f6131b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6132c.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6134a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f6131b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f6130a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6134a = iArr;
        }
    }

    public c(boolean z10, a aVar) {
        this.f6122a = z10;
        this.f6123b = aVar;
        if (z10 && aVar.equals(a.f6130a)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i10 = b.f6134a[aVar.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new r();
            }
            i11 = 3;
        }
        this.f6124c = i11;
        this.f6125d = new F0.a[20];
        this.f6127f = new float[20];
        this.f6128g = new float[20];
        this.f6129h = new float[3];
    }

    private final float b(float[] fArr, float[] fArr2, int i10) {
        try {
            return e.j(fArr2, fArr, i10, 2, this.f6129h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long j10, float f10) {
        int i10 = (this.f6126e + 1) % 20;
        this.f6126e = i10;
        e.k(this.f6125d, i10, j10, f10);
    }

    public final float c() {
        float fG;
        float[] fArr = this.f6127f;
        float[] fArr2 = this.f6128g;
        int i10 = this.f6126e;
        F0.a aVar = this.f6125d[i10];
        if (aVar == null) {
            return 0.0f;
        }
        int i11 = 0;
        F0.a aVar2 = aVar;
        while (true) {
            F0.a aVar3 = this.f6125d[i10];
            if (aVar3 == null) {
                break;
            }
            float fB = aVar.b() - aVar3.b();
            float fAbs = Math.abs(aVar3.b() - aVar2.b());
            F0.a aVar4 = (this.f6123b == a.f6130a || this.f6122a) ? aVar3 : aVar;
            if (fB > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i11] = aVar3.a();
            fArr2[i11] = -fB;
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            aVar2 = aVar4;
        }
        if (i11 < this.f6124c) {
            return 0.0f;
        }
        int i12 = b.f6134a[this.f6123b.ordinal()];
        if (i12 == 1) {
            fG = e.g(fArr, fArr2, i11, this.f6122a);
        } else {
            if (i12 != 2) {
                throw new r();
            }
            fG = b(fArr, fArr2, i11);
        }
        return fG * 1000;
    }

    public final float d(float f10) {
        if (!(f10 > 0.0f)) {
            H0.a.b("maximumVelocity should be a positive value. You specified=" + f10);
        }
        float fC = c();
        if (fC == 0.0f || Float.isNaN(fC)) {
            return 0.0f;
        }
        return fC > 0.0f ? AbstractC5874j.h(fC, f10) : AbstractC5874j.d(fC, -f10);
    }

    public final void e() {
        AbstractC2273n.z(this.f6125d, null, 0, 0, 6, null);
        this.f6126e = 0;
    }

    public /* synthetic */ c(boolean z10, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? a.f6130a : aVar);
    }
}
