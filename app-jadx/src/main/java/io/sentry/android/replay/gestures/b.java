package io.sentry.android.replay.gestures;

import Ud.AbstractC2279u;
import android.view.MotionEvent;
import io.sentry.android.replay.s;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.transport.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f50295e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f50296f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f50297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f50298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f50299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f50300d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(o dateProvider) {
        AbstractC5504s.h(dateProvider, "dateProvider");
        this.f50297a = dateProvider;
        this.f50298b = new LinkedHashMap(10);
    }

    public final List a(MotionEvent event, s recorderConfig) {
        List list;
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(recorderConfig, "recorderConfig");
        int actionMasked = event.getActionMasked();
        int i10 = 10;
        int i11 = 0;
        List list2 = null;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    long currentTimeMillis = this.f50297a.getCurrentTimeMillis();
                    long j10 = this.f50300d;
                    if (j10 != 0 && j10 + ((long) 50) > currentTimeMillis) {
                        return null;
                    }
                    this.f50300d = currentTimeMillis;
                    Set<Integer> setKeySet = this.f50298b.keySet();
                    AbstractC5504s.g(setKeySet, "<get-keys>(...)");
                    for (Integer num : setKeySet) {
                        AbstractC5504s.e(num);
                        int iFindPointerIndex = event.findPointerIndex(num.intValue());
                        if (iFindPointerIndex == -1) {
                            list = list2;
                        } else {
                            if (this.f50299c == 0) {
                                this.f50299c = currentTimeMillis;
                            }
                            Object obj = this.f50298b.get(num);
                            AbstractC5504s.e(obj);
                            f.b bVar = new f.b();
                            bVar.i(event.getX(iFindPointerIndex) * recorderConfig.e());
                            bVar.j(event.getY(iFindPointerIndex) * recorderConfig.f());
                            bVar.f(i11);
                            list = list2;
                            bVar.g(currentTimeMillis - this.f50299c);
                            ((Collection) obj).add(bVar);
                        }
                        list2 = list;
                        i11 = 0;
                    }
                    List list3 = list2;
                    long j11 = currentTimeMillis - this.f50299c;
                    if (j11 <= 500) {
                        return list3;
                    }
                    ArrayList arrayList = new ArrayList(this.f50298b.size());
                    Iterator it = this.f50298b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        int iIntValue = ((Number) entry.getKey()).intValue();
                        ArrayList<f.b> arrayList2 = (ArrayList) entry.getValue();
                        if (!arrayList2.isEmpty()) {
                            f fVar = new f();
                            fVar.f(currentTimeMillis);
                            ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(arrayList2, i10));
                            for (f.b bVar2 : arrayList2) {
                                bVar2.g(bVar2.e() - j11);
                                arrayList3.add(bVar2);
                                it = it;
                            }
                            fVar.n(arrayList3);
                            fVar.m(iIntValue);
                            arrayList.add(fVar);
                            Object obj2 = this.f50298b.get(Integer.valueOf(iIntValue));
                            AbstractC5504s.e(obj2);
                            ((ArrayList) obj2).clear();
                            it = it;
                            i10 = 10;
                        }
                    }
                    this.f50299c = 0L;
                    return arrayList;
                }
                if (actionMasked == 3) {
                    this.f50298b.clear();
                    e eVar = new e();
                    eVar.f(this.f50297a.getCurrentTimeMillis());
                    eVar.u(event.getX() * recorderConfig.e());
                    eVar.v(event.getY() * recorderConfig.f());
                    eVar.q(0);
                    eVar.s(0);
                    eVar.r(e.b.TouchCancel);
                    return AbstractC2279u.e(eVar);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            int pointerId = event.getPointerId(event.getActionIndex());
            int iFindPointerIndex2 = event.findPointerIndex(pointerId);
            if (iFindPointerIndex2 == -1) {
                return null;
            }
            this.f50298b.remove(Integer.valueOf(pointerId));
            e eVar2 = new e();
            eVar2.f(this.f50297a.getCurrentTimeMillis());
            eVar2.u(event.getX(iFindPointerIndex2) * recorderConfig.e());
            eVar2.v(event.getY(iFindPointerIndex2) * recorderConfig.f());
            eVar2.q(0);
            eVar2.s(pointerId);
            eVar2.r(e.b.TouchEnd);
            return AbstractC2279u.e(eVar2);
        }
        int pointerId2 = event.getPointerId(event.getActionIndex());
        int iFindPointerIndex3 = event.findPointerIndex(pointerId2);
        if (iFindPointerIndex3 == -1) {
            return null;
        }
        this.f50298b.put(Integer.valueOf(pointerId2), new ArrayList(10));
        e eVar3 = new e();
        eVar3.f(this.f50297a.getCurrentTimeMillis());
        eVar3.u(event.getX(iFindPointerIndex3) * recorderConfig.e());
        eVar3.v(event.getY(iFindPointerIndex3) * recorderConfig.f());
        eVar3.q(0);
        eVar3.s(pointerId2);
        eVar3.r(e.b.TouchStart);
        return AbstractC2279u.e(eVar3);
    }
}
