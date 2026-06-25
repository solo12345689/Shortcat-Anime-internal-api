package mh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import mh.AbstractC5702g;

/* JADX INFO: renamed from: mh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C5697b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f53698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f53699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f53700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f53701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f53702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f53703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f53704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f53705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f53706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f53707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f53708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f53709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f53710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f53711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f53712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C5703h f53713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C5696a f53714t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f53715u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final boolean f53716v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final AbstractC5702g f53717w;

    public C5697b(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        this.f53710p = i11;
        this.f53715u = z10;
        this.f53716v = z11;
        this.f53695a = i10;
        if (i10 == 2) {
            this.f53696b = 10;
            this.f53697c = 3;
        } else {
            if (i10 == 3) {
                this.f53696b = 8;
                i12 = 4;
            } else {
                i12 = 6;
                this.f53696b = 6;
            }
            this.f53697c = i12;
        }
        this.f53717w = z10 ? new AbstractC5702g.a() : new AbstractC5702g.b();
        if (z11) {
            this.f53699e = 12;
            this.f53698d = 64;
        } else {
            this.f53699e = 13;
            this.f53698d = (this.f53696b * IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) / 8;
        }
        int i13 = this.f53699e;
        int i14 = (i13 * IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) / 8;
        this.f53700f = i14;
        int i15 = i14 * i10;
        this.f53701g = i15;
        this.f53702h = 320;
        int i16 = i10 * 320;
        this.f53703i = i16;
        int i17 = this.f53697c;
        int i18 = (i17 * IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) / 8;
        this.f53704j = i18;
        int i19 = i16 + 32;
        this.f53705k = i19;
        this.f53706l = i15;
        this.f53707m = i19;
        this.f53708n = i15 + i19 + 64;
        this.f53709o = i16 + i18;
        this.f53711q = 1 << (i13 - 11);
        this.f53712r = (256 - (1 << (9 - i17))) + (1 << (i13 - 11));
        this.f53713s = new C5703h(this);
        this.f53714t = new C5696a(this);
    }

    public int a() {
        return 10;
    }

    public int b() {
        return this.f53697c;
    }

    public int c() {
        return 32;
    }

    public int d() {
        return this.f53695a;
    }

    public int e() {
        return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
    }

    public int f() {
        return this.f53700f;
    }

    public C5703h g() {
        return this.f53713s;
    }
}
