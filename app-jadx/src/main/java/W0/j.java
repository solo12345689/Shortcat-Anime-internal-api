package W0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f20611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f20612b;

    public j(CharSequence charSequence, i iVar) {
        this.f20611a = charSequence;
        this.f20612b = iVar;
    }

    @Override // W0.f
    public int a(int i10) {
        do {
            i10 = this.f20612b.p(i10);
            if (i10 == -1 || i10 == this.f20611a.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.f20611a.charAt(i10)));
        return i10;
    }

    @Override // W0.f
    public int b(int i10) {
        do {
            i10 = this.f20612b.q(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f20611a.charAt(i10)));
        return i10;
    }

    @Override // W0.f
    public int c(int i10) {
        do {
            i10 = this.f20612b.p(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f20611a.charAt(i10 - 1)));
        return i10;
    }

    @Override // W0.f
    public int d(int i10) {
        do {
            i10 = this.f20612b.q(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f20611a.charAt(i10 - 1)));
        return i10;
    }
}
