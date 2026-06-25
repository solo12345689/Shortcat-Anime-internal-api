package O9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class q extends k {

    /* JADX INFO: renamed from: a */
    private final Object f13092a;

    q(Object obj) {
        this.f13092a = obj;
    }

    @Override // O9.k
    public Object b() {
        return this.f13092a;
    }

    @Override // O9.k
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f13092a.equals(((q) obj).f13092a);
        }
        return false;
    }

    public int hashCode() {
        return this.f13092a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f13092a + ")";
    }
}
