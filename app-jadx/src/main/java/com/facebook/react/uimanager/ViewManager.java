package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.O;
import com.facebook.react.uimanager.r0;
import h7.C4914b;
import h7.C4921i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ViewManager<T extends View, C extends O> extends BaseJavaModule {
    private static final String TAG = "ViewManager";
    private q0 mDelegate;
    private Map<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    private q0 getOrCreateViewManagerDelegate() {
        q0 q0Var = this.mDelegate;
        if (q0Var != null) {
            return q0Var;
        }
        q0 delegate = getDelegate();
        this.mDelegate = delegate;
        return delegate;
    }

    private Stack<T> getRecyclableViewStack(int i10, boolean z10) {
        Map<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map == null) {
            return null;
        }
        if (z10 && !map.containsKey(Integer.valueOf(i10))) {
            this.mRecyclableViews.put(Integer.valueOf(i10), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i10));
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public T createView(int i10, C3284b0 c3284b0, Q q10, InterfaceC3282a0 interfaceC3282a0, A7.a aVar) {
        T t10 = (T) createViewInstance(i10, c3284b0, q10, interfaceC3282a0);
        if (t10 instanceof A7.d) {
            ((A7.d) t10).setOnInterceptTouchEventListener(aVar);
        }
        return t10;
    }

    protected T createViewInstance(int i10, C3284b0 c3284b0, Q q10, InterfaceC3282a0 interfaceC3282a0) {
        T t10;
        Object objUpdateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(c3284b0.c(), true);
        if (recyclableViewStack == null || recyclableViewStack.empty()) {
            t10 = (T) createViewInstance(c3284b0);
        } else {
            T tPop = recyclableViewStack.pop();
            if (C4914b.v() && tPop.getParent() != null) {
                ((ViewGroup) tPop.getParent()).removeView(tPop);
            }
            t10 = (T) recycleView(c3284b0, tPop);
        }
        t10.setId(i10);
        addEventEmitters(c3284b0, t10);
        if (q10 != null) {
            updateProperties(t10, q10);
        }
        if (interfaceC3282a0 != null && (objUpdateState = updateState(t10, q10, interfaceC3282a0)) != null) {
            updateExtraData(t10, objUpdateState);
        }
        return t10;
    }

    protected abstract T createViewInstance(C3284b0 c3284b0);

    protected boolean experimental_isPrefetchingEnabled() {
        return C4914b.o();
    }

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    protected q0 getDelegate() {
        if (this instanceof A0) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("ViewManager using codegen must override getDelegate method (name: " + getName() + ")."));
        }
        return new r0.c(this);
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return (Y6.a.f22864f && C4921i.a()) ? r0.f(getClass(), null) : r0.f(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, com.facebook.yoga.p pVar, float f11, com.facebook.yoga.p pVar2, float[] fArr) {
        return 0L;
    }

    public void onDropViewInstance(T t10) {
        View viewPrepareToRecycleView;
        Context context = t10.getContext();
        if (context == null) {
            AbstractC7283a.m(TAG, "onDropViewInstance: view [" + t10.getId() + "] has a null context");
            return;
        }
        if (context instanceof C3284b0) {
            C3284b0 c3284b0 = (C3284b0) context;
            Stack<T> recyclableViewStack = getRecyclableViewStack(c3284b0.c(), false);
            if (recyclableViewStack == null || (viewPrepareToRecycleView = prepareToRecycleView(c3284b0, t10)) == null) {
                return;
            }
            recyclableViewStack.push(viewPrepareToRecycleView);
            return;
        }
        AbstractC7283a.m(TAG, "onDropViewInstance: view [" + t10.getId() + "] has a context that is not a ThemedReactContext: " + context);
    }

    public void onSurfaceStopped(int i10) {
        Map<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map != null) {
            map.remove(Integer.valueOf(i10));
        }
    }

    protected abstract T prepareToRecycleView(C3284b0 c3284b0, T t10);

    @Deprecated
    public void receiveCommand(T t10, int i10, ReadableArray readableArray) {
    }

    protected void setupViewRecycling() {
        if (C4914b.v()) {
            this.mRecyclableViews = new HashMap();
        }
    }

    void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap();
        }
    }

    public abstract void updateExtraData(T t10, Object obj);

    public void updateProperties(T t10, Q q10) {
        q0 orCreateViewManagerDelegate = getOrCreateViewManagerDelegate();
        Iterator<Map.Entry<String, Object>> entryIterator = q10.d().getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            orCreateViewManagerDelegate.a(t10, next.getKey(), next.getValue());
        }
        onAfterUpdateTransaction(t10);
    }

    public Object updateState(T t10, Q q10, InterfaceC3282a0 interfaceC3282a0) {
        return null;
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return (C) createShadowNodeInstance();
    }

    public void receiveCommand(T t10, String str, ReadableArray readableArray) {
        getOrCreateViewManagerDelegate().b(t10, str, readableArray);
    }

    public ViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    protected void onAfterUpdateTransaction(T t10) {
    }

    protected void addEventEmitters(C3284b0 c3284b0, T t10) {
    }

    protected T recycleView(C3284b0 c3284b0, T t10) {
        return t10;
    }

    public void experimental_prefetchResources(int i10, C3284b0 c3284b0, com.facebook.react.common.mapbuffer.a aVar) {
    }

    public void setPadding(T t10, int i10, int i11, int i12, int i13) {
    }
}
