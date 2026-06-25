package T1;

import Td.L;
import ie.InterfaceC5082a;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements E {

    /* JADX INFO: renamed from: d */
    public static final b f16977d = new b(null);

    /* JADX INFO: renamed from: e */
    private static final Set f16978e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    private static final Object f16979f = new Object();

    /* JADX INFO: renamed from: a */
    private final A f16980a;

    /* JADX INFO: renamed from: b */
    private final Function1 f16981b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5082a f16982c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final a f16983a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final t invoke(File it) {
            AbstractC5504s.h(it, "it");
            return v.a(it);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return o.f16978e;
        }

        public final Object b() {
            return o.f16979f;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ File f16984a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(0);
            this.f16984a = file;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m40invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m40invoke() {
            b bVar = o.f16977d;
            Object objB = bVar.b();
            File file = this.f16984a;
            synchronized (objB) {
                bVar.a().remove(file.getAbsolutePath());
                L l10 = L.f17438a;
            }
        }
    }

    public o(A serializer, Function1 coordinatorProducer, InterfaceC5082a produceFile) {
        AbstractC5504s.h(serializer, "serializer");
        AbstractC5504s.h(coordinatorProducer, "coordinatorProducer");
        AbstractC5504s.h(produceFile, "produceFile");
        this.f16980a = serializer;
        this.f16981b = coordinatorProducer;
        this.f16982c = produceFile;
    }

    @Override // T1.E
    public F a() throws IOException {
        File file = ((File) this.f16982c.invoke()).getCanonicalFile();
        synchronized (f16979f) {
            String path = file.getAbsolutePath();
            Set set = f16978e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            AbstractC5504s.g(path, "path");
            set.add(path);
        }
        AbstractC5504s.g(file, "file");
        return new p(file, this.f16980a, (t) this.f16981b.invoke(file), new c(file));
    }

    public /* synthetic */ o(A a10, Function1 function1, InterfaceC5082a interfaceC5082a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(a10, (i10 & 2) != 0 ? a.f16983a : function1, interfaceC5082a);
    }
}
