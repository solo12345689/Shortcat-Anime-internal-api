package Hc;

import Td.AbstractC2163n;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LHc/e;", "Lgc/c;", "LHc/n;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "LIc/b;", "d", "Lkotlin/Lazy;", "F", "()LIc/b;", "groupManager", "LIc/d;", "e", "D", "()LIc/d;", "channelManager", "LJc/c;", "f", "E", "()LJc/c;", "channelSerializer", "LJc/a;", "g", "G", "()LJc/a;", "groupSerializer", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends gc.c implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy groupManager = AbstractC2163n.b(new InterfaceC5082a() { // from class: Hc.a
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return e.H(this.f8378a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy channelManager = AbstractC2163n.b(new InterfaceC5082a() { // from class: Hc.b
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return e.B(this.f8379a);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy channelSerializer = AbstractC2163n.b(new InterfaceC5082a() { // from class: Hc.c
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return e.C();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy groupSerializer = AbstractC2163n.b(new InterfaceC5082a() { // from class: Hc.d
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return e.I(this.f8380a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ic.d B(e eVar) {
        return new Ic.d(eVar.i().B(), eVar.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Jc.c C() {
        return new Jc.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ic.b H(e eVar) {
        return new Ic.b(eVar.i().B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Jc.a I(e eVar) {
        return new Jc.a(eVar.e());
    }

    @Override // Hc.n
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Ic.d j() {
        return (Ic.d) this.channelManager.getValue();
    }

    @Override // Hc.n
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Jc.c e() {
        return (Jc.c) this.channelSerializer.getValue();
    }

    @Override // Hc.n
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Ic.b k() {
        return (Ic.b) this.groupManager.getValue();
    }

    @Override // Hc.n
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Jc.a h() {
        return (Jc.a) this.groupSerializer.getValue();
    }

    @Override // gc.c
    public gc.e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("NotificationsChannelsProvider");
            return dVar.u();
        } finally {
            X3.a.f();
        }
    }
}
