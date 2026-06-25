.class public final LPb/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS4/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILS4/h;)LU4/v;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, LPb/a;->c(Ljava/io/InputStream;IILS4/h;)LU4/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;LS4/h;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LPb/a;->d(Ljava/io/InputStream;LS4/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Ljava/io/InputStream;IILS4/h;)LU4/v;
    .locals 4

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "options"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-static {p1}, Lq5/g;->l(Ljava/io/InputStream;)Lq5/g;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string p4, "getFromInputStream(...)"

    .line 16
    .line 17
    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lq5/g;->g()Landroid/graphics/RectF;

    .line 21
    .line 22
    .line 23
    move-result-object p4

    .line 24
    const/4 v0, 0x0

    .line 25
    if-nez p4, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lq5/g;->h()F

    .line 28
    .line 29
    .line 30
    move-result p4

    .line 31
    invoke-virtual {p1}, Lq5/g;->f()F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/high16 v2, -0x40800000    # -1.0f

    .line 36
    .line 37
    cmpg-float v3, p4, v2

    .line 38
    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    cmpg-float v2, v1, v2

    .line 43
    .line 44
    if-nez v2, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p1, v0, v0, p4, v1}, Lq5/g;->u(FFFF)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catch_0
    move-exception p1

    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lq5/g;->g()Landroid/graphics/RectF;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    if-eqz p4, :cond_7

    .line 59
    .line 60
    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    cmpl-float v1, v1, v0

    .line 65
    .line 66
    if-lez v1, :cond_7

    .line 67
    .line 68
    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    cmpl-float v1, v1, v0

    .line 73
    .line 74
    if-lez v1, :cond_7

    .line 75
    .line 76
    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 77
    .line 78
    if-lez p2, :cond_3

    .line 79
    .line 80
    int-to-float p2, p2

    .line 81
    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    div-float/2addr p2, v2

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move p2, v1

    .line 88
    :goto_1
    if-lez p3, :cond_4

    .line 89
    .line 90
    int-to-float p3, p3

    .line 91
    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    div-float v1, p3, v1

    .line 96
    .line 97
    :cond_4
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 102
    .line 103
    .line 104
    cmpg-float p3, p3, v2

    .line 105
    .line 106
    if-gtz p3, :cond_5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    cmpg-float p3, p3, v2

    .line 114
    .line 115
    if-gtz p3, :cond_6

    .line 116
    .line 117
    :goto_2
    invoke-static {p2, v1}, Ljava/lang/Math;->min(FF)F

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    goto :goto_3

    .line 122
    :cond_6
    const/high16 p2, 0x3f800000    # 1.0f

    .line 123
    .line 124
    :goto_3
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    cmpg-float p3, p3, v2

    .line 129
    .line 130
    if-gtz p3, :cond_8

    .line 131
    .line 132
    cmpl-float p3, p2, v0

    .line 133
    .line 134
    if-lez p3, :cond_8

    .line 135
    .line 136
    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    .line 137
    .line 138
    .line 139
    move-result p3

    .line 140
    mul-float/2addr p3, p2

    .line 141
    invoke-virtual {p1, p3}, Lq5/g;->v(F)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    .line 145
    .line 146
    .line 147
    move-result p3

    .line 148
    mul-float/2addr p3, p2

    .line 149
    invoke-virtual {p1, p3}, Lq5/g;->t(F)V

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_7
    if-lez p2, :cond_8

    .line 154
    .line 155
    if-lez p3, :cond_8

    .line 156
    .line 157
    int-to-float p2, p2

    .line 158
    invoke-virtual {p1, p2}, Lq5/g;->v(F)V

    .line 159
    .line 160
    .line 161
    int-to-float p2, p3

    .line 162
    invoke-virtual {p1, p2}, Lq5/g;->t(F)V

    .line 163
    .line 164
    .line 165
    :cond_8
    :goto_4
    new-instance p2, La5/j;

    .line 166
    .line 167
    invoke-direct {p2, p1}, La5/j;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Lq5/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    .line 169
    .line 170
    return-object p2

    .line 171
    :goto_5
    new-instance p2, Ljava/io/IOException;

    .line 172
    .line 173
    const-string p3, "Cannot load SVG from stream"

    .line 174
    .line 175
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    throw p2
.end method

.method public d(Ljava/io/InputStream;LS4/h;)Z
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "options"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1
.end method
