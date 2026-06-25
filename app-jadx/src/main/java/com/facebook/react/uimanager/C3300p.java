package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.C3286c0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.s;
import com.facebook.react.uimanager.events.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.facebook.react.uimanager.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3300p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f37797j = {0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f37798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f37799b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ViewGroup f37806i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f37801d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37802e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f37803f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37804g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f37805h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f37800c = new HashMap();

    public C3300p(ViewGroup viewGroup) {
        this.f37806i = viewGroup;
    }

    private MotionEvent a(View view, MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        this.f37806i.getLocationOnScreen(new int[2]);
        motionEventObtain.setLocation(motionEvent.getRawX() - r0[0], motionEvent.getRawY() - r0[1]);
        return motionEventObtain;
    }

    private s.b b(int i10, MotionEvent motionEvent) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
            float[] fArr = new float[2];
            float[] fArr2 = {motionEvent.getX(i11), motionEvent.getY(i11)};
            List listB = C3286c0.b(fArr2[0], fArr2[1], this.f37806i, fArr);
            int pointerId = motionEvent.getPointerId(i11);
            map.put(Integer.valueOf(pointerId), fArr);
            map2.put(Integer.valueOf(pointerId), listB);
            map3.put(Integer.valueOf(pointerId), fArr2);
            map4.put(Integer.valueOf(pointerId), e(fArr2));
        }
        return new s.b(this.f37803f, i10, this.f37805h, f0.f(this.f37806i), map, map2, map3, map4, this.f37801d);
    }

    private void c(View view, s.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        Q6.a.b(this.f37802e == -1, "Expected to not have already sent a cancel for this gesture");
        List list = (List) bVar.c().get(Integer.valueOf(bVar.a()));
        if (list.isEmpty() || view == null) {
            return;
        }
        if (m(list, t.a.f37648a, t.a.f37649b)) {
            int iB = ((C3286c0.b) list.get(0)).b();
            int[] iArrH = h(view);
            ((EventDispatcher) Q6.a.c(eventDispatcher)).d(com.facebook.react.uimanager.events.s.n("topPointerCancel", iB, n(bVar, iArrH[0], iArrH[1]), motionEvent));
        }
        l();
        this.f37803f = -1;
    }

    private static void d(String str, s.b bVar, MotionEvent motionEvent, List list, EventDispatcher eventDispatcher) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eventDispatcher.d(com.facebook.react.uimanager.events.s.n(str, ((C3286c0.b) it.next()).b(), bVar, motionEvent));
        }
    }

    private float[] e(float[] fArr) {
        this.f37806i.getLocationOnScreen(f37797j);
        return new float[]{fArr[0] + r1[0], fArr[1] + r1[1]};
    }

    private static List f(List list, t.a aVar, t.a aVar2, boolean z10) {
        ArrayList arrayList = new ArrayList(list);
        if (!z10) {
            boolean z11 = false;
            for (int size = list.size() - 1; size >= 0; size--) {
                View viewA = ((C3286c0.b) list.get(size)).a();
                if (!z11 && !com.facebook.react.uimanager.events.t.h(viewA, aVar2) && !com.facebook.react.uimanager.events.t.h(viewA, aVar)) {
                    arrayList.remove(size);
                } else if (!z11 && com.facebook.react.uimanager.events.t.h(viewA, aVar2)) {
                    z11 = true;
                }
            }
        }
        return arrayList;
    }

    private static List g(List list, List list2) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list2.isEmpty()) {
            return new ArrayList();
        }
        HashSet hashSet = new HashSet(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C3286c0.b bVar = (C3286c0.b) it.next();
            if (hashSet.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private int[] h(View view) {
        Rect rect = new Rect(0, 0, 1, 1);
        this.f37806i.offsetDescendantRectToMyCoords(view, rect);
        return new int[]{rect.top, rect.left};
    }

    private short i() {
        return (short) (65535 & this.f37804g);
    }

    private void j(int i10, s.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        int iA = bVar.a();
        List arrayList = i10 != -1 ? (List) bVar.c().get(Integer.valueOf(iA)) : new ArrayList();
        Map map = this.f37798a;
        List arrayList2 = (map == null || !map.containsKey(Integer.valueOf(iA))) ? new ArrayList() : (List) this.f37798a.get(Integer.valueOf(iA));
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (i11 < Math.min(arrayList.size(), arrayList2.size()) && ((C3286c0.b) arrayList.get((arrayList.size() - 1) - i11)).equals(arrayList2.get((arrayList2.size() - 1) - i11))) {
            View viewA = ((C3286c0.b) arrayList.get((arrayList.size() - 1) - i11)).a();
            if (!z10 && com.facebook.react.uimanager.events.t.h(viewA, t.a.f37655h)) {
                z10 = true;
            }
            if (!z11 && com.facebook.react.uimanager.events.t.h(viewA, t.a.f37657j)) {
                z11 = true;
            }
            i11++;
        }
        if (i11 < Math.max(arrayList.size(), arrayList2.size())) {
            l();
            if (arrayList2.size() > 0) {
                int iB = ((C3286c0.b) arrayList2.get(0)).b();
                if (m(arrayList2, t.a.f37662o, t.a.f37663p)) {
                    eventDispatcher.d(com.facebook.react.uimanager.events.s.n("topPointerOut", iB, bVar, motionEvent));
                }
                List listF = f(arrayList2.subList(0, arrayList2.size() - i11), t.a.f37656i, t.a.f37657j, z11);
                if (listF.size() > 0) {
                    d("topPointerLeave", bVar, motionEvent, listF, eventDispatcher);
                }
            }
            if (m(arrayList, t.a.f37664q, t.a.f37665r)) {
                eventDispatcher.d(com.facebook.react.uimanager.events.s.n("topPointerOver", i10, bVar, motionEvent));
            }
            List listF2 = f(arrayList.subList(0, arrayList.size() - i11), t.a.f37654g, t.a.f37655h, z10);
            if (listF2.size() > 0) {
                Collections.reverse(listF2);
                d("topPointerEnter", bVar, motionEvent, listF2, eventDispatcher);
            }
        }
        HashMap map2 = new HashMap(bVar.c());
        if (i10 == -1) {
            map2.remove(Integer.valueOf(iA));
        }
        this.f37798a = map2;
    }

    private void l() {
        this.f37804g = (this.f37804g + 1) % Integer.MAX_VALUE;
    }

    private static boolean m(List list, t.a aVar, t.a aVar2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3286c0.b bVar = (C3286c0.b) it.next();
            if (com.facebook.react.uimanager.events.t.h(bVar.a(), aVar) || com.facebook.react.uimanager.events.t.h(bVar.a(), aVar2)) {
                return true;
            }
        }
        return false;
    }

    private s.b n(s.b bVar, float f10, float f11) {
        HashMap map = new HashMap(bVar.g());
        HashMap map2 = new HashMap(bVar.b());
        HashMap map3 = new HashMap(bVar.i());
        float[] fArr = {f10, f11};
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((Map.Entry) it.next()).setValue(fArr);
        }
        float[] fArr2 = {0.0f, 0.0f};
        Iterator it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            ((Map.Entry) it2.next()).setValue(fArr2);
        }
        float[] fArrE = e(fArr);
        Iterator it3 = map3.entrySet().iterator();
        while (it3.hasNext()) {
            ((Map.Entry) it3.next()).setValue(fArrE);
        }
        return new s.b(bVar.h(), bVar.a(), bVar.f(), bVar.j(), map, new HashMap(bVar.c()), map2, map3, new HashSet(bVar.e()));
    }

    private void q(int i10, s.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        List list = (List) bVar.c().get(Integer.valueOf(bVar.a()));
        l();
        if (!this.f37801d.contains(Integer.valueOf(bVar.a()))) {
            if (m(list, t.a.f37664q, t.a.f37665r)) {
                eventDispatcher.d(com.facebook.react.uimanager.events.s.n("topPointerOver", i10, bVar, motionEvent));
            }
            List listF = f(list, t.a.f37654g, t.a.f37655h, false);
            Collections.reverse(listF);
            d("topPointerEnter", bVar, motionEvent, listF, eventDispatcher);
        }
        if (m(list, t.a.f37650c, t.a.f37651d)) {
            this.f37800c.put(Integer.valueOf(bVar.a()), new ArrayList(list));
        }
        if (m(list, t.a.f37652e, t.a.f37653f)) {
            eventDispatcher.d(com.facebook.react.uimanager.events.s.n("topPointerDown", i10, bVar, motionEvent));
        }
    }

    private void r(int i10, s.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (m((List) bVar.c().get(Integer.valueOf(bVar.a())), t.a.f37658k, t.a.f37659l)) {
            eventDispatcher.d(com.facebook.react.uimanager.events.s.o("topPointerMove", i10, bVar, motionEvent, i()));
        }
    }

    private void s(int i10, s.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        int iA = bVar.a();
        List list = (List) bVar.c().get(Integer.valueOf(iA));
        if (m(list, t.a.f37660m, t.a.f37661n)) {
            eventDispatcher.d(com.facebook.react.uimanager.events.s.n("topPointerUp", i10, bVar, motionEvent));
        }
        if (!this.f37801d.contains(Integer.valueOf(iA))) {
            if (m(list, t.a.f37662o, t.a.f37663p)) {
                eventDispatcher.d(com.facebook.react.uimanager.events.s.n("topPointerOut", i10, bVar, motionEvent));
            }
            d("topPointerLeave", bVar, motionEvent, f(list, t.a.f37656i, t.a.f37657j, false), eventDispatcher);
        }
        List list2 = (List) this.f37800c.remove(Integer.valueOf(iA));
        if (list2 != null && m(list, t.a.f37650c, t.a.f37651d)) {
            List listG = g(list2, list);
            if (!listG.isEmpty()) {
                eventDispatcher.d(com.facebook.react.uimanager.events.s.n("topClick", ((C3286c0.b) listG.get(0)).b(), bVar, motionEvent));
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            this.f37803f = -1;
        }
        this.f37801d.remove(Integer.valueOf(iA));
    }

    private static boolean t(float[] fArr, float[] fArr2) {
        return Math.abs(fArr2[0] - fArr[0]) > 0.1f || Math.abs(fArr2[1] - fArr[1]) > 0.1f;
    }

    public void k(MotionEvent motionEvent, EventDispatcher eventDispatcher, boolean z10) {
        int iB;
        View viewA;
        if (this.f37802e != -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 10 || motionEvent.getButtonState() == 0) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (actionMasked == 0) {
                this.f37803f = motionEvent.getPointerId(0);
            } else if (actionMasked == 7) {
                this.f37801d.add(Integer.valueOf(pointerId));
            }
            s.b bVarB = b(pointerId, motionEvent);
            boolean z11 = z10 && actionMasked == 10;
            if (z11) {
                Map map = this.f37798a;
                List list = map != null ? (List) map.get(Integer.valueOf(bVarB.a())) : null;
                if (list == null || list.isEmpty()) {
                    return;
                }
                C3286c0.b bVar = (C3286c0.b) list.get(list.size() - 1);
                iB = bVar.b();
                viewA = bVar.a();
                bVarB.c().put(Integer.valueOf(pointerId), new ArrayList());
            } else {
                List list2 = (List) bVarB.c().get(Integer.valueOf(pointerId));
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                C3286c0.b bVar2 = (C3286c0.b) list2.get(0);
                iB = bVar2.b();
                viewA = bVar2.a();
            }
            j(iB, bVarB, motionEvent, eventDispatcher);
            switch (actionMasked) {
                case 0:
                case 5:
                    q(iB, bVarB, motionEvent, eventDispatcher);
                    break;
                case 1:
                case 6:
                    l();
                    s(iB, bVarB, motionEvent, eventDispatcher);
                    break;
                case 2:
                    r(iB, bVarB, motionEvent, eventDispatcher);
                    break;
                case 3:
                    c(viewA, bVarB, motionEvent, eventDispatcher);
                    j(-1, bVarB, motionEvent, eventDispatcher);
                    break;
                case 4:
                case 8:
                default:
                    AbstractC7283a.I("ReactNative", "Motion Event was ignored. Action=" + actionMasked + " Target=" + iB);
                    return;
                case 7:
                    float[] fArr = (float[]) bVarB.b().get(Integer.valueOf(pointerId));
                    Map map2 = this.f37799b;
                    if (!t(fArr, (map2 == null || !map2.containsKey(Integer.valueOf(pointerId))) ? new float[]{0.0f, 0.0f} : (float[]) this.f37799b.get(Integer.valueOf(pointerId)))) {
                        return;
                    } else {
                        r(iB, bVarB, motionEvent, eventDispatcher);
                    }
                    break;
                case 9:
                    return;
                case 10:
                    if (z11) {
                        r(iB, bVarB, motionEvent, eventDispatcher);
                    }
                    break;
            }
            this.f37799b = new HashMap(bVarB.b());
            this.f37805h = motionEvent.getButtonState();
            this.f37801d.retainAll(this.f37799b.keySet());
        }
    }

    public void o() {
        this.f37802e = -1;
    }

    public void p(View view, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.f37802e != -1 || view == null) {
            return;
        }
        MotionEvent motionEventA = a(view, motionEvent);
        motionEventA.setAction(3);
        k(motionEventA, eventDispatcher, false);
        this.f37802e = view.getId();
    }
}
