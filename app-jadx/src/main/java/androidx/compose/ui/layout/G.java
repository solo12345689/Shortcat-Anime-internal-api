package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class G implements F {

    /* JADX INFO: renamed from: b */
    private final String f26899b;

    /* JADX INFO: renamed from: c */
    private final u f26900c;

    /* JADX INFO: renamed from: d */
    private final u f26901d;

    public G(String str) {
        this.f26899b = str;
        this.f26900c = w.a(str);
        this.f26901d = w.a(str + " maximum");
    }

    @Override // androidx.compose.ui.layout.F
    public u a() {
        return this.f26900c;
    }

    @Override // androidx.compose.ui.layout.F
    public u b() {
        return this.f26901d;
    }

    public String toString() {
        return this.f26899b;
    }
}
