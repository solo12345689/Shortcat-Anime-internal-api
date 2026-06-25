.class public final LK0/w;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/List;
.implements Lje/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK0/w$a;,
        LK0/w$b;
    }
.end annotation


# instance fields
.field private a:Lt/L;

.field private b:Lt/H;

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt/L;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lt/L;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LK0/w;->a:Lt/L;

    .line 12
    .line 13
    new-instance v0, Lt/H;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lt/H;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LK0/w;->b:Lt/H;

    .line 19
    .line 20
    const/4 v0, -0x1

    .line 21
    iput v0, p0, LK0/w;->c:I

    .line 22
    .line 23
    return-void
.end method

.method private final A(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/w;->a:Lt/L;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/L;->r(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK0/w;->b:Lt/H;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lt/H;->h(I)J

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final B(II)V
    .locals 1

    .line 1
    if-lt p1, p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, LK0/w;->a:Lt/L;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lt/L;->s(II)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LK0/w;->b:Lt/H;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lt/H;->i(II)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final synthetic d(LK0/w;)Lt/H;
    .locals 0

    .line 1
    iget-object p0, p0, LK0/w;->b:Lt/H;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(LK0/w;)I
    .locals 0

    .line 1
    iget p0, p0, LK0/w;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic f(LK0/w;)Lt/L;
    .locals 0

    .line 1
    iget-object p0, p0, LK0/w;->a:Lt/L;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(LK0/w;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LK0/w;->B(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic l(LK0/w;I)V
    .locals 0

    .line 1
    iput p1, p0, LK0/w;->c:I

    .line 2
    .line 3
    return-void
.end method

.method private final p()J
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x0

    .line 3
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {v2, v3, v3, v0, v1}, LK0/x;->b(FZZILjava/lang/Object;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget v2, p0, LK0/w;->c:I

    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    invoke-static {p0}, LUd/u;->o(Ljava/util/List;)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-gt v2, v3, :cond_2

    .line 19
    .line 20
    :goto_0
    iget-object v4, p0, LK0/w;->b:Lt/H;

    .line 21
    .line 22
    invoke-virtual {v4, v2}, Lt/t;->a(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    invoke-static {v4, v5}, LK0/r;->b(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    invoke-static {v4, v5, v0, v1}, LK0/r;->a(JJ)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-gez v6, :cond_0

    .line 35
    .line 36
    move-wide v0, v4

    .line 37
    :cond_0
    invoke-static {v0, v1}, LK0/r;->c(J)F

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const/4 v5, 0x0

    .line 42
    cmpg-float v4, v4, v5

    .line 43
    .line 44
    if-gez v4, :cond_1

    .line 45
    .line 46
    invoke-static {v0, v1}, LK0/r;->e(J)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    if-eq v2, v3, :cond_2

    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    :goto_1
    return-wide v0
.end method


# virtual methods
.method public final D(Landroidx/compose/ui/e$c;FZLie/a;)V
    .locals 7

    .line 1
    iget v0, p0, LK0/w;->c:I

    .line 2
    .line 3
    invoke-static {p0}, LUd/u;->o(Ljava/util/List;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_2

    .line 9
    .line 10
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    invoke-virtual {p0}, LK0/w;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-static {p0, v1, v3}, LK0/w;->i(LK0/w;II)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    invoke-static {p0, v1}, LK0/w;->l(LK0/w;I)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, LK0/w;->f(LK0/w;)Lt/L;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1, p1}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, LK0/w;->d(LK0/w;)Lt/H;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p2, p3, v2}, LK0/x;->c(FZZ)J

    .line 48
    .line 49
    .line 50
    move-result-wide p2

    .line 51
    invoke-virtual {p1, p2, p3}, Lt/H;->d(J)Z

    .line 52
    .line 53
    .line 54
    invoke-interface {p4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v0}, LK0/w;->l(LK0/w;I)V

    .line 58
    .line 59
    .line 60
    iget p1, p0, LK0/w;->c:I

    .line 61
    .line 62
    add-int/lit8 p1, p1, 0x1

    .line 63
    .line 64
    invoke-static {p0}, LUd/u;->o(Ljava/util/List;)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eq p1, p2, :cond_1

    .line 69
    .line 70
    invoke-direct {p0}, LK0/w;->p()J

    .line 71
    .line 72
    .line 73
    move-result-wide p1

    .line 74
    invoke-static {p1, p2}, LK0/r;->d(J)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    return-void

    .line 82
    :cond_1
    :goto_0
    iget p1, p0, LK0/w;->c:I

    .line 83
    .line 84
    add-int/lit8 p1, p1, 0x1

    .line 85
    .line 86
    invoke-direct {p0, p1}, LK0/w;->A(I)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    invoke-direct {p0}, LK0/w;->p()J

    .line 91
    .line 92
    .line 93
    move-result-wide v0

    .line 94
    iget v3, p0, LK0/w;->c:I

    .line 95
    .line 96
    invoke-static {p0}, LUd/u;->o(Ljava/util/List;)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    iput v4, p0, LK0/w;->c:I

    .line 101
    .line 102
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    add-int/lit8 v5, v5, 0x1

    .line 111
    .line 112
    invoke-virtual {p0}, LK0/w;->size()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    invoke-static {p0, v5, v6}, LK0/w;->i(LK0/w;II)V

    .line 117
    .line 118
    .line 119
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    add-int/lit8 v5, v5, 0x1

    .line 124
    .line 125
    invoke-static {p0, v5}, LK0/w;->l(LK0/w;I)V

    .line 126
    .line 127
    .line 128
    invoke-static {p0}, LK0/w;->f(LK0/w;)Lt/L;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {v5, p1}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    invoke-static {p0}, LK0/w;->d(LK0/w;)Lt/H;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-static {p2, p3, v2}, LK0/x;->c(FZZ)J

    .line 140
    .line 141
    .line 142
    move-result-wide p2

    .line 143
    invoke-virtual {p1, p2, p3}, Lt/H;->d(J)Z

    .line 144
    .line 145
    .line 146
    invoke-interface {p4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    invoke-static {p0, v4}, LK0/w;->l(LK0/w;I)V

    .line 150
    .line 151
    .line 152
    invoke-direct {p0}, LK0/w;->p()J

    .line 153
    .line 154
    .line 155
    move-result-wide p1

    .line 156
    iget p3, p0, LK0/w;->c:I

    .line 157
    .line 158
    add-int/lit8 p3, p3, 0x1

    .line 159
    .line 160
    invoke-static {p0}, LUd/u;->o(Ljava/util/List;)I

    .line 161
    .line 162
    .line 163
    move-result p4

    .line 164
    if-ge p3, p4, :cond_4

    .line 165
    .line 166
    invoke-static {v0, v1, p1, p2}, LK0/r;->a(JJ)I

    .line 167
    .line 168
    .line 169
    move-result p3

    .line 170
    if-lez p3, :cond_4

    .line 171
    .line 172
    add-int/lit8 p3, v3, 0x1

    .line 173
    .line 174
    invoke-static {p1, p2}, LK0/r;->d(J)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-eqz p1, :cond_3

    .line 179
    .line 180
    iget p1, p0, LK0/w;->c:I

    .line 181
    .line 182
    add-int/lit8 p1, p1, 0x2

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_3
    iget p1, p0, LK0/w;->c:I

    .line 186
    .line 187
    add-int/lit8 p1, p1, 0x1

    .line 188
    .line 189
    :goto_1
    invoke-direct {p0, p3, p1}, LK0/w;->B(II)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_4
    iget p1, p0, LK0/w;->c:I

    .line 194
    .line 195
    add-int/lit8 p1, p1, 0x1

    .line 196
    .line 197
    invoke-virtual {p0}, LK0/w;->size()I

    .line 198
    .line 199
    .line 200
    move-result p2

    .line 201
    invoke-direct {p0, p1, p2}, LK0/w;->B(II)V

    .line 202
    .line 203
    .line 204
    :goto_2
    iput v3, p0, LK0/w;->c:I

    .line 205
    .line 206
    return-void
.end method

.method public bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Operation is not supported for read-only collection"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 1

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Operation is not supported for read-only collection"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic addFirst(Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public bridge synthetic addLast(Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final b()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/w;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    iput v0, p0, LK0/w;->c:I

    .line 8
    .line 9
    return-void
.end method

.method public final clear()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, LK0/w;->c:I

    .line 3
    .line 4
    iget-object v0, p0, LK0/w;->a:Lt/L;

    .line 5
    .line 6
    invoke-virtual {v0}, Lt/L;->n()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LK0/w;->b:Lt/H;

    .line 10
    .line 11
    invoke-virtual {v0}, Lt/H;->f()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Landroidx/compose/ui/e$c;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LK0/w;->n(Landroidx/compose/ui/e$c;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroidx/compose/ui/e$c;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, LK0/w;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return p1

    .line 27
    :cond_1
    const/4 p1, 0x1

    .line 28
    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LK0/w;->r(I)Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Landroidx/compose/ui/e$c;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LK0/w;->w(Landroidx/compose/ui/e$c;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK0/w;->a:Lt/L;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/V;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 7

    .line 1
    new-instance v0, LK0/w$a;

    .line 2
    .line 3
    const/4 v5, 0x7

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    move-object v1, p0

    .line 9
    invoke-direct/range {v0 .. v6}, LK0/w$a;-><init>(LK0/w;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Landroidx/compose/ui/e$c;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LK0/w;->z(Landroidx/compose/ui/e$c;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 7

    .line 1
    new-instance v0, LK0/w$a;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, LK0/w$a;-><init>(LK0/w;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 7

    .line 2
    new-instance v0, LK0/w$a;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move v2, p1

    invoke-direct/range {v0 .. v6}, LK0/w$a;-><init>(LK0/w;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public n(Landroidx/compose/ui/e$c;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, LK0/w;->indexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public r(I)Landroidx/compose/ui/e$c;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/w;->a:Lt/L;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/V;->c(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast p1, Landroidx/compose/ui/e$c;

    .line 13
    .line 14
    return-object p1
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public bridge synthetic removeFirst()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public bridge synthetic removeLast()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public replaceAll(Ljava/util/function/UnaryOperator;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p2, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final bridge size()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/w;->t()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public sort(Ljava/util/Comparator;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public subList(II)Ljava/util/List;
    .locals 1

    .line 1
    new-instance v0, LK0/w$b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LK0/w$b;-><init>(LK0/w;II)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public t()I
    .locals 1

    .line 1
    iget-object v0, p0, LK0/w;->a:Lt/L;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/V;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/j;->a(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0, p1}, Lkotlin/jvm/internal/j;->b(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final u()Z
    .locals 4

    .line 1
    invoke-direct {p0}, LK0/w;->p()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, LK0/r;->c(J)F

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    cmpg-float v2, v2, v3

    .line 11
    .line 12
    if-gez v2, :cond_0

    .line 13
    .line 14
    invoke-static {v0, v1}, LK0/r;->e(J)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-static {v0, v1}, LK0/r;->d(J)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method public final v(Landroidx/compose/ui/e$c;ZLie/a;)V
    .locals 7

    .line 1
    iget v0, p0, LK0/w;->c:I

    .line 2
    .line 3
    invoke-static {p0}, LUd/u;->o(Ljava/util/List;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v3

    .line 20
    invoke-virtual {p0}, LK0/w;->size()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-static {p0, v1, v4}, LK0/w;->i(LK0/w;II)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v1, v3

    .line 32
    invoke-static {p0, v1}, LK0/w;->l(LK0/w;I)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, LK0/w;->f(LK0/w;)Lt/L;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, p1}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, LK0/w;->d(LK0/w;)Lt/H;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {v2, p2, v3}, LK0/x;->c(FZZ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    invoke-virtual {p1, v1, v2}, Lt/H;->d(J)Z

    .line 51
    .line 52
    .line 53
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v0}, LK0/w;->l(LK0/w;I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    invoke-direct {p0}, LK0/w;->p()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    iget v4, p0, LK0/w;->c:I

    .line 65
    .line 66
    invoke-static {v0, v1}, LK0/r;->d(J)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_2

    .line 71
    .line 72
    invoke-static {p0}, LUd/u;->o(Ljava/util/List;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iput v0, p0, LK0/w;->c:I

    .line 77
    .line 78
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    add-int/2addr v1, v3

    .line 87
    invoke-virtual {p0}, LK0/w;->size()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    invoke-static {p0, v1, v5}, LK0/w;->i(LK0/w;II)V

    .line 92
    .line 93
    .line 94
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    add-int/2addr v1, v3

    .line 99
    invoke-static {p0, v1}, LK0/w;->l(LK0/w;I)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0}, LK0/w;->f(LK0/w;)Lt/L;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1, p1}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    invoke-static {p0}, LK0/w;->d(LK0/w;)Lt/H;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {v2, p2, v3}, LK0/x;->c(FZZ)J

    .line 114
    .line 115
    .line 116
    move-result-wide v5

    .line 117
    invoke-virtual {p1, v5, v6}, Lt/H;->d(J)Z

    .line 118
    .line 119
    .line 120
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-static {p0, v0}, LK0/w;->l(LK0/w;I)V

    .line 124
    .line 125
    .line 126
    invoke-direct {p0}, LK0/w;->p()J

    .line 127
    .line 128
    .line 129
    move-result-wide p1

    .line 130
    invoke-static {p1, p2}, LK0/r;->c(J)F

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    cmpg-float p1, p1, v2

    .line 135
    .line 136
    if-gez p1, :cond_1

    .line 137
    .line 138
    add-int/lit8 p1, v4, 0x1

    .line 139
    .line 140
    iget p2, p0, LK0/w;->c:I

    .line 141
    .line 142
    add-int/2addr p2, v3

    .line 143
    invoke-direct {p0, p1, p2}, LK0/w;->B(II)V

    .line 144
    .line 145
    .line 146
    :cond_1
    iput v4, p0, LK0/w;->c:I

    .line 147
    .line 148
    return-void

    .line 149
    :cond_2
    invoke-static {v0, v1}, LK0/r;->c(J)F

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    cmpl-float v0, v0, v2

    .line 154
    .line 155
    if-lez v0, :cond_3

    .line 156
    .line 157
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    add-int/2addr v1, v3

    .line 166
    invoke-virtual {p0}, LK0/w;->size()I

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    invoke-static {p0, v1, v4}, LK0/w;->i(LK0/w;II)V

    .line 171
    .line 172
    .line 173
    invoke-static {p0}, LK0/w;->e(LK0/w;)I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    add-int/2addr v1, v3

    .line 178
    invoke-static {p0, v1}, LK0/w;->l(LK0/w;I)V

    .line 179
    .line 180
    .line 181
    invoke-static {p0}, LK0/w;->f(LK0/w;)Lt/L;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v1, p1}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    invoke-static {p0}, LK0/w;->d(LK0/w;)Lt/H;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-static {v2, p2, v3}, LK0/x;->c(FZZ)J

    .line 193
    .line 194
    .line 195
    move-result-wide v1

    .line 196
    invoke-virtual {p1, v1, v2}, Lt/H;->d(J)Z

    .line 197
    .line 198
    .line 199
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    invoke-static {p0, v0}, LK0/w;->l(LK0/w;I)V

    .line 203
    .line 204
    .line 205
    :cond_3
    return-void
.end method

.method public w(Landroidx/compose/ui/e$c;)I
    .locals 3

    .line 1
    invoke-static {p0}, LUd/u;->o(Ljava/util/List;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    iget-object v2, p0, LK0/w;->a:Lt/L;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Lt/V;->c(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    if-eq v1, v0, :cond_1

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, -0x1

    .line 27
    return p1
.end method

.method public final y(FZ)Z
    .locals 4

    .line 1
    iget v0, p0, LK0/w;->c:I

    .line 2
    .line 3
    invoke-static {p0}, LUd/u;->o(Ljava/util/List;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    const/4 v0, 0x4

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {p1, p2, v3, v0, v1}, LK0/x;->b(FZZILjava/lang/Object;)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    invoke-direct {p0}, LK0/w;->p()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-static {v0, v1, p1, p2}, LK0/r;->a(JJ)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-lez p1, :cond_1

    .line 27
    .line 28
    return v2

    .line 29
    :cond_1
    return v3
.end method

.method public z(Landroidx/compose/ui/e$c;)I
    .locals 2

    .line 1
    invoke-static {p0}, LUd/u;->o(Ljava/util/List;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    const/4 v1, -0x1

    .line 6
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, LK0/w;->a:Lt/L;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lt/V;->c(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    return v0

    .line 21
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return v1
.end method
