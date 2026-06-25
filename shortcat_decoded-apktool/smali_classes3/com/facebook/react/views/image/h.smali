.class public final Lcom/facebook/react/views/image/h;
.super LZ5/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/image/h$a;,
        Lcom/facebook/react/views/image/h$b;,
        Lcom/facebook/react/views/image/h$c;
    }
.end annotation


# static fields
.field public static final B:Lcom/facebook/react/views/image/h$a;

.field private static final C:Landroid/graphics/Matrix;


# instance fields
.field private A:Lcom/facebook/react/views/image/c;

.field private final h:LS5/b;

.field private i:Ljava/lang/Object;

.field private final j:Ljava/util/List;

.field private k:LN7/a;

.field private l:LN7/a;

.field private m:Landroid/graphics/drawable/Drawable;

.field private n:Landroid/graphics/drawable/Drawable;

.field private o:I

.field private p:LV5/q;

.field private q:Landroid/graphics/Shader$TileMode;

.field private r:Z

.field private s:Lcom/facebook/react/views/image/h$b;

.field private t:LJ6/a;

.field private u:Lcom/facebook/react/views/image/g;

.field private v:LS5/d;

.field private w:I

.field private x:Z

.field private y:Lcom/facebook/react/bridge/ReadableMap;

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/image/h$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/image/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/image/h;->B:Lcom/facebook/react/views/image/h$a;

    .line 8
    .line 9
    new-instance v0, Landroid/graphics/Matrix;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/facebook/react/views/image/h;->C:Landroid/graphics/Matrix;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LS5/b;Lcom/facebook/react/views/image/a;Ljava/lang/Object;)V
    .locals 0

    .line 1
    const-string p3, "context"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "draweeControllerBuilder"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p3, Lcom/facebook/react/views/image/h;->B:Lcom/facebook/react/views/image/h$a;

    .line 12
    .line 13
    invoke-static {p3, p1}, Lcom/facebook/react/views/image/h$a;->a(Lcom/facebook/react/views/image/h$a;Landroid/content/Context;)LW5/a;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-direct {p0, p1, p3}, LZ5/d;-><init>(Landroid/content/Context;LW5/a;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lcom/facebook/react/views/image/h;->h:LS5/b;

    .line 21
    .line 22
    iput-object p4, p0, Lcom/facebook/react/views/image/h;->i:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->j:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {}, Lcom/facebook/react/views/image/d;->b()LV5/q;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->p:LV5/q;

    .line 36
    .line 37
    invoke-static {}, Lcom/facebook/react/views/image/d;->a()Landroid/graphics/Shader$TileMode;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->q:Landroid/graphics/Shader$TileMode;

    .line 42
    .line 43
    const/4 p1, -0x1

    .line 44
    iput p1, p0, Lcom/facebook/react/views/image/h;->w:I

    .line 45
    .line 46
    const/high16 p1, 0x3f800000    # 1.0f

    .line 47
    .line 48
    iput p1, p0, Lcom/facebook/react/views/image/h;->z:F

    .line 49
    .line 50
    sget-object p1, Lcom/facebook/react/views/image/c;->b:Lcom/facebook/react/views/image/c;

    .line 51
    .line 52
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->A:Lcom/facebook/react/views/image/c;

    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    invoke-virtual {p0, p1}, LZ5/c;->setLegacyVisibilityHandlingEnabled(Z)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static final synthetic g(Lcom/facebook/react/views/image/h;)LV5/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/views/image/h;->p:LV5/q;

    .line 2
    .line 3
    return-object p0
.end method

.method private final getResizeOptions()Ly6/g;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    iget v1, p0, Lcom/facebook/react/views/image/h;->z:F

    .line 7
    .line 8
    mul-float/2addr v0, v1

    .line 9
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-float v0, v0

    .line 18
    iget v1, p0, Lcom/facebook/react/views/image/h;->z:F

    .line 19
    .line 20
    mul-float/2addr v0, v1

    .line 21
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-lez v2, :cond_1

    .line 26
    .line 27
    if-gtz v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v1, Ly6/g;

    .line 31
    .line 32
    const/16 v6, 0xc

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-direct/range {v1 .. v7}, Ly6/g;-><init>(IIFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 42
    return-object v0
.end method

.method public static final synthetic h()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/image/h;->C:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic i(Lcom/facebook/react/views/image/h;)Landroid/graphics/Shader$TileMode;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/views/image/h;->q:Landroid/graphics/Shader$TileMode;

    .line 2
    .line 3
    return-object p0
.end method

.method private final j(Ljava/lang/String;)Lu7/a;
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sparse-switch v0, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :sswitch_0
    const-string v0, "default"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_3

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :sswitch_1
    const-string v0, "only-if-cached"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object p1, Lu7/a;->d:Lu7/a;

    .line 30
    .line 31
    return-object p1

    .line 32
    :sswitch_2
    const-string v0, "reload"

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    sget-object p1, Lu7/a;->b:Lu7/a;

    .line 42
    .line 43
    return-object p1

    .line 44
    :sswitch_3
    const-string v0, "force-cache"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    :goto_0
    sget-object p1, Lu7/a;->a:Lu7/a;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_2
    sget-object p1, Lu7/a;->c:Lu7/a;

    .line 56
    .line 57
    return-object p1

    .line 58
    :cond_3
    sget-object p1, Lu7/a;->a:Lu7/a;

    .line 59
    .line 60
    return-object p1

    .line 61
    :sswitch_data_0
    .sparse-switch
        -0x5d3acde0 -> :sswitch_3
        -0x37b57e67 -> :sswitch_2
        0x2a216ef1 -> :sswitch_1
        0x5c13d641 -> :sswitch_0
    .end sparse-switch
.end method

.method private final k(Lu7/a;)LK6/b$c;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/image/h$c;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    sget-object p1, LK6/b$c;->c:LK6/b$c;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    sget-object p1, LK6/b$c;->b:LK6/b$c;

    .line 16
    .line 17
    return-object p1
.end method

.method private final l()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->j:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-le v0, v1, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private final m()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->q:Landroid/graphics/Shader$TileMode;

    .line 2
    .line 3
    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private final o(Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->k:LN7/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, LN7/a;->f()Landroid/net/Uri;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0}, LN7/a;->c()Lu7/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {p0, v0}, Lcom/facebook/react/views/image/h;->k(Lu7/a;)LK6/b$c;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v4, p0, Lcom/facebook/react/views/image/h;->t:LJ6/a;

    .line 24
    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object v4, p0, Lcom/facebook/react/views/image/h;->s:Lcom/facebook/react/views/image/h$b;

    .line 31
    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :cond_2
    sget-object v4, Lcom/facebook/react/views/image/e;->b:Lcom/facebook/react/views/image/e$a;

    .line 38
    .line 39
    invoke-virtual {v4, v3}, Lcom/facebook/react/views/image/e$a;->a(Ljava/util/List;)LK6/d;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->getResizeOptions()Ly6/g;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 p1, 0x0

    .line 51
    :goto_0
    sget-object v4, Lu7/a;->b:Lu7/a;

    .line 52
    .line 53
    if-ne v0, v4, :cond_4

    .line 54
    .line 55
    invoke-static {}, LO5/d;->a()Lz6/t;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v4, v1}, Lz6/t;->g(Landroid/net/Uri;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    invoke-static {v1}, LK6/c;->x(Landroid/net/Uri;)LK6/c;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1, v3}, LK6/c;->J(LK6/d;)LK6/c;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1, p1}, LK6/c;->N(Ly6/g;)LK6/c;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const/4 v4, 0x1

    .line 75
    invoke-virtual {v1, v4}, LK6/c;->y(Z)LK6/c;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-boolean v5, p0, Lcom/facebook/react/views/image/h;->x:Z

    .line 80
    .line 81
    invoke-virtual {v1, v5}, LK6/c;->K(Z)LK6/c;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1, v2}, LK6/c;->I(LK6/b$c;)LK6/c;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v2, p0, Lcom/facebook/react/views/image/h;->A:Lcom/facebook/react/views/image/c;

    .line 90
    .line 91
    sget-object v5, Lcom/facebook/react/views/image/c;->e:Lcom/facebook/react/views/image/c;

    .line 92
    .line 93
    if-ne v2, v5, :cond_5

    .line 94
    .line 95
    sget-object v2, Lz6/n;->c:Lz6/n;

    .line 96
    .line 97
    invoke-virtual {v1, v2}, LK6/c;->E(Lz6/n;)LK6/c;

    .line 98
    .line 99
    .line 100
    :cond_5
    sget-object v2, Lu7/b;->D:Lu7/b$a;

    .line 101
    .line 102
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object v6, p0, Lcom/facebook/react/views/image/h;->y:Lcom/facebook/react/bridge/ReadableMap;

    .line 106
    .line 107
    invoke-virtual {v2, v1, v6, v0}, Lu7/b$a;->a(LK6/c;Lcom/facebook/react/bridge/ReadableMap;Lu7/a;)Lu7/b;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v1, p0, Lcom/facebook/react/views/image/h;->h:LS5/b;

    .line 112
    .line 113
    const-string v2, "null cannot be cast to non-null type com.facebook.drawee.controller.AbstractDraweeControllerBuilder<*, com.facebook.imagepipeline.request.ImageRequest, com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>, com.facebook.imagepipeline.image.ImageInfo>"

    .line 114
    .line 115
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, LS5/b;->x()LS5/b;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v0}, LS5/b;->B(Ljava/lang/Object;)LS5/b;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0, v4}, LS5/b;->y(Z)LS5/b;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p0}, LZ5/c;->getController()LY5/a;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v0, v2}, LS5/b;->D(LY5/a;)LS5/b;

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->i:Ljava/lang/Object;

    .line 137
    .line 138
    if-eqz v0, :cond_6

    .line 139
    .line 140
    invoke-virtual {v1, v0}, LS5/b;->z(Ljava/lang/Object;)LS5/b;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v2, "setCallerContext(...)"

    .line 145
    .line 146
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_6
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->l:LN7/a;

    .line 150
    .line 151
    if-eqz v0, :cond_8

    .line 152
    .line 153
    invoke-virtual {v0}, LN7/a;->f()Landroid/net/Uri;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v0}, LK6/c;->x(Landroid/net/Uri;)LK6/c;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0, v3}, LK6/c;->J(LK6/d;)LK6/c;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0, p1}, LK6/c;->N(Ly6/g;)LK6/c;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p1, v4}, LK6/c;->y(Z)LK6/c;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iget-boolean v0, p0, Lcom/facebook/react/views/image/h;->x:Z

    .line 174
    .line 175
    invoke-virtual {p1, v0}, LK6/c;->K(Z)LK6/c;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->A:Lcom/facebook/react/views/image/c;

    .line 180
    .line 181
    if-ne v0, v5, :cond_7

    .line 182
    .line 183
    sget-object v0, Lz6/n;->c:Lz6/n;

    .line 184
    .line 185
    invoke-virtual {p1, v0}, LK6/c;->E(Lz6/n;)LK6/c;

    .line 186
    .line 187
    .line 188
    :cond_7
    invoke-virtual {p1}, LK6/c;->a()LK6/b;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {v1, p1}, LS5/b;->C(Ljava/lang/Object;)LS5/b;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    const-string v0, "setLowResImageRequest(...)"

    .line 197
    .line 198
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    :cond_8
    iget-object p1, p0, Lcom/facebook/react/views/image/h;->u:Lcom/facebook/react/views/image/g;

    .line 202
    .line 203
    if-eqz p1, :cond_9

    .line 204
    .line 205
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->v:LS5/d;

    .line 206
    .line 207
    if-eqz v0, :cond_9

    .line 208
    .line 209
    new-instance p1, LS5/f;

    .line 210
    .line 211
    invoke-direct {p1}, LS5/f;-><init>()V

    .line 212
    .line 213
    .line 214
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->u:Lcom/facebook/react/views/image/g;

    .line 215
    .line 216
    invoke-virtual {p1, v0}, LS5/f;->b(LS5/d;)V

    .line 217
    .line 218
    .line 219
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->v:LS5/d;

    .line 220
    .line 221
    invoke-virtual {p1, v0}, LS5/f;->b(LS5/d;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, p1}, LS5/b;->A(LS5/d;)LS5/b;

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_9
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->v:LS5/d;

    .line 229
    .line 230
    if-eqz v0, :cond_a

    .line 231
    .line 232
    invoke-virtual {v1, v0}, LS5/b;->A(LS5/d;)LS5/b;

    .line 233
    .line 234
    .line 235
    goto :goto_1

    .line 236
    :cond_a
    if-eqz p1, :cond_b

    .line 237
    .line 238
    invoke-virtual {v1, p1}, LS5/b;->A(LS5/d;)LS5/b;

    .line 239
    .line 240
    .line 241
    :cond_b
    :goto_1
    iget-object p1, p0, Lcom/facebook/react/views/image/h;->u:Lcom/facebook/react/views/image/g;

    .line 242
    .line 243
    if-eqz p1, :cond_c

    .line 244
    .line 245
    invoke-virtual {p0}, LZ5/c;->getHierarchy()LY5/b;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    check-cast p1, LW5/a;

    .line 250
    .line 251
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->u:Lcom/facebook/react/views/image/g;

    .line 252
    .line 253
    invoke-virtual {p1, v0}, LW5/a;->y(Landroid/graphics/drawable/Drawable;)V

    .line 254
    .line 255
    .line 256
    :cond_c
    invoke-virtual {v1}, LS5/b;->a()LS5/a;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-virtual {p0, p1}, LZ5/c;->setController(LY5/a;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1}, LS5/b;->x()LS5/b;

    .line 264
    .line 265
    .line 266
    return-void
