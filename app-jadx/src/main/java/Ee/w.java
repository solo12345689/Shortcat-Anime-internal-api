package Ee;

import Ee.E;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class w extends y implements Oe.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f5958a;

    public w(Field member) {
        AbstractC5504s.h(member, "member");
        this.f5958a = member;
    }

    @Override // Oe.n
    public boolean I() {
        return R().isEnumConstant();
    }

    @Override // Oe.n
    public boolean N() {
        return false;
    }

    @Override // Ee.y
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Field R() {
        return this.f5958a;
    }

    @Override // Oe.n
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public E getType() {
        E.a aVar = E.f5906a;
        Type genericType = R().getGenericType();
        AbstractC5504s.g(genericType, "getGenericType(...)");
        return aVar.a(genericType);
    }
}
