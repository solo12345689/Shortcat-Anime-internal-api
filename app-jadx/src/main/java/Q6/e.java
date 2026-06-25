package q6;

import Td.AbstractC2163n;
import Td.q;
import ie.InterfaceC5082a;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q6.c;
import y5.AbstractC7203a;
import y5.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f57675e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy f57676f = AbstractC2163n.a(q.f17461a, new InterfaceC5082a() { // from class: q6.d
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return e.f();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f57677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f57678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6142a f57679c = new C6142a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f57680d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int e(int i10, InputStream inputStream, byte[] bArr) throws IOException {
            if (bArr.length < i10) {
                throw new IllegalStateException("Check failed.");
            }
            if (!inputStream.markSupported()) {
                return AbstractC7203a.b(inputStream, bArr, 0, i10);
            }
            try {
                inputStream.mark(i10);
                return AbstractC7203a.b(inputStream, bArr, 0, i10);
            } finally {
                inputStream.reset();
            }
        }

        public final c b(InputStream is) {
            AbstractC5504s.h(is, "is");
            return d().c(is);
        }

        public final c c(InputStream is) {
            AbstractC5504s.h(is, "is");
            try {
                return b(is);
            } catch (IOException e10) {
                throw p.a(e10);
            }
        }

        public final e d() {
            return (e) e.f57676f.getValue();
        }

        private a() {
        }
    }

    private e() {
        h();
    }

    public static final c d(InputStream inputStream) {
        return f57675e.c(inputStream);
    }

    public static final e e() {
        return f57675e.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e f() {
        return new e();
    }

    private final void h() {
        this.f57677a = this.f57679c.b();
        List list = this.f57678b;
        if (list != null) {
            AbstractC5504s.e(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f57677a = Math.max(this.f57677a, ((c.b) it.next()).b());
            }
        }
    }

    public final c c(InputStream is) throws IOException {
        AbstractC5504s.h(is, "is");
        int i10 = this.f57677a;
        byte[] bArr = new byte[i10];
        int iE = f57675e.e(i10, is, bArr);
        c cVarA = this.f57679c.a(bArr, iE);
        if (AbstractC5504s.c(cVarA, b.f57668n) && !this.f57680d) {
            cVarA = c.f57672d;
        }
        if (cVarA != c.f57672d) {
            return cVarA;
        }
        List list = this.f57678b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVarA2 = ((c.b) it.next()).a(bArr, iE);
                if (cVarA2 != c.f57672d) {
                    return cVarA2;
                }
            }
        }
        return c.f57672d;
    }

    public final e g(boolean z10) {
        this.f57680d = z10;
        return this;
    }
}
