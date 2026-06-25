.class public final Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/UiConfig$AppConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FontsConfig"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$$serializer;,
        Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$Companion;,
        Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u00172\u00020\u0001:\u0003\u0018\u0017\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u00c1\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;",
        "",
        "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;",
        "android",
        "<init>",
        "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;)V",
        "",
        "seen1",
        "LVf/t0;",
        "serializationConstructorMarker",
        "(ILcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;LVf/t0;)V",
        "self",
        "LUf/d;",
        "output",
        "LTf/e;",
        "serialDesc",
        "LTd/L;",
        "write$Self$purchases_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;LUf/d;LTf/e;)V",
        "write$Self",
        "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;",
        "getAndroid",
        "()Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;",
        "Companion",
        "$serializer",
        "FontInfo",
        "purchases_defaultsBc8Release"
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
.field private static final $childSerializers:[LRf/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "LRf/b;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$Companion;


# instance fields
.field private final android:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;->Companion:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$Companion;

    .line 8
    .line 9
    new-instance v2, LRf/h;

    .line 10
    .line 11
    const-class v0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const-class v0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;

    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-class v1, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;

    .line 24
    .line 25
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v3, 0x2

    .line 30
    new-array v5, v3, [Lpe/d;

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    aput-object v0, v5, v8

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    aput-object v1, v5, v0

    .line 37
    .line 38
    new-array v6, v3, [LRf/b;

    .line 39
    .line 40
    sget-object v1, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer;->INSTANCE:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer;

    .line 41
    .line 42
    aput-object v1, v6, v8

    .line 43
    .line 44
    sget-object v1, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer;->INSTANCE:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer;

    .line 45
    .line 46
    aput-object v1, v6, v0

    .line 47
    .line 48
    new-array v7, v8, [Ljava/lang/annotation/Annotation;

    .line 49
    .line 50
    const-string v3, "com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo"

    .line 51
    .line 52
    invoke-direct/range {v2 .. v7}, LRf/h;-><init>(Ljava/lang/String;Lpe/d;[Lpe/d;[LRf/b;[Ljava/lang/annotation/Annotation;)V

    .line 53
    .line 54
    .line 55
    new-array v0, v0, [LRf/b;

    .line 56
    .line 57
    aput-object v2, v0, v8

    .line 58
    .line 59
    sput-object v0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;->$childSerializers:[LRf/b;

    .line 60
    .line 61
    return-void
.end method

.method public synthetic constructor <init>(ILcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;LVf/t0;)V
    .locals 1
    .annotation runtime LTd/e;
    .end annotation

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 1
    sget-object p3, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$$serializer;->INSTANCE:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$$serializer;

    invoke-virtual {p3}, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$$serializer;->getDescriptor()LTf/e;

    move-result-object p3

    invoke-static {p1, v0, p3}, LVf/f0;->a(IILTf/e;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;->android:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;

    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;)V
    .locals 1

    const-string v0, "android"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;->android:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[LRf/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;->$childSerializers:[LRf/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;LUf/d;LTf/e;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;->$childSerializers:[LRf/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;->android:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;

    .line 7
    .line 8
    invoke-interface {p1, p2, v1, v0, p0}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;->android:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;->android:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;

    .line 16
    .line 17
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final synthetic getAndroid()Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;->android:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;->android:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "FontsConfig(android="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;->android:Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x29

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method
