.class public Ldg/E$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldg/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ldg/C;

.field private b:Ldg/B;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Ldg/s;

.field private f:Ldg/t$a;

.field private g:Ldg/F;

.field private h:Ldg/E;

.field private i:Ldg/E;

.field private j:Ldg/E;

.field private k:J

.field private l:J

.field private m:Ljg/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Ldg/E$a;->c:I

    .line 3
    new-instance v0, Ldg/t$a;

    invoke-direct {v0}, Ldg/t$a;-><init>()V

    iput-object v0, p0, Ldg/E$a;->f:Ldg/t$a;

    return-void
.end method

.method public constructor <init>(Ldg/E;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Ldg/E$a;->c:I

    .line 6
    invoke-virtual {p1}, Ldg/E;->F0()Ldg/C;

    move-result-object v0

    iput-object v0, p0, Ldg/E$a;->a:Ldg/C;

    .line 7
    invoke-virtual {p1}, Ldg/E;->p0()Ldg/B;

    move-result-object v0

    iput-object v0, p0, Ldg/E$a;->b:Ldg/B;

    .line 8
    invoke-virtual {p1}, Ldg/E;->o()I

    move-result v0

    iput v0, p0, Ldg/E$a;->c:I

    .line 9
    invoke-virtual {p1}, Ldg/E;->O()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldg/E$a;->d:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Ldg/E;->w()Ldg/s;

    move-result-object v0

    iput-object v0, p0, Ldg/E$a;->e:Ldg/s;

    .line 11
    invoke-virtual {p1}, Ldg/E;->E()Ldg/t;

    move-result-object v0

    invoke-virtual {v0}, Ldg/t;->l()Ldg/t$a;

    move-result-object v0

    iput-object v0, p0, Ldg/E$a;->f:Ldg/t$a;

    .line 12
    invoke-virtual {p1}, Ldg/E;->j()Ldg/F;

    move-result-object v0

    iput-object v0, p0, Ldg/E$a;->g:Ldg/F;

    .line 13
    invoke-virtual {p1}, Ldg/E;->S()Ldg/E;

    move-result-object v0

    iput-object v0, p0, Ldg/E$a;->h:Ldg/E;

    .line 14
    invoke-virtual {p1}, Ldg/E;->l()Ldg/E;

    move-result-object v0

    iput-object v0, p0, Ldg/E$a;->i:Ldg/E;

    .line 15
    invoke-virtual {p1}, Ldg/E;->k0()Ldg/E;

    move-result-object v0

    iput-object v0, p0, Ldg/E$a;->j:Ldg/E;

    .line 16
    invoke-virtual {p1}, Ldg/E;->G0()J

    move-result-wide v0

    iput-wide v0, p0, Ldg/E$a;->k:J

    .line 17
    invoke-virtual {p1}, Ldg/E;->B0()J

    move-result-wide v0

    iput-wide v0, p0, Ldg/E$a;->l:J

    .line 18
    invoke-virtual {p1}, Ldg/E;->q()Ljg/c;

    move-result-object p1

    iput-object p1, p0, Ldg/E$a;->m:Ljg/c;

    return-void
.end method

.method private final e(Ldg/E;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ldg/E;->j()Ldg/F;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v0, "priorResponse.body != null"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :cond_1
    return-void
.end method

.method private final f(Ljava/lang/String;Ldg/E;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_4

    .line 2
    .line 3
    invoke-virtual {p2}, Ldg/E;->j()Ldg/F;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p2}, Ldg/E;->S()Ldg/E;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p2}, Ldg/E;->l()Ldg/E;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2}, Ldg/E;->k0()Ldg/E;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-nez p2, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, ".priorResponse != null"

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p2

    .line 55
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p1, ".cacheResponse != null"

    .line 64
    .line 65
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p2

    .line 82
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p1, ".networkResponse != null"

    .line 91
    .line 92
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p2

    .line 109
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string p1, ".body != null"

    .line 118
    .line 119
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p2

    .line 136
    :cond_4
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Ldg/E$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldg/E$a;->f:Ldg/t$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Ldg/t$a;->a(Ljava/lang/String;Ljava/lang/String;)Ldg/t$a;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public b(Ldg/F;)Ldg/E$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ldg/E$a;->g:Ldg/F;

    .line 2
    .line 3
    return-object p0
.end method

