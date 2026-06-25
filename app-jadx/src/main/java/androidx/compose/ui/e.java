package androidx.compose.ui;

import Gf.C0;
import Gf.F0;
import Gf.O;
import Gf.P;
import K0.AbstractC1785e0;
import K0.AbstractC1796k;
import K0.C1799l0;
import K0.InterfaceC1794j;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l0.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface e {

    /* JADX INFO: renamed from: a */
    public static final a f26613a = a.f26614b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b extends e {
        @Override // androidx.compose.ui.e
        default boolean all(Function1 function1) {
            return ((Boolean) function1.invoke(this)).booleanValue();
        }

        default boolean any(Function1 function1) {
            return ((Boolean) function1.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.ui.e
        default Object foldIn(Object obj, Function2 function2) {
            return function2.invoke(obj, this);
        }

        default Object foldOut(Object obj, Function2 function2) {
            return function2.invoke(this, obj);
        }
    }

    boolean all(Function1 function1);

    Object foldIn(Object obj, Function2 function2);

    default e then(e eVar) {
        return eVar == f26613a ? this : new androidx.compose.ui.a(this, eVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class c implements InterfaceC1794j {
        public static final int $stable = 8;
        private c child;
        private AbstractC1785e0 coordinator;
        private InterfaceC5082a detachedListener;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private C1799l0 ownerScope;
        private c parent;
        private O scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private c node = this;
        private int aggregateChildKindSet = -1;

        public final int getAggregateChildKindSet$ui_release() {
            return this.aggregateChildKindSet;
        }

        public final c getChild$ui_release() {
            return this.child;
        }

        public final AbstractC1785e0 getCoordinator$ui_release() {
            return this.coordinator;
        }

        public final O getCoroutineScope() {
            O o10 = this.scope;
            if (o10 != null) {
                return o10;
            }
            O oA = P.a(AbstractC1796k.o(this).getCoroutineContext().w(F0.a((C0) AbstractC1796k.o(this).getCoroutineContext().l(C0.f7490K))));
            this.scope = oA;
            return oA;
        }

        public final InterfaceC5082a getDetachedListener$ui_release() {
            return this.detachedListener;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui_release() {
            return this.kindSet;
        }

        @Override // K0.InterfaceC1794j
        public final c getNode() {
            return this.node;
        }

        public final C1799l0 getOwnerScope$ui_release() {
            return this.ownerScope;
        }

        public final c getParent$ui_release() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        /* JADX INFO: renamed from: isKind-H91voCI$ui_release */
        public final boolean m73isKindH91voCI$ui_release(int i10) {
            return (i10 & getKindSet$ui_release()) != 0;
        }

        public void markAsAttached$ui_release() {
            if (this.isAttached) {
                H0.a.b("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                H0.a.b("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void markAsDetached$ui_release() {
            if (!this.isAttached) {
                H0.a.b("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                H0.a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                H0.a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            O o10 = this.scope;
            if (o10 != null) {
                P.c(o10, new j());
                this.scope = null;
            }
        }

        public void reset$ui_release() {
            if (!this.isAttached) {
                H0.a.b("reset() called on an unattached node");
            }
            onReset();
        }

        public void runAttachLifecycle$ui_release() {
            if (!this.isAttached) {
                H0.a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                H0.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui_release() {
            if (!this.isAttached) {
                H0.a.b("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                H0.a.b("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                H0.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            InterfaceC5082a interfaceC5082a = this.detachedListener;
            if (interfaceC5082a != null) {
                interfaceC5082a.invoke();
            }
            onDetach();
        }

        public final void setAggregateChildKindSet$ui_release(int i10) {
            this.aggregateChildKindSet = i10;
        }

        public void setAsDelegateTo$ui_release(c cVar) {
            this.node = cVar;
        }

        public final void setChild$ui_release(c cVar) {
            this.child = cVar;
        }

        public final void setDetachedListener$ui_release(InterfaceC5082a interfaceC5082a) {
            this.detachedListener = interfaceC5082a;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z10) {
            this.insertedNodeAwaitingAttachForInvalidation = z10;
        }

        public final void setKindSet$ui_release(int i10) {
            this.kindSet = i10;
        }

        public final void setOwnerScope$ui_release(C1799l0 c1799l0) {
            this.ownerScope = c1799l0;
        }

        public final void setParent$ui_release(c cVar) {
            this.parent = cVar;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z10) {
            this.updatedNodeAwaitingAttachForInvalidation = z10;
        }

        public final void sideEffect(InterfaceC5082a interfaceC5082a) {
            AbstractC1796k.o(this).F(interfaceC5082a);
        }

        public void updateCoordinator$ui_release(AbstractC1785e0 abstractC1785e0) {
            this.coordinator = abstractC1785e0;
        }

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements e {

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ a f26614b = new a();

        private a() {
        }

        @Override // androidx.compose.ui.e
        public boolean all(Function1 function1) {
            return true;
        }

        public String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.e
        public e then(e eVar) {
            return eVar;
        }

        @Override // androidx.compose.ui.e
        public Object foldIn(Object obj, Function2 function2) {
            return obj;
        }
    }
}
