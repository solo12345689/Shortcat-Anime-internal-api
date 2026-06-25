package of;

import Be.C1114i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7234l;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: of.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5880c extends C1114i implements InterfaceC5879b {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Se.e f55459F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Ue.d f55460G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Ue.h f55461H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Ue.i f55462I;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final InterfaceC5895s f55463X;

    public /* synthetic */ C5880c(InterfaceC7227e interfaceC7227e, InterfaceC7234l interfaceC7234l, InterfaceC7374h interfaceC7374h, boolean z10, InterfaceC7224b.a aVar, Se.e eVar, Ue.d dVar, Ue.h hVar, Ue.i iVar, InterfaceC5895s interfaceC5895s, h0 h0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7227e, interfaceC7234l, interfaceC7374h, z10, aVar, eVar, dVar, hVar, iVar, interfaceC5895s, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : h0Var);
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7247z
    public boolean C() {
        return false;
    }

    @Override // of.InterfaceC5896t
    public Ue.h E() {
        return this.f55461H;
    }

    @Override // of.InterfaceC5896t
    public Ue.d I() {
        return this.f55460G;
    }

    @Override // of.InterfaceC5896t
    public InterfaceC5895s J() {
        return this.f55463X;
    }

    @Override // Be.AbstractC1123s, ye.D
    public boolean isExternal() {
        return false;
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7247z
    public boolean isInline() {
        return false;
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7247z
    public boolean isSuspend() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Be.C1114i
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public C5880c L0(InterfaceC7235m newOwner, InterfaceC7247z interfaceC7247z, InterfaceC7224b.a kind, Xe.f fVar, InterfaceC7374h annotations, h0 source) {
        AbstractC5504s.h(newOwner, "newOwner");
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(annotations, "annotations");
        AbstractC5504s.h(source, "source");
        C5880c c5880c = new C5880c((InterfaceC7227e) newOwner, (InterfaceC7234l) interfaceC7247z, annotations, this.f1796E, kind, h0(), I(), E(), u1(), J(), source);
        c5880c.Y0(Q0());
        return c5880c;
    }

    @Override // of.InterfaceC5896t
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public Se.e h0() {
        return this.f55459F;
    }

    public Ue.i u1() {
        return this.f55462I;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C5880c(ye.InterfaceC7227e r12, ye.InterfaceC7234l r13, ze.InterfaceC7374h r14, boolean r15, ye.InterfaceC7224b.a r16, Se.e r17, Ue.d r18, Ue.h r19, Ue.i r20, of.InterfaceC5895s r21, ye.h0 r22) {
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
            if (r22 != 0) goto L38
            ye.h0 r0 = ye.h0.f65112a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f55459F = r7
            r11.f55460G = r8
            r11.f55461H = r9
            r11.f55462I = r10
            r1 = r21
            r11.f55463X = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: of.C5880c.<init>(ye.e, ye.l, ze.h, boolean, ye.b$a, Se.e, Ue.d, Ue.h, Ue.i, of.s, ye.h0):void");
    }
}
