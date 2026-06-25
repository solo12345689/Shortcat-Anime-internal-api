package O9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class a extends k {

    /* JADX INFO: renamed from: a */
    static final a f13070a = new a();

    private a() {
    }

    static k e() {
        return f13070a;
    }

    @Override // O9.k
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // O9.k
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
