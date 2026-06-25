package com.amazon.c.a.a;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34859a = String.format("A valid instance of %s is required to have at least one non-blank ID, either developerId or certificateId, and at least one non-blank name, either developerName or commonName.", e.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f34860b = String.format("A valid instance of %s is required to have a certificate ID.", e.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f34864f;

    public static String a() {
        return f34859a;
    }

    public static String b() {
        return f34860b;
    }

    public boolean c() {
        return (StringUtils.isBlank(e()) || StringUtils.isBlank(f())) ? false : true;
    }

    public boolean d() {
        return !StringUtils.isBlank(e());
    }

    public String e() {
        return StringUtils.isBlank(this.f34863e) ? this.f34861c : this.f34863e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return new EqualsBuilder().append(this.f34863e, eVar.f34863e).append(this.f34864f, eVar.f34864f).append(this.f34861c, eVar.f34861c).append(this.f34862d, eVar.f34862d).isEquals();
    }

    public String f() {
        return StringUtils.isBlank(this.f34864f) ? this.f34862d : this.f34864f;
    }

    public String g() {
        return this.f34861c;
    }

    public String h() {
        return this.f34862d;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(this.f34863e).append(this.f34864f).append(this.f34861c).append(this.f34862d).toHashCode();
    }

    public String i() {
        return this.f34863e;
    }

    public String j() {
        return this.f34864f;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public e a(String str) {
        this.f34861c = str;
        return this;
    }

    public void b(String str) {
        this.f34861c = str;
    }

    public e c(String str) {
        this.f34862d = str;
        return this;
    }

    public void d(String str) {
        this.f34862d = str;
    }

    public e g(String str) {
        this.f34864f = str;
        return this;
    }

    public void h(String str) {
        this.f34864f = str;
    }

    public e e(String str) {
        this.f34863e = str;
        return this;
    }

    public void f(String str) {
        this.f34863e = str;
    }
}
