package androidx.work;

import androidx.work.b;
import i4.g;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Li4/g;", "<init>", "()V", "", "array1", "array2", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "array", "obj", "Ljava/lang/Class;", "valueClass", "c", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "", "Landroidx/work/b;", "inputs", "b", "(Ljava/util/List;)Landroidx/work/b;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ArrayCreatingInputMerger extends g {
    private final Object c(Object array, Object obj, Class valueClass) {
        int length = Array.getLength(array);
        Object newArray = Array.newInstance((Class<?>) valueClass, length + 1);
        System.arraycopy(array, 0, newArray, 0, length);
        Array.set(newArray, length, obj);
        AbstractC5504s.g(newArray, "newArray");
        return newArray;
    }

    private final Object d(Object array1, Object array2) {
        int length = Array.getLength(array1);
        int length2 = Array.getLength(array2);
        Class<?> componentType = array1.getClass().getComponentType();
        AbstractC5504s.e(componentType);
        Object newArray = Array.newInstance(componentType, length + length2);
        System.arraycopy(array1, 0, newArray, 0, length);
        System.arraycopy(array2, 0, newArray, length, length2);
        AbstractC5504s.g(newArray, "newArray");
        return newArray;
    }

    private final Object e(Object obj, Class valueClass) {
        Object newArray = Array.newInstance((Class<?>) valueClass, 1);
        Array.set(newArray, 0, obj);
        AbstractC5504s.g(newArray, "newArray");
        return newArray;
    }

    @Override // i4.g
    public b b(List inputs) throws Throwable {
        AbstractC5504s.h(inputs, "inputs");
        b.a aVar = new b.a();
        HashMap map = new HashMap();
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            Map mapL = ((b) it.next()).l();
            AbstractC5504s.g(mapL, "input.keyValueMap");
            for (Map.Entry entry : mapL.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(key);
                AbstractC5504s.g(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (AbstractC5504s.c(cls2, cls)) {
                        AbstractC5504s.g(value, "value");
                        value = d(obj, value);
                    } else {
                        if (!AbstractC5504s.c(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        value = c(obj, value, cls);
                    }
                } else if (!cls.isArray()) {
                    value = e(value, cls);
                }
                AbstractC5504s.g(value, "if (existingValue == nul…      }\n                }");
                map.put(key, value);
            }
        }
        aVar.d(map);
        b bVarA = aVar.a();
        AbstractC5504s.g(bVarA, "output.build()");
        return bVarA;
    }
}
