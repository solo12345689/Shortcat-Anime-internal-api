package sh;

import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f59874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f59875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f59876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f59877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f59878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f59879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C7427t f59880g;

    protected m(C7427t c7427t) {
        if (c7427t == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.f59880g = c7427t;
        Fg.j jVarA = f.a(c7427t);
        int iH = AbstractC6533A.h(jVarA);
        this.f59875b = iH;
        this.f59876c = 16;
        int iCeil = (int) Math.ceil(((double) (iH * 8)) / ((double) AbstractC6533A.o(16)));
        this.f59878e = iCeil;
        int iFloor = ((int) Math.floor(AbstractC6533A.o((16 - 1) * iCeil) / AbstractC6533A.o(16))) + 1;
        this.f59879f = iFloor;
        int i10 = iCeil + iFloor;
        this.f59877d = i10;
        l lVarC = l.c(jVarA.c(), iH, 16, i10);
        this.f59874a = lVarC;
        if (lVarC != null) {
            return;
        }
        throw new IllegalArgumentException("cannot find OID for digest algorithm: " + jVarA.c());
    }

    protected int a() {
        return this.f59877d;
    }

    public C7427t b() {
        return this.f59880g;
    }

    protected int c() {
        return this.f59875b;
    }

    protected int d() {
        return this.f59876c;
    }
}
