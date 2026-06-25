package of;

import Be.AbstractC1123s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ye.InterfaceC7224b;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.g0;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class O extends Be.O implements InterfaceC5879b {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Se.j f55439E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Ue.d f55440F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Ue.h f55441G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Ue.i f55442H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final InterfaceC5895s f55443I;

    public /* synthetic */ O(InterfaceC7235m interfaceC7235m, g0 g0Var, InterfaceC7374h interfaceC7374h, Xe.f fVar, InterfaceC7224b.a aVar, Se.j jVar, Ue.d dVar, Ue.h hVar, Ue.i iVar, InterfaceC5895s interfaceC5895s, h0 h0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7235m, g0Var, interfaceC7374h, fVar, aVar, jVar, dVar, hVar, iVar, interfaceC5895s, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : h0Var);
    }

    @Override // of.InterfaceC5896t
    public Ue.h E() {
        return this.f55441G;
    }

    @Override // of.InterfaceC5896t
    public Ue.d I() {
        return this.f55440F;
    }

    @Override // of.InterfaceC5896t
    public InterfaceC5895s J() {
        return this.f55443I;
    }

    @Override // Be.O, Be.AbstractC1123s
    protected AbstractC1123s L0(InterfaceC7235m newOwner, InterfaceC7247z interfaceC7247z, InterfaceC7224b.a kind, Xe.f fVar, InterfaceC7374h annotations, h0 source) {
        Xe.f fVar2;
        AbstractC5504s.h(newOwner, "newOwner");
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(annotations, "annotations");
        AbstractC5504s.h(source, "source");
        g0 g0Var = (g0) interfaceC7247z;
        if (fVar == null) {
            Xe.f name = getName();
            AbstractC5504s.g(name, "getName(...)");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        O o10 = new O(newOwner, g0Var, annotations, fVar2, kind, h0(), I(), E(), q1(), J(), source);
        o10.Y0(Q0());
        return o10;
    }

    @Override // of.InterfaceC5896t
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public Se.j h0() {
        return this.f55439E;
    }

    public Ue.i q1() {
        return this.f55442H;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public O(ye.InterfaceC7235m r12, ye.g0 r13, ze.InterfaceC7374h r14, Xe.f r15, ye.InterfaceC7224b.a r16, Se.j r17, Ue.d r18, Ue.h r19, Ue.i r20, of.InterfaceC5895s r21, ye.h0 r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.AbstractC5504s.h(r12, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.AbstractC5504s.h(r14, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.AbstractC5504s.h(r15, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            kotlin.jvm.internal.AbstractC5504s.h(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.AbstractC5504s.h(r7, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.AbstractC5504s.h(r8, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.AbstractC5504s.h(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.AbstractC5504s.h(r10, r0)
            if (r22 != 0) goto L3d
            ye.h0 r0 = ye.h0.f65112a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L44
        L3d:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L44:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f55439E = r7
            r11.f55440F = r8
            r11.f55441G = r9
            r11.f55442H = r10
            r1 = r21
            r11.f55443I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: of.O.<init>(ye.m, ye.g0, ze.h, Xe.f, ye.b$a, Se.j, Ue.d, Ue.h, Ue.i, of.s, ye.h0):void");
    }
}
