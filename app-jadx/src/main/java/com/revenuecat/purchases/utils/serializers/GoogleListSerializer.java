package com.revenuecat.purchases.utils.serializers;

import Rf.b;
import Tf.d;
import Tf.e;
import Tf.k;
import Ud.AbstractC2279u;
import Uf.f;
import Wf.C2359c;
import Wf.h;
import Wf.i;
import Wf.j;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/GoogleListSerializer;", "LRf/b;", "", "", "<init>", "()V", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Ljava/util/List;)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Ljava/util/List;", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GoogleListSerializer implements b {
    public static final GoogleListSerializer INSTANCE = new GoogleListSerializer();
    private static final e descriptor = k.b("GoogleList", d.i.f17511a);

    private GoogleListSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.a
    public List<String> deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        h hVar = decoder instanceof h ? (h) decoder : null;
        if (hVar == null) {
            throw new IllegalStateException("This serializer can be used only with JSON format");
        }
        i iVar = (i) j.n(hVar.g()).get(Constants.REFERRER_API_GOOGLE);
        C2359c c2359cM = iVar != null ? j.m(iVar) : null;
        if (c2359cM == null) {
            return AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(c2359cM, 10));
        Iterator<i> it = c2359cM.iterator();
        while (it.hasNext()) {
            arrayList.add(j.o(it.next()).b());
        }
        return arrayList;
    }

    @Override // Rf.k
    public void serialize(f encoder, List<String> value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
