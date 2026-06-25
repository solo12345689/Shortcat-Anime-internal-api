package n9;

/* JADX INFO: renamed from: n9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5758b extends IllegalStateException {
    private C5758b(String str, Throwable th2) {
        super(str, th2);
    }

    public static IllegalStateException a(i iVar) {
        if (!iVar.n()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excJ = iVar.j();
        return new C5758b("Complete with: ".concat(excJ != null ? "failure" : iVar.o() ? "result ".concat(String.valueOf(iVar.k())) : iVar.m() ? "cancellation" : "unknown issue"), excJ);
    }
}
