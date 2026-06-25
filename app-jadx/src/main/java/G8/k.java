package g8;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class k implements InterfaceC4861b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    byte f47393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f47394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    byte f47395e;

    @Override // g8.InterfaceC4861b
    public void a(GifReader gifReader) {
        this.f47391a = gifReader.readUInt16();
        this.f47392b = gifReader.readUInt16();
        this.f47393c = gifReader.peek();
        this.f47394d = gifReader.peek();
        this.f47395e = gifReader.peek();
    }

    public boolean b() {
        return (this.f47393c & 128) == 128;
    }

    public int c() {
        return 2 << (this.f47393c & 7);
    }
}
