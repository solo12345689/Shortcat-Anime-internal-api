package T6;

import android.util.SparseArray;
import com.facebook.react.animated.EventAnimationDriver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.f0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements com.facebook.react.uimanager.events.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f17271k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f17272a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17277f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17281j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f17273b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f17274c = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray f17275d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f17276e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f17278g = new LinkedList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public t(ReactApplicationContext reactApplicationContext) {
        this.f17272a = reactApplicationContext;
    }

    private final void A(AbstractC2149b abstractC2149b) {
        ReactApplicationContext reactApplicationContext;
        WritableArray writableArrayCreateArray = null;
        int i10 = 0;
        while (i10 < this.f17274c.size()) {
            e eVar = (e) this.f17274c.valueAt(i10);
            if (AbstractC5504s.c(abstractC2149b, eVar.f17205b)) {
                B b10 = eVar.f17205b;
                if (b10 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (eVar.f17206c != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                    readableMapBuilder.put("finished", false);
                    readableMapBuilder.put("value", b10.f17194f);
                    readableMapBuilder.put(com.amazon.device.iap.internal.c.b.as, b10.f17195g);
                    Callback callback = eVar.f17206c;
                    if (callback != null) {
                        callback.invoke(writableMapCreateMap);
                    }
                } else if (this.f17272a != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
                    readableMapBuilder2.put("animationId", eVar.f17207d);
                    readableMapBuilder2.put("finished", false);
                    readableMapBuilder2.put("value", b10.f17194f);
                    readableMapBuilder2.put(com.amazon.device.iap.internal.c.b.as, b10.f17195g);
                    if (writableArrayCreateArray == null) {
                        writableArrayCreateArray = Arguments.createArray();
                    }
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                this.f17274c.removeAt(i10);
                i10--;
            }
            i10++;
        }
        if (writableArrayCreateArray == null || (reactApplicationContext = this.f17272a) == null) {
            return;
        }
        reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
    }

    private final void D(List list) {
        List<AbstractC2149b> list2;
        List<AbstractC2149b> list3;
        int i10 = this.f17277f;
        int i11 = i10 + 1;
        this.f17277f = i11;
        if (i11 == 0) {
            this.f17277f = i10 + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            AbstractC2149b abstractC2149b = (AbstractC2149b) it.next();
            int i13 = abstractC2149b.f17202c;
            int i14 = this.f17277f;
            if (i13 != i14) {
                abstractC2149b.f17202c = i14;
                i12++;
                arrayDeque.add(abstractC2149b);
            }
        }
        while (!arrayDeque.isEmpty()) {
            AbstractC2149b abstractC2149b2 = (AbstractC2149b) arrayDeque.poll();
            if (abstractC2149b2 != null && (list3 = abstractC2149b2.f17200a) != null) {
                for (AbstractC2149b abstractC2149b3 : list3) {
                    abstractC2149b3.f17201b++;
                    int i15 = abstractC2149b3.f17202c;
                    int i16 = this.f17277f;
                    if (i15 != i16) {
                        abstractC2149b3.f17202c = i16;
                        i12++;
                        arrayDeque.add(abstractC2149b3);
                    }
                }
            }
        }
        int i17 = this.f17277f;
        int i18 = i17 + 1;
        this.f17277f = i18;
        if (i18 == 0) {
            this.f17277f = i17 + 2;
        }
        Iterator it2 = list.iterator();
        int i19 = 0;
        while (it2.hasNext()) {
            AbstractC2149b abstractC2149b4 = (AbstractC2149b) it2.next();
            if (abstractC2149b4.f17201b == 0) {
                int i20 = abstractC2149b4.f17202c;
                int i21 = this.f17277f;
                if (i20 != i21) {
                    abstractC2149b4.f17202c = i21;
                    i19++;
                    arrayDeque.add(abstractC2149b4);
                }
            }
        }
        int i22 = 0;
        while (!arrayDeque.isEmpty()) {
            AbstractC2149b abstractC2149b5 = (AbstractC2149b) arrayDeque.poll();
            if (abstractC2149b5 != null) {
                try {
                    abstractC2149b5.h();
                } catch (JSApplicationCausedNativeException e10) {
                    AbstractC7283a.n("NativeAnimatedNodesManager", "Native animation workaround, frame lost as result of race condition", e10);
                }
            }
            if (abstractC2149b5 instanceof v) {
                ((v) abstractC2149b5).m();
            }
            if (abstractC2149b5 instanceof B) {
                ((B) abstractC2149b5).m();
            }
            if (abstractC2149b5 != null && (list2 = abstractC2149b5.f17200a) != null) {
                for (AbstractC2149b abstractC2149b6 : list2) {
                    int i23 = abstractC2149b6.f17201b - 1;
                    abstractC2149b6.f17201b = i23;
                    int i24 = abstractC2149b6.f17202c;
                    int i25 = this.f17277f;
                    if (i24 != i25 && i23 == 0) {
                        abstractC2149b6.f17202c = i25;
                        i19++;
                        arrayDeque.add(abstractC2149b6);
                    } else if (i24 == i25) {
                        i22++;
                    }
                }
            }
        }
        if (i12 == i19) {
            this.f17281j = false;
            return;
        }
        if (this.f17281j) {
            return;
        }
        this.f17281j = true;
        AbstractC7283a.m("NativeAnimatedNodesManager", "Detected animation cycle or disconnected graph. ");
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            AbstractC7283a.m("NativeAnimatedNodesManager", ((AbstractC2149b) it3.next()).f());
        }
        IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + (i22 > 0 ? "cycles (" + i22 + ")" : "disconnected regions") + ", there are " + i12 + " but toposort visited only " + i19);
        boolean z10 = this.f17279h;
        if (z10 && i22 == 0) {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
        } else {
            if (!z10) {
                throw illegalStateException;
            }
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
        }
    }

    private final void n(com.facebook.react.uimanager.events.d dVar) {
        if (this.f17276e.isEmpty()) {
            return;
        }
        d.b eventAnimationDriverMatchSpec = dVar.getEventAnimationDriverMatchSpec();
        boolean z10 = false;
        for (EventAnimationDriver eventAnimationDriver : this.f17276e) {
            if (eventAnimationDriverMatchSpec != null && eventAnimationDriverMatchSpec.a(eventAnimationDriver.viewTag, eventAnimationDriver.eventName)) {
                A(eventAnimationDriver.valueNode);
                dVar.dispatchModern(eventAnimationDriver);
                this.f17278g.add(eventAnimationDriver.valueNode);
                z10 = true;
            }
        }
        if (z10) {
            D(this.f17278g);
            this.f17278g.clear();
        }
    }

    private final String q(String str) {
        if (!Df.r.Q(str, "on", false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(2);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return "top" + strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(t tVar, com.facebook.react.uimanager.events.d dVar) {
        tVar.n(dVar);
    }

    public final void B(int i10) {
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i10);
        if (abstractC2149b != null && (abstractC2149b instanceof B)) {
            ((B) abstractC2149b).n(null);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(int i10, ReadableMap readableMap) {
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i10);
        if (abstractC2149b == 0) {
            throw new JSApplicationIllegalArgumentException("updateAnimatedNode: Animated node [" + i10 + "] does not exist");
        }
        if (abstractC2149b instanceof d) {
            A(abstractC2149b);
            ((d) abstractC2149b).a(readableMap);
            this.f17275d.put(i10, abstractC2149b);
        }
    }

    public final void b(int i10, String eventHandlerName, ReadableMap eventMapping) {
        AbstractC5504s.h(eventHandlerName, "eventHandlerName");
        AbstractC5504s.h(eventMapping, "eventMapping");
        int i11 = eventMapping.getInt("animatedValueTag");
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i11);
        if (abstractC2149b == null) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node with tag [" + i11 + "] does not exist");
        }
        if (!(abstractC2149b instanceof B)) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + i10 + "] connected to event handler (" + eventHandlerName + ") should be of type " + B.class.getName());
        }
        ReadableArray array = eventMapping.getArray("nativeEventPath");
        if (array == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ArrayList arrayList = new ArrayList(array.size());
        int size = array.size();
        for (int i12 = 0; i12 < size; i12++) {
            String string = array.getString(i12);
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(string);
        }
        String strQ = q(eventHandlerName);
        this.f17276e.add(new EventAnimationDriver(strQ, i10, arrayList, (B) abstractC2149b));
        if (AbstractC5504s.c(strQ, "topScroll")) {
            b(i10, "topScrollEnded", eventMapping);
        }
    }

    public final void c(int i10, int i11) {
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i10);
        if (abstractC2149b == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node with tag [" + i10 + "] does not exist");
        }
        if (!(abstractC2149b instanceof v)) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node connected to view [" + i11 + "] should be of type " + v.class.getName());
        }
        ReactApplicationContext reactApplicationContext = this.f17272a;
        if (reactApplicationContext == null) {
            throw new IllegalStateException(("connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: " + i11).toString());
        }
        UIManager uIManagerI = f0.i(reactApplicationContext, i11);
        if (uIManagerI != null) {
            ((v) abstractC2149b).i(i11, uIManagerI);
            this.f17275d.put(i10, abstractC2149b);
        } else {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: " + i11));
        }
    }

    public final void d(int i10, int i11) {
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i10);
        if (abstractC2149b == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (parent) [" + i10 + "] does not exist");
        }
        AbstractC2149b abstractC2149b2 = (AbstractC2149b) this.f17273b.get(i11);
        if (abstractC2149b2 != null) {
            abstractC2149b.b(abstractC2149b2);
            this.f17275d.put(i11, abstractC2149b2);
        } else {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (child) [" + i11 + "] does not exist");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void e(int i10, ReadableMap config) {
        AbstractC2149b yVar;
        AbstractC5504s.h(config, "config");
        if (this.f17273b.get(i10) != null) {
            throw new JSApplicationIllegalArgumentException("createAnimatedNode: Animated node [" + i10 + "] already exists");
        }
        String string = config.getString("type");
        if (string != null) {
            switch (string.hashCode()) {
                case -1774341004:
                    if (string.equals("subtraction")) {
                        yVar = new y(config, this);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
                case -1226589444:
                    if (string.equals("addition")) {
                        yVar = new C2148a(config, this);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
                case -1023368385:
                    if (string.equals("object")) {
                        yVar = new u(config, this);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
                case 94842723:
                    if (string.equals("color")) {
                        ReactApplicationContext reactApplicationContext = this.f17272a;
                        if (reactApplicationContext == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        yVar = new f(config, this, reactApplicationContext);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
                case 106940784:
                    if (string.equals("props")) {
                        yVar = new v(config, this);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
                case 109780401:
                    if (string.equals("style")) {
                        yVar = new x(config, this);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
                case 111972721:
                    if (string.equals("value")) {
                        yVar = new B(config);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
                case 364720301:
                    if (string.equals("division")) {
                        yVar = new i(config, this);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
                case 559331748:
                    if (string.equals("interpolation")) {
                        yVar = new k(config);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
                case 668845958:
                    if (string.equals("multiplication")) {
                        yVar = new m(config, this);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
                case 1052666732:
                    if (string.equals("transform")) {
                        yVar = new A(config, this);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
                case 1227434359:
                    if (string.equals("modulus")) {
                        yVar = new l(config, this);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
                case 1270488759:
                    if (string.equals("tracking")) {
                        yVar = new z(config, this);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
                case 1300649942:
                    if (string.equals("diffclamp")) {
                        yVar = new h(config, this);
                        yVar.f17203d = i10;
                        this.f17273b.put(i10, yVar);
                        this.f17275d.put(i10, yVar);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
    }

    public final void f(int i10, int i11) {
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i10);
        if (abstractC2149b == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node with tag [" + i10 + "] does not exist");
        }
        if (abstractC2149b instanceof v) {
            ((v) abstractC2149b).j(i11);
            return;
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node connected to view [" + i11 + "] should be of type " + v.class.getName());
    }

    public final void g(int i10, int i11) {
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i10);
        if (abstractC2149b == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (parent) [" + i10 + "] does not exist");
        }
        AbstractC2149b abstractC2149b2 = (AbstractC2149b) this.f17273b.get(i11);
        if (abstractC2149b2 != null) {
            abstractC2149b.g(abstractC2149b2);
            this.f17275d.put(i11, abstractC2149b2);
        } else {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (child) [" + i11 + "] does not exist");
        }
    }

    public final void h(int i10) {
        this.f17273b.remove(i10);
        this.f17275d.remove(i10);
    }

    public final void i(int i10) {
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i10);
        if (abstractC2149b != null && (abstractC2149b instanceof B)) {
            ((B) abstractC2149b).i();
            return;
        }
        throw new JSApplicationIllegalArgumentException("extractAnimatedNodeOffset: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }

    public final void j(int i10) {
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i10);
        if (abstractC2149b != null && (abstractC2149b instanceof B)) {
            ((B) abstractC2149b).j();
            return;
        }
        throw new JSApplicationIllegalArgumentException("flattenAnimatedNodeOffset: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }

    public final AbstractC2149b k(int i10) {
        return (AbstractC2149b) this.f17273b.get(i10);
    }

    public final Set l(int i10, String eventName) {
        int i11;
        AbstractC5504s.h(eventName, "eventName");
        HashSet hashSet = new HashSet();
        for (EventAnimationDriver eventAnimationDriver : this.f17276e) {
            if (AbstractC5504s.c(eventName, eventAnimationDriver.eventName) && i10 == (i11 = eventAnimationDriver.viewTag)) {
                hashSet.add(Integer.valueOf(i11));
                List list = eventAnimationDriver.valueNode.f17200a;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        hashSet.add(Integer.valueOf(((AbstractC2149b) it.next()).f17203d));
                    }
                }
            }
        }
        return hashSet;
    }

    public final void m(int i10, Callback callback) {
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i10);
        if (abstractC2149b == null || !(abstractC2149b instanceof B)) {
            throw new JSApplicationIllegalArgumentException("getValue: Animated node with tag [" + i10 + "] does not exist or is not a 'value' node");
        }
        double dL = ((B) abstractC2149b).l();
        if (callback != null) {
            callback.invoke(Double.valueOf(dL));
            return;
        }
        if (this.f17272a == null) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("tag", i10);
        readableMapBuilder.put("value", dL);
        this.f17272a.emitDeviceEvent("onNativeAnimatedModuleGetValue", writableMapCreateMap);
    }

    public final boolean o() {
        return this.f17274c.size() > 0 || this.f17275d.size() > 0;
    }

    @Override // com.facebook.react.uimanager.events.i
    public void onEventDispatch(final com.facebook.react.uimanager.events.d event) {
        AbstractC5504s.h(event, "event");
        if (UiThreadUtil.isOnUiThread()) {
            n(event);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: T6.s
                @Override // java.lang.Runnable
                public final void run() {
                    t.r(this.f17269a, event);
                }
            });
        }
    }

    public final void p(int i10) {
        if (i10 == 2 ? this.f17279h : this.f17280i) {
            return;
        }
        ReactApplicationContext reactApplicationContext = this.f17272a;
        if (reactApplicationContext == null) {
            throw new IllegalStateException("Required value was null.");
        }
        UIManager uIManagerG = f0.g(reactApplicationContext, i10);
        if (uIManagerG != null) {
            uIManagerG.getEventDispatcher().c(this);
            if (i10 == 2) {
                this.f17279h = true;
            } else {
                this.f17280i = true;
            }
        }
    }

    public final void s(int i10, String eventHandlerName, int i11) {
        Object next;
        AbstractC5504s.h(eventHandlerName, "eventHandlerName");
        String strQ = q(eventHandlerName);
        Iterator it = this.f17276e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) next;
            if (AbstractC5504s.c(strQ, eventAnimationDriver.eventName) && i10 == eventAnimationDriver.viewTag && i11 == eventAnimationDriver.valueNode.f17203d) {
                break;
            }
        }
        EventAnimationDriver eventAnimationDriver2 = (EventAnimationDriver) next;
        if (eventAnimationDriver2 != null) {
            this.f17276e.remove(eventAnimationDriver2);
        }
        if (AbstractC5504s.c(strQ, "topScroll")) {
            s(i10, "topScrollEnded", i11);
        }
    }

    public final void t(int i10) {
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i10);
        if (abstractC2149b == null) {
            return;
        }
        if (abstractC2149b instanceof v) {
            ((v) abstractC2149b).l();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type " + v.class.getName());
    }

    public final void u(long j10) {
        ReactApplicationContext reactApplicationContext;
        UiThreadUtil.assertOnUiThread();
        int size = this.f17275d.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17275d.valueAt(i10);
            List list = this.f17278g;
            AbstractC5504s.e(abstractC2149b);
            list.add(abstractC2149b);
        }
        this.f17275d.clear();
        int size2 = this.f17274c.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size2; i11++) {
            e eVar = (e) this.f17274c.valueAt(i11);
            eVar.b(j10);
            B b10 = eVar.f17205b;
            if (b10 != null) {
                this.f17278g.add(b10);
            }
            if (eVar.f17204a) {
                z10 = true;
            }
        }
        D(this.f17278g);
        this.f17278g.clear();
        if (z10) {
            WritableArray writableArrayCreateArray = null;
            for (int size3 = this.f17274c.size() - 1; -1 < size3; size3--) {
                e eVar2 = (e) this.f17274c.valueAt(size3);
                if (eVar2.f17204a) {
                    B b11 = eVar2.f17205b;
                    if (b11 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (eVar2.f17206c != null) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                        readableMapBuilder.put("finished", true);
                        readableMapBuilder.put("value", b11.f17194f);
                        readableMapBuilder.put(com.amazon.device.iap.internal.c.b.as, b11.f17195g);
                        Callback callback = eVar2.f17206c;
                        if (callback != null) {
                            callback.invoke(writableMapCreateMap);
                        }
                    } else if (this.f17272a != null) {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
                        readableMapBuilder2.put("animationId", eVar2.f17207d);
                        readableMapBuilder2.put("finished", true);
                        readableMapBuilder2.put("value", b11.f17194f);
                        readableMapBuilder2.put(com.amazon.device.iap.internal.c.b.as, b11.f17195g);
                        if (writableArrayCreateArray == null) {
                            writableArrayCreateArray = Arguments.createArray();
                        }
                        writableArrayCreateArray.pushMap(writableMapCreateMap2);
                    }
                    this.f17274c.removeAt(size3);
                }
            }
            if (writableArrayCreateArray == null || (reactApplicationContext = this.f17272a) == null) {
                return;
            }
            reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
        }
    }

    public final void v(int i10, double d10) {
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i10);
        if (abstractC2149b != null && (abstractC2149b instanceof B)) {
            ((B) abstractC2149b).f17195g = d10;
            this.f17275d.put(i10, abstractC2149b);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeOffset: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
        }
    }

    public final void w(int i10, double d10) {
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i10);
        if (abstractC2149b != null && (abstractC2149b instanceof B)) {
            A(abstractC2149b);
            ((B) abstractC2149b).f17194f = d10;
            this.f17275d.put(i10, abstractC2149b);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeValue: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
        }
    }

    public final void x(int i10, int i11, ReadableMap animationConfig, Callback callback) {
        e jVar;
        AbstractC5504s.h(animationConfig, "animationConfig");
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i11);
        if (abstractC2149b == null) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i11 + "] does not exist");
        }
        if (!(abstractC2149b instanceof B)) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i11 + "] should be of type " + B.class.getName());
        }
        e eVar = (e) this.f17274c.get(i10);
        if (eVar != null) {
            eVar.a(animationConfig);
            return;
        }
        String string = animationConfig.getString("type");
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1266514778) {
                if (iHashCode != -895679987) {
                    if (iHashCode == 95459258 && string.equals("decay")) {
                        jVar = new g(animationConfig);
                        jVar.f17207d = i10;
                        jVar.f17206c = callback;
                        jVar.f17205b = (B) abstractC2149b;
                        this.f17274c.put(i10, jVar);
                        return;
                    }
                } else if (string.equals("spring")) {
                    jVar = new w(animationConfig);
                    jVar.f17207d = i10;
                    jVar.f17206c = callback;
                    jVar.f17205b = (B) abstractC2149b;
                    this.f17274c.put(i10, jVar);
                    return;
                }
            } else if (string.equals("frames")) {
                jVar = new j(animationConfig);
                jVar.f17207d = i10;
                jVar.f17206c = callback;
                jVar.f17205b = (B) abstractC2149b;
                this.f17274c.put(i10, jVar);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + i11 + "]: " + string);
    }

    public final void y(int i10, c cVar) {
        AbstractC2149b abstractC2149b = (AbstractC2149b) this.f17273b.get(i10);
        if (abstractC2149b != null && (abstractC2149b instanceof B)) {
            ((B) abstractC2149b).n(cVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (r3 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        r12 = r11.f17272a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r12 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        r12.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(int r12) {
        /*
            r11 = this;
            android.util.SparseArray r0 = r11.f17274c
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            r3 = 0
            if (r2 >= r0) goto La6
            android.util.SparseArray r4 = r11.f17274c
            java.lang.Object r4 = r4.valueAt(r2)
            T6.e r4 = (T6.e) r4
            int r5 = r4.f17207d
            if (r5 != r12) goto La2
            com.facebook.react.bridge.Callback r12 = r4.f17206c
            java.lang.String r0 = "offset"
            java.lang.String r5 = "value"
            java.lang.String r6 = "finished"
            java.lang.String r7 = "Required value was null."
            if (r12 == 0) goto L5f
            com.facebook.react.bridge.WritableMap r12 = com.facebook.react.bridge.Arguments.createMap()
            com.facebook.react.bridge.ReadableMapBuilder r8 = new com.facebook.react.bridge.ReadableMapBuilder
            r8.<init>(r12)
            r8.put(r6, r1)
            T6.B r1 = r4.f17205b
            if (r1 == 0) goto L59
            double r9 = r1.f17194f
            r8.put(r5, r9)
            T6.B r1 = r4.f17205b
            if (r1 == 0) goto L53
            double r5 = r1.f17195g
            r8.put(r0, r5)
            com.facebook.react.bridge.Callback r0 = r4.f17206c
            if (r0 == 0) goto L4d
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            r0.invoke(r12)
            goto L9c
        L4d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r7)
            throw r12
        L53:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r7)
            throw r12
        L59:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r7)
            throw r12
        L5f:
            com.facebook.react.bridge.ReactApplicationContext r12 = r11.f17272a
            if (r12 == 0) goto L9c
            com.facebook.react.bridge.WritableMap r12 = com.facebook.react.bridge.Arguments.createMap()
            com.facebook.react.bridge.ReadableMapBuilder r3 = new com.facebook.react.bridge.ReadableMapBuilder
            r3.<init>(r12)
            java.lang.String r8 = "animationId"
            int r9 = r4.f17207d
            r3.put(r8, r9)
            r3.put(r6, r1)
            T6.B r1 = r4.f17205b
            if (r1 == 0) goto L96
            double r8 = r1.f17194f
            r3.put(r5, r8)
            T6.B r1 = r4.f17205b
            if (r1 == 0) goto L90
            double r4 = r1.f17195g
            r3.put(r0, r4)
            com.facebook.react.bridge.WritableArray r3 = com.facebook.react.bridge.Arguments.createArray()
            r3.pushMap(r12)
            goto L9c
        L90:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r7)
            throw r12
        L96:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r7)
            throw r12
        L9c:
            android.util.SparseArray r12 = r11.f17274c
            r12.removeAt(r2)
            goto La6
        La2:
            int r2 = r2 + 1
            goto L8
        La6:
            if (r3 == 0) goto Lb1
            com.facebook.react.bridge.ReactApplicationContext r12 = r11.f17272a
            if (r12 == 0) goto Lb1
            java.lang.String r0 = "onNativeAnimatedModuleAnimationFinished"
            r12.emitDeviceEvent(r0, r3)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T6.t.z(int):void");
    }
}
