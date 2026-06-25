.class public final Laf/u;
.super Laf/n;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Laf/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laf/u$a;,
        Laf/u$b;
    }
.end annotation


# instance fields
.field private final m:Laf/z;

.field private final n:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Laf/z;)V
    .locals 1

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Laf/n;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Laf/u;->m:Laf/z;

    .line 10
    .line 11
    invoke-virtual {p1}, Laf/z;->p0()Z

    .line 12
    .line 13
    .line 14
    new-instance p1, Laf/o;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Laf/o;-><init>(Laf/u;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Laf/u;->n:Lkotlin/Lazy;

    .line 24
    .line 25
    return-void
.end method

.method static synthetic A1(Laf/u;Ljava/lang/StringBuilder;Lze/a;Lze/e;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Laf/u;->z1(Ljava/lang/StringBuilder;Lze/a;Lze/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method static synthetic A2(Laf/u;Lye/u0;Ljava/lang/StringBuilder;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Laf/u;->z2(Lye/u0;Ljava/lang/StringBuilder;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final B1(Lye/i;Ljava/lang/StringBuilder;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lye/i;->q()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getDeclaredTypeParameters(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Lye/h;->l()Lqf/v0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Lqf/v0;->getParameters()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getParameters(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Laf/u;->j1()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Lye/i;->A()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-le p1, v2, :cond_0

    .line 44
    .line 45
    const-string p1, " /*captured type parameters: "

    .line 46
    .line 47
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-interface {v1, p1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {p0, p2, p1}, Laf/u;->x2(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    const-string p1, "*/"

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    :cond_0
    return-void
.end method

.method private final B2(Lye/t0;ZLjava/lang/StringBuilder;Z)V
    .locals 8

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    const-string v2, "value-parameter"

    .line 4
    .line 5
    invoke-direct {p0, v2}, Laf/u;->S1(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v2, " "

    .line 13
    .line 14
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Laf/u;->j1()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    const-string v2, "/*"

    .line 24
    .line 25
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Lye/t0;->getIndex()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, "*/ "

    .line 36
    .line 37
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    :cond_1
    const/4 v4, 0x2

    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    move-object v0, p0

    .line 44
    move-object v2, p1

    .line 45
    move-object v1, p3

    .line 46
    invoke-static/range {v0 .. v5}, Laf/u;->A1(Laf/u;Ljava/lang/StringBuilder;Lze/a;Lze/e;ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1}, Lye/t0;->s0()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const-string v3, "crossinline"

    .line 54
    .line 55
    invoke-direct {p0, p3, v2, v3}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Lye/t0;->r0()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const-string v3, "noinline"

    .line 63
    .line 64
    invoke-direct {p0, p3, v2, v3}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Laf/u;->Y0()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/4 v6, 0x0

    .line 72
    const/4 v7, 0x1

    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    invoke-interface {p1}, Lye/t0;->b()Lye/a;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    instance-of v3, v2, Lye/d;

    .line 80
    .line 81
    if-eqz v3, :cond_2

    .line 82
    .line 83
    check-cast v2, Lye/d;

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    const/4 v2, 0x0

    .line 87
    :goto_0
    if-eqz v2, :cond_3

    .line 88
    .line 89
    invoke-interface {v2}, Lye/l;->e0()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-ne v2, v7, :cond_3

    .line 94
    .line 95
    move v5, v7

    .line 96
    goto :goto_1

    .line 97
    :cond_3
    move v5, v6

    .line 98
    :goto_1
    if-eqz v5, :cond_4

    .line 99
    .line 100
    invoke-virtual {p0}, Laf/u;->t0()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const-string v3, "actual"

    .line 105
    .line 106
    invoke-direct {p0, p3, v2, v3}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    move-object v0, p0

    .line 110
    move-object v1, p1

    .line 111
    move v2, p2

    .line 112
    move-object v3, p3

    .line 113
    move v4, p4

    .line 114
    invoke-direct/range {v0 .. v5}, Laf/u;->D2(Lye/u0;ZLjava/lang/StringBuilder;ZZ)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Laf/u;->z0()Lkotlin/jvm/functions/Function1;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    invoke-virtual {p0}, Laf/u;->i()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_5

    .line 128
    .line 129
    invoke-interface {p1}, Lye/t0;->B0()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    goto :goto_2

    .line 134
    :cond_5
    invoke-static {p1}, Lff/e;->f(Lye/t0;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    :goto_2
    if-eqz v0, :cond_6

    .line 139
    .line 140
    move v6, v7

    .line 141
    :cond_6
    if-eqz v6, :cond_7

    .line 142
    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    const-string v2, " = "

    .line 149
    .line 150
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Laf/u;->z0()Lkotlin/jvm/functions/Function1;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    :cond_7
    return-void
.end method

.method private final C0()Laf/u;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->n:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Laf/u;

    .line 8
    .line 9
    return-object v0
.end method

.method private final C1(Lye/e;Ljava/lang/StringBuilder;)V
    .locals 10

    .line 1
    invoke-interface {p1}, Lye/e;->h()Lye/f;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    sget-object v3, Lye/f;->e:Lye/f;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x1

    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    move v8, v7

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v8, v6

    .line 14
    :goto_0
    invoke-virtual {p0}, Laf/u;->d1()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const-string v9, "getVisibility(...)"

    .line 19
    .line 20
    if-nez v2, :cond_a

    .line 21
    .line 22
    invoke-interface {p1}, Lye/e;->Z()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "getContextReceivers(...)"

    .line 27
    .line 28
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v2, p2}, Laf/u;->J1(Ljava/util/List;Ljava/lang/StringBuilder;)V

    .line 32
    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    move-object v0, p0

    .line 38
    move-object v2, p1

    .line 39
    move-object v1, p2

    .line 40
    invoke-static/range {v0 .. v5}, Laf/u;->A1(Laf/u;Ljava/lang/StringBuilder;Lze/a;Lze/e;ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    if-nez v8, :cond_1

    .line 44
    .line 45
    invoke-interface {p1}, Lye/e;->getVisibility()Lye/u;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v2, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, v2, p2}, Laf/u;->E2(Lye/u;Ljava/lang/StringBuilder;)Z

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-interface {p1}, Lye/e;->h()Lye/f;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    sget-object v3, Lye/f;->c:Lye/f;

    .line 60
    .line 61
    if-ne v2, v3, :cond_2

    .line 62
    .line 63
    invoke-interface {p1}, Lye/e;->r()Lye/E;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    sget-object v3, Lye/E;->e:Lye/E;

    .line 68
    .line 69
    if-eq v2, v3, :cond_4

    .line 70
    .line 71
    :cond_2
    invoke-interface {p1}, Lye/e;->h()Lye/f;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2}, Lye/f;->b()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    invoke-interface {p1}, Lye/e;->r()Lye/E;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    sget-object v3, Lye/E;->b:Lye/E;

    .line 86
    .line 87
    if-eq v2, v3, :cond_4

    .line 88
    .line 89
    :cond_3
    invoke-interface {p1}, Lye/e;->r()Lye/E;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    const-string v3, "getModality(...)"

    .line 94
    .line 95
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-direct/range {p0 .. p1}, Laf/u;->r1(Lye/D;)Lye/E;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-direct {p0, v2, p2, v3}, Laf/u;->W1(Lye/E;Ljava/lang/StringBuilder;Lye/E;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    invoke-direct/range {p0 .. p2}, Laf/u;->U1(Lye/D;Ljava/lang/StringBuilder;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    sget-object v3, Laf/v;->i:Laf/v;

    .line 113
    .line 114
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_5

    .line 119
    .line 120
    invoke-interface {p1}, Lye/i;->A()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_5

    .line 125
    .line 126
    move v2, v7

    .line 127
    goto :goto_1

    .line 128
    :cond_5
    move v2, v6

    .line 129
    :goto_1
    const-string v3, "inner"

    .line 130
    .line 131
    invoke-direct {p0, p2, v2, v3}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    sget-object v3, Laf/v;->k:Laf/v;

    .line 139
    .line 140
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_6

    .line 145
    .line 146
    invoke-interface {p1}, Lye/e;->I0()Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_6

    .line 151
    .line 152
    move v2, v7

    .line 153
    goto :goto_2

    .line 154
    :cond_6
    move v2, v6

    .line 155
    :goto_2
    const-string v3, "data"

    .line 156
    .line 157
    invoke-direct {p0, p2, v2, v3}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    sget-object v3, Laf/v;->l:Laf/v;

    .line 165
    .line 166
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eqz v2, :cond_7

    .line 171
    .line 172
    invoke-interface {p1}, Lye/e;->isInline()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_7

    .line 177
    .line 178
    move v2, v7

    .line 179
    goto :goto_3

    .line 180
    :cond_7
    move v2, v6

    .line 181
    :goto_3
    const-string v3, "inline"

    .line 182
    .line 183
    invoke-direct {p0, p2, v2, v3}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    sget-object v3, Laf/v;->r:Laf/v;

    .line 191
    .line 192
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    if-eqz v2, :cond_8

    .line 197
    .line 198
    invoke-interface {p1}, Lye/e;->s()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_8

    .line 203
    .line 204
    move v2, v7

    .line 205
    goto :goto_4

    .line 206
    :cond_8
    move v2, v6

    .line 207
    :goto_4
    const-string v3, "value"

    .line 208
    .line 209
    invoke-direct {p0, p2, v2, v3}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    sget-object v3, Laf/v;->q:Laf/v;

    .line 217
    .line 218
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_9

    .line 223
    .line 224
    invoke-interface {p1}, Lye/e;->g0()Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-eqz v2, :cond_9

    .line 229
    .line 230
    move v2, v7

    .line 231
    goto :goto_5

    .line 232
    :cond_9
    move v2, v6

    .line 233
    :goto_5
    const-string v3, "fun"

    .line 234
    .line 235
    invoke-direct {p0, p2, v2, v3}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-direct/range {p0 .. p2}, Laf/u;->D1(Lye/e;Ljava/lang/StringBuilder;)V

    .line 239
    .line 240
    .line 241
    :cond_a
    invoke-static {p1}, Lbf/i;->x(Lye/m;)Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-nez v2, :cond_c

    .line 246
    .line 247
    invoke-virtual {p0}, Laf/u;->d1()Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-nez v2, :cond_b

    .line 252
    .line 253
    invoke-direct {p0, p2}, Laf/u;->m2(Ljava/lang/StringBuilder;)V

    .line 254
    .line 255
    .line 256
    :cond_b
    invoke-direct {p0, p1, p2, v7}, Laf/u;->Z1(Lye/m;Ljava/lang/StringBuilder;Z)V

    .line 257
    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_c
    invoke-direct/range {p0 .. p2}, Laf/u;->F1(Lye/m;Ljava/lang/StringBuilder;)V

    .line 261
    .line 262
    .line 263
    :goto_6
    if-eqz v8, :cond_d

    .line 264
    .line 265
    return-void

    .line 266
    :cond_d
    invoke-interface {p1}, Lye/e;->q()Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    const-string v2, "getDeclaredTypeParameters(...)"

    .line 271
    .line 272
    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-direct {p0, v7, p2, v6}, Laf/u;->y2(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    .line 276
    .line 277
    .line 278
    invoke-direct/range {p0 .. p2}, Laf/u;->B1(Lye/i;Ljava/lang/StringBuilder;)V

    .line 279
    .line 280
    .line 281
    invoke-interface {p1}, Lye/e;->h()Lye/f;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-virtual {v2}, Lye/f;->b()Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-nez v2, :cond_e

    .line 290
    .line 291
    invoke-virtual {p0}, Laf/u;->x0()Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-eqz v2, :cond_e

    .line 296
    .line 297
    invoke-interface {p1}, Lye/e;->D()Lye/d;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    if-eqz v2, :cond_e

    .line 302
    .line 303
    const-string v3, " "

    .line 304
    .line 305
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    const/4 v4, 0x2

    .line 309
    const/4 v5, 0x0

    .line 310
    const/4 v3, 0x0

    .line 311
    move-object v0, p0

    .line 312
    move-object v1, p2

    .line 313
    invoke-static/range {v0 .. v5}, Laf/u;->A1(Laf/u;Ljava/lang/StringBuilder;Lze/a;Lze/e;ILjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    invoke-interface {v2}, Lye/D;->getVisibility()Lye/u;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-static {v3, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-direct {p0, v3, p2}, Laf/u;->E2(Lye/u;Ljava/lang/StringBuilder;)Z

    .line 324
    .line 325
    .line 326
    const-string v3, "constructor"

    .line 327
    .line 328
    invoke-direct {p0, v3}, Laf/u;->S1(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-interface {v2}, Lye/a;->j()Ljava/util/List;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    const-string v4, "getValueParameters(...)"

    .line 340
    .line 341
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-interface {v2}, Lye/a;->i0()Z

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    invoke-direct {p0, v3, v2, p2}, Laf/u;->C2(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V

    .line 349
    .line 350
    .line 351
    :cond_e
    invoke-direct/range {p0 .. p2}, Laf/u;->n2(Lye/e;Ljava/lang/StringBuilder;)V

    .line 352
    .line 353
    .line 354
    invoke-direct {p0, v7, p2}, Laf/u;->F2(Ljava/util/List;Ljava/lang/StringBuilder;)V

    .line 355
    .line 356
    .line 357
    return-void
.end method

.method private final C2(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V
    .locals 6

    .line 1
    invoke-direct {p0, p2}, Laf/u;->H2(Z)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Laf/u;->i1()Laf/n$b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1, v0, p3}, Laf/n$b;->b(ILjava/lang/StringBuilder;)V

    .line 14
    .line 15
    .line 16
    check-cast p1, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    add-int/lit8 v3, v2, 0x1

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lye/t0;

    .line 37
    .line 38
    invoke-virtual {p0}, Laf/u;->i1()Laf/n$b;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-interface {v5, v4, v2, v0, p3}, Laf/n$b;->a(Lye/t0;IILjava/lang/StringBuilder;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v4, p2, p3, v1}, Laf/u;->B2(Lye/t0;ZLjava/lang/StringBuilder;Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Laf/u;->i1()Laf/n$b;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-interface {v5, v4, v2, v0, p3}, Laf/n$b;->c(Lye/t0;IILjava/lang/StringBuilder;)V

    .line 53
    .line 54
    .line 55
    move v2, v3

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p0}, Laf/u;->i1()Laf/n$b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p1, v0, p3}, Laf/n$b;->d(ILjava/lang/StringBuilder;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private final D1(Lye/e;Ljava/lang/StringBuilder;)V
    .locals 1

    .line 1
    sget-object v0, Laf/n;->a:Laf/n$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Laf/n$a;->a(Lye/i;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Laf/u;->S1(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final D2(Lye/u0;ZLjava/lang/StringBuilder;ZZ)V
    .locals 5

    .line 1
    invoke-interface {p1}, Lye/s0;->getType()Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getType(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    instance-of v1, p1, Lye/t0;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    move-object v1, p1

    .line 16
    check-cast v1, Lye/t0;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v1, v2

    .line 20
    :goto_0
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Lye/t0;->v0()Lqf/S;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    :cond_1
    if-nez v2, :cond_2

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move-object v1, v2

    .line 31
    :goto_1
    if-eqz v2, :cond_3

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    goto :goto_2

    .line 35
    :cond_3
    const/4 v3, 0x0

    .line 36
    :goto_2
    const-string v4, "vararg"

    .line 37
    .line 38
    invoke-direct {p0, p3, v3, v4}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    if-nez p5, :cond_4

    .line 42
    .line 43
    if-eqz p4, :cond_5

    .line 44
    .line 45
    invoke-virtual {p0}, Laf/u;->d1()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_5

    .line 50
    .line 51
    :cond_4
    invoke-direct {p0, p1, p3, p5}, Laf/u;->z2(Lye/u0;Ljava/lang/StringBuilder;Z)V

    .line 52
    .line 53
    .line 54
    :cond_5
    if-eqz p2, :cond_6

    .line 55
    .line 56
    invoke-direct {p0, p1, p3, p4}, Laf/u;->Z1(Lye/m;Ljava/lang/StringBuilder;Z)V

    .line 57
    .line 58
    .line 59
    const-string p2, ": "

    .line 60
    .line 61
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_6
    invoke-virtual {p0, v1}, Laf/u;->S(Lqf/S;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-direct {p0, p1, p3}, Laf/u;->R1(Lye/u0;Ljava/lang/StringBuilder;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Laf/u;->j1()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_7

    .line 79
    .line 80
    if-eqz v2, :cond_7

    .line 81
    .line 82
    const-string p1, " /*"

    .line 83
    .line 84
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v0}, Laf/u;->S(Lqf/S;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string p1, "*/"

    .line 95
    .line 96
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    :cond_7
    return-void
.end method

.method private final E2(Lye/u;Ljava/lang/StringBuilder;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Laf/v;->e:Laf/v;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-virtual {p0}, Laf/u;->J0()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Lye/u;->f()Lye/u;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :cond_1
    invoke-virtual {p0}, Laf/u;->X0()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    sget-object v0, Lye/t;->l:Lye/u;

    .line 32
    .line 33
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    return v1

    .line 40
    :cond_2
    invoke-virtual {p1}, Lye/u;->c()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {p0, p1}, Laf/u;->S1(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p1, " "

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1
.end method

.method private final F1(Lye/m;Ljava/lang/StringBuilder;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Laf/u;->S0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "getName(...)"

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Laf/u;->d1()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v0, "companion object"

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-direct {p0, p2}, Laf/u;->m2(Ljava/lang/StringBuilder;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Lye/m;->b()Lye/m;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const-string v2, "of "

    .line 30
    .line 31
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Lye/J;->getName()LXe/f;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-virtual {p0, v0, v2}, Laf/u;->R(LXe/f;Z)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {p0}, Laf/u;->j1()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v2, LXe/h;->d:LXe/f;

    .line 60
    .line 61
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-void

    .line 69
    :cond_3
    :goto_0
    invoke-virtual {p0}, Laf/u;->d1()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    invoke-direct {p0, p2}, Laf/u;->m2(Ljava/lang/StringBuilder;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/4 v0, 0x1

    .line 86
    invoke-virtual {p0, p1, v0}, Laf/u;->R(LXe/f;Z)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method private final F2(Ljava/util/List;Ljava/lang/StringBuilder;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Laf/u;->o1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lye/m0;

    .line 30
    .line 31
    invoke-interface {v2}, Lye/m0;->getUpperBounds()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, "getUpperBounds(...)"

    .line 36
    .line 37
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    invoke-static {v3, v4}, LUd/u;->g0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Lqf/S;

    .line 60
    .line 61
    new-instance v5, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-interface {v2}, Lye/J;->getName()LXe/f;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    const-string v7, "getName(...)"

    .line 71
    .line 72
    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v6, v0}, Laf/u;->R(LXe/f;Z)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v6, " : "

    .line 83
    .line 84
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v4}, Laf/u;->S(Lqf/S;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_3

    .line 110
    .line 111
    const-string p1, " "

    .line 112
    .line 113
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v0, "where"

    .line 117
    .line 118
    invoke-direct {p0, v0}, Laf/u;->S1(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const/16 v9, 0x7c

    .line 129
    .line 130
    const/4 v10, 0x0

    .line 131
    const-string v3, ", "

    .line 132
    .line 133
    const/4 v4, 0x0

    .line 134
    const/4 v5, 0x0

    .line 135
    const/4 v6, 0x0

    .line 136
    const/4 v7, 0x0

    .line 137
    const/4 v8, 0x0

    .line 138
    move-object v2, p2

    .line 139
    invoke-static/range {v1 .. v10}, LUd/u;->u0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;

    .line 140
    .line 141
    .line 142
    :cond_3
    :goto_1
    return-void
.end method

.method private final G1(Ldf/g;)Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->P()Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    instance-of v0, p1, Ldf/b;

    .line 17
    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    check-cast p1, Ldf/b;

    .line 21
    .line 22
    invoke-virtual {p1}, Ldf/g;->b()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ljava/lang/Iterable;

    .line 27
    .line 28
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ldf/g;

    .line 48
    .line 49
    invoke-direct {p0, v1}, Laf/u;->G1(Ldf/g;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/16 v7, 0x38

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    const-string v1, ", "

    .line 63
    .line 64
    const-string v2, "{"

    .line 65
    .line 66
    const-string v3, "}"

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    invoke-static/range {v0 .. v8}, LUd/u;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :cond_3
    instance-of v0, p1, Ldf/a;

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    check-cast p1, Ldf/a;

    .line 81
    .line 82
    invoke-virtual {p1}, Ldf/g;->b()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lze/c;

    .line 87
    .line 88
    const/4 v0, 0x2

    .line 89
    const/4 v1, 0x0

    .line 90
    invoke-static {p0, p1, v1, v0, v1}, Laf/n;->O(Laf/n;Lze/c;Lze/e;ILjava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string v0, "@"

    .line 95
    .line 96
    invoke-static {p1, v0}, LDf/r;->C0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :cond_4
    instance-of v0, p1, Ldf/s;

    .line 102
    .line 103
    if-eqz v0, :cond_8

    .line 104
    .line 105
    check-cast p1, Ldf/s;

    .line 106
    .line 107
    invoke-virtual {p1}, Ldf/g;->b()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Ldf/s$b;

    .line 112
    .line 113
    instance-of v0, p1, Ldf/s$b$a;

    .line 114
    .line 115
    const-string v1, "::class"

    .line 116
    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    check-cast p1, Ldf/s$b$a;

    .line 125
    .line 126
    invoke-virtual {p1}, Ldf/s$b$a;->a()Lqf/S;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1

    .line 141
    :cond_5
    instance-of v0, p1, Ldf/s$b$b;

    .line 142
    .line 143
    if-eqz v0, :cond_7

    .line 144
    .line 145
    check-cast p1, Ldf/s$b$b;

    .line 146
    .line 147
    invoke-virtual {p1}, Ldf/s$b$b;->b()LXe/b;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, LXe/b;->a()LXe/c;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, LXe/c;->a()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {p1}, Ldf/s$b$b;->a()I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    const/4 v2, 0x0

    .line 164
    :goto_1
    if-ge v2, p1, :cond_6

    .line 165
    .line 166
    new-instance v3, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    const-string v4, "kotlin.Array<"

    .line 172
    .line 173
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const/16 v0, 0x3e

    .line 180
    .line 181
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    add-int/lit8 v2, v2, 0x1

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    return-object p1

    .line 207
    :cond_7
    new-instance p1, LTd/r;

    .line 208
    .line 209
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 210
    .line 211
    .line 212
    throw p1

    .line 213
    :cond_8
    invoke-virtual {p1}, Ldf/g;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    return-object p1
.end method

.method private final G2(Lqf/S;)Z
    .locals 1

    .line 1
    invoke-static {p1}, Lve/h;->p(Lqf/S;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p1}, Lqf/S;->L0()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lqf/B0;

    .line 35
    .line 36
    invoke-interface {v0}, Lqf/B0;->a()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 44
    return p1

    .line 45
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 46
    return p1
.end method

.method private final H1(Lye/l;Ljava/lang/StringBuilder;)V
    .locals 17

    .line 1
    const/4 v4, 0x2

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v3, 0x0

    .line 4
    move-object/from16 v0, p0

    .line 5
    .line 6
    move-object/from16 v2, p1

    .line 7
    .line 8
    move-object/from16 v1, p2

    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Laf/u;->A1(Laf/u;Ljava/lang/StringBuilder;Lze/a;Lze/e;ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, Laf/u;->m:Laf/z;

    .line 14
    .line 15
    invoke-virtual {v2}, Laf/z;->X()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    invoke-interface/range {p1 .. p1}, Lye/l;->f0()Lye/e;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v2}, Lye/e;->r()Lye/E;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v5, Lye/E;->c:Lye/E;

    .line 32
    .line 33
    if-eq v2, v5, :cond_1

    .line 34
    .line 35
    :cond_0
    invoke-interface/range {p1 .. p1}, Lye/D;->getVisibility()Lye/u;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v5, "getVisibility(...)"

    .line 40
    .line 41
    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v2, v1}, Laf/u;->E2(Lye/u;Ljava/lang/StringBuilder;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    move v2, v4

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move v2, v3

    .line 53
    :goto_0
    invoke-direct/range {p0 .. p2}, Laf/u;->T1(Lye/b;Ljava/lang/StringBuilder;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Laf/u;->U0()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-nez v5, :cond_3

    .line 61
    .line 62
    invoke-interface/range {p1 .. p1}, Lye/l;->e0()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move v2, v3

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_1
    move v2, v4

    .line 74
    :goto_2
    if-eqz v2, :cond_4

    .line 75
    .line 76
    const-string v5, "constructor"

    .line 77
    .line 78
    invoke-direct {v0, v5}, Laf/u;->S1(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    :cond_4
    invoke-interface/range {p1 .. p1}, Lye/l;->b()Lye/i;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    const-string v6, "getContainingDeclaration(...)"

    .line 90
    .line 91
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Laf/u;->b1()Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    const-string v7, "getTypeParameters(...)"

    .line 99
    .line 100
    if-eqz v6, :cond_6

    .line 101
    .line 102
    if-eqz v2, :cond_5

    .line 103
    .line 104
    const-string v2, " "

    .line 105
    .line 106
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    :cond_5
    invoke-direct {v0, v5, v1, v4}, Laf/u;->Z1(Lye/m;Ljava/lang/StringBuilder;Z)V

    .line 110
    .line 111
    .line 112
    invoke-interface/range {p1 .. p1}, Lye/l;->getTypeParameters()Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v2, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-direct {v0, v2, v1, v3}, Laf/u;->y2(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    .line 120
    .line 121
    .line 122
    :cond_6
    invoke-interface/range {p1 .. p1}, Lye/a;->j()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const-string v3, "getValueParameters(...)"

    .line 127
    .line 128
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-interface/range {p1 .. p1}, Lye/a;->i0()Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    invoke-direct {v0, v2, v4, v1}, Laf/u;->C2(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Laf/u;->T0()Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_9

    .line 143
    .line 144
    invoke-interface/range {p1 .. p1}, Lye/l;->e0()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-nez v2, :cond_9

    .line 149
    .line 150
    instance-of v2, v5, Lye/e;

    .line 151
    .line 152
    if-eqz v2, :cond_9

    .line 153
    .line 154
    check-cast v5, Lye/e;

    .line 155
    .line 156
    invoke-interface {v5}, Lye/e;->D()Lye/d;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    if-eqz v2, :cond_9

    .line 161
    .line 162
    invoke-interface {v2}, Lye/a;->j()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    new-instance v8, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    :cond_7
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-eqz v3, :cond_8

    .line 183
    .line 184
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    move-object v4, v3

    .line 189
    check-cast v4, Lye/t0;

    .line 190
    .line 191
    invoke-interface {v4}, Lye/t0;->B0()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-nez v5, :cond_7

    .line 196
    .line 197
    invoke-interface {v4}, Lye/t0;->v0()Lqf/S;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    if-nez v4, :cond_7

    .line 202
    .line 203
    invoke-interface {v8, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_8
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-nez v2, :cond_9

    .line 212
    .line 213
    const-string v2, " : "

    .line 214
    .line 215
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v2, "this"

    .line 219
    .line 220
    invoke-direct {v0, v2}, Laf/u;->S1(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    sget-object v14, Laf/r;->a:Laf/r;

    .line 228
    .line 229
    const/16 v15, 0x18

    .line 230
    .line 231
    const/16 v16, 0x0

    .line 232
    .line 233
    const-string v9, ", "

    .line 234
    .line 235
    const-string v10, "("

    .line 236
    .line 237
    const-string v11, ")"

    .line 238
    .line 239
    const/4 v12, 0x0

    .line 240
    const/4 v13, 0x0

    .line 241
    invoke-static/range {v8 .. v16}, LUd/u;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    :cond_9
    invoke-virtual {v0}, Laf/u;->b1()Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_a

    .line 253
    .line 254
    invoke-interface/range {p1 .. p1}, Lye/l;->getTypeParameters()Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-static {v2, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-direct {v0, v2, v1}, Laf/u;->F2(Ljava/util/List;Ljava/lang/StringBuilder;)V

    .line 262
    .line 263
    .line 264
    :cond_a
    return-void
.end method

.method private final H2(Z)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Laf/u;->M0()Laf/D;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Laf/u$b;->b:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_3

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eq v0, v2, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x3

    .line 21
    if-ne v0, p1, :cond_0

    .line 22
    .line 23
    return v3

    .line 24
    :cond_0
    new-instance p1, LTd/r;

    .line 25
    .line 26
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    if-nez p1, :cond_2

    .line 31
    .line 32
    return v1

    .line 33
    :cond_2
    return v3

    .line 34
    :cond_3
    return v1
.end method

.method private static final I1(Lye/t0;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    const-string p0, ""

    .line 2
    .line 3
    return-object p0
.end method

.method private final J1(Ljava/util/List;Ljava/lang/StringBuilder;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const-string v0, "context("

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    add-int/lit8 v2, v1, 0x1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lye/c0;

    .line 30
    .line 31
    sget-object v4, Lze/e;->h:Lze/e;

    .line 32
    .line 33
    invoke-direct {p0, p2, v3, v4}, Laf/u;->z1(Ljava/lang/StringBuilder;Lze/a;Lze/e;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v3}, Lye/s0;->getType()Lqf/S;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "getType(...)"

    .line 41
    .line 42
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v3}, Laf/u;->N1(Lqf/S;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, LUd/u;->o(Ljava/util/List;)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-ne v1, v3, :cond_0

    .line 57
    .line 58
    const-string v1, ") "

    .line 59
    .line 60
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    const-string v1, ", "

    .line 65
    .line 66
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    :goto_1
    move v1, v2

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    return-void
.end method

.method private final K1(Ljava/lang/StringBuilder;Lqf/S;)V
    .locals 12

    .line 1
    const/4 v4, 0x2

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v3, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    invoke-static/range {v0 .. v5}, Laf/u;->A1(Laf/u;Ljava/lang/StringBuilder;Lze/a;Lze/e;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    instance-of p1, v2, Lqf/y;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    move-object p2, v2

    .line 15
    check-cast p2, Lqf/y;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p2, 0x0

    .line 19
    :goto_0
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2}, Lqf/y;->Z0()Lqf/d0;

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-static {v2}, Lqf/W;->a(Lqf/S;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_4

    .line 29
    .line 30
    invoke-static {v2}, Lvf/d;->z(Lqf/S;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Laf/u;->O0()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    sget-object p1, Lsf/l;->a:Lsf/l;

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Lsf/l;->p(Lqf/S;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {p0, p1}, Laf/u;->L1(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    instance-of p1, v2, Lsf/i;

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0}, Laf/u;->H0()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    move-object p2, v2

    .line 67
    check-cast p2, Lsf/i;

    .line 68
    .line 69
    invoke-virtual {p2}, Lsf/i;->W0()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-virtual {v2}, Lqf/S;->N0()Lqf/v0;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-virtual {v2}, Lqf/S;->L0()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p0, p1}, Laf/u;->r2(Ljava/util/List;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    const/4 v10, 0x2

    .line 101
    const/4 v11, 0x0

    .line 102
    const/4 v9, 0x0

    .line 103
    move-object v6, v0

    .line 104
    move-object v7, v1

    .line 105
    move-object v8, v2

    .line 106
    invoke-static/range {v6 .. v11}, Laf/u;->v2(Laf/u;Ljava/lang/StringBuilder;Lqf/S;Lqf/v0;ILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object p1, LTd/L;->a:LTd/L;

    .line 110
    .line 111
    :goto_2
    invoke-virtual {v2}, Lqf/S;->O0()Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_5

    .line 116
    .line 117
    const-string p1, "?"

    .line 118
    .line 119
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    :cond_5
    invoke-static {v2}, Lqf/h0;->c(Lqf/S;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_6

    .line 127
    .line 128
    const-string p1, " & Any"

    .line 129
    .line 130
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    :cond_6
    return-void
.end method

.method private final L1(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Laf/u;->e1()Laf/F;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Laf/u$b;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "<font color=red><b>"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p1, "</b></font>"

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_0
    new-instance p1, LTd/r;

    .line 43
    .line 44
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    return-object p1
.end method

.method private final M1(Ljava/lang/StringBuilder;Lqf/a;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Laf/u;->e1()Laf/F;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Laf/F;->b:Laf/F;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const-string v0, "<font color=\"808080\"><i>"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    :cond_0
    const-string v0, " /* "

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, "= "

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lqf/a;->G()Lqf/d0;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-direct {p0, p1, p2}, Laf/u;->b2(Ljava/lang/StringBuilder;Lqf/S;)V

    .line 29
    .line 30
    .line 31
    const-string p2, " */"

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Laf/u;->e1()Laf/F;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    if-ne p2, v1, :cond_1

    .line 41
    .line 42
    const-string p2, "</i></font>"

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method private final N1(Lqf/S;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Laf/u;->S(Lqf/S;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1}, Laf/u;->G2(Lqf/S;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lqf/J0;->l(Lqf/S;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    :cond_0
    instance-of p1, p1, Lqf/y;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const/16 v1, 0x28

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/16 v0, 0x29

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :cond_2
    return-object v0
.end method

.method private final O1(Ljava/util/List;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Laf/G;->c(Ljava/util/List;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Laf/u;->q0(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method private final P1(Lye/z;Ljava/lang/StringBuilder;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Laf/u;->d1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const-string v2, "getTypeParameters(...)"

    .line 7
    .line 8
    if-nez v0, :cond_5

    .line 9
    .line 10
    invoke-virtual {p0}, Laf/u;->c1()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    invoke-interface {p1}, Lye/a;->y0()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v3, "getContextReceiverParameters(...)"

    .line 21
    .line 22
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0, p2}, Laf/u;->J1(Ljava/util/List;Ljava/lang/StringBuilder;)V

    .line 26
    .line 27
    .line 28
    const/4 v8, 0x2

    .line 29
    const/4 v9, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    move-object v4, p0

    .line 32
    move-object v6, p1

    .line 33
    move-object v5, p2

    .line 34
    invoke-static/range {v4 .. v9}, Laf/u;->A1(Laf/u;Ljava/lang/StringBuilder;Lze/a;Lze/e;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v6}, Lye/D;->getVisibility()Lye/u;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string p2, "getVisibility(...)"

    .line 42
    .line 43
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, p1, v5}, Laf/u;->E2(Lye/u;Ljava/lang/StringBuilder;)Z

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v6, v5}, Laf/u;->X1(Lye/b;Ljava/lang/StringBuilder;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Laf/u;->D0()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    invoke-direct {p0, v6, v5}, Laf/u;->U1(Lye/D;Ljava/lang/StringBuilder;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-direct {p0, v6, v5}, Laf/u;->c2(Lye/b;Ljava/lang/StringBuilder;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Laf/u;->D0()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    invoke-direct {p0, v6, v5}, Laf/u;->x1(Lye/z;Ljava/lang/StringBuilder;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-direct {p0, v6, v5}, Laf/u;->p2(Lye/z;Ljava/lang/StringBuilder;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    invoke-direct {p0, v6, v5}, Laf/u;->T1(Lye/b;Ljava/lang/StringBuilder;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Laf/u;->j1()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    invoke-interface {v6}, Lye/z;->D0()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    const-string p1, "/*isHiddenToOvercomeSignatureClash*/ "

    .line 93
    .line 94
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    :cond_2
    invoke-interface {v6}, Lye/z;->G0()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    const-string p1, "/*isHiddenForResolutionEverywhereBesideSupercalls*/ "

    .line 104
    .line 105
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    move-object v4, p0

    .line 110
    move-object v6, p1

    .line 111
    move-object v5, p2

    .line 112
    :cond_4
    :goto_1
    const-string p1, "fun"

    .line 113
    .line 114
    invoke-direct {p0, p1}, Laf/u;->S1(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p1, " "

    .line 122
    .line 123
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-interface {v6}, Lye/a;->getTypeParameters()Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {p0, p1, v5, v1}, Laf/u;->y2(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    .line 134
    .line 135
    .line 136
    invoke-direct {p0, v6, v5}, Laf/u;->j2(Lye/a;Ljava/lang/StringBuilder;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    move-object v4, p0

    .line 141
    move-object v6, p1

    .line 142
    move-object v5, p2

    .line 143
    :goto_2
    invoke-direct {p0, v6, v5, v1}, Laf/u;->Z1(Lye/m;Ljava/lang/StringBuilder;Z)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v6}, Lye/a;->j()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    const-string p2, "getValueParameters(...)"

    .line 151
    .line 152
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v6}, Lye/a;->i0()Z

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    invoke-direct {p0, p1, p2, v5}, Laf/u;->C2(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V

    .line 160
    .line 161
    .line 162
    invoke-direct {p0, v6, v5}, Laf/u;->k2(Lye/a;Ljava/lang/StringBuilder;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v6}, Lye/a;->getReturnType()Lqf/S;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p0}, Laf/u;->m1()Z

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    if-nez p2, :cond_8

    .line 174
    .line 175
    invoke-virtual {p0}, Laf/u;->h1()Z

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    if-nez p2, :cond_6

    .line 180
    .line 181
    if-eqz p1, :cond_6

    .line 182
    .line 183
    invoke-static {p1}, Lve/i;->D0(Lqf/S;)Z

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    if-nez p2, :cond_8

    .line 188
    .line 189
    :cond_6
    const-string p2, ": "

    .line 190
    .line 191
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    if-nez p1, :cond_7

    .line 195
    .line 196
    const-string p1, "[NULL]"

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_7
    invoke-virtual {p0, p1}, Laf/u;->S(Lqf/S;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    :goto_3
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    :cond_8
    invoke-interface {v6}, Lye/a;->getTypeParameters()Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-direct {p0, p1, v5}, Laf/u;->F2(Ljava/util/List;Ljava/lang/StringBuilder;)V

    .line 214
    .line 215
    .line 216
    return-void
.end method

.method private final Q1(Ljava/lang/StringBuilder;Lqf/S;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Laf/u;->C0()Laf/u;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move-object v2, p1

    .line 13
    move-object v3, p2

    .line 14
    invoke-static/range {v1 .. v6}, Laf/u;->A1(Laf/u;Ljava/lang/StringBuilder;Lze/a;Lze/e;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 p2, 0x0

    .line 22
    const/4 v1, 0x1

    .line 23
    if-eq p1, v0, :cond_0

    .line 24
    .line 25
    move p1, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move p1, p2

    .line 28
    :goto_0
    invoke-static {v3}, Lve/h;->k(Lqf/S;)Lqf/S;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-static {v3}, Lve/h;->e(Lqf/S;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v3}, Lve/h;->r(Lqf/S;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-virtual {v3}, Lqf/S;->O0()Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-nez v7, :cond_2

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v8, p2

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    :goto_1
    move v8, v1

    .line 54
    :goto_2
    const-string v9, "("

    .line 55
    .line 56
    if-eqz v8, :cond_5

    .line 57
    .line 58
    if-eqz v6, :cond_3

    .line 59
    .line 60
    const/16 p1, 0x28

    .line 61
    .line 62
    invoke-virtual {v2, v0, p1}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    if-eqz p1, :cond_4

    .line 67
    .line 68
    invoke-static {v2}, LDf/r;->q1(Ljava/lang/CharSequence;)C

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-static {p1}, LDf/a;->c(C)Z

    .line 73
    .line 74
    .line 75
    invoke-static {v2}, LDf/r;->d0(Ljava/lang/CharSequence;)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    sub-int/2addr p1, v1

    .line 80
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    const/16 v0, 0x29

    .line 85
    .line 86
    if-eq p1, v0, :cond_4

    .line 87
    .line 88
    invoke-static {v2}, LDf/r;->d0(Ljava/lang/CharSequence;)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    const-string v0, "()"

    .line 93
    .line 94
    invoke-virtual {v2, p1, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    :cond_4
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :cond_5
    :goto_3
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    const-string v0, ") "

    .line 105
    .line 106
    const-string v10, ", "

    .line 107
    .line 108
    if-nez p1, :cond_7

    .line 109
    .line 110
    const-string p1, "context("

    .line 111
    .line 112
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-static {v5}, LUd/u;->o(Ljava/util/List;)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    invoke-interface {v5, p2, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    if-eqz v11, :cond_6

    .line 132
    .line 133
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    check-cast v11, Lqf/S;

    .line 138
    .line 139
    invoke-direct {p0, v2, v11}, Laf/u;->a2(Ljava/lang/StringBuilder;Lqf/S;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_6
    invoke-static {v5}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Lqf/S;

    .line 151
    .line 152
    invoke-direct {p0, v2, p1}, Laf/u;->a2(Ljava/lang/StringBuilder;Lqf/S;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    :cond_7
    const-string p1, "suspend"

    .line 159
    .line 160
    invoke-direct {p0, v2, v6, p1}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const-string p1, ")"

    .line 164
    .line 165
    if-eqz v4, :cond_d

    .line 166
    .line 167
    invoke-direct {p0, v4}, Laf/u;->G2(Lqf/S;)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_8

    .line 172
    .line 173
    invoke-virtual {v4}, Lqf/S;->O0()Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-eqz v5, :cond_a

    .line 178
    .line 179
    :cond_8
    invoke-direct {p0, v4}, Laf/u;->q1(Lqf/S;)Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-nez v5, :cond_a

    .line 184
    .line 185
    instance-of v5, v4, Lqf/y;

    .line 186
    .line 187
    if-eqz v5, :cond_9

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_9
    move v5, p2

    .line 191
    goto :goto_6

    .line 192
    :cond_a
    :goto_5
    move v5, v1

    .line 193
    :goto_6
    if-eqz v5, :cond_b

    .line 194
    .line 195
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    :cond_b
    invoke-direct {p0, v2, v4}, Laf/u;->a2(Ljava/lang/StringBuilder;Lqf/S;)V

    .line 199
    .line 200
    .line 201
    if-eqz v5, :cond_c

    .line 202
    .line 203
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    :cond_c
    const-string v4, "."

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    :cond_d
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-static {v3}, Lve/h;->n(Lqf/S;)Z

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    if-eqz v4, :cond_e

    .line 219
    .line 220
    invoke-virtual {v3}, Lqf/S;->L0()Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-gt v4, v1, :cond_e

    .line 229
    .line 230
    const-string p2, "???"

    .line 231
    .line 232
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    goto :goto_9

    .line 236
    :cond_e
    invoke-static {v3}, Lve/h;->m(Lqf/S;)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    move v4, p2

    .line 245
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    if-eqz v5, :cond_12

    .line 250
    .line 251
    add-int/lit8 v5, v4, 0x1

    .line 252
    .line 253
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    check-cast v6, Lqf/B0;

    .line 258
    .line 259
    if-lez v4, :cond_f

    .line 260
    .line 261
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    :cond_f
    invoke-virtual {p0}, Laf/u;->N0()Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-eqz v4, :cond_10

    .line 269
    .line 270
    invoke-interface {v6}, Lqf/B0;->getType()Lqf/S;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    const-string v9, "getType(...)"

    .line 275
    .line 276
    invoke-static {v4, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v4}, Lve/h;->d(Lqf/S;)LXe/f;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    goto :goto_8

    .line 284
    :cond_10
    const/4 v4, 0x0

    .line 285
    :goto_8
    if-eqz v4, :cond_11

    .line 286
    .line 287
    invoke-virtual {p0, v4, p2}, Laf/u;->R(LXe/f;Z)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    const-string v4, ": "

    .line 295
    .line 296
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    :cond_11
    invoke-virtual {p0, v6}, Laf/u;->T(Lqf/B0;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    move v4, v5

    .line 307
    goto :goto_7

    .line 308
    :cond_12
    :goto_9
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-direct {p0}, Laf/u;->p0()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p2

    .line 315
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    const-string p2, " "

    .line 319
    .line 320
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-static {v3}, Lve/h;->l(Lqf/S;)Lqf/S;

    .line 324
    .line 325
    .line 326
    move-result-object p2

    .line 327
    invoke-direct {p0, v2, p2}, Laf/u;->a2(Ljava/lang/StringBuilder;Lqf/S;)V

    .line 328
    .line 329
    .line 330
    if-eqz v8, :cond_13

    .line 331
    .line 332
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    :cond_13
    if-eqz v7, :cond_14

    .line 336
    .line 337
    const-string p1, "?"

    .line 338
    .line 339
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    :cond_14
    return-void
.end method

.method private final R1(Lye/u0;Ljava/lang/StringBuilder;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Laf/u;->G0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lye/u0;->q0()Ldf/g;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, p1}, Laf/u;->G1(Ldf/g;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const-string v0, " = "

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1}, Laf/u;->q0(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method private final S1(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Laf/u;->e1()Laf/F;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Laf/u$b;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Laf/u;->w0()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v1, "<b>"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p1, "</b>"

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_1
    new-instance p1, LTd/r;

    .line 50
    .line 51
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    :goto_0
    return-object p1
.end method

.method private final T1(Lye/b;Ljava/lang/StringBuilder;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Laf/v;->j:Laf/v;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Laf/u;->j1()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Lye/b;->h()Lye/b$a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Lye/b$a;->a:Lye/b$a;

    .line 25
    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    const-string v0, "/*"

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Lye/b;->h()Lye/b$a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lyf/a;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p1, "*/ "

    .line 49
    .line 50
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_0
    return-void
.end method

.method private final U1(Lye/D;Ljava/lang/StringBuilder;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lye/D;->isExternal()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "external"

    .line 6
    .line 7
    invoke-direct {p0, p2, v0, v1}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Laf/v;->m:Laf/v;

    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Lye/D;->m0()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    move v0, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v0, v1

    .line 33
    :goto_0
    const-string v3, "expect"

    .line 34
    .line 35
    invoke-direct {p0, p2, v0, v3}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v3, Laf/v;->n:Laf/v;

    .line 43
    .line 44
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-interface {p1}, Lye/D;->Y()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    move v1, v2

    .line 57
    :cond_1
    const-string p1, "actual"

    .line 58
    .line 59
    invoke-direct {p0, p2, v1, p1}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static final synthetic V(Laf/u;Lye/Y;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Laf/u;->w1(Lye/Y;Ljava/lang/StringBuilder;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic W(Laf/u;Lye/e;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Laf/u;->C1(Lye/e;Ljava/lang/StringBuilder;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final W1(Lye/E;Ljava/lang/StringBuilder;Lye/E;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Laf/u;->W0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    if-ne p1, p3, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    sget-object v0, Laf/v;->f:Laf/v;

    .line 15
    .line 16
    invoke-interface {p3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lyf/a;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p2, p3, p1}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final synthetic X(Laf/u;Lye/l;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Laf/u;->H1(Lye/l;Ljava/lang/StringBuilder;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final X1(Lye/b;Ljava/lang/StringBuilder;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lbf/i;->J(Lye/m;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lye/D;->r()Lye/E;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lye/E;->b:Lye/E;

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Laf/u;->L0()Laf/C;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Laf/C;->a:Laf/C;

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    invoke-interface {p1}, Lye/D;->r()Lye/E;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Lye/E;->d:Lye/E;

    .line 28
    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    invoke-direct {p0, p1}, Laf/u;->u1(Lye/b;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :cond_2
    invoke-interface {p1}, Lye/D;->r()Lye/E;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "getModality(...)"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p1}, Laf/u;->r1(Lye/D;)Lye/E;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p0, v0, p2, p1}, Laf/u;->W1(Lye/E;Ljava/lang/StringBuilder;Lye/E;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public static final synthetic Y(Laf/u;Lye/z;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Laf/u;->P1(Lye/z;Ljava/lang/StringBuilder;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p3}, Laf/u;->S1(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    const-string p2, " "

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public static final synthetic Z(Laf/u;Lye/m;Ljava/lang/StringBuilder;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Laf/u;->Z1(Lye/m;Ljava/lang/StringBuilder;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final Z1(Lye/m;Ljava/lang/StringBuilder;Z)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "getName(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p3}, Laf/u;->R(LXe/f;Z)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final synthetic a0(Laf/u;Lye/N;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Laf/u;->d2(Lye/N;Ljava/lang/StringBuilder;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final a2(Ljava/lang/StringBuilder;Lqf/S;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lqf/S;->Q0()Lqf/M0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lqf/a;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lqf/a;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-virtual {p0}, Laf/u;->Z0()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lqf/a;->G()Lqf/d0;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-direct {p0, p1, p2}, Laf/u;->b2(Ljava/lang/StringBuilder;Lqf/S;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Laf/u;->R0()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    invoke-direct {p0, p1, v0}, Laf/u;->v1(Ljava/lang/StringBuilder;Lqf/a;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual {v0}, Lqf/a;->Z0()Lqf/d0;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-direct {p0, p1, p2}, Laf/u;->b2(Ljava/lang/StringBuilder;Lqf/S;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Laf/u;->a1()Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    invoke-direct {p0, p1, v0}, Laf/u;->M1(Ljava/lang/StringBuilder;Lqf/a;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void

    .line 55
    :cond_3
    invoke-direct {p0, p1, p2}, Laf/u;->b2(Ljava/lang/StringBuilder;Lqf/S;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static final synthetic b0(Laf/u;Lye/V;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Laf/u;->f2(Lye/V;Ljava/lang/StringBuilder;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final b2(Ljava/lang/StringBuilder;Lqf/S;)V
    .locals 1

    .line 1
    instance-of v0, p2, Lqf/O0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Laf/u;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p2

    .line 12
    check-cast v0, Lqf/O0;

    .line 13
    .line 14
    invoke-virtual {v0}, Lqf/O0;->S0()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const-string p2, "<Not computed yet>"

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p2}, Lqf/S;->Q0()Lqf/M0;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    instance-of v0, p2, Lqf/I;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    check-cast p2, Lqf/I;

    .line 35
    .line 36
    invoke-virtual {p2, p0, p0}, Lqf/I;->X0(Laf/n;Laf/w;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    instance-of v0, p2, Lqf/d0;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    check-cast p2, Lqf/d0;

    .line 49
    .line 50
    invoke-direct {p0, p1, p2}, Laf/u;->l2(Ljava/lang/StringBuilder;Lqf/d0;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    new-instance p1, LTd/r;

    .line 55
    .line 56
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p1
.end method

.method public static final synthetic c0(Laf/u;Lye/Z;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Laf/u;->h2(Lye/Z;Ljava/lang/StringBuilder;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c2(Lye/b;Ljava/lang/StringBuilder;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Laf/v;->g:Laf/v;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-direct {p0, p1}, Laf/u;->u1(Lye/b;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Laf/u;->L0()Laf/C;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Laf/C;->b:Laf/C;

    .line 25
    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    const-string v1, "override"

    .line 30
    .line 31
    invoke-direct {p0, p2, v0, v1}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Laf/u;->j1()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    const-string v0, "/*"

    .line 41
    .line 42
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Lye/b;->e()Ljava/util/Collection;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p1, "*/ "

    .line 57
    .line 58
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    :cond_1
    :goto_0
    return-void
.end method

.method public static final synthetic d0(Laf/u;Lye/l0;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Laf/u;->q2(Lye/l0;Ljava/lang/StringBuilder;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final d2(Lye/N;Ljava/lang/StringBuilder;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lye/N;->f()LXe/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "package-fragment"

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, p2}, Laf/u;->e2(LXe/c;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Laf/u;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v0, " in "

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Lye/N;->b()Lye/H;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, p2, v0}, Laf/u;->Z1(Lye/m;Ljava/lang/StringBuilder;Z)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public static final synthetic e0(Laf/u;Lye/m0;Ljava/lang/StringBuilder;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Laf/u;->w2(Lye/m0;Ljava/lang/StringBuilder;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final e2(LXe/c;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Laf/u;->S1(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, LXe/c;->i()LXe/d;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Laf/u;->Q(LXe/d;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-lez p2, :cond_0

    .line 21
    .line 22
    const-string p2, " "

    .line 23
    .line 24
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public static final synthetic f0(Laf/u;Lye/t0;ZLjava/lang/StringBuilder;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Laf/u;->B2(Lye/t0;ZLjava/lang/StringBuilder;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final f2(Lye/V;Ljava/lang/StringBuilder;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lye/V;->f()LXe/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "package"

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, p2}, Laf/u;->e2(LXe/c;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Laf/u;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v0, " in context of "

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Lye/V;->C0()Lye/H;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, p2, v0}, Laf/u;->Z1(Lye/m;Ljava/lang/StringBuilder;Z)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method static synthetic g0(Laf/u;)Laf/u;
    .locals 0

    .line 1
    invoke-static {p0}, Laf/u;->r0(Laf/u;)Laf/u;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final g2(Ljava/lang/StringBuilder;Lye/X;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lye/X;->c()Lye/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1, v0}, Laf/u;->g2(Ljava/lang/StringBuilder;Lye/X;)V

    .line 8
    .line 9
    .line 10
    const/16 v0, 0x2e

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lye/X;->b()Lye/i;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Lye/J;->getName()LXe/f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "getName(...)"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {p0, v0, v1}, Laf/u;->R(LXe/f;Z)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p2}, Lye/X;->b()Lye/i;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0}, Lye/h;->l()Lqf/v0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, "getTypeConstructor(...)"

    .line 46
    .line 47
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Laf/u;->s2(Lqf/v0;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-virtual {p2}, Lye/X;->a()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p0, p2}, Laf/u;->r2(Ljava/util/List;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method static synthetic h0(Lqf/S;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Laf/u;->t2(Lqf/S;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final h2(Lye/Z;Ljava/lang/StringBuilder;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Laf/u;->d1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "getTypeParameters(...)"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Laf/u;->c1()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    invoke-interface {p1}, Lye/a;->y0()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v3, "getContextReceiverParameters(...)"

    .line 21
    .line 22
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0, p2}, Laf/u;->J1(Ljava/util/List;Ljava/lang/StringBuilder;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1, p2}, Laf/u;->i2(Lye/Z;Ljava/lang/StringBuilder;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Lye/D;->getVisibility()Lye/u;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v3, "getVisibility(...)"

    .line 36
    .line 37
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v0, p2}, Laf/u;->E2(Lye/u;Ljava/lang/StringBuilder;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v3, Laf/v;->o:Laf/v;

    .line 48
    .line 49
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v3, 0x0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    invoke-interface {p1}, Lye/u0;->d0()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    move v0, v2

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move v0, v3

    .line 65
    :goto_0
    const-string v4, "const"

    .line 66
    .line 67
    invoke-direct {p0, p2, v0, v4}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, p1, p2}, Laf/u;->U1(Lye/D;Ljava/lang/StringBuilder;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, p1, p2}, Laf/u;->X1(Lye/b;Ljava/lang/StringBuilder;)V

    .line 74
    .line 75
    .line 76
    invoke-direct {p0, p1, p2}, Laf/u;->c2(Lye/b;Ljava/lang/StringBuilder;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v4, Laf/v;->p:Laf/v;

    .line 84
    .line 85
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_1

    .line 90
    .line 91
    invoke-interface {p1}, Lye/u0;->z0()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_1

    .line 96
    .line 97
    move v3, v2

    .line 98
    :cond_1
    const-string v0, "lateinit"

    .line 99
    .line 100
    invoke-direct {p0, p2, v3, v0}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-direct {p0, p1, p2}, Laf/u;->T1(Lye/b;Ljava/lang/StringBuilder;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    const/4 v8, 0x4

    .line 107
    const/4 v9, 0x0

    .line 108
    const/4 v7, 0x0

    .line 109
    move-object v4, p0

    .line 110
    move-object v5, p1

    .line 111
    move-object v6, p2

    .line 112
    invoke-static/range {v4 .. v9}, Laf/u;->A2(Laf/u;Lye/u0;Ljava/lang/StringBuilder;ZILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v5}, Lye/a;->getTypeParameters()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-direct {p0, p1, v6, v2}, Laf/u;->y2(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    .line 123
    .line 124
    .line 125
    invoke-direct {p0, v5, v6}, Laf/u;->j2(Lye/a;Ljava/lang/StringBuilder;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    move-object v4, p0

    .line 130
    move-object v5, p1

    .line 131
    move-object v6, p2

    .line 132
    :goto_1
    invoke-direct {p0, v5, v6, v2}, Laf/u;->Z1(Lye/m;Ljava/lang/StringBuilder;Z)V

    .line 133
    .line 134
    .line 135
    const-string p1, ": "

    .line 136
    .line 137
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-interface {v5}, Lye/s0;->getType()Lqf/S;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const-string p2, "getType(...)"

    .line 145
    .line 146
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, p1}, Laf/u;->S(Lqf/S;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-direct {p0, v5, v6}, Laf/u;->k2(Lye/a;Ljava/lang/StringBuilder;)V

    .line 157
    .line 158
    .line 159
    invoke-direct {p0, v5, v6}, Laf/u;->R1(Lye/u0;Ljava/lang/StringBuilder;)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v5}, Lye/a;->getTypeParameters()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-direct {p0, p1, v6}, Laf/u;->F2(Ljava/util/List;Ljava/lang/StringBuilder;)V

    .line 170
    .line 171
    .line 172
    return-void
.end method

.method static synthetic i0(Laf/u;Lqf/B0;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Laf/u;->o0(Laf/u;Lqf/B0;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final i2(Lye/Z;Ljava/lang/StringBuilder;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Laf/v;->h:Laf/v;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v5, 0x2

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v1, p0

    .line 19
    move-object v3, p1

    .line 20
    move-object v2, p2

    .line 21
    invoke-static/range {v1 .. v6}, Laf/u;->A1(Laf/u;Ljava/lang/StringBuilder;Lze/a;Lze/e;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v3}, Lye/Z;->w0()Lye/w;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    sget-object p2, Lze/e;->c:Lze/e;

    .line 31
    .line 32
    invoke-direct {p0, v2, p1, p2}, Laf/u;->z1(Ljava/lang/StringBuilder;Lze/a;Lze/e;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-interface {v3}, Lye/Z;->P()Lye/w;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    sget-object p2, Lze/e;->k:Lze/e;

    .line 42
    .line 43
    invoke-direct {p0, v2, p1, p2}, Laf/u;->z1(Ljava/lang/StringBuilder;Lze/a;Lze/e;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0}, Laf/u;->P0()Laf/E;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object p2, Laf/E;->c:Laf/E;

    .line 51
    .line 52
    if-ne p1, p2, :cond_4

    .line 53
    .line 54
    invoke-interface {v3}, Lye/Z;->d()Lye/a0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    sget-object p2, Lze/e;->f:Lze/e;

    .line 61
    .line 62
    invoke-direct {p0, v2, p1, p2}, Laf/u;->z1(Ljava/lang/StringBuilder;Lze/a;Lze/e;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-interface {v3}, Lye/Z;->g()Lye/b0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    sget-object p2, Lze/e;->g:Lze/e;

    .line 72
    .line 73
    invoke-direct {p0, v2, p1, p2}, Laf/u;->z1(Ljava/lang/StringBuilder;Lze/a;Lze/e;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1}, Lye/a;->j()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string p2, "getValueParameters(...)"

    .line 81
    .line 82
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, LUd/u;->M0(Ljava/util/List;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Lye/t0;

    .line 90
    .line 91
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object p2, Lze/e;->j:Lze/e;

    .line 95
    .line 96
    invoke-direct {p0, v2, p1, p2}, Laf/u;->z1(Ljava/lang/StringBuilder;Lze/a;Lze/e;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    :goto_0
    return-void
.end method

.method static synthetic j0(Lye/t0;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Laf/u;->I1(Lye/t0;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final j2(Lye/a;Ljava/lang/StringBuilder;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lye/a;->O()Lye/c0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lze/e;->h:Lze/e;

    .line 8
    .line 9
    invoke-direct {p0, p2, p1, v0}, Laf/u;->z1(Ljava/lang/StringBuilder;Lze/a;Lze/e;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Lye/s0;->getType()Lqf/S;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "getType(...)"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1}, Laf/u;->N1(Lqf/S;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p1, "."

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method static synthetic k0(Laf/u;Lqf/S;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Laf/u;->o2(Laf/u;Lqf/S;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final k2(Lye/a;Ljava/lang/StringBuilder;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Laf/u;->Q0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p1}, Lye/a;->O()Lye/c0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    const-string v0, " on "

    .line 15
    .line 16
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Lye/s0;->getType()Lqf/S;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "getType(...)"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Laf/u;->S(Lqf/S;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic l0(Laf/w;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0}, Laf/u;->s0(Laf/w;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final l2(Ljava/lang/StringBuilder;Lqf/d0;)V
    .locals 2

    .line 1
    sget-object v0, Lqf/J0;->b:Lqf/d0;

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "???"

    .line 8
    .line 9
    if-nez v0, :cond_5

    .line 10
    .line 11
    invoke-static {p2}, Lqf/J0;->k(Lqf/S;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p2}, Lsf/l;->o(Lqf/S;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, Laf/u;->g1()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p2}, Lqf/S;->N0()Lqf/v0;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor"

    .line 35
    .line 36
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    check-cast p2, Lsf/j;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p2, v0}, Lsf/j;->c(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-direct {p0, p2}, Laf/u;->L1(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    invoke-static {p2}, Lqf/W;->a(Lqf/S;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    invoke-direct {p0, p1, p2}, Laf/u;->K1(Ljava/lang/StringBuilder;Lqf/S;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    invoke-direct {p0, p2}, Laf/u;->G2(Lqf/S;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-direct {p0, p1, p2}, Laf/u;->Q1(Ljava/lang/StringBuilder;Lqf/S;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4
    invoke-direct {p0, p1, p2}, Laf/u;->K1(Ljava/lang/StringBuilder;Lqf/S;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_5
    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method private final m0(Ljava/lang/StringBuilder;Lye/m;)V
    .locals 4

    .line 1
    instance-of v0, p2, Lye/N;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    instance-of v0, p2, Lye/V;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-interface {p2}, Lye/m;->b()Lye/m;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    instance-of v1, v0, Lye/H;

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    const-string v1, " "

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, "defined in"

    .line 26
    .line 27
    invoke-virtual {p0, v2}, Laf/u;->V1(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lbf/i;->m(Lye/m;)LXe/d;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "getFqName(...)"

    .line 42
    .line 43
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, LXe/d;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    const-string v2, "root package"

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p0, v2}, Laf/u;->Q(LXe/d;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    :goto_0
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Laf/u;->l1()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    instance-of v0, v0, Lye/N;

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    instance-of v0, p2, Lye/p;

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    check-cast p2, Lye/p;

    .line 77
    .line 78
    invoke-interface {p2}, Lye/p;->k()Lye/h0;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-interface {p2}, Lye/h0;->b()Lye/i0;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-interface {p2}, Lye/i0;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    if-eqz p2, :cond_2

    .line 91
    .line 92
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v0, "in file"

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Laf/u;->V1(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    :cond_2
    return-void
.end method

.method private final m2(Ljava/lang/StringBuilder;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private final n0(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 10

    .line 1
    new-instance v7, Laf/q;

    .line 2
    .line 3
    invoke-direct {v7, p0}, Laf/q;-><init>(Laf/u;)V

    .line 4
    .line 5
    .line 6
    const/16 v8, 0x3c

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const-string v2, ", "

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p1

    .line 16
    move-object v0, p2

    .line 17
    invoke-static/range {v0 .. v9}, LUd/u;->u0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final n2(Lye/e;Ljava/lang/StringBuilder;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Laf/u;->n1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p1}, Lye/e;->p()Lqf/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lve/i;->o0(Lqf/S;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-interface {p1}, Lye/h;->l()Lqf/v0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p1}, Lqf/v0;->k()Ljava/util/Collection;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "getSupertypes(...)"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x1

    .line 43
    if-ne v0, v1, :cond_2

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lqf/S;

    .line 54
    .line 55
    invoke-static {v0}, Lve/i;->c0(Lqf/S;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-direct {p0, p2}, Laf/u;->m2(Ljava/lang/StringBuilder;)V

    .line 63
    .line 64
    .line 65
    const-string v0, ": "

    .line 66
    .line 67
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    move-object v1, p1

    .line 71
    check-cast v1, Ljava/lang/Iterable;

    .line 72
    .line 73
    new-instance v8, Laf/s;

    .line 74
    .line 75
    invoke-direct {v8, p0}, Laf/s;-><init>(Laf/u;)V

    .line 76
    .line 77
    .line 78
    const/16 v9, 0x3c

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    const-string v3, ", "

    .line 82
    .line 83
    const/4 v4, 0x0

    .line 84
    const/4 v5, 0x0

    .line 85
    const/4 v6, 0x0

    .line 86
    const/4 v7, 0x0

    .line 87
    move-object v2, p2

    .line 88
    invoke-static/range {v1 .. v10}, LUd/u;->u0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;

    .line 89
    .line 90
    .line 91
    :cond_3
    :goto_0
    return-void
.end method

.method private static final o0(Laf/u;Lqf/B0;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lqf/B0;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string p0, "*"

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p1}, Lqf/B0;->getType()Lqf/S;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "getType(...)"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Laf/u;->S(Lqf/S;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p1}, Lqf/B0;->b()Lqf/N0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Lqf/N0;->e:Lqf/N0;

    .line 33
    .line 34
    if-ne v0, v1, :cond_1

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Lqf/B0;->b()Lqf/N0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const/16 p1, 0x20

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method

.method private static final o2(Laf/u;Lqf/S;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Laf/u;->S(Lqf/S;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method private final p0()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Laf/u;->e1()Laf/F;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Laf/u$b;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    const-string v0, "&rarr;"

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    new-instance v0, LTd/r;

    .line 23
    .line 24
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    const-string v0, "->"

    .line 29
    .line 30
    invoke-direct {p0, v0}, Laf/u;->q0(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method

.method private final p1()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ">"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Laf/u;->q0(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final p2(Lye/z;Ljava/lang/StringBuilder;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lye/z;->isSuspend()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const-string v0, "suspend"

    .line 6
    .line 7
    invoke-direct {p0, p2, p1, v0}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final q0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Laf/u;->e1()Laf/F;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Laf/F;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method private final q1(Lqf/S;)Z
    .locals 1

    .line 1
    invoke-static {p1}, Lve/h;->r(Lqf/S;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lqf/S;->getAnnotations()Lze/h;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Lze/h;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    return p1
.end method

.method private final q2(Lye/l0;Ljava/lang/StringBuilder;)V
    .locals 6

    .line 1
    const/4 v4, 0x2

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v3, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v1, p2

    .line 7
    invoke-static/range {v0 .. v5}, Laf/u;->A1(Laf/u;Ljava/lang/StringBuilder;Lze/a;Lze/e;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v2}, Lye/D;->getVisibility()Lye/u;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string p2, "getVisibility(...)"

    .line 15
    .line 16
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1, v1}, Laf/u;->E2(Lye/u;Ljava/lang/StringBuilder;)Z

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v2, v1}, Laf/u;->U1(Lye/D;Ljava/lang/StringBuilder;)V

    .line 23
    .line 24
    .line 25
    const-string p1, "typealias"

    .line 26
    .line 27
    invoke-direct {p0, p1}, Laf/u;->S1(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p1, " "

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    invoke-direct {p0, v2, v1, p1}, Laf/u;->Z1(Lye/m;Ljava/lang/StringBuilder;Z)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v2}, Lye/i;->q()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string p2, "getDeclaredTypeParameters(...)"

    .line 48
    .line 49
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    invoke-direct {p0, p1, v1, p2}, Laf/u;->y2(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, v2, v1}, Laf/u;->B1(Lye/i;Ljava/lang/StringBuilder;)V

    .line 57
    .line 58
    .line 59
    const-string p1, " = "

    .line 60
    .line 61
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-interface {v2}, Lye/l0;->u0()Lqf/d0;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0, p1}, Laf/u;->S(Lqf/S;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method private static final r0(Laf/u;)Laf/u;
    .locals 1

    .line 1
    sget-object v0, Laf/t;->a:Laf/t;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Laf/n;->U(Lkotlin/jvm/functions/Function1;)Laf/n;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl"

    .line 8
    .line 9
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast p0, Laf/u;

    .line 13
    .line 14
    return-object p0
.end method

.method private final r1(Lye/D;)Lye/E;
    .locals 3

    .line 1
    instance-of v0, p1, Lye/e;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lye/e;

    .line 6
    .line 7
    invoke-interface {p1}, Lye/e;->h()Lye/f;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object v0, Lye/f;->c:Lye/f;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    sget-object p1, Lye/E;->e:Lye/E;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, Lye/E;->b:Lye/E;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    invoke-interface {p1}, Lye/n;->b()Lye/m;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v1, v0, Lye/e;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    check-cast v0, Lye/e;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-nez v0, :cond_3

    .line 34
    .line 35
    sget-object p1, Lye/E;->b:Lye/E;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_3
    instance-of v1, p1, Lye/b;

    .line 39
    .line 40
    if-nez v1, :cond_4

    .line 41
    .line 42
    sget-object p1, Lye/E;->b:Lye/E;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_4
    check-cast p1, Lye/b;

    .line 46
    .line 47
    invoke-interface {p1}, Lye/b;->e()Ljava/util/Collection;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v2, "getOverriddenDescriptors(...)"

    .line 52
    .line 53
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_5

    .line 61
    .line 62
    invoke-interface {v0}, Lye/e;->r()Lye/E;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    sget-object v2, Lye/E;->b:Lye/E;

    .line 67
    .line 68
    if-eq v1, v2, :cond_5

    .line 69
    .line 70
    sget-object p1, Lye/E;->d:Lye/E;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_5
    invoke-interface {v0}, Lye/e;->h()Lye/f;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sget-object v1, Lye/f;->c:Lye/f;

    .line 78
    .line 79
    if-ne v0, v1, :cond_7

    .line 80
    .line 81
    invoke-interface {p1}, Lye/D;->getVisibility()Lye/u;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sget-object v1, Lye/t;->a:Lye/u;

    .line 86
    .line 87
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_7

    .line 92
    .line 93
    invoke-interface {p1}, Lye/D;->r()Lye/E;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    sget-object v0, Lye/E;->e:Lye/E;

    .line 98
    .line 99
    if-ne p1, v0, :cond_6

    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_6
    sget-object p1, Lye/E;->d:Lye/E;

    .line 103
    .line 104
    return-object p1

    .line 105
    :cond_7
    sget-object p1, Lye/E;->b:Lye/E;

    .line 106
    .line 107
    return-object p1
.end method

.method private static final s0(Laf/w;)LTd/L;
    .locals 3

    .line 1
    const-string v0, "$this$withOptions"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Laf/w;->h()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lve/o$a;->C:LXe/c;

    .line 11
    .line 12
    sget-object v2, Lve/o$a;->D:LXe/c;

    .line 13
    .line 14
    filled-new-array {v1, v2}, [LXe/c;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, v1}, LUd/a0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p0, v0}, Laf/w;->k(Ljava/util/Set;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, LTd/L;->a:LTd/L;

    .line 30
    .line 31
    return-object p0
.end method

.method private final s1(Lze/c;)Z
    .locals 1

    .line 1
    invoke-interface {p1}, Lze/c;->f()LXe/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lve/o$a;->E:LXe/c;

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method private final t1()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "<"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Laf/u;->q0(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static final t2(Lqf/S;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method private final u1(Lye/b;)Z
    .locals 0

    .line 1
    invoke-interface {p1}, Lye/b;->e()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    xor-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    return p1
.end method

.method private final u2(Ljava/lang/StringBuilder;Lqf/S;Lqf/v0;)V
    .locals 1

    .line 1
    invoke-static {p2}, Lye/q0;->d(Lqf/S;)Lye/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p3}, Laf/u;->s2(Lqf/v0;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Lqf/S;->L0()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p0, p2}, Laf/u;->r2(Ljava/util/List;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-direct {p0, p1, v0}, Laf/u;->g2(Ljava/lang/StringBuilder;Lye/X;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private final v1(Ljava/lang/StringBuilder;Lqf/a;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Laf/u;->e1()Laf/F;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Laf/F;->b:Laf/F;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const-string v0, "<font color=\"808080\"><i>"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    :cond_0
    const-string v0, " /* "

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, "from: "

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lqf/a;->Z0()Lqf/d0;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-direct {p0, p1, p2}, Laf/u;->b2(Ljava/lang/StringBuilder;Lqf/S;)V

    .line 29
    .line 30
    .line 31
    const-string p2, " */"

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Laf/u;->e1()Laf/F;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    if-ne p2, v1, :cond_1

    .line 41
    .line 42
    const-string p2, "</i></font>"

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method static synthetic v2(Laf/u;Ljava/lang/StringBuilder;Lqf/S;Lqf/v0;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Lqf/S;->N0()Lqf/v0;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Laf/u;->u2(Ljava/lang/StringBuilder;Lqf/S;Lqf/v0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final w1(Lye/Y;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Laf/u;->U1(Lye/D;Ljava/lang/StringBuilder;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final w2(Lye/m0;Ljava/lang/StringBuilder;Z)V
    .locals 10

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Laf/u;->t1()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Laf/u;->j1()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-string v0, "/*"

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Lye/m0;->getIndex()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, "*/ "

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-interface {p1}, Lye/m0;->y()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const-string v1, "reified"

    .line 38
    .line 39
    invoke-direct {p0, p2, v0, v1}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Lye/m0;->m()Lqf/N0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lqf/N0;->c()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/4 v2, 0x0

    .line 55
    const/4 v3, 0x1

    .line 56
    if-lez v1, :cond_2

    .line 57
    .line 58
    move v1, v3

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move v1, v2

    .line 61
    :goto_0
    invoke-direct {p0, p2, v1, v0}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v8, 0x2

    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v7, 0x0

    .line 67
    move-object v4, p0

    .line 68
    move-object v6, p1

    .line 69
    move-object v5, p2

    .line 70
    invoke-static/range {v4 .. v9}, Laf/u;->A1(Laf/u;Ljava/lang/StringBuilder;Lze/a;Lze/e;ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, v6, v5, p3}, Laf/u;->Z1(Lye/m;Ljava/lang/StringBuilder;Z)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v6}, Lye/m0;->getUpperBounds()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    const-string p2, " : "

    .line 85
    .line 86
    if-le p1, v3, :cond_3

    .line 87
    .line 88
    if-eqz p3, :cond_4

    .line 89
    .line 90
    :cond_3
    if-ne p1, v3, :cond_5

    .line 91
    .line 92
    :cond_4
    invoke-interface {v6}, Lye/m0;->getUpperBounds()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lqf/S;

    .line 105
    .line 106
    invoke-static {p1}, Lve/i;->k0(Lqf/S;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_8

    .line 111
    .line 112
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p1}, Laf/u;->S(Lqf/S;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_5
    if-eqz p3, :cond_8

    .line 127
    .line 128
    invoke-interface {v6}, Lye/m0;->getUpperBounds()Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Lqf/S;

    .line 147
    .line 148
    invoke-static {v0}, Lve/i;->k0(Lqf/S;)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_6

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_6
    if-eqz v3, :cond_7

    .line 156
    .line 157
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_7
    const-string v1, " & "

    .line 162
    .line 163
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    :goto_2
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v0}, Laf/u;->S(Lqf/S;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    move v3, v2

    .line 177
    goto :goto_1

    .line 178
    :cond_8
    :goto_3
    if-eqz p3, :cond_9

    .line 179
    .line 180
    invoke-direct {p0}, Laf/u;->p1()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    :cond_9
    return-void
.end method

.method private final x1(Lye/z;Ljava/lang/StringBuilder;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Lye/z;->isOperator()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const-string v3, "getOverriddenDescriptors(...)"

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-interface {p1}, Lye/z;->e()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast v0, Ljava/lang/Iterable;

    .line 19
    .line 20
    move-object v4, v0

    .line 21
    check-cast v4, Ljava/util/Collection;

    .line 22
    .line 23
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lye/z;

    .line 45
    .line 46
    invoke-interface {v4}, Lye/z;->isOperator()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0}, Laf/u;->u0()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    :cond_2
    :goto_0
    move v0, v2

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move v0, v1

    .line 61
    :goto_1
    invoke-interface {p1}, Lye/z;->isInfix()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_7

    .line 66
    .line 67
    invoke-interface {p1}, Lye/z;->e()Ljava/util/Collection;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    check-cast v4, Ljava/lang/Iterable;

    .line 75
    .line 76
    move-object v3, v4

    .line 77
    check-cast v3, Ljava/util/Collection;

    .line 78
    .line 79
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_6

    .line 95
    .line 96
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    check-cast v4, Lye/z;

    .line 101
    .line 102
    invoke-interface {v4}, Lye/z;->isInfix()Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_5

    .line 107
    .line 108
    invoke-virtual {p0}, Laf/u;->u0()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_7

    .line 113
    .line 114
    :cond_6
    :goto_2
    move v1, v2

    .line 115
    :cond_7
    invoke-interface {p1}, Lye/z;->C()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    const-string v3, "tailrec"

    .line 120
    .line 121
    invoke-direct {p0, p2, v2, v3}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {p0, p1, p2}, Laf/u;->p2(Lye/z;Ljava/lang/StringBuilder;)V

    .line 125
    .line 126
    .line 127
    invoke-interface {p1}, Lye/z;->isInline()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    const-string v2, "inline"

    .line 132
    .line 133
    invoke-direct {p0, p2, p1, v2}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const-string p1, "infix"

    .line 137
    .line 138
    invoke-direct {p0, p2, v1, p1}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const-string p1, "operator"

    .line 142
    .line 143
    invoke-direct {p0, p2, v0, p1}, Laf/u;->Y1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method private final x2(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lye/m0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {p0, v0, p1, v1}, Laf/u;->w2(Lye/m0;Ljava/lang/StringBuilder;Z)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const-string v0, ", "

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method private final y1(Lze/c;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-interface {p1}, Lze/c;->a()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Laf/u;->V0()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lff/e;->l(Lze/c;)Lye/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v2

    .line 18
    :goto_0
    const/16 v1, 0xa

    .line 19
    .line 20
    if-eqz p1, :cond_4

    .line 21
    .line 22
    invoke-interface {p1}, Lye/e;->D()Lye/d;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_4

    .line 27
    .line 28
    invoke-interface {p1}, Lye/a;->j()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_4

    .line 33
    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    move-object v4, v3

    .line 54
    check-cast v4, Lye/t0;

    .line 55
    .line 56
    invoke-interface {v4}, Lye/t0;->B0()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-static {v2, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_3

    .line 84
    .line 85
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Lye/t0;

    .line 90
    .line 91
    invoke-interface {v3}, Lye/J;->getName()LXe/f;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-interface {p1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    move-object v2, p1

    .line 100
    :cond_4
    if-nez v2, :cond_5

    .line 101
    .line 102
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    :cond_5
    new-instance p1, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_7

    .line 120
    .line 121
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    move-object v5, v4

    .line 126
    check-cast v5, LXe/f;

    .line 127
    .line 128
    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-nez v5, :cond_6

    .line 133
    .line 134
    invoke-interface {p1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    new-instance v3, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-static {p1, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-eqz v4, :cond_8

    .line 156
    .line 157
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    check-cast v4, LXe/f;

    .line 162
    .line 163
    new-instance v5, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4}, LXe/f;->b()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v4, " = ..."

    .line 176
    .line 177
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_8
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, Ljava/lang/Iterable;

    .line 193
    .line 194
    new-instance v0, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-static {p1, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 201
    .line 202
    .line 203
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-eqz v1, :cond_a

    .line 212
    .line 213
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    check-cast v1, Ljava/util/Map$Entry;

    .line 218
    .line 219
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    check-cast v4, LXe/f;

    .line 224
    .line 225
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    check-cast v1, Ldf/g;

    .line 230
    .line 231
    new-instance v5, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4}, LXe/f;->b()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string v6, " = "

    .line 244
    .line 245
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    if-nez v4, :cond_9

    .line 253
    .line 254
    invoke-direct {p0, v1}, Laf/u;->G1(Ldf/g;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    goto :goto_6

    .line 259
    :cond_9
    const-string v1, "..."

    .line 260
    .line 261
    :goto_6
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_a
    invoke-static {v3, v0}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    invoke-static {p1}, LUd/u;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    return-object p1
.end method

.method private final y2(Ljava/util/List;Ljava/lang/StringBuilder;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Laf/u;->o1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-direct {p0}, Laf/u;->t1()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p2, p1}, Laf/u;->x2(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Laf/u;->p1()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    if-eqz p3, :cond_1

    .line 32
    .line 33
    const-string p1, " "

    .line 34
    .line 35
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    return-void
.end method

.method private final z1(Ljava/lang/StringBuilder;Lze/a;Lze/e;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Laf/u;->I0()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Laf/v;->h:Laf/v;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    instance-of v0, p2, Lqf/S;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Laf/u;->h()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p0}, Laf/u;->B0()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-virtual {p0}, Laf/u;->v0()Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {p2}, Lze/a;->getAnnotations()Lze/h;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_5

    .line 44
    .line 45
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lze/c;

    .line 50
    .line 51
    move-object v3, v0

    .line 52
    check-cast v3, Ljava/lang/Iterable;

    .line 53
    .line 54
    invoke-interface {v2}, Lze/c;->f()LXe/c;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-static {v3, v4}, LUd/u;->e0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_2

    .line 63
    .line 64
    invoke-direct {p0, v2}, Laf/u;->s1(Lze/c;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_2

    .line 83
    .line 84
    :cond_3
    invoke-virtual {p0, v2, p3}, Laf/u;->N(Lze/c;Lze/e;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Laf/u;->A0()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    const/16 v2, 0xa

    .line 98
    .line 99
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    const-string v2, " "

    .line 104
    .line 105
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    :goto_2
    return-void
.end method

.method private final z2(Lye/u0;Ljava/lang/StringBuilder;Z)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    instance-of p3, p1, Lye/t0;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    return-void

    .line 9
    :cond_1
    :goto_0
    invoke-interface {p1}, Lye/u0;->N()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    const-string p1, "var"

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_2
    const-string p1, "val"

    .line 19
    .line 20
    :goto_1
    invoke-direct {p0, p1}, Laf/u;->S1(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, " "

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public A0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->B()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public B0()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->C()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public D0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->D()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public E0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->E()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public E1(Lye/h;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "klass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lsf/l;->m(Lye/m;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Lye/h;->l()Lqf/v0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    invoke-virtual {p0}, Laf/u;->y0()Laf/b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0, p1, p0}, Laf/b;->a(Lye/h;Laf/n;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method

.method public F0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->F()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public G0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->G()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public H0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->H()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public I0()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->I()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public J0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->J()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final K0()Laf/z;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public L0()Laf/C;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->K()Laf/C;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public M(Lye/m;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "declarationDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Laf/u$a;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Laf/u$a;-><init>(Laf/u;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v1, v0}, Lye/m;->b0(Lye/o;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Laf/u;->k1()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-direct {p0, v0, p1}, Laf/u;->m0(Ljava/lang/StringBuilder;Lye/m;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public M0()Laf/D;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->L()Laf/D;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public N(Lze/c;Lze/e;)Ljava/lang/String;
    .locals 11

    .line 1
    const-string v0, "annotation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const/16 v0, 0x40

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lze/e;->b()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 p2, 0x3a

    .line 31
    .line 32
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-interface {p1}, Lze/c;->getType()Lqf/S;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p0, p2}, Laf/u;->S(Lqf/S;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Laf/u;->E0()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-direct {p0, p1}, Laf/u;->y1(Lze/c;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {p0}, Laf/u;->F0()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_1

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_2

    .line 74
    .line 75
    :cond_1
    const/16 v9, 0x70

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    const-string v3, ", "

    .line 79
    .line 80
    const-string v4, "("

    .line 81
    .line 82
    const-string v5, ")"

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    const/4 v7, 0x0

    .line 86
    const/4 v8, 0x0

    .line 87
    invoke-static/range {v1 .. v10}, LUd/u;->u0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-virtual {p0}, Laf/u;->j1()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    invoke-static {p2}, Lqf/W;->a(Lqf/S;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_3

    .line 101
    .line 102
    invoke-virtual {p2}, Lqf/S;->N0()Lqf/v0;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-interface {p1}, Lqf/v0;->p()Lye/h;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    instance-of p1, p1, Lye/M$b;

    .line 111
    .line 112
    if-eqz p1, :cond_4

    .line 113
    .line 114
    :cond_3
    const-string p1, " /* annotation class not found */"

    .line 115
    .line 116
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1
.end method

.method public N0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->M()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public O0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->N()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public P(Ljava/lang/String;Ljava/lang/String;Lve/i;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "lowerRendered"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "upperRendered"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "builtIns"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Laf/G;->f(Ljava/lang/String;Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/16 v1, 0x28

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const-string p3, "("

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-static {p2, p3, v0, v2, v3}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    new-instance p2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p1, ")!"

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const/16 p1, 0x21

    .line 65
    .line 66
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_1
    invoke-virtual {p0}, Laf/u;->y0()Laf/b;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p3}, Lve/i;->x()Lye/e;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    const-string v5, "getCollection(...)"

    .line 83
    .line 84
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v0, v4, p0}, Laf/b;->a(Lye/h;Laf/n;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const-string v4, "Collection"

    .line 92
    .line 93
    invoke-static {v0, v4, v3, v2, v3}, LDf/r;->e1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v4, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v5, "Mutable"

    .line 106
    .line 107
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    new-instance v6, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const/16 v5, 0x29

    .line 129
    .line 130
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-static {p1, v4, p2, v0, v6}, Laf/G;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    if-eqz v4, :cond_2

    .line 142
    .line 143
    return-object v4

    .line 144
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v6, "MutableMap.MutableEntry"

    .line 153
    .line 154
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    new-instance v6, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v7, "Map.Entry"

    .line 170
    .line 171
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    new-instance v7, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v0, "(Mutable)Map.(Mutable)Entry"

    .line 187
    .line 188
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {p1, v4, p2, v6, v0}, Laf/G;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    if-eqz v0, :cond_3

    .line 200
    .line 201
    return-object v0

    .line 202
    :cond_3
    invoke-virtual {p0}, Laf/u;->y0()Laf/b;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {p3}, Lve/i;->j()Lye/e;

    .line 207
    .line 208
    .line 209
    move-result-object p3

    .line 210
    const-string v4, "getArray(...)"

    .line 211
    .line 212
    invoke-static {p3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v0, p3, p0}, Laf/b;->a(Lye/h;Laf/n;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p3

    .line 219
    const-string v0, "Array"

    .line 220
    .line 221
    invoke-static {p3, v0, v3, v2, v3}, LDf/r;->e1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p3

    .line 225
    new-instance v0, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v2, "Array<"

    .line 234
    .line 235
    invoke-direct {p0, v2}, Laf/u;->q0(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    new-instance v2, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string v3, "Array<out "

    .line 255
    .line 256
    invoke-direct {p0, v3}, Laf/u;->q0(Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    new-instance v3, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    const-string p3, "Array<(out) "

    .line 276
    .line 277
    invoke-direct {p0, p3}, Laf/u;->q0(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p3

    .line 281
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p3

    .line 288
    invoke-static {p1, v0, p2, v2, p3}, Laf/G;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p3

    .line 292
    if-eqz p3, :cond_4

    .line 293
    .line 294
    return-object p3

    .line 295
    :cond_4
    new-instance p3, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const-string p1, ".."

    .line 307
    .line 308
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    return-object p1
.end method

.method public P0()Laf/E;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->O()Laf/E;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public Q(LXe/d;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LXe/d;->h()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0, p1}, Laf/u;->O1(Ljava/util/List;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public Q0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->Q()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public R(LXe/f;Z)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Laf/G;->b(LXe/f;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0, p1}, Laf/u;->q0(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0}, Laf/u;->w0()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Laf/u;->e1()Laf/F;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Laf/F;->b:Laf/F;

    .line 25
    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    new-instance p2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v0, "<b>"

    .line 36
    .line 37
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p1, "</b>"

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :cond_0
    return-object p1
.end method

.method public R0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->R()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public S(Lqf/S;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Laf/u;->f1()Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lqf/S;

    .line 20
    .line 21
    invoke-direct {p0, v0, p1}, Laf/u;->a2(Ljava/lang/StringBuilder;Lqf/S;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public S0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->S()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public T(Lqf/B0;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "typeProjection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {p0, v0, p1}, Laf/u;->n0(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public T0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->T()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public U0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->U()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public V0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->V()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public V1(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Laf/u;->e1()Laf/F;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Laf/u$b;->a:[I

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    aget v0, v1, v0

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v1, "<i>"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p1, "</i>"

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_0
    new-instance p1, LTd/r;

    .line 48
    .line 49
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_1
    return-object p1
.end method

.method public W0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->W()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public X0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->X()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public Y0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->Y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public Z0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->Z()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Laf/z;->a(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public a1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->a0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Laf/z;->b(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->b0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->c0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public d(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Laf/z;->d(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->d0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Laf/z;->e(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e1()Laf/F;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->e0()Laf/F;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f(Laf/D;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Laf/z;->f(Laf/D;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public f1()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->f0()Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g(Laf/b;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Laf/z;->g(Laf/b;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public g1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->g0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public h()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->h()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->h0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public i1()Laf/n$b;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->i0()Laf/n$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public j()Laf/a;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->j()Laf/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public j1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->j0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public k(Ljava/util/Set;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Laf/z;->k(Ljava/util/Set;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public k1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->k0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public l(Ljava/util/Set;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Laf/z;->l(Ljava/util/Set;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public l1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->l0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public m(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Laf/z;->m(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->m0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public n(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Laf/z;->n(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public n1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->n0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public o(Laf/F;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Laf/z;->o(Laf/F;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public o1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->o0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public p(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Laf/z;->p(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public r2(Ljava/util/List;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "typeArguments"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string p1, ""

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Laf/u;->t1()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0, p1}, Laf/u;->n0(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Laf/u;->p1()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method

.method public s2(Lqf/v0;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "typeConstructor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lqf/v0;->p()Lye/h;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Lye/m0;

    .line 11
    .line 12
    if-nez v1, :cond_3

    .line 13
    .line 14
    instance-of v1, v0, Lye/e;

    .line 15
    .line 16
    if-nez v1, :cond_3

    .line 17
    .line 18
    instance-of v1, v0, Lye/l0;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-nez v0, :cond_2

    .line 24
    .line 25
    instance-of v0, p1, Lqf/Q;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    check-cast p1, Lqf/Q;

    .line 30
    .line 31
    sget-object v0, Laf/p;->a:Laf/p;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lqf/Q;->i(Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v2, "Unexpected classifier: "

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :cond_3
    :goto_0
    invoke-virtual {p0, v0}, Laf/u;->E1(Lye/h;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1
.end method

.method public t0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public u0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->v()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public v0()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->w()Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public w0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->x()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public x0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public y0()Laf/b;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->z()Laf/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public z0()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/u;->m:Laf/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Laf/z;->A()Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
