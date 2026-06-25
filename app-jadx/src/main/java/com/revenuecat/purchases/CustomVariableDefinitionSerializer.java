package com.revenuecat.purchases;

import com.revenuecat.purchases.UiConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer;", "LRf/b;", "Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;", "<init>", "()V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;)V", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomVariableDefinitionSerializer implements Rf.b {
    public static final CustomVariableDefinitionSerializer INSTANCE = new CustomVariableDefinitionSerializer();
    private static final Tf.e descriptor = Tf.k.c("CustomVariableDefinition", new Tf.e[0], CustomVariableDefinitionSerializer$descriptor$1.INSTANCE);

    private CustomVariableDefinitionSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    @Override // Rf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.revenuecat.purchases.UiConfig.CustomVariableDefinition deserialize(Uf.e r5) {
        /*
            r4 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.AbstractC5504s.h(r5, r0)
            boolean r0 = r5 instanceof Wf.h
            if (r0 == 0) goto La8
            Wf.h r5 = (Wf.h) r5
            Wf.i r5 = r5.g()
            Wf.C r5 = Wf.j.n(r5)
            java.lang.String r0 = "type"
            java.lang.Object r0 = r5.get(r0)
            Wf.i r0 = (Wf.i) r0
            java.lang.String r1 = "string"
            if (r0 == 0) goto L2b
            Wf.E r0 = Wf.j.o(r0)
            if (r0 == 0) goto L2b
            java.lang.String r0 = r0.b()
            if (r0 != 0) goto L2c
        L2b:
            r0 = r1
        L2c:
            java.lang.String r2 = "default_value"
            java.lang.Object r5 = r5.get(r2)
            boolean r2 = r5 instanceof Wf.E
            if (r2 == 0) goto L39
            Wf.E r5 = (Wf.E) r5
            goto L3a
        L39:
            r5 = 0
        L3a:
            if (r5 != 0) goto L44
            com.revenuecat.purchases.UiConfig$CustomVariableDefinition r5 = new com.revenuecat.purchases.UiConfig$CustomVariableDefinition
            java.lang.String r1 = ""
            r5.<init>(r0, r1)
            return r5
        L44:
            int r2 = r0.hashCode()
            r3 = -1034364087(0xffffffffc258db49, float:-54.214146)
            if (r2 == r3) goto L81
            r3 = -891985903(0xffffffffcad56011, float:-6991880.5)
            if (r2 == r3) goto L76
            r1 = 64711720(0x3db6c28, float:1.2896495E-36)
            if (r2 == r1) goto L58
            goto L89
        L58:
            java.lang.String r1 = "boolean"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L61
            goto L89
        L61:
            java.lang.Boolean r1 = Wf.j.e(r5)
            if (r1 != 0) goto La2
            java.lang.String r1 = r5.b()
            java.lang.Boolean r1 = Df.r.j1(r1)
            if (r1 != 0) goto La2
            java.lang.String r1 = r5.b()
            goto La2
        L76:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L89
            java.lang.String r1 = r5.b()
            goto La2
        L81:
            java.lang.String r1 = "number"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L8e
        L89:
            java.lang.String r1 = r5.b()
            goto La2
        L8e:
            java.lang.Double r1 = Wf.j.h(r5)
            if (r1 != 0) goto La2
            java.lang.String r1 = r5.b()
            java.lang.Double r1 = Df.r.o(r1)
            if (r1 != 0) goto La2
            java.lang.String r1 = r5.b()
        La2:
            com.revenuecat.purchases.UiConfig$CustomVariableDefinition r5 = new com.revenuecat.purchases.UiConfig$CustomVariableDefinition
            r5.<init>(r0, r1)
            return r5
        La8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CustomVariableDefinition can only be deserialized from JSON"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.CustomVariableDefinitionSerializer.deserialize(Uf.e):com.revenuecat.purchases.UiConfig$CustomVariableDefinition");
    }

    @Override // Rf.k
    public void serialize(Uf.f encoder, UiConfig.CustomVariableDefinition value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        throw new IllegalStateException("Serialization of CustomVariableDefinition is not implemented as it is not needed.");
    }
}
