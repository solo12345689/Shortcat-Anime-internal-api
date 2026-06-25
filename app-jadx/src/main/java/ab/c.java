package Ab;

import android.content.Context;
import gc.d;
import gc.e;
import hc.C4931c;
import ie.InterfaceC5082a;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LAb/c;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "Landroid/content/Context;", "y", "()Landroid/content/Context;", "context", "expo-eas-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends gc.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5082a {
        public a() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return new Ab.b(c.this.y()).b().toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5082a {
        public b() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Double.valueOf(Ab.b.f360c.a(new Ab.b(c.this.y()).b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context y() {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new IllegalArgumentException("React Application Context is null");
    }

    @Override // gc.c
    public e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            d dVar = new d(this);
            dVar.s("EASClient");
            C4931c c4931c = new C4931c("clientID");
            c4931c.b(new a());
            dVar.l().put("clientID", c4931c);
            C4931c c4931c2 = new C4931c("deterministicUniformValue");
            c4931c2.b(new b());
            dVar.l().put("deterministicUniformValue", c4931c2);
            return dVar.u();
        } finally {
            X3.a.f();
        }
    }
}
