package g8;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* JADX INFO: renamed from: g8.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4860a extends AbstractC4865f {

    /* JADX INFO: renamed from: a */
    public int f47366a = -1;

    /* JADX INFO: renamed from: b */
    public String f47367b;

    @Override // g8.InterfaceC4861b
    public void a(GifReader gifReader) {
        byte bPeek = gifReader.peek();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < bPeek; i10++) {
            sb2.append((char) gifReader.peek());
        }
        String string = sb2.toString();
        this.f47367b = string;
        if (!"NETSCAPE2.0".equals(string)) {
            while (!C4864e.c(gifReader).b()) {
            }
            return;
        }
        if ((gifReader.peek() & 255) == 3 && (gifReader.peek() & 255) == 1) {
            this.f47366a = gifReader.readUInt16();
        }
        while (!C4864e.c(gifReader).b()) {
        }
    }
}
