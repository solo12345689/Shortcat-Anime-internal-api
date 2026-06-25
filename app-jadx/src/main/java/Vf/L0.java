package Vf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class L0 extends AbstractC2343n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f20149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20150b;

    public /* synthetic */ L0(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // Vf.AbstractC2343n0
    public /* bridge */ /* synthetic */ Object a() {
        return Td.J.b(f());
    }

    @Override // Vf.AbstractC2343n0
    public void b(int i10) {
        if (Td.J.t(this.f20149a) < i10) {
            short[] sArr = this.f20149a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, AbstractC5874j.e(i10, Td.J.t(sArr) * 2));
            AbstractC5504s.g(sArrCopyOf, "copyOf(...)");
            this.f20149a = Td.J.e(sArrCopyOf);
        }
    }

    @Override // Vf.AbstractC2343n0
    public int d() {
        return this.f20150b;
    }

    public final void e(short s10) {
        AbstractC2343n0.c(this, 0, 1, null);
        short[] sArr = this.f20149a;
        int iD = d();
        this.f20150b = iD + 1;
        Td.J.y(sArr, iD, s10);
    }

    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f20149a, d());
        AbstractC5504s.g(sArrCopyOf, "copyOf(...)");
        return Td.J.e(sArrCopyOf);
    }

    private L0(short[] bufferWithData) {
        AbstractC5504s.h(bufferWithData, "bufferWithData");
        this.f20149a = bufferWithData;
        this.f20150b = Td.J.t(bufferWithData);
        b(10);
    }
}
