package Vf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class F0 extends AbstractC2343n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f20133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20134b;

    public /* synthetic */ F0(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // Vf.AbstractC2343n0
    public /* bridge */ /* synthetic */ Object a() {
        return Td.E.b(f());
    }

    @Override // Vf.AbstractC2343n0
    public void b(int i10) {
        if (Td.E.t(this.f20133a) < i10) {
            int[] iArr = this.f20133a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, AbstractC5874j.e(i10, Td.E.t(iArr) * 2));
            AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
            this.f20133a = Td.E.e(iArrCopyOf);
        }
    }

    @Override // Vf.AbstractC2343n0
    public int d() {
        return this.f20134b;
    }

    public final void e(int i10) {
        AbstractC2343n0.c(this, 0, 1, null);
        int[] iArr = this.f20133a;
        int iD = d();
        this.f20134b = iD + 1;
        Td.E.y(iArr, iD, i10);
    }

    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f20133a, d());
        AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
        return Td.E.e(iArrCopyOf);
    }

    private F0(int[] bufferWithData) {
        AbstractC5504s.h(bufferWithData, "bufferWithData");
        this.f20133a = bufferWithData;
        this.f20134b = Td.E.t(bufferWithData);
        b(10);
    }
}
