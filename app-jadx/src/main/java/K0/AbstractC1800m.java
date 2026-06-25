package K0;

import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: K0.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1800m extends e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10782a = AbstractC1791h0.g(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e.c f10783b;

    private final void I1(int i10, boolean z10) {
        e.c child$ui_release;
        int kindSet$ui_release = getKindSet$ui_release();
        setKindSet$ui_release(i10);
        if (kindSet$ui_release != i10) {
            if (AbstractC1796k.g(this)) {
                setAggregateChildKindSet$ui_release(i10);
            }
            if (isAttached()) {
                e.c node = getNode();
                e.c parent$ui_release = this;
                while (parent$ui_release != null) {
                    i10 |= parent$ui_release.getKindSet$ui_release();
                    parent$ui_release.setKindSet$ui_release(i10);
                    if (parent$ui_release == node) {
                        break;
                    } else {
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                if (z10 && parent$ui_release == node) {
                    i10 = AbstractC1791h0.h(node);
                    node.setKindSet$ui_release(i10);
                }
                int aggregateChildKindSet$ui_release = i10 | ((parent$ui_release == null || (child$ui_release = parent$ui_release.getChild$ui_release()) == null) ? 0 : child$ui_release.getAggregateChildKindSet$ui_release());
                while (parent$ui_release != null) {
                    aggregateChildKindSet$ui_release |= parent$ui_release.getKindSet$ui_release();
                    parent$ui_release.setAggregateChildKindSet$ui_release(aggregateChildKindSet$ui_release);
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
        }
    }

    private final void J1(int i10, e.c cVar) {
        int kindSet$ui_release = getKindSet$ui_release();
        if ((i10 & AbstractC1789g0.a(2)) == 0 || (AbstractC1789g0.a(2) & kindSet$ui_release) == 0 || (this instanceof E)) {
            return;
        }
        H0.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVar);
    }

    protected final InterfaceC1794j E1(InterfaceC1794j interfaceC1794j) {
        e.c node = interfaceC1794j.getNode();
        if (node != interfaceC1794j) {
            e.c cVar = interfaceC1794j instanceof e.c ? (e.c) interfaceC1794j : null;
            e.c parent$ui_release = cVar != null ? cVar.getParent$ui_release() : null;
            if (node == getNode() && AbstractC5504s.c(parent$ui_release, this)) {
                return interfaceC1794j;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (node.isAttached()) {
            H0.a.b("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui_release(getNode());
        int kindSet$ui_release = getKindSet$ui_release();
        int iH = AbstractC1791h0.h(node);
        node.setKindSet$ui_release(iH);
        J1(iH, node);
        node.setChild$ui_release(this.f10783b);
        this.f10783b = node;
        node.setParent$ui_release(this);
        I1(getKindSet$ui_release() | iH, false);
        if (isAttached()) {
            if ((iH & AbstractC1789g0.a(2)) == 0 || (kindSet$ui_release & AbstractC1789g0.a(2)) != 0) {
                updateCoordinator$ui_release(getCoordinator$ui_release());
            } else {
                C1781c0 c1781c0T0 = AbstractC1796k.n(this).t0();
                getNode().updateCoordinator$ui_release(null);
                c1781c0T0.D();
            }
            node.markAsAttached$ui_release();
            node.runAttachLifecycle$ui_release();
            AbstractC1791h0.a(node);
        }
        return interfaceC1794j;
    }

    public final e.c F1() {
        return this.f10783b;
    }

    public final int G1() {
        return this.f10782a;
    }

    protected final void H1(InterfaceC1794j interfaceC1794j) {
        e.c cVar = null;
        for (e.c child$ui_release = this.f10783b; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            if (child$ui_release == interfaceC1794j) {
                if (child$ui_release.isAttached()) {
                    AbstractC1791h0.d(child$ui_release);
                    child$ui_release.runDetachLifecycle$ui_release();
                    child$ui_release.markAsDetached$ui_release();
                }
                child$ui_release.setAsDelegateTo$ui_release(child$ui_release);
                child$ui_release.setAggregateChildKindSet$ui_release(0);
                if (cVar == null) {
                    this.f10783b = child$ui_release.getChild$ui_release();
                } else {
                    cVar.setChild$ui_release(child$ui_release.getChild$ui_release());
                }
                child$ui_release.setChild$ui_release(null);
                child$ui_release.setParent$ui_release(null);
                int kindSet$ui_release = getKindSet$ui_release();
                int iH = AbstractC1791h0.h(this);
                I1(iH, true);
                if (isAttached() && (kindSet$ui_release & AbstractC1789g0.a(2)) != 0 && (AbstractC1789g0.a(2) & iH) == 0) {
                    C1781c0 c1781c0T0 = AbstractC1796k.n(this).t0();
                    getNode().updateCoordinator$ui_release(null);
                    c1781c0T0.D();
                    return;
                }
                return;
            }
            cVar = child$ui_release;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC1794j).toString());
    }

    @Override // androidx.compose.ui.e.c
    public void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (e.c cVarF1 = F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
            cVarF1.updateCoordinator$ui_release(getCoordinator$ui_release());
            if (!cVarF1.isAttached()) {
                cVarF1.markAsAttached$ui_release();
            }
        }
    }

    @Override // androidx.compose.ui.e.c
    public void markAsDetached$ui_release() {
        for (e.c cVarF1 = F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
            cVarF1.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    @Override // androidx.compose.ui.e.c
    public void reset$ui_release() {
        super.reset$ui_release();
        for (e.c cVarF1 = F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
            cVarF1.reset$ui_release();
        }
    }

    @Override // androidx.compose.ui.e.c
    public void runAttachLifecycle$ui_release() {
        for (e.c cVarF1 = F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
            cVarF1.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override // androidx.compose.ui.e.c
    public void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (e.c cVarF1 = F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
            cVarF1.runDetachLifecycle$ui_release();
        }
    }

    @Override // androidx.compose.ui.e.c
    public void setAsDelegateTo$ui_release(e.c cVar) {
        super.setAsDelegateTo$ui_release(cVar);
        for (e.c cVarF1 = F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
            cVarF1.setAsDelegateTo$ui_release(cVar);
        }
    }

    @Override // androidx.compose.ui.e.c
    public void updateCoordinator$ui_release(AbstractC1785e0 abstractC1785e0) {
        super.updateCoordinator$ui_release(abstractC1785e0);
        for (e.c cVarF1 = F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
            cVarF1.updateCoordinator$ui_release(abstractC1785e0);
        }
    }
}
