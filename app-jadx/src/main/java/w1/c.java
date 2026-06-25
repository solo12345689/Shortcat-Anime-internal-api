package W1;

import Gf.O;
import T1.InterfaceC2145i;
import android.content.Context;
import ie.InterfaceC5082a;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import le.InterfaceC5592c;
import pe.InterfaceC6023m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC5592c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U1.b f20615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f20616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O f20617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f20618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile InterfaceC2145i f20619f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f20620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f20621b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f20620a = context;
            this.f20621b = cVar;
        }

        @Override // ie.InterfaceC5082a
        public final File invoke() {
            Context applicationContext = this.f20620a;
            AbstractC5504s.g(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f20621b.f20614a);
        }
    }

    public c(String name, U1.b bVar, Function1 produceMigrations, O scope) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(produceMigrations, "produceMigrations");
        AbstractC5504s.h(scope, "scope");
        this.f20614a = name;
        this.f20615b = bVar;
        this.f20616c = produceMigrations;
        this.f20617d = scope;
        this.f20618e = new Object();
    }

    @Override // le.InterfaceC5592c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC2145i a(Context thisRef, InterfaceC6023m property) {
        InterfaceC2145i interfaceC2145i;
        AbstractC5504s.h(thisRef, "thisRef");
        AbstractC5504s.h(property, "property");
        InterfaceC2145i interfaceC2145i2 = this.f20619f;
        if (interfaceC2145i2 != null) {
            return interfaceC2145i2;
        }
        synchronized (this.f20618e) {
            try {
                if (this.f20619f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    X1.e eVar = X1.e.f21616a;
                    U1.b bVar = this.f20615b;
                    Function1 function1 = this.f20616c;
                    AbstractC5504s.g(applicationContext, "applicationContext");
                    this.f20619f = eVar.b(bVar, (List) function1.invoke(applicationContext), this.f20617d, new a(applicationContext, this));
                }
                interfaceC2145i = this.f20619f;
                AbstractC5504s.e(interfaceC2145i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC2145i;
    }
}
