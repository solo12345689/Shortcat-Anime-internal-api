.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;
.super Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0003\u0018\u00002\u00020\u0001B9\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0017\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;",
        "",
        "Ls0/r0;",
        "colors",
        "",
        "stops",
        "degrees",
        "Ls0/I1;",
        "tileMode",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;FILkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "Lr0/l;",
        "size",
        "Landroid/graphics/Shader;",
        "Landroidx/compose/ui/graphics/Shader;",
        "createShader-uvyYCjk",
        "(J)Landroid/graphics/Shader;",
        "createShader",
        "Ljava/util/List;",
        "getColors$revenuecatui_defaultsBc8Release",
        "()Ljava/util/List;",
        "I",
        "F",
        "radians",
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


# instance fields
.field private final colors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls0/r0;",
            ">;"
        }
    .end annotation
.end field

.field private final degrees:F

.field private final radians:F

.field private final stops:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final tileMode:I


# direct methods
.method private constructor <init>(Ljava/util/List;Ljava/util/List;FI)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls0/r0;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;FI)V"
        }
    .end annotation

    const-string v0, "colors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->colors:Ljava/util/List;

    .line 6
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->stops:Ljava/util/List;

    .line 7
    iput p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->tileMode:I

    const/16 p1, 0x5a

    int-to-float p1, p1

    sub-float/2addr p1, p3

    const/16 p2, 0x168

    int-to-float p2, p2

    rem-float/2addr p1, p2

    add-float/2addr p1, p2

    rem-float/2addr p1, p2

    .line 8
    iput p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->degrees:F

    float-to-double p1, p1

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p1

    double-to-float p1, p1

    iput p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->radians:F

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;FIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p5, 0x8

    if-eqz p2, :cond_1

    .line 2
    sget-object p2, Ls0/I1;->a:Ls0/I1$a;

    invoke-virtual {p2}, Ls0/I1$a;->a()I

    move-result p4

    :cond_1
    move v4, p4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p3

    .line 3
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;-><init>(Ljava/util/List;Ljava/util/List;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;-><init>(Ljava/util/List;Ljava/util/List;FI)V

    return-void
.end method


# virtual methods
.method public createShader-uvyYCjk(J)Landroid/graphics/Shader;
    .locals 13

    .line 1
    invoke-static {p1, p2}, Lr0/l;->i(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    float-to-double v0, v0

    .line 6
    const/4 v2, 0x2

    .line 7
    int-to-double v3, v2

    .line 8
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    double-to-float v0, v0

    .line 13
    invoke-static {p1, p2}, Lr0/l;->g(J)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    float-to-double v5, v1

    .line 18
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    double-to-float v1, v3

    .line 23
    add-float/2addr v0, v1

    .line 24
    float-to-double v0, v0

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    double-to-float v0, v0

    .line 30
    invoke-static {p1, p2}, Lr0/l;->i(J)F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    div-float/2addr v1, v0

    .line 35
    float-to-double v3, v1

    .line 36
    invoke-static {v3, v4}, Ljava/lang/Math;->acos(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    double-to-float v1, v3

    .line 41
    iget v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->degrees:F

    .line 42
    .line 43
    const/high16 v4, 0x42b40000    # 90.0f

    .line 44
    .line 45
    cmpl-float v4, v3, v4

    .line 46
    .line 47
    if-lez v4, :cond_0

    .line 48
    .line 49
    const/high16 v4, 0x43340000    # 180.0f

    .line 50
    .line 51
    cmpg-float v4, v3, v4

    .line 52
    .line 53
    if-ltz v4, :cond_1

    .line 54
    .line 55
    :cond_0
    const/high16 v4, 0x43870000    # 270.0f

    .line 56
    .line 57
    cmpl-float v4, v3, v4

    .line 58
    .line 59
    if-lez v4, :cond_2

    .line 60
    .line 61
    const/high16 v4, 0x43b40000    # 360.0f

    .line 62
    .line 63
    cmpg-float v3, v3, v4

    .line 64
    .line 65
    if-gez v3, :cond_2

    .line 66
    .line 67
    :cond_1
    const v3, 0x40490fdb    # (float)Math.PI

    .line 68
    .line 69
    .line 70
    iget v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->radians:F

    .line 71
    .line 72
    sub-float/2addr v3, v4

    .line 73
    :goto_0
    sub-float/2addr v3, v1

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    iget v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->radians:F

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :goto_1
    float-to-double v3, v3

    .line 79
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    double-to-float v1, v3

    .line 84
    mul-float/2addr v1, v0

    .line 85
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    int-to-float v1, v2

    .line 90
    div-float/2addr v0, v1

    .line 91
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->radians:F

    .line 92
    .line 93
    float-to-double v1, v1

    .line 94
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 95
    .line 96
    .line 97
    move-result-wide v1

    .line 98
    double-to-float v1, v1

    .line 99
    mul-float/2addr v1, v0

    .line 100
    iget v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->radians:F

    .line 101
    .line 102
    float-to-double v2, v2

    .line 103
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    double-to-float v2, v2

    .line 108
    mul-float/2addr v0, v2

    .line 109
    invoke-static {p1, p2}, Lr0/m;->b(J)J

    .line 110
    .line 111
    .line 112
    move-result-wide v2

    .line 113
    neg-float v4, v1

    .line 114
    invoke-static {v4, v0}, Lr0/g;->a(FF)J

    .line 115
    .line 116
    .line 117
    move-result-wide v4

    .line 118
    invoke-static {v2, v3, v4, v5}, Lr0/f;->q(JJ)J

    .line 119
    .line 120
    .line 121
    move-result-wide v6

    .line 122
    invoke-static {p1, p2}, Lr0/m;->b(J)J

    .line 123
    .line 124
    .line 125
    move-result-wide p1

    .line 126
    neg-float v0, v0

    .line 127
    invoke-static {v1, v0}, Lr0/g;->a(FF)J

    .line 128
    .line 129
    .line 130
    move-result-wide v0

    .line 131
    invoke-static {p1, p2, v0, v1}, Lr0/f;->q(JJ)J

    .line 132
    .line 133
    .line 134
    move-result-wide v8

    .line 135
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->getColors$revenuecatui_defaultsBc8Release()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    iget-object v11, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->stops:Ljava/util/List;

    .line 140
    .line 141
    iget v12, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->tileMode:I

    .line 142
    .line 143
    invoke-static/range {v6 .. v12}, Ls0/B1;->a(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    return-object p1
.end method

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
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;

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
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->colors:Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->colors:Ljava/util/List;

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
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->stops:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->stops:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->tileMode:I

    .line 36
    .line 37
    iget p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->tileMode:I

    .line 38
    .line 39
    invoke-static {v1, p1}, Ls0/I1;->f(II)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public getColors$revenuecatui_defaultsBc8Release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ls0/r0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->colors:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->colors:Ljava/util/List;

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
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->stops:Ljava/util/List;

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
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->tileMode:I

    .line 23
    .line 24
    invoke-static {v1}, Ls0/I1;->g(I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v0, v1

    .line 29
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
    const-string v1, "RelativeLinearGradient(colors="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->colors:Ljava/util/List;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", stops="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->stops:Ljava/util/List;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", tileMode="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;->tileMode:I

    .line 32
    .line 33
    invoke-static {v1}, Ls0/I1;->h(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const/16 v1, 0x29

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0
.end method
