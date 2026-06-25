package Se;

import Ze.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public enum y implements j.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static j.b f16665h = new j.b() { // from class: Se.y.a
        @Override // Ze.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(int i10) {
            return y.a(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16667a;

    y(int i10, int i11) {
        this.f16667a = i11;
    }

    public static y a(int i10) {
        if (i10 == 0) {
            return INTERNAL;
        }
        if (i10 == 1) {
            return PRIVATE;
        }
        if (i10 == 2) {
            return PROTECTED;
        }
        if (i10 == 3) {
            return PUBLIC;
        }
        if (i10 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i10 != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // Ze.j.a
    public final int d() {
        return this.f16667a;
    }
}
