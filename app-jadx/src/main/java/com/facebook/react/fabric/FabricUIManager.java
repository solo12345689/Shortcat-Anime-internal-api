package com.facebook.react.fabric;

import K1.f;
import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.fabric.DevToolsReactPerfLogger;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.internal.interop.InteropUIBlockListener;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.fabric.mounting.LayoutMetricsConversions;
import com.facebook.react.fabric.mounting.MountItemDispatcher;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItemFactory;
import com.facebook.react.fabric.mounting.mountitems.PrefetchResourcesMountItem;
import com.facebook.react.fabric.mounting.mountitems.SynchronousMountItem;
import com.facebook.react.internal.interop.InteropEventEmitter;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC3296l;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.C3289e;
import com.facebook.react.uimanager.C3299o;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.M;
import com.facebook.react.uimanager.N;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.m;
import com.facebook.react.uimanager.events.u;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.r0;
import com.facebook.react.uimanager.y0;
import com.facebook.react.views.text.PreparedLayout;
import com.facebook.react.views.text.o;
import com.facebook.react.views.text.s;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import h7.C4914b;
import h7.C4921i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class FabricUIManager implements UIManager, LifecycleEventListener, UIBlockViewResolver, u {
    private static final DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener FABRIC_PERF_LOGGER = new DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener() { // from class: com.facebook.react.fabric.a
        @Override // com.facebook.react.fabric.DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener
        public final void onFabricCommitEnd(DevToolsReactPerfLogger.FabricCommitPoint fabricCommitPoint) {
            FabricUIManager.a(fabricCommitPoint);
        }
    };
    public static final boolean IS_DEVELOPMENT_ENVIRONMENT = false;
    public static final String TAG = "FabricUIManager";
    private final com.facebook.react.uimanager.events.a mBatchEventDispatchedListener;
    private FabricUIManagerBinding mBinding;
    public DevToolsReactPerfLogger mDevToolsReactPerfLogger;
    private final DispatchUIFrameCallback mDispatchUIFrameCallback;
    private final m mEventDispatcher;
    private InteropUIBlockListener mInteropUIBlockListener;
    private final MountItemDispatcher mMountItemDispatcher;
    private final MountingManager.MountItemExecutor mMountItemExecutor;
    private final MountingManager mMountingManager;
    private final ReactApplicationContext mReactApplicationContext;
    private final y0 mViewManagerRegistry;
    private final List<UIManagerListener> mListeners = new CopyOnWriteArrayList();
    private boolean mMountNotificationScheduled = false;
    private List<Integer> mSurfaceIdsWithPendingMountNotification = new ArrayList();
    private final Set<SynchronousEvent> mSynchronousEvents = new HashSet();
    private volatile boolean mDestroyed = false;
    private boolean mDriveCxxAnimations = false;
    private long mDispatchViewUpdatesTime = 0;
    private long mCommitStartTime = 0;
    private long mLayoutTime = 0;
    private long mFinishTransactionTime = 0;
    private long mFinishTransactionCPPTime = 0;
    private int mCurrentSynchronousCommitNumber = ColorExtractionConstants.MAX_PIXEL_SAMPLES;

    /* JADX INFO: renamed from: com.facebook.react.fabric.FabricUIManager$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass1 implements MountingManager.MountItemExecutor {
        AnonymousClass1() {
        }

        @Override // com.facebook.react.fabric.mounting.MountingManager.MountItemExecutor
        public void executeItems(Queue<MountItem> queue) {
            FabricUIManager.this.mMountItemDispatcher.dispatchMountItems(queue);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.fabric.FabricUIManager$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass2 extends GuardedRunnable {
        AnonymousClass2(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.fabric.FabricUIManager$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass3 implements MountItem {
        final /* synthetic */ boolean val$blockNativeResponder;
        final /* synthetic */ int val$initialReactTag;
        final /* synthetic */ int val$reactTag;
        final /* synthetic */ int val$surfaceId;

        AnonymousClass3(int i10, int i11, int i12, boolean z10) {
            i = i10;
            i = i11;
            i = i12;
            z = z10;
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public void execute(MountingManager mountingManager) {
            SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(i);
            if (surfaceManager != null) {
                surfaceManager.setJSResponder(i, i, z);
                return;
            }
            AbstractC7283a.m(FabricUIManager.TAG, "setJSResponder skipped, surface no longer available [" + i + "]");
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public int getSurfaceId() {
            return i;
        }

        public String toString() {
            return String.format("SET_JS_RESPONDER [%d] [surface:%d]", Integer.valueOf(i), Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.fabric.FabricUIManager$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass4 implements MountItem {
        AnonymousClass4() {
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public void execute(MountingManager mountingManager) {
            mountingManager.clearJSResponder();
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public int getSurfaceId() {
            return -1;
        }

        public String toString() {
            return "CLEAR_JS_RESPONDER";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class DispatchUIFrameCallback extends AbstractChoreographerFrameCallbackC3296l {
        private volatile boolean mIsMountingEnabled;
        private boolean mIsScheduled;
        private boolean mShouldSchedule;

        /* synthetic */ DispatchUIFrameCallback(FabricUIManager fabricUIManager, ReactContext reactContext, c cVar) {
            this(reactContext);
        }

        private void schedule() {
            if (this.mIsScheduled || !this.mShouldSchedule) {
                return;
            }
            this.mIsScheduled = true;
            com.facebook.react.modules.core.b.h().k(b.a.f36985c, this);
        }

        @Override // com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC3296l
        public void doFrameGuarded(long j10) {
            this.mIsScheduled = false;
            if (!this.mIsMountingEnabled) {
                AbstractC7283a.I(FabricUIManager.TAG, "Not flushing pending UI operations: exception was previously thrown");
                return;
            }
            if (FabricUIManager.this.mDestroyed) {
                AbstractC7283a.I(FabricUIManager.TAG, "Not flushing pending UI operations: FabricUIManager is destroyed");
                return;
            }
            if ((FabricUIManager.this.mDriveCxxAnimations || C4914b.c()) && FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.driveCxxAnimations();
            }
            if (FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.drainPreallocateViewsQueue();
            }
            try {
                try {
                    FabricUIManager.this.mMountItemDispatcher.dispatchPreMountItems(j10);
                    FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                    schedule();
                    FabricUIManager.this.mSynchronousEvents.clear();
                } catch (Exception e10) {
                    AbstractC7283a.n(FabricUIManager.TAG, "Exception thrown when executing UIFrameGuarded", e10);
                    this.mIsMountingEnabled = false;
                    throw e10;
                }
            } catch (Throwable th2) {
                schedule();
                throw th2;
            }
        }

        void pause() {
            com.facebook.react.modules.core.b.h().n(b.a.f36985c, this);
            this.mShouldSchedule = false;
            this.mIsScheduled = false;
        }

        void resume() {
            this.mShouldSchedule = true;
            schedule();
        }

        private DispatchUIFrameCallback(ReactContext reactContext) {
            super(reactContext);
            this.mIsMountingEnabled = true;
            this.mShouldSchedule = false;
            this.mIsScheduled = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class MountItemDispatchListener implements MountItemDispatcher.ItemDispatchListener {
        /* synthetic */ MountItemDispatchListener(FabricUIManager fabricUIManager, c cVar) {
            this();
        }

        public /* synthetic */ void lambda$didMountItems$0() {
            FabricUIManager.this.mMountNotificationScheduled = false;
            List list = FabricUIManager.this.mSurfaceIdsWithPendingMountNotification;
            FabricUIManager.this.mSurfaceIdsWithPendingMountNotification = new ArrayList();
            FabricUIManagerBinding fabricUIManagerBinding = FabricUIManager.this.mBinding;
            if (fabricUIManagerBinding == null || FabricUIManager.this.mDestroyed) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fabricUIManagerBinding.reportMount(((Integer) it.next()).intValue());
            }
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void didDispatchMountItems() {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didDispatchMountItems(FabricUIManager.this);
            }
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void didMountItems(List<? extends MountItem> list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didMountItems(FabricUIManager.this);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            for (MountItem mountItem : list) {
                if (mountItem != null && mountItem.getSurfaceId() != -1 && !FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.contains(Integer.valueOf(mountItem.getSurfaceId()))) {
                    FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.add(Integer.valueOf(mountItem.getSurfaceId()));
                }
            }
            if (FabricUIManager.this.mMountNotificationScheduled || FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.isEmpty()) {
                return;
            }
            FabricUIManager.this.mMountNotificationScheduled = true;
            UiThreadUtil.getUiThreadHandler().postAtFrontOfQueue(new Runnable() { // from class: com.facebook.react.fabric.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36876a.lambda$didMountItems$0();
                }
            });
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void willMountItems(List<? extends MountItem> list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).willMountItems(FabricUIManager.this);
            }
        }

        private MountItemDispatchListener() {
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    public FabricUIManager(ReactApplicationContext reactApplicationContext, y0 y0Var, com.facebook.react.uimanager.events.a aVar) {
        AnonymousClass1 anonymousClass1 = new MountingManager.MountItemExecutor() { // from class: com.facebook.react.fabric.FabricUIManager.1
            AnonymousClass1() {
            }

            @Override // com.facebook.react.fabric.mounting.MountingManager.MountItemExecutor
            public void executeItems(Queue<MountItem> queue) {
                FabricUIManager.this.mMountItemDispatcher.dispatchMountItems(queue);
            }
        };
        this.mMountItemExecutor = anonymousClass1;
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        MountingManager mountingManager = new MountingManager(y0Var, anonymousClass1);
        this.mMountingManager = mountingManager;
        this.mMountItemDispatcher = new MountItemDispatcher(mountingManager, new MountItemDispatchListener());
        this.mEventDispatcher = new m(reactApplicationContext, new FabricEventEmitter(this));
        this.mBatchEventDispatchedListener = aVar;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mViewManagerRegistry = y0Var;
        reactApplicationContext.registerComponentCallbacks(y0Var);
    }

    public static /* synthetic */ void a(DevToolsReactPerfLogger.FabricCommitPoint fabricCommitPoint) {
        long commitDuration = fabricCommitPoint.getCommitDuration();
        long layoutDuration = fabricCommitPoint.getLayoutDuration();
        long diffDuration = fabricCommitPoint.getDiffDuration();
        long transactionEndDuration = fabricCommitPoint.getTransactionEndDuration();
        long batchExecutionDuration = fabricCommitPoint.getBatchExecutionDuration();
        LongStreamingStats longStreamingStats = DevToolsReactPerfLogger.streamingCommitStats;
        longStreamingStats.add(commitDuration);
        LongStreamingStats longStreamingStats2 = DevToolsReactPerfLogger.streamingLayoutStats;
        longStreamingStats2.add(layoutDuration);
        LongStreamingStats longStreamingStats3 = DevToolsReactPerfLogger.streamingDiffStats;
        longStreamingStats3.add(diffDuration);
        LongStreamingStats longStreamingStats4 = DevToolsReactPerfLogger.streamingTransactionEndStats;
        longStreamingStats4.add(transactionEndDuration);
        LongStreamingStats longStreamingStats5 = DevToolsReactPerfLogger.streamingBatchExecutionStats;
        longStreamingStats5.add(batchExecutionDuration);
        AbstractC7283a.v(TAG, "Statistics of Fabric commit #%d:\n - Total commit time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Layout time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Diffing time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - FinishTransaction (Diffing + JNI serialization): %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Mounting: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n", Long.valueOf(fabricCommitPoint.getCommitNumber()), Long.valueOf(commitDuration), Double.valueOf(longStreamingStats.getAverage()), Double.valueOf(longStreamingStats.getMedian()), Long.valueOf(longStreamingStats.getMax()), Long.valueOf(layoutDuration), Double.valueOf(longStreamingStats2.getAverage()), Double.valueOf(longStreamingStats2.getMedian()), Long.valueOf(longStreamingStats2.getMax()), Long.valueOf(diffDuration), Double.valueOf(longStreamingStats3.getAverage()), Double.valueOf(longStreamingStats3.getMedian()), Long.valueOf(longStreamingStats3.getMax()), Long.valueOf(transactionEndDuration), Double.valueOf(longStreamingStats4.getAverage()), Double.valueOf(longStreamingStats4.getMedian()), Long.valueOf(longStreamingStats4.getMax()), Long.valueOf(batchExecutionDuration), Double.valueOf(longStreamingStats5.getAverage()), Double.valueOf(longStreamingStats5.getMedian()), Long.valueOf(longStreamingStats5.getMax()));
    }

    private MountItem createIntBufferBatchMountItem(int i10, int[] iArr, Object[] objArr, int i11) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        return MountItemFactory.createIntBufferBatchMountItem(i10, iArr, objArr, i11);
    }

    private void destroyUnmountedView(int i10, int i11) {
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createDestroyViewMountItem(i10, i11));
    }

    private long getEncodedScreenSizeWithoutVerticalInsets(int i10) {
        C3284b0 context = this.mMountingManager.getSurfaceManagerEnforced(i10, "getEncodedScreenSizeWithoutVerticalInsets").getContext();
        if (context != null) {
            return C3289e.c(context.getCurrentActivity());
        }
        AbstractC7283a.K(TAG, "Couldn't get context from SurfaceMountingManager for surfaceId %d", Integer.valueOf(i10));
        return 0L;
    }

    private InteropUIBlockListener getInteropUIBlockListener() {
        if (this.mInteropUIBlockListener == null) {
            InteropUIBlockListener interopUIBlockListener = new InteropUIBlockListener();
            this.mInteropUIBlockListener = interopUIBlockListener;
            addUIManagerEventListener(interopUIBlockListener);
        }
        return this.mInteropUIBlockListener;
    }

    private boolean isOnMainThread() {
        return UiThreadUtil.isOnUiThread();
    }

    private NativeArray measureLines(ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f10, float f11) {
        NativeModule nativeModuleG = this.mViewManagerRegistry.g("RCTText");
        return (NativeArray) s.u(this.mReactApplicationContext, readableMapBuffer, readableMapBuffer2, B.i(f10), B.i(f11), nativeModuleG instanceof o ? (o) nativeModuleG : null);
    }

    private void preallocateView(int i10, int i11, String str, Object obj, Object obj2, boolean z10) {
        this.mMountItemDispatcher.addPreAllocateMountItem(MountItemFactory.createPreAllocateViewMountItem(i10, i11, str, (ReadableMap) obj, (InterfaceC3282a0) obj2, z10));
    }

    private void scheduleMountItem(MountItem mountItem, int i10, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i11) {
        long j17;
        boolean z10;
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z11 = mountItem instanceof BatchMountItem;
        if (z11) {
            j17 = jUptimeMillis;
            BatchMountItem batchMountItem = (BatchMountItem) mountItem;
            Q6.a.d(batchMountItem, "BatchMountItem is null");
            z10 = !batchMountItem.isBatchEmpty();
        } else {
            j17 = jUptimeMillis;
            z10 = mountItem != null;
        }
        Iterator<UIManagerListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().didScheduleMountItems(this);
            z10 = z10;
        }
        boolean z12 = z10;
        if (z11) {
            this.mCommitStartTime = j10;
            this.mLayoutTime = j14 - j13;
            this.mFinishTransactionCPPTime = j16 - j15;
            this.mFinishTransactionTime = j17 - j15;
            this.mDispatchViewUpdatesTime = SystemClock.uptimeMillis();
        }
        if (z12) {
            Q6.a.d(mountItem, "MountItem is null");
            this.mMountItemDispatcher.addMountItem(mountItem);
            if (UiThreadUtil.isOnUiThread()) {
                new GuardedRunnable(this.mReactApplicationContext) { // from class: com.facebook.react.fabric.FabricUIManager.2
                    AnonymousClass2(ReactContext reactContext) {
                        super(reactContext);
                    }

                    @Override // com.facebook.react.bridge.GuardedRunnable
                    public void runGuarded() {
                        FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                    }
                }.run();
            }
        }
        if (z11) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i10, j10);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i10, j15);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i10, j16);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i10, j11);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i10, j12);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i10, j13);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i10, j14);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES, null, i10, j14, i11);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public <T extends View> int addRootView(T t10, WritableMap writableMap) {
        String str = TAG;
        ReactSoftExceptionLogger.logSoftException(str, new C3299o("Do not call addRootView in Fabric; it is unsupported. Call startSurface instead."));
        M m10 = (M) t10;
        int rootViewTag = m10.getRootViewTag();
        this.mMountingManager.startSurface(rootViewTag, new C3284b0(this.mReactApplicationContext, t10.getContext(), m10.getSurfaceID(), rootViewTag), t10);
        String jSModuleName = m10.getJSModuleName();
        if (C4914b.l()) {
            AbstractC7283a.d(str, "Starting surface for module: %s and reactTag: %d", jSModuleName, Integer.valueOf(rootViewTag));
        }
        Q6.a.d(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.startSurface(rootViewTag, jSModuleName, (NativeMap) writableMap);
        return rootViewTag;
    }

    public void addUIBlock(UIBlock uIBlock) {
        if (C4921i.c()) {
            getInteropUIBlockListener().addUIBlock(uIBlock);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.add(uIManagerListener);
    }

    public void attachRootView(SurfaceHandlerBinding surfaceHandlerBinding, View view) {
        this.mMountingManager.attachRootView(surfaceHandlerBinding.getSurfaceId(), view, new C3284b0(this.mReactApplicationContext, view.getContext(), surfaceHandlerBinding.getModuleName(), surfaceHandlerBinding.getSurfaceId()));
        surfaceHandlerBinding.setMountable(true);
    }

    public void clearJSResponder() {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.4
            AnonymousClass4() {
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                mountingManager.clearJSResponder();
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public int getSurfaceId() {
                return -1;
            }

            public String toString() {
                return "CLEAR_JS_RESPONDER";
            }
        });
    }

    DispatchCommandMountItem createDispatchCommandMountItemForInterop(int i10, int i11, String str, ReadableArray readableArray) {
        try {
            return MountItemFactory.createDispatchCommandMountItem(i10, i11, Integer.parseInt(str), readableArray);
        } catch (NumberFormatException unused) {
            return MountItemFactory.createDispatchCommandMountItem(i10, i11, str, readableArray);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i10, int i11, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    public void experimental_prefetchResources(int i10, String str, ReadableMapBuffer readableMapBuffer) {
        if (C4914b.p()) {
            this.mMountItemDispatcher.addMountItem(new PrefetchResourcesMountItem(i10, str, readableMapBuffer));
            return;
        }
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i10);
        if (surfaceManager != null) {
            surfaceManager.experimental_prefetchResources(i10, str, readableMapBuffer);
        }
    }

    public Integer findNextFocusableElement(int i10, int i11, int i12) {
        FabricUIManagerBinding fabricUIManagerBinding = this.mBinding;
        if (fabricUIManagerBinding == null) {
            return null;
        }
        int i13 = 1;
        if (i12 == 1) {
            i13 = 5;
        } else if (i12 == 2) {
            i13 = 4;
        } else if (i12 == 17) {
            i13 = 3;
        } else if (i12 != 33) {
            if (i12 == 66) {
                i13 = 2;
            } else {
                if (i12 != 130) {
                    return null;
                }
                i13 = 0;
            }
        }
        int iFindNextFocusableElement = fabricUIManagerBinding.findNextFocusableElement(i10, i11, i13);
        if (iFindNextFocusableElement == -1) {
            return null;
        }
        return Integer.valueOf(iFindNextFocusableElement);
    }

    public int getColor(int i10, String[] strArr) {
        C3284b0 context = this.mMountingManager.getSurfaceManagerEnforced(i10, "getColor").getContext();
        if (context == null) {
            return 0;
        }
        for (String str : strArr) {
            Integer numResolveResourcePath = ColorPropConverter.resolveResourcePath(context, str);
            if (numResolveResourcePath != null) {
                return numResolveResourcePath.intValue();
            }
        }
        return 0;
    }

    @Override // com.facebook.react.bridge.UIManager
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.mCommitStartTime));
        map.put("LayoutTime", Long.valueOf(this.mLayoutTime));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.mDispatchViewUpdatesTime));
        map.put("RunStartTime", Long.valueOf(this.mMountItemDispatcher.getRunStartTime()));
        map.put("BatchedExecutionTime", Long.valueOf(this.mMountItemDispatcher.getBatchedExecutionTime()));
        map.put("FinishFabricTransactionTime", Long.valueOf(this.mFinishTransactionTime));
        map.put("FinishFabricTransactionCPPTime", Long.valueOf(this.mFinishTransactionCPPTime));
        return map;
    }

    public int[] getRelativeAncestorList(int i10, int i11) {
        FabricUIManagerBinding fabricUIManagerBinding = this.mBinding;
        if (fabricUIManagerBinding != null) {
            return fabricUIManagerBinding.getRelativeAncestorList(i10, i11);
        }
        return null;
    }

    public boolean getThemeData(int i10, float[] fArr) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i10);
        C3284b0 context = surfaceManager != null ? surfaceManager.getContext() : null;
        if (context == null) {
            AbstractC7283a.K(TAG, "Couldn't get context for surfaceId %d in getThemeData", Integer.valueOf(i10));
            return false;
        }
        float[] fArrA = f0.a(context);
        fArr[0] = fArrA[0];
        fArr[1] = fArrA[1];
        fArr[2] = fArrA[2];
        fArr[3] = fArrA[3];
        return true;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void initialize() {
        this.mEventDispatcher.j(this.mBatchEventDispatchedListener);
        if (C4914b.l()) {
            DevToolsReactPerfLogger devToolsReactPerfLogger = new DevToolsReactPerfLogger();
            this.mDevToolsReactPerfLogger = devToolsReactPerfLogger;
            devToolsReactPerfLogger.addDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.addFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (C4921i.c()) {
            this.mReactApplicationContext.internal_registerInteropModule(RCTEventEmitter.class, new InteropEventEmitter(this.mReactApplicationContext));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void invalidate() {
        String str = TAG;
        AbstractC7283a.s(str, "FabricUIManager.invalidate");
        DevToolsReactPerfLogger devToolsReactPerfLogger = this.mDevToolsReactPerfLogger;
        if (devToolsReactPerfLogger != null) {
            devToolsReactPerfLogger.removeDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.removeFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot double-destroy FabricUIManager"));
            return;
        }
        this.mDestroyed = true;
        this.mEventDispatcher.q(this.mBatchEventDispatchedListener);
        this.mEventDispatcher.o();
        this.mReactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        this.mViewManagerRegistry.j();
        this.mReactApplicationContext.removeLifecycleEventListener(this);
        onHostPause();
        FabricUIManagerBinding fabricUIManagerBinding = this.mBinding;
        if (fabricUIManagerBinding != null) {
            fabricUIManagerBinding.unregister();
        }
        this.mBinding = null;
        r0.b();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void markActiveTouchForTag(int i10, int i11) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i10);
        if (surfaceManager != null) {
            surfaceManager.markActiveTouchForTag(i11);
        }
    }

    public long measure(int i10, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, float f11, float f12, float f13) {
        ReactContext context;
        if (i10 > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i10, "measure");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            context = surfaceManagerEnforced.getContext();
            Q6.a.d(context, "Context in SurfaceMountingManager is null. surfaceId: " + i10);
        } else {
            context = this.mReactApplicationContext;
        }
        return this.mMountingManager.measure(context, str, readableMap, readableMap2, readableMap3, LayoutMetricsConversions.getYogaSize(f10, f11), LayoutMetricsConversions.getYogaMeasureMode(f10, f11), LayoutMetricsConversions.getYogaSize(f12, f13), LayoutMetricsConversions.getYogaMeasureMode(f12, f13), null);
    }

    public float[] measurePreparedLayout(PreparedLayout preparedLayout, float f10, float f11, float f12, float f13) {
        return s.v(preparedLayout, LayoutMetricsConversions.getYogaSize(f10, f11), LayoutMetricsConversions.getYogaMeasureMode(f10, f11), LayoutMetricsConversions.getYogaSize(f12, f13), LayoutMetricsConversions.getYogaMeasureMode(f12, f13));
    }

    public long measureText(int i10, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f10, float f11, float f12, float f13, float[] fArr) {
        Context context;
        if (i10 > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i10, "measureText");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            context = surfaceManagerEnforced.getContext();
            Q6.a.d(context, "Context in SurfaceMountingManager is null. surfaceId: " + i10);
        } else {
            context = this.mReactApplicationContext;
        }
        Context context2 = context;
        NativeModule nativeModuleG = this.mViewManagerRegistry.g("RCTText");
        return s.w(context2, readableMapBuffer, readableMapBuffer2, LayoutMetricsConversions.getYogaSize(f10, f11), LayoutMetricsConversions.getYogaMeasureMode(f10, f11), LayoutMetricsConversions.getYogaSize(f12, f13), LayoutMetricsConversions.getYogaMeasureMode(f12, f13), nativeModuleG instanceof o ? (o) nativeModuleG : null, fArr);
    }

    public void onAllAnimationsComplete() {
        this.mDriveCxxAnimations = false;
    }

    public void onAnimationStarted() {
        this.mDriveCxxAnimations = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mDispatchUIFrameCallback.pause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mDispatchUIFrameCallback.resume();
    }

    public void onRequestEventBeat() {
        this.mEventDispatcher.l();
    }

    public PreparedLayout prepareTextLayout(int i10, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f10, float f11, float f12, float f13) {
        SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i10, "prepareTextLayout");
        NativeModule nativeModuleG = this.mViewManagerRegistry.g("RCTText");
        return s.j((Context) f.g(surfaceManagerEnforced.getContext()), readableMapBuffer, readableMapBuffer2, LayoutMetricsConversions.getYogaSize(f10, f11), LayoutMetricsConversions.getYogaMeasureMode(f10, f11), LayoutMetricsConversions.getYogaSize(f12, f13), LayoutMetricsConversions.getYogaMeasureMode(f12, f13), nativeModuleG instanceof o ? (o) nativeModuleG : null);
    }

    public void prependUIBlock(UIBlock uIBlock) {
        if (C4921i.c()) {
            getInteropUIBlockListener().prependUIBlock(uIBlock);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        receiveEvent(-1, i10, str, false, writableMap, 2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.remove(uIManagerListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith("top")) {
            return str;
        }
        return "on" + str.substring(3);
    }

    @Override // com.facebook.react.bridge.UIManager, com.facebook.react.fabric.interop.UIBlockViewResolver
    public View resolveView(int i10) {
        UiThreadUtil.assertOnUiThread();
        SurfaceMountingManager surfaceManagerForView = this.mMountingManager.getSurfaceManagerForView(i10);
        if (surfaceManagerForView == null) {
            return null;
        }
        return surfaceManagerForView.getView(i10);
    }

    public PreparedLayout reusePreparedLayoutWithNewReactTags(PreparedLayout preparedLayout, int[] iArr) {
        return new PreparedLayout(preparedLayout.getLayout(), preparedLayout.getMaximumNumberOfLines(), preparedLayout.getVerticalOffset(), iArr);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sendAccessibilityEvent(int i10, int i11) {
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(-1, i10, i11));
    }

    public void sendAccessibilityEventFromJS(int i10, int i11, String str) {
        int i12;
        if ("focus".equals(str)) {
            i12 = 8;
        } else if ("windowStateChange".equals(str)) {
            i12 = 32;
        } else if ("click".equals(str)) {
            i12 = 1;
        } else {
            if (!"viewHoverEnter".equals(str)) {
                throw new IllegalArgumentException("sendAccessibilityEventFromJS: invalid eventType " + str);
            }
            i12 = 128;
        }
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(i10, i11, i12));
    }

    void setBinding(FabricUIManagerBinding fabricUIManagerBinding) {
        this.mBinding = fabricUIManagerBinding;
    }

    public void setJSResponder(int i10, int i11, int i12, boolean z10) {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.3
            final /* synthetic */ boolean val$blockNativeResponder;
            final /* synthetic */ int val$initialReactTag;
            final /* synthetic */ int val$reactTag;
            final /* synthetic */ int val$surfaceId;

            AnonymousClass3(int i102, int i112, int i122, boolean z102) {
                i = i102;
                i = i112;
                i = i122;
                z = z102;
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(i);
                if (surfaceManager != null) {
                    surfaceManager.setJSResponder(i, i, z);
                    return;
                }
                AbstractC7283a.m(FabricUIManager.TAG, "setJSResponder skipped, surface no longer available [" + i + "]");
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public int getSurfaceId() {
                return i;
            }

            public String toString() {
                return String.format("SET_JS_RESPONDER [%d] [surface:%d]", Integer.valueOf(i), Integer.valueOf(i));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t10, String str, WritableMap writableMap, int i10, int i11) {
        int rootViewTag = ((M) t10).getRootViewTag();
        Context context = t10.getContext();
        C3284b0 c3284b0 = new C3284b0(this.mReactApplicationContext, context, str, rootViewTag);
        if (C4914b.l()) {
            AbstractC7283a.d(TAG, "Starting surface for module: %s and reactTag: %d", str, Integer.valueOf(rootViewTag));
        }
        this.mMountingManager.startSurface(rootViewTag, c3284b0, t10);
        Point pointB = UiThreadUtil.isOnUiThread() ? X.b(t10) : new Point(0, 0);
        Q6.a.d(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.startSurfaceWithConstraints(rootViewTag, str, (NativeMap) writableMap, LayoutMetricsConversions.getMinSize(i10), LayoutMetricsConversions.getMaxSize(i10), LayoutMetricsConversions.getMinSize(i11), LayoutMetricsConversions.getMaxSize(i11), pointB.x, pointB.y, com.facebook.react.modules.i18nmanager.a.f().i(context), com.facebook.react.modules.i18nmanager.a.f().d(context));
        return rootViewTag;
    }

    public void stopSurface(SurfaceHandlerBinding surfaceHandlerBinding) {
        if (!surfaceHandlerBinding.isRunning()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to stop surface that hasn't started yet"));
            return;
        }
        this.mMountingManager.stopSurface(surfaceHandlerBinding.getSurfaceId());
        Q6.a.d(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.stopSurfaceWithSurfaceHandler(surfaceHandlerBinding);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sweepActiveTouchForTag(int i10, int i11) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i10);
        if (surfaceManager != null) {
            surfaceManager.sweepActiveTouchForTag(i11);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i10, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        int i11 = this.mCurrentSynchronousCommitNumber;
        this.mCurrentSynchronousCommitNumber = i11 + 1;
        SynchronousMountItem synchronousMountItem = new SynchronousMountItem(i10, readableMap);
        if (!this.mMountingManager.getViewExists(i10)) {
            this.mMountItemDispatcher.addMountItem(synchronousMountItem);
            return;
        }
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i11);
        if (C4914b.l()) {
            AbstractC7283a.d(TAG, "SynchronouslyUpdateViewOnUIThread for tag %d: %s", Integer.valueOf(i10), IS_DEVELOPMENT_ENVIRONMENT ? readableMap.toHashMap().toString() : "<hidden>");
        }
        synchronousMountItem.execute(this.mMountingManager);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, null, i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i10, int i11, int i12, int i13, int i14) {
        boolean z10;
        boolean zD;
        if (C4914b.l()) {
            AbstractC7283a.c(TAG, "Updating Root Layout Specs for [%d]", Integer.valueOf(i10));
        }
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i10);
        if (surfaceManager == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new C3299o("Cannot updateRootLayoutSpecs on surfaceId that does not exist: " + i10));
            return;
        }
        C3284b0 context = surfaceManager.getContext();
        if (context != null) {
            boolean zI = com.facebook.react.modules.i18nmanager.a.f().i(context);
            zD = com.facebook.react.modules.i18nmanager.a.f().d(context);
            z10 = zI;
        } else {
            z10 = false;
            zD = false;
        }
        Q6.a.d(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.setConstraints(i10, LayoutMetricsConversions.getMinSize(i11), LayoutMetricsConversions.getMaxSize(i11), LayoutMetricsConversions.getMinSize(i12), LayoutMetricsConversions.getMaxSize(i12), i13, i14, z10, zD);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i10, String str, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i10, int i11, String str, WritableMap writableMap) {
        receiveEvent(i10, i11, str, false, writableMap, 2);
    }

    @Deprecated
    public void dispatchCommand(int i10, int i11, int i12, ReadableArray readableArray) {
        this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i10, i11, i12, readableArray));
    }

    public void receiveEvent(int i10, int i11, String str, boolean z10, WritableMap writableMap, int i12) {
        receiveEvent(i10, i11, str, z10, writableMap, i12, false);
    }

    @Override // com.facebook.react.uimanager.events.u
    public void receiveEvent(int i10, int i11, String str, boolean z10, WritableMap writableMap, int i12, boolean z11) {
        if (Y6.a.f22860b && i10 == -1) {
            AbstractC7283a.d(TAG, "Emitted event without surfaceId: [%d] %s", Integer.valueOf(i11), str);
        }
        if (this.mDestroyed) {
            AbstractC7283a.m(TAG, "Attempted to receiveEvent after destruction");
            return;
        }
        EventEmitterWrapper eventEmitter = this.mMountingManager.getEventEmitter(i10, i11);
        if (eventEmitter == null) {
            if (this.mMountingManager.getViewExists(i11)) {
                this.mMountingManager.enqueuePendingEvent(i10, i11, str, z10, writableMap, i12);
                return;
            }
            AbstractC7283a.s(TAG, "Unable to invoke event: " + str + " for reactTag: " + i11);
            return;
        }
        if (z11) {
            UiThreadUtil.assertOnUiThread();
            if (this.mSynchronousEvents.add(new SynchronousEvent(i10, i11, str))) {
                eventEmitter.dispatchEventSynchronously(str, writableMap);
                return;
            }
            return;
        }
        if (z10) {
            eventEmitter.dispatchUnique(str, writableMap);
        } else {
            eventEmitter.dispatch(str, writableMap, i12);
        }
    }

    public void dispatchCommand(int i10, int i11, String str, ReadableArray readableArray) {
        if (C4921i.c()) {
            this.mMountItemDispatcher.addViewCommandMountItem(createDispatchCommandMountItemForInterop(i10, i11, str, readableArray));
        } else {
            this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i10, i11, str, readableArray));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i10) {
        this.mMountingManager.stopSurface(i10);
        Q6.a.d(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.stopSurface(i10);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void startSurface(SurfaceHandlerBinding surfaceHandlerBinding, Context context, View view) {
        int iA;
        if (view instanceof M) {
            iA = ((M) view).getRootViewTag();
        } else {
            iA = N.a();
        }
        this.mMountingManager.startSurface(iA, new C3284b0(this.mReactApplicationContext, context, surfaceHandlerBinding.getModuleName(), iA), view);
        Q6.a.d(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.startSurfaceWithSurfaceHandler(iA, surfaceHandlerBinding, view != 0);
    }
}
