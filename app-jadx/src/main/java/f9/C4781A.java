package f9;

/* JADX INFO: renamed from: f9.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C4781A extends D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ x f46951h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4781A(E e10, CharSequence charSequence, x xVar) {
        super(e10, charSequence);
        this.f46951h = xVar;
    }

    @Override // f9.D
    final int d(int i10) {
        CharSequence charSequence = this.f46955c;
        int length = charSequence.length();
        z.c(i10, length, "index");
        while (i10 < length) {
            if (this.f46951h.a(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // f9.D
    final int e(int i10) {
        return i10 + 1;
    }
}
