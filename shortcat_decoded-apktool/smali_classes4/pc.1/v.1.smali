.class public final Lpc/v;
.super Lexpo/modules/kotlin/types/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lpe/q;

.field private final b:Lpe/q;

.field private final c:Lpe/q;

.field private final d:Lpe/q;

.field private final e:Lexpo/modules/kotlin/types/b;

.field private final f:Lexpo/modules/kotlin/types/b;

.field private final g:Lexpo/modules/kotlin/types/b;

.field private final h:Lexpo/modules/kotlin/types/b;

.field private final i:Lexpo/modules/kotlin/jni/ExpectedType;

.field private final j:Lexpo/modules/kotlin/jni/ExpectedType;

.field private final k:Lexpo/modules/kotlin/jni/ExpectedType;

.field private final l:Lexpo/modules/kotlin/jni/ExpectedType;


# direct methods
.method public constructor <init>(Lpc/X;Lpe/q;)V
    .locals 6

    .line 1
    const-string v0, "converterProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eitherType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lexpo/modules/kotlin/types/a;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p2}, Lpe/q;->e()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {v0, v1}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lpe/s;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lpe/s;->c()Lpe/q;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v0, v1

    .line 34
    :goto_0
    const-string v2, "Required value was null."

    .line 35
    .line 36
    if-eqz v0, :cond_7

    .line 37
    .line 38
    iput-object v0, p0, Lpc/v;->a:Lpe/q;

    .line 39
    .line 40
    invoke-interface {p2}, Lpe/q;->e()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const/4 v4, 0x1

    .line 45
    invoke-static {v3, v4}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Lpe/s;

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v3}, Lpe/s;->c()Lpe/q;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v3, v1

    .line 59
    :goto_1
    if-eqz v3, :cond_6

    .line 60
    .line 61
    iput-object v3, p0, Lpc/v;->b:Lpe/q;

    .line 62
    .line 63
    invoke-interface {p2}, Lpe/q;->e()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    const/4 v5, 0x2

    .line 68
    invoke-static {v4, v5}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Lpe/s;

    .line 73
    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    invoke-virtual {v4}, Lpe/s;->c()Lpe/q;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move-object v4, v1

    .line 82
    :goto_2
    if-eqz v4, :cond_5

    .line 83
    .line 84
    iput-object v4, p0, Lpc/v;->c:Lpe/q;

    .line 85
    .line 86
    invoke-interface {p2}, Lpe/q;->e()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    const/4 v5, 0x3

    .line 91
    invoke-static {p2, v5}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, Lpe/s;

    .line 96
    .line 97
    if-eqz p2, :cond_3

    .line 98
    .line 99
    invoke-virtual {p2}, Lpe/s;->c()Lpe/q;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :cond_3
    if-eqz v1, :cond_4

    .line 104
    .line 105
    iput-object v1, p0, Lpc/v;->d:Lpe/q;

    .line 106
    .line 107
    invoke-interface {p1, v0}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    iput-object p2, p0, Lpc/v;->e:Lexpo/modules/kotlin/types/b;

    .line 112
    .line 113
    invoke-interface {p1, v3}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iput-object v0, p0, Lpc/v;->f:Lexpo/modules/kotlin/types/b;

    .line 118
    .line 119
    invoke-interface {p1, v4}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iput-object v2, p0, Lpc/v;->g:Lexpo/modules/kotlin/types/b;

    .line 124
    .line 125
    invoke-interface {p1, v1}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iput-object p1, p0, Lpc/v;->h:Lexpo/modules/kotlin/types/b;

    .line 130
    .line 131
    invoke-interface {p2}, Lexpo/modules/kotlin/types/b;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    iput-object p2, p0, Lpc/v;->i:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 136
    .line 137
    invoke-interface {v0}, Lexpo/modules/kotlin/types/b;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    iput-object p2, p0, Lpc/v;->j:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 142
    .line 143
    invoke-interface {v2}, Lexpo/modules/kotlin/types/b;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    iput-object p2, p0, Lpc/v;->k:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 148
    .line 149
    invoke-interface {p1}, Lexpo/modules/kotlin/types/b;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iput-object p1, p0, Lpc/v;->l:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 154
    .line 155
    return-void

    .line 156
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 157
    .line 158
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p1

    .line 162
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 163
    .line 164
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p1

    .line 168
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 169
    .line 170
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw p1

    .line 174
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 175
    .line 176
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p1
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public c()Lexpo/modules/kotlin/jni/ExpectedType;
    .locals 5

    .line 1
    sget-object v0, Lexpo/modules/kotlin/jni/ExpectedType;->c:Lexpo/modules/kotlin/jni/ExpectedType$a;

    .line 2
    .line 3
    iget-object v1, p0, Lpc/v;->i:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 4
    .line 5
    iget-object v2, p0, Lpc/v;->j:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 6
    .line 7
    iget-object v3, p0, Lpc/v;->k:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 8
    .line 9
    iget-object v4, p0, Lpc/v;->l:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 10
    .line 11
    filled-new-array {v1, v2, v3, v4}, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/jni/ExpectedType$a;->f([Lexpo/modules/kotlin/jni/ExpectedType;)Lexpo/modules/kotlin/jni/ExpectedType;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public bridge synthetic d(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lpc/v;->e(Ljava/lang/Object;LUb/d;Z)Lexpo/modules/kotlin/types/EitherOfFour;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public e(Ljava/lang/Object;LUb/d;Z)Lexpo/modules/kotlin/types/EitherOfFour;
    .locals 10

    .line 1
    const-string p3, "value"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lpc/v;->a:Lpe/q;

    .line 7
    .line 8
    iget-object v0, p0, Lpc/v;->b:Lpe/q;

    .line 9
    .line 10
    iget-object v1, p0, Lpc/v;->c:Lpe/q;

    .line 11
    .line 12
    iget-object v2, p0, Lpc/v;->d:Lpe/q;

    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    new-array v4, v3, [Lpe/q;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    aput-object p3, v4, v5

    .line 19
    .line 20
    const/4 p3, 0x1

    .line 21
    aput-object v0, v4, p3

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    aput-object v1, v4, v0

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    aput-object v2, v4, v1

    .line 28
    .line 29
    invoke-static {v4}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v4, p0, Lpc/v;->i:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 34
    .line 35
    iget-object v6, p0, Lpc/v;->e:Lexpo/modules/kotlin/types/b;

    .line 36
    .line 37
    invoke-static {v4, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    iget-object v6, p0, Lpc/v;->j:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 42
    .line 43
    iget-object v7, p0, Lpc/v;->f:Lexpo/modules/kotlin/types/b;

    .line 44
    .line 45
    invoke-static {v6, v7}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    iget-object v7, p0, Lpc/v;->k:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 50
    .line 51
    iget-object v8, p0, Lpc/v;->g:Lexpo/modules/kotlin/types/b;

    .line 52
    .line 53
    invoke-static {v7, v8}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    iget-object v8, p0, Lpc/v;->l:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 58
    .line 59
    iget-object v9, p0, Lpc/v;->h:Lexpo/modules/kotlin/types/b;

    .line 60
    .line 61
    invoke-static {v8, v9}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    filled-new-array {v4, v6, v7, v8}, [Lkotlin/Pair;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-static {v4}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    iget-object v6, p0, Lpc/v;->a:Lpe/q;

    .line 74
    .line 75
    iget-object v7, p0, Lpc/v;->b:Lpe/q;

    .line 76
    .line 77
    iget-object v8, p0, Lpc/v;->c:Lpe/q;

    .line 78
    .line 79
    iget-object v9, p0, Lpc/v;->d:Lpe/q;

    .line 80
    .line 81
    new-array v3, v3, [Lpe/q;

    .line 82
    .line 83
    aput-object v6, v3, v5

    .line 84
    .line 85
    aput-object v7, v3, p3

    .line 86
    .line 87
    aput-object v8, v3, v0

    .line 88
    .line 89
    aput-object v9, v3, v1

    .line 90
    .line 91
    invoke-static {v3}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    invoke-static {p1, p2, v4, p3}, Lpc/z;->b(Ljava/lang/Object;LUb/d;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    new-instance p3, Lexpo/modules/kotlin/types/EitherOfFour;

    .line 100
    .line 101
    invoke-static {p2}, LUd/u;->d1(Ljava/util/Collection;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-direct {p3, p1, p2, v2}, Lexpo/modules/kotlin/types/EitherOfFour;-><init>(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    return-object p3
.end method
