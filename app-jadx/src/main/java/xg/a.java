package Xg;

/* JADX INFO: loaded from: classes5.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f22020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22023j;

    public a(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f22014a = i10;
        this.f22015b = i11;
        this.f22017d = i12;
        this.f22018e = i14;
        this.f22019f = i15;
        this.f22016c = i11 / 2;
        this.f22021h = i13 / 8;
        this.f22022i = (i10 + 7) >>> 3;
        this.f22023j = ((i10 * 2) + 7) >>> 3;
        this.f22020g = new f(i10);
    }
}
