package w0;

import androidx.compose.ui.graphics.painter.BitmapPainter;
import i1.C5021n;
import i1.C5025r;
import s0.InterfaceC6341b1;
import s0.X0;

/* JADX INFO: renamed from: w0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6922a {
    public static final BitmapPainter a(InterfaceC6341b1 interfaceC6341b1, long j10, long j11, int i10) {
        BitmapPainter bitmapPainter = new BitmapPainter(interfaceC6341b1, j10, j11, null);
        bitmapPainter.n(i10);
        return bitmapPainter;
    }

    public static /* synthetic */ BitmapPainter b(InterfaceC6341b1 interfaceC6341b1, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = C5021n.f48560b.b();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = C5025r.c((((long) interfaceC6341b1.getHeight()) & 4294967295L) | (((long) interfaceC6341b1.getWidth()) << 32));
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = X0.f58918a.a();
        }
        return a(interfaceC6341b1, j12, j13, i10);
    }
}
