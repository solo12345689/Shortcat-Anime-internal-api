package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Rf.j;
import Tf.d;
import Tf.e;
import Tf.k;
import Uf.f;
import Wf.E;
import Wf.h;
import Wf.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/FontSizeSerializer;", "LRf/b;", "", "<init>", "()V", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;I)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Ljava/lang/Integer;", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FontSizeSerializer implements b {
    public static final FontSizeSerializer INSTANCE = new FontSizeSerializer();
    private static final e descriptor = k.b("FontSize", d.f.f17508a);

    private FontSizeSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(f fVar, Object obj) {
        serialize(fVar, ((Number) obj).intValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // Rf.a
    public Integer deserialize(Uf.e decoder) {
        int iK;
        AbstractC5504s.h(decoder, "decoder");
        h hVar = decoder instanceof h ? (h) decoder : null;
        if (hVar == null) {
            throw new j("Expected font_size to be part of a JSON object");
        }
        i iVarG = hVar.g();
        E e10 = iVarG instanceof E ? (E) iVarG : null;
        if (e10 == null) {
            throw new j("Expected font_size to be a JsonPrimitive");
        }
        if (e10.d()) {
            String strB = e10.b();
            switch (strB.hashCode()) {
                case -1383701233:
                    if (strB.equals("body_l")) {
                        iK = 17;
                        break;
                    }
                    throw new j("Unknown font size name: " + strB);
                case -1383701232:
                    if (strB.equals("body_m")) {
                        iK = 15;
                        break;
                    }
                    throw new j("Unknown font size name: " + strB);
                case -1383701226:
                    if (strB.equals("body_s")) {
                        iK = 13;
                        break;
                    }
                    throw new j("Unknown font size name: " + strB);
                case -209710737:
                    if (strB.equals("heading_l")) {
                        iK = 28;
                        break;
                    }
                    throw new j("Unknown font size name: " + strB);
                case -209710736:
                    if (strB.equals("heading_m")) {
                        iK = 24;
                        break;
                    }
                    throw new j("Unknown font size name: " + strB);
                case -209710730:
                    if (strB.equals("heading_s")) {
                        iK = 20;
                        break;
                    }
                    throw new j("Unknown font size name: " + strB);
                case 54935217:
                    if (strB.equals("body_xl")) {
                        iK = 18;
                        break;
                    }
                    throw new j("Unknown font size name: " + strB);
                case 331460015:
                    if (strB.equals("heading_xxl")) {
                        iK = 40;
                        break;
                    }
                    throw new j("Unknown font size name: " + strB);
                case 2088902225:
                    if (strB.equals("heading_xl")) {
                        iK = 34;
                        break;
                    }
                    throw new j("Unknown font size name: " + strB);
                case 2088902232:
                    if (strB.equals("heading_xs")) {
                        iK = 16;
                        break;
                    }
                    throw new j("Unknown font size name: " + strB);
                default:
                    throw new j("Unknown font size name: " + strB);
            }
        }
        iK = Wf.j.k(e10);
        return Integer.valueOf(iK);
    }

    public void serialize(f encoder, int value) {
        AbstractC5504s.h(encoder, "encoder");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.");
    }
}
