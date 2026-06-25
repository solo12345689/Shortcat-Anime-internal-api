package Se;

import Ze.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public enum k implements j.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static j.b f16367f = new j.b() { // from class: Se.k.a
        @Override // Ze.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(int i10) {
            return k.a(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16369a;

    k(int i10, int i11) {
        this.f16369a = i11;
    }

    public static k a(int i10) {
        if (i10 == 0) {
            return DECLARATION;
        }
        if (i10 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i10 == 2) {
            return DELEGATION;
        }
        if (i10 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // Ze.j.a
    public final int d() {
        return this.f16369a;
    }
}
