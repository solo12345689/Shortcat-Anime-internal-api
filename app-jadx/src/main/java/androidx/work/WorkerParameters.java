package androidx.work;

import android.net.Network;
import i4.f;
import i4.o;
import i4.v;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p4.InterfaceC5931b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a */
    private UUID f32647a;

    /* JADX INFO: renamed from: b */
    private b f32648b;

    /* JADX INFO: renamed from: c */
    private Set f32649c;

    /* JADX INFO: renamed from: d */
    private a f32650d;

    /* JADX INFO: renamed from: e */
    private int f32651e;

    /* JADX INFO: renamed from: f */
    private Executor f32652f;

    /* JADX INFO: renamed from: g */
    private InterfaceC5931b f32653g;

    /* JADX INFO: renamed from: h */
    private v f32654h;

    /* JADX INFO: renamed from: i */
    private o f32655i;

    /* JADX INFO: renamed from: j */
    private f f32656j;

    /* JADX INFO: renamed from: k */
    private int f32657k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public List f32658a;

        /* JADX INFO: renamed from: b */
        public List f32659b;

        /* JADX INFO: renamed from: c */
        public Network f32660c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f32658a = list;
            this.f32659b = list;
        }
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i10, int i11, Executor executor, InterfaceC5931b interfaceC5931b, v vVar, o oVar, f fVar) {
        this.f32647a = uuid;
        this.f32648b = bVar;
        this.f32649c = new HashSet(collection);
        this.f32650d = aVar;
        this.f32651e = i10;
        this.f32657k = i11;
        this.f32652f = executor;
        this.f32653g = interfaceC5931b;
        this.f32654h = vVar;
        this.f32655i = oVar;
        this.f32656j = fVar;
    }

    public Executor a() {
        return this.f32652f;
    }

    public f b() {
        return this.f32656j;
    }

    public UUID c() {
        return this.f32647a;
    }

    public b d() {
        return this.f32648b;
    }

    public v e() {
        return this.f32654h;
    }
}
