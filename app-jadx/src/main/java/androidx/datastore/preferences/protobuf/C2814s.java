package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C2814s implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C2814s f29490a = new C2814s();

    private C2814s() {
    }

    public static C2814s c() {
        return f29490a;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public I a(Class cls) {
        if (!AbstractC2815t.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (I) AbstractC2815t.t(cls.asSubclass(AbstractC2815t.class)).i();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public boolean b(Class cls) {
        return AbstractC2815t.class.isAssignableFrom(cls);
    }
}
