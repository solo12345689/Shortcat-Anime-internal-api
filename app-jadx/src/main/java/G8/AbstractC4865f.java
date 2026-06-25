package g8;

import com.github.penfeizhou.animation.gif.io.GifReader;
import g8.AbstractC4867h;

/* JADX INFO: renamed from: g8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4865f implements InterfaceC4861b {
    public static AbstractC4865f b(GifReader gifReader) throws AbstractC4867h.a {
        byte bPeek = gifReader.peek();
        if (bPeek == -7) {
            return new C4868i();
        }
        if (bPeek == 1) {
            return new l();
        }
        if (bPeek == -2) {
            return new C4863d();
        }
        if (bPeek == -1) {
            return new C4860a();
        }
        throw new AbstractC4867h.a();
    }
}
