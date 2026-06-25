package q0;

import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.AbstractC1800m;
import a0.C2507c;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: q0.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6066l {
    public static final void a(InterfaceC6065k interfaceC6065k) {
        int iA = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (!interfaceC6065k.getNode().isAttached()) {
            H0.a.b("visitChildren called on an unattached node");
        }
        C2507c c2507c = new C2507c(new e.c[16], 0);
        e.c child$ui_release = interfaceC6065k.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC1796k.c(c2507c, interfaceC6065k.getNode(), false);
        } else {
            c2507c.c(child$ui_release);
        }
        while (c2507c.p() != 0) {
            e.c cVarH = (e.c) c2507c.y(c2507c.p() - 1);
            if ((cVarH.getAggregateChildKindSet$ui_release() & iA) == 0) {
                AbstractC1796k.c(c2507c, cVarH, false);
            } else {
                while (true) {
                    if (cVarH == null) {
                        break;
                    }
                    if ((cVarH.getKindSet$ui_release() & iA) != 0) {
                        C2507c c2507c2 = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                p.a((FocusTargetNode) cVarH);
                            } else if ((cVarH.getKindSet$ui_release() & iA) != 0 && (cVarH instanceof AbstractC1800m)) {
                                int i10 = 0;
                                for (e.c cVarF1 = ((AbstractC1800m) cVarH).F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarH = cVarF1;
                                        } else {
                                            if (c2507c2 == null) {
                                                c2507c2 = new C2507c(new e.c[16], 0);
                                            }
                                            if (cVarH != null) {
                                                c2507c2.c(cVarH);
                                                cVarH = null;
                                            }
                                            c2507c2.c(cVarF1);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarH = AbstractC1796k.h(c2507c2);
                        }
                    } else {
                        cVarH = cVarH.getChild$ui_release();
                    }
                }
            }
        }
    }
}
