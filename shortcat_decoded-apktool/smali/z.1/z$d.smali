.class final Lz/z$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/z;->q(JLZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:J

.field b:I

.field synthetic c:J

.field final synthetic d:Lz/z;


# direct methods
.method constructor <init>(Lz/z;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/z$d;->d:Lz/z;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(JLZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Li1/y;->b(J)Li1/y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p3}, Lz/z$d;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lz/z$d;

    .line 10
    .line 11
    sget-object p2, LTd/L;->a:LTd/L;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lz/z$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance v0, Lz/z$d;

    .line 2
    .line 3
    iget-object v1, p0, Lz/z$d;->d:Lz/z;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lz/z$d;-><init>(Lz/z;LZd/e;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Li1/y;

    .line 9
    .line 10
    invoke-virtual {p1}, Li1/y;->o()J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, v0, Lz/z$d;->c:J

    .line 15
    .line 16
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Li1/y;

    .line 2
    .line 3
    invoke-virtual {p1}, Li1/y;->o()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    check-cast p2, LZd/e;

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1, p2}, Lz/z$d;->a(JLZd/e;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v6

    .line 5
    iget v0, p0, Lz/z$d;->b:I

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    const/4 v2, 0x2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    if-eq v0, v3, :cond_2

    .line 13
    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    iget-wide v0, p0, Lz/z$d;->a:J

    .line 19
    .line 20
    iget-wide v2, p0, Lz/z$d;->c:J

    .line 21
    .line 22
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-wide v7, v2

    .line 26
    move-wide v3, v0

    .line 27
    move-object v0, p1

    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    iget-wide v2, p0, Lz/z$d;->a:J

    .line 39
    .line 40
    iget-wide v7, p0, Lz/z$d;->c:J

    .line 41
    .line 42
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object v0, p1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget-wide v3, p0, Lz/z$d;->c:J

    .line 48
    .line 49
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v0, p1

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-wide v7, p0, Lz/z$d;->c:J

    .line 58
    .line 59
    iget-object v0, p0, Lz/z$d;->d:Lz/z;

    .line 60
    .line 61
    invoke-static {v0}, Lz/z;->c(Lz/z;)LD0/b;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-wide v7, p0, Lz/z$d;->c:J

    .line 66
    .line 67
    iput v3, p0, Lz/z$d;->b:I

    .line 68
    .line 69
    invoke-virtual {v0, v7, v8, p0}, LD0/b;->c(JLZd/e;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-ne v0, v6, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    move-wide v3, v7

    .line 77
    :goto_0
    check-cast v0, Li1/y;

    .line 78
    .line 79
    invoke-virtual {v0}, Li1/y;->o()J

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    invoke-static {v3, v4, v7, v8}, Li1/y;->k(JJ)J

    .line 84
    .line 85
    .line 86
    move-result-wide v7

    .line 87
    iget-object v0, p0, Lz/z$d;->d:Lz/z;

    .line 88
    .line 89
    iput-wide v3, p0, Lz/z$d;->c:J

    .line 90
    .line 91
    iput-wide v7, p0, Lz/z$d;->a:J

    .line 92
    .line 93
    iput v2, p0, Lz/z$d;->b:I

    .line 94
    .line 95
    invoke-virtual {v0, v7, v8, p0}, Lz/z;->n(JLZd/e;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-ne v0, v6, :cond_5

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    move-wide v11, v7

    .line 103
    move-wide v7, v3

    .line 104
    move-wide v2, v11

    .line 105
    :goto_1
    check-cast v0, Li1/y;

    .line 106
    .line 107
    invoke-virtual {v0}, Li1/y;->o()J

    .line 108
    .line 109
    .line 110
    move-result-wide v9

    .line 111
    iget-object v0, p0, Lz/z$d;->d:Lz/z;

    .line 112
    .line 113
    invoke-static {v0}, Lz/z;->c(Lz/z;)LD0/b;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v2, v3, v9, v10}, Li1/y;->k(JJ)J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    iput-wide v7, p0, Lz/z$d;->c:J

    .line 122
    .line 123
    iput-wide v9, p0, Lz/z$d;->a:J

    .line 124
    .line 125
    iput v1, p0, Lz/z$d;->b:I

    .line 126
    .line 127
    move-object v5, p0

    .line 128
    move-wide v1, v2

    .line 129
    move-wide v3, v9

    .line 130
    invoke-virtual/range {v0 .. v5}, LD0/b;->a(JJLZd/e;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-ne v0, v6, :cond_6

    .line 135
    .line 136
    :goto_2
    return-object v6

    .line 137
    :cond_6
    :goto_3
    check-cast v0, Li1/y;

    .line 138
    .line 139
    invoke-virtual {v0}, Li1/y;->o()J

    .line 140
    .line 141
    .line 142
    move-result-wide v0

    .line 143
    invoke-static {v3, v4, v0, v1}, Li1/y;->k(JJ)J

    .line 144
    .line 145
    .line 146
    move-result-wide v0

    .line 147
    invoke-static {v7, v8, v0, v1}, Li1/y;->k(JJ)J

    .line 148
    .line 149
    .line 150
    move-result-wide v0

    .line 151
    invoke-static {v0, v1}, Li1/y;->b(J)Li1/y;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    return-object v0
.end method
