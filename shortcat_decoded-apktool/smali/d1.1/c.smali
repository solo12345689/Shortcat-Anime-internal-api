.class public abstract Ld1/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Ld1/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ld1/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ld1/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld1/c;->a:Ld1/c$a;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(Ljava/lang/String;FLU0/Y0;Ljava/util/List;Ljava/util/List;Li1/d;Lie/p;Z)Ljava/lang/CharSequence;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p7, :cond_2

    .line 3
    .line 4
    invoke-static {}, Landroidx/emoji2/text/e;->k()Z

    .line 5
    .line 6
    .line 7
    move-result p7

    .line 8
    if-eqz p7, :cond_2

    .line 9
    .line 10
    invoke-virtual {p2}, LU0/Y0;->y()LU0/G;

    .line 11
    .line 12
    .line 13
    move-result-object p7

    .line 14
    if-eqz p7, :cond_0

    .line 15
    .line 16
    invoke-virtual {p7}, LU0/G;->a()LU0/E;

    .line 17
    .line 18
    .line 19
    move-result-object p7

    .line 20
    if-eqz p7, :cond_0

    .line 21
    .line 22
    invoke-virtual {p7}, LU0/E;->b()I

    .line 23
    .line 24
    .line 25
    move-result p7

    .line 26
    invoke-static {p7}, LU0/i;->d(I)LU0/i;

    .line 27
    .line 28
    .line 29
    move-result-object p7

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p7, 0x0

    .line 32
    :goto_0
    sget-object v1, LU0/i;->b:LU0/i$a;

    .line 33
    .line 34
    invoke-virtual {v1}, LU0/i$a;->a()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez p7, :cond_1

    .line 39
    .line 40
    move v6, v0

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p7}, LU0/i;->j()I

    .line 43
    .line 44
    .line 45
    move-result p7

    .line 46
    invoke-static {p7, v1}, LU0/i;->g(II)Z

    .line 47
    .line 48
    .line 49
    move-result p7

    .line 50
    move v6, p7

    .line 51
    :goto_1
    invoke-static {}, Landroidx/emoji2/text/e;->c()Landroidx/emoji2/text/e;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const v5, 0x7fffffff

    .line 60
    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    move-object v2, p0

    .line 64
    invoke-virtual/range {v1 .. v6}, Landroidx/emoji2/text/e;->u(Ljava/lang/CharSequence;IIII)Ljava/lang/CharSequence;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move-object v2, p0

    .line 73
    move-object p0, v2

    .line 74
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result p7

    .line 78
    if-eqz p7, :cond_3

    .line 79
    .line 80
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result p7

    .line 84
    if-eqz p7, :cond_3

    .line 85
    .line 86
    invoke-virtual {p2}, LU0/Y0;->F()Lg1/s;

    .line 87
    .line 88
    .line 89
    move-result-object p7

    .line 90
    sget-object v1, Lg1/s;->c:Lg1/s$a;

    .line 91
    .line 92
    invoke-virtual {v1}, Lg1/s$a;->a()Lg1/s;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {p7, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p7

    .line 100
    if-eqz p7, :cond_3

    .line 101
    .line 102
    invoke-virtual {p2}, LU0/Y0;->u()J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    invoke-static {v3, v4}, Li1/v;->f(J)J

    .line 107
    .line 108
    .line 109
    move-result-wide v3

    .line 110
    const-wide/16 v5, 0x0

    .line 111
    .line 112
    cmp-long p7, v3, v5

    .line 113
    .line 114
    if-nez p7, :cond_3

    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_3
    instance-of p7, p0, Landroid/text/Spannable;

    .line 118
    .line 119
    if-eqz p7, :cond_4

    .line 120
    .line 121
    check-cast p0, Landroid/text/Spannable;

    .line 122
    .line 123
    move-object v1, p0

    .line 124
    goto :goto_3

    .line 125
    :cond_4
    new-instance p7, Landroid/text/SpannableString;

    .line 126
    .line 127
    invoke-direct {p7, p0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 128
    .line 129
    .line 130
    move-object v1, p7

    .line 131
    :goto_3
    invoke-virtual {p2}, LU0/Y0;->C()Lg1/k;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    sget-object p7, Lg1/k;->b:Lg1/k$a;

    .line 136
    .line 137
    invoke-virtual {p7}, Lg1/k$a;->d()Lg1/k;

    .line 138
    .line 139
    .line 140
    move-result-object p7

    .line 141
    invoke-static {p0, p7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    if-eqz p0, :cond_5

    .line 146
    .line 147
    sget-object p0, Ld1/c;->a:Ld1/c$a;

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 150
    .line 151
    .line 152
    move-result p7

    .line 153
    invoke-static {v1, p0, v0, p7}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 154
    .line 155
    .line 156
    :cond_5
    invoke-static {p2}, Ld1/c;->b(LU0/Y0;)Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-eqz p0, :cond_6

    .line 161
    .line 162
    invoke-virtual {p2}, LU0/Y0;->v()Lg1/h;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-nez p0, :cond_6

    .line 167
    .line 168
    invoke-virtual {p2}, LU0/Y0;->u()J

    .line 169
    .line 170
    .line 171
    move-result-wide v2

    .line 172
    invoke-static {v1, v2, v3, p1, p5}, Le1/d;->u(Landroid/text/Spannable;JFLi1/d;)V

    .line 173
    .line 174
    .line 175
    move v4, p1

    .line 176
    move-object v5, p5

    .line 177
    goto :goto_4

    .line 178
    :cond_6
    invoke-virtual {p2}, LU0/Y0;->v()Lg1/h;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    if-nez p0, :cond_7

    .line 183
    .line 184
    sget-object p0, Lg1/h;->d:Lg1/h$b;

    .line 185
    .line 186
    invoke-virtual {p0}, Lg1/h$b;->a()Lg1/h;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    :cond_7
    move-object v6, p0

    .line 191
    invoke-virtual {p2}, LU0/Y0;->u()J

    .line 192
    .line 193
    .line 194
    move-result-wide v2

    .line 195
    move v4, p1

    .line 196
    move-object v5, p5

    .line 197
    invoke-static/range {v1 .. v6}, Le1/d;->t(Landroid/text/Spannable;JFLi1/d;Lg1/h;)V

    .line 198
    .line 199
    .line 200
    :goto_4
    invoke-virtual {p2}, LU0/Y0;->F()Lg1/s;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-static {v1, p0, v4, v5}, Le1/d;->B(Landroid/text/Spannable;Lg1/s;FLi1/d;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v1, p2, p3, v5, p6}, Le1/d;->z(Landroid/text/Spannable;LU0/Y0;Ljava/util/List;Li1/d;Lie/p;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2}, LU0/Y0;->F()Lg1/s;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-static {v1, p3, v4, v5, p0}, Le1/d;->l(Landroid/text/Spannable;Ljava/util/List;FLi1/d;Lg1/s;)V

    .line 215
    .line 216
    .line 217
    invoke-static {v1, p4, v5}, Le1/b;->b(Landroid/text/Spannable;Ljava/util/List;Li1/d;)V

    .line 218
    .line 219
    .line 220
    return-object v1
.end method

.method public static final b(LU0/Y0;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, LU0/Y0;->y()LU0/G;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LU0/G;->a()LU0/E;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, LU0/E;->c()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method
