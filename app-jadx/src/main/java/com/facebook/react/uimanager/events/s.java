package com.facebook.react.uimanager.events;

import Td.AbstractC2163n;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3286c0;
import com.facebook.react.uimanager.events.d;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends d {

    /* JADX INFO: renamed from: g */
    public static final a f37629g = new a(null);

    /* JADX INFO: renamed from: h */
    private static final String f37630h;

    /* JADX INFO: renamed from: i */
    private static final K1.e f37631i;

    /* JADX INFO: renamed from: a */
    private MotionEvent f37632a;

    /* JADX INFO: renamed from: b */
    private String f37633b;

    /* JADX INFO: renamed from: c */
    private short f37634c;

    /* JADX INFO: renamed from: d */
    private List f37635d;

    /* JADX INFO: renamed from: e */
    private b f37636e;

    /* JADX INFO: renamed from: f */
    private final Lazy f37637f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a(String eventName, int i10, b eventState, MotionEvent motionEvent) {
            AbstractC5504s.h(eventName, "eventName");
            AbstractC5504s.h(eventState, "eventState");
            s sVar = (s) s.f37631i.b();
            if (sVar == null) {
                sVar = new s(null);
            }
            s sVar2 = sVar;
            Object objC = Q6.a.c(motionEvent);
            AbstractC5504s.g(objC, "assertNotNull(...)");
            sVar2.l(eventName, i10, eventState, (MotionEvent) objC, (short) 0);
            return sVar2;
        }

        public final s b(String eventName, int i10, b eventState, MotionEvent motionEvent, short s10) {
            AbstractC5504s.h(eventName, "eventName");
            AbstractC5504s.h(eventState, "eventState");
            s sVar = (s) s.f37631i.b();
            if (sVar == null) {
                sVar = new s(null);
            }
            s sVar2 = sVar;
            Object objC = Q6.a.c(motionEvent);
            AbstractC5504s.g(objC, "assertNotNull(...)");
            sVar2.l(eventName, i10, eventState, (MotionEvent) objC, s10);
            return sVar2;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final int f37638a;

        /* JADX INFO: renamed from: b */
        private final int f37639b;

        /* JADX INFO: renamed from: c */
        private final int f37640c;

        /* JADX INFO: renamed from: d */
        private final int f37641d;

        /* JADX INFO: renamed from: e */
        private final Map f37642e;

        /* JADX INFO: renamed from: f */
        private final Map f37643f;

        /* JADX INFO: renamed from: g */
        private final Map f37644g;

        /* JADX INFO: renamed from: h */
        private final Map f37645h;

        /* JADX INFO: renamed from: i */
        private final Set f37646i;

        public b(int i10, int i11, int i12, int i13, Map offsetByPointerId, Map hitPathByPointerId, Map eventCoordinatesByPointerId, Map screenCoordinatesByPointerId, Set hoveringPointerIds) {
            AbstractC5504s.h(offsetByPointerId, "offsetByPointerId");
            AbstractC5504s.h(hitPathByPointerId, "hitPathByPointerId");
            AbstractC5504s.h(eventCoordinatesByPointerId, "eventCoordinatesByPointerId");
            AbstractC5504s.h(screenCoordinatesByPointerId, "screenCoordinatesByPointerId");
            AbstractC5504s.h(hoveringPointerIds, "hoveringPointerIds");
            this.f37638a = i10;
            this.f37639b = i11;
            this.f37640c = i12;
            this.f37641d = i13;
            this.f37642e = offsetByPointerId;
            this.f37643f = hitPathByPointerId;
            this.f37644g = eventCoordinatesByPointerId;
            this.f37645h = screenCoordinatesByPointerId;
            this.f37646i = new HashSet(hoveringPointerIds);
        }

        public final int a() {
            return this.f37639b;
        }

        public final Map b() {
            return this.f37644g;
        }

        public final Map c() {
            return this.f37643f;
        }

        public final List d() {
            Object obj = this.f37643f.get(Integer.valueOf(this.f37639b));
            if (obj != null) {
                return (List) obj;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final Set e() {
            return this.f37646i;
        }

        public final int f() {
            return this.f37640c;
        }

        public final Map g() {
            return this.f37642e;
        }

        public final int h() {
            return this.f37638a;
        }

        public final Map i() {
            return this.f37645h;
        }

        public final int j() {
            return this.f37641d;
        }

        public final boolean k(int i10) {
            return this.f37646i.contains(Integer.valueOf(i10));
        }
    }

    static {
        String simpleName = s.class.getSimpleName();
        AbstractC5504s.g(simpleName, "getSimpleName(...)");
        f37630h = simpleName;
        f37631i = new K1.e(6);
    }

    public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void f(WritableMap writableMap, int i10) {
        writableMap.putBoolean("ctrlKey", (i10 & 4096) != 0);
        writableMap.putBoolean("shiftKey", (i10 & 1) != 0);
        writableMap.putBoolean("altKey", (i10 & 2) != 0);
        writableMap.putBoolean("metaKey", (i10 & 65536) != 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0021, code lost:
    
        if (r1.equals("topPointerOut") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x002a, code lost:
    
        if (r1.equals("topPointerCancel") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0033, code lost:
    
        if (r1.equals("topClick") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x003c, code lost:
    
        if (r1.equals("topPointerUp") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0045, code lost:
    
        if (r1.equals("topPointerOver") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x004e, code lost:
    
        if (r1.equals("topPointerMove") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0055, code lost:
    
        return i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x005c, code lost:
    
        if (r1.equals("topPointerDown") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0065, code lost:
    
        if (r1.equals("topPointerLeave") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x006e, code lost:
    
        if (r1.equals("topPointerEnter") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0079, code lost:
    
        return Ud.AbstractC2279u.e(h(r0));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List g() {
        /*
            r4 = this;
            android.view.MotionEvent r0 = r4.f37632a
            if (r0 == 0) goto L7a
            int r0 = r0.getActionIndex()
            java.lang.String r1 = r4.f37633b
            r2 = 0
            if (r1 != 0) goto L13
            java.lang.String r1 = "_eventName"
            kotlin.jvm.internal.AbstractC5504s.u(r1)
            r1 = r2
        L13:
            int r3 = r1.hashCode()
            switch(r3) {
                case -1786514288: goto L68;
                case -1780335505: goto L5f;
                case -1304584214: goto L56;
                case -1304316135: goto L48;
                case -1304250340: goto L3f;
                case -1065042973: goto L36;
                case -992108237: goto L2d;
                case 383186882: goto L24;
                case 1343400710: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L70
        L1b:
            java.lang.String r3 = "topPointerOut"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L24:
            java.lang.String r0 = "topPointerCancel"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L51
            goto L70
        L2d:
            java.lang.String r3 = "topClick"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L36:
            java.lang.String r3 = "topPointerUp"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L3f:
            java.lang.String r3 = "topPointerOver"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L48:
            java.lang.String r0 = "topPointerMove"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L51
            goto L70
        L51:
            java.util.List r0 = r4.i()
            return r0
        L56:
            java.lang.String r3 = "topPointerDown"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L5f:
            java.lang.String r3 = "topPointerLeave"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L68:
            java.lang.String r3 = "topPointerEnter"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
        L70:
            return r2
        L71:
            com.facebook.react.bridge.WritableMap r0 = r4.h(r0)
            java.util.List r0 = Ud.AbstractC2279u.e(r0)
            return r0
        L7a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.s.g():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.react.bridge.WritableMap h(int r20) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.s.h(int):com.facebook.react.bridge.WritableMap");
    }

    private final List i() {
        ArrayList arrayList = new ArrayList();
        MotionEvent motionEvent = this.f37632a;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            arrayList.add(h(i10));
        }
        return arrayList;
    }

    public static final d.b j(final s sVar) {
        return new d.b() { // from class: com.facebook.react.uimanager.events.r
            @Override // com.facebook.react.uimanager.events.d.b
            public final boolean a(int i10, String str) {
                return s.k(this.f37628a, i10, str);
            }
        };
    }

    public static final boolean k(s sVar, int i10, String eventName) {
        AbstractC5504s.h(eventName, "eventName");
        String str = sVar.f37633b;
        b bVar = null;
        if (str == null) {
            AbstractC5504s.u("_eventName");
            str = null;
        }
        if (!AbstractC5504s.c(eventName, str)) {
            return false;
        }
        if (!t.f(eventName)) {
            return sVar.getViewTag() == i10;
        }
        b bVar2 = sVar.f37636e;
        if (bVar2 == null) {
            AbstractC5504s.u("eventState");
        } else {
            bVar = bVar2;
        }
        Iterator it = bVar.d().iterator();
        while (it.hasNext()) {
            if (((C3286c0.b) it.next()).b() == i10) {
                return true;
            }
        }
        return false;
    }

    public final void l(String str, int i10, b bVar, MotionEvent motionEvent, short s10) {
        super.init(bVar.j(), i10, motionEvent.getEventTime());
        this.f37633b = str;
        this.f37632a = MotionEvent.obtain(motionEvent);
        this.f37634c = s10;
        this.f37636e = bVar;
    }

    private final boolean m() {
        String str = this.f37633b;
        if (str == null) {
            AbstractC5504s.u("_eventName");
            str = null;
        }
        return AbstractC5504s.c(str, "topClick");
    }

    public static final s n(String str, int i10, b bVar, MotionEvent motionEvent) {
        return f37629g.a(str, i10, bVar, motionEvent);
    }

    public static final s o(String str, int i10, b bVar, MotionEvent motionEvent, short s10) {
        return f37629g.b(str, i10, bVar, motionEvent, s10);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        AbstractC5504s.h(rctEventEmitter, "rctEventEmitter");
        if (this.f37632a == null) {
            ReactSoftExceptionLogger.logSoftException(f37630h, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"));
            return;
        }
        if (this.f37635d == null) {
            this.f37635d = g();
        }
        List<WritableMap> list = this.f37635d;
        if (list == null) {
            return;
        }
        boolean z10 = list.size() > 1;
        for (WritableMap writableMapCopy : list) {
            if (z10) {
                writableMapCopy = writableMapCopy.copy();
            }
            int viewTag = getViewTag();
            String str = this.f37633b;
            if (str == null) {
                AbstractC5504s.u("_eventName");
                str = null;
            }
            rctEventEmitter.receiveEvent(viewTag, str, writableMapCopy);
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatchModern(RCTModernEventEmitter rctEventEmitter) {
        AbstractC5504s.h(rctEventEmitter, "rctEventEmitter");
        if (this.f37632a == null) {
            ReactSoftExceptionLogger.logSoftException(f37630h, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"));
            return;
        }
        if (this.f37635d == null) {
            this.f37635d = g();
        }
        List<WritableMap> list = this.f37635d;
        if (list == null) {
            return;
        }
        if (list == null) {
            throw new IllegalStateException("Required value was null.");
        }
        boolean z10 = list.size() > 1;
        for (WritableMap writableMapCopy : list) {
            if (z10) {
                writableMapCopy = writableMapCopy.copy();
            }
            WritableMap writableMap = writableMapCopy;
            int surfaceId = getSurfaceId();
            int viewTag = getViewTag();
            String str = this.f37633b;
            String str2 = null;
            if (str == null) {
                AbstractC5504s.u("_eventName");
                str = null;
            }
            short s10 = this.f37634c;
            boolean z11 = s10 != -1;
            String str3 = this.f37633b;
            if (str3 == null) {
                AbstractC5504s.u("_eventName");
            } else {
                str2 = str3;
            }
            rctEventEmitter.receiveEvent(surfaceId, viewTag, str, z11, s10, writableMap, t.c(str2));
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f37634c;
    }

    @Override // com.facebook.react.uimanager.events.d
    public d.b getEventAnimationDriverMatchSpec() {
        return (d.b) this.f37637f.getValue();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        String str = this.f37633b;
        if (str != null) {
            return str;
        }
        AbstractC5504s.u("_eventName");
        return null;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        this.f37635d = null;
        MotionEvent motionEvent = this.f37632a;
        this.f37632a = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            f37631i.a(this);
        } catch (IllegalStateException e10) {
            ReactSoftExceptionLogger.logSoftException(f37630h, e10);
        }
    }

    private s() {
        this.f37634c = (short) -1;
        this.f37637f = AbstractC2163n.a(Td.q.f17463c, new InterfaceC5082a() { // from class: com.facebook.react.uimanager.events.q
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return s.j(this.f37627a);
            }
        });
    }
}