.end method

.method private final p()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/facebook/react/views/image/h;->k:LN7/a;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->j:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->j:Ljava/util/List;

    .line 13
    .line 14
    sget-object v1, LN7/a;->f:LN7/a$a;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "getContext(...)"

    .line 21
    .line 22
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, LN7/a$a;->a(Landroid/content/Context;)LN7/a;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->l()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v2, p0, Lcom/facebook/react/views/image/h;->j:Ljava/util/List;

    .line 48
    .line 49
    invoke-static {v0, v1, v2}, LN7/b;->a(IILjava/util/List;)LN7/b$a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v1, v0, LN7/b$a;->a:LN7/a;

    .line 54
    .line 55
    iput-object v1, p0, Lcom/facebook/react/views/image/h;->k:LN7/a;

    .line 56
    .line 57
    iget-object v0, v0, LN7/b$a;->b:LN7/a;

    .line 58
    .line 59
    iput-object v0, p0, Lcom/facebook/react/views/image/h;->l:LN7/a;

    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->j:Ljava/util/List;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, LN7/a;

    .line 70
    .line 71
    iput-object v0, p0, Lcom/facebook/react/views/image/h;->k:LN7/a;

    .line 72
    .line 73
    return-void
.end method

.method private final q(LN7/a;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->A:Lcom/facebook/react/views/image/c;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/views/image/h$c;->b:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    if-eq v0, p1, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    return v2

    .line 20
    :cond_1
    invoke-virtual {p1}, LN7/a;->f()Landroid/net/Uri;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, LG5/f;->k(Landroid/net/Uri;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1}, LN7/a;->f()Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, LG5/f;->l(Landroid/net/Uri;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return v1

    .line 42
    :cond_3
    :goto_0
    return v2
.end method

.method private final r(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-boolean v0, LY6/a;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lh7/i;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "ReactImageView: Image source \""

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, "\" doesn\'t exist"

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {v0, p1}, LJ7/d;->d(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method


# virtual methods
.method public final getImageSource$ReactAndroid_release()LN7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->k:LN7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final n()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->l()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_4

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-gtz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->p()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->k:LN7/a;

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-direct {p0, v0}, Lcom/facebook/react/views/image/h;->q(LN7/a;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-lez v2, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-gtz v2, :cond_3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->m()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-lez v2, :cond_4

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-gtz v2, :cond_5

    .line 69
    .line 70
    :cond_4
    :goto_0
    return-void

    .line 71
    :cond_5
    invoke-virtual {p0}, LZ5/c;->getHierarchy()LY5/b;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, LW5/a;

    .line 76
    .line 77
    iget-object v3, p0, Lcom/facebook/react/views/image/h;->p:LV5/q;

    .line 78
    .line 79
    invoke-virtual {v2, v3}, LW5/a;->t(LV5/q;)V

    .line 80
    .line 81
    .line 82
    iget-object v3, p0, Lcom/facebook/react/views/image/h;->m:Landroid/graphics/drawable/Drawable;

    .line 83
    .line 84
    if-eqz v3, :cond_6

    .line 85
    .line 86
    iget-object v4, p0, Lcom/facebook/react/views/image/h;->p:LV5/q;

    .line 87
    .line 88
    invoke-virtual {v2, v3, v4}, LW5/a;->w(Landroid/graphics/drawable/Drawable;LV5/q;)V

    .line 89
    .line 90
    .line 91
    :cond_6
    iget-object v3, p0, Lcom/facebook/react/views/image/h;->n:Landroid/graphics/drawable/Drawable;

    .line 92
    .line 93
    if-eqz v3, :cond_7

    .line 94
    .line 95
    sget-object v4, LV5/q;->g:LV5/q;

    .line 96
    .line 97
    invoke-virtual {v2, v3, v4}, LW5/a;->w(Landroid/graphics/drawable/Drawable;LV5/q;)V

    .line 98
    .line 99
    .line 100
    :cond_7
    invoke-virtual {v2}, LW5/a;->o()LW5/d;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    if-eqz v3, :cond_9

    .line 105
    .line 106
    iget v4, p0, Lcom/facebook/react/views/image/h;->o:I

    .line 107
    .line 108
    if-eqz v4, :cond_8

    .line 109
    .line 110
    invoke-virtual {v3, v4}, LW5/d;->n(I)LW5/d;

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_8
    sget-object v4, LW5/d$a;->b:LW5/d$a;

    .line 115
    .line 116
    invoke-virtual {v3, v4}, LW5/d;->p(LW5/d$a;)LW5/d;

    .line 117
    .line 118
    .line 119
    :goto_1
    invoke-virtual {v2, v3}, LW5/a;->z(LW5/d;)V

    .line 120
    .line 121
    .line 122
    :cond_9
    iget v3, p0, Lcom/facebook/react/views/image/h;->w:I

    .line 123
    .line 124
    const/4 v4, 0x0

    .line 125
    if-ltz v3, :cond_a

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_a
    invoke-virtual {v0}, LN7/a;->g()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_b

    .line 133
    .line 134
    move v3, v4

    .line 135
    goto :goto_2

    .line 136
    :cond_b
    const/16 v3, 0x12c

    .line 137
    .line 138
    :goto_2
    invoke-virtual {v2, v3}, LW5/a;->v(I)V

    .line 139
    .line 140
    .line 141
    invoke-direct {p0, v1}, Lcom/facebook/react/views/image/h;->o(Z)V

    .line 142
    .line 143
    .line 144
    iput-boolean v4, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 145
    .line 146
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/a;->a(Landroid/view/View;Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p1

    .line 14
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->u:Lcom/facebook/react/views/image/g;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/f0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    sget-object v1, Lcom/facebook/react/views/image/b;->h:Lcom/facebook/react/views/image/b$a;

    .line 40
    .line 41
    invoke-static {p0}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-virtual {v1, v2, v3, p1}, Lcom/facebook/react/views/image/b$a;->a(IILjava/lang/Throwable;)Lcom/facebook/react/views/image/b;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    if-lez p1, :cond_2

    .line 5
    .line 6
    if-lez p2, :cond_2

    .line 7
    .line 8
    iget-boolean p1, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 9
    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->l()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->m()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 28
    :goto_1
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/facebook/react/views/image/h;->n()V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/a;->m(Landroid/view/View;Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setBlurRadius(F)V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/B;->a:Lcom/facebook/react/uimanager/B;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/B;->b(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    float-to-int p1, p1

    .line 8
    const/4 v0, 0x2

    .line 9
    div-int/2addr p1, v0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, LJ6/a;

    .line 15
    .line 16
    invoke-direct {v1, v0, p1}, LJ6/a;-><init>(II)V

    .line 17
    .line 18
    .line 19
    move-object p1, v1

    .line 20
    :goto_0
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->t:LJ6/a;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 24
    .line 25
    return-void
.end method

.method public final setBorderColor(I)V
    .locals 1

    .line 1
    sget-object v0, LH7/t;->b:LH7/t;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p0, v0, p1}, Lcom/facebook/react/uimanager/a;->r(Landroid/view/View;LH7/t;Ljava/lang/Integer;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setBorderRadius(F)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/t;

    .line 10
    .line 11
    sget-object v1, Lcom/facebook/react/uimanager/B;->a:Lcom/facebook/react/uimanager/B;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/B;->e(F)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    sget-object v1, Lcom/facebook/react/uimanager/u;->a:Lcom/facebook/react/uimanager/u;

    .line 18
    .line 19
    invoke-direct {v0, p1, v1}, Lcom/facebook/react/uimanager/t;-><init>(FLcom/facebook/react/uimanager/u;)V

    .line 20
    .line 21
    .line 22
    move-object p1, v0

    .line 23
    :goto_0
    sget-object v0, LH7/i;->a:LH7/i;

    .line 24
    .line 25
    invoke-static {p0, v0, p1}, Lcom/facebook/react/uimanager/a;->s(Landroid/view/View;LH7/i;Lcom/facebook/react/uimanager/t;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final setBorderWidth(F)V
    .locals 1

    .line 1
    sget-object v0, LH7/t;->b:LH7/t;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p0, v0, p1}, Lcom/facebook/react/uimanager/a;->u(Landroid/view/View;LH7/t;Ljava/lang/Float;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setControllerListener(LS5/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LS5/d;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->v:LS5/d;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/views/image/h;->n()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setDefaultSource(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getContext(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, LN7/c;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->m:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->m:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final setFadeDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/image/h;->w:I

    .line 2
    .line 3
    return-void
.end method

.method public final setHeaders(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->y:Lcom/facebook/react/bridge/ReadableMap;

    .line 2
    .line 3
    return-void
.end method

.method public final setImageSource$ReactAndroid_release(LN7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->k:LN7/a;

    .line 2
    .line 3
    return-void
.end method

.method public final setLoadingIndicatorSource(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getContext(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, LN7/c;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance v0, LV5/b;

    .line 17
    .line 18
    const/16 v1, 0x3e8

    .line 19
    .line 20
    invoke-direct {v0, p1, v1}, LV5/b;-><init>(Landroid/graphics/drawable/Drawable;I)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    iget-object p1, p0, Lcom/facebook/react/views/image/h;->n:Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    iput-object v0, p0, Lcom/facebook/react/views/image/h;->n:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final setOverlayColor(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/image/h;->o:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/facebook/react/views/image/h;->o:I

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setProgressiveRenderingEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->x:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setResizeMethod(Lcom/facebook/react/views/image/c;)V
    .locals 1

    .line 1
    const-string v0, "resizeMethod"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->A:Lcom/facebook/react/views/image/c;

    .line 7
    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->A:Lcom/facebook/react/views/image/c;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final setResizeMultiplier(F)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/facebook/react/views/image/h;->z:F

    .line 2
    .line 3
    sub-float/2addr v0, p1

    .line 4
    float-to-double v0, v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const-wide v2, 0x3f1a36e2e0000000L    # 9.999999747378752E-5

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmpl-double v0, v0, v2

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    iput p1, p0, Lcom/facebook/react/views/image/h;->z:F

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final setScaleType(LV5/q;)V
    .locals 1

    .line 1
    const-string v0, "scaleType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->p:LV5/q;

    .line 7
    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->p:LV5/q;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final setShouldNotifyLoadEvents(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->u:Lcom/facebook/react/views/image/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    if-nez p1, :cond_2

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->u:Lcom/facebook/react/views/image/g;

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/f0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, Lcom/facebook/react/views/image/h$d;

    .line 38
    .line 39
    invoke-direct {v0, p1, p0}, Lcom/facebook/react/views/image/h$d;-><init>(Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/views/image/h;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/facebook/react/views/image/h;->u:Lcom/facebook/react/views/image/g;

    .line 43
    .line 44
    :goto_1
    iput-boolean v1, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 45
    .line 46
    return-void
.end method

.method public final setSource(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    const-string v4, "getContext(...)"

    .line 12
    .line 13
    if-eqz v1, :cond_6

    .line 14
    .line 15
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-nez v5, :cond_0

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    const-string v6, "cache"

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    const-string v8, "uri"

    .line 31
    .line 32
    if-ne v5, v3, :cond_3

    .line 33
    .line 34
    invoke-interface {v1, v7}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-interface {v1, v6}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-direct {v0, v5}, Lcom/facebook/react/views/image/h;->j(Ljava/lang/String;)Lu7/a;

    .line 45
    .line 46
    .line 47
    move-result-object v16

    .line 48
    new-instance v9, LN7/a;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    invoke-static {v10, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v1, v8}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    const/16 v17, 0xc

    .line 62
    .line 63
    const/16 v18, 0x0

    .line 64
    .line 65
    const-wide/16 v12, 0x0

    .line 66
    .line 67
    const-wide/16 v14, 0x0

    .line 68
    .line 69
    invoke-direct/range {v9 .. v18}, LN7/a;-><init>(Landroid/content/Context;Ljava/lang/String;DDLu7/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 70
    .line 71
    .line 72
    sget-object v5, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 73
    .line 74
    invoke-virtual {v9}, LN7/a;->f()Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_1

    .line 83
    .line 84
    invoke-interface {v1, v8}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-direct {v0, v1}, Lcom/facebook/react/views/image/h;->r(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    sget-object v1, LN7/a;->f:LN7/a$a;

    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v5}, LN7/a$a;->a(Landroid/content/Context;)LN7/a;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    :cond_1
    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    const-string v2, "Required value was null."

    .line 111
    .line 112
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v1

    .line 116
    :cond_3
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    :goto_0
    if-ge v7, v5, :cond_7

    .line 121
    .line 122
    invoke-interface {v1, v7}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    if-nez v9, :cond_4

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    invoke-interface {v9, v6}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-direct {v0, v10}, Lcom/facebook/react/views/image/h;->j(Ljava/lang/String;)Lu7/a;

    .line 134
    .line 135
    .line 136
    move-result-object v18

    .line 137
    new-instance v11, LN7/a;

    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    invoke-static {v12, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v9, v8}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    const-string v10, "width"

    .line 151
    .line 152
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 153
    .line 154
    .line 155
    move-result-wide v14

    .line 156
    const-string v10, "height"

    .line 157
    .line 158
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 159
    .line 160
    .line 161
    move-result-wide v16

    .line 162
    invoke-direct/range {v11 .. v18}, LN7/a;-><init>(Landroid/content/Context;Ljava/lang/String;DDLu7/a;)V

    .line 163
    .line 164
    .line 165
    sget-object v10, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 166
    .line 167
    invoke-virtual {v11}, LN7/a;->f()Landroid/net/Uri;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    invoke-static {v10, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-eqz v10, :cond_5

    .line 176
    .line 177
    invoke-interface {v9, v8}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    invoke-direct {v0, v9}, Lcom/facebook/react/views/image/h;->r(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    sget-object v9, LN7/a;->f:LN7/a$a;

    .line 185
    .line 186
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    invoke-static {v10, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v9, v10}, LN7/a$a;->a(Landroid/content/Context;)LN7/a;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    :cond_5
    invoke-interface {v2, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_6
    :goto_2
    sget-object v1, LN7/a;->f:LN7/a$a;

    .line 204
    .line 205
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v5}, LN7/a$a;->a(Landroid/content/Context;)LN7/a;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    :cond_7
    :goto_3
    iget-object v1, v0, Lcom/facebook/react/views/image/h;->j:Ljava/util/List;

    .line 220
    .line 221
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-eqz v1, :cond_8

    .line 226
    .line 227
    return-void

    .line 228
    :cond_8
    iget-object v1, v0, Lcom/facebook/react/views/image/h;->j:Ljava/util/List;

    .line 229
    .line 230
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 231
    .line 232
    .line 233
    iget-object v1, v0, Lcom/facebook/react/views/image/h;->j:Ljava/util/List;

    .line 234
    .line 235
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 236
    .line 237
    .line 238
    iput-boolean v3, v0, Lcom/facebook/react/views/image/h;->r:Z

    .line 239
    .line 240
    return-void
.end method

.method public final setTileMode(Landroid/graphics/Shader$TileMode;)V
    .locals 1

    .line 1
    const-string v0, "tileMode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->q:Landroid/graphics/Shader$TileMode;

    .line 7
    .line 8
    if-eq v0, p1, :cond_1

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->q:Landroid/graphics/Shader$TileMode;

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->m()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    new-instance p1, Lcom/facebook/react/views/image/h$b;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/facebook/react/views/image/h$b;-><init>(Lcom/facebook/react/views/image/h;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->s:Lcom/facebook/react/views/image/h$b;

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->r:Z

    .line 29
    .line 30
    :cond_1
    return-void
.end method
