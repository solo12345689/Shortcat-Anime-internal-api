package Se;

import Ze.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public enum l implements j.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static j.b f16374f = new j.b() { // from class: Se.l.a
        @Override // Ze.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(int i10) {
            return l.a(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16376a;

    l(int i10, int i11) {
        this.f16376a = i11;
    }

    public static l a(int i10) {
        if (i10 == 0) {
            return FINAL;
        }
        if (i10 == 1) {
            return OPEN;
        }
        if (i10 == 2) {
            return ABSTRACT;
        }
        if (i10 != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // Ze.j.a
    public final int d() {
        return this.f16376a;
    }
}
