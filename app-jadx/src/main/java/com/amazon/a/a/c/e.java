package com.amazon.a.a.c;

import com.amazon.a.a.c.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e<EventType extends a> implements Comparator<c<EventType>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34315a = new com.amazon.a.a.o.c("EventListenerNotificationQueue");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<c<EventType>> f34316b = new ArrayList();

    public void a(c<EventType> cVar) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34315a.a("Adding listener: " + cVar);
        }
        this.f34316b.add(cVar);
        Collections.sort(this.f34316b, this);
    }

    public void a(EventType eventtype) {
        for (c<EventType> cVar : this.f34316b) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34315a.a("Notifying listener: " + cVar);
            }
            cVar.a(eventtype);
        }
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(c<EventType> cVar, c<EventType> cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }
}
