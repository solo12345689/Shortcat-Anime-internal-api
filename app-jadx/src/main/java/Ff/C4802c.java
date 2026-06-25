package ff;

import Af.b;
import ye.InterfaceC7224b;

/* JADX INFO: renamed from: ff.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C4802c implements b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f47053a;

    public C4802c(boolean z10) {
        this.f47053a = z10;
    }

    @Override // Af.b.c
    public Iterable a(Object obj) {
        return e.j(this.f47053a, (InterfaceC7224b) obj);
    }
}
