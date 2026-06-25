package g8;

import com.github.penfeizhou.animation.gif.io.GifReader;
import g8.AbstractC4867h;

/* JADX INFO: renamed from: g8.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4868i extends AbstractC4865f {

    /* JADX INFO: renamed from: a */
    private int f47379a;

    /* JADX INFO: renamed from: b */
    private byte f47380b;

    /* JADX INFO: renamed from: c */
    public int f47381c;

    /* JADX INFO: renamed from: d */
    public int f47382d;

    @Override // g8.InterfaceC4861b
    public void a(GifReader gifReader) throws AbstractC4867h.a {
        this.f47379a = gifReader.peek() & 255;
        this.f47380b = gifReader.peek();
        this.f47381c = gifReader.readUInt16();
        this.f47382d = gifReader.peek() & 255;
        if (gifReader.peek() != 0) {
            throw new AbstractC4867h.a();
        }
    }

    public int c() {
        return (this.f47380b >> 2) & 7;
    }

    public boolean d() {
        return (this.f47380b & 1) == 1;
    }
}
