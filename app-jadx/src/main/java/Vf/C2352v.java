package Vf;

import Ud.AbstractC2273n;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Vf.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2352v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f20239e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long[] f20240f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tf.e f20241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f20242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f20244d;

    /* JADX INFO: renamed from: Vf.v$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2352v(Tf.e descriptor, Function2 readIfAbsent) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(readIfAbsent, "readIfAbsent");
        this.f20241a = descriptor;
        this.f20242b = readIfAbsent;
        int iK = descriptor.k();
        if (iK <= 64) {
            this.f20243c = iK != 64 ? (-1) << iK : 0L;
            this.f20244d = f20240f;
        } else {
            this.f20243c = 0L;
            this.f20244d = e(iK);
        }
    }

    private final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f20244d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    private final int c() {
        int length = this.f20244d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f20244d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (((Boolean) this.f20242b.invoke(this.f20241a, Integer.valueOf(i13))).booleanValue()) {
                    this.f20244d[i10] = j10;
                    return i13;
                }
            }
            this.f20244d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    private final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[AbstractC2273n.e0(jArr)] = (-1) << i10;
        }
        return jArr;
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f20243c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iK = this.f20241a.k();
        do {
            long j10 = this.f20243c;
            if (j10 == -1) {
                if (iK > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f20243c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.f20242b.invoke(this.f20241a, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
