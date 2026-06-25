.class public LVh/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lai/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVh/h$b;,
        LVh/h$a;
    }
.end annotation


# static fields
.field private static final r:Ljava/util/Set;

.field private static final s:Ljava/util/Map;


# instance fields
.field private a:LZh/f;

.field private b:I

.field private c:I

.field private d:I

.field private e:Z

.field private f:I

.field private g:I

.field private h:I

.field private i:Z

.field private final j:Ljava/util/List;

.field private final k:LZh/d;

.field private final l:Ljava/util/List;

.field private final m:LZh/a;

.field private final n:LVh/g;

.field private final o:LVh/p;

.field private final p:Ljava/util/List;

.field private final q:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    const-class v6, LYh/q;

    .line 4
    .line 5
    const-class v7, LYh/n;

    .line 6
    .line 7
    const-class v1, LYh/b;

    .line 8
    .line 9
    const-class v2, LYh/j;

    .line 10
    .line 11
    const-class v3, LYh/h;

    .line 12
    .line 13
    const-class v4, LYh/k;

    .line 14
    .line 15
    const-class v5, LYh/B;

    .line 16
    .line 17
    filled-new-array/range {v1 .. v7}, [Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, LVh/h;->r:Ljava/util/Set;

    .line 29
    .line 30
    new-instance v0, Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v1, LVh/c$a;

    .line 36
    .line 37
    invoke-direct {v1}, LVh/c$a;-><init>()V

    .line 38
    .line 39
    .line 40
    const-class v2, LYh/b;

    .line 41
    .line 42
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    new-instance v1, LVh/j$a;

    .line 46
    .line 47
    invoke-direct {v1}, LVh/j$a;-><init>()V

    .line 48
    .line 49
    .line 50
    const-class v2, LYh/j;

    .line 51
    .line 52
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    new-instance v1, LVh/i$a;

    .line 56
    .line 57
    invoke-direct {v1}, LVh/i$a;-><init>()V

    .line 58
    .line 59
    .line 60
    const-class v2, LYh/h;

    .line 61
    .line 62
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    new-instance v1, LVh/k$b;

    .line 66
    .line 67
    invoke-direct {v1}, LVh/k$b;-><init>()V

    .line 68
    .line 69
    .line 70
    const-class v2, LYh/k;

    .line 71
    .line 72
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    new-instance v1, LVh/u$a;

    .line 76
    .line 77
    invoke-direct {v1}, LVh/u$a;-><init>()V

    .line 78
    .line 79
    .line 80
    const-class v2, LYh/B;

    .line 81
    .line 82
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    new-instance v1, LVh/q$a;

    .line 86
    .line 87
    invoke-direct {v1}, LVh/q$a;-><init>()V

    .line 88
    .line 89
    .line 90
    const-class v2, LYh/q;

    .line 91
    .line 92
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    new-instance v1, LVh/l$a;

    .line 96
    .line 97
    invoke-direct {v1}, LVh/l$a;-><init>()V

    .line 98
    .line 99
    .line 100
    const-class v2, LYh/n;

    .line 101
    .line 102
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sput-object v0, LVh/h;->s:Ljava/util/Map;

    .line 110
    .line 111
    return-void
.end method

.method public constructor <init>(Ljava/util/List;LZh/d;Ljava/util/List;LZh/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, LVh/h;->b:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, LVh/h;->c:I

    .line 9
    .line 10
    iput v0, p0, LVh/h;->d:I

    .line 11
    .line 12
    iput v0, p0, LVh/h;->f:I

    .line 13
    .line 14
    iput v0, p0, LVh/h;->g:I

    .line 15
    .line 16
    iput v0, p0, LVh/h;->h:I

    .line 17
    .line 18
    new-instance v1, LVh/p;

    .line 19
    .line 20
    invoke-direct {v1}, LVh/p;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, LVh/h;->o:LVh/p;

    .line 24
    .line 25
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, LVh/h;->p:Ljava/util/List;

    .line 31
    .line 32
    new-instance v1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, LVh/h;->q:Ljava/util/List;

    .line 38
    .line 39
    iput-object p1, p0, LVh/h;->j:Ljava/util/List;

    .line 40
    .line 41
    iput-object p2, p0, LVh/h;->k:LZh/d;

    .line 42
    .line 43
    iput-object p3, p0, LVh/h;->l:Ljava/util/List;

    .line 44
    .line 45
    iput-object p4, p0, LVh/h;->m:LZh/a;

    .line 46
    .line 47
    new-instance p1, LVh/g;

    .line 48
    .line 49
    invoke-direct {p1}, LVh/g;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, LVh/h;->n:LVh/g;

    .line 53
    .line 54
    new-instance p2, LVh/h$b;

    .line 55
    .line 56
    invoke-direct {p2, p1, v0}, LVh/h$b;-><init>(Lai/d;I)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0, p2}, LVh/h;->f(LVh/h$b;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method private f(LVh/h$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LVh/h;->p:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private g(LVh/h$b;)V
    .locals 2

    .line 1
    :goto_0
    invoke-virtual {p0}, LVh/h;->e()Lai/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, LVh/h$b;->a(LVh/h$b;)Lai/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Lai/d;->f()LYh/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Lai/d;->c(LYh/a;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p0, v0}, LVh/h;->m(I)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, LVh/h;->e()Lai/d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Lai/d;->f()LYh/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {p1}, LVh/h$b;->a(LVh/h$b;)Lai/d;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Lai/d;->f()LYh/a;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, LYh/s;->b(LYh/s;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p1}, LVh/h;->f(LVh/h$b;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method private h(LVh/s;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, LVh/s;->j()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, LYh/p;

    .line 20
    .line 21
    invoke-virtual {p1}, LVh/s;->f()LYh/a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2, v1}, LYh/s;->i(LYh/s;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, LVh/h;->o:LVh/p;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, LVh/p;->a(LYh/p;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method private i()V
    .locals 5

    .line 1
    iget-boolean v0, p0, LVh/h;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, LVh/h;->c:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iget-object v1, p0, LVh/h;->a:LZh/f;

    .line 10
    .line 11
    invoke-virtual {v1}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, LVh/h;->a:LZh/f;

    .line 16
    .line 17
    invoke-virtual {v2}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-interface {v1, v0, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget v1, p0, LVh/h;->d:I

    .line 30
    .line 31
    invoke-static {v1}, LXh/f;->a(I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    add-int/2addr v3, v1

    .line 42
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 43
    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    :goto_0
    if-ge v3, v1, :cond_0

    .line 47
    .line 48
    const/16 v4, 0x20

    .line 49
    .line 50
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    iget v0, p0, LVh/h;->c:I

    .line 65
    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    iget-object v0, p0, LVh/h;->a:LZh/f;

    .line 69
    .line 70
    invoke-virtual {v0}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    iget-object v0, p0, LVh/h;->a:LZh/f;

    .line 76
    .line 77
    invoke-virtual {v0}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget v1, p0, LVh/h;->c:I

    .line 82
    .line 83
    iget-object v2, p0, LVh/h;->a:LZh/f;

    .line 84
    .line 85
    invoke-virtual {v2}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-interface {v0, v1, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    :goto_1
    iget-object v1, p0, LVh/h;->m:LZh/a;

    .line 98
    .line 99
    sget-object v2, LZh/a;->c:LZh/a;

    .line 100
    .line 101
    if-ne v1, v2, :cond_3

    .line 102
    .line 103
    iget v1, p0, LVh/h;->b:I

    .line 104
    .line 105
    iget v2, p0, LVh/h;->c:I

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-static {v1, v2, v3}, LYh/x;->d(III)LYh/x;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    const/4 v1, 0x0

    .line 117
    :goto_2
    invoke-virtual {p0}, LVh/h;->e()Lai/d;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v0, v1}, LZh/f;->c(Ljava/lang/CharSequence;LYh/x;)LZh/f;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-interface {v2, v0}, Lai/d;->e(LZh/f;)V

    .line 126
    .line 127
    .line 128
    invoke-direct {p0}, LVh/h;->j()V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method private j()V
    .locals 5

    .line 1
    iget-object v0, p0, LVh/h;->m:LZh/a;

    .line 2
    .line 3
    sget-object v1, LZh/a;->a:LZh/a;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    :goto_0
    iget-object v1, p0, LVh/h;->p:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ge v0, v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, LVh/h;->p:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, LVh/h$b;

    .line 23
    .line 24
    invoke-static {v1}, LVh/h$b;->b(LVh/h$b;)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v3, p0, LVh/h;->a:LZh/f;

    .line 29
    .line 30
    invoke-virtual {v3}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    sub-int/2addr v3, v2

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    invoke-static {v1}, LVh/h$b;->a(LVh/h$b;)Lai/d;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget v4, p0, LVh/h;->b:I

    .line 46
    .line 47
    invoke-static {v4, v2, v3}, LYh/x;->d(III)LYh/x;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-interface {v1, v2}, Lai/d;->g(LYh/x;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    return-void
.end method

.method private k()V
    .locals 2

    .line 1
    iget-object v0, p0, LVh/h;->a:LZh/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, LVh/h;->c:I

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, LVh/h;->c:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    iput v1, p0, LVh/h;->c:I

    .line 18
    .line 19
    const/16 v1, 0x9

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    iget v0, p0, LVh/h;->d:I

    .line 24
    .line 25
    invoke-static {v0}, LXh/f;->a(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/2addr v0, v1

    .line 30
    iput v0, p0, LVh/h;->d:I

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget v0, p0, LVh/h;->d:I

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    iput v0, p0, LVh/h;->d:I

    .line 38
    .line 39
    return-void
.end method

.method public static l(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/Class;

    .line 24
    .line 25
    sget-object v1, LVh/h;->s:Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-object v0
.end method

.method private m(I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge v0, p1, :cond_0

    .line 3
    .line 4
    invoke-direct {p0}, LVh/h;->n()LVh/h$b;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {v1}, LVh/h$b;->a(LVh/h$b;)Lai/d;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {p0, v1}, LVh/h;->o(Lai/d;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, LVh/h;->q:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method private n()LVh/h$b;
    .locals 2

    .line 1
    iget-object v0, p0, LVh/h;->p:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LVh/h$b;

    .line 14
    .line 15
    return-object v0
.end method

.method private o(Lai/d;)V
    .locals 1

    .line 1
    instance-of v0, p1, LVh/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LVh/s;

    .line 7
    .line 8
    invoke-direct {p0, v0}, LVh/h;->h(LVh/s;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {p1}, Lai/d;->h()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private p()LYh/f;
    .locals 1

    .line 1
    iget-object v0, p0, LVh/h;->p:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0, v0}, LVh/h;->m(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, LVh/h;->w()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LVh/h;->n:LVh/g;

    .line 14
    .line 15
    invoke-virtual {v0}, LVh/g;->j()LYh/f;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method private q(Lai/d;)LVh/d;
    .locals 3

    .line 1
    new-instance v0, LVh/h$a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LVh/h$a;-><init>(Lai/d;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LVh/h;->j:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lai/e;

    .line 23
    .line 24
    invoke-interface {v1, p0, v0}, Lai/e;->a(Lai/h;Lai/g;)Lai/f;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    instance-of v2, v1, LVh/d;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    check-cast v1, LVh/d;

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_1
    const/4 p1, 0x0

    .line 36
    return-object p1
.end method

.method private r()V
    .locals 5

    .line 1
    iget v0, p0, LVh/h;->c:I

    .line 2
    .line 3
    iget v1, p0, LVh/h;->d:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iput-boolean v2, p0, LVh/h;->i:Z

    .line 7
    .line 8
    iget-object v2, p0, LVh/h;->a:LZh/f;

    .line 9
    .line 10
    invoke-virtual {v2}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    :goto_0
    if-ge v0, v2, :cond_2

    .line 19
    .line 20
    iget-object v3, p0, LVh/h;->a:LZh/f;

    .line 21
    .line 22
    invoke-virtual {v3}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-interface {v3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/16 v4, 0x9

    .line 31
    .line 32
    if-eq v3, v4, :cond_1

    .line 33
    .line 34
    const/16 v4, 0x20

    .line 35
    .line 36
    if-eq v3, v4, :cond_0

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    iput-boolean v2, p0, LVh/h;->i:Z

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 48
    .line 49
    rem-int/lit8 v3, v1, 0x4

    .line 50
    .line 51
    rsub-int/lit8 v3, v3, 0x4

    .line 52
    .line 53
    add-int/2addr v1, v3

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    :goto_1
    iput v0, p0, LVh/h;->f:I

    .line 56
    .line 57
    iput v1, p0, LVh/h;->g:I

    .line 58
    .line 59
    iget v0, p0, LVh/h;->d:I

    .line 60
    .line 61
    sub-int/2addr v1, v0

    .line 62
    iput v1, p0, LVh/h;->h:I

    .line 63
    .line 64
    return-void
.end method

.method public static s()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, LVh/h;->r:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method private u(Ljava/lang/CharSequence;)V
    .locals 11

    .line 1
    invoke-direct {p0, p1}, LVh/h;->x(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    move v0, p1

    .line 6
    move v1, v0

    .line 7
    :goto_0
    iget-object v2, p0, LVh/h;->p:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, -0x1

    .line 14
    if-ge v0, v2, :cond_3

    .line 15
    .line 16
    iget-object v2, p0, LVh/h;->p:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, LVh/h$b;

    .line 23
    .line 24
    invoke-static {v2}, LVh/h$b;->a(LVh/h$b;)Lai/d;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-direct {p0}, LVh/h;->r()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v4, p0}, Lai/d;->i(Lai/h;)Lai/c;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    instance-of v5, v4, LVh/b;

    .line 36
    .line 37
    if-eqz v5, :cond_3

    .line 38
    .line 39
    check-cast v4, LVh/b;

    .line 40
    .line 41
    invoke-virtual {p0}, LVh/h;->getIndex()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    invoke-static {v2, v5}, LVh/h$b;->c(LVh/h$b;I)I

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, LVh/b;->g()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    invoke-direct {p0}, LVh/h;->j()V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, LVh/h;->p:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    sub-int/2addr p1, v0

    .line 64
    invoke-direct {p0, p1}, LVh/h;->m(I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_0
    invoke-virtual {v4}, LVh/b;->f()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eq v2, v3, :cond_1

    .line 73
    .line 74
    invoke-virtual {v4}, LVh/b;->f()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-direct {p0, v2}, LVh/h;->z(I)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual {v4}, LVh/b;->e()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eq v2, v3, :cond_2

    .line 87
    .line 88
    invoke-virtual {v4}, LVh/b;->e()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-direct {p0, v2}, LVh/h;->y(I)V

    .line 93
    .line 94
    .line 95
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 96
    .line 97
    add-int/lit8 v0, v0, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    iget-object v0, p0, LVh/h;->p:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    sub-int/2addr v0, v1

    .line 107
    iget-object v2, p0, LVh/h;->p:Ljava/util/List;

    .line 108
    .line 109
    sub-int/2addr v1, p1

    .line 110
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, LVh/h$b;

    .line 115
    .line 116
    invoke-static {v1}, LVh/h$b;->a(LVh/h$b;)Lai/d;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget v2, p0, LVh/h;->c:I

    .line 121
    .line 122
    invoke-interface {v1}, Lai/d;->f()LYh/a;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    instance-of v4, v4, LYh/v;

    .line 127
    .line 128
    const/4 v5, 0x0

    .line 129
    if-nez v4, :cond_5

    .line 130
    .line 131
    invoke-interface {v1}, Lai/d;->a()Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_4

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_4
    move v4, v5

    .line 139
    goto :goto_3

    .line 140
    :cond_5
    :goto_2
    move v4, p1

    .line 141
    :goto_3
    move v6, v5

    .line 142
    :goto_4
    if-eqz v4, :cond_f

    .line 143
    .line 144
    iget v2, p0, LVh/h;->c:I

    .line 145
    .line 146
    invoke-direct {p0}, LVh/h;->r()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, LVh/h;->c()Z

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    if-nez v7, :cond_e

    .line 154
    .line 155
    iget v7, p0, LVh/h;->h:I

    .line 156
    .line 157
    sget v8, LXh/f;->a:I

    .line 158
    .line 159
    if-ge v7, v8, :cond_6

    .line 160
    .line 161
    iget-object v7, p0, LVh/h;->a:LZh/f;

    .line 162
    .line 163
    invoke-virtual {v7}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    iget v8, p0, LVh/h;->f:I

    .line 168
    .line 169
    invoke-static {v7, v8}, LXh/f;->h(Ljava/lang/CharSequence;I)Z

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    if-eqz v7, :cond_6

    .line 174
    .line 175
    goto :goto_8

    .line 176
    :cond_6
    invoke-direct {p0, v1}, LVh/h;->q(Lai/d;)LVh/d;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    if-nez v7, :cond_7

    .line 181
    .line 182
    iget v3, p0, LVh/h;->f:I

    .line 183
    .line 184
    invoke-direct {p0, v3}, LVh/h;->z(I)V

    .line 185
    .line 186
    .line 187
    goto :goto_9

    .line 188
    :cond_7
    invoke-virtual {p0}, LVh/h;->getIndex()I

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    if-lez v0, :cond_8

    .line 193
    .line 194
    invoke-direct {p0, v0}, LVh/h;->m(I)V

    .line 195
    .line 196
    .line 197
    move v0, v5

    .line 198
    :cond_8
    invoke-virtual {v7}, LVh/d;->h()I

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-eq v8, v3, :cond_9

    .line 203
    .line 204
    invoke-virtual {v7}, LVh/d;->h()I

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    invoke-direct {p0, v8}, LVh/h;->z(I)V

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_9
    invoke-virtual {v7}, LVh/d;->g()I

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    if-eq v8, v3, :cond_a

    .line 217
    .line 218
    invoke-virtual {v7}, LVh/d;->g()I

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    invoke-direct {p0, v8}, LVh/h;->y(I)V

    .line 223
    .line 224
    .line 225
    :cond_a
    :goto_5
    invoke-virtual {v7}, LVh/d;->i()Z

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    if-eqz v8, :cond_b

    .line 230
    .line 231
    invoke-direct {p0}, LVh/h;->v()LYh/a;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-virtual {v8}, LYh/s;->g()Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    goto :goto_6

    .line 240
    :cond_b
    const/4 v8, 0x0

    .line 241
    :goto_6
    invoke-virtual {v7}, LVh/d;->f()[Lai/d;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    array-length v9, v7

    .line 246
    move v10, v5

    .line 247
    :goto_7
    if-ge v10, v9, :cond_d

    .line 248
    .line 249
    aget-object v1, v7, v10

    .line 250
    .line 251
    new-instance v4, LVh/h$b;

    .line 252
    .line 253
    invoke-direct {v4, v1, v6}, LVh/h$b;-><init>(Lai/d;I)V

    .line 254
    .line 255
    .line 256
    invoke-direct {p0, v4}, LVh/h;->g(LVh/h$b;)V

    .line 257
    .line 258
    .line 259
    if-eqz v8, :cond_c

    .line 260
    .line 261
    invoke-interface {v1}, Lai/d;->f()LYh/a;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    invoke-virtual {v4, v8}, LYh/s;->k(Ljava/util/List;)V

    .line 266
    .line 267
    .line 268
    :cond_c
    invoke-interface {v1}, Lai/d;->a()Z

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    add-int/lit8 v10, v10, 0x1

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_d
    move v6, p1

    .line 276
    goto/16 :goto_4

    .line 277
    .line 278
    :cond_e
    :goto_8
    iget v3, p0, LVh/h;->f:I

    .line 279
    .line 280
    invoke-direct {p0, v3}, LVh/h;->z(I)V

    .line 281
    .line 282
    .line 283
    :cond_f
    :goto_9
    if-nez v6, :cond_10

    .line 284
    .line 285
    invoke-virtual {p0}, LVh/h;->c()Z

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    if-nez v3, :cond_10

    .line 290
    .line 291
    invoke-virtual {p0}, LVh/h;->e()Lai/d;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-interface {v3}, Lai/d;->d()Z

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    if-eqz v3, :cond_10

    .line 300
    .line 301
    iget-object v0, p0, LVh/h;->p:Ljava/util/List;

    .line 302
    .line 303
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    sub-int/2addr v1, p1

    .line 308
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    check-cast p1, LVh/h$b;

    .line 313
    .line 314
    invoke-static {p1, v2}, LVh/h$b;->c(LVh/h$b;I)I

    .line 315
    .line 316
    .line 317
    invoke-direct {p0}, LVh/h;->i()V

    .line 318
    .line 319
    .line 320
    return-void

    .line 321
    :cond_10
    if-lez v0, :cond_11

    .line 322
    .line 323
    invoke-direct {p0, v0}, LVh/h;->m(I)V

    .line 324
    .line 325
    .line 326
    :cond_11
    invoke-interface {v1}, Lai/d;->a()Z

    .line 327
    .line 328
    .line 329
    move-result p1

    .line 330
    if-nez p1, :cond_12

    .line 331
    .line 332
    invoke-direct {p0}, LVh/h;->i()V

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :cond_12
    invoke-virtual {p0}, LVh/h;->c()Z

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    if-nez p1, :cond_13

    .line 341
    .line 342
    new-instance p1, LVh/s;

    .line 343
    .line 344
    invoke-direct {p1}, LVh/s;-><init>()V

    .line 345
    .line 346
    .line 347
    new-instance v0, LVh/h$b;

    .line 348
    .line 349
    invoke-direct {v0, p1, v2}, LVh/h$b;-><init>(Lai/d;I)V

    .line 350
    .line 351
    .line 352
    invoke-direct {p0, v0}, LVh/h;->g(LVh/h$b;)V

    .line 353
    .line 354
    .line 355
    invoke-direct {p0}, LVh/h;->i()V

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :cond_13
    invoke-direct {p0}, LVh/h;->j()V

    .line 360
    .line 361
    .line 362
    return-void
.end method

.method private v()LYh/a;
    .locals 2

    .line 1
    invoke-direct {p0}, LVh/h;->n()LVh/h$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LVh/h$b;->a(LVh/h$b;)Lai/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, LVh/s;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, LVh/s;

    .line 15
    .line 16
    invoke-direct {p0, v1}, LVh/h;->h(LVh/s;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {v0}, Lai/d;->h()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Lai/d;->f()LYh/a;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, LYh/s;->m()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Lai/d;->f()LYh/a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method private w()V
    .locals 3

    .line 1
    new-instance v0, LVh/m;

    .line 2
    .line 3
    iget-object v1, p0, LVh/h;->l:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, LVh/h;->o:LVh/p;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LVh/m;-><init>(Ljava/util/List;LVh/p;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LVh/h;->k:LZh/d;

    .line 11
    .line 12
    invoke-interface {v1, v0}, LZh/d;->a(LZh/c;)LZh/b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, LVh/h;->q:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lai/d;

    .line 33
    .line 34
    invoke-interface {v2, v0}, Lai/d;->b(LZh/b;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method

.method private x(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget v0, p0, LVh/h;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LVh/h;->b:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, LVh/h;->c:I

    .line 9
    .line 10
    iput v0, p0, LVh/h;->d:I

    .line 11
    .line 12
    iput-boolean v0, p0, LVh/h;->e:Z

    .line 13
    .line 14
    invoke-static {p1}, LXh/f;->l(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v1, p0, LVh/h;->m:LZh/a;

    .line 19
    .line 20
    sget-object v2, LZh/a;->a:LZh/a;

    .line 21
    .line 22
    if-eq v1, v2, :cond_0

    .line 23
    .line 24
    iget v1, p0, LVh/h;->b:I

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {v1, v0, v2}, LYh/x;->d(III)LYh/x;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    :goto_0
    invoke-static {p1, v0}, LZh/f;->c(Ljava/lang/CharSequence;LYh/x;)LZh/f;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, LVh/h;->a:LZh/f;

    .line 41
    .line 42
    return-void
.end method

.method private y(I)V
    .locals 3

    .line 1
    iget v0, p0, LVh/h;->g:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, LVh/h;->f:I

    .line 6
    .line 7
    iput v1, p0, LVh/h;->c:I

    .line 8
    .line 9
    iput v0, p0, LVh/h;->d:I

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, LVh/h;->a:LZh/f;

    .line 12
    .line 13
    invoke-virtual {v0}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    iget v1, p0, LVh/h;->d:I

    .line 22
    .line 23
    if-ge v1, p1, :cond_1

    .line 24
    .line 25
    iget v2, p0, LVh/h;->c:I

    .line 26
    .line 27
    if-eq v2, v0, :cond_1

    .line 28
    .line 29
    invoke-direct {p0}, LVh/h;->k()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    if-le v1, p1, :cond_2

    .line 34
    .line 35
    iget v0, p0, LVh/h;->c:I

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    sub-int/2addr v0, v1

    .line 39
    iput v0, p0, LVh/h;->c:I

    .line 40
    .line 41
    iput p1, p0, LVh/h;->d:I

    .line 42
    .line 43
    iput-boolean v1, p0, LVh/h;->e:Z

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    iput-boolean p1, p0, LVh/h;->e:Z

    .line 48
    .line 49
    return-void
.end method

.method private z(I)V
    .locals 2

    .line 1
    iget v0, p0, LVh/h;->f:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    iput v0, p0, LVh/h;->c:I

    .line 6
    .line 7
    iget v0, p0, LVh/h;->g:I

    .line 8
    .line 9
    iput v0, p0, LVh/h;->d:I

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, LVh/h;->a:LZh/f;

    .line 12
    .line 13
    invoke-virtual {v0}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    iget v1, p0, LVh/h;->c:I

    .line 22
    .line 23
    if-ge v1, p1, :cond_1

    .line 24
    .line 25
    if-eq v1, v0, :cond_1

    .line 26
    .line 27
    invoke-direct {p0}, LVh/h;->k()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, LVh/h;->e:Z

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public a()LZh/f;
    .locals 1

    .line 1
    iget-object v0, p0, LVh/h;->a:LZh/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, LVh/h;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LVh/h;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, LVh/h;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public e()Lai/d;
    .locals 2

    .line 1
    iget-object v0, p0, LVh/h;->p:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LVh/h$b;

    .line 14
    .line 15
    invoke-static {v0}, LVh/h$b;->a(LVh/h$b;)Lai/d;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public getColumn()I
    .locals 1

    .line 1
    iget v0, p0, LVh/h;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public getIndex()I
    .locals 1

    .line 1
    iget v0, p0, LVh/h;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public t(Ljava/lang/String;)LYh/f;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :cond_0
    :goto_0
    invoke-static {p1, v0}, LXh/f;->c(Ljava/lang/CharSequence;I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, -0x1

    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {p0, v0}, LVh/h;->u(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v0, v1, 0x1

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ge v0, v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/16 v3, 0xd

    .line 29
    .line 30
    if-ne v2, v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/16 v3, 0xa

    .line 37
    .line 38
    if-ne v2, v3, :cond_0

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x2

    .line 41
    .line 42
    move v0, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-lez v1, :cond_3

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-ge v0, v1, :cond_3

    .line 57
    .line 58
    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {p0, p1}, LVh/h;->u(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-direct {p0}, LVh/h;->p()LYh/f;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method
