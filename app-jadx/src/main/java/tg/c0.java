package tg;

import Td.AbstractC2156g;
import Ud.AbstractC2279u;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends AbstractC6690o {

    /* JADX INFO: renamed from: i */
    private static final a f61011i = new a(null);

    /* JADX INFO: renamed from: j */
    private static final P f61012j = P.a.e(P.f60968b, "/", false, 1, null);

    /* JADX INFO: renamed from: e */
    private final P f61013e;

    /* JADX INFO: renamed from: f */
    private final AbstractC6690o f61014f;

    /* JADX INFO: renamed from: g */
    private final Map f61015g;

    /* JADX INFO: renamed from: h */
    private final String f61016h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c0(P zipPath, AbstractC6690o fileSystem, Map entries, String str) {
        AbstractC5504s.h(zipPath, "zipPath");
        AbstractC5504s.h(fileSystem, "fileSystem");
        AbstractC5504s.h(entries, "entries");
        this.f61013e = zipPath;
        this.f61014f = fileSystem;
        this.f61015g = entries;
        this.f61016h = str;
    }

    private final P r(P p10) {
        return f61012j.r(p10, true);
    }

    private final List s(P p10, boolean z10) throws IOException {
        ug.i iVar = (ug.i) this.f61015g.get(r(p10));
        if (iVar != null) {
            return AbstractC2279u.b1(iVar.b());
        }
        if (!z10) {
            return null;
        }
        throw new IOException("not a directory: " + p10);
    }

    @Override // tg.AbstractC6690o
    public X b(P file, boolean z10) throws IOException {
        AbstractC5504s.h(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // tg.AbstractC6690o
    public void c(P source, P target) throws IOException {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // tg.AbstractC6690o
    public void g(P dir, boolean z10) throws IOException {
        AbstractC5504s.h(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // tg.AbstractC6690o
    public void i(P path, boolean z10) throws IOException {
        AbstractC5504s.h(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // tg.AbstractC6690o
    public List k(P dir) throws IOException {
        AbstractC5504s.h(dir, "dir");
        List listS = s(dir, true);
        AbstractC5504s.e(listS);
        return listS;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x008f A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007c, blocks: (B:74:0x0053, B:94:0x0083, B:100:0x008f, B:89:0x0078, B:85:0x0072, B:75:0x005f), top: B:119:0x0053, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0083 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #4 {all -> 0x007c, blocks: (B:74:0x0053, B:94:0x0083, B:100:0x008f, B:89:0x0078, B:85:0x0072, B:75:0x005f), top: B:119:0x0053, inners: #1, #5 }] */
    @Override // tg.AbstractC6690o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tg.C6689n m(tg.P r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.AbstractC5504s.h(r14, r0)
            tg.P r14 = r13.r(r14)
            java.util.Map r0 = r13.f61015g
            java.lang.Object r14 = r0.get(r14)
            ug.i r14 = (ug.i) r14
            r1 = 0
            if (r14 != 0) goto L15
            return r1
        L15:
            tg.n r2 = new tg.n
            boolean r0 = r14.h()
            r3 = r0 ^ 1
            boolean r4 = r14.h()
            boolean r0 = r14.h()
            if (r0 == 0) goto L29
            r6 = r1
            goto L32
        L29:
            long r5 = r14.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r6 = r0
        L32:
            java.lang.Long r8 = r14.e()
            r11 = 128(0x80, float:1.794E-43)
            r12 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            long r3 = r14.f()
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L4b
            return r2
        L4b:
            tg.o r0 = r13.f61014f
            tg.P r3 = r13.f61013e
            tg.m r3 = r0.n(r3)
            long r4 = r14.f()     // Catch: java.lang.Throwable -> L7c
            tg.Z r14 = r3.q(r4)     // Catch: java.lang.Throwable -> L7c
            tg.j r14 = tg.K.d(r14)     // Catch: java.lang.Throwable -> L7c
            tg.n r2 = ug.j.h(r14, r2)     // Catch: java.lang.Throwable -> L6e
            if (r14 == 0) goto L6c
            r14.close()     // Catch: java.lang.Throwable -> L69
            goto L6c
        L69:
            r0 = move-exception
            r14 = r0
            goto L81
        L6c:
            r14 = r1
            goto L81
        L6e:
            r0 = move-exception
            r2 = r0
            if (r14 == 0) goto L7f
            r14.close()     // Catch: java.lang.Throwable -> L76
            goto L7f
        L76:
            r0 = move-exception
            r14 = r0
            Td.AbstractC2156g.a(r2, r14)     // Catch: java.lang.Throwable -> L7c
            goto L7f
        L7c:
            r0 = move-exception
            r14 = r0
            goto L90
        L7f:
            r14 = r2
            r2 = r1
        L81:
            if (r14 != 0) goto L8f
            kotlin.jvm.internal.AbstractC5504s.e(r2)     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L9c
            r3.close()     // Catch: java.lang.Throwable -> L8c
            goto L9c
        L8c:
            r0 = move-exception
            r1 = r0
            goto L9c
        L8f:
            throw r14     // Catch: java.lang.Throwable -> L7c
        L90:
            if (r3 == 0) goto L9a
            r3.close()     // Catch: java.lang.Throwable -> L96
            goto L9a
        L96:
            r0 = move-exception
            Td.AbstractC2156g.a(r14, r0)
        L9a:
            r2 = r1
            r1 = r14
        L9c:
            if (r1 != 0) goto La2
            kotlin.jvm.internal.AbstractC5504s.e(r2)
            return r2
        La2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.c0.m(tg.P):tg.n");
    }

    @Override // tg.AbstractC6690o
    public AbstractC6688m n(P file) {
        AbstractC5504s.h(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // tg.AbstractC6690o
    public X p(P file, boolean z10) throws IOException {
        AbstractC5504s.h(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // tg.AbstractC6690o
    public Z q(P file) throws Throwable {
        InterfaceC6685j interfaceC6685jD;
        AbstractC5504s.h(file, "file");
        ug.i iVar = (ug.i) this.f61015g.get(r(file));
        if (iVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        AbstractC6688m abstractC6688mN = this.f61014f.n(this.f61013e);
        Throwable th2 = null;
        try {
            interfaceC6685jD = K.d(abstractC6688mN.q(iVar.f()));
            if (abstractC6688mN != null) {
                try {
                    abstractC6688mN.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (abstractC6688mN != null) {
                try {
                    abstractC6688mN.close();
                } catch (Throwable th5) {
                    AbstractC2156g.a(th4, th5);
                }
            }
            interfaceC6685jD = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        AbstractC5504s.e(interfaceC6685jD);
        ug.j.k(interfaceC6685jD);
        return iVar.d() == 0 ? new ug.g(interfaceC6685jD, iVar.g(), true) : new ug.g(new C6695u(new ug.g(interfaceC6685jD, iVar.c(), true), new Inflater(true)), iVar.g(), false);
    }
}
