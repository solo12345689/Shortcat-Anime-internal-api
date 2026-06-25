package Vf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class I0 extends AbstractC2343n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f20142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20143b;

    public /* synthetic */ I0(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    @Override // Vf.AbstractC2343n0
    public /* bridge */ /* synthetic */ Object a() {
        return Td.G.b(f());
    }

    @Override // Vf.AbstractC2343n0
    public void b(int i10) {
        if (Td.G.t(this.f20142a) < i10) {
            long[] jArr = this.f20142a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, AbstractC5874j.e(i10, Td.G.t(jArr) * 2));
            AbstractC5504s.g(jArrCopyOf, "copyOf(...)");
            this.f20142a = Td.G.e(jArrCopyOf);
        }
    }

    @Override // Vf.AbstractC2343n0
    public int d() {
        return this.f20143b;
    }

    public final void e(long j10) {
        AbstractC2343n0.c(this, 0, 1, null);
        long[] jArr = this.f20142a;
        int iD = d();
        this.f20143b = iD + 1;
        Td.G.y(jArr, iD, j10);
    }

    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f20142a, d());
        AbstractC5504s.g(jArrCopyOf, "copyOf(...)");
        return Td.G.e(jArrCopyOf);
    }

    private I0(long[] bufferWithData) {
        AbstractC5504s.h(bufferWithData, "bufferWithData");
        this.f20142a = bufferWithData;
        this.f20143b = Td.G.t(bufferWithData);
        b(10);
    }
}
