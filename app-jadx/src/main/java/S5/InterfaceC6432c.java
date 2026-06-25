package s5;

/* JADX INFO: renamed from: s5.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6432c {

    /* JADX INFO: renamed from: s5.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        CACHE_FULL,
        CONTENT_STALE,
        USER_FORCED,
        CACHE_MANAGER_TRIMMED,
        TRIM_EXPIRED
    }

    void a(InterfaceC6431b interfaceC6431b);

    void b(InterfaceC6431b interfaceC6431b);

    void c(InterfaceC6431b interfaceC6431b);

    void d(InterfaceC6431b interfaceC6431b);

    void e();

    void f(InterfaceC6431b interfaceC6431b);

    void g(InterfaceC6431b interfaceC6431b);

    void h(InterfaceC6431b interfaceC6431b);
}
