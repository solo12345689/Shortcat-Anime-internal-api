package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.d;
import i1.AbstractC5026s;
import i1.C5021n;
import i1.C5025r;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.InterfaceC6341b1;
import s0.X0;
import u0.InterfaceC6711f;
import w0.AbstractC6923b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\"\u0010.\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010&R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0014\u00106\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00105¨\u00067"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Lw0/b;", "Ls0/b1;", "image", "Li1/n;", "srcOffset", "Li1/r;", "srcSize", "<init>", "(Ls0/b1;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "o", "(JJ)J", "Lu0/f;", "LTd/L;", "m", "(Lu0/f;)V", "", "alpha", "", "a", "(F)Z", "Landroidx/compose/ui/graphics/d;", "colorFilter", "b", "(Landroidx/compose/ui/graphics/d;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "g", "Ls0/b1;", "h", "J", "i", "Ls0/X0;", "j", "I", "getFilterQuality-f-v9h1I$ui_graphics_release", "n", "(I)V", "filterQuality", "k", "size", "l", "F", "Landroidx/compose/ui/graphics/d;", "Lr0/l;", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BitmapPainter extends AbstractC6923b {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6341b1 image;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long srcOffset;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final long srcSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private int filterQuality;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private d colorFilter;

    public /* synthetic */ BitmapPainter(InterfaceC6341b1 interfaceC6341b1, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6341b1, j10, j11);
    }

    private final long o(long srcOffset, long srcSize) {
        int i10;
        int i11;
        if (C5021n.k(srcOffset) < 0 || C5021n.l(srcOffset) < 0 || (i10 = (int) (srcSize >> 32)) < 0 || (i11 = (int) (4294967295L & srcSize)) < 0 || i10 > this.image.getWidth() || i11 > this.image.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return srcSize;
    }

    @Override // w0.AbstractC6923b
    protected boolean a(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // w0.AbstractC6923b
    protected boolean b(d colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) other;
        return AbstractC5504s.c(this.image, bitmapPainter.image) && C5021n.j(this.srcOffset, bitmapPainter.srcOffset) && C5025r.e(this.srcSize, bitmapPainter.srcSize) && X0.d(this.filterQuality, bitmapPainter.filterQuality);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + C5021n.m(this.srcOffset)) * 31) + C5025r.h(this.srcSize)) * 31) + X0.e(this.filterQuality);
    }

    @Override // w0.AbstractC6923b
    public long k() {
        return AbstractC5026s.d(this.size);
    }

    @Override // w0.AbstractC6923b
    protected void m(InterfaceC6711f interfaceC6711f) {
        InterfaceC6711f.m0(interfaceC6711f, this.image, this.srcOffset, this.srcSize, 0L, C5025r.c((((long) Math.round(Float.intBitsToFloat((int) (interfaceC6711f.f() & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (interfaceC6711f.f() >> 32)))) << 32)), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    public final void n(int i10) {
        this.filterQuality = i10;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) C5021n.p(this.srcOffset)) + ", srcSize=" + ((Object) C5025r.i(this.srcSize)) + ", filterQuality=" + ((Object) X0.f(this.filterQuality)) + ')';
    }

    public /* synthetic */ BitmapPainter(InterfaceC6341b1 interfaceC6341b1, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6341b1, (i10 & 2) != 0 ? C5021n.f48560b.b() : j10, (i10 & 4) != 0 ? C5025r.c((((long) interfaceC6341b1.getHeight()) & 4294967295L) | (((long) interfaceC6341b1.getWidth()) << 32)) : j11, null);
    }

    private BitmapPainter(InterfaceC6341b1 interfaceC6341b1, long j10, long j11) {
        this.image = interfaceC6341b1;
        this.srcOffset = j10;
        this.srcSize = j11;
        this.filterQuality = X0.f58918a.a();
        this.size = o(j10, j11);
        this.alpha = 1.0f;
    }
}