.method public c()Ldg/E;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v5, v0, Ldg/E$a;->c:I

    .line 4
    .line 5
    if-ltz v5, :cond_3

    .line 6
    .line 7
    iget-object v2, v0, Ldg/E$a;->a:Ldg/C;

    .line 8
    .line 9
    if-eqz v2, :cond_2

    .line 10
    .line 11
    iget-object v3, v0, Ldg/E$a;->b:Ldg/B;

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    iget-object v4, v0, Ldg/E$a;->d:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iget-object v6, v0, Ldg/E$a;->e:Ldg/s;

    .line 20
    .line 21
    iget-object v1, v0, Ldg/E$a;->f:Ldg/t$a;

    .line 22
    .line 23
    invoke-virtual {v1}, Ldg/t$a;->e()Ldg/t;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    iget-object v8, v0, Ldg/E$a;->g:Ldg/F;

    .line 28
    .line 29
    iget-object v9, v0, Ldg/E$a;->h:Ldg/E;

    .line 30
    .line 31
    iget-object v10, v0, Ldg/E$a;->i:Ldg/E;

    .line 32
    .line 33
    iget-object v11, v0, Ldg/E$a;->j:Ldg/E;

    .line 34
    .line 35
    iget-wide v12, v0, Ldg/E$a;->k:J

    .line 36
    .line 37
    iget-wide v14, v0, Ldg/E$a;->l:J

    .line 38
    .line 39
    iget-object v1, v0, Ldg/E$a;->m:Ljg/c;

    .line 40
    .line 41
    move-object/from16 v16, v1

    .line 42
    .line 43
    new-instance v1, Ldg/E;

    .line 44
    .line 45
    invoke-direct/range {v1 .. v16}, Ldg/E;-><init>(Ldg/C;Ldg/B;Ljava/lang/String;ILdg/s;Ldg/t;Ldg/F;Ldg/E;Ldg/E;Ldg/E;JJLjg/c;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v2, "message == null"

    .line 52
    .line 53
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v1

    .line 57
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v2, "protocol == null"

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v2, "request == null"

    .line 68
    .line 69
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v1

    .line 73
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v2, "code < 0: "

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget v2, v0, Ldg/E$a;->c:I

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v2
.end method

.method public d(Ldg/E;)Ldg/E$a;
    .locals 1

    .line 1
    const-string v0, "cacheResponse"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Ldg/E$a;->f(Ljava/lang/String;Ldg/E;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldg/E$a;->i:Ldg/E;

    .line 7
    .line 8
    return-object p0
.end method

.method public g(I)Ldg/E$a;
    .locals 0

    .line 1
    iput p1, p0, Ldg/E$a;->c:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/E$a;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public i(Ldg/s;)Ldg/E$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ldg/E$a;->e:Ldg/s;

    .line 2
    .line 3
    return-object p0
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;)Ldg/E$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldg/E$a;->f:Ldg/t$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Ldg/t$a;->i(Ljava/lang/String;Ljava/lang/String;)Ldg/t$a;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public k(Ldg/t;)Ldg/E$a;
    .locals 1

    .line 1
    const-string v0, "headers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ldg/t;->l()Ldg/t$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Ldg/E$a;->f:Ldg/t$a;

    .line 11
    .line 12
    return-object p0
.end method

.method public final l(Ljg/c;)V
    .locals 1

    .line 1
    const-string v0, "deferredTrailers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldg/E$a;->m:Ljg/c;

    .line 7
    .line 8
    return-void
.end method

.method public m(Ljava/lang/String;)Ldg/E$a;
    .locals 1

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldg/E$a;->d:Ljava/lang/String;

    .line 7
    .line 8
    return-object p0
.end method

.method public n(Ldg/E;)Ldg/E$a;
    .locals 1

    .line 1
    const-string v0, "networkResponse"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Ldg/E$a;->f(Ljava/lang/String;Ldg/E;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldg/E$a;->h:Ldg/E;

    .line 7
    .line 8
    return-object p0
.end method

.method public o(Ldg/E;)Ldg/E$a;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldg/E$a;->e(Ldg/E;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldg/E$a;->j:Ldg/E;

    .line 5
    .line 6
    return-object p0
.end method

.method public p(Ldg/B;)Ldg/E$a;
    .locals 1

    .line 1
    const-string v0, "protocol"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldg/E$a;->b:Ldg/B;

    .line 7
    .line 8
    return-object p0
.end method

.method public q(J)Ldg/E$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Ldg/E$a;->l:J

    .line 2
    .line 3
    return-object p0
.end method

.method public r(Ljava/lang/String;)Ldg/E$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldg/E$a;->f:Ldg/t$a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ldg/t$a;->h(Ljava/lang/String;)Ldg/t$a;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public s(Ldg/C;)Ldg/E$a;
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldg/E$a;->a:Ldg/C;

    .line 7
    .line 8
    return-object p0
.end method

.method public t(J)Ldg/E$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Ldg/E$a;->k:J

    .line 2
    .line 3
    return-object p0
.end method
