package l1;

import l1.AbstractC5527i;

/* JADX INFO: renamed from: l1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5524f extends AbstractC5542x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f52461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC5527i.c f52462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC5527i.c f52463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC5527i.b f52464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC5527i.c f52465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC5527i.c f52466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC5527i.b f52467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AbstractC5527i.a f52468j;

    public C5524f(Object obj) {
        super(obj);
        this.f52461c = obj;
        this.f52462d = new AbstractC5527i.c(a(), -2, this);
        this.f52463e = new AbstractC5527i.c(a(), 0, this);
        this.f52464f = new AbstractC5527i.b(a(), 0, this);
        this.f52465g = new AbstractC5527i.c(a(), -1, this);
        this.f52466h = new AbstractC5527i.c(a(), 1, this);
        this.f52467i = new AbstractC5527i.b(a(), 1, this);
        this.f52468j = new AbstractC5527i.a(a(), this);
    }

    @Override // l1.AbstractC5542x
    public Object a() {
        return this.f52461c;
    }

    public final AbstractC5527i.b b() {
        return this.f52467i;
    }

    public final AbstractC5527i.c c() {
        return this.f52465g;
    }

    public final AbstractC5527i.c d() {
        return this.f52462d;
    }

    public final AbstractC5527i.b e() {
        return this.f52464f;
    }
}
