package com.facebook.react.fabric.mounting;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.C3299o;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.InterfaceC3297m;
import com.facebook.react.uimanager.K;
import com.facebook.react.uimanager.M;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.y0;
import h7.C4914b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import t.j0;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SurfaceMountingManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String PROP_OPACITY = "opacity";
    private static final String PROP_TRANSFORM = "transform";
    private static final boolean SHOW_CHANGED_VIEW_HIERARCHIES;
    public static final String TAG = "SurfaceMountingManager";
    private A7.a mJSResponderHandler;
    private MountingManager.MountItemExecutor mMountItemExecutor;
    private RootViewManager mRootViewManager;
    private final int mSurfaceId;
    private j0 mTagSetForStoppedSurface;
    private C3284b0 mThemedReactContext;
    private y0 mViewManagerRegistry;
    private volatile boolean mIsStopped = false;
    private volatile boolean mRootViewAttached = false;
    private ConcurrentHashMap<Integer, ViewState> mTagToViewState = new ConcurrentHashMap<>();
    private final Queue<MountItem> mOnViewAttachMountItems = new ArrayDeque();
    private final Set<Integer> mErroneouslyReaddedReactTags = new HashSet();
    private final Set<Integer> mViewsWithActiveTouches = new HashSet();
    private final Set<Integer> mViewsToDeleteAfterTouchFinishes = new HashSet();
    private final j0 mTagToSynchronousMountProps = new j0();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class PendingViewEvent {
        private final boolean mCanCoalesceEvent;
        private final int mEventCategory;
        private final String mEventName;
        private final WritableMap mParams;

        public PendingViewEvent(String str, WritableMap writableMap, int i10, boolean z10) {
            this.mEventName = str;
            this.mParams = writableMap;
            this.mEventCategory = i10;
            this.mCanCoalesceEvent = z10;
        }

        public void dispatch(EventEmitterWrapper eventEmitterWrapper) {
            if (this.mCanCoalesceEvent) {
                eventEmitterWrapper.dispatchUnique(this.mEventName, this.mParams);
            } else {
                eventEmitterWrapper.dispatch(this.mEventName, this.mParams, this.mEventCategory);
            }
        }
    }

    static {
        Y6.a aVar = Y6.a.f22859a;
        SHOW_CHANGED_VIEW_HIERARCHIES = false;
    }

    public SurfaceMountingManager(int i10, A7.a aVar, y0 y0Var, RootViewManager rootViewManager, MountingManager.MountItemExecutor mountItemExecutor, C3284b0 c3284b0) {
        this.mSurfaceId = i10;
        this.mJSResponderHandler = aVar;
        this.mViewManagerRegistry = y0Var;
        this.mRootViewManager = rootViewManager;
        this.mMountItemExecutor = mountItemExecutor;
        this.mThemedReactContext = c3284b0;
    }

    private void addRootView(final View view) {
        if (isStopped()) {
            return;
        }
        this.mTagToViewState.put(Integer.valueOf(this.mSurfaceId), new ViewState(this.mSurfaceId, view, this.mRootViewManager, true));
        GuardedRunnable guardedRunnable = new GuardedRunnable((ReactContext) Q6.a.c(this.mThemedReactContext)) { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.1
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                if (SurfaceMountingManager.this.isStopped()) {
                    return;
                }
                if (view.getId() == SurfaceMountingManager.this.mSurfaceId) {
                    ReactSoftExceptionLogger.logSoftException(SurfaceMountingManager.TAG, new C3299o("Race condition in addRootView detected. Trying to set an id of [" + SurfaceMountingManager.this.mSurfaceId + "] on the RootView, but that id has already been set. "));
                } else if (view.getId() != -1) {
                    String str = SurfaceMountingManager.TAG;
                    AbstractC7283a.o(str, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(view.getId()), Integer.valueOf(SurfaceMountingManager.this.mSurfaceId));
                    ReactSoftExceptionLogger.logSoftException(str, new C3299o("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."));
                }
                view.setId(SurfaceMountingManager.this.mSurfaceId);
                KeyEvent.Callback callback = view;
                if (callback instanceof M) {
                    ((M) callback).setRootViewTag(SurfaceMountingManager.this.mSurfaceId);
                }
                SurfaceMountingManager.this.executeMountItemsOnViewAttach();
                SurfaceMountingManager.this.mRootViewAttached = true;
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            guardedRunnable.run();
        } else {
            UiThreadUtil.runOnUiThread(guardedRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeMountItemsOnViewAttach() {
        this.mMountItemExecutor.executeItems(this.mOnViewAttachMountItems);
    }

    private static Map<String, Object> getHashMapFromPropsReadableMap(ReadableMap readableMap) {
        ReadableArray array;
        HashMap map = new HashMap();
        if (readableMap.hasKey(PROP_TRANSFORM) && readableMap.getType(PROP_TRANSFORM) == ReadableType.Array && (array = readableMap.getArray(PROP_TRANSFORM)) != null) {
            ArrayList arrayList = new ArrayList(array.size());
            for (int i10 = 0; i10 < array.size(); i10++) {
                ReadableMap map2 = array.getMap(i10);
                if (map2 != null) {
                    arrayList.add(map2.toHashMap());
                }
            }
            map.put(PROP_TRANSFORM, arrayList);
        }
        if (readableMap.hasKey(PROP_OPACITY) && readableMap.getType(PROP_OPACITY) == ReadableType.Number) {
            map.put(PROP_OPACITY, Double.valueOf(readableMap.getDouble(PROP_OPACITY)));
        }
        return map;
    }

    private ViewState getNullableViewState(int i10) {
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i10));
    }

    private static InterfaceC3297m getViewGroupManager(ViewState viewState) {
        NativeModule nativeModule = viewState.mViewManager;
        if (nativeModule != null) {
            return (InterfaceC3297m) nativeModule;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    private ViewState getViewState(int i10) {
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i10));
        if (viewState != null) {
            return viewState;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + i10 + ". Surface stopped: " + isStopped());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopSurface$0() {
        if (C4914b.v()) {
            this.mViewManagerRegistry.m(this.mSurfaceId);
        }
        this.mTagSetForStoppedSurface = new j0();
        for (Map.Entry<Integer, ViewState> entry : this.mTagToViewState.entrySet()) {
            this.mTagSetForStoppedSurface.j(entry.getKey().intValue(), this);
            onViewStateDeleted(entry.getValue());
        }
        this.mTagToViewState = null;
        this.mJSResponderHandler = null;
        this.mRootViewManager = null;
        this.mMountItemExecutor = null;
        this.mThemedReactContext = null;
        this.mOnViewAttachMountItems.clear();
        AbstractC7283a.m(TAG, "Surface [" + this.mSurfaceId + "] was stopped on SurfaceMountingManager.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logViewHierarchy(ViewGroup viewGroup, boolean z10) {
        int id2 = viewGroup.getId();
        AbstractC7283a.m(TAG, "  <ViewGroup tag=" + id2 + " class=" + viewGroup.getClass().toString() + ">");
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            AbstractC7283a.m(TAG, "     <View idx=" + i10 + " tag=" + viewGroup.getChildAt(i10).getId() + " class=" + viewGroup.getChildAt(i10).getClass().toString() + ">");
        }
        String str = TAG;
        AbstractC7283a.m(str, "  </ViewGroup tag=" + id2 + ">");
        if (z10) {
            AbstractC7283a.m(str, "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                int id3 = viewGroup2 == null ? -1 : viewGroup2.getId();
                AbstractC7283a.m(TAG, "<ViewParent tag=" + id3 + " class=" + parent.getClass().toString() + ">");
            }
        }
    }

    private void onViewStateDeleted(ViewState viewState) {
        InterfaceC3282a0 interfaceC3282a0 = viewState.mStateWrapper;
        if (interfaceC3282a0 != null) {
            interfaceC3282a0.destroyState();
            viewState.mStateWrapper = null;
        }
        EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.destroy();
            viewState.mEventEmitter = null;
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewState.mIsRoot || viewManager == null) {
            return;
        }
        viewManager.onDropViewInstance(viewState.mView);
    }

    private static void overridePropsReadableMap(Map<String, Object> map, WritableMap writableMap) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (writableMap.hasKey(key)) {
                Object value = entry.getValue();
                if (key.equals(PROP_TRANSFORM)) {
                    WritableNativeArray writableNativeArray = new WritableNativeArray();
                    for (Object obj : (ArrayList) value) {
                        if (obj instanceof HashMap) {
                            WritableNativeMap writableNativeMap = new WritableNativeMap();
                            for (Map.Entry entry2 : ((HashMap) obj).entrySet()) {
                                if (entry2.getValue() instanceof String) {
                                    writableNativeMap.putString((String) entry2.getKey(), (String) entry2.getValue());
                                } else if (entry2.getValue() instanceof Number) {
                                    writableNativeMap.putDouble((String) entry2.getKey(), ((Number) entry2.getValue()).doubleValue());
                                }
                            }
                            writableNativeArray.pushMap(writableNativeMap);
                        }
                    }
                    writableMap.putArray(key, writableNativeArray);
                } else if (key.equals(PROP_OPACITY)) {
                    writableMap.putDouble(key, ((Number) value).doubleValue());
                }
            }
        }
    }

    public void addViewAt(final int i10, final int i11, final int i12) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        View view = viewState.mView;
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to add a view into a view that is not a ViewGroup. ParentTag: " + i10 + " - Tag: " + i11 + " - Index: " + i12;
            AbstractC7283a.m(TAG, str);
            throw new IllegalStateException(str);
        }
        final ViewGroup viewGroup = (ViewGroup) view;
        ViewState viewState2 = getViewState(i11);
        View view2 = viewState2.mView;
        if (view2 == null) {
            throw new IllegalStateException("Unable to find view for viewState " + viewState2 + " and tag " + i11);
        }
        boolean z10 = SHOW_CHANGED_VIEW_HIERARCHIES;
        if (z10) {
            AbstractC7283a.m(TAG, "addViewAt: [" + i11 + "] -> [" + i10 + "] idx: " + i12 + " BEFORE");
            logViewHierarchy(viewGroup, false);
        }
        ViewParent parent = view2.getParent();
        if (parent != null) {
            boolean z11 = parent instanceof ViewGroup;
            int id2 = z11 ? ((ViewGroup) parent).getId() : -1;
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("addViewAt: cannot insert view [" + i11 + "] into parent [" + i10 + "]: View already has a parent: [" + id2 + "]  Parent: " + parent.getClass().getSimpleName() + " View: " + view2.getClass().getSimpleName()));
            if (z11) {
                ((ViewGroup) parent).removeView(view2);
            }
            this.mErroneouslyReaddedReactTags.add(Integer.valueOf(i11));
        }
        try {
            getViewGroupManager(viewState).addView(viewGroup, view2, i12);
            if (z10) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC7283a.m(SurfaceMountingManager.TAG, "addViewAt: [" + i11 + "] -> [" + i10 + "] idx: " + i12 + " AFTER");
                        SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                    }
                });
            }
        } catch (IllegalStateException | IndexOutOfBoundsException e10) {
            throw new IllegalStateException("addViewAt: failed to insert view [" + i11 + "] into parent [" + i10 + "] at index " + i12, e10);
        }
    }

    public void attachRootView(View view, C3284b0 c3284b0) {
        this.mThemedReactContext = c3284b0;
        addRootView(view);
    }

    public void createView(String str, int i10, ReadableMap readableMap, InterfaceC3282a0 interfaceC3282a0, EventEmitterWrapper eventEmitterWrapper, boolean z10) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null || nullableViewState.mView == null) {
            createViewUnsafe(str, i10, readableMap, interfaceC3282a0, eventEmitterWrapper, z10);
        }
    }

    public void createViewUnsafe(String str, int i10, ReadableMap readableMap, InterfaceC3282a0 interfaceC3282a0, EventEmitterWrapper eventEmitterWrapper, boolean z10) {
        U7.a.c(0L, "SurfaceMountingManager::createViewUnsafe(" + str + ")");
        try {
            Q q10 = new Q(readableMap);
            ViewState viewState = new ViewState(i10);
            viewState.mCurrentProps = q10;
            viewState.mStateWrapper = interfaceC3282a0;
            viewState.mEventEmitter = eventEmitterWrapper;
            this.mTagToViewState.put(Integer.valueOf(i10), viewState);
            if (z10) {
                ViewManager viewManagerG = this.mViewManagerRegistry.g(str);
                viewState.mView = viewManagerG.createView(i10, this.mThemedReactContext, q10, interfaceC3282a0, this.mJSResponderHandler);
                viewState.mViewManager = viewManagerG;
            }
            U7.a.i(0L);
        } catch (Throwable th2) {
            U7.a.i(0L);
            throw th2;
        }
    }

    public void deleteView(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        if (C4914b.F() && this.mTagToSynchronousMountProps.e(i10)) {
            this.mTagToSynchronousMountProps.k(i10);
        }
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException("Unable to find viewState for tag: " + i10 + " for deleteView"));
            return;
        }
        if (this.mViewsWithActiveTouches.contains(Integer.valueOf(i10))) {
            this.mViewsToDeleteAfterTouchFinishes.add(Integer.valueOf(i10));
        } else {
            this.mTagToViewState.remove(Integer.valueOf(i10));
            onViewStateDeleted(nullableViewState);
        }
    }

    public void enqueuePendingEvent(int i10, String str, boolean z10, WritableMap writableMap, int i11) {
        final ViewState viewState;
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null || (viewState = concurrentHashMap.get(Integer.valueOf(i10))) == null) {
            return;
        }
        final PendingViewEvent pendingViewEvent = new PendingViewEvent(str, writableMap, i11, z10);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.4
            @Override // java.lang.Runnable
            public void run() {
                ViewState viewState2 = viewState;
                EventEmitterWrapper eventEmitterWrapper = viewState2.mEventEmitter;
                if (eventEmitterWrapper != null) {
                    pendingViewEvent.dispatch(eventEmitterWrapper);
                    return;
                }
                if (viewState2.mPendingEventQueue == null) {
                    viewState2.mPendingEventQueue = new LinkedList();
                }
                viewState.mPendingEventQueue.add(pendingViewEvent);
            }
        });
    }

    public void experimental_prefetchResources(int i10, String str, com.facebook.react.common.mapbuffer.a aVar) {
        if (isStopped()) {
            return;
        }
        this.mViewManagerRegistry.g(str).experimental_prefetchResources(i10, (C3284b0) Q6.a.c(this.mThemedReactContext), aVar);
    }

    public C3284b0 getContext() {
        return this.mThemedReactContext;
    }

    public EventEmitterWrapper getEventEmitter(int i10) {
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null) {
            return null;
        }
        return nullableViewState.mEventEmitter;
    }

    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public View getView(int i10) {
        ViewState nullableViewState = getNullableViewState(i10);
        View view = nullableViewState == null ? null : nullableViewState.mView;
        if (view != null) {
            return view;
        }
        throw new C3299o("Trying to resolve view with tag " + i10 + " which doesn't exist");
    }

    public boolean getViewExists(int i10) {
        j0 j0Var = this.mTagSetForStoppedSurface;
        if (j0Var != null && j0Var.e(i10)) {
            return true;
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return false;
        }
        return concurrentHashMap.containsKey(Integer.valueOf(i10));
    }

    public boolean isRootViewAttached() {
        return this.mRootViewAttached;
    }

    public boolean isStopped() {
        return this.mIsStopped;
    }

    public void markActiveTouchForTag(int i10) {
        this.mViewsWithActiveTouches.add(Integer.valueOf(i10));
    }

    public void preallocateView(String str, int i10, ReadableMap readableMap, InterfaceC3282a0 interfaceC3282a0, boolean z10) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped() && getNullableViewState(i10) == null) {
            createViewUnsafe(str, i10, readableMap, interfaceC3282a0, null, z10);
        }
    }

    public void printSurfaceState() {
        AbstractC7283a.o(TAG, "Views created for surface {%d}:", Integer.valueOf(getSurfaceId()));
        for (ViewState viewState : this.mTagToViewState.values()) {
            ViewManager viewManager = viewState.mViewManager;
            Integer numValueOf = null;
            String name = viewManager != null ? viewManager.getName() : null;
            View view = viewState.mView;
            View view2 = view != null ? (View) view.getParent() : null;
            if (view2 != null) {
                numValueOf = Integer.valueOf(view2.getId());
            }
            AbstractC7283a.o(TAG, "<%s id=%d parentTag=%s isRoot=%b />", name, Integer.valueOf(viewState.mReactTag), numValueOf, Boolean.valueOf(viewState.mIsRoot));
        }
    }

    @Deprecated
    public void receiveCommand(int i10, int i11, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag: [" + i10 + "] for commandId: " + i11);
        }
        ViewManager viewManager = nullableViewState.mViewManager;
        if (viewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewManager for tag " + i10);
        }
        View view = nullableViewState.mView;
        if (view != null) {
            viewManager.receiveCommand(view, i11, readableArray);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
    }

    public void removeViewAt(final int i10, final int i11, int i12) {
        final int i13;
        if (isStopped()) {
            return;
        }
        if (this.mErroneouslyReaddedReactTags.contains(Integer.valueOf(i10))) {
            ReactSoftExceptionLogger.logSoftException(TAG, new C3299o("removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [" + i10 + "]"));
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new IllegalStateException("Unable to find viewState for tag: [" + i11 + "] for removeViewAt"));
            return;
        }
        View view = nullableViewState.mView;
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to remove a view from a view that is not a ViewGroup. ParentTag: " + i11 + " - Tag: " + i10 + " - Index: " + i12;
            AbstractC7283a.m(TAG, str);
            throw new IllegalStateException(str);
        }
        final ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            throw new IllegalStateException("Unable to find view for tag [" + i11 + "]");
        }
        int i14 = 0;
        if (SHOW_CHANGED_VIEW_HIERARCHIES) {
            AbstractC7283a.m(TAG, "removeViewAt: [" + i10 + "] -> [" + i11 + "] idx: " + i12 + " BEFORE");
            logViewHierarchy(viewGroup, false);
        }
        InterfaceC3297m viewGroupManager = getViewGroupManager(nullableViewState);
        View childAt = viewGroupManager.getChildAt(viewGroup, i12);
        int id2 = childAt != null ? childAt.getId() : -1;
        if (id2 != i10) {
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i14 >= childCount) {
                    i14 = -1;
                    break;
                } else if (viewGroup.getChildAt(i14).getId() == i10) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 == -1) {
                AbstractC7283a.m(TAG, "removeViewAt: [" + i10 + "] -> [" + i11 + "] @" + i12 + ": view already removed from parent! Children in parent: " + childCount);
                return;
            }
            logViewHierarchy(viewGroup, true);
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Tried to remove view [" + i10 + "] of parent [" + i11 + "] at index " + i12 + ", but got view tag " + id2 + " - actual index of view: " + i14));
            i13 = i14;
        } else {
            i13 = i12;
        }
        try {
            viewGroupManager.removeViewAt(viewGroup, i13);
            if (SHOW_CHANGED_VIEW_HIERARCHIES) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.3
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC7283a.m(SurfaceMountingManager.TAG, "removeViewAt: [" + i10 + "] -> [" + i11 + "] idx: " + i13 + " AFTER");
                        SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                    }
                });
            }
        } catch (RuntimeException e10) {
            int childCount2 = viewGroupManager.getChildCount(viewGroup);
            logViewHierarchy(viewGroup, true);
            throw new IllegalStateException("Cannot remove child at index " + i13 + " from parent ViewGroup [" + viewGroup.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e10);
        }
    }

    public void scheduleMountItemOnViewAttach(MountItem mountItem) {
        this.mOnViewAttachMountItems.add(mountItem);
    }

    public void sendAccessibilityEvent(int i10, int i11) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        if (viewState.mViewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i10);
        }
        View view = viewState.mView;
        if (view != null) {
            view.sendAccessibilityEvent(i11);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setJSResponder(int i10, int i11, boolean z10) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        if (!z10) {
            this.mJSResponderHandler.d(i11, null);
            return;
        }
        ViewState viewState = getViewState(i10);
        View view = viewState.mView;
        if (i11 != i10 && (view instanceof ViewParent)) {
            this.mJSResponderHandler.d(i11, (ViewParent) view);
            return;
        }
        if (view == 0) {
            SoftAssertions.assertUnreachable("Cannot find view for tag [" + i10 + "].");
            return;
        }
        if (viewState.mIsRoot) {
            SoftAssertions.assertUnreachable("Cannot block native responder on [" + i10 + "] that is a root view");
        }
        this.mJSResponderHandler.d(i11, view.getParent());
    }

    public void stopSurface() {
        AbstractC7283a.m(TAG, "Stopping surface [" + this.mSurfaceId + "]");
        if (isStopped()) {
            return;
        }
        this.mIsStopped = true;
        for (ViewState viewState : this.mTagToViewState.values()) {
            InterfaceC3282a0 interfaceC3282a0 = viewState.mStateWrapper;
            if (interfaceC3282a0 != null) {
                interfaceC3282a0.destroyState();
                viewState.mStateWrapper = null;
            }
            EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
            if (eventEmitterWrapper != null) {
                eventEmitterWrapper.destroy();
                viewState.mEventEmitter = null;
            }
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.fabric.mounting.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f36878a.lambda$stopSurface$0();
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    public void storeSynchronousMountPropsOverride(int i10, ReadableMap readableMap) {
        if (C4914b.F()) {
            Map<String, Object> hashMapFromPropsReadableMap = getHashMapFromPropsReadableMap(readableMap);
            if (!this.mTagToSynchronousMountProps.e(i10)) {
                this.mTagToSynchronousMountProps.j(i10, hashMapFromPropsReadableMap);
                return;
            }
            Map map = (Map) Q6.a.c((Map) this.mTagToSynchronousMountProps.f(i10));
            map.putAll(hashMapFromPropsReadableMap);
            this.mTagToSynchronousMountProps.j(i10, map);
        }
    }

    public void sweepActiveTouchForTag(int i10) {
        this.mViewsWithActiveTouches.remove(Integer.valueOf(i10));
        if (this.mViewsToDeleteAfterTouchFinishes.contains(Integer.valueOf(i10))) {
            this.mViewsToDeleteAfterTouchFinishes.remove(Integer.valueOf(i10));
            deleteView(i10);
        }
    }

    public void updateEventEmitter(int i10, EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i10));
        if (viewState == null) {
            viewState = new ViewState(i10);
            this.mTagToViewState.put(Integer.valueOf(i10), viewState);
        }
        EventEmitterWrapper eventEmitterWrapper2 = viewState.mEventEmitter;
        viewState.mEventEmitter = eventEmitterWrapper;
        if (eventEmitterWrapper2 != eventEmitterWrapper && eventEmitterWrapper2 != null) {
            eventEmitterWrapper2.destroy();
        }
        Queue<PendingViewEvent> queue = viewState.mPendingEventQueue;
        if (queue != null) {
            Iterator<PendingViewEvent> it = queue.iterator();
            while (it.hasNext()) {
                it.next().dispatch(eventEmitterWrapper);
            }
            viewState.mPendingEventQueue = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateLayout(int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            r3 = this;
            boolean r0 = r3.isStopped()
            if (r0 == 0) goto L8
            goto L84
        L8:
            com.facebook.react.fabric.mounting.SurfaceMountingManager$ViewState r0 = r3.getViewState(r4)
            boolean r1 = r0.mIsRoot
            if (r1 == 0) goto L12
            goto L84
        L12:
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L85
            r4 = 0
            r1 = 1
            if (r11 != r1) goto L1c
            r1 = r4
            goto L21
        L1c:
            r2 = 2
            if (r11 != r2) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            r0.setLayoutDirection(r1)
            r11 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r11)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            r0.measure(r1, r11)
            android.view.ViewParent r11 = r0.getParent()
            boolean r1 = r11 instanceof com.facebook.react.uimanager.W
            if (r1 == 0) goto L3c
            r11.requestLayout()
        L3c:
            com.facebook.react.fabric.mounting.SurfaceMountingManager$ViewState r11 = r3.getNullableViewState(r5)
            if (r11 != 0) goto L63
            com.facebook.react.bridge.ReactNoCrashSoftException r11 = new com.facebook.react.bridge.ReactNoCrashSoftException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to find viewState for tag: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " for updateLayout"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r11.<init>(r5)
            java.lang.String r5 = "SurfaceMountingManager:MissingViewState"
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r5, r11)
            goto L6a
        L63:
            com.facebook.react.uimanager.ViewManager r5 = r11.mViewManager
            if (r5 == 0) goto L6a
            com.facebook.react.uimanager.m r5 = (com.facebook.react.uimanager.InterfaceC3297m) r5
            goto L6b
        L6a:
            r5 = 0
        L6b:
            if (r5 == 0) goto L73
            boolean r5 = r5.needsCustomLayoutForChildren()
            if (r5 != 0) goto L78
        L73:
            int r8 = r8 + r6
            int r9 = r9 + r7
            r0.layout(r6, r7, r8, r9)
        L78:
            if (r10 != 0) goto L7b
            r4 = 4
        L7b:
            int r5 = r0.getVisibility()
            if (r5 == r4) goto L84
            r0.setVisibility(r4)
        L84:
            return
        L85:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Unable to find View for tag: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.fabric.mounting.SurfaceMountingManager.updateLayout(int, int, int, int, int, int, int, int):void");
    }

    public void updateOverflowInset(int i10, int i11, int i12, int i13, int i14) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        if (viewState.mIsRoot) {
            return;
        }
        KeyEvent.Callback callback = viewState.mView;
        if (callback != null) {
            if (callback instanceof K) {
                ((K) callback).setOverflowInset(i11, i12, i13, i14);
            }
        } else {
            throw new IllegalStateException("Unable to find View for tag: " + i10);
        }
    }

    public void updatePadding(int i10, int i11, int i12, int i13, int i14) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        if (viewState.mIsRoot) {
            return;
        }
        View view = viewState.mView;
        if (view == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i10);
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager != null) {
            viewManager.setPadding(view, i11, i12, i13, i14);
            return;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    public void updateProps(int i10, ReadableMap readableMap) {
        updateProps(i10, readableMap, Boolean.FALSE);
    }

    public void updatePropsSynchronously(int i10, ReadableMap readableMap) {
        updateProps(i10, readableMap, Boolean.TRUE);
    }

    public void updateState(int i10, InterfaceC3282a0 interfaceC3282a0) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        InterfaceC3282a0 interfaceC3282a02 = viewState.mStateWrapper;
        viewState.mStateWrapper = interfaceC3282a0;
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager == null) {
            throw new IllegalStateException("Unable to find ViewManager for tag: " + i10);
        }
        Object objUpdateState = viewManager.updateState(viewState.mView, viewState.mCurrentProps, interfaceC3282a0);
        if (objUpdateState != null) {
            viewManager.updateExtraData(viewState.mView, objUpdateState);
        }
        if (interfaceC3282a02 != null) {
            interfaceC3282a02.destroyState();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class ViewState {
        Q mCurrentProps;
        EventEmitterWrapper mEventEmitter;
        final boolean mIsRoot;
        Queue<PendingViewEvent> mPendingEventQueue;
        final int mReactTag;
        InterfaceC3282a0 mStateWrapper;
        View mView;
        ViewManager mViewManager;

        public String toString() {
            return "ViewState [" + this.mReactTag + "] - isRoot: " + this.mIsRoot + " - props: " + this.mCurrentProps + " - viewManager: " + this.mViewManager + " - isLayoutOnly: " + (this.mViewManager == null);
        }

        private ViewState(int i10) {
            this(i10, null, null, false);
        }

        private ViewState(int i10, View view, ViewManager viewManager, boolean z10) {
            this.mCurrentProps = null;
            this.mStateWrapper = null;
            this.mEventEmitter = null;
            this.mPendingEventQueue = null;
            this.mReactTag = i10;
            this.mView = view;
            this.mIsRoot = z10;
            this.mViewManager = viewManager;
        }
    }

    private void updateProps(int i10, ReadableMap readableMap, Boolean bool) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        if (C4914b.F() && !bool.booleanValue() && this.mTagToSynchronousMountProps.e(i10)) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.merge(readableMap);
            overridePropsReadableMap((Map) Q6.a.c((Map) this.mTagToSynchronousMountProps.f(i10)), writableNativeMap);
            viewState.mCurrentProps = new Q(writableNativeMap);
        } else {
            viewState.mCurrentProps = new Q(readableMap);
        }
        View view = viewState.mView;
        if (view != null) {
            ((ViewManager) Q6.a.c(viewState.mViewManager)).updateProperties(view, viewState.mCurrentProps);
            return;
        }
        throw new IllegalStateException("Unable to find view for tag [" + i10 + "]");
    }

    public void receiveCommand(int i10, String str, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState != null) {
            ViewManager viewManager = nullableViewState.mViewManager;
            if (viewManager != null) {
                View view = nullableViewState.mView;
                if (view != null) {
                    viewManager.receiveCommand(view, str, readableArray);
                    return;
                }
                throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
            }
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i10);
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag: " + i10 + " for commandId: " + str);
    }
}
