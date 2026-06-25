.class Lcom/facebook/imagepipeline/producers/k0$a;
.super Lcom/facebook/imagepipeline/producers/t;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private final c:Z

.field private final d:LM6/d;

.field private final e:Lcom/facebook/imagepipeline/producers/e0;

.field private f:Z

.field private final g:Lcom/facebook/imagepipeline/producers/G;

.field final synthetic h:Lcom/facebook/imagepipeline/producers/k0;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/k0;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;ZLM6/d;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/k0$a;->h:Lcom/facebook/imagepipeline/producers/k0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lcom/facebook/imagepipeline/producers/n;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/producers/k0$a;->f:Z

    .line 8
    .line 9
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 10
    .line 11
    invoke-interface {p3}, Lcom/facebook/imagepipeline/producers/e0;->q()LK6/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LK6/b;->s()Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    :cond_0
    iput-boolean p4, p0, Lcom/facebook/imagepipeline/producers/k0$a;->c:Z

    .line 26
    .line 27
    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/k0$a;->d:LM6/d;

    .line 28
    .line 29
    new-instance p4, Lcom/facebook/imagepipeline/producers/k0$a$a;

    .line 30
    .line 31
    invoke-direct {p4, p0, p1}, Lcom/facebook/imagepipeline/producers/k0$a$a;-><init>(Lcom/facebook/imagepipeline/producers/k0$a;Lcom/facebook/imagepipeline/producers/k0;)V

    .line 32
    .line 33
    .line 34
    new-instance p5, Lcom/facebook/imagepipeline/producers/G;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/k0;->c(Lcom/facebook/imagepipeline/producers/k0;)Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/16 v1, 0x64

    .line 41
    .line 42
    invoke-direct {p5, v0, p4, v1}, Lcom/facebook/imagepipeline/producers/G;-><init>(Ljava/util/concurrent/Executor;Lcom/facebook/imagepipeline/producers/G$d;I)V

    .line 43
    .line 44
    .line 45
    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/k0$a;->g:Lcom/facebook/imagepipeline/producers/G;

    .line 46
    .line 47
    new-instance p4, Lcom/facebook/imagepipeline/producers/k0$a$b;

    .line 48
    .line 49
    invoke-direct {p4, p0, p1, p2}, Lcom/facebook/imagepipeline/producers/k0$a$b;-><init>(Lcom/facebook/imagepipeline/producers/k0$a;Lcom/facebook/imagepipeline/producers/k0;Lcom/facebook/imagepipeline/producers/n;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p3, p4}, Lcom/facebook/imagepipeline/producers/e0;->b(Lcom/facebook/imagepipeline/producers/f0;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method private A(LE6/k;)LE6/k;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->q()LK6/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LK6/b;->t()Ly6/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ly6/h;->h()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ly6/h;->g()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ly6/h;->f()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-direct {p0, p1, v0}, Lcom/facebook/imagepipeline/producers/k0$a;->y(LE6/k;I)LE6/k;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_0
    return-object p1
.end method

.method private B(LE6/k;)LE6/k;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->q()LK6/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LK6/b;->t()Ly6/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ly6/h;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, LE6/k;->h1()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, LE6/k;->h1()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, -0x1

    .line 28
    if-eq v0, v1, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {p0, p1, v0}, Lcom/facebook/imagepipeline/producers/k0$a;->y(LE6/k;I)LE6/k;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :cond_0
    return-object p1
.end method

.method static bridge synthetic q(Lcom/facebook/imagepipeline/producers/k0$a;)LM6/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/k0$a;->d:LM6/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic r(Lcom/facebook/imagepipeline/producers/k0$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/imagepipeline/producers/k0$a;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic s(Lcom/facebook/imagepipeline/producers/k0$a;)Lcom/facebook/imagepipeline/producers/G;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/k0$a;->g:Lcom/facebook/imagepipeline/producers/G;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic t(Lcom/facebook/imagepipeline/producers/k0$a;)Lcom/facebook/imagepipeline/producers/e0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic u(Lcom/facebook/imagepipeline/producers/k0$a;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/imagepipeline/producers/k0$a;->f:Z

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic v(Lcom/facebook/imagepipeline/producers/k0$a;LE6/k;ILM6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/producers/k0$a;->w(LE6/k;ILM6/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private w(LE6/k;ILM6/c;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->m()Lcom/facebook/imagepipeline/producers/g0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 8
    .line 9
    const-string v2, "ResizeAndRotateProducer"

    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/g0;->d(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 15
    .line 16
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->q()LK6/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/k0$a;->h:Lcom/facebook/imagepipeline/producers/k0;

    .line 21
    .line 22
    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/k0;->d(Lcom/facebook/imagepipeline/producers/k0;)LB5/i;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, LB5/i;->c()LB5/k;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const/4 v1, 0x0

    .line 31
    :try_start_0
    invoke-virtual {v0}, LK6/b;->t()Ly6/h;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-virtual {v0}, LK6/b;->r()Ly6/g;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    const/16 v3, 0x55

    .line 40
    .line 41
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    invoke-virtual {p1}, LE6/k;->l()Landroid/graphics/ColorSpace;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    const/4 v8, 0x0

    .line 50
    move-object v4, p1

    .line 51
    move-object v3, p3

    .line 52
    invoke-interface/range {v3 .. v10}, LM6/c;->b(LE6/k;Ljava/io/OutputStream;Ly6/h;Ly6/g;Lq6/c;Ljava/lang/Integer;Landroid/graphics/ColorSpace;)LM6/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, LM6/b;->a()I

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    const/4 v6, 0x2

    .line 61
    if-eq p3, v6, :cond_1

    .line 62
    .line 63
    invoke-virtual {v0}, LK6/b;->r()Ly6/g;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-interface {v3}, LM6/c;->a()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p0, v4, p3, p1, v0}, Lcom/facebook/imagepipeline/producers/k0$a;->z(LE6/k;Ly6/g;LM6/b;Ljava/lang/String;)Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v5}, LB5/k;->a()LB5/h;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    invoke-static {p3}, LC5/a;->J(Ljava/io/Closeable;)LC5/a;

    .line 80
    .line 81
    .line 82
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    :try_start_1
    new-instance v3, LE6/k;

    .line 84
    .line 85
    invoke-direct {v3, p3}, LE6/k;-><init>(LC5/a;)V

    .line 86
    .line 87
    .line 88
    sget-object v0, Lq6/b;->b:Lq6/c;

    .line 89
    .line 90
    invoke-virtual {v3, v0}, LE6/k;->a1(Lq6/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 91
    .line 92
    .line 93
    :try_start_2
    invoke-virtual {v3}, LE6/k;->h0()V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 97
    .line 98
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->m()Lcom/facebook/imagepipeline/producers/g0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 103
    .line 104
    invoke-interface {v0, v4, v2, v1}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, LM6/b;->a()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    const/4 v0, 0x1

    .line 112
    if-eq p1, v0, :cond_0

    .line 113
    .line 114
    or-int/lit8 p2, p2, 0x10

    .line 115
    .line 116
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-interface {p1, v3, p2}, Lcom/facebook/imagepipeline/producers/n;->c(Ljava/lang/Object;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 121
    .line 122
    .line 123
    :try_start_3
    invoke-static {v3}, LE6/k;->g(LE6/k;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 124
    .line 125
    .line 126
    :try_start_4
    invoke-static {p3}, LC5/a;->m(LC5/a;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5}, LB5/k;->close()V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    move-object p1, v0

    .line 135
    goto :goto_2

    .line 136
    :catch_0
    move-exception v0

    .line 137
    move-object p1, v0

    .line 138
    goto :goto_1

    .line 139
    :catchall_1
    move-exception v0

    .line 140
    move-object p1, v0

    .line 141
    goto :goto_0

    .line 142
    :catchall_2
    move-exception v0

    .line 143
    move-object p1, v0

    .line 144
    :try_start_5
    invoke-static {v3}, LE6/k;->g(LE6/k;)V

    .line 145
    .line 146
    .line 147
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 148
    :goto_0
    :try_start_6
    invoke-static {p3}, LC5/a;->m(LC5/a;)V

    .line 149
    .line 150
    .line 151
    throw p1

    .line 152
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 153
    .line 154
    const-string p3, "Error while transcoding the image"

    .line 155
    .line 156
    invoke-direct {p1, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 160
    :goto_1
    :try_start_7
    iget-object p3, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 161
    .line 162
    invoke-interface {p3}, Lcom/facebook/imagepipeline/producers/e0;->m()Lcom/facebook/imagepipeline/producers/g0;

    .line 163
    .line 164
    .line 165
    move-result-object p3

    .line 166
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 167
    .line 168
    invoke-interface {p3, v0, v2, p1, v1}, Lcom/facebook/imagepipeline/producers/g0;->k(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    .line 169
    .line 170
    .line 171
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    if-eqz p2, :cond_2

    .line 176
    .line 177
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    invoke-interface {p2, p1}, Lcom/facebook/imagepipeline/producers/n;->a(Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 182
    .line 183
    .line 184
    :cond_2
    invoke-virtual {v5}, LB5/k;->close()V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :goto_2
    invoke-virtual {v5}, LB5/k;->close()V

    .line 189
    .line 190
    .line 191
    throw p1
.end method

.method private x(LE6/k;ILq6/c;)V
    .locals 1

    .line 1
    sget-object v0, Lq6/b;->b:Lq6/c;

    .line 2
    .line 3
    if-eq p3, v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lq6/b;->l:Lq6/c;

    .line 6
    .line 7
    if-ne p3, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/k0$a;->A(LE6/k;)LE6/k;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/k0$a;->B(LE6/k;)LE6/k;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-interface {p3, p1, p2}, Lcom/facebook/imagepipeline/producers/n;->c(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private y(LE6/k;I)LE6/k;
    .locals 0

    .line 1
    invoke-static {p1}, LE6/k;->b(LE6/k;)LE6/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, p2}, LE6/k;->q1(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object p1
.end method

.method private z(LE6/k;Ly6/g;LM6/b;Ljava/lang/String;)Ljava/util/Map;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->m()Lcom/facebook/imagepipeline/producers/g0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 8
    .line 9
    const-string v2, "ResizeAndRotateProducer"

    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/g0;->f(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, LE6/k;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, "x"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, LE6/k;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    iget v3, p2, Ly6/g;->a:I

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget p2, p2, Ly6/g;->b:I

    .line 63
    .line 64
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    const-string p2, "Unspecified"

    .line 73
    .line 74
    :goto_0
    new-instance v1, Ljava/util/HashMap;

    .line 75
    .line 76
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, LE6/k;->o()Lq6/c;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string v2, "Image format"

    .line 88
    .line 89
    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    const-string p1, "Original size"

    .line 93
    .line 94
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    const-string p1, "Requested size"

    .line 98
    .line 99
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/k0$a;->g:Lcom/facebook/imagepipeline/producers/G;

    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/G;->f()J

    .line 105
    .line 106
    .line 107
    move-result-wide p1

    .line 108
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string p2, "queueTime"

    .line 113
    .line 114
    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    const-string p1, "Transcoder id"

    .line 118
    .line 119
    invoke-interface {v1, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    const-string p1, "Transcoding result"

    .line 123
    .line 124
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    invoke-static {v1}, Ly5/g;->a(Ljava/util/Map;)Ly5/g;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    return-object p1
.end method


# virtual methods
.method protected C(LE6/k;I)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/k0$a;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 p2, 0x0

    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-interface {p1, p2, v0}, Lcom/facebook/imagepipeline/producers/n;->c(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-virtual {p1}, LE6/k;->o()Lq6/c;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 29
    .line 30
    invoke-interface {v2}, Lcom/facebook/imagepipeline/producers/e0;->q()LK6/b;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/k0$a;->d:LM6/d;

    .line 35
    .line 36
    iget-boolean v4, p0, Lcom/facebook/imagepipeline/producers/k0$a;->c:Z

    .line 37
    .line 38
    invoke-interface {v3, v1, v4}, LM6/d;->createImageTranscoder(Lq6/c;Z)LM6/c;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v3}, Ly5/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, LM6/c;

    .line 47
    .line 48
    invoke-static {v2, p1, v3}, Lcom/facebook/imagepipeline/producers/k0;->e(LK6/b;LE6/k;LM6/c;)LG5/e;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    sget-object v3, LG5/e;->c:LG5/e;

    .line 55
    .line 56
    if-ne v2, v3, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    sget-object v3, LG5/e;->a:LG5/e;

    .line 60
    .line 61
    if-eq v2, v3, :cond_3

    .line 62
    .line 63
    invoke-direct {p0, p1, p2, v1}, Lcom/facebook/imagepipeline/producers/k0$a;->x(LE6/k;ILq6/c;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_3
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/k0$a;->g:Lcom/facebook/imagepipeline/producers/G;

    .line 68
    .line 69
    invoke-virtual {v1, p1, p2}, Lcom/facebook/imagepipeline/producers/G;->k(LE6/k;I)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    if-nez v0, :cond_6

    .line 77
    .line 78
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/k0$a;->e:Lcom/facebook/imagepipeline/producers/e0;

    .line 79
    .line 80
    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->o()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    :goto_0
    return-void

    .line 88
    :cond_6
    :goto_1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/k0$a;->g:Lcom/facebook/imagepipeline/producers/G;

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/G;->h()Z

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method protected bridge synthetic i(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, LE6/k;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/k0$a;->C(LE6/k;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
