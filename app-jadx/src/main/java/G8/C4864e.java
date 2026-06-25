package g8;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* JADX INFO: renamed from: g8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4864e implements InterfaceC4861b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C4864e f47370c = new C4864e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47372b;

    public C4864e(int i10) {
        this.f47371a = i10;
    }

    public static C4864e c(GifReader gifReader) {
        int iPeek = gifReader.peek() & 255;
        if (iPeek == 0) {
            return f47370c;
        }
        C4864e c4864e = new C4864e(iPeek);
        c4864e.f47372b = gifReader.position();
        c4864e.a(gifReader);
        return c4864e;
    }

    @Override // g8.InterfaceC4861b
    public void a(GifReader gifReader) {
        gifReader.skip(this.f47371a);
    }

    public boolean b() {
        return this == f47370c;
    }
}
