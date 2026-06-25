package Vf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: Vf.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2326f extends AbstractC2343n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean[] f20189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20190b;

    public C2326f(boolean[] bufferWithData) {
        AbstractC5504s.h(bufferWithData, "bufferWithData");
        this.f20189a = bufferWithData;
        this.f20190b = bufferWithData.length;
        b(10);
    }

    @Override // Vf.AbstractC2343n0
    public void b(int i10) {
        boolean[] zArr = this.f20189a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, AbstractC5874j.e(i10, zArr.length * 2));
            AbstractC5504s.g(zArrCopyOf, "copyOf(...)");
            this.f20189a = zArrCopyOf;
        }
    }

    @Override // Vf.AbstractC2343n0
    public int d() {
        return this.f20190b;
    }

    public final void e(boolean z10) {
        AbstractC2343n0.c(this, 0, 1, null);
        boolean[] zArr = this.f20189a;
        int iD = d();
        this.f20190b = iD + 1;
        zArr[iD] = z10;
    }

    @Override // Vf.AbstractC2343n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f20189a, d());
        AbstractC5504s.g(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
