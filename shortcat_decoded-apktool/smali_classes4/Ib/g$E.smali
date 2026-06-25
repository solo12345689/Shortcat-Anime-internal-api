.class public final LIb/g$E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIb/g;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LIb/g;


# direct methods
.method public constructor <init>(LIb/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LIb/g$E;->a:LIb/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;LUb/u;)V
    .locals 11

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "promise"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    aget-object v1, p1, v0

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    aget-object v3, p1, v2

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    aget-object p1, p1, v4

    .line 19
    .line 20
    check-cast p1, Ljava/util/Map;

    .line 21
    .line 22
    check-cast v3, Lexpo/modules/image/records/CachePolicy;

    .line 23
    .line 24
    check-cast v1, Ljava/util/List;

    .line 25
    .line 26
    iget-object v4, p0, LIb/g$E;->a:LIb/g;

    .line 27
    .line 28
    invoke-virtual {v4}, Lgc/c;->i()LUb/d;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, LUb/d;->B()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    if-nez v4, :cond_0

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    new-instance v5, Lkotlin/jvm/internal/L;

    .line 40
    .line 41
    invoke-direct {v5}, Lkotlin/jvm/internal/L;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v6, Lkotlin/jvm/internal/J;

    .line 45
    .line 46
    invoke-direct {v6}, Lkotlin/jvm/internal/J;-><init>()V

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    new-instance v7, LY4/k$a;

    .line 52
    .line 53
    invoke-direct {v7}, LY4/k$a;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    if-eqz v8, :cond_1

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    check-cast v8, Ljava/util/Map$Entry;

    .line 75
    .line 76
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    check-cast v9, Ljava/lang/String;

    .line 81
    .line 82
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    check-cast v8, Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v7, v9, v8}, LY4/k$a;->b(Ljava/lang/String;Ljava/lang/String;)LY4/k$a;

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {v7}, LY4/k$a;->c()LY4/k;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-eqz p1, :cond_2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    sget-object p1, LY4/i;->b:LY4/i;

    .line 100
    .line 101
    :goto_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-eqz v8, :cond_4

    .line 110
    .line 111
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    check-cast v8, Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v4}, Lcom/bumptech/glide/b;->v(Landroid/content/Context;)Lcom/bumptech/glide/k;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    new-instance v10, LY4/h;

    .line 122
    .line 123
    invoke-direct {v10, v8, p1}, LY4/h;-><init>(Ljava/lang/String;LY4/i;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9, v10}, Lcom/bumptech/glide/k;->u(Ljava/lang/Object;)Lcom/bumptech/glide/j;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    const/16 v9, 0x64

    .line 131
    .line 132
    invoke-virtual {v8, v9}, Lk5/a;->i(I)Lk5/a;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    check-cast v8, Lcom/bumptech/glide/j;

    .line 137
    .line 138
    sget-object v9, LIb/p;->j:LIb/p;

    .line 139
    .line 140
    invoke-virtual {v8, v9}, Lk5/a;->h(Lb5/n;)Lk5/a;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    const-string v9, "downsample(...)"

    .line 145
    .line 146
    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    check-cast v8, Lcom/bumptech/glide/j;

    .line 150
    .line 151
    sget-object v9, Lexpo/modules/image/records/CachePolicy;->MEMORY:Lexpo/modules/image/records/CachePolicy;

    .line 152
    .line 153
    if-ne v3, v9, :cond_3

    .line 154
    .line 155
    move v9, v2

    .line 156
    goto :goto_3

    .line 157
    :cond_3
    move v9, v0

    .line 158
    :goto_3
    sget-object v10, LIb/g$r;->a:LIb/g$r;

    .line 159
    .line 160
    invoke-static {v8, v9, v10}, LIb/j;->b(Lcom/bumptech/glide/j;ZLkotlin/jvm/functions/Function1;)Lcom/bumptech/glide/j;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    new-instance v9, LIb/g$s;

    .line 165
    .line 166
    invoke-direct {v9, v6, p2, v5, v1}, LIb/g$s;-><init>(Lkotlin/jvm/internal/J;LUb/u;Lkotlin/jvm/internal/L;Ljava/util/List;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8, v9}, Lcom/bumptech/glide/j;->u0(Lk5/e;)Lcom/bumptech/glide/j;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-virtual {v8}, Lcom/bumptech/glide/j;->y0()Lk5/b;

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, LUb/u;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LIb/g$E;->a([Ljava/lang/Object;LUb/u;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
