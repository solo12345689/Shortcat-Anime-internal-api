package g8;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j implements InterfaceC4861b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte f47387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4862c f47388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47390h;

    @Override // g8.InterfaceC4861b
    public void a(GifReader gifReader) {
        this.f47383a = gifReader.readUInt16();
        this.f47384b = gifReader.readUInt16();
        this.f47385c = gifReader.readUInt16();
        this.f47386d = gifReader.readUInt16();
        this.f47387e = gifReader.peek();
        if (c()) {
            C4862c c4862c = new C4862c(d());
            this.f47388f = c4862c;
            c4862c.a(gifReader);
        }
        this.f47389g = gifReader.peek() & 255;
        this.f47390h = gifReader.position();
        while (true) {
            if (gifReader.peek() == 0) {
                return;
            } else {
                gifReader.skip(r0 & 255);
            }
        }
    }

    public boolean b() {
        return (this.f47387e & 64) == 64;
    }

    public boolean c() {
        return (this.f47387e & 128) == 128;
    }

    public int d() {
        return 2 << (this.f47387e & 15);
    }
}
