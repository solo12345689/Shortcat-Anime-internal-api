.class public final LX0/j;
.super Landroid/text/style/ReplacementSpan;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX0/j$a;
    }
.end annotation


# static fields
.field public static final k:LX0/j$a;

.field public static final l:I


# instance fields
.field private final a:F

.field private final b:I

.field private final c:F

.field private final d:I

.field private final e:F

.field private final f:I

.field private g:Landroid/graphics/Paint$FontMetricsInt;

.field private h:I

.field private i:I

.field private j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LX0/j$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LX0/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LX0/j;->k:LX0/j$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, LX0/j;->l:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Paint$FontMetricsInt;
    .locals 1

    .line 1
    iget-object v0, p0, LX0/j;->g:Landroid/graphics/Paint$FontMetricsInt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "fontMetrics"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget-boolean v0, p0, LX0/j;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "PlaceholderSpan is not laid out yet."

    .line 6
    .line 7
    invoke-static {v0}, Lb1/a;->c(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget v0, p0, LX0/j;->i:I

    .line 11
    .line 12
    return v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, LX0/j;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-boolean v0, p0, LX0/j;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "PlaceholderSpan is not laid out yet."

    .line 6
    .line 7
    invoke-static {v0}, Lb1/a;->c(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget v0, p0, LX0/j;->h:I

    .line 11
    .line 12
    return v0
.end method

.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 0

    .line 1
    return-void
.end method

.method public getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 1

    .line 1
    const/4 p2, 0x1

    .line 2
    iput-boolean p2, p0, LX0/j;->j:Z

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, LX0/j;->g:Landroid/graphics/Paint$FontMetricsInt;

    .line 13
    .line 14
    invoke-virtual {p0}, LX0/j;->a()Landroid/graphics/Paint$FontMetricsInt;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 19
    .line 20
    invoke-virtual {p0}, LX0/j;->a()Landroid/graphics/Paint$FontMetricsInt;

    .line 21
    .line 22
    .line 23
    move-result-object p4

    .line 24
    iget p4, p4, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 25
    .line 26
    if-le p1, p4, :cond_0

    .line 27
    .line 28
    move p1, p2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    if-nez p1, :cond_1

    .line 32
    .line 33
    const-string p1, "Invalid fontMetrics: line height can not be negative."

    .line 34
    .line 35
    invoke-static {p1}, Lb1/a;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget p1, p0, LX0/j;->b:I

    .line 39
    .line 40
    const-string p4, "Unsupported unit."

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    if-ne p1, p2, :cond_2

    .line 45
    .line 46
    iget p1, p0, LX0/j;->a:F

    .line 47
    .line 48
    mul-float/2addr p1, p3

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-static {p4}, Lb1/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 51
    .line 52
    .line 53
    new-instance p1, LTd/k;

    .line 54
    .line 55
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_3
    iget p1, p0, LX0/j;->a:F

    .line 60
    .line 61
    iget v0, p0, LX0/j;->e:F

    .line 62
    .line 63
    mul-float/2addr p1, v0

    .line 64
    :goto_1
    invoke-static {p1}, LX0/k;->a(F)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iput p1, p0, LX0/j;->h:I

    .line 69
    .line 70
    iget p1, p0, LX0/j;->d:I

    .line 71
    .line 72
    if-eqz p1, :cond_5

    .line 73
    .line 74
    if-ne p1, p2, :cond_4

    .line 75
    .line 76
    iget p1, p0, LX0/j;->c:F

    .line 77
    .line 78
    mul-float/2addr p1, p3

    .line 79
    invoke-static {p1}, LX0/k;->a(F)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    invoke-static {p4}, Lb1/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 85
    .line 86
    .line 87
    new-instance p1, LTd/k;

    .line 88
    .line 89
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :cond_5
    iget p1, p0, LX0/j;->c:F

    .line 94
    .line 95
    iget p2, p0, LX0/j;->e:F

    .line 96
    .line 97
    mul-float/2addr p1, p2

    .line 98
    invoke-static {p1}, LX0/k;->a(F)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    :goto_2
    iput p1, p0, LX0/j;->i:I

    .line 103
    .line 104
    if-eqz p5, :cond_7

    .line 105
    .line 106
    invoke-virtual {p0}, LX0/j;->a()Landroid/graphics/Paint$FontMetricsInt;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 111
    .line 112
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 113
    .line 114
    invoke-virtual {p0}, LX0/j;->a()Landroid/graphics/Paint$FontMetricsInt;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 119
    .line 120
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 121
    .line 122
    invoke-virtual {p0}, LX0/j;->a()Landroid/graphics/Paint$FontMetricsInt;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->leading:I

    .line 127
    .line 128
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->leading:I

    .line 129
    .line 130
    iget p1, p0, LX0/j;->f:I

    .line 131
    .line 132
    packed-switch p1, :pswitch_data_0

    .line 133
    .line 134
    .line 135
    const-string p1, "Unknown verticalAlign."

    .line 136
    .line 137
    invoke-static {p1}, Lb1/a;->a(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :pswitch_0
    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 142
    .line 143
    iget p2, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 144
    .line 145
    sub-int/2addr p1, p2

    .line 146
    invoke-virtual {p0}, LX0/j;->b()I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    if-ge p1, p2, :cond_6

    .line 151
    .line 152
    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 153
    .line 154
    invoke-virtual {p0}, LX0/j;->b()I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    iget p3, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 159
    .line 160
    iget p4, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 161
    .line 162
    sub-int/2addr p3, p4

    .line 163
    sub-int/2addr p2, p3

    .line 164
    div-int/lit8 p2, p2, 0x2

    .line 165
    .line 166
    sub-int/2addr p1, p2

    .line 167
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 168
    .line 169
    invoke-virtual {p0}, LX0/j;->b()I

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    add-int/2addr p1, p2

    .line 174
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :pswitch_1
    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 178
    .line 179
    iget p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 180
    .line 181
    invoke-virtual {p0}, LX0/j;->b()I

    .line 182
    .line 183
    .line 184
    move-result p3

    .line 185
    sub-int/2addr p2, p3

    .line 186
    if-le p1, p2, :cond_6

    .line 187
    .line 188
    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 189
    .line 190
    invoke-virtual {p0}, LX0/j;->b()I

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    sub-int/2addr p1, p2

    .line 195
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :pswitch_2
    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 199
    .line 200
    invoke-virtual {p0}, LX0/j;->b()I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    add-int/2addr p1, p2

    .line 205
    iget p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 206
    .line 207
    if-le p1, p2, :cond_6

    .line 208
    .line 209
    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 210
    .line 211
    invoke-virtual {p0}, LX0/j;->b()I

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    add-int/2addr p1, p2

    .line 216
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :pswitch_3
    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 220
    .line 221
    invoke-virtual {p0}, LX0/j;->b()I

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    neg-int p2, p2

    .line 226
    if-le p1, p2, :cond_6

    .line 227
    .line 228
    invoke-virtual {p0}, LX0/j;->b()I

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    neg-int p1, p1

    .line 233
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 234
    .line 235
    :cond_6
    :goto_3
    invoke-virtual {p0}, LX0/j;->a()Landroid/graphics/Paint$FontMetricsInt;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 240
    .line 241
    iget p2, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 242
    .line 243
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 248
    .line 249
    invoke-virtual {p0}, LX0/j;->a()Landroid/graphics/Paint$FontMetricsInt;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 254
    .line 255
    iget p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 256
    .line 257
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 262
    .line 263
    :cond_7
    invoke-virtual {p0}, LX0/j;->d()I

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    return p1

    .line 268
    nop

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
