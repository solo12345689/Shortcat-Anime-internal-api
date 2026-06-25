.class final Llg/b$c;
.super Llg/b$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final d:Ldg/u;

.field private e:J

.field private f:Z

.field final synthetic g:Llg/b;


# direct methods
.method public constructor <init>(Llg/b;Ldg/u;)V
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Llg/b$c;->g:Llg/b;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Llg/b$a;-><init>(Llg/b;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Llg/b$c;->d:Ldg/u;

    .line 12
    .line 13
    const-wide/16 p1, -0x1

    .line 14
    .line 15
    iput-wide p1, p0, Llg/b$c;->e:J

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Llg/b$c;->f:Z

    .line 19
    .line 20
    return-void
.end method

.method private final h()V
    .locals 7

    .line 1
    iget-wide v0, p0, Llg/b$c;->e:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Llg/b$c;->g:Llg/b;

    .line 10
    .line 11
    invoke-static {v0}, Llg/b;->m(Llg/b;)Ltg/j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ltg/j;->D0()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    :cond_0
    :try_start_0
    iget-object v0, p0, Llg/b$c;->g:Llg/b;

    .line 19
    .line 20
    invoke-static {v0}, Llg/b;->m(Llg/b;)Ltg/j;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ltg/j;->X1()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    iput-wide v0, p0, Llg/b$c;->e:J

    .line 29
    .line 30
    iget-object v0, p0, Llg/b$c;->g:Llg/b;

    .line 31
    .line 32
    invoke-static {v0}, Llg/b;->m(Llg/b;)Ltg/j;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ltg/j;->D0()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, LDf/r;->k1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-wide v1, p0, Llg/b$c;->e:J

    .line 49
    .line 50
    const-wide/16 v3, 0x0

    .line 51
    .line 52
    cmp-long v1, v1, v3

    .line 53
    .line 54
    if-ltz v1, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/4 v2, 0x0

    .line 61
    if-lez v1, :cond_1

    .line 62
    .line 63
    const-string v1, ";"

    .line 64
    .line 65
    const/4 v5, 0x2

    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-static {v0, v1, v2, v5, v6}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catch_0
    move-exception v0

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    :goto_0
    iget-wide v0, p0, Llg/b$c;->e:J

    .line 77
    .line 78
    cmp-long v0, v0, v3

    .line 79
    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    iput-boolean v2, p0, Llg/b$c;->f:Z

    .line 83
    .line 84
    iget-object v0, p0, Llg/b$c;->g:Llg/b;

    .line 85
    .line 86
    invoke-static {v0}, Llg/b;->k(Llg/b;)Llg/a;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Llg/a;->a()Ldg/t;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v0, v1}, Llg/b;->q(Llg/b;Ldg/t;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Llg/b$c;->g:Llg/b;

    .line 98
    .line 99
    invoke-static {v0}, Llg/b;->j(Llg/b;)Ldg/A;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ldg/A;->s()Ldg/n;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iget-object v1, p0, Llg/b$c;->d:Ldg/u;

    .line 111
    .line 112
    iget-object v2, p0, Llg/b$c;->g:Llg/b;

    .line 113
    .line 114
    invoke-static {v2}, Llg/b;->o(Llg/b;)Ldg/t;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0, v1, v2}, Lkg/e;->f(Ldg/n;Ldg/u;Ldg/t;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Llg/b$a;->b()V

    .line 125
    .line 126
    .line 127
    :cond_2
    return-void

    .line 128
    :cond_3
    :try_start_1
    new-instance v1, Ljava/net/ProtocolException;

    .line 129
    .line 130
    new-instance v2, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    .line 135
    const-string v3, "expected chunk size and optional extensions but was \""

    .line 136
    .line 137
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    iget-wide v3, p0, Llg/b$c;->e:J

    .line 141
    .line 142
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const/16 v0, 0x22

    .line 149
    .line 150
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 161
    :goto_1
    new-instance v1, Ljava/net/ProtocolException;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v1
.end method


# virtual methods
.method public N0(Ltg/h;J)J
    .locals 7

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long v2, p2, v0

    .line 9
    .line 10
    if-ltz v2, :cond_5

    .line 11
    .line 12
    invoke-virtual {p0}, Llg/b$a;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_4

    .line 17
    .line 18
    iget-boolean v2, p0, Llg/b$c;->f:Z

    .line 19
    .line 20
    const-wide/16 v3, -0x1

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    return-wide v3

    .line 25
    :cond_0
    iget-wide v5, p0, Llg/b$c;->e:J

    .line 26
    .line 27
    cmp-long v0, v5, v0

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    cmp-long v0, v5, v3

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    :cond_1
    invoke-direct {p0}, Llg/b$c;->h()V

    .line 36
    .line 37
    .line 38
    iget-boolean v0, p0, Llg/b$c;->f:Z

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    return-wide v3

    .line 43
    :cond_2
    iget-wide v0, p0, Llg/b$c;->e:J

    .line 44
    .line 45
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide p2

    .line 49
    invoke-super {p0, p1, p2, p3}, Llg/b$a;->N0(Ltg/h;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide p1

    .line 53
    cmp-long p3, p1, v3

    .line 54
    .line 55
    if-eqz p3, :cond_3

    .line 56
    .line 57
    iget-wide v0, p0, Llg/b$c;->e:J

    .line 58
    .line 59
    sub-long/2addr v0, p1

    .line 60
    iput-wide v0, p0, Llg/b$c;->e:J

    .line 61
    .line 62
    return-wide p1

    .line 63
    :cond_3
    iget-object p1, p0, Llg/b$c;->g:Llg/b;

    .line 64
    .line 65
    invoke-virtual {p1}, Llg/b;->c()Ljg/f;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljg/f;->z()V

    .line 70
    .line 71
    .line 72
    new-instance p1, Ljava/net/ProtocolException;

    .line 73
    .line 74
    const-string p2, "unexpected end of stream"

    .line 75
    .line 76
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Llg/b$a;->b()V

    .line 80
    .line 81
    .line 82
    throw p1

    .line 83
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    const-string p2, "closed"

    .line 86
    .line 87
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v0, "byteCount < 0: "

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p2
.end method

.method public close()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Llg/b$a;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v0, p0, Llg/b$c;->f:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const/16 v0, 0x64

    .line 13
    .line 14
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    invoke-static {p0, v0, v1}, Lfg/e;->s(Ltg/Z;ILjava/util/concurrent/TimeUnit;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Llg/b$c;->g:Llg/b;

    .line 23
    .line 24
    invoke-virtual {v0}, Llg/b;->c()Ljg/f;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljg/f;->z()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Llg/b$a;->b()V

    .line 32
    .line 33
    .line 34
    :cond_1
    const/4 v0, 0x1

    .line 35
    invoke-virtual {p0, v0}, Llg/b$a;->g(Z)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
