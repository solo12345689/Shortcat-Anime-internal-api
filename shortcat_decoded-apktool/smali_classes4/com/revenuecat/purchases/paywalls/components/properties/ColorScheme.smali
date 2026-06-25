.class public final Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;,
        Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B/\u0008\u0011\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u00c1\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0015\u001a\u0004\u0008\u0018\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;",
        "",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;",
        "light",
        "dark",
        "<init>",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;)V",
        "",
        "seen1",
        "LVf/t0;",
        "serializationConstructorMarker",
        "(ILcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;LVf/t0;)V",
        "self",
        "LUf/d;",
        "output",
        "LTf/e;",
        "serialDesc",
        "LTd/L;",
        "write$Self$purchases_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;LUf/d;LTf/e;)V",
        "write$Self",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;",
        "getLight",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;",
        "getDark",
        "Companion",
        "$serializer",
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

.field public static final Companion:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$Companion;


# instance fields
.field private final dark:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

.field private final light:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 26

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->Companion:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$Companion;

    .line 8
    .line 9
    new-instance v2, LRf/h;

    .line 10
    .line 11
    const-class v0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const-class v1, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Alias;

    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-class v8, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear;

    .line 24
    .line 25
    invoke-static {v8}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const-class v9, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial;

    .line 30
    .line 31
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const-class v10, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Hex;

    .line 36
    .line 37
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    const/4 v11, 0x4

    .line 42
    move-object v12, v5

    .line 43
    new-array v5, v11, [Lpe/d;

    .line 44
    .line 45
    const/4 v13, 0x0

    .line 46
    aput-object v3, v5, v13

    .line 47
    .line 48
    const/4 v14, 0x1

    .line 49
    aput-object v12, v5, v14

    .line 50
    .line 51
    const/4 v12, 0x2

    .line 52
    aput-object v6, v5, v12

    .line 53
    .line 54
    const/4 v15, 0x3

    .line 55
    aput-object v7, v5, v15

    .line 56
    .line 57
    sget-object v16, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Alias$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Alias$$serializer;

    .line 58
    .line 59
    sget-object v17, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear$$serializer;

    .line 60
    .line 61
    sget-object v18, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial$$serializer;

    .line 62
    .line 63
    sget-object v19, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Hex$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Hex$$serializer;

    .line 64
    .line 65
    new-array v6, v11, [LRf/b;

    .line 66
    .line 67
    aput-object v16, v6, v13

    .line 68
    .line 69
    aput-object v17, v6, v14

    .line 70
    .line 71
    aput-object v18, v6, v12

    .line 72
    .line 73
    aput-object v19, v6, v15

    .line 74
    .line 75
    new-array v7, v13, [Ljava/lang/annotation/Annotation;

    .line 76
    .line 77
    const-string v3, "com.revenuecat.purchases.paywalls.components.properties.ColorInfo"

    .line 78
    .line 79
    invoke-direct/range {v2 .. v7}, LRf/h;-><init>(Ljava/lang/String;Lpe/d;[Lpe/d;[LRf/b;[Ljava/lang/annotation/Annotation;)V

    .line 80
    .line 81
    .line 82
    new-instance v20, LRf/h;

    .line 83
    .line 84
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 85
    .line 86
    .line 87
    move-result-object v22

    .line 88
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v8}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    new-array v5, v11, [Lpe/d;

    .line 105
    .line 106
    aput-object v0, v5, v13

    .line 107
    .line 108
    aput-object v1, v5, v14

    .line 109
    .line 110
    aput-object v3, v5, v12

    .line 111
    .line 112
    aput-object v4, v5, v15

    .line 113
    .line 114
    new-array v0, v11, [LRf/b;

    .line 115
    .line 116
    aput-object v16, v0, v13

    .line 117
    .line 118
    aput-object v17, v0, v14

    .line 119
    .line 120
    aput-object v18, v0, v12

    .line 121
    .line 122
    aput-object v19, v0, v15

    .line 123
    .line 124
    new-array v1, v13, [Ljava/lang/annotation/Annotation;

    .line 125
    .line 126
    const-string v21, "com.revenuecat.purchases.paywalls.components.properties.ColorInfo"

    .line 127
    .line 128
    move-object/from16 v24, v0

    .line 129
    .line 130
    move-object/from16 v25, v1

    .line 131
    .line 132
    move-object/from16 v23, v5

    .line 133
    .line 134
    invoke-direct/range {v20 .. v25}, LRf/h;-><init>(Ljava/lang/String;Lpe/d;[Lpe/d;[LRf/b;[Ljava/lang/annotation/Annotation;)V

    .line 135
    .line 136
    .line 137
    new-array v0, v12, [LRf/b;

    .line 138
    .line 139
    aput-object v2, v0, v13

    .line 140
    .line 141
    aput-object v20, v0, v14

    .line 142
    .line 143
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->$childSerializers:[LRf/b;

    .line 144
    .line 145
    return-void
.end method

.method public synthetic constructor <init>(ILcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;LVf/t0;)V
    .locals 1
    .annotation runtime LTd/e;
    .end annotation

    and-int/lit8 p4, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p4, :cond_0

    .line 1
    sget-object p4, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    invoke-virtual {p4}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->getDescriptor()LTf/e;

    move-result-object p4

    invoke-static {p1, v0, p4}, LVf/f0;->a(IILTf/e;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->light:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->dark:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    return-void

    :cond_1
    iput-object p3, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->dark:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;)V
    .locals 1

    const-string v0, "light"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->light:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 4
    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->dark:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[LRf/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->$childSerializers:[LRf/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;LUf/d;LTf/e;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->$childSerializers:[LRf/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    iget-object v3, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->light:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 7
    .line 8
    invoke-interface {p1, p2, v1, v2, v3}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-interface {p1, p2, v1}, LUf/d;->g(LTf/e;I)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->dark:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    :goto_0
    aget-object v0, v0, v1

    .line 24
    .line 25
    iget-object p0, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->dark:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 26
    .line 27
    invoke-interface {p1, p2, v1, v0, p0}, LUf/d;->f(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

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
    check-cast p1, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->light:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->light:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->dark:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 25
    .line 26
    iget-object p1, p1, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->dark:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 27
    .line 28
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final synthetic getDark()Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->dark:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getLight()Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->light:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->light:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->dark:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
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
    const-string v1, "ColorScheme(light="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->light:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", dark="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->dark:Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 v1, 0x29

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method
