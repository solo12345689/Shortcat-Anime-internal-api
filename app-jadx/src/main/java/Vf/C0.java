package Vf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0 extends AbstractC2343n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f20125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20126b;

    public /* synthetic */ C0(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    @Override // Vf.AbstractC2343n0
    public /* bridge */ /* synthetic */ Object a() {
        return Td.C.b(f());
    }

    @Override // Vf.AbstractC2343n0
    public void b(int i10) {
        if (Td.C.t(this.f20125a) < i10) {
            byte[] bArr = this.f20125a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, AbstractC5874j.e(i10, Td.C.t(bArr) * 2));
            AbstractC5504s.g(bArrCopyOf, "copyOf(...)");
            this.f20125a = Td.C.e(bArrCopyOf);
        }
    }

    @Override // Vf.AbstractC2343n0
    public int d() {
        return this.f20126b;
    }

    public final void e(byte b10) {
        AbstractC2343n0.c(this, 0, 1, null);
        byte[] bArr = this.f20125a;
        int iD = d();
        this.f20126b = iD + 1;
        Td.C.y(bArr, iD, b10);
    }

    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f20125a, d());
        AbstractC5504s.g(bArrCopyOf, "copyOf(...)");
        return Td.C.e(bArrCopyOf);
    }

    private C0(byte[] bufferWithData) {
        AbstractC5504s.h(bufferWithData, "bufferWithData");
        this.f20125a = bufferWithData;
        this.f20126b = Td.C.t(bufferWithData);
        b(10);
    }
}
