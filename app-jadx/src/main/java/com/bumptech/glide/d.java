package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;
import o5.AbstractC5829f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: k */
    static final l f35596k = new a();

    /* JADX INFO: renamed from: a */
    private final V4.b f35597a;

    /* JADX INFO: renamed from: b */
    private final AbstractC5829f.b f35598b;

    /* JADX INFO: renamed from: c */
    private final l5.b f35599c;

    /* JADX INFO: renamed from: d */
    private final b.a f35600d;

    /* JADX INFO: renamed from: e */
    private final List f35601e;

    /* JADX INFO: renamed from: f */
    private final Map f35602f;

    /* JADX INFO: renamed from: g */
    private final U4.k f35603g;

    /* JADX INFO: renamed from: h */
    private final e f35604h;

    /* JADX INFO: renamed from: i */
    private final int f35605i;

    /* JADX INFO: renamed from: j */
    private k5.f f35606j;

    public d(Context context, V4.b bVar, AbstractC5829f.b bVar2, l5.b bVar3, b.a aVar, Map map, List list, U4.k kVar, e eVar, int i10) {
        super(context.getApplicationContext());
        this.f35597a = bVar;
        this.f35599c = bVar3;
        this.f35600d = aVar;
        this.f35601e = list;
        this.f35602f = map;
        this.f35603g = kVar;
        this.f35604h = eVar;
        this.f35605i = i10;
        this.f35598b = AbstractC5829f.a(bVar2);
    }

    public V4.b a() {
        return this.f35597a;
    }

    public List b() {
        return this.f35601e;
    }

    public synchronized k5.f c() {
        try {
            if (this.f35606j == null) {
                this.f35606j = (k5.f) this.f35600d.build().Q();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f35606j;
    }

    public l d(Class cls) {
        l lVar = (l) this.f35602f.get(cls);
        if (lVar == null) {
            for (Map.Entry entry : this.f35602f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (l) entry.getValue();
                }
            }
        }
        return lVar == null ? f35596k : lVar;
    }

    public U4.k e() {
        return this.f35603g;
    }

    public e f() {
        return this.f35604h;
    }

    public int g() {
        return this.f35605i;
    }

    public h h() {
        return (h) this.f35598b.get();
    }
}
