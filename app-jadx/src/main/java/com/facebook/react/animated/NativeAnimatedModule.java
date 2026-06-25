package com.facebook.react.animated;

import Td.L;
import be.AbstractC3048a;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC3296l;
import com.facebook.react.uimanager.C3308y;
import com.facebook.react.uimanager.InterfaceC3288d0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.f0;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w.Y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "NativeAnimatedModule")
@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\b\u000e*\u0001v\b\u0007\u0018\u0000 ~2\u00020\u00012\u00020\u00022\u00020\u0003:\u0007\u007f\u0080\u0001\u0081\u0001\u0082\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\n2\n\u0010\t\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000e\u001a\u00020\n2\n\u0010\t\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u0010J\u001f\u0010*\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b0\u0010.J\u001f\u00102\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u00101\u001a\u00020&H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u00101\u001a\u00020&H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b5\u0010.J\u0017\u00106\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b6\u0010.J/\u0010<\u001a\u00020\n2\u0006\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020(2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\n2\u0006\u00107\u001a\u00020&H\u0016¢\u0006\u0004\b>\u0010.J\u001f\u0010A\u001a\u00020\n2\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020&H\u0016¢\u0006\u0004\bA\u00103J\u001f\u0010B\u001a\u00020\n2\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020&H\u0016¢\u0006\u0004\bB\u00103J\u001f\u0010D\u001a\u00020\n2\u0006\u00108\u001a\u00020&2\u0006\u0010C\u001a\u00020&H\u0016¢\u0006\u0004\bD\u00103J\u001f\u0010E\u001a\u00020\n2\u0006\u00108\u001a\u00020&2\u0006\u0010C\u001a\u00020&H\u0016¢\u0006\u0004\bE\u00103J\u0017\u0010F\u001a\u00020\n2\u0006\u00108\u001a\u00020&H\u0016¢\u0006\u0004\bF\u0010.J'\u0010J\u001a\u00020\n2\u0006\u0010C\u001a\u00020&2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020(H\u0016¢\u0006\u0004\bJ\u0010KJ'\u0010M\u001a\u00020\n2\u0006\u0010C\u001a\u00020&2\u0006\u0010H\u001a\u00020G2\u0006\u0010L\u001a\u00020&H\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\n2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\n2\u0006\u0010Q\u001a\u00020&H\u0016¢\u0006\u0004\bR\u0010.J\u001f\u0010U\u001a\u00020\n2\u0006\u0010S\u001a\u00020&2\u0006\u0010T\u001a\u00020:H\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\nH\u0016¢\u0006\u0004\bW\u0010\u0010J\u0017\u0010Z\u001a\u00020\n2\u0006\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u00060_R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010b\u001a\u00060_R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010aR\u001c\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010d0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010lR\u0016\u0010n\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010iR\u0016\u0010o\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010iR\u001c\u0010p\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bp\u0010q\u0012\u0004\br\u0010\u0010R\u0016\u0010s\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010qR\u0016\u0010t\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010qR\u0016\u0010u\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010iR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR(\u0010y\u001a\u0004\u0018\u00010d2\b\u0010y\u001a\u0004\u0018\u00010d8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}¨\u0006\u0083\u0001"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule;", "Lcom/facebook/fbreact/specs/NativeAnimatedModuleSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/UIManagerListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/animated/NativeAnimatedModule$d;", "operation", "LTd/L;", "addOperation", "(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V", "addUnbatchedOperation", "addPreOperation", "clearFrameCallback", "()V", "enqueueFrameCallback", "", "viewTag", "initializeLifecycleEventListenersForViewTag", "(I)V", "decrementInFlightAnimationsForViewTag", "userDrivenScrollEnded", "initialize", "onHostResume", "Lcom/facebook/react/bridge/UIManager;", "uiManager", "didScheduleMountItems", "(Lcom/facebook/react/bridge/UIManager;)V", "willMountItems", "didMountItems", "didDispatchMountItems", "willDispatchViewUpdates", "onHostPause", "onHostDestroy", "startOperationBatch", "finishOperationBatch", "", "tagDouble", "Lcom/facebook/react/bridge/ReadableMap;", "config", "createAnimatedNode", "(DLcom/facebook/react/bridge/ReadableMap;)V", "updateAnimatedNodeConfig", "startListeningToAnimatedNodeValue", "(D)V", "stopListeningToAnimatedNodeValue", "dropAnimatedNode", "value", "setAnimatedNodeValue", "(DD)V", "setAnimatedNodeOffset", "flattenAnimatedNodeOffset", "extractAnimatedNodeOffset", "animationIdDouble", "animatedNodeTagDouble", "animationConfig", "Lcom/facebook/react/bridge/Callback;", "endCallback", "startAnimatingNode", "(DDLcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V", "stopAnimation", "parentNodeTagDouble", "childNodeTagDouble", "connectAnimatedNodes", "disconnectAnimatedNodes", "viewTagDouble", "connectAnimatedNodeToView", "disconnectAnimatedNodeFromView", "restoreDefaultValues", "", "eventName", "eventMapping", "addAnimatedEventToView", "(DLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "animatedValueTagDouble", "removeAnimatedEventFromView", "(DLjava/lang/String;D)V", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "animatedValueNodeTagDouble", "callback", "getValue", "(DLcom/facebook/react/bridge/Callback;)V", "invalidate", "Lcom/facebook/react/bridge/ReadableArray;", "opsAndArgs", "queueAndExecuteBatchedOperations", "(Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/modules/core/b;", "reactChoreographer", "Lcom/facebook/react/modules/core/b;", "Lcom/facebook/react/animated/NativeAnimatedModule$c;", "operations", "Lcom/facebook/react/animated/NativeAnimatedModule$c;", "preOperations", "Ljava/util/concurrent/atomic/AtomicReference;", "LT6/t;", "nodesManagerRef", "Ljava/util/concurrent/atomic/AtomicReference;", "", "batchingControlledByJS", "Z", "", "currentFrameNumber", "J", "currentBatchNumber", "initializedForFabric", "initializedForNonFabric", "uiManagerType", "I", "getUiManagerType$annotations", "numFabricAnimations", "numNonFabricAnimations", "enqueuedAnimationOnFrame", "com/facebook/react/animated/NativeAnimatedModule$g", "animatedFrameCallback", "Lcom/facebook/react/animated/NativeAnimatedModule$g;", "nodesManager", "getNodesManager", "()LT6/t;", "setNodesManager", "(LT6/t;)V", "Companion", "a", "d", "c", "b", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    public static final String NAME = "NativeAnimatedModule";
    private final g animatedFrameCallback;
    private boolean batchingControlledByJS;
    private volatile long currentBatchNumber;
    private volatile long currentFrameNumber;
    private boolean enqueuedAnimationOnFrame;
    private boolean initializedForFabric;
    private boolean initializedForNonFabric;
    private final AtomicReference<T6.t> nodesManagerRef;
    private int numFabricAnimations;
    private int numNonFabricAnimations;
    private final c operations;
    private final c preOperations;
    private final b reactChoreographer;
    private int uiManagerType;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends Enum {

        /* JADX INFO: renamed from: a */
        public static final C0610a f36466a;

        /* JADX INFO: renamed from: b */
        private static a[] f36467b;

        /* JADX INFO: renamed from: c */
        public static final a f36468c = new a("OP_CODE_CREATE_ANIMATED_NODE", 0, 1);

        /* JADX INFO: renamed from: d */
        public static final a f36469d = new a("OP_CODE_UPDATE_ANIMATED_NODE_CONFIG", 1, 2);

        /* JADX INFO: renamed from: e */
        public static final a f36470e = new a("OP_CODE_GET_VALUE", 2, 3);

        /* JADX INFO: renamed from: f */
        public static final a f36471f = new a("OP_START_LISTENING_TO_ANIMATED_NODE_VALUE", 3, 4);

        /* JADX INFO: renamed from: g */
        public static final a f36472g = new a("OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE", 4, 5);

        /* JADX INFO: renamed from: h */
        public static final a f36473h = new a("OP_CODE_CONNECT_ANIMATED_NODES", 5, 6);

        /* JADX INFO: renamed from: i */
        public static final a f36474i = new a("OP_CODE_DISCONNECT_ANIMATED_NODES", 6, 7);

        /* JADX INFO: renamed from: j */
        public static final a f36475j = new a("OP_CODE_START_ANIMATING_NODE", 7, 8);

        /* JADX INFO: renamed from: k */
        public static final a f36476k = new a("OP_CODE_STOP_ANIMATION", 8, 9);

        /* JADX INFO: renamed from: l */
        public static final a f36477l = new a("OP_CODE_SET_ANIMATED_NODE_VALUE", 9, 10);

        /* JADX INFO: renamed from: m */
        public static final a f36478m = new a("OP_CODE_SET_ANIMATED_NODE_OFFSET", 10, 11);

        /* JADX INFO: renamed from: n */
        public static final a f36479n = new a("OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET", 11, 12);

        /* JADX INFO: renamed from: o */
        public static final a f36480o = new a("OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET", 12, 13);

        /* JADX INFO: renamed from: p */
        public static final a f36481p = new a("OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW", 13, 14);

        /* JADX INFO: renamed from: q */
        public static final a f36482q = new a("OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW", 14, 15);

        /* JADX INFO: renamed from: r */
        public static final a f36483r = new a("OP_CODE_RESTORE_DEFAULT_VALUES", 15, 16);

        /* JADX INFO: renamed from: s */
        public static final a f36484s = new a("OP_CODE_DROP_ANIMATED_NODE", 16, 17);

        /* JADX INFO: renamed from: t */
        public static final a f36485t = new a("OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW", 17, 18);

        /* JADX INFO: renamed from: u */
        public static final a f36486u = new a("OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW", 18, 19);

        /* JADX INFO: renamed from: v */
        public static final a f36487v = new a("OP_CODE_ADD_LISTENER", 19, 20);

        /* JADX INFO: renamed from: w */
        public static final a f36488w = new a("OP_CODE_REMOVE_LISTENERS", 20, 21);

        /* JADX INFO: renamed from: x */
        private static final /* synthetic */ a[] f36489x;

        /* JADX INFO: renamed from: y */
        private static final /* synthetic */ EnumEntries f36490y;

        /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0610a {
            public /* synthetic */ C0610a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(int i10) {
                a[] aVarArrValues = a.f36467b;
                if (aVarArrValues == null) {
                    aVarArrValues = a.values();
                }
                if (a.f36467b == null) {
                    a.f36467b = aVarArrValues;
                }
                return aVarArrValues[i10 - 1];
            }

            private C0610a() {
            }
        }

        static {
            a[] aVarArrA = a();
            f36489x = aVarArrA;
            f36490y = AbstractC3048a.a(aVarArrA);
            f36466a = new C0610a(null);
        }

        private a(String str, int i10, int i11) {
            super(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f36468c, f36469d, f36470e, f36471f, f36472g, f36473h, f36474i, f36475j, f36476k, f36477l, f36478m, f36479n, f36480o, f36481p, f36482q, f36483r, f36484s, f36485t, f36486u, f36487v, f36488w};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f36489x.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c {

        /* JADX INFO: renamed from: a */
        private final Queue f36491a = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: b */
        private d f36492b;

        public c() {
        }

        public final void a(d operation) {
            AbstractC5504s.h(operation, "operation");
            this.f36491a.add(operation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0029, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0029 A[EDGE_INSN: B:44:0x0029->B:37:0x0029 BREAK  A[LOOP:0: B:29:0x000d->B:42:0x0035], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List b(long r6) {
            /*
                r5 = this;
                boolean r0 = r5.d()
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            Ld:
                com.facebook.react.animated.NativeAnimatedModule$d r2 = r5.f36492b
                if (r2 == 0) goto L1f
                long r3 = r2.b()
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r3 <= 0) goto L1a
                goto L29
            L1a:
                r0.add(r2)
                r5.f36492b = r1
            L1f:
                java.util.Queue r2 = r5.f36491a
                java.lang.Object r2 = r2.poll()
                com.facebook.react.animated.NativeAnimatedModule$d r2 = (com.facebook.react.animated.NativeAnimatedModule.d) r2
                if (r2 != 0) goto L2a
            L29:
                return r0
            L2a:
                long r3 = r2.b()
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r3 <= 0) goto L35
                r5.f36492b = r2
                return r0
            L35:
                r0.add(r2)
                goto Ld
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.NativeAnimatedModule.c.b(long):java.util.List");
        }

        public final void c(long j10, T6.t tVar) {
            List<d> listB = b(j10);
            if (listB != null) {
                for (d dVar : listB) {
                    if (tVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    dVar.a(tVar);
                }
            }
        }

        public final boolean d() {
            return this.f36491a.isEmpty() && this.f36492b == null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private abstract class d {

        /* JADX INFO: renamed from: a */
        private long f36494a = -1;

        public d() {
        }

        public abstract void a(T6.t tVar);

        public final long b() {
            return this.f36494a;
        }

        public final void c(long j10) {
            this.f36494a = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36496a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f36470e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f36471f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f36472g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f36476k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f36479n.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.f36480o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.f36483r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.f36484s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.f36487v.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.f36488w.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a.f36468c.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a.f36469d.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a.f36473h.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[a.f36474i.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[a.f36477l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[a.f36478m.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[a.f36482q.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[a.f36475j.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[a.f36486u.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[a.f36481p.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[a.f36485t.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f36496a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36497c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f36498d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ReadableMap f36499e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(NativeAnimatedModule nativeAnimatedModule, int i10, String str, ReadableMap readableMap) {
            super();
            this.f36497c = i10;
            this.f36498d = str;
            this.f36499e = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.b(this.f36497c, this.f36498d, this.f36499e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends AbstractChoreographerFrameCallbackC3296l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ NativeAnimatedModule f36500a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ReactApplicationContext reactApplicationContext, NativeAnimatedModule nativeAnimatedModule) {
            super(reactApplicationContext);
            this.f36500a = nativeAnimatedModule;
        }

        @Override // com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC3296l
        protected void doFrameGuarded(long j10) {
            try {
                this.f36500a.enqueuedAnimationOnFrame = false;
                T6.t nodesManager = this.f36500a.getNodesManager();
                if (nodesManager == null) {
                    return;
                }
                if (nodesManager.o()) {
                    nodesManager.u(j10);
                }
                this.f36500a.enqueueFrameCallback();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36501c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f36502d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(NativeAnimatedModule nativeAnimatedModule, int i10, int i11) {
            super();
            this.f36501c = i10;
            this.f36502d = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.c(this.f36501c, this.f36502d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36503c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f36504d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(NativeAnimatedModule nativeAnimatedModule, int i10, int i11) {
            super();
            this.f36503c = i10;
            this.f36504d = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.d(this.f36503c, this.f36504d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36505c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ReadableMap f36506d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(NativeAnimatedModule nativeAnimatedModule, int i10, ReadableMap readableMap) {
            super();
            this.f36505c = i10;
            this.f36506d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.e(this.f36505c, this.f36506d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36507c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f36508d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(NativeAnimatedModule nativeAnimatedModule, int i10, int i11) {
            super();
            this.f36507c = i10;
            this.f36508d = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.f(this.f36507c, this.f36508d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36509c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f36510d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(NativeAnimatedModule nativeAnimatedModule, int i10, int i11) {
            super();
            this.f36509c = i10;
            this.f36510d = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.g(this.f36509c, this.f36510d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36511c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super();
            this.f36511c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.h(this.f36511c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36512c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super();
            this.f36512c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.i(this.f36512c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36513c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super();
            this.f36513c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.j(this.f36513c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36514c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Callback f36515d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(NativeAnimatedModule nativeAnimatedModule, int i10, Callback callback) {
            super();
            this.f36514c = i10;
            this.f36515d = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.m(this.f36514c, this.f36515d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q extends d {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f36517d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ReadableArray f36518e;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f36519a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.f36468c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.f36469d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.f36470e.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.f36471f.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.f36472g.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.f36473h.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.f36474i.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[a.f36475j.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[a.f36476k.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[a.f36477l.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[a.f36478m.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[a.f36479n.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[a.f36480o.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[a.f36481p.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[a.f36482q.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[a.f36483r.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[a.f36484s.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[a.f36485t.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[a.f36486u.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[a.f36487v.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[a.f36488w.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                f36519a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(int i10, ReadableArray readableArray) {
            super();
            this.f36517d = i10;
            this.f36518e = readableArray;
        }

        public static final void e(NativeAnimatedModule nativeAnimatedModule, int i10, double d10, double d11) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put("tag", i10);
            readableMapBuilder.put("value", d10);
            readableMapBuilder.put(com.amazon.device.iap.internal.c.b.as, d11);
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
            }
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            int i10 = 0;
            while (i10 < this.f36517d) {
                int i11 = i10 + 1;
                switch (a.f36519a[a.f36466a.a(this.f36518e.getInt(i10)).ordinal()]) {
                    case 1:
                        int i12 = i10 + 2;
                        int i13 = this.f36518e.getInt(i11);
                        i10 += 3;
                        ReadableMap map = this.f36518e.getMap(i12);
                        if (map == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.e(i13, map);
                        break;
                        break;
                    case 2:
                        int i14 = i10 + 2;
                        int i15 = this.f36518e.getInt(i11);
                        i10 += 3;
                        ReadableMap map2 = this.f36518e.getMap(i14);
                        if (map2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.C(i15, map2);
                        break;
                        break;
                    case 3:
                        i10 += 2;
                        animatedNodesManager.m(this.f36518e.getInt(i11), null);
                        break;
                    case 4:
                        i10 += 2;
                        final int i16 = this.f36518e.getInt(i11);
                        final NativeAnimatedModule nativeAnimatedModule = NativeAnimatedModule.this;
                        animatedNodesManager.y(i16, new T6.c() { // from class: T6.r
                            @Override // T6.c
                            public final void a(double d10, double d11) {
                                NativeAnimatedModule.q.e(nativeAnimatedModule, i16, d10, d11);
                            }
                        });
                        break;
                    case 5:
                        i10 += 2;
                        animatedNodesManager.B(this.f36518e.getInt(i11));
                        break;
                    case 6:
                        int i17 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.d(this.f36518e.getInt(i11), this.f36518e.getInt(i17));
                        break;
                    case 7:
                        int i18 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.g(this.f36518e.getInt(i11), this.f36518e.getInt(i18));
                        break;
                    case 8:
                        int i19 = this.f36518e.getInt(i11);
                        int i20 = i10 + 3;
                        int i21 = this.f36518e.getInt(i10 + 2);
                        i10 += 4;
                        ReadableMap map3 = this.f36518e.getMap(i20);
                        if (map3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.x(i19, i21, map3, null);
                        break;
                        break;
                    case 9:
                        i10 += 2;
                        animatedNodesManager.z(this.f36518e.getInt(i11));
                        break;
                    case 10:
                        int i22 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.w(this.f36518e.getInt(i11), this.f36518e.getDouble(i22));
                        break;
                    case 11:
                        int i23 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.v(this.f36518e.getInt(i11), this.f36518e.getDouble(i23));
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        i10 += 2;
                        animatedNodesManager.j(this.f36518e.getInt(i11));
                        break;
                    case 13:
                        i10 += 2;
                        animatedNodesManager.i(this.f36518e.getInt(i11));
                        break;
                    case 14:
                        int i24 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.c(this.f36518e.getInt(i11), this.f36518e.getInt(i24));
                        break;
                    case 15:
                        int i25 = i10 + 2;
                        int i26 = this.f36518e.getInt(i11);
                        i10 += 3;
                        int i27 = this.f36518e.getInt(i25);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i27);
                        animatedNodesManager.f(i26, i27);
                        break;
                    case 16:
                        i10 += 2;
                        animatedNodesManager.t(this.f36518e.getInt(i11));
                        break;
                    case 17:
                        i10 += 2;
                        animatedNodesManager.h(this.f36518e.getInt(i11));
                        break;
                    case 18:
                        int i28 = this.f36518e.getInt(i11);
                        int i29 = i10 + 3;
                        String string = this.f36518e.getString(i10 + 2);
                        if (string == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        i10 += 4;
                        ReadableMap map4 = this.f36518e.getMap(i29);
                        if (map4 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.b(i28, string, map4);
                        break;
                        break;
                    case 19:
                        int i30 = this.f36518e.getInt(i11);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i30);
                        int i31 = i10 + 3;
                        String string2 = this.f36518e.getString(i10 + 2);
                        if (string2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        i10 += 4;
                        animatedNodesManager.s(i30, string2, this.f36518e.getInt(i31));
                        break;
                        break;
                    case 20:
                    case 21:
                        i10 += 2;
                        break;
                    default:
                        throw new Td.r();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36520c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f36521d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f36522e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(NativeAnimatedModule nativeAnimatedModule, int i10, String str, int i11) {
            super();
            this.f36520c = i10;
            this.f36521d = str;
            this.f36522e = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.s(this.f36520c, this.f36521d, this.f36522e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class s extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36523c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super();
            this.f36523c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.t(this.f36523c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class t extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36524c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ double f36525d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(NativeAnimatedModule nativeAnimatedModule, int i10, double d10) {
            super();
            this.f36524c = i10;
            this.f36525d = d10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.v(this.f36524c, this.f36525d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class u extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36526c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ double f36527d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(NativeAnimatedModule nativeAnimatedModule, int i10, double d10) {
            super();
            this.f36526c = i10;
            this.f36527d = d10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.w(this.f36526c, this.f36527d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class v extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36528c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f36529d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ReadableMap f36530e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Callback f36531f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(NativeAnimatedModule nativeAnimatedModule, int i10, int i11, ReadableMap readableMap, Callback callback) {
            super();
            this.f36528c = i10;
            this.f36529d = i11;
            this.f36530e = readableMap;
            this.f36531f = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.x(this.f36528c, this.f36529d, this.f36530e, this.f36531f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class w extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36532c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ T6.c f36533d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(NativeAnimatedModule nativeAnimatedModule, int i10, T6.c cVar) {
            super();
            this.f36532c = i10;
            this.f36533d = cVar;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.y(this.f36532c, this.f36533d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class x extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super();
            this.f36534c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.z(this.f36534c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class y extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36535c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super();
            this.f36535c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.B(this.f36535c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class z extends d {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36536c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ReadableMap f36537d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(NativeAnimatedModule nativeAnimatedModule, int i10, ReadableMap readableMap) {
            super();
            this.f36536c = i10;
            this.f36537d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(T6.t animatedNodesManager) {
            AbstractC5504s.h(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.C(this.f36536c, this.f36537d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAnimatedModule(ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.reactChoreographer = b.f36977f.a();
        this.operations = new c();
        this.preOperations = new c();
        this.nodesManagerRef = new AtomicReference<>();
        this.uiManagerType = 1;
        this.animatedFrameCallback = new g(reactContext, this);
    }

    private final void addOperation(d operation) {
        operation.c(this.currentBatchNumber);
        this.operations.a(operation);
    }

    private final void addPreOperation(d operation) {
        operation.c(this.currentBatchNumber);
        this.preOperations.a(operation);
    }

    private final void addUnbatchedOperation(d operation) {
        operation.c(-1L);
        this.operations.a(operation);
    }

    private final void clearFrameCallback() {
        this.reactChoreographer.n(b.a.f36986d, this.animatedFrameCallback);
        this.enqueuedAnimationOnFrame = false;
    }

    public final void decrementInFlightAnimationsForViewTag(int viewTag) {
        if (C7.a.a(viewTag) == 2) {
            this.numFabricAnimations--;
        } else {
            this.numNonFabricAnimations--;
        }
        int i10 = this.numNonFabricAnimations;
        if (i10 == 0 && this.numFabricAnimations > 0 && this.uiManagerType != 2) {
            this.uiManagerType = 2;
        } else {
            if (this.numFabricAnimations != 0 || i10 <= 0 || this.uiManagerType == 1) {
                return;
            }
            this.uiManagerType = 1;
        }
    }

    public final void enqueueFrameCallback() {
        if (this.enqueuedAnimationOnFrame) {
            return;
        }
        this.reactChoreographer.k(b.a.f36986d, this.animatedFrameCallback);
        this.enqueuedAnimationOnFrame = true;
    }

    private final void initializeLifecycleEventListenersForViewTag(int viewTag) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        UIManager uIManagerG;
        int iA = C7.a.a(viewTag);
        this.uiManagerType = iA;
        if (iA == 2) {
            this.numFabricAnimations++;
        } else {
            this.numNonFabricAnimations++;
        }
        T6.t nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.p(this.uiManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedModule", new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if ((this.uiManagerType == 2 ? this.initializedForFabric : this.initializedForNonFabric) || (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) == null || (uIManagerG = f0.g(reactApplicationContextIfActiveOrWarn, this.uiManagerType)) == null) {
            return;
        }
        uIManagerG.addUIManagerEventListener(this);
        if (this.uiManagerType == 2) {
            this.initializedForFabric = true;
        } else {
            this.initializedForNonFabric = true;
        }
    }

    public static final void startListeningToAnimatedNodeValue$lambda$6(NativeAnimatedModule nativeAnimatedModule, int i10, double d10, double d11) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("tag", i10);
        readableMapBuilder.put("value", d10);
        readableMapBuilder.put(com.amazon.device.iap.internal.c.b.as, d11);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
        }
    }

    public static final L userDrivenScrollEnded$lambda$2$lambda$1(Set set, ReadableArrayBuilder putArray) {
        AbstractC5504s.h(putArray, "$this$putArray");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            putArray.add(((Number) it.next()).intValue());
        }
        return L.f17438a;
    }

    public static final void willDispatchViewUpdates$lambda$3(NativeAnimatedModule nativeAnimatedModule, long j10, C3308y it) {
        AbstractC5504s.h(it, "it");
        nativeAnimatedModule.preOperations.c(j10, nativeAnimatedModule.getNodesManager());
    }

    public static final void willDispatchViewUpdates$lambda$4(NativeAnimatedModule nativeAnimatedModule, long j10, C3308y it) {
        AbstractC5504s.h(it, "it");
        nativeAnimatedModule.operations.c(j10, nativeAnimatedModule.getNodesManager());
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double viewTagDouble, String eventName, ReadableMap eventMapping) {
        AbstractC5504s.h(eventName, "eventName");
        AbstractC5504s.h(eventMapping, "eventMapping");
        int i10 = (int) viewTagDouble;
        initializeLifecycleEventListenersForViewTag(i10);
        addOperation(new f(this, i10, eventName, eventMapping));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String eventName) {
        AbstractC5504s.h(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double animatedNodeTagDouble, double viewTagDouble) {
        int i10 = (int) viewTagDouble;
        initializeLifecycleEventListenersForViewTag(i10);
        addOperation(new h(this, (int) animatedNodeTagDouble, i10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double parentNodeTagDouble, double childNodeTagDouble) {
        addOperation(new i(this, (int) parentNodeTagDouble, (int) childNodeTagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double tagDouble, ReadableMap config) {
        AbstractC5504s.h(config, "config");
        addOperation(new j(this, (int) tagDouble, config));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
        if (this.uiManagerType != 2) {
            return;
        }
        long j10 = this.currentBatchNumber - 1;
        if (!this.batchingControlledByJS) {
            this.currentFrameNumber++;
            if (this.currentFrameNumber - this.currentBatchNumber > 2) {
                this.currentBatchNumber = this.currentFrameNumber;
                j10 = this.currentBatchNumber;
            }
        }
        this.preOperations.c(j10, getNodesManager());
        this.operations.c(j10, getNodesManager());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
        this.currentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double animatedNodeTagDouble, double viewTagDouble) {
        int i10 = (int) viewTagDouble;
        decrementInFlightAnimationsForViewTag(i10);
        addOperation(new k(this, (int) animatedNodeTagDouble, i10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double parentNodeTagDouble, double childNodeTagDouble) {
        addOperation(new l(this, (int) parentNodeTagDouble, (int) childNodeTagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double tagDouble) {
        addOperation(new m(this, (int) tagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double tagDouble) {
        addOperation(new n(this, (int) tagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.batchingControlledByJS = false;
        this.currentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double tagDouble) {
        addOperation(new o(this, (int) tagDouble));
    }

    public final T6.t getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.nodesManagerRef.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            Y.a(this.nodesManagerRef, null, new T6.t(reactApplicationContextIfActiveOrWarn));
        }
        return this.nodesManagerRef.get();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double animatedValueNodeTagDouble, Callback callback) {
        AbstractC5504s.h(callback, "callback");
        addOperation(new p(this, (int) animatedValueNodeTagDouble, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(ReadableArray opsAndArgs) {
        AbstractC5504s.h(opsAndArgs, "opsAndArgs");
        int size = opsAndArgs.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            switch (e.f36496a[a.f36466a.a(opsAndArgs.getInt(i10)).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    i10 += 2;
                    continue;
                case 11:
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    i10 += 3;
                    continue;
                case 18:
                case 19:
                    break;
                case 20:
                    int i12 = i10 + 2;
                    i10 += 3;
                    initializeLifecycleEventListenersForViewTag(opsAndArgs.getInt(i12));
                    continue;
                case 21:
                    initializeLifecycleEventListenersForViewTag(opsAndArgs.getInt(i11));
                    break;
                default:
                    throw new Td.r();
            }
            i10 += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new q(size, opsAndArgs));
        finishOperationBatch();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double viewTagDouble, String eventName, double animatedValueTagDouble) {
        AbstractC5504s.h(eventName, "eventName");
        int i10 = (int) viewTagDouble;
        decrementInFlightAnimationsForViewTag(i10);
        addOperation(new r(this, i10, eventName, (int) animatedValueTagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double animatedNodeTagDouble) {
        addPreOperation(new s(this, (int) animatedNodeTagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double tagDouble, double value) {
        addOperation(new t(this, (int) tagDouble, value));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double tagDouble, double value) {
        addOperation(new u(this, (int) tagDouble, value));
    }

    public final void setNodesManager(T6.t tVar) {
        this.nodesManagerRef.set(tVar);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double animationIdDouble, double animatedNodeTagDouble, ReadableMap animationConfig, Callback endCallback) {
        AbstractC5504s.h(animationConfig, "animationConfig");
        AbstractC5504s.h(endCallback, "endCallback");
        addUnbatchedOperation(new v(this, (int) animationIdDouble, (int) animatedNodeTagDouble, animationConfig, endCallback));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double tagDouble) {
        final int i10 = (int) tagDouble;
        addOperation(new w(this, i10, new T6.c() { // from class: T6.n
            @Override // T6.c
            public final void a(double d10, double d11) {
                NativeAnimatedModule.startListeningToAnimatedNodeValue$lambda$6(this.f17260a, i10, d10, d11);
            }
        }));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.batchingControlledByJS = true;
        this.currentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double animationIdDouble) {
        addOperation(new x(this, (int) animationIdDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double tagDouble) {
        addOperation(new y(this, (int) tagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double tagDouble, ReadableMap config) {
        AbstractC5504s.h(config, "config");
        addOperation(new z(this, (int) tagDouble, config));
    }

    public final void userDrivenScrollEnded(int viewTag) {
        T6.t tVar = this.nodesManagerRef.get();
        if (tVar == null) {
            return;
        }
        final Set setL = tVar.l(viewTag, "topScrollEnded");
        if (setL.isEmpty()) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        new ReadableMapBuilder(writableMapCreateMap).putArray("tags", new Function1() { // from class: T6.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAnimatedModule.userDrivenScrollEnded$lambda$2$lambda$1(setL, (ReadableArrayBuilder) obj);
            }
        });
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onUserDrivenAnimationEnded", writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
        if ((this.operations.d() && this.preOperations.d()) || this.uiManagerType == 2 || Y6.a.f22864f) {
            return;
        }
        final long j10 = this.currentBatchNumber;
        this.currentBatchNumber = 1 + j10;
        InterfaceC3288d0 interfaceC3288d0 = new InterfaceC3288d0() { // from class: T6.p
            @Override // com.facebook.react.uimanager.InterfaceC3288d0
            public final void a(C3308y c3308y) {
                NativeAnimatedModule.willDispatchViewUpdates$lambda$3(this.f17263a, j10, c3308y);
            }
        };
        InterfaceC3288d0 interfaceC3288d02 = new InterfaceC3288d0() { // from class: T6.q
            @Override // com.facebook.react.uimanager.InterfaceC3288d0
            public final void a(C3308y c3308y) {
                NativeAnimatedModule.willDispatchViewUpdates$lambda$4(this.f17265a, j10, c3308y);
            }
        };
        UIManagerModule uIManagerModule = (UIManagerModule) uiManager;
        uIManagerModule.prependUIBlock(interfaceC3288d0);
        uIManagerModule.addUIBlock(interfaceC3288d02);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
    }

    private static /* synthetic */ void getUiManagerType$annotations() {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double count) {
    }
}
