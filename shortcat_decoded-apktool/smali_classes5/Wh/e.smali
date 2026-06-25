.class public abstract LWh/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lbi/a;


# instance fields
.field private final a:C


# direct methods
.method protected constructor <init>(C)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-char p1, p0, LWh/e;->a:C

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()C
    .locals 1

    .line 1
    iget-char v0, p0, LWh/e;->a:C

    .line 2
    .line 3
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public c()C
    .locals 1

    .line 1
    iget-char v0, p0, LWh/e;->a:C

    .line 2
    .line 3
    return v0
.end method

.method public d(Lbi/b;Lbi/b;)I
    .locals 5

    .line 1
    invoke-interface {p1}, Lbi/b;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, Lbi/b;->g()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    :cond_0
    invoke-interface {p2}, Lbi/b;->f()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    rem-int/lit8 v0, v0, 0x3

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Lbi/b;->f()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-interface {p2}, Lbi/b;->f()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/2addr v0, v1

    .line 30
    rem-int/lit8 v0, v0, 0x3

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    return p1

    .line 36
    :cond_1
    invoke-interface {p1}, Lbi/b;->length()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v1, 0x2

    .line 41
    if-lt v0, v1, :cond_2

    .line 42
    .line 43
    invoke-interface {p2}, Lbi/b;->length()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-lt v0, v1, :cond_2

    .line 48
    .line 49
    new-instance v0, LYh/z;

    .line 50
    .line 51
    new-instance v2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-char v3, p0, LWh/e;->a:C

    .line 57
    .line 58
    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-char v3, p0, LWh/e;->a:C

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-direct {v0, v2}, LYh/z;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    new-instance v0, LYh/g;

    .line 79
    .line 80
    iget-char v1, p0, LWh/e;->a:C

    .line 81
    .line 82
    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v0, v1}, LYh/g;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const/4 v1, 0x1

    .line 90
    :goto_0
    invoke-static {}, LYh/y;->c()LYh/y;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-interface {p1, v1}, Lbi/b;->a(I)Ljava/lang/Iterable;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v2, v3}, LYh/y;->b(Ljava/lang/Iterable;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p1}, Lbi/b;->d()LYh/A;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {p2}, Lbi/b;->b()LYh/A;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-static {p1, v3}, LYh/t;->a(LYh/s;LYh/s;)Ljava/lang/Iterable;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_3

    .line 122
    .line 123
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    check-cast v4, LYh/s;

    .line 128
    .line 129
    invoke-virtual {v0, v4}, LYh/s;->b(LYh/s;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4}, LYh/s;->g()Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v2, v4}, LYh/y;->a(Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_3
    invoke-interface {p2, v1}, Lbi/b;->e(I)Ljava/lang/Iterable;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-virtual {v2, p2}, LYh/y;->b(Ljava/lang/Iterable;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, LYh/y;->d()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-virtual {v0, p2}, LYh/s;->k(Ljava/util/List;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v0}, LYh/s;->h(LYh/s;)V

    .line 155
    .line 156
    .line 157
    return v1
.end method
