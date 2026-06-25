package qf;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;

/* JADX INFO: renamed from: qf.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6178b extends AbstractC6206p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6178b(pf.n nVar) {
        super(nVar);
        if (nVar == null) {
            H(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void H(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.AbstractC6178b.H(int):void");
    }

    /* JADX INFO: renamed from: I */
    public abstract InterfaceC7227e p();

    @Override // qf.AbstractC6211v
    protected boolean d(InterfaceC7230h interfaceC7230h) {
        if (interfaceC7230h == null) {
            H(2);
        }
        return (interfaceC7230h instanceof InterfaceC7227e) && b(p(), interfaceC7230h);
    }

    @Override // qf.v0
    public ve.i n() {
        ve.i iVarM = ff.e.m(p());
        if (iVarM == null) {
            H(1);
        }
        return iVarM;
    }

    @Override // qf.AbstractC6206p
    protected S s() {
        if (ve.i.v0(p())) {
            return null;
        }
        return n().i();
    }

    @Override // qf.AbstractC6206p
    protected Collection t(boolean z10) {
        InterfaceC7235m interfaceC7235mB = p().b();
        if (!(interfaceC7235mB instanceof InterfaceC7227e)) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                H(3);
            }
            return list;
        }
        Af.j jVar = new Af.j();
        InterfaceC7227e interfaceC7227e = (InterfaceC7227e) interfaceC7235mB;
        jVar.add(interfaceC7227e.p());
        InterfaceC7227e interfaceC7227eP0 = interfaceC7227e.p0();
        if (z10 && interfaceC7227eP0 != null) {
            jVar.add(interfaceC7227eP0.p());
        }
        return jVar;
    }
}
