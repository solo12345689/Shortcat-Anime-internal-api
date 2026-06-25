package com.facebook.react.fabric.mounting;

import Df.r;
import Td.L;
import Ud.AbstractC2279u;
import android.os.SystemClock;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import h7.C4914b;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 42\u00020\u0001:\u000254B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013H\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013H\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0012J\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u0012J\u000f\u0010\u001e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001e\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001fH\u0007¢\u0006\u0004\b\t\u0010!J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R$\u00101\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0016\u00103\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010.¨\u00066"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountItemDispatcher;", "", "Lcom/facebook/react/fabric/mounting/MountingManager;", "mountingManager", "Lcom/facebook/react/fabric/mounting/MountItemDispatcher$ItemDispatchListener;", "itemDispatchListener", "<init>", "(Lcom/facebook/react/fabric/mounting/MountingManager;Lcom/facebook/react/fabric/mounting/MountItemDispatcher$ItemDispatchListener;)V", "LTd/L;", "dispatchMountItems", "()V", "", "deadline", "dispatchPreMountItemsImpl", "(J)V", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "item", "executeOrEnqueue", "(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V", "", "Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "getAndResetViewCommandMountItems", "()Ljava/util/List;", "getAndResetMountItems", "getAndResetPreMountItems", "mountItem", "addViewCommandMountItem", "(Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;)V", "addMountItem", "addPreAllocateMountItem", "tryDispatchMountItems", "Ljava/util/Queue;", "mountItems", "(Ljava/util/Queue;)V", "frameTimeNanos", "dispatchPreMountItems", "Lcom/facebook/react/fabric/mounting/MountingManager;", "Lcom/facebook/react/fabric/mounting/MountItemDispatcher$ItemDispatchListener;", "viewCommandMountItems", "Ljava/util/Queue;", "preMountItems", "", "inDispatch", "Z", "value", "batchedExecutionTime", "J", "getBatchedExecutionTime", "()J", "runStartTime", "getRunStartTime", "lastFrameTimeNanos", "Companion", "ItemDispatchListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MountItemDispatcher {
    private static final Companion Companion = new Companion(null);
    private static final long FRAME_TIME_NS = 16666666;
    private static final String TAG = "MountItemDispatcher";
    private long batchedExecutionTime;
    private boolean inDispatch;
    private final ItemDispatchListener itemDispatchListener;
    private long lastFrameTimeNanos;
    private final Queue<MountItem> mountItems;
    private final MountingManager mountingManager;
    private final Queue<MountItem> preMountItems;
    private long runStartTime;
    private final Queue<DispatchCommandMountItem> viewCommandMountItems;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountItemDispatcher$Companion;", "", "<init>", "()V", "E", "Ljava/util/Queue;", "queue", "", "drainConcurrentItemQueue", "(Ljava/util/Queue;)Ljava/util/List;", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "mountItem", "", "prefix", "LTd/L;", "printMountItem", "(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "", "FRAME_TIME_NS", "J", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <E> List<E> drainConcurrentItemQueue(Queue<E> queue) {
            if (queue.isEmpty()) {
                return null;
            }
            List listC = AbstractC2279u.c();
            do {
                E ePoll = queue.poll();
                if (ePoll != null) {
                    listC.add(ePoll);
                }
            } while (!queue.isEmpty());
            List<E> listA = AbstractC2279u.a(listC);
            if (listA.isEmpty()) {
                return null;
            }
            return listA;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void printMountItem(MountItem mountItem, String prefix) {
            List listM;
            List listN0 = r.N0(mountItem.toString(), new String[]{"\n"}, false, 0, 6, null);
            if (listN0.isEmpty()) {
                listM = AbstractC2279u.m();
            } else {
                ListIterator listIterator = listN0.listIterator(listN0.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listM = AbstractC2279u.T0(listN0, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listM = AbstractC2279u.m();
            }
            Iterator it = listM.iterator();
            while (it.hasNext()) {
                AbstractC7283a.m(MountItemDispatcher.TAG, prefix + ": " + ((String) it.next()));
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountItemDispatcher$ItemDispatchListener;", "", "", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "mountItems", "LTd/L;", "willMountItems", "(Ljava/util/List;)V", "didMountItems", "didDispatchMountItems", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ItemDispatchListener {
        void didDispatchMountItems();

        void didMountItems(List<? extends MountItem> mountItems);

        void willMountItems(List<? extends MountItem> mountItems);
    }

    public MountItemDispatcher(MountingManager mountingManager, ItemDispatchListener itemDispatchListener) {
        AbstractC5504s.h(mountingManager, "mountingManager");
        AbstractC5504s.h(itemDispatchListener, "itemDispatchListener");
        this.mountingManager = mountingManager;
        this.itemDispatchListener = itemDispatchListener;
        this.viewCommandMountItems = new ConcurrentLinkedQueue();
        this.mountItems = new ConcurrentLinkedQueue();
        this.preMountItems = new ConcurrentLinkedQueue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L dispatchMountItems$lambda$1(MountItemDispatcher mountItemDispatcher, DispatchCommandMountItem command) {
        AbstractC5504s.h(command, "command");
        if (C4914b.l()) {
            Companion.printMountItem(command, "dispatchMountItems: Executing viewCommandMountItem");
        }
        try {
            mountItemDispatcher.executeOrEnqueue(command);
        } catch (RetryableMountingLayerException e10) {
            if (command.getNumRetries() == 0) {
                command.incrementRetries();
                mountItemDispatcher.addViewCommandMountItem(command);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Caught exception executing ViewCommand: " + command, e10));
            }
        } catch (Throwable th2) {
            ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException("Caught exception executing ViewCommand: " + command, th2));
        }
        return L.f17438a;
    }

    /* JADX WARN: Finally extract failed */
    private final void dispatchPreMountItemsImpl(long deadline) {
        MountItem mountItemPoll;
        U7.a.c(0L, "MountItemDispatcher::premountViews");
        this.inDispatch = true;
        while (System.nanoTime() <= deadline && (mountItemPoll = this.preMountItems.poll()) != null) {
            try {
                if (C4914b.l()) {
                    Companion.printMountItem(mountItemPoll, "dispatchPreMountItems");
                }
                executeOrEnqueue(mountItemPoll);
            } catch (Throwable th2) {
                this.inDispatch = false;
                throw th2;
            }
        }
        this.inDispatch = false;
        U7.a.i(0L);
    }

    private final void executeOrEnqueue(MountItem item) {
        if (!this.mountingManager.isWaitingForViewAttach(item.getSurfaceId())) {
            item.execute(this.mountingManager);
            return;
        }
        if (C4914b.l()) {
            AbstractC7283a.o(TAG, "executeOrEnqueue: Item execution delayed, surface %s is not ready yet", Integer.valueOf(item.getSurfaceId()));
        }
        this.mountingManager.getSurfaceManagerEnforced(item.getSurfaceId(), "MountItemDispatcher::executeOrEnqueue").scheduleMountItemOnViewAttach(item);
    }

    private final List<MountItem> getAndResetMountItems() {
        return Companion.drainConcurrentItemQueue(this.mountItems);
    }

    private final List<MountItem> getAndResetPreMountItems() {
        return Companion.drainConcurrentItemQueue(this.preMountItems);
    }

    private final List<DispatchCommandMountItem> getAndResetViewCommandMountItems() {
        return Companion.drainConcurrentItemQueue(this.viewCommandMountItems);
    }

    public final void addMountItem(MountItem mountItem) {
        AbstractC5504s.h(mountItem, "mountItem");
        this.mountItems.add(mountItem);
    }

    public final void addPreAllocateMountItem(MountItem mountItem) {
        AbstractC5504s.h(mountItem, "mountItem");
        if (!this.mountingManager.surfaceIsStopped(mountItem.getSurfaceId())) {
            this.preMountItems.add(mountItem);
        } else if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
            AbstractC7283a.o(TAG, "Not queueing PreAllocateMountItem: surfaceId stopped: [%d] - %s", Integer.valueOf(mountItem.getSurfaceId()), mountItem.toString());
        }
    }

    public final void addViewCommandMountItem(DispatchCommandMountItem mountItem) {
        AbstractC5504s.h(mountItem, "mountItem");
        if (C4914b.d()) {
            this.mountItems.add(mountItem);
        } else {
            this.viewCommandMountItems.add(mountItem);
        }
    }

    public final void dispatchMountItems(Queue<MountItem> mountItems) {
        AbstractC5504s.h(mountItems, "mountItems");
        while (!mountItems.isEmpty()) {
            MountItem mountItemPoll = mountItems.poll();
            if (mountItemPoll == null) {
                throw new IllegalArgumentException("MountItem should not be null");
            }
            MountItem mountItem = mountItemPoll;
            try {
                mountItem.execute(this.mountingManager);
            } catch (RetryableMountingLayerException e10) {
                if (mountItem instanceof DispatchCommandMountItem) {
                    DispatchCommandMountItem dispatchCommandMountItem = (DispatchCommandMountItem) mountItem;
                    if (dispatchCommandMountItem.getNumRetries() == 0) {
                        dispatchCommandMountItem.incrementRetries();
                        addViewCommandMountItem(dispatchCommandMountItem);
                    }
                } else {
                    Companion.printMountItem(mountItem, "dispatchExternalMountItems: mounting failed with " + e10.getMessage());
                }
            }
        }
    }

    public final void dispatchPreMountItems(long frameTimeNanos) {
        this.lastFrameTimeNanos = frameTimeNanos;
        if (this.preMountItems.isEmpty()) {
            return;
        }
        dispatchPreMountItemsImpl(this.lastFrameTimeNanos + 8333333);
    }

    public final long getBatchedExecutionTime() {
        return this.batchedExecutionTime;
    }

    public final long getRunStartTime() {
        return this.runStartTime;
    }

    public final void tryDispatchMountItems() {
        if (this.inDispatch) {
            return;
        }
        this.inDispatch = true;
        try {
            dispatchMountItems();
            this.inDispatch = false;
            this.itemDispatchListener.didDispatchMountItems();
        } catch (Throwable th2) {
            this.inDispatch = false;
            throw th2;
        }
    }

    private final void dispatchMountItems() {
        boolean zIsIgnorable;
        this.batchedExecutionTime = 0L;
        this.runStartTime = SystemClock.uptimeMillis();
        List<DispatchCommandMountItem> andResetViewCommandMountItems = getAndResetViewCommandMountItems();
        List<MountItem> andResetMountItems = getAndResetMountItems();
        if (andResetMountItems == null && andResetViewCommandMountItems == null) {
            return;
        }
        this.itemDispatchListener.willMountItems(andResetMountItems);
        Function1 function1 = new Function1() { // from class: com.facebook.react.fabric.mounting.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MountItemDispatcher.dispatchMountItems$lambda$1(this.f36877a, (DispatchCommandMountItem) obj);
            }
        };
        if (andResetViewCommandMountItems != null) {
            U7.a.c(0L, "MountItemDispatcher::mountViews viewCommandMountItems");
            Iterator<DispatchCommandMountItem> it = andResetViewCommandMountItems.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            U7.a.i(0L);
        }
        List<MountItem> andResetPreMountItems = getAndResetPreMountItems();
        if (andResetPreMountItems != null) {
            U7.a.c(0L, "MountItemDispatcher::mountViews preMountItems");
            for (MountItem mountItem : andResetPreMountItems) {
                if (C4914b.l()) {
                    Companion.printMountItem(mountItem, "dispatchMountItems: Executing preMountItem");
                }
                executeOrEnqueue(mountItem);
            }
            U7.a.i(0L);
        }
        if (andResetMountItems != null) {
            U7.a.c(0L, "MountItemDispatcher::mountViews mountItems to execute");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator<MountItem> it2 = andResetMountItems.iterator();
            while (it2.hasNext()) {
                MountItem next = it2.next();
                if (C4914b.l()) {
                    Companion.printMountItem(next, "dispatchMountItems: Executing mountItem");
                }
                DispatchCommandMountItem dispatchCommandMountItem = next instanceof DispatchCommandMountItem ? (DispatchCommandMountItem) next : null;
                if (dispatchCommandMountItem != null) {
                    function1.invoke(dispatchCommandMountItem);
                } else {
                    try {
                        executeOrEnqueue(next);
                    } finally {
                        if (zIsIgnorable) {
                        }
                    }
                }
            }
            this.batchedExecutionTime += SystemClock.uptimeMillis() - jUptimeMillis;
            U7.a.i(0L);
        }
        this.itemDispatchListener.didMountItems(andResetMountItems);
    }
}
