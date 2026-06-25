package X1;

import Gf.O;
import T1.C2146j;
import T1.E;
import T1.InterfaceC2145i;
import T1.o;
import fe.k;
import ie.InterfaceC5082a;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f21616a = new e();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f21617a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5082a interfaceC5082a) {
            super(0);
            this.f21617a = interfaceC5082a;
        }

        @Override // ie.InterfaceC5082a
        public final File invoke() {
            File file = (File) this.f21617a.invoke();
            if (AbstractC5504s.c(k.A(file), "preferences_pb")) {
                File absoluteFile = file.getAbsoluteFile();
                AbstractC5504s.g(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    private e() {
    }

    public final InterfaceC2145i a(E storage, U1.b bVar, List migrations, O scope) {
        AbstractC5504s.h(storage, "storage");
        AbstractC5504s.h(migrations, "migrations");
        AbstractC5504s.h(scope, "scope");
        return new d(C2146j.f16817a.a(storage, bVar, migrations, scope));
    }

    public final InterfaceC2145i b(U1.b bVar, List migrations, O scope, InterfaceC5082a produceFile) {
        AbstractC5504s.h(migrations, "migrations");
        AbstractC5504s.h(scope, "scope");
        AbstractC5504s.h(produceFile, "produceFile");
        return new d(a(new o(h.f21619a, null, new a(produceFile), 2, null), bVar, migrations, scope));
    }
}
