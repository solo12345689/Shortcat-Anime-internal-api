package com.amazon.a.a.o.c.a;

import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f extends ObjectInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f34722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f34723b;

    public f(InputStream inputStream) {
        super(inputStream);
        this.f34722a = new ArrayList();
        this.f34723b = new ArrayList();
    }

    private void b(String str) throws InvalidClassException {
        Iterator<a> it = this.f34723b.iterator();
        while (it.hasNext()) {
            if (it.next().a(str)) {
                a(str);
            }
        }
        Iterator<a> it2 = this.f34722a.iterator();
        while (it2.hasNext()) {
            if (it2.next().a(str)) {
                return;
            }
        }
        a(str);
    }

    protected void a(String str) throws InvalidClassException {
        throw new InvalidClassException("Class name not accepted: " + str);
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws InvalidClassException {
        b(objectStreamClass.getName());
        return super.resolveClass(objectStreamClass);
    }

    public f a(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.f34722a.add(new c(cls.getName()));
        }
        return this;
    }

    public f a(String... strArr) {
        for (String str : strArr) {
            this.f34722a.add(new g(str));
        }
        return this;
    }

    public f a(Pattern pattern) {
        this.f34722a.add(new e(pattern));
        return this;
    }

    public f a(a aVar) {
        this.f34722a.add(aVar);
        return this;
    }

    public f b(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.f34723b.add(new c(cls.getName()));
        }
        return this;
    }

    public f b(String... strArr) {
        for (String str : strArr) {
            this.f34723b.add(new g(str));
        }
        return this;
    }

    public f b(Pattern pattern) {
        this.f34723b.add(new e(pattern));
        return this;
    }

    public f b(a aVar) {
        this.f34723b.add(aVar);
        return this;
    }
}
