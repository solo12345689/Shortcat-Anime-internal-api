.class final Ldc/p$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldc/p;->a(LUb/d;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:I

.field private synthetic e:Ljava/lang/Object;

.field final synthetic f:Lexpo/modules/kotlin/jni/PromiseImpl;

.field final synthetic g:Ldc/p;

.field final synthetic h:Ljava/lang/String;

.field final synthetic i:[Ljava/lang/Object;

.field final synthetic j:LUb/d;


# direct methods
.method constructor <init>(Lexpo/modules/kotlin/jni/PromiseImpl;Ldc/p;Ljava/lang/String;[Ljava/lang/Object;LUb/d;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldc/p$a;->f:Lexpo/modules/kotlin/jni/PromiseImpl;

    .line 2
    .line 3
    iput-object p2, p0, Ldc/p$a;->g:Ldc/p;

    .line 4
    .line 5
    iput-object p3, p0, Ldc/p$a;->h:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Ldc/p$a;->i:[Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p5, p0, Ldc/p$a;->j:LUb/d;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 7

    .line 1
    new-instance v0, Ldc/p$a;

    .line 2
    .line 3
    iget-object v1, p0, Ldc/p$a;->f:Lexpo/modules/kotlin/jni/PromiseImpl;

    .line 4
    .line 5
    iget-object v2, p0, Ldc/p$a;->g:Ldc/p;

    .line 6
    .line 7
    iget-object v3, p0, Ldc/p$a;->h:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Ldc/p$a;->i:[Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, Ldc/p$a;->j:LUb/d;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Ldc/p$a;-><init>(Lexpo/modules/kotlin/jni/PromiseImpl;Ldc/p;Ljava/lang/String;[Ljava/lang/Object;LUb/d;LZd/e;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Ldc/p$a;->e:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ldc/p$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Ldc/p$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Ldc/p$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Ldc/p$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Ldc/p$a;->d:I

    .line 6
    .line 7
    const-string v2, "getCode(...)"

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Ldc/p$a;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LGf/O;

    .line 17
    .line 18
    iget-object v1, p0, Ldc/p$a;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lexpo/modules/kotlin/jni/PromiseImpl;

    .line 21
    .line 22
    iget-object v3, p0, Ldc/p$a;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Ljava/lang/String;

    .line 25
    .line 26
    iget-object v4, p0, Ldc/p$a;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Ldc/p;

    .line 29
    .line 30
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    move-object p1, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Ldc/p$a;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, LGf/O;

    .line 51
    .line 52
    :try_start_1
    iget-object v4, p0, Ldc/p$a;->g:Ldc/p;

    .line 53
    .line 54
    iget-object v1, p0, Ldc/p$a;->h:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v5, p0, Ldc/p$a;->i:[Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v6, p0, Ldc/p$a;->j:LUb/d;

    .line 59
    .line 60
    iget-object v10, p0, Ldc/p$a;->f:Lexpo/modules/kotlin/jni/PromiseImpl;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 61
    .line 62
    :try_start_2
    invoke-static {v4}, Ldc/p;->p(Ldc/p;)Lie/o;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    const/4 v8, 0x4

    .line 67
    const/4 v9, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    invoke-static/range {v4 .. v9}, Ldc/a;->c(Ldc/a;[Ljava/lang/Object;LUb/d;ZILjava/lang/Object;)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    iput-object v4, p0, Ldc/p$a;->e:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v1, p0, Ldc/p$a;->a:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object v10, p0, Ldc/p$a;->b:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object p1, p0, Ldc/p$a;->c:Ljava/lang/Object;

    .line 80
    .line 81
    iput v3, p0, Ldc/p$a;->d:I

    .line 82
    .line 83
    invoke-interface {v11, p1, v5, p0}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 87
    if-ne v3, v0, :cond_2

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_2
    move-object v0, p1

    .line 91
    move-object p1, v3

    .line 92
    move-object v3, v1

    .line 93
    move-object v1, v10

    .line 94
    :goto_0
    :try_start_3
    invoke-static {v0}, LGf/P;->g(LGf/O;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    invoke-virtual {v1, p1}, Lexpo/modules/kotlin/jni/PromiseImpl;->resolve(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 104
    .line 105
    goto/16 :goto_6

    .line 106
    .line 107
    :catchall_1
    move-exception v0

    .line 108
    move-object p1, v0

    .line 109
    move-object v3, v1

    .line 110
    :goto_1
    :try_start_4
    instance-of v0, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 111
    .line 112
    if-nez v0, :cond_5

    .line 113
    .line 114
    instance-of v0, p1, Lrb/a;

    .line 115
    .line 116
    if-eqz v0, :cond_4

    .line 117
    .line 118
    new-instance v0, Lexpo/modules/kotlin/exception/CodedException;

    .line 119
    .line 120
    move-object v1, p1

    .line 121
    check-cast v1, Lrb/a;

    .line 122
    .line 123
    invoke-virtual {v1}, Lrb/a;->a()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    move-object v5, p1

    .line 131
    check-cast v5, Lrb/a;

    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    check-cast p1, Lrb/a;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-direct {v0, v1, v5, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :catchall_2
    move-exception v0

    .line 148
    move-object p1, v0

    .line 149
    goto :goto_3

    .line 150
    :cond_4
    new-instance v0, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 151
    .line 152
    invoke-direct {v0, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    move-object v0, p1

    .line 157
    check-cast v0, Lexpo/modules/kotlin/exception/CodedException;

    .line 158
    .line 159
    :goto_2
    new-instance p1, Lcc/m;

    .line 160
    .line 161
    invoke-virtual {v4}, Ldc/a;->g()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-direct {p1, v1, v3, v0}, Lcc/m;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 166
    .line 167
    .line 168
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 169
    :goto_3
    iget-object v0, p0, Ldc/p$a;->f:Lexpo/modules/kotlin/jni/PromiseImpl;

    .line 170
    .line 171
    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/PromiseImpl;->j()Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-nez v0, :cond_8

    .line 176
    .line 177
    iget-object v0, p0, Ldc/p$a;->f:Lexpo/modules/kotlin/jni/PromiseImpl;

    .line 178
    .line 179
    instance-of v1, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 180
    .line 181
    if-eqz v1, :cond_6

    .line 182
    .line 183
    check-cast p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_6
    instance-of v1, p1, Lrb/a;

    .line 187
    .line 188
    if-eqz v1, :cond_7

    .line 189
    .line 190
    new-instance v1, Lexpo/modules/kotlin/exception/CodedException;

    .line 191
    .line 192
    check-cast p1, Lrb/a;

    .line 193
    .line 194
    invoke-virtual {p1}, Lrb/a;->a()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-direct {v1, v3, v2, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    :goto_4
    move-object p1, v1

    .line 213
    goto :goto_5

    .line 214
    :cond_7
    new-instance v1, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 215
    .line 216
    invoke-direct {v1, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :goto_5
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/PromiseImpl;->h(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 221
    .line 222
    .line 223
    :goto_6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 224
    .line 225
    return-object p1

    .line 226
    :cond_8
    throw p1
.end method
