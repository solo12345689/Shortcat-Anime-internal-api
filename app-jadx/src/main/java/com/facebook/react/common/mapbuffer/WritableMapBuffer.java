package com.facebook.react.common.mapbuffer;

import android.util.SparseArray;
import com.facebook.react.common.mapbuffer.a;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;", "Lcom/facebook/react/common/mapbuffer/a;", "<init>", "()V", "", "", SubscriberAttributeKt.JSON_NAME_KEY, "Lcom/facebook/react/common/mapbuffer/a$b;", "e", "(Ljava/lang/Object;I)Lcom/facebook/react/common/mapbuffer/a$b;", "", "getKeys", "()[I", "", "getValues", "()[Ljava/lang/Object;", "", "H", "(I)Z", "getBoolean", "getInt", "(I)I", "", "getDouble", "(I)D", "", "getString", "(I)Ljava/lang/String;", "F0", "(I)Lcom/facebook/react/common/mapbuffer/a;", "", "Lcom/facebook/react/common/mapbuffer/a$c;", "iterator", "()Ljava/util/Iterator;", "Landroid/util/SparseArray;", "a", "Landroid/util/SparseArray;", "values", "getCount", "()I", "count", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WritableMapBuffer implements com.facebook.react.common.mapbuffer.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SparseArray values = new SparseArray();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a implements a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f36570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f36571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a.b f36572c;

        public a(int i10) {
            this.f36570a = i10;
            this.f36571b = WritableMapBuffer.this.values.keyAt(i10);
            Object objValueAt = WritableMapBuffer.this.values.valueAt(i10);
            AbstractC5504s.g(objValueAt, "valueAt(...)");
            this.f36572c = WritableMapBuffer.this.e(objValueAt, getKey());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public long a() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.f36570a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Long) {
                return ((Number) objValueAt).longValue();
            }
            throw new IllegalStateException(("Expected " + Long.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int b() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.f36570a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Integer) {
                return ((Number) objValueAt).intValue();
            }
            throw new IllegalStateException(("Expected " + Integer.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public double c() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.f36570a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Double) {
                return ((Number) objValueAt).doubleValue();
            }
            throw new IllegalStateException(("Expected " + Double.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public String d() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.f36570a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof String) {
                return (String) objValueAt;
            }
            throw new IllegalStateException(("Expected " + String.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public com.facebook.react.common.mapbuffer.a e() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.f36570a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof com.facebook.react.common.mapbuffer.a) {
                return (com.facebook.react.common.mapbuffer.a) objValueAt;
            }
            throw new IllegalStateException(("Expected " + com.facebook.react.common.mapbuffer.a.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public boolean f() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.f36570a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Boolean) {
                return ((Boolean) objValueAt).booleanValue();
            }
            throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int getKey() {
            return this.f36571b;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public a.b getType() {
            return this.f36572c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36574a;

        b() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a.c next() {
            WritableMapBuffer writableMapBuffer = WritableMapBuffer.this;
            int i10 = this.f36574a;
            this.f36574a = i10 + 1;
            return writableMapBuffer.new a(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36574a < WritableMapBuffer.this.values.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.b e(Object obj, int i10) {
        if (obj instanceof Boolean) {
            return a.b.f36579a;
        }
        if (obj instanceof Integer) {
            return a.b.f36580b;
        }
        if (obj instanceof Long) {
            return a.b.f36584f;
        }
        if (obj instanceof Double) {
            return a.b.f36581c;
        }
        if (obj instanceof String) {
            return a.b.f36582d;
        }
        if (obj instanceof com.facebook.react.common.mapbuffer.a) {
            return a.b.f36583e;
        }
        throw new IllegalStateException("Key " + i10 + " has value of unknown type: " + obj.getClass());
    }

    private final int[] getKeys() {
        int size = this.values.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.values.keyAt(i10);
        }
        return iArr;
    }

    private final Object[] getValues() {
        int size = this.values.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            Object objValueAt = this.values.valueAt(i10);
            AbstractC5504s.g(objValueAt, "valueAt(...)");
            objArr[i10] = objValueAt;
        }
        return objArr;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public com.facebook.react.common.mapbuffer.a F0(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof com.facebook.react.common.mapbuffer.a) {
            return (com.facebook.react.common.mapbuffer.a) obj;
        }
        throw new IllegalStateException(("Expected " + com.facebook.react.common.mapbuffer.a.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean H(int key) {
        return this.values.get(key) != null;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean getBoolean(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getCount() {
        return this.values.size();
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public double getDouble(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        throw new IllegalStateException(("Expected " + Double.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getInt(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new IllegalStateException(("Expected " + Integer.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public String getString(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalStateException(("Expected " + String.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new b();
    }
}
