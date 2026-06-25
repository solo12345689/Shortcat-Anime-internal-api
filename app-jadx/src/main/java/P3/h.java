package P3;

import P3.h;
import Td.L;
import android.os.Bundle;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13461c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R3.b f13462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f13463b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L c(i iVar) {
            iVar.getLifecycle().addObserver(new b(iVar));
            return L.f17438a;
        }

        public final h b(final i owner) {
            AbstractC5504s.h(owner, "owner");
            return new h(new R3.b(owner, new InterfaceC5082a() { // from class: P3.g
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return h.a.c(owner);
                }
            }), null);
        }

        private a() {
        }
    }

    public /* synthetic */ h(R3.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    public static final h a(i iVar) {
        return f13461c.b(iVar);
    }

    public final f b() {
        return this.f13463b;
    }

    public final void c() {
        this.f13462a.f();
    }

    public final void d(Bundle bundle) {
        this.f13462a.h(bundle);
    }

    public final void e(Bundle outBundle) {
        AbstractC5504s.h(outBundle, "outBundle");
        this.f13462a.i(outBundle);
    }

    private h(R3.b bVar) {
        this.f13462a = bVar;
        this.f13463b = new f(bVar);
    }
}
