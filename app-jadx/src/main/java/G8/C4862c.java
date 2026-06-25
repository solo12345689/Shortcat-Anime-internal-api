package g8;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* JADX INFO: renamed from: g8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4862c implements InterfaceC4861b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f47368a;

    public C4862c(int i10) {
        this.f47368a = new int[i10];
    }

    @Override // g8.InterfaceC4861b
    public void a(GifReader gifReader) {
        for (int i10 = 0; i10 < this.f47368a.length; i10++) {
            byte bPeek = gifReader.peek();
            byte bPeek2 = gifReader.peek();
            int i11 = (bPeek2 & 255) << 8;
            int i12 = bPeek & 255;
            this.f47368a[i10] = i12 | i11 | ((gifReader.peek() & 255) << 16) | (-16777216);
        }
    }

    public int[] b() {
        return this.f47368a;
    }
}
