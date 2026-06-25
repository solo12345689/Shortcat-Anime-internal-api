.class public abstract LP0/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)LP0/b$a;
    .locals 6

    .line 1
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    new-instance v0, Ly0/a;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, p2, v4, v1, v3}, Ly0/a;-><init>(Lorg/xmlpull/v1/XmlPullParser;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    move v1, v4

    .line 14
    invoke-static {v0, p1, p0, v2}, Ly0/c;->a(Ly0/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Lx0/d$a;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    move v5, v1

    .line 19
    :goto_0
    invoke-static {p2}, Ly0/c;->d(Lorg/xmlpull/v1/XmlPullParser;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    move-object v3, p0

    .line 26
    move-object v1, p1

    .line 27
    invoke-static/range {v0 .. v5}, Ly0/c;->g(Ly0/a;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lx0/d$a;I)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v0}, Ly0/a;->a()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    or-int/2addr p0, p3

    .line 40
    new-instance p1, LP0/b$a;

    .line 41
    .line 42
    invoke-virtual {v4}, Lx0/d$a;->f()Lx0/d;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-direct {p1, p2, p0}, LP0/b$a;-><init>(Lx0/d;I)V

    .line 47
    .line 48
    .line 49
    return-object p1
.end method
