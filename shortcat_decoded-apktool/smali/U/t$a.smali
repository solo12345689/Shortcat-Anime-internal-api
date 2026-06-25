.class public final LU/t$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LD0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/t;-><init>(LU/n0;Lw/i;Lw/z;Lie/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LU/t;


# direct methods
.method constructor <init>(LU/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/t$a;->a:LU/t;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public L0(JJLZd/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p5, LU/t$a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, LU/t$a$a;

    .line 7
    .line 8
    iget v1, v0, LU/t$a$a;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LU/t$a$a;->e:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, LU/t$a$a;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, LU/t$a$a;-><init>(LU/t$a;LZd/e;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v6, LU/t$a$a;->c:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v6, LU/t$a$a;->e:I

    .line 34
    .line 35
    const/4 v7, 0x2

    .line 36
    const/4 v2, 0x1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v2, :cond_2

    .line 40
    .line 41
    if-ne v1, v7, :cond_1

    .line 42
    .line 43
    iget-wide p1, v6, LU/t$a$a;->b:J

    .line 44
    .line 45
    invoke-static {p5}, LTd/v;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    iget-wide p3, v6, LU/t$a$a;->b:J

    .line 58
    .line 59
    iget-object p1, v6, LU/t$a$a;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, LU/t$a;

    .line 62
    .line 63
    invoke-static {p5}, LTd/v;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-static {p5}, LTd/v;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iput-object p0, v6, LU/t$a$a;->a:Ljava/lang/Object;

    .line 71
    .line 72
    iput-wide p3, v6, LU/t$a$a;->b:J

    .line 73
    .line 74
    iput v2, v6, LU/t$a$a;->e:I

    .line 75
    .line 76
    move-object v1, p0

    .line 77
    move-wide v2, p1

    .line 78
    move-wide v4, p3

    .line 79
    invoke-super/range {v1 .. v6}, LD0/a;->L0(JJLZd/e;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p5

    .line 83
    if-ne p5, v0, :cond_4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    move-object p1, p0

    .line 87
    move-wide p3, v4

    .line 88
    :goto_2
    check-cast p5, Li1/y;

    .line 89
    .line 90
    invoke-virtual {p5}, Li1/y;->o()J

    .line 91
    .line 92
    .line 93
    move-result-wide v1

    .line 94
    iget-object p2, p1, LU/t$a;->a:LU/t;

    .line 95
    .line 96
    invoke-virtual {p2}, LU/t;->getState()LU/n0;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-static {p3, p4}, Li1/y;->i(J)F

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    iget-object p4, p1, LU/t$a;->a:LU/t;

    .line 105
    .line 106
    invoke-virtual {p4}, LU/t;->c()Lw/z;

    .line 107
    .line 108
    .line 109
    move-result-object p4

    .line 110
    iget-object p1, p1, LU/t$a;->a:LU/t;

    .line 111
    .line 112
    invoke-virtual {p1}, LU/t;->d()Lw/i;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const/4 p5, 0x0

    .line 117
    iput-object p5, v6, LU/t$a$a;->a:Ljava/lang/Object;

    .line 118
    .line 119
    iput-wide v1, v6, LU/t$a$a;->b:J

    .line 120
    .line 121
    iput v7, v6, LU/t$a$a;->e:I

    .line 122
    .line 123
    invoke-static {p2, p3, p4, p1, v6}, LU/d;->l(LU/n0;FLw/z;Lw/i;LZd/e;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p5

    .line 127
    if-ne p5, v0, :cond_5

    .line 128
    .line 129
    :goto_3
    return-object v0

    .line 130
    :cond_5
    move-wide p1, v1

    .line 131
    :goto_4
    check-cast p5, Li1/y;

    .line 132
    .line 133
    invoke-virtual {p5}, Li1/y;->o()J

    .line 134
    .line 135
    .line 136
    move-result-wide p3

    .line 137
    invoke-static {p1, p2, p3, p4}, Li1/y;->l(JJ)J

    .line 138
    .line 139
    .line 140
    move-result-wide p1

    .line 141
    invoke-static {p1, p2}, Li1/y;->b(J)Li1/y;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    return-object p1
.end method

.method public i1(JI)J
    .locals 6

    .line 1
    iget-object p3, p0, LU/t$a;->a:LU/t;

    .line 2
    .line 3
    invoke-virtual {p3}, LU/t;->e()Lie/a;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    check-cast p3, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-eqz p3, :cond_2

    .line 18
    .line 19
    invoke-static {p1, p2}, Lr0/f;->n(J)F

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    const/4 v0, 0x0

    .line 24
    cmpl-float p3, p3, v0

    .line 25
    .line 26
    if-lez p3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p3, p0, LU/t$a;->a:LU/t;

    .line 30
    .line 31
    invoke-virtual {p3}, LU/t;->getState()LU/n0;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-virtual {p3}, LU/n0;->d()F

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    iget-object v0, p0, LU/t$a;->a:LU/t;

    .line 40
    .line 41
    invoke-virtual {v0}, LU/t;->getState()LU/n0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v1, p0, LU/t$a;->a:LU/t;

    .line 46
    .line 47
    invoke-virtual {v1}, LU/t;->getState()LU/n0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, LU/n0;->d()F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-static {p1, p2}, Lr0/f;->n(J)F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    add-float/2addr v1, v2

    .line 60
    invoke-virtual {v0, v1}, LU/n0;->h(F)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, LU/t$a;->a:LU/t;

    .line 64
    .line 65
    invoke-virtual {v0}, LU/t;->getState()LU/n0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, LU/n0;->d()F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    cmpg-float p3, p3, v0

    .line 74
    .line 75
    if-nez p3, :cond_1

    .line 76
    .line 77
    sget-object p1, Lr0/f;->b:Lr0/f$a;

    .line 78
    .line 79
    invoke-virtual {p1}, Lr0/f$a;->c()J

    .line 80
    .line 81
    .line 82
    move-result-wide p1

    .line 83
    return-wide p1

    .line 84
    :cond_1
    const/4 v4, 0x2

    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v2, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    move-wide v0, p1

    .line 89
    invoke-static/range {v0 .. v5}, Lr0/f;->g(JFFILjava/lang/Object;)J

    .line 90
    .line 91
    .line 92
    move-result-wide p1

    .line 93
    return-wide p1

    .line 94
    :cond_2
    :goto_0
    sget-object p1, Lr0/f;->b:Lr0/f$a;

    .line 95
    .line 96
    invoke-virtual {p1}, Lr0/f$a;->c()J

    .line 97
    .line 98
    .line 99
    move-result-wide p1

    .line 100
    return-wide p1
.end method

.method public y0(JJI)J
    .locals 2

    .line 1
    iget-object p5, p0, LU/t$a;->a:LU/t;

    .line 2
    .line 3
    invoke-virtual {p5}, LU/t;->e()Lie/a;

    .line 4
    .line 5
    .line 6
    move-result-object p5

    .line 7
    invoke-interface {p5}, Lie/a;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p5

    .line 11
    check-cast p5, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p5

    .line 17
    if-nez p5, :cond_0

    .line 18
    .line 19
    sget-object p1, Lr0/f;->b:Lr0/f$a;

    .line 20
    .line 21
    invoke-virtual {p1}, Lr0/f$a;->c()J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    return-wide p1

    .line 26
    :cond_0
    iget-object p5, p0, LU/t$a;->a:LU/t;

    .line 27
    .line 28
    invoke-virtual {p5}, LU/t;->getState()LU/n0;

    .line 29
    .line 30
    .line 31
    move-result-object p5

    .line 32
    invoke-virtual {p5}, LU/n0;->c()F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {p1, p2}, Lr0/f;->n(J)F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-float/2addr v0, v1

    .line 41
    invoke-virtual {p5, v0}, LU/n0;->g(F)V

    .line 42
    .line 43
    .line 44
    invoke-static {p3, p4}, Lr0/f;->n(J)F

    .line 45
    .line 46
    .line 47
    move-result p5

    .line 48
    const/4 v0, 0x0

    .line 49
    cmpg-float p5, p5, v0

    .line 50
    .line 51
    if-ltz p5, :cond_4

    .line 52
    .line 53
    invoke-static {p1, p2}, Lr0/f;->n(J)F

    .line 54
    .line 55
    .line 56
    move-result p5

    .line 57
    cmpg-float p5, p5, v0

    .line 58
    .line 59
    if-gez p5, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-static {p1, p2}, Lr0/f;->n(J)F

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    cmpg-float p1, p1, v0

    .line 67
    .line 68
    if-nez p1, :cond_2

    .line 69
    .line 70
    invoke-static {p3, p4}, Lr0/f;->n(J)F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    cmpl-float p1, p1, v0

    .line 75
    .line 76
    if-lez p1, :cond_2

    .line 77
    .line 78
    iget-object p1, p0, LU/t$a;->a:LU/t;

    .line 79
    .line 80
    invoke-virtual {p1}, LU/t;->getState()LU/n0;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1, v0}, LU/n0;->g(F)V

    .line 85
    .line 86
    .line 87
    :cond_2
    invoke-static {p3, p4}, Lr0/f;->n(J)F

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    cmpl-float p1, p1, v0

    .line 92
    .line 93
    if-lez p1, :cond_3

    .line 94
    .line 95
    iget-object p1, p0, LU/t$a;->a:LU/t;

    .line 96
    .line 97
    invoke-virtual {p1}, LU/t;->getState()LU/n0;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, LU/n0;->d()F

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    iget-object p2, p0, LU/t$a;->a:LU/t;

    .line 106
    .line 107
    invoke-virtual {p2}, LU/t;->getState()LU/n0;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    iget-object p5, p0, LU/t$a;->a:LU/t;

    .line 112
    .line 113
    invoke-virtual {p5}, LU/t;->getState()LU/n0;

    .line 114
    .line 115
    .line 116
    move-result-object p5

    .line 117
    invoke-virtual {p5}, LU/n0;->d()F

    .line 118
    .line 119
    .line 120
    move-result p5

    .line 121
    invoke-static {p3, p4}, Lr0/f;->n(J)F

    .line 122
    .line 123
    .line 124
    move-result p3

    .line 125
    add-float/2addr p5, p3

    .line 126
    invoke-virtual {p2, p5}, LU/n0;->h(F)V

    .line 127
    .line 128
    .line 129
    iget-object p2, p0, LU/t$a;->a:LU/t;

    .line 130
    .line 131
    invoke-virtual {p2}, LU/t;->getState()LU/n0;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p2}, LU/n0;->d()F

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    sub-float/2addr p2, p1

    .line 140
    invoke-static {v0, p2}, Lr0/g;->a(FF)J

    .line 141
    .line 142
    .line 143
    move-result-wide p1

    .line 144
    return-wide p1

    .line 145
    :cond_3
    sget-object p1, Lr0/f;->b:Lr0/f$a;

    .line 146
    .line 147
    invoke-virtual {p1}, Lr0/f$a;->c()J

    .line 148
    .line 149
    .line 150
    move-result-wide p1

    .line 151
    return-wide p1

    .line 152
    :cond_4
    :goto_0
    iget-object p3, p0, LU/t$a;->a:LU/t;

    .line 153
    .line 154
    invoke-virtual {p3}, LU/t;->getState()LU/n0;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    invoke-virtual {p3}, LU/n0;->d()F

    .line 159
    .line 160
    .line 161
    move-result p3

    .line 162
    iget-object p4, p0, LU/t$a;->a:LU/t;

    .line 163
    .line 164
    invoke-virtual {p4}, LU/t;->getState()LU/n0;

    .line 165
    .line 166
    .line 167
    move-result-object p4

    .line 168
    iget-object p5, p0, LU/t$a;->a:LU/t;

    .line 169
    .line 170
    invoke-virtual {p5}, LU/t;->getState()LU/n0;

    .line 171
    .line 172
    .line 173
    move-result-object p5

    .line 174
    invoke-virtual {p5}, LU/n0;->d()F

    .line 175
    .line 176
    .line 177
    move-result p5

    .line 178
    invoke-static {p1, p2}, Lr0/f;->n(J)F

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    add-float/2addr p5, p1

    .line 183
    invoke-virtual {p4, p5}, LU/n0;->h(F)V

    .line 184
    .line 185
    .line 186
    iget-object p1, p0, LU/t$a;->a:LU/t;

    .line 187
    .line 188
    invoke-virtual {p1}, LU/t;->getState()LU/n0;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p1}, LU/n0;->d()F

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    sub-float/2addr p1, p3

    .line 197
    invoke-static {v0, p1}, Lr0/g;->a(FF)J

    .line 198
    .line 199
    .line 200
    move-result-wide p1

    .line 201
    return-wide p1
.end method
