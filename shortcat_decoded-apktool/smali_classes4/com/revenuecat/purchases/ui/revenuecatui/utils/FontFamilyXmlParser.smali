.class public final Lcom/revenuecat/purchases/ui/revenuecatui/utils/FontFamilyXmlParser;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001c\u0082\u0002\u000b\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/utils/FontFamilyXmlParser;",
        "",
        "<init>",
        "()V",
        "Landroid/content/res/XmlResourceParser;",
        "parser",
        "Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;",
        "parseFontData",
        "(Landroid/content/res/XmlResourceParser;)Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;",
        "",
        "getFontResourceId",
        "(Landroid/content/res/XmlResourceParser;)I",
        "getFontWeight",
        "LY0/H;",
        "getFontStyle-MIvY41s",
        "getFontStyle",
        "LY0/u;",
        "parse",
        "(Landroid/content/res/XmlResourceParser;)LY0/u;",
        "",
        "parseXmlData$revenuecatui_defaultsBc8Release",
        "(Landroid/content/res/XmlResourceParser;)Ljava/util/List;",
        "parseXmlData",
        "UNRECOGNIZED_VALUE",
        "I",
        "DEFAULT_FONT_WEIGHT",
        "",
        "ANDROID_NAMESPACE",
        "Ljava/lang/String;",
        "APP_NAMESPACE",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x0

.field private static final ANDROID_NAMESPACE:Ljava/lang/String; = "http://schemas.android.com/apk/res/android"

.field private static final APP_NAMESPACE:Ljava/lang/String; = "http://schemas.android.com/apk/res-auto"

.field private static final DEFAULT_FONT_WEIGHT:I = 0x190

.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/utils/FontFamilyXmlParser;

.field private static final UNRECOGNIZED_VALUE:I = -0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/utils/FontFamilyXmlParser;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/FontFamilyXmlParser;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/utils/FontFamilyXmlParser;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/utils/FontFamilyXmlParser;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getFontResourceId(Landroid/content/res/XmlResourceParser;)I
    .locals 3

    .line 1
    const-string v0, "http://schemas.android.com/apk/res-auto"

    .line 2
    .line 3
    const-string v1, "font"

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    invoke-interface {p1, v0, v1, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    const-string v0, "http://schemas.android.com/apk/res/android"

    .line 13
    .line 14
    invoke-interface {p1, v0, v1, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    return v0
.end method

.method private final getFontStyle-MIvY41s(Landroid/content/res/XmlResourceParser;)I
    .locals 2

    .line 1
    const-string v0, "http://schemas.android.com/apk/res-auto"

    .line 2
    .line 3
    const-string v1, "fontStyle"

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "http://schemas.android.com/apk/res/android"

    .line 12
    .line 13
    invoke-interface {p1, v0, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    const-string p1, "italic"

    .line 18
    .line 19
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    sget-object p1, LY0/H;->b:LY0/H$a;

    .line 26
    .line 27
    invoke-virtual {p1}, LY0/H$a;->a()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :cond_1
    sget-object p1, LY0/H;->b:LY0/H$a;

    .line 33
    .line 34
    invoke-virtual {p1}, LY0/H$a;->b()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1
.end method

.method private final getFontWeight(Landroid/content/res/XmlResourceParser;)I
    .locals 4

    .line 1
    const-string v0, "http://schemas.android.com/apk/res-auto"

    .line 2
    .line 3
    const-string v1, "fontWeight"

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    invoke-interface {p1, v0, v1, v2}, Landroid/util/AttributeSet;->getAttributeIntValue(Ljava/lang/String;Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v3, 0x190

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    const-string v0, "http://schemas.android.com/apk/res/android"

    .line 15
    .line 16
    invoke-interface {p1, v0, v1, v3}, Landroid/util/AttributeSet;->getAttributeIntValue(Ljava/lang/String;Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    :cond_0
    if-ne v0, v2, :cond_1

    .line 21
    .line 22
    return v3

    .line 23
    :cond_1
    return v0
.end method

.method private final parseFontData(Landroid/content/res/XmlResourceParser;)Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/FontFamilyXmlParser;->getFontResourceId(Landroid/content/res/XmlResourceParser;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-object v2

    .line 10
    :cond_0
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/FontFamilyXmlParser;->getFontWeight(Landroid/content/res/XmlResourceParser;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/FontFamilyXmlParser;->getFontStyle-MIvY41s(Landroid/content/res/XmlResourceParser;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;

    .line 19
    .line 20
    invoke-direct {v3, v0, v1, p1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    .line 23
    return-object v3
.end method


# virtual methods
.method public final parse(Landroid/content/res/XmlResourceParser;)LY0/u;
    .locals 8

    .line 1
    const-string v0, "parser"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/FontFamilyXmlParser;->parseXmlData$revenuecatui_defaultsBc8Release(Landroid/content/res/XmlResourceParser;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v1, 0xa

    .line 19
    .line 20
    invoke-static {p1, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;->component1()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;->component2()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;->component3-_-LCdwA()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    move v1, v3

    .line 56
    new-instance v3, LY0/L;

    .line 57
    .line 58
    invoke-direct {v3, v1}, LY0/L;-><init>(I)V

    .line 59
    .line 60
    .line 61
    const/16 v6, 0x8

    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v5, 0x0

    .line 65
    invoke-static/range {v2 .. v7}, LY0/B;->b(ILY0/L;IIILjava/lang/Object;)LY0/t;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-static {v0}, LY0/v;->b(Ljava/util/List;)LY0/u;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :cond_1
    const/4 p1, 0x0

    .line 79
    return-object p1
.end method

.method public final parseXmlData$revenuecatui_defaultsBc8Release(Landroid/content/res/XmlResourceParser;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/XmlResourceParser;",
            ")",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "parser"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    :goto_0
    const/4 v2, 0x1

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "font"

    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/FontFamilyXmlParser;->parseFontData(Landroid/content/res/XmlResourceParser;)Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-object v0
.end method
